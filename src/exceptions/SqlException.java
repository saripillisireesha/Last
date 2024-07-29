package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlException {

	public static void main(String[] args)throws Exception {
		//Class.forName("Com.mysql.cj.jdbc.Driver");
		//Conection co=DriverManager.getConnection("jdbc:mysql://localhost:5432/Sireesha","root","root");
		PreparedStatement s=prepareStatement("dlete +from Employe1 where name='siri'");
 s.executeUpdate();
 s.close();
	}

	private static PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
