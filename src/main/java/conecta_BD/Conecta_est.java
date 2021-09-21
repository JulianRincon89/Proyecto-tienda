package conecta_BD;
import java.sql.*;
public class Conecta_est {

	public static void main(String[] args) {
		
	try {
		//1. Crear Conexion
		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_generica", "root", "Beijing123");
		//2. Crear objeto Statement que permite hacer queries en SQL
		Statement miStatement=miConexion.createStatement();
		//3. Ejecutar SQL
		ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM usuarios");
		//4. Recorrer el ResulSet o tabla virtual que se almacena en la memoria
		while (miResultSet.next()) {
			System.out.println(miResultSet.getString("cedula_usuario")+ " "+miResultSet.getString("email_usuario")+ " "+ miResultSet.getString("nombre_usuario"));

		}
	} catch (Exception e) {
		System.out.println("No conecta");
		//imprime la línea de error
		e.printStackTrace();
	}

	}

}
