import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Cie2 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/cie1";
	static final String USER ="root";
	static final String PASS="";
	static final String QUERY="SELECT * from Personas";
	
	public static void main(String[] args) {
		try {
			Connection conexion=DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia=conexion.createStatement();
			Scanner sc=new Scanner (System.in);
			System.out.println("Inserte un nombre");
			String nombre=sc.next();
			System.out.println("Inserte apellido");
			String apellido=sc.next();
			System.out.println("Inserte la edad");
			int edad=sc.nextInt();
			sentencia.executeUpdate("insert into personas values ('"+nombre+"','"+apellido+"','"+edad+"')");
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
