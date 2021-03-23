package day13.jdbc;

import java.io.FileNotFoundException;

public class ConnectionToOracle {

	public static void main(String[] args) {
		//Employee e = new Employee();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class Found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

