package fanya;

import java.sql.Connection;
import java.sql.DriverManager;


public class Jdbc {
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://172.25.6.1/traffic?useUnicode=true&characterEncoding=utf-8";
			String user = "root";
			String password = "xusong";
			Connection cnn = DriverManager.getConnection(url, user, password);
			System.out.println(cnn.getMetaData().getURL());
			return cnn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}