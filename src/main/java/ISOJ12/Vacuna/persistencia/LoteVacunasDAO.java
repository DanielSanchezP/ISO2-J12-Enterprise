package ISOJ12.Vacuna.persistencia;

import java.sql.SQLException;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoteVacunasDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	/**
	 * 
	 * @param lote
	 */
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	public void insertarLoteVacunas(LoteVacunas lote){
		BD.insert("INSERT INTO lotevacunas VALUES ('"+lote.id+"','"+ lote.tipo.farmaceutica +"', "+lote.cantidad+",'"+formatter.format(lote.fecha)+"')");
		
	}
        
        public void modificarLoteVacunas(LoteVacunas lote, int cantidad){
            BD.update("UPDATE lotevacunas SET cantidad = "+(lote.cantidad - cantidad)+" WHERE id = "+lote.id+"");
        }
        
        public List<LoteVacunas> seleccionarlotes() throws SQLException{
		List<LoteVacunas> listalote = new ArrayList<LoteVacunas>();
                
		ResultSet res = BD.select("SELECT * FROM lotevacunas");
                
		while (res.next()) {
             LoteVacunas lote = new LoteVacunas();
             TipoVacuna tipo = new TipoVacuna();
			 lote.id = res.getObject(1).toString();
			 tipo.farmaceutica = res.getObject(2).toString();
             lote.tipo = tipo;
             lote.cantidad = (int) res.getObject(3);
			 lote.fecha = (Date) res.getObject(4);
             listalote.add(lote);    
             }
               return listalote;
        }

}