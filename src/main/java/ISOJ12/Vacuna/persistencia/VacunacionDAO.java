package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;



public class VacunacionDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	/**
	 * @param paciente
	 * @param vacunacion
	 */
	public void insertarVacunacion(Vacunacion vacunacion){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                
		BD.insert("INSERT INTO vacunacion VALUES ('"+vacunacion.paciente.dni+"','"+ vacunacion.paciente.nombre +"', '"+vacunacion.paciente.apellidos+"','"+vacunacion.nombrevacuna+"', '"+formatter.format(vacunacion.fecha)+"','"+vacunacion.isSegundaDosis+"','asdfecy')");
		
	}

	@SuppressWarnings("null")
	public List<Vacunacion> seleccionarVacunaciones() throws SQLException{
		List<Vacunacion> listavacunacion = null;
		ResultSet res = BD.select("SELECT vacunacion *");
		while (res.next()) {
			 Vacunacion vacunacion = new Vacunacion();
			 vacunacion.paciente.dni = res.getObject(1).toString();
			 vacunacion.paciente.nombre = res.getObject(2).toString();
			 vacunacion.paciente.apellidos = res.getObject(3).toString();
			 vacunacion.nombrevacuna = res.getObject(4).toString();
			 vacunacion.fecha = (Date) res.getObject(5);
			 vacunacion.isSegundaDosis = (Boolean) res.getObject(6);
            listavacunacion.add(vacunacion);
        }
		 return listavacunacion;
	}

	/**
	 * 
	 * @param region
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public List<Vacunacion> seleccionarVacunaciones(String region) throws SQLException{
		List<Vacunacion> listavacunacion = null;
		ResultSet res = BD.select("SELECT vacunacion * WHERE nombreregion = "+region+" ");
		 while (res.next()) {
			 Vacunacion vacunacion = new Vacunacion();
			 vacunacion.paciente.dni = res.getObject(1).toString();
			 vacunacion.paciente.nombre = res.getObject(2).toString();
			 vacunacion.paciente.apellidos = res.getObject(3).toString();
			 vacunacion.nombrevacuna = res.getObject(4).toString();
			 vacunacion.fecha = (Date) res.getObject(5);
			 vacunacion.isSegundaDosis = (Boolean) res.getObject(6);
             listavacunacion.add(vacunacion);
         }
		 return listavacunacion;
	}

}
