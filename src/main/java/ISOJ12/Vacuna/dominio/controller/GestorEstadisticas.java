package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
import ISOJ12.Vacuna.persistencia.ConsultarEstadisticasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.presentacion.PantallaGestionSistemaSaludNacional;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultListModel;





public class GestorEstadisticas {
        DefaultListModel modelo = new DefaultListModel();
        PantallaGestionSistemaSaludNacional pantalla = new PantallaGestionSistemaSaludNacional();
        ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
        
        
        
	public void consultarTotalVacunados(String region) throws SQLException {
            String[][] vacunados = consulta.comprobarEstadisticasNacional(region);
            long total = 0;
            for (int i = 0; i<17 ;i++){
                total = total + Long.parseLong(vacunados[i][1]);
            
            } 
            pantalla.totalvacunadosText.setText(Long.toString(total));       
	}
        
	/**
	 * 
	 * @param region
     * @throws java.sql.SQLException
	 */
	public void consultarTotalVacunadosPorRegion(String region) throws SQLException {
		String[][] vacunados = consulta.comprobarEstadisticasNacional(region);
                pantalla.totalvacunadosText.setText(vacunados[0][1]);
		
	}

	public void consultarPorcentajeVacunadosSobreRecibidas() throws SQLException {
            LoteVacunasDAO consultalote = new LoteVacunasDAO();
            LoteVacunas lotevac= new LoteVacunas();
            
            String[][] vacunados = consulta.comprobarEstadisticasNacional("Nacional");
                 long totalvacunados = 0;
                 for (int i = 0; i<17 ;i++){
                     totalvacunados = totalvacunados + Long.parseLong(vacunados[i][1]);
                 }
                 List<LoteVacunas> listalote = consultalote.seleccionarlotes();
                 
                 int totalcantidad = 0;
                 for(int i = 0; i < listalote.size();i++){
                     lotevac = listalote.get(i);
                     totalcantidad += lotevac.cantidad; 
                 }
                int resultado = (int) (totalvacunados/totalcantidad)*100;
                pantalla.porcentajevacunadosText.setText(Integer.toString(resultado));
		
	}

	/**
	 * 
	 * @param region
     * @throws java.sql.SQLException
	 */
	public void consultarPorcentajeVacunadosSobreRecibidasEnRegion(String region) throws SQLException {
		String[] vacunados = consulta.comprobarEstadisticasRegional(region);
		EntregaDAO consultaentrega = new EntregaDAO();
                EntregaVacunas entrega = consultaentrega.seleccionarEntregas(region);
                int numcantidad = entrega.cantidad;
                int resultado = (Integer.parseInt(vacunados[3])/numcantidad)*100;
                //pantalla.porcentajevacunadosText.setText(Integer.toString(resultado));
	}
        
        
        
}