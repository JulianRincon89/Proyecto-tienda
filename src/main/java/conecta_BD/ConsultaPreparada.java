package conecta_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaPreparada {

	public static void main(String[] args) throws SQLException {
		
		try {
			//1. CREAR CONEXIÓN
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_estudiantes", "root", "Beijing123");
			//2. PREPARAR CONSULTA
			PreparedStatement miSentencia=miConexion.prepareStatement("SELECT  Nombres, Apellidos, CorreoInst FROM estudiantes WHERE Nombres=? AND Apellidos=?");
			//3. ESTABLECER PÁRAMETROS DE CONSULTA
			miSentencia.setString(1, "Ana");
			miSentencia.setString(2, "Garcia");
			
			//4. EJECUTAR Y CORRER CONSULTA
			ResultSet rs=miSentencia.executeQuery();
			
			while (rs.next()) { 
				System.out.println(rs.getString(1) + " "+ rs.getString(2)+ " "+ rs.getString(3));
				
			}
			
		//CERRAR EL RESULTSET Y LIBERAR LA MEMORIA
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
