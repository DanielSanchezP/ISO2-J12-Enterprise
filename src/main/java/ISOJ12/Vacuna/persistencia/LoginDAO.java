package ISOJ12.Vacuna.persistencia;

import ISOJ12.Vacuna.dominio.entitymodel.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class LoginDAO extends AgenteBD {
	AgenteBD BD = AgenteBD.getAgente();
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param contraseña
	 */
	public void insertarTrabajador(String dni, String nombre, String apellido, String contraseña){
		
		BD.insert("INSERT INTO trabajadores VALUES ("+dni+","
				+ ""+nombre +", "+apellido+", "+contraseña+")");
		
	}
	
	public boolean comprobarLogin(String nombre, String contrasena) {
        String[] trabajador=new String[2];
        ResultSet res = BD.select("SELECT nombre, contraseña FROM trabajadores * WHERE nombre ='"+nombre+"'AND contrasena ='"+contrasena+" ");
        try {
            while (res.next()) {
            	trabajador[0]=res.getObject(1).toString();
            	trabajador[1]=res.getObject(2).toString();
            }
            if (trabajador[0].equals(nombre)==true && trabajador[1].equals(contrasena)==true) {
                
                return true;
            }
        }catch(SQLException | NullPointerException ex) {
            	System.out.println("El nombre y contrasena no han sido encontrados.");
                }
                return false;

    }

}
