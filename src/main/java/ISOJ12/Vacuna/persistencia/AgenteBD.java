package ISOJ12.Vacuna.persistencia;


import org.apache.derby.jdbc.*;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class AgenteBD {
	
	private PreparedStatement pstmt;
	private Statement stmt;
	private static  Connection mBD;
	protected static AgenteBD Instancia = null;
	
	protected AgenteBD(){
		crearBaseDatos();
	}
	
	public static AgenteBD getAgente() throws SQLException {
        if (Instancia == null) {
            Instancia = new AgenteBD();
        }
        return Instancia;
    }

	public static void conectarBD() {
		Driver derbyEmbeddedDriver = new EmbeddedDriver();
		try {
			DriverManager.registerDriver(derbyEmbeddedDriver);
			mBD = DriverManager.getConnection(""+"jdbc:derby"+":"+"BDVacuna"+";create=false", "admin", "admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void desconectarBD() {
		try {
			stmt.close();
			mBD.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param sql
	 */
	public ResultSet select(String sql) {
		ResultSet res = null;
		try {
			conectarBD();
			stmt = mBD.createStatement();
			res = stmt.executeQuery(sql);
			desconectarBD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 
	 * @param sql
	 */
	public int insert(String sql) {
		int res = 0;
		try {
			conectarBD();
			pstmt = mBD.prepareStatement(sql);
			res = pstmt.executeUpdate();
			desconectarBD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return res;
	}

	/**
	 * 
	 * @param sql
	 */
	public int update(String sql) {
		int res = 0;
		try {
			conectarBD();
			stmt = mBD.createStatement();
			res=stmt.executeUpdate(sql);
			desconectarBD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 
	 * @param sql
	 */
	public int delete(String sql) {
		int res = 0;
		try {
			conectarBD();
			stmt = mBD.createStatement();
			res=stmt.executeUpdate(sql);
			desconectarBD();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	public static void crearBaseDatos() {
		Statement stmt;
		String createSQL = "create table trabajadores (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, contraseña varchar(30) not null)";
		String createSQL2 = "create table vacunacion (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, telefono varchar(30))";
		String createSQL3 = "create table lotevacunas (id varchar(30) not null, tipo varchar(30) not null, numVacunas int not null, fechaRecepcion Date not null)";
		String createSQL4 = "create table vacunas (id varchar(30) not null, tipo varchar(30) not null, numVacunas int not null, fechaRecepcion Date not null)";
		
		try {
			conectarBD();
			stmt = mBD.createStatement();
			stmt.execute(createSQL);
			stmt.execute(createSQL2);
			stmt.execute(createSQL3);
			stmt.execute(createSQL4);
		} catch (SQLException ex) {
			System.out.println("in connection" + ex);
		}

		try {
			DriverManager.getConnection("jdbc:derby:;shutdown=true");
		} catch (SQLException ex) {
			if (((ex.getErrorCode() == 50000) && ("XJ015".equals(ex.getSQLState())))) {
				System.out.println("Derby shut down normally");
			} else {
				System.err.println("Derby did not shut down normally");
				System.err.println(ex.getMessage());
			}
		}
	}
}