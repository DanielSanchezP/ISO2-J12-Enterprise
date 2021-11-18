package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.AgenteBD;

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
		String str="Insert into vacunas values('"+ entrega.lote.id +"','"+ entrega.lote.tipo.nombre +"','"+ entrega.lote.tipo.farmaceutica +"','"+ entrega.grupoPrioridad +"','"+formatter.format(entrega.fecha)+"',"+ entrega.cantidad +",'"+ entrega.lote.region +"')";
		agente.insert(str);
	}

	/**
	 * 
	 * @param region
     * @return 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<EntregaVacunas> seleccionarEntregas(String region) throws SQLException {
		List<EntregaVacunas> listaentrega = new ArrayList<>();
		ResultSet res = agente.select("SELECT * FROM vacunas WHERE nombreregion = '"+region);
		while (res.next()) {
			 EntregaVacunas entrega = new EntregaVacunas();
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
                        listaentrega.add(entrega);
        }
		 return listaentrega;
	}
}
