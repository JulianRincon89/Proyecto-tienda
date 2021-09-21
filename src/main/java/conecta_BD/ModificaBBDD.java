package conecta_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		try {
			//1. Crear Conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_estudiantes", "root", "Beijing123");
			//2. Crear objeto Statement que permite hacer querys en SQL
			Statement miStatement=miConexion.createStatement();
	
				//Insert: String instSQL="INSERT INTO ESTUDIANTES  (Nombres, Apellidos, Nacimiento, CorreoInst) VALUES ('Pedro', 'Paramo', '02-05-2021','julian@gmail.com')";
				//Delete: String instSQL="update estudiantes set Apellidos='Rincon' where CorreoInst='julian@gmail.com'";
			String instSQL="delete from estudiantes where Correoinst='julian@gmail.com'";
			//Tenemos la instruccion y ahora debemos decirle que ejecute la SQL.
				miStatement.executeUpdate(instSQL);
				System.out.println("Datos eliminados correctamente");
			
		} catch (Exception e) {
			System.out.println("No conecta");
			//imprime la línea de error
			e.printStackTrace();
		}

	}

}
