package ISOJ12.Vacuna.persistencia;

import java.sql.SQLException;

import ISOJ12.Vacuna.dominio.entitymodel.*;

public class LoteVacunasDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	/**
	 * 
	 * @param lote
	 */
	public void insertarLoteVacunas(LoteVacunas lote){
		BD.insert("INSERT INTO lotevacunas VALUES ('"+lote.id+"','"+ lote.tipo.nombre +"', "+lote.cantidad+",'"+lote.fecha+"')");
		
	}

}