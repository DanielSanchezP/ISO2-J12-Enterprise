package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EntregaDAO extends AgenteBD {
	AgenteBD agente=AgenteBD.getAgente();
	
	/**
	 * 
	 * @param entrega
	 */
	public void insertarEntrega(EntregaVacunas entrega) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String str="Insert into vacunas values('"+ entrega.lote.id +"','"+ entrega.lote.tipo.farmaceutica +"','"+ entrega.grupoPrioridad +"','"+formatter.format(entrega.fecha)+"',"+ entrega.cantidad +"',"+ entrega.nombreregion +"')";
		agente.insert(str);
	}

	/**
	 * 
	 * @param region
         * @return 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public EntregaVacunas seleccionarEntregas(String region) throws SQLException {
                EntregaVacunas entrega = new EntregaVacunas();
		ResultSet res = agente.select("SELECT * FROM vacunas WHERE nombreregion = '"+region);
		while (res.next()) {
			 
                         TipoVacuna tipo = new TipoVacuna();
                         LoteVacunas lote = new LoteVacunas();
			 lote.id = res.getObject(1).toString();
			 tipo.nombre = res.getObject(2).toString();
			 tipo.farmaceutica = res.getObject(3).toString();
                         lote.tipo=tipo;
                         entrega.lote=lote;
			 entrega.grupoPrioridad = res.getObject(4).toString();
			 entrega.fecha = (Date) res.getObject(5);
			 entrega.cantidad = (Integer) res.getObject(6);
                        
        }
		 return entrega;
	}
}
