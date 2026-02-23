package br.com.dighitink.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection abreConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost/rent_car", "root", "123456");
	}
}