package ISOJ12.Vacuna.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarEstadisticasDAO extends AgenteBD {
	AgenteBD bd=AgenteBD.getAgente();
	/**
	 * 
	 * @param region
     * @return 
	 * @throws SQLException 
	 */
	public String[][] comprobarEstadisticasNacional(String region) throws SQLException {
		String[][] estadisticas=new String[17][3];
                int cont=0;
		ResultSet res = null;
		if(region.equals("Todas")) {
			res = bd.select("SELECT nombreregion, vacunados, poblacion FROM estadisticas");
		}
		else {
			res = bd.select("SELECT nombreregion, vacunados, poblacion FROM estadisticas WHERE nombreregion ='"+region+"' ");
		}
		while (res.next()) {
                String[] estadistica = new String[3];
            	estadistica[0]=res.getObject(1).toString();
                estadistica[1]=res.getObject(2).toString();
                estadistica[2]=res.getObject(3).toString();
                estadisticas[cont]=estadistica;
                cont++;
        }
        return estadisticas;
    }
	
	
	public String[] comprobarEstadisticasRegional(String region) throws SQLException {
		String[] estadisticas=new String[3];
		ResultSet res = null;
		res = bd.select("SELECT nombreregion, vacunasInoculadas, poblacion FROM estadisticas WHERE nombreregion ='"+region+"' ");
		while (res.next()) {
        	estadisticas[0]=res.getObject(1).toString();
                estadisticas[1]=res.getObject(2).toString();
                estadisticas[2]=res.getObject(3).toString();
        }
        return estadisticas;
    }
}
