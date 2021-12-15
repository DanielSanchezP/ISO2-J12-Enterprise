/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.persistencia;

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
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
     * Test of insertarTrabajador method, of class LoginDAO.
     */
    @Test
    public void testInsertarTrabajador() {
        System.out.println("insertarTrabajador");
        String dni = "01234567A";
        String nombre = "Pepe";
        String apellido = "Viyuela";
        String contrasena = "1234";
        String tipoUsuario = "SNS";
        String nombreregion = "Nacional";
        LoginDAO instance = new LoginDAO();
        instance.insertarTrabajador(dni, nombre, apellido, contrasena, tipoUsuario, nombreregion);
    }

    /**
     * Test of comprobarLogin method, of class LoginDAO.
     */
    @Test
    public void testComprobarLogin() {
        System.out.println("comprobarLogin");
        String dni = "01234567A";
        String contrasena = "1234";
        LoginDAO instance = new LoginDAO();
        String[] result = instance.comprobarLogin(dni, contrasena);
        String[] expResult = new String []{"true", "SNS", "Nacional"};
        assertArrayEquals(expResult, result);
    }
}
