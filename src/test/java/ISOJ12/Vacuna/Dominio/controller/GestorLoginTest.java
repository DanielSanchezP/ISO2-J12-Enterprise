/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.Dominio.controller;

import ISOJ12.Vacuna.dominio.controller.GestorLogin;
import ISOJ12.Vacuna.persistencia.LoginDAO;
import java.util.Arrays;
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
public class GestorLoginTest {
    public GestorLoginTest(){
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
     * Test of login method, of class GestorLogin.
     */
    @Test
    public void testlogin(){
        
        System.out.print("login");
        
        String dni = "12345678X";
        String nombre = "Daniel";
        String apellido = "Sanchez";
        String contrasena = "admin";
        String tipo = "SNS";
        String nombreregion = "Nacional";
        LoginDAO logindao = new LoginDAO();
        logindao.insertarTrabajador(dni, nombre, apellido, contrasena, tipo, nombreregion);
        GestorLogin instance = new GestorLogin();
        String[] respuesta = new String[3];
        respuesta[0] = "true";
        respuesta[1] = "SNS";
        respuesta[2] = "Nacional";
        String[] cuenta = instance.login(dni, contrasena);
        assertTrue(Arrays.equals(respuesta, cuenta));
        
        dni = "12345678X";
        nombre = "Daniel";
        apellido = "Sanchez";
        contrasena = "contraseñaquetiene30caracteres";
        tipo = "SNS";
        nombreregion = "Nacional";
        logindao.insertarTrabajador(dni, nombre, apellido, contrasena, tipo, nombreregion);
        cuenta = instance.login(dni, contrasena);
        assertTrue(Arrays.equals(respuesta, cuenta));
        
        dni = "12345678X";
        nombre = "Daniel";
        apellido = "Sanchez";
        contrasena = "kkasdbvlashdbvlashdblHWRBGALSKDJJVB";
        tipo = "SNS";
        nombreregion = "Nacional";
        logindao.insertarTrabajador(dni, nombre, apellido, contrasena, tipo, nombreregion);
        cuenta = instance.login(dni, contrasena);
        assertFalse(Arrays.equals(respuesta, cuenta));
    }
    
}
