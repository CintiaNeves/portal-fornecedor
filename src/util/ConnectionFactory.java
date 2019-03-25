package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	String driver = "jdbc:sqlserver://";
	String server = "192.168.100.2\\SQLEXPRESS01:";
	String port = "1433;";
	String database = "databaseName=PORTALFORNECEDOR;";
	String user = "user=sa;";
	String password = "password=qwe123;";
	String integratedSecurity = "integratedSecurity=true;";

	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager
					.getConnection(driver
							.concat(server)
							.concat(port)
							.concat(database)
							.concat(user)
							.concat(password));
			return conn;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
