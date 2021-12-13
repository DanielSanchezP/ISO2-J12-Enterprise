package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EntregaDAO extends AgenteBD {
	AgenteBD bd=AgenteBD.getAgente();
	
	/**
	 * 
	 * @param entrega
	 */
	public void entregarVacunas(EntregaVacunas entrega) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String str="Insert into vacunas values('"+ entrega.lote.id +"','"+ entrega.lote.tipo.farmaceutica +"','"+ entrega.grupoPrioridad +"','"+formatter.format(entrega.fecha)+"',"+ entrega.cantidad +"',"+ entrega.nombreregion +"')";
		bd.insert(str);
	}

	/**
	 * 
	 * @param region
         * @return 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<EntregaVacunas> seleccionarVacunas(String region) throws SQLException {
                List<EntregaVacunas> listaentrega = new ArrayList<>();
                ResultSet res = null;
                if(region.equals("Nacional")) {
                    res = bd.select("SELECT * FROM vacunas");
                    System.out.println("askljalivdhb");
		}
                else{
                    res = bd.select("SELECT * FROM vacunas WHERE nombreregion = '"+region+"'");
                }
		while (res.next()) {
                        System.out.println("asdasdasdasdasdasd");
			 EntregaVacunas entrega = new EntregaVacunas();
                         TipoVacuna tipo = new TipoVacuna();
                         LoteVacunas lote = new LoteVacunas();
                         
			 lote.id = res.getObject(1).toString();
			 tipo.farmaceutica = res.getObject(2).toString();
                         lote.tipo=tipo;
                         entrega.lote=lote;
			 entrega.grupoPrioridad = res.getObject(3).toString();
                         entrega.cantidad = Integer.parseInt(res.getObject(4).toString());
			 entrega.fecha = (Date) res.getObject(5);
                         entrega.nombreregion = res.getObject(6).toString();
			 
                         
                         listaentrega.add(entrega);
                        
        }
		 return listaentrega;
	}
}
