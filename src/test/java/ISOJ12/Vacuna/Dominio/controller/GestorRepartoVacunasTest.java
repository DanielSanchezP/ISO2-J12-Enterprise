/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.Dominio.controller;
import ISOJ12.Vacuna.dominio.controller.GestorRepartoVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAOTest;
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
 * @author Daniel
 */
public class GestorRepartoVacunasTest {
    GestorRepartoVacunas instance = new GestorRepartoVacunas();
    LoteVacunas lote = new LoteVacunas();
    
    public GestorRepartoVacunasTest(){
    }
    
    
    @BeforeAll
    public static void setUpClass() {
        LoteVacunas lote1 = new LoteVacunas();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        lote1 = new LoteVacunas();
        
        int numero = (int)(Math.random()*1000000);
        lote1.id = Integer.toString(numero);
        lote1.cantidad=(int)(Math.random()*10000);
        try {
            lote1.fecha=formatter.parse("3.10.2020");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote1.farmaceutica="Pfizer";
        
        LoteVacunasDAO instance = new LoteVacunasDAO();
        instance.insertarLoteVacunas(lote1);
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
     * Test of altaNuevoLoteVacunas method, of class GestorRepartoVacunas.
     */
    @Test
    public void testaltaNuevoLoteVacunas(){
        System.out.print("altaNuevoLoteVacunas");
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        LoteVacunas lote = new LoteVacunas();
        
        try {
            lote.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote.farmaceutica="Pfizer";
        lote.cantidad = -20;
        
        
        boolean bool = instance.altaNuevoLoteVacunas(lote.fecha, lote.farmaceutica, lote.cantidad);
        assertFalse(bool);
        
        
        try {
            lote.fecha=formatter.parse("31.12.9999");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote.farmaceutica="quetengaunalongde30caracteres";
        lote.cantidad = 5000000;
        
        
        bool = instance.altaNuevoLoteVacunas(lote.fecha, lote.farmaceutica, lote.cantidad);
        assertTrue(bool);
        
        
        try {
            lote.fecha=formatter.parse("32.13.10000");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote.farmaceutica="kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        lote.cantidad = 0;
        
        
        bool = instance.altaNuevoLoteVacunas(lote.fecha, lote.farmaceutica, lote.cantidad);
        assertFalse(bool);
    }
    
    /**
     * Test of calcularEntregasRegion method, of class GestorRepartoVacunas.
     */
    @Test
    public void testcalcularEntregasRegion(){
        System.out.print("calcularEntregasRegion");
        LoteVacunasDAO lotedao = new LoteVacunasDAO();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        LoteVacunas lote = new LoteVacunas();
        
        String id = "12345";
        lote.id = id;
        lote.farmaceutica = "Pfizer";
        lote.cantidad = 5000;
        try {
            lote.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lotedao.insertarLoteVacunas(lote);
        
        String[][] reparto = new String[19][2];
        reparto = instance.calcularEntregasRegion(id);
        assertNotNull(reparto);
        
        String id2 = "0";
        lote.id = id2;
        lote.farmaceutica = "Pfizer";
        lote.cantidad = 5000;
        try {
            lote.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lotedao.insertarLoteVacunas(lote);
        
        
        reparto = instance.calcularEntregasRegion(id);
        assertNotNull(reparto);
        
        String id3 = "1000000";
        lote.id = id3;
        lote.farmaceutica = "Pfizer";
        lote.cantidad = 5000;
        try {
            lote.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lotedao.insertarLoteVacunas(lote);
        
        
        reparto = instance.calcularEntregasRegion(id);
        assertNotNull(reparto);
    }
    
    
    /**
     * Test of calcularEntregasRegion method, of class GestorRepartoVacunas.
     */
    @Test
    public void testvacunasEnRegion(){
        LoteVacunasDAO lotedao = new LoteVacunasDAO();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        LoteVacunas lote = new LoteVacunas();
        
        String id = "54321";
        lote.id = id;
        lote.farmaceutica = "Pfizer";
        lote.cantidad = 500000;
        try {
            lote.fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lotedao.insertarLoteVacunas(lote);
        
        instance.calcularEntregasRegion(id);
        
        List<EntregaVacunas> reparto;
        
        id = "Asturias";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Galicia";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Cantabria";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "La Rioja";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Pais Vasco";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Navarra";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Aragon";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Cataluña";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Castilla y Leon";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Madrid";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Castilla La Mancha";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty()); 
        
        id = "Comunidad Valenciana";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Murcia";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Andalucia";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Extremadura";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Islas Baleares";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Islas Canarias";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Ceuta";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        id = "Melilla";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
    
    }
}
