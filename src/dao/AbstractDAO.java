package dao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbstractDAO implements IDAO{
	
	protected Connection connection;
	
	protected void destruct() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

