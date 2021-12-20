/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
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
public class AgenteBDTest {
    AgenteBD abd = AgenteBD.getAgente();;
    
    public AgenteBDTest() {
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
     * Test of crearBaseDatos method, of class AgenteBD.
     */
    @Test
    void testCrearBaseDatos() {
        System.out.println("crearBaseDatos");
        abd.crearBaseDatos();
    }

    /**
     * Test of getAgente method, of class AgenteBD.
     */
    @Test
    void testGetAgente() {
        System.out.println("getAgente");
        AgenteBD result = AgenteBD.getAgente();
        assertEquals(result, abd);
    }

    /**
     * Test of conectarBD method, of class AgenteBD.
     */
    @Test
    void testConectarBD() {
        System.out.println("conectarBD");
        abd.conectarBD();
    }

    /**
     * Test of desconectarBD method, of class AgenteBD.
     */
    @Test
    void testDesconectarBD() {
        System.out.println("desconectarBD");
        abd.desconectarBD();
    }

    /**
     * Test of insert method, of class AgenteBD.
     */
    @Test
    void testInsert() {
        System.out.println("insert");
        String sql = "INSERT INTO trabajadores VALUES ('01234567B','Pepe', 'Viyuela', '1234', 'SNS', '')";
        int expResult = 1;
        int result = abd.insert(sql);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of select method, of class AgenteBD.
     */
    @Test
    void testSelect() {
        System.out.println("select");
        String sql1 = "INSERT INTO trabajadores VALUES ('01234567A','Pepe', 'Viyuela', '1234', 'SNS', '')";
        abd.insert(sql1);
        String str1=null, str2=null, str3 = null;
        String sql = "SELECT dni, contrasena FROM trabajadores WHERE dni ='01234567A' AND contrasena ='1234' ";
        ResultSet result = abd.select(sql);
        try {
            while (result.next()) {
                str1=result.getObject(1).toString();
                str2=result.getObject(2).toString();
            }
            assertNotNull(str1);
            assertNotNull(str2);
            
        } catch (SQLException ex) {
            fail("No existe ningún elemento.");
        }
        sql = "SELECT dni, contrasena FROM trabajadores WHERE dni ='fregtg54534rf' AND contrasena ='12ertgetg' ";
        result = abd.select(sql);
        try {
            while (result.next()) {
                str1=result.getObject(1).toString();
                str2=result.getObject(2).toString();
            }
            assertNull(str1);
            assertNull(str2);
            
        } catch (SQLException ex) {
            fail("Existe ningún elemento.");
        }
    }

    /**
     * Test of update method, of class AgenteBD.
     */
    @Test
    void testUpdate() {
        System.out.println("update");
        String sql1 = "INSERT INTO trabajadores VALUES ('01234567A','Pepe', 'Viyuela', '1234', 'SNS', '')";
        abd.insert(sql1);
        String sql = "UPDATE trabajadores SET dni = '01234567B' WHERE dni = '01234567A'";
        int result = abd.update(sql);
        assertTrue(result>0);
    }

    /**
     * Test of delete method, of class AgenteBD.
     */
    @Test
    void testDelete() {
        System.out.println("delete");
        String sql = "DELETE FROM trabajadores WHERE dni = '01234567B' OR dni = '01234567A'";
        int result = abd.delete(sql);
        assertTrue(result>0);
    }
    
}
