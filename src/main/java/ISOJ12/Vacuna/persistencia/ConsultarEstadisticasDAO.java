package ISOJ12.Vacuna.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarEstadisticasDAO extends AgenteBD {
	AgenteBD BD=AgenteBD.getAgente();
	/**
	 * 
	 * @param region
	 * @throws SQLException 
	 */
	public String[] comprobarEstadisticasNacional(String region) throws SQLException {
		String[] estadisticas=new String[3];
		ResultSet res = null;
		if(region.equals("")) {
			res = BD.select("SELECT nombreregion, vacunados, porcentajesVacunados FROM estadisticas");
		}
		else {
			res = BD.select("SELECT nombreregion, vacunados, porcentajesVacunados FROM estadisticas WHERE nombreregion ='"+region+"' ");
		}
		while (res.next()) {
        	estadisticas[0]=res.getObject(1).toString();
            estadisticas[1]=res.getObject(2).toString();
            estadisticas[2]=res.getObject(3).toString();
        }
        return estadisticas;
    }
	
	public String[] comprobarEstadisticasRegional(String region) throws SQLException {
		String[] estadisticas=new String[3];
		ResultSet res = null;
		res = BD.select("SELECT nombreregion, vacunasInoculadas, porcentajeDosisUsadas FROM estadisticas WHERE nombreregion ='"+region+"' ");
		while (res.next()) {
        	estadisticas[0]=res.getObject(1).toString();
            estadisticas[1]=res.getObject(2).toString();
            estadisticas[2]=res.getObject(3).toString();
        }
        return estadisticas;
    }
}
