package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.AgenteBD;

import java.util.*;

public class EntregaDAO extends AgenteBD {
	AgenteBD agente=AgenteBD.getAgente();;
	
	/**
	 * 
	 * @param entrega
	 */
	public void insertarEntrega(EntregaVacunas entrega) {
		String str="Insert into vacunas values("+ entrega.lote +","+ entrega.tipo +","+ entrega.cantidad +","+ entrega.fecha +")";
		agente.insert(str);
	}

	/**
	 * 
	 * @param region
	 */
	public List<EntregaVacunas> seleccionarEntregas(RegionEnum region) {
		// TODO - implement EntregaDAO.seleccionarEntregas
		throw new UnsupportedOperationException();
	}
}