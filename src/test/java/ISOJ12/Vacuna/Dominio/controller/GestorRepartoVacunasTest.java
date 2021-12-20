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
import java.util.ArrayList;
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
        assertFalse(reparto == null);
        
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
        assertFalse(reparto == null);
        
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
        assertFalse(reparto == null);
    }
    
    
    /**
     * Test of calcularEntregasRegion method, of class GestorRepartoVacunas.
     */
    @Test
    public void testvacunasEnRegion(){
        List<EntregaVacunas> reparto = new ArrayList<>();
        
        String id = "Asturias";
        reparto = instance.vacunasEnRegion(id);
        assertFalse(reparto.isEmpty());
        
        String id2 = "Galicia";
        reparto = instance.vacunasEnRegion(id2);
        assertFalse(reparto.isEmpty()); 
        
        String id3 = "Cantabria";
        reparto = instance.vacunasEnRegion(id3);
        assertFalse(reparto.isEmpty()); 
        
        String id4 = "La Rioja";
        reparto = instance.vacunasEnRegion(id4);
        assertFalse(reparto.isEmpty()); 
        
        String id5 = "Pais Vasco";
        reparto = instance.vacunasEnRegion(id5);
        assertFalse(reparto.isEmpty()); 
        
        String id6 = "Navarra";
        reparto = instance.vacunasEnRegion(id6);
        assertFalse(reparto.isEmpty()); 
        
        String id7 = "Aragon";
        reparto = instance.vacunasEnRegion(id7);
        assertFalse(reparto.isEmpty()); 
        
        String id8 = "Cataluña";
        reparto = instance.vacunasEnRegion(id8);
        assertFalse(reparto.isEmpty()); 
        
        String id9 = "Castilla y Leon";
        reparto = instance.vacunasEnRegion(id9);
        assertFalse(reparto.isEmpty()); 
        
        String id10 = "Madrid";
        reparto = instance.vacunasEnRegion(id10);
        assertFalse(reparto.isEmpty()); 
        
        String id11 = "Castilla La Mancha";
        reparto = instance.vacunasEnRegion(id11);
        assertFalse(reparto.isEmpty()); 
        
        String id12 = "Comunidad Valenciana";
        reparto = instance.vacunasEnRegion(id12);
        assertFalse(reparto.isEmpty());
        
        String id13 = "Murcia";
        reparto = instance.vacunasEnRegion(id13);
        assertFalse(reparto.isEmpty());
        
        String id14 = "Andalucia";
        reparto = instance.vacunasEnRegion(id14);
        assertFalse(reparto.isEmpty());
        
        String id15 = "Extremadura";
        reparto = instance.vacunasEnRegion(id15);
        assertFalse(reparto.isEmpty());
        
        String id16 = "Islas Baleares";
        reparto = instance.vacunasEnRegion(id16);
        assertFalse(reparto.isEmpty());
        
        String id17 = "Islas Canarias";
        reparto = instance.vacunasEnRegion(id17);
        assertFalse(reparto.isEmpty());
        
        String id18 = "Ceuta";
        reparto = instance.vacunasEnRegion(id18);
        assertFalse(reparto.isEmpty());
        
        String id19 = "Melilla";
        reparto = instance.vacunasEnRegion(id19);
        assertFalse(reparto.isEmpty());
    
    }
}
