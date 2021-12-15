/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.Paciente;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Julián M
 */
public class VacunacionDAOTest {
    
    public VacunacionDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
        
        System.out.println("insertarVacunacion");
        Vacunacion vacunacion = new Vacunacion();
        Paciente pac=new Paciente();
        pac.nombre = "Agapito";
        pac.apellidos = "Disousa";
        pac.dni = "76543210Z";
        vacunacion.paciente = pac;
        vacunacion.nombrevacuna = "Pfizer";
        vacunacion.numeroDosis = 9;
        try {
            vacunacion.fecha=formatter.parse("2/02/2002");
        } catch (ParseException ex) {
            Logger.getLogger(VacunacionDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        VacunacionDAO instance = new VacunacionDAO();
        instance.insertarVacunacion(vacunacion);
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of insertarVacunacion method, of class VacunacionDAO.
     */
    @Test
    public void testInsertarVacunacion() {
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
        
        System.out.println("insertarVacunacion");
        Vacunacion vacunacion = new Vacunacion();
        Paciente pac=new Paciente();
        pac.nombre = "Agapito";
        pac.apellidos = "Disousa";
        pac.dni = "76543210Z";
        vacunacion.paciente = pac;
        vacunacion.nombrevacuna = "Pfizer";
        vacunacion.numeroDosis = 9;
        try {
            vacunacion.fecha=formatter.parse("2/02/2002");
        } catch (ParseException ex) {
            Logger.getLogger(VacunacionDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        VacunacionDAO instance = new VacunacionDAO();
        instance.insertarVacunacion(vacunacion);
    }

    /**
     * Test of seleccionarVacunaciones method, of class VacunacionDAO.
     */
    @Test
    public void testSeleccionarVacunaciones_0args() throws Exception {
        System.out.println("seleccionarVacunaciones");
        VacunacionDAO instance = new VacunacionDAO();
        List<Vacunacion> result = instance.seleccionarVacunaciones();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of seleccionarVacunaciones method, of class VacunacionDAO.
     */
    
    @Test
    public void testSeleccionarVacunaciones_String() throws Exception {
        System.out.println("seleccionarVacunaciones");
        String region = "asdfecy";
        VacunacionDAO instance = new VacunacionDAO();
        List<Vacunacion> expResult = null;
        List<Vacunacion> result = instance.seleccionarVacunaciones(region);
        assertFalse(result.isEmpty());
    }
    
}
