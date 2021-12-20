/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.Dominio.controller;

import ISOJ12.Vacuna.dominio.controller.GestorEstadisticas;
import ISOJ12.Vacuna.dominio.entitymodel.Paciente;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAOTest;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 * @author Daniel
 */
public class GestorEstadisticasTest {
    
    public GestorEstadisticasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
     * Test of consultarTotalVacunados method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarTotalVacunados() throws Exception {
        System.out.println("consultarTotalVacunados");
        GestorEstadisticas instance = new GestorEstadisticas();
        long result = instance.consultarTotalVacunados();
        assertTrue(result>0);
    }

    /**
     * Test of consultarTotalVacunadosPorRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarTotalVacunadosPorRegion() throws Exception {
        System.out.println("consultarTotalVacunadosPorRegion");
        GestorEstadisticas instance = new GestorEstadisticas();
        String region = "Andalucia";
        long result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Aragon";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Asturias";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Cantabria";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Castilla La Mancha";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Castilla y Leon";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Cataluña";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Ceuta";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Comunidad Valenciana";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Extremadura";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Galicia";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Islas Baleares";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Islas Canarias";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "La Rioja";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Madrid";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Melilla";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Murcia";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Nacional";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Navarra";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
        region = "Pais Vasco";
        result = instance.consultarTotalVacunadosPorRegion(region);
        assertTrue(result>0);
    }

    /**
     * Test of consultarPorcentajeVacunadosSobreRecibidas method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarPorcentajeVacunadosSobreRecibidas() throws Exception {
        System.out.println("consultarPorcentajeVacunadosSobreRecibidas");
        GestorEstadisticas instance = new GestorEstadisticas();
        double result = instance.consultarPorcentajeVacunadosSobreRecibidas();
        assertTrue(result>0);
        
    }

    /**
     * Test of consultarPorcentajeVacunadosSobreRecibidasEnRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarPorcentajeVacunadosSobreRecibidasEnRegion() throws Exception {
        System.out.println("consultarPorcentajeVacunadosSobreRecibidasEnRegion");
        
        GestorEstadisticas instance = new GestorEstadisticas();
        String region = "Andalucia";
        double result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Aragon";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Asturias";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Cantabria";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Castilla La Mancha";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Castilla y Leon";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Cataluña";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Ceuta";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Comunidad Valenciana";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Extremadura";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Galicia";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Islas Baleares";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Islas Canarias";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "La Rioja";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Madrid";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Melilla";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Murcia";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Navarra";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
        region = "Pais Vasco";
        result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertTrue(result>=0);
    }

    /**
     * Test of consultarTotalVacunasEnRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarTotalVacunasEnRegion() {
        System.out.println("consultarTotalVacunasEnRegion");
        
        GestorEstadisticas instance = new GestorEstadisticas();
        String region = "Andalucia";
        long result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Aragon";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Asturias";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Cantabria";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Castilla La Mancha";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Castilla y Leon";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Cataluña";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Ceuta";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Comunidad Valenciana";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Extremadura";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Galicia";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Islas Baleares";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Islas Canarias";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "La Rioja";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Madrid";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Melilla";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Murcia";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Navarra";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
        region = "Pais Vasco";
        result = instance.consultarTotalVacunasEnRegion(region);
        assertTrue(result>=0);
    }

    /**
     * Test of consultarVacunadosDeNVacuna method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarVacunadosDeNVacuna() {
        System.out.println("consultarVacunadosDeNVacuna");
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        GestorEstadisticas instance = new GestorEstadisticas();
        VacunacionDAO vacdao = new VacunacionDAO();
        Vacunacion vacuna = new Vacunacion();
        Paciente pac = new Paciente();
        pac.dni = "12345678X";
        pac.nombre= "pepe";
        pac.apellidos= "viyuela";
        vacuna.paciente = pac;
        vacuna.nombrevacuna = "Moderna";
        vacuna.numeroDosis = -5;
        vacuna.nombreregion = "Andalucia";
        try {
            vacuna.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacdao.insertarVacunacion(vacuna);
        
        
        
        int ndosis = -5;
        String region = "Andalucia";
        double result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 3;
        vacuna.nombreregion = "Aragon";
        vacdao.insertarVacunacion(vacuna);
        region = "Aragon";
        ndosis = 3;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = 0;
        vacuna.nombreregion = "Asturias";
        vacdao.insertarVacunacion(vacuna);
        region = "Asturias";
        ndosis = 0;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = -50;
        vacuna.nombreregion = "Cantabria";
        vacdao.insertarVacunacion(vacuna);
        region = "Cantabria";
        ndosis = -50;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 500;
        vacuna.nombreregion = "Castilla La Mancha";
        vacdao.insertarVacunacion(vacuna);
        region = "Castilla La Mancha";
        ndosis = 500;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = -5;
        vacuna.nombreregion = "Castilla y Leon";
        vacdao.insertarVacunacion(vacuna);
        region = "Castilla y Leon";
        ndosis = -5;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 3;
        vacuna.nombreregion = "Cataluña";
        vacdao.insertarVacunacion(vacuna);
        region = "Cataluña";
        ndosis = 3;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = 0;
        vacuna.nombreregion = "Ceuta";
        vacdao.insertarVacunacion(vacuna);
        region = "Ceuta";
        ndosis = 0;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = -50;
        vacuna.nombreregion = "Comunidad Valenciana";
        vacdao.insertarVacunacion(vacuna);
        region = "Comunidad Valenciana";
        ndosis = -50;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 500;
        vacuna.nombreregion = "Aragon";
        vacdao.insertarVacunacion(vacuna);
        region = "Extremadura";
        ndosis = 500;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = -5;
        vacuna.nombreregion = "Galicia";
        vacdao.insertarVacunacion(vacuna);
        region = "Galicia";
        ndosis = -5;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 3;
        vacuna.nombreregion = "Islas Baleares";
        vacdao.insertarVacunacion(vacuna);
        region = "Islas Baleares";
        ndosis = 3;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = 0;
        vacuna.nombreregion = "Islas Canarias";
        vacdao.insertarVacunacion(vacuna);
        region = "Islas Canarias";
        ndosis = 0;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = -50;
        vacuna.nombreregion = "La Rioja";
        vacdao.insertarVacunacion(vacuna);
        region = "La Rioja";
        ndosis = -50;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 500;
        vacuna.nombreregion = "Madrid";
        vacdao.insertarVacunacion(vacuna);
        region = "Madrid";
        ndosis = 500;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = -5;
        vacuna.nombreregion = "Melilla";
        vacdao.insertarVacunacion(vacuna);
        region = "Melilla";
        ndosis = -5;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = 3;
        vacuna.nombreregion = "Murcia";
        vacdao.insertarVacunacion(vacuna);
        region = "Murcia";
        ndosis = 3;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result>=0);
        
        vacuna.numeroDosis = 0;
        vacuna.nombreregion = "Navarra";
        vacdao.insertarVacunacion(vacuna);
        region = "Navarra";
        ndosis = 0;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
        
        vacuna.numeroDosis = -50;
        vacuna.nombreregion = "Pais Vasco";
        vacdao.insertarVacunacion(vacuna);
        region = "Pais Vasco";
        ndosis = -50;
        result = instance.consultarVacunadosDeNVacuna(region,ndosis);
        assertTrue(result==0);
    }
    
}
