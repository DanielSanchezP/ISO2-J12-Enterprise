package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.ConsultarEstadisticasDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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
     * @return 
	 */
	public boolean altaNuevoLoteVacunas(Date fecha, String tipo, int cantidad) {
            
            if(cantidad <= 0){
                return false;
            }
            
            SecureRandom number = new SecureRandom();
            int numero = number.nextInt(1000001);
            lote.id = Integer.toString(numero);
            lote.farmaceutica = tipo;
            lote.cantidad = cantidad;
            lote.fecha = fecha;
                
            lotedao.insertarLoteVacunas(lote);
            return true;
	}

	public String[][] calcularEntregasRegion(String id){
            ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
            GestorEstadisticas gestorest = new GestorEstadisticas();
            List<String> listgrupo = new ArrayList<>(Arrays.asList("Ancianos", "Adultos/Adolescentes","Niños"));
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
                    
                    pr += (1/((double)vacunados/poblacion)*100);
                    
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
                    if(totalprioridad ==0){
                        return null;
                    }
                    double porcentajecant = (Double.parseDouble(prioridad[i][1])/totalprioridad) *100;
                    int repartocant = (int)(totalcantidad*porcentajecant)/100;
                    totalcantidad2 -= repartocant;
                    reparto[i][1] = Integer.toString(repartocant);
                    
                    for (int j=0;j<listgrupo.size();j++){
                        entrega.lote = lote;
                        entrega.grupoPrioridad = listgrupo.get(j);
                        entrega.fecha = new Date();
                        switch (j) {
                            case 0:
                                entrega.cantidad = (int)(repartocant*0.5);
                                break;
                            case 1:
                                entrega.cantidad = (int)(repartocant*0.3);
                                break;
                            case 2:
                                entrega.cantidad = (int)(repartocant*0.2);
                                break;
                            default:
                                break;
                        }
                        
                        entrega.nombreregion = reparto[i][0];
                        entregadao.entregarVacunas(entrega);
                    }
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