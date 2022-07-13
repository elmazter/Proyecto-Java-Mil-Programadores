package unidad4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import miercoles20_04.Alumno;

public class PruebaBD {
	private ArrayList<Alumno> listaAlumnos;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaBD prueba = new PruebaBD();
		
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cursojava?serverTimezone=UTC",
                "root", "");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            
            ResultSet resultSet; //recibir los datos
            
            resultSet = statement.executeQuery(
                "SELECT * FROM `alumnos` WHERE `idAlumnos`=3");
            
            prueba.armarListaAlumnos(resultSet);
            prueba.mostrarLista();
           
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends

	private void mostrarLista() {
		// TODO Auto-generated method stub
		for (Alumno alumno : listaAlumnos) {
			alumno.imprimirAlumno();
		}
	}

	private void armarListaAlumnos(ResultSet rs) {
		// TODO Auto-generated method stub
		listaAlumnos = new ArrayList<Alumno>();
		 try {
			while (rs.next()) {
				int id = rs.getInt("idAlumnos");
				String nombre = rs.getString("nombreAlumnos");
				String apellido = rs.getString("apellidoAlumnos");
				int edad = rs.getInt("edadAlumnos");
				String domicilio = rs.getString("domicilioAlumnos");
				int dni = rs.getInt("dniAlumnos");
				int lu = rs.getInt("luAlumnos");
			 Alumno a = new Alumno(id, nombre, apellido, edad, domicilio, dni, lu); 	
			     listaAlumnos.add(a);
			     
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
