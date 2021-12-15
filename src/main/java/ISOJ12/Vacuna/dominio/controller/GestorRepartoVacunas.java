package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.ConsultarEstadisticasDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorRepartoVacunas {
        LoteVacunas lote = new LoteVacunas();
        LoteVacunasDAO lotedao = new LoteVacunasDAO();
	/**
	 * 
	 * @param fecha
	 * @param tipo
	 * @param cantidad
	 */
	public void altaNuevoLoteVacunas(Date fecha, String tipo, int cantidad) {
            
            
            SecureRandom number = new SecureRandom();
            int numero = number.nextInt(1000001);
            lote.id = Integer.toString(numero);
            lote.farmaceutica = tipo;
            lote.cantidad = cantidad;
            lote.fecha = fecha;
                
            lotedao.insertarLoteVacunas(lote);
	}

	public String[][] calcularEntregasRegion(String id){
            ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
            GestorEstadisticas gestorest = new GestorEstadisticas();
            
            String[][] reparto = new String[19][2];
     
            
            try {
                
                LoteVacunas lote = lotedao.cogerlote(id);
                String[][] estadisticas = consulta.comprobarEstadisticasNacional("Nacional");
                String[][] prioridad  = new String[19][2];
            
                double totalprioridad = 0;
                for (int i = 0;i<estadisticas.length;i++){
                    double pr=0;
                    prioridad[i][0] = estadisticas[i][0];
                    int vacunados = Integer.parseInt(estadisticas[i][1]);
                    
                    int poblacion = Integer.parseInt(estadisticas[i][2]);
                    
                    pr += ((double)vacunados/poblacion)*100;
                    
                    double porcentajedosis = gestorest.consultarPorcentajeVacunadosSobreRecibidasEnRegion(prioridad[i][0]);
                    
                    pr+= porcentajedosis;
                   
                    prioridad[i][1] = Double.toString(pr);
                    totalprioridad+=pr;
                }
                
                
                int totalcantidad = lote.cantidad;
                
                int totalcantidad2 = totalcantidad;
                
                for(int i=0;i<prioridad.length;i++){
                    EntregaDAO entregadao = new EntregaDAO();
                    EntregaVacunas entrega = new EntregaVacunas();
                    reparto[i][0] = prioridad[i][0]; 
                    double porcentajecant = (Double.parseDouble(prioridad[i][1])/totalprioridad) *100;
                    int repartocant = (int)(totalcantidad*porcentajecant)/100;
                    totalcantidad2 -= repartocant;
                    reparto[i][1] = Integer.toString(repartocant);
                    
                    entrega.lote = lote;
                    entrega.grupoPrioridad = "Yayos";
                    entrega.fecha = new Date();
                    entrega.cantidad = repartocant;
                    entrega.nombreregion = reparto[i][0];
                    entregadao.entregarVacunas(entrega);
                }           
            }catch (SQLException e) {
                e.printStackTrace();
            }
            
            return reparto;   
	}
        
        public List<EntregaVacunas> vacunasEnRegion(String region){
            EntregaDAO endao=new EntregaDAO();
            return endao.seleccionarVacunas(region);
        }

}