/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
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
public class LoteVacunasDAOTest {
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    LoteVacunas lote = new LoteVacunas();
    LoteVacunas lote1 = new LoteVacunas();
    
    
    public LoteVacunasDAOTest() {
    }
    
    @BeforeAll
    public void setUpClass() {
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
        int res=instance.insertarLoteVacunas(lote1);
        assertEquals(1, res);
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
     * Test of insertarLoteVacunas method, of class LoteVacunasDAO.
     */
    @Test
    public void testInsertarLoteVacunas() {
        System.out.println("insertarLoteVacunas");
        LoteVacunas lote = new LoteVacunas();
        
        int numero = (int)(Math.random()*1000000);
        lote.id = Integer.toString(numero);
        lote.cantidad=(int)(Math.random()*10000);
        try {
            lote.fecha=formatter.parse("3.10.2020");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        lote.farmaceutica="Pfizer";
        
        LoteVacunasDAO instance = new LoteVacunasDAO();
        instance.insertarLoteVacunas(lote);
    }


    
    /**
     * Test of seleccionarlotes method, of class LoteVacunasDAO.
     */
    @Test
    public void testSeleccionarlotes() throws Exception {
        System.out.println("seleccionarlotes");
        LoteVacunasDAO instance = new LoteVacunasDAO();
        List<LoteVacunas> result = instance.seleccionarlotes();
        assertFalse(result.isEmpty());
    }
}
