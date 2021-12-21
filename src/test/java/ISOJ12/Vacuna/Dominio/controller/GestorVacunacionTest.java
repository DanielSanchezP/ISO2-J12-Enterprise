/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.Dominio.controller;

import ISOJ12.Vacuna.dominio.controller.GestorVacunacion;
import ISOJ12.Vacuna.dominio.entitymodel.EntregaVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.LoteVacunas;
import ISOJ12.Vacuna.dominio.entitymodel.Paciente;
import ISOJ12.Vacuna.dominio.entitymodel.Vacunacion;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAOTest;
import ISOJ12.Vacuna.persistencia.VacunacionDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class GestorVacunacionTest {
    
    public GestorVacunacionTest() {
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
     * Test of registrarVacunacion method, of class GestorVacunacion.
     */
    @Test
    public void testRegistrarVacunacion() {
        System.out.println("registrarVacunacion");
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date fecha = null;
        EntregaVacunas entrega = new EntregaVacunas();
        LoteVacunas lote = new LoteVacunas();
        VacunacionDAO vacdao = new VacunacionDAO();
        Vacunacion vacuna = new Vacunacion();
        Paciente pac = new Paciente();
        EntregaDAO entregadao = new EntregaDAO();
        
        lote.id = "12345";
        lote.farmaceutica = "Moderna";
        entrega.lote = lote;
        entrega.grupoPrioridad = "Abuelos";
        entrega.cantidad = 10;
        try {
            entrega.fecha=formatter.parse("20.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        entrega.nombreregion = "Asturias";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Galicia";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Cantabria";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "La Rioja";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Pais Vasco";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Navarra";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Aragón";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Cataluña";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Castilla y Leon";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Madrid";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Castilla La Mancha";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Comunidad Valenciana";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Murcia";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Andalucia";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Extremadura";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Islas Baleares";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Islas Canarias";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Ceuta";
        entregadao.entregarVacunas(entrega);
        entrega.nombreregion = "Melilla";
        entregadao.entregarVacunas(entrega);
        
        try {
            fecha=formatter.parse("19.12.2021");
        } catch (ParseException ex) {
            Logger.getLogger(LoteVacunasDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String nombre = "Agapito";
        String apellidos = "Disousa";
        String nif = "12345678X";
        String tipo = "Moderna";
        int dosis = -5;
        String nombreregion = "Asturias";
        String grupo = "Abuelos";
        GestorVacunacion instance = new GestorVacunacion();
        boolean vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
        
        
        nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = 2;
        nombreregion = "Galicia";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
        nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = 0;
        nombreregion = "Cantabria";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
        nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = 1;
        nombreregion = "La Rioja";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
        nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = 20;
        nombreregion = "Pais Vasco";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
        nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = -5;
        nombreregion = "Navarra";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
        nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = 2;
        nombreregion = "Aragon";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
        nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = 0;
        nombreregion = "Cataluña";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
        nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = 1;
        nombreregion = "Castilla y Leon";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
        nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = 20;
        nombreregion = "Madrid";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
        nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = -5;
        nombreregion = "Castilla La Mancha";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = 2;
        nombreregion = "Comunidad Valenciana";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = 0;
        nombreregion = "Murcia";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = 1;
        nombreregion = "Andalucia";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
         nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = 20;
        nombreregion = "Extremadura";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = -5;
        nombreregion = "Islas Baleares";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "unstringquecontiene30caractere";
        apellidos = "unstringquecontiene30caractere";
        nif = "12345678X";
        tipo = "unstringquecontiene30caractere";
        dosis = 2;
        nombreregion = "Islas Canarias";
        grupo = "Adultos/Adolescentes";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
         nombre = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        apellidos = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        nif = "12345678X";
        tipo = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        dosis = 0;
        nombreregion = "Ceuta";
        grupo = "Niños";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertFalse(vac);
        
         nombre = "Agapito";
        apellidos = "Disousa";
        nif = "12345678X";
        tipo = "Moderna";
        dosis = 1;
        nombreregion = "Melilla";
        grupo = "Abuelos";
        
       
        vac = instance.registrarVacunacion(fecha, nombre, apellidos, nif, tipo, dosis, nombreregion, grupo);
        assertTrue(vac);
        
    }
    
}
