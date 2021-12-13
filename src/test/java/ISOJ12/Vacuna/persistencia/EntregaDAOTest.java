/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
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
public class EntregaDAOTest {
    
    public EntregaDAOTest() {
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
     * Test of insertarEntrega method, of class EntregaDAO.
     */
    @Test
    public void testInsertarEntrega() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("insertarEntrega");
        EntregaVacunas entrega = new EntregaVacunas();
        LoteVacunas lote = new LoteVacunas();
        lote.id="sfget5dgrgd";
        lote.farmaceutica="Pfizer";
        entrega.lote=lote;
        entrega.grupoPrioridad="3";
        entrega.cantidad=232555;
        entrega.nombreregion="abcd";
        
        try {
            entrega.fecha=formatter.parse("2/02/2002");
        } catch (ParseException ex) {
            Logger.getLogger(EntregaDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        EntregaDAO instance = new EntregaDAO();
        instance.entregarVacunas(entrega);
    }

    /**
     * Test of seleccionarEntregas method, of class EntregaDAO.
     
    @Test
    public void testSeleccionarEntregas() throws Exception {
        System.out.println("seleccionarEntregas");
        String region = "abcd";
        EntregaDAO instance = new EntregaDAO();
        List<EntregaVacunas> result = instance.seleccionarEntregas(region);
        assertFalse(result.isEmpty());
    }*/
    //TODO
}
