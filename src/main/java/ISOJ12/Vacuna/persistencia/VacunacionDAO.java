package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;



public class VacunacionDAO extends AgenteBD {
	AgenteBD bd = AgenteBD.getAgente();
	/**
	 * @param paciente
	 * @param vacunacion
	 */
	public void insertarVacunacion(Vacunacion vacunacion){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                
		bd.insert("INSERT INTO vacunacion VALUES ('"+vacunacion.paciente.dni+"','"+ vacunacion.paciente.nombre +"', '"+vacunacion.paciente.apellidos+"','"+vacunacion.nombrevacuna+"', '"+formatter.format(vacunacion.fecha)+"',"+vacunacion.numeroDosis+",'asdfecy')");
		
	}

	@SuppressWarnings("null")
	public List<Vacunacion> seleccionarVacunaciones() throws SQLException{
		List<Vacunacion> listavacunacion = new ArrayList<>();
                
		ResultSet res = bd.select("SELECT * FROM vacunacion");
                
		while (res.next()) {
                         Vacunacion vacunacion = new Vacunacion();
                         Paciente paciente = new Paciente();
			 paciente.dni = res.getObject(1).toString();
			 paciente.nombre = res.getObject(2).toString();
			 paciente.apellidos = res.getObject(3).toString();
                         vacunacion.paciente = paciente;
			 vacunacion.nombrevacuna = res.getObject(4).toString();
			 vacunacion.fecha = (Date) res.getObject(5);
			 vacunacion.numeroDosis = (int) res.getObject(6);
                         listavacunacion.add(vacunacion);    
        }
		 return listavacunacion;
	}

	/**
	 * 
	 * @param region
     * @return 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<Vacunacion> seleccionarVacunaciones(String region) throws SQLException{
		List<Vacunacion> listavacunacion = null;
		ResultSet res = bd.select("SELECT vacunacion * WHERE nombreregion = asdfecy ");
		 while (res.next()) {
			 Vacunacion vacunacion = new Vacunacion();
			 vacunacion.paciente.dni = res.getObject(1).toString();
			 vacunacion.paciente.nombre = res.getObject(2).toString();
			 vacunacion.paciente.apellidos = res.getObject(3).toString();
			 vacunacion.nombrevacuna = res.getObject(4).toString();
			 vacunacion.fecha = (Date) res.getObject(5);
			 vacunacion.numeroDosis = (Integer) res.getObject(6);
             listavacunacion.add(vacunacion);
         }
		 return listavacunacion;
	}

}
