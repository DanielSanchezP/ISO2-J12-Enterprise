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
	public void insertarTrabajador(String dni, String nombre, String apellido, String contrasena, String tipoUsuario, String nombreregion){
		BD.insert("INSERT INTO trabajadores VALUES ('"+dni+"','"+nombre +"', '"+apellido+"', '"+contrasena+"', '"+tipoUsuario+"', '"+nombreregion+"')");
                System.out.println(contrasena);
                
	}
	
	public String[] comprobarLogin(String dni, String contrasena) {
        String[] trabajador=new String[3];
        String[] result=new String[2];
        System.out.println(contrasena);
        ResultSet res = BD.select("SELECT dni, contrasena, tipousuario FROM trabajadores WHERE dni ='"+dni+"' AND contrasena ='"+contrasena+"' ");
        try {
            while (res.next()) {
            	trabajador[0]=res.getObject(1).toString();
            	trabajador[1]=res.getObject(2).toString();
                trabajador[2]=res.getObject(3).toString();
            }
            if (trabajador[0].equals(dni)==true && trabajador[1].equals(contrasena)==true) {
                result[0]="true";
                result[1]=trabajador[2];
                return result;
            }
        }catch(SQLException | NullPointerException ex) {
            	System.out.println("El nombre y contrasena no han sido encontrados.");
                }
                result[0]="false";
                return result;

    }

}
