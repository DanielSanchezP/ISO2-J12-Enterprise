package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;

import java.sql.SQLException;
import java.util.*;



public class VacunacionDAO extends AgenteBD {

	/**
	 * @param paciente
	 * @param vacunacion
	 */
	public void insertarVacunacion(Vacunacion vacunacion) {
		try {
			AgenteBD BD = AgenteBD.getAgente();
			BD.insert("INSERT INTO vacunacion VALUES ("+vacunacion.paciente.dni+","+ vacunacion.paciente.nombre +", "+vacunacion.paciente.apellidos+","+vacunacion.fecha+","+vacunacion.vacuna.nombre+","+vacunacion.vacuna.farmaceutica+","+vacunacion.vacuna.fechaAprobacion+","+vacunacion.isSegundaDosis+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void seleccionarVacunaciones() {
		try {
			AgenteBD BD = AgenteBD.getAgente();
			BD.select("SELECT vacunacion *");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param region
	 */
	public void seleccionarVacunaciones(RegionEnum region) {
		try {
			AgenteBD BD = AgenteBD.getAgente();
			//BD.select("SELECT vacunacion * WHERE "+region.entregas+" = "+ +" ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}