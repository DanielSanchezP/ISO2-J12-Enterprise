package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntregaDAO extends AgenteBD {
	AgenteBD bd=AgenteBD.getAgente();
	
	/**
	 * 
	 * @param entrega
	 */
	public void entregarVacunas(EntregaVacunas entrega) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String str="Insert into vacunas values('"+ entrega.lote.id +"','"+ entrega.lote.farmaceutica +"','"+ entrega.grupoPrioridad +"','"+formatter.format(entrega.fecha)+"',"+ entrega.cantidad +"',"+ entrega.nombreregion +"')";
		bd.insert(str);
	}

	/**
	 * 
	 * @param region
         * @return 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<EntregaVacunas> seleccionarVacunas(String region){
                List<EntregaVacunas> listaentrega = new ArrayList<>();
                ResultSet res = null;
                if(region.equals("Nacional")) {
                    res = bd.select("SELECT * FROM vacunas");
		}
                else{
                    res = bd.select("SELECT * FROM vacunas WHERE nombreregion = '"+region+"'");
                }
            try {
                while (res.next()) {
                    EntregaVacunas entrega = new EntregaVacunas();
                    LoteVacunas lote = new LoteVacunas();
                    
                    lote.id = res.getObject(1).toString();
                    lote.farmaceutica = res.getObject(2).toString();
                    entrega.lote=lote;
                    entrega.grupoPrioridad = res.getObject(3).toString();
                    entrega.cantidad = Integer.parseInt(res.getObject(4).toString());
                    entrega.fecha = (Date) res.getObject(5);
                    entrega.nombreregion = res.getObject(6).toString();
                    
                    
                    listaentrega.add(entrega);
                }   
            } catch (SQLException ex) {
                Logger.getLogger(EntregaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaentrega;
	}
}
