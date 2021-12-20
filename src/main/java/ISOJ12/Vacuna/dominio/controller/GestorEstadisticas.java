package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import ISOJ12.Vacuna.persistencia.ConsultarEstadisticasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import ISOJ12.Vacuna.presentacion.PantallaGestionSistemaSaludNacional;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;





public class GestorEstadisticas {
        DefaultListModel modelo = new DefaultListModel();
        ConsultarEstadisticasDAO consulta = new ConsultarEstadisticasDAO();
        
        
        
	public long consultarTotalVacunados() throws SQLException {
            String[][] vacunados = consulta.comprobarEstadisticasNacional("Nacional");
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
                if (totalcantidad==0){
                    return 0.0;
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
		String[] vacunados = null;
            try {
                vacunados = consulta.comprobarEstadisticasRegional(region);
            } catch (SQLException ex) {
                Logger.getLogger(GestorEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
            }
                
		EntregaDAO consultaentrega = new EntregaDAO();
                EntregaVacunas entrega = new EntregaVacunas();
                long totalcantidad = 0;
                List<EntregaVacunas> entregavac = consultaentrega.seleccionarVacunas(region);
                for(int i = 0; i< entregavac.size();i++){
                    entrega = entregavac.get(0);
                    totalcantidad += entrega.cantidad;
                }
                double resultado = 0;
                
                if (totalcantidad != 0){
                    if(vacunados[3]==null){
                        return 0.0;
                    }
                    resultado = (Double.parseDouble(vacunados[3])/totalcantidad)*100;
                }
                return resultado;
	}
        public long consultarTotalVacunasEnRegion(String region){
            ConsultarEstadisticasDAO consultaest = new ConsultarEstadisticasDAO();
            long totalcantidad = 0;
            String[] vacunasinoc = null;
            try {
                vacunasinoc = consultaest.comprobarEstadisticasRegional(region);
            } catch (SQLException ex) {
                Logger.getLogger(GestorEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(vacunasinoc[1]==null){
                return 0;
            }
            else{
                totalcantidad = Long.parseLong(vacunasinoc[1]);
                return totalcantidad;
            }
        }
        
        public double consultarVacunadosDeNVacuna(String region, int ndosis){
            
            VacunacionDAO vacdao =new VacunacionDAO();
            int totalvac=0;
            if(ndosis>0){
                try{
                String[] est = consulta.comprobarEstadisticasRegional(region);
                List<Vacunacion> listvac = vacdao.seleccionarVacunaciones(region);
                for(int i = 0; i < listvac.size();i++){
                    Vacunacion vac=listvac.get(i);
                    if(vac.numeroDosis==ndosis){
                        totalvac++;
                    }
                }
                return (double)((double)totalvac/Integer.parseInt(est[3]));
                
            }catch (SQLException ex) {
                Logger.getLogger(PantallaGestionSistemaSaludNacional.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            return 0.0;
            
        }
        
}