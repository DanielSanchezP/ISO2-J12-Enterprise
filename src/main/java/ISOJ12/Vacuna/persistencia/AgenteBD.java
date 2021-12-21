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
		try( PreparedStatement pstmt = mBD.prepareStatement(sql)){
                    res = pstmt.executeUpdate();
                }
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
			stmt = mBD.createStatement();
			res=stmt.executeUpdate(sql);
                        stmt.close();
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
		try {
			Driver derbyEmbeddedDriver = new EmbeddedDriver();
			DriverManager.registerDriver(derbyEmbeddedDriver);
			mBD = DriverManager.getConnection(""+"jdbc:derby"+":"+"BDVacuna"+";create=true", admin, admin);
                    try (Statement stmt = mBD.createStatement()) {
                        stmt.execute("create table trabajadores (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, contrasena varchar(30) not null, tipousuario varchar(3) not null, nombreregion varchar(30))");
                        stmt.execute("create table vacunacion (dni varchar(30) not null, nombre varchar(30) not null, apellido varchar(30) not null, vacuna varchar(30) not null, fecha Date not null, dosis int not null, nombreregion varchar(30) not null)");
                        stmt.execute("create table lotevacunas (id varchar(30) not null, tipo varchar(30) not null, numVacunas int not null, fechaRecepcion Date not null)");
                        stmt.execute("create table vacunas (id varchar(30) not null, farmaceutica varchar(30) not null, grupoprioridad varchar(30) not null, numVacunas int not null, fechaRecepcion Date not null, nombreregion varchar(30) not null)");
                        stmt.execute("create table estadisticas (nombreregion varchar(30) not null, vacunados bigint not null, vacunasInoculadas bigint not null, poblacion bigint not null)");
                        
                        stmt.execute("INSERT INTO estadisticas VALUES('Galicia', 500, 1000, 1200356)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Asturias', 400, 800, 1000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('La Rioja', 600, 1200, 980750)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Pais Vasco', 450, 900, 1500000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Cantabria', 550, 1100, 800000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Navarra', 800, 1600, 1600000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Aragon', 1000, 2000, 8000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Cataluña', 12000, 24000, 20585690)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Castilla y Leon', 9000, 18000, 1000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Madrid', 50000, 100000, 24000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Castilla La Mancha', 8500, 17000, 9500400)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Comunidad Valenciana', 11000, 22000, 15680320)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Murcia', 10, 20, 3500000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Andalucia', 24000, 48000, 30000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Islas Baleares', 650, 1300, 8000000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Islas Canarias', 750, 1400, 5500000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Ceuta', 200, 400, 1250000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Melilla', 150, 300, 980000)");
                        stmt.execute("INSERT INTO estadisticas VALUES('Extremadura', 25000, 50000, 15350000)");
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