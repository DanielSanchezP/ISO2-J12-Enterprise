package ISOJ12.Vacuna.persistencia;



import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO extends AgenteBD {
	AgenteBD bd = AgenteBD.getAgente();
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param contraseña
	 */
	public int insertarTrabajador(String dni, String nombre, String apellido, String contrasena, String tipoUsuario, String nombreregion){
		return bd.insert("INSERT INTO trabajadores VALUES ('"+dni+"','"+nombre +"', '"+apellido+"', '"+contrasena+"', '"+tipoUsuario+"', '"+nombreregion+"')");
	}
	
	public String[] comprobarLogin(String dni, String contrasena) {
        String[] trabajador=new String[4];
        String[] result=new String[3];
        ResultSet res = bd.select("SELECT dni, contrasena, tipousuario, nombreregion FROM trabajadores WHERE dni ='"+dni+"' AND contrasena ='"+contrasena+"' ");
        try {
            while (res.next()) {
            	trabajador[0]=res.getObject(1).toString();
            	trabajador[1]=res.getObject(2).toString();
                trabajador[2]=res.getObject(3).toString();
                trabajador[3]=res.getObject(4).toString();
            }
            if (trabajador[0].equals(dni) && trabajador[1].equals(contrasena)) {
                result[0]="true";
                result[1]=trabajador[2];
                result[2]=trabajador[3];
                return result;
            }
        }catch(SQLException | NullPointerException ex) {
            	System.out.println("El nombre y contrasena no han sido encontrados.");
                }
                result[0]="false";
                return result;

    }

}
