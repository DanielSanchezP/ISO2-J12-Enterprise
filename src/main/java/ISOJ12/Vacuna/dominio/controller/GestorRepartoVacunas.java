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

	public List<EntregaVacunas> calcularEntregasRegion(){
            ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
            EntregaVacunas entrega = new EntregaVacunas();
            List<EntregaVacunas> listaentrega= new ArrayList<>();
            GestorEstadisticas gestorest = new GestorEstadisticas();
            
            try{
                List <LoteVacunas> listalote = lotedao.seleccionarlotes();
                String[][] estadisticas = consulta.comprobarEstadisticasNacional("Nacional");
                String prioridad [][] = new String[19][2];
            
                double totalprioridad = 0;
                for (int i = 0;i<estadisticas.length;i++){
                    double pr=0;
                    prioridad[i][0] = estadisticas[i][0];
                    System.out.println("Comunidad"+prioridad[i][0]);
                    int vacunados = Integer.parseInt(estadisticas[i][1]);
                    int poblacion = Integer.parseInt(estadisticas[i][2]);
                    pr += (vacunados/poblacion)*100;
                    double porcentajedosis = gestorest.consultarPorcentajeVacunadosSobreRecibidasEnRegion(prioridad[i][0]);
                    pr+= porcentajedosis;
                    System.out.print(pr);
                    prioridad[i][1] = Double.toString(pr);
                    totalprioridad+=pr;
                    System.out.print("Relacion: "+prioridad[i][1]);
                }
            
            
            
                for(int i=0;i<listalote.size();i++){
                    lote = listalote.get(i);
                    int totalcantidad = lote.cantidad;
                    double algo = (Double.parseDouble(prioridad[i][1])/totalprioridad) *100;
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
            
            listaentrega.add(entrega);
            return listaentrega;
	}
        
        public List<EntregaVacunas> vacunasEnRegion(String region){
            EntregaDAO endao=new EntregaDAO();
            return endao.seleccionarVacunas(region);
        }

}