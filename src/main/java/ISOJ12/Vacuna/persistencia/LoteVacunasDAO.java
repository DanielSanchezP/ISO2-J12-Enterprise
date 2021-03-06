package ISOJ12.Vacuna.persistencia;

import java.sql.SQLException;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoteVacunasDAO extends AgenteBD {
	AgenteBD bd = AgenteBD.getAgente();
	/**
	 * 
	 * @param lote
	 */
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        static String id;
	public int insertarLoteVacunas(LoteVacunas lote){
		return bd.insert("INSERT INTO lotevacunas VALUES ('"+lote.id+"','"+ lote.farmaceutica +"', "+lote.cantidad+",'"+formatter.format(lote.fecha)+"')");
		
	}
        
        
        public List<LoteVacunas> seleccionarlotes() throws SQLException{
		List<LoteVacunas> listalote = new ArrayList<>();
                
		ResultSet res = bd.select("SELECT * FROM lotevacunas");
                
		while (res.next()) {
                    
                        LoteVacunas lote = new LoteVacunas();
			lote.id = res.getObject(1).toString();
                        lote.farmaceutica = res.getObject(2).toString();
                        lote.cantidad = (int) res.getObject(3);
			lote.fecha = (Date) res.getObject(4);
                        listalote.add(lote);    
             }
               return listalote;
        }
        public LoteVacunas cogerlote(String id) throws SQLException{
                LoteVacunas lote = new LoteVacunas();
		ResultSet res = bd.select("SELECT * FROM lotevacunas WHERE id ='"+id+"'");
                
		while (res.next()) {
			lote.id = res.getObject(1).toString();
                        lote.farmaceutica = res.getObject(2).toString();
                        lote.cantidad = (int) res.getObject(3);
			lote.fecha = (Date) res.getObject(4);     
             }
               return lote;
        }
        
        public void borrarlote(String id){
		bd.delete("DELETE FROM lotevacunas WHERE id = '"+id+"'");
	}
}