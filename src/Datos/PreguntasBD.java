package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Auxiliar.ProjectDatabaseConnection;
import Logica.PreguntaInglesLogica;

public class PreguntasBD {

	
	
	
	public static  String[] getPreguntaIngles() throws SQLException {
		// Creado por Iv�n Guirola
		String preguntaIngles[] = new String[6];
		String id_Pregunta = null;
		String pregunta = null;
		String correcta = null;
		String alt1 = null;
		String alt2 = null;
		String alt3 = null;
		PreparedStatement PS;
		ResultSet RS;
		String SQL_SELECT = "SELECT * FROM INGLES ORDER BY RAND() LIMIT 1";
		ProjectDatabaseConnection conn = new ProjectDatabaseConnection();
		PS = conn.getConnection().prepareStatement(SQL_SELECT);
		RS = PS.executeQuery();
		while (RS.next()) {
			preguntaIngles[0] = RS.getString(1);
			preguntaIngles[1] = RS.getString(2);
			preguntaIngles[2] = RS.getString(3);
			preguntaIngles[3] = RS.getString(4);
			preguntaIngles[4] = RS.getString(5);
			preguntaIngles[5] = RS.getString(6);
		}
		
		PS = null;
		RS = null;
		conn.desconectar();
		
	return preguntaIngles;
	}
}
