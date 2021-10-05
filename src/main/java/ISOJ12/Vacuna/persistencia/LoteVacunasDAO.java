package ISOJ12.Vacuna.persistencia;

import java.sql.SQLException;

import ISOJ12.Vacuna.dominio.entitymodel.*;

public class LoteVacunasDAO extends AgenteBD {

	/**
	 * 
	 * @param lote
	 */
	public void insertarLoteVacunas(LoteVacunas lote) {
		
		try {
			AgenteBD BD = AgenteBD.getAgente();
			BD.insert("INSERT INTO lotevacunas VALUES ("+lote.id+","+ lote.tipo.nombre +", "+lote.cantidad+","+lote.fecha+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}