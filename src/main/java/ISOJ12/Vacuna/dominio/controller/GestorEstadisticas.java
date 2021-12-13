package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
import ISOJ12.Vacuna.persistencia.ConsultarEstadisticasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;





public class GestorEstadisticas {
        DefaultListModel modelo = new DefaultListModel();
        ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
        
        
        
	public long consultarTotalVacunados(String region) throws SQLException {
            String[][] vacunados = consulta.comprobarEstadisticasNacional(region);
            long total = 0;
            for (int i = 0; i<19 ;i++){
                total = total + Long.parseLong(vacunados[i][1]);
            
            } 
            return total;      
	}
        
	/**
	 * 
	 * @param region
     * @return 
     * @throws java.sql.SQLException
	 */
	public long consultarTotalVacunadosPorRegion(String region) throws SQLException {
		String[][] vacunados = consulta.comprobarEstadisticasNacional(region);
                return Long.parseLong(vacunados[0][1]);
		
	}

	public double consultarPorcentajeVacunadosSobreRecibidas() throws SQLException {
            EntregaDAO consultaentrega = new EntregaDAO();
            List<EntregaVacunas> entregavac= null;
            EntregaVacunas entrega = new EntregaVacunas();
            
            String[][] vacunados = consulta.comprobarEstadisticasNacional("Nacional");
                 long totalvacunados = 0;
                 
                 for (int i = 0; i<19 ;i++){
                     totalvacunados = totalvacunados + Long.parseLong(vacunados[i][1]);
                 }
                 
                 entregavac = consultaentrega.seleccionarVacunas("Nacional");
                 long totalcantidad = 0;
                 
                 for(int i = 0; i < entregavac.size();i++){
                     entrega = entregavac.get(i);
                     totalcantidad += entrega.cantidad;
                 }
                 
                double resultado = ((double)totalvacunados/totalcantidad)*100;
                return resultado;
		
	}

	/**
	 * 
	 * @param region
     * @return 
     * @throws java.sql.SQLException
	 */
	public double consultarPorcentajeVacunadosSobreRecibidasEnRegion(String region) throws SQLException {
		String[] vacunados = consulta.comprobarEstadisticasRegional(region);
                System.out.println("vacunados: "+vacunados[3]);
		EntregaDAO consultaentrega = new EntregaDAO();
                EntregaVacunas entrega = new EntregaVacunas();
                long totalcantidad = 0;
                List<EntregaVacunas> entregavac = consultaentrega.seleccionarVacunas(region);
                for(int i = 0; i < entregavac.size();i++){
                    
                     entrega = entregavac.get(i);
                     totalcantidad += entrega.cantidad;
                 }
                System.out.println("totalcantidad"+totalcantidad);
                double resultado = (Double.parseDouble(vacunados[3])/totalcantidad)*100;
                System.out.println("resutlado:"+resultado);
                return resultado;
                
                //pantalla.porcentajevacunadosText.setText(Integer.toString(resultado));
	}
        
        
        
}