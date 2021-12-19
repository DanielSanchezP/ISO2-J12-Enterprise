package ISOJ12.Vacuna.dominio.controller;

import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorVacunacion {
	

	/**
	 * 
	 * @param fecha
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param tipo
     * @param dosis
     * @param nombreregion
     * @param grupo
     * @return 
	 */
	public boolean registrarVacunacion(Date fecha, String nombre, String apellidos, String nif, String tipo, int dosis, String nombreregion, String grupo) {
		VacunacionDAO vacunaciondao = new VacunacionDAO();
                boolean vacuna = false;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                Vacunacion vacunacion = new Vacunacion();
                List<Vacunacion> listavac = new ArrayList<>();
                Paciente pac=new Paciente();
                pac.nombre = nombre;
                pac.apellidos = apellidos;
                pac.dni = nif;
                pac.grupo = grupo;
                vacunacion.paciente = pac;
                vacunacion.nombrevacuna = tipo;
                vacunacion.numeroDosis = dosis;
                vacunacion.fecha=fecha;
                vacunacion.nombreregion=nombreregion;
                if (dosis<=0 || nombre.length()>30 || apellidos.length() > 30 || tipo.length()>30){
                    vacuna = false;
                }
                else{
                    try {
                listavac = vacunaciondao.seleccionarVacunaciones();
                if(listavac.isEmpty()){
                    vacunaciondao.insertarVacunacion(vacunacion);
                    vacuna = true;
                }
                
                else{
                for(int i = 0; i<listavac.size();i++){
                    if(!vacunacion.equal(listavac.get(i))){
                        System.out.print("LO METO");
                        vacunaciondao.insertarVacunacion(vacunacion);
                        vacuna = true;
                        break;
                    }
                    else{
                        System.out.print("OYE TU COSA REPETIDA");
                        break;
                        }
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GestorVacunacion.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            
            return vacuna;
	}

}