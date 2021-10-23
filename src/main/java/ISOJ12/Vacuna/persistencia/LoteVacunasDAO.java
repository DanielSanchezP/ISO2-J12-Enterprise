package ISOJ12.Vacuna.persistencia;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import ISOJ12.Vacuna.dominio.entitymodel.*;

public class LoteVacunasDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	/**
	 * 
	 * @param lote
	 */
	public void insertarLoteVacunas(LoteVacunas lote){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		BD.insert("INSERT INTO lotevacunas VALUES ('"+lote.id+"','"+ lote.tipo.nombre +"', "+lote.cantidad+",'"+formatter.format(lote.fecha)+"')");
		
	}

}