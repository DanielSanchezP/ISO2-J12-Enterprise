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
	
	
	private Statement stmt;
	private static  Connection mBD;
	protected static AgenteBD instancia = null;
	
	protected AgenteBD(){
		crearBaseDatos();
	}
	
	public static AgenteBD getAgente(){
        if (instancia == null) {
            instancia = new AgenteBD();
        }
        return instancia;
    }

	public static void conectarBD() {
		Driver derbyEmbeddedDriver = new EmbeddedDriver();
                String admin = "admin";
		try {
			DriverManager.registerDriver(derbyEmbeddedDriver);
			mBD = DriverManager.getConnection(""+"jdbc:derby"+":"+"BDVacuna"+";create=false", admin, admin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void desconectarBD() {
		try {
			mBD.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet select(String sql) {
		ResultSet res = null;
		try {
			conectarBD();
			stmt = mBD.createStatement();
			res = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int insert(String sql) {
		int res = 0;
		try {
			conectarBD();
			PreparedStatement pstmt = mBD.prepareStatement(sql);
			res = pstmt.executeUpdate();
			desconectarBD();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int update(String sql) {
		int res = 0;
		try {
                    conectarBD();
		try(PreparedStatement pstmt = mBD.prepareStatement(sql)){
                    res = pstmt.executeUpdate();
                }
                desconectarBD();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int delete(String sql) {
		return update(sql);
	}
	
	public static void crearBaseDatos() {
		String admin = "admin";
		String createSQL = "create table trabajadores (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, contrasena varchar(30) not null, tipousuario varchar(3) not null, nombreregion varchar(30))";
		String createSQL2 = "create table vacunacion (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, vacuna varchar(30) not null, fecha Date not null, dosis int not null, nombreregion varchar(30) not null)";
		String createSQL3 = "create table lotevacunas (id varchar(30) not null, tipo varchar(30) not null, numVacunas int not null, fechaRecepcion Date not null)";
		String createSQL4 = "create table vacunas (id varchar(30) not null, nombre varchar(30) not null, farmaceutica varchar(30) not null, grupoprioridad varchar(30) not null, fechaRecepcion Date not null, numVacunas int not null, nombreregion varchar(30) not null)";
		String createSQL5 = "create table estadisticas(nombreregion varchar(30) not null, vacunados long not null, vacunasInoculadas long not null, poblacion long not null)";
		try {
			Driver derbyEmbeddedDriver = new EmbeddedDriver();
			DriverManager.registerDriver(derbyEmbeddedDriver);
			mBD = DriverManager.getConnection(""+"jdbc:derby"+":"+"BDVacuna"+";create=true", admin, admin);
                    try (Statement stmt = mBD.createStatement()) {
                        stmt.execute(createSQL);
                        stmt.execute(createSQL2);
                        stmt.execute(createSQL3);
                        stmt.execute(createSQL4);
                        stmt.execute(createSQL5);
                    }
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