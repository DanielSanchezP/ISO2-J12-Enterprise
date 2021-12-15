package ISOJ12.Vacuna.dominio.controller;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.util.*;

public class GestorVacunacion {

	/**
	 * 
	 * @param lote
	 * @param fecha
	 * @param cantidad
	 * @param prioridad
	 */
	public void altaEntregaVacunas(LoteVacunas lote, Date fecha, int cantidad, String prioridad) {
            EntregaVacunas entrega = new EntregaVacunas();
            EntregaDAO entregadao = new EntregaDAO();
            entrega.lote = lote;
            entrega.fecha = fecha;
            entrega.cantidad = cantidad;
            entrega.grupoPrioridad = prioridad;    
            entregadao.entregarVacunas(entrega);
	}

	/**
	 * 
	 * @param fecha
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param tipo
	 */
	public void registrarVacunacion(Date fecha, String nombre, String apellidos, String nif, String tipo, int dosis, String nombreregion) {
		VacunacionDAO vacunaciondao = new VacunacionDAO();
                Vacunacion vacunacion = new Vacunacion();
                Paciente pac=new Paciente();
                pac.nombre = nombre;
                pac.apellidos = apellidos;
                pac.dni = nif;
                vacunacion.paciente = pac;
                vacunacion.nombrevacuna = tipo;
                vacunacion.numeroDosis = dosis;
                vacunacion.fecha=fecha;
                vacunacion.nombreregion=nombreregion;
                
                vacunaciondao.insertarVacunacion(vacunacion);
	}

}