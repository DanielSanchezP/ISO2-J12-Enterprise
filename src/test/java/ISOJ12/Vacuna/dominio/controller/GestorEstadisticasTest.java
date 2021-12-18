/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.dominio.controller;

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
        String region = "";
        GestorEstadisticas instance = new GestorEstadisticas();
        long expResult = 0L;
        long result = instance.consultarTotalVacunados(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTotalVacunadosPorRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarTotalVacunadosPorRegion() throws Exception {
        System.out.println("consultarTotalVacunadosPorRegion");
        String region = "";
        GestorEstadisticas instance = new GestorEstadisticas();
        long expResult = 0L;
        long result = instance.consultarTotalVacunadosPorRegion(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPorcentajeVacunadosSobreRecibidas method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarPorcentajeVacunadosSobreRecibidas() throws Exception {
        System.out.println("consultarPorcentajeVacunadosSobreRecibidas");
        GestorEstadisticas instance = new GestorEstadisticas();
        double expResult = 0.0;
        double result = instance.consultarPorcentajeVacunadosSobreRecibidas();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPorcentajeVacunadosSobreRecibidasEnRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarPorcentajeVacunadosSobreRecibidasEnRegion() throws Exception {
        System.out.println("consultarPorcentajeVacunadosSobreRecibidasEnRegion");
        String region = "";
        GestorEstadisticas instance = new GestorEstadisticas();
        double expResult = 0.0;
        double result = instance.consultarPorcentajeVacunadosSobreRecibidasEnRegion(region);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTotalVacunasEnRegion method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarTotalVacunasEnRegion() {
        System.out.println("consultarTotalVacunasEnRegion");
        String region = "";
        GestorEstadisticas instance = new GestorEstadisticas();
        long expResult = 0L;
        long result = instance.consultarTotalVacunasEnRegion(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarVacunadosDeNVacuna method, of class GestorEstadisticas.
     */
    @Test
    public void testConsultarVacunadosDeNVacuna() {
        System.out.println("consultarVacunadosDeNVacuna");
        String region = "";
        int ndosis = 0;
        GestorEstadisticas instance = new GestorEstadisticas();
        double expResult = 0.0;
        double result = instance.consultarVacunadosDeNVacuna(region, ndosis);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
