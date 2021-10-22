package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;

import java.sql.SQLException;
import java.util.*;



public class VacunacionDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	/**
	 * @param paciente
	 * @param vacunacion
	 */
	public void insertarVacunacion(Vacunacion vacunacion){
		
		BD.insert("INSERT INTO vacunacion VALUES ("+vacunacion.paciente.dni+","
				+ ""+ vacunacion.paciente.nombre +", "+vacunacion.paciente.apellidos+","+vacunacion.fecha+","
				+ ""+vacunacion.vacuna.nombre+","+vacunacion.vacuna.farmaceutica+","+vacunacion.vacuna.fechaAprobacion+","
				+ ""+vacunacion.isSegundaDosis+")");
		
	}

	public void seleccionarVacunaciones(){
		
		BD.select("SELECT vacunacion *");
	}

	/**
	 * 
	 * @param region
	 */
	public void seleccionarVacunaciones(RegionEnum region){
		
		//BD.select("SELECT vacunacion * WHERE "+region.entregas+" = "+ +" ");
	}

}