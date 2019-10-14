package fanya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("properties/jdbc.properties");
			Properties p = new Properties();
			p.load(is);
			System.out.println(p.getProperty("jdbc.driver"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
