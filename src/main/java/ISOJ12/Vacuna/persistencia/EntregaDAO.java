package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.AgenteBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class EntregaDAO extends AgenteBD {
	AgenteBD agente=AgenteBD.getAgente();;
	
	/**
	 * 
	 * @param entrega
	 */
	public void insertarEntrega(EntregaVacunas entrega) {
		
		String str="Insert into vacunas values("+ entrega.lote.id +","+ entrega.tipo.nombre +","+ entrega.tipo.farmaceutica +","+ entrega.grupoPrioridad.nombre +","+ entrega.fecha +","+ entrega.cantidad +","+ entrega.lote.region +")";
		agente.insert(str);
	}

	/**
	 * 
	 * @param region
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<EntregaVacunas> seleccionarEntregas(String region) throws SQLException {
		List<EntregaVacunas> listaentrega = null;
		ResultSet res = agente.select("SELECT vacunas * WHERE nombreregion = "+region);
		while (res.next()) {
			 EntregaVacunas entrega = new EntregaVacunas();
			 entrega.lote.id = res.getObject(1).toString();
			 entrega.tipo.nombre = res.getObject(2).toString();
			 entrega.tipo.farmaceutica = res.getObject(3).toString();
			 entrega.grupoPrioridad.nombre = res.getObject(4).toString();
			 entrega.fecha = (Date) res.getObject(5);
			 entrega.cantidad = (Integer) res.getObject(6);
            listaentrega.add(entrega);
        }
		 return listaentrega;
	}
}
