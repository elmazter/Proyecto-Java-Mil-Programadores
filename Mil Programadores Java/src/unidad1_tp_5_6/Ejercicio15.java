package unidad1_tp_5_6;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio15 ej15 = new Ejercicio15();
		String user = "cris1234";
		String pass = "xf3C#";
		
		//pedimos que ingrese el usuario del login
		String usuarioIngresado = ej15.solicitarUsuario();
		String passIngresada = ej15.solicitarPass();
		
		//chequear el logueo
		ej15.chequearResultado(user, pass, usuarioIngresado, passIngresada);
		
		imprimirCartelPantalla();
		
	}
	
	
	
	
	
	
	
	
	

	










	private static void imprimirCartelPantalla() {
		// TODO Auto-generated method stub
		System.out.println("Texto por Pantalla");
	}





















	public void chequearResultado(String user, String pass, String usuarioIngresado, String passIngresada) {
		// TODO Auto-generated method stub
		if(user.equals(usuarioIngresado)) {
			if(pass.equals(passIngresada)) {
				System.out.println("Logueo CORRECTO");
			}else {
				System.out.println("Logueo INCORRECTO");
			}
		}else {
			System.out.println("Logueo INCORRECTO");
		}
	}

	public String solicitarPass() {
		// TODO Auto-generated method stub
		String pass="";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una Contraseña");
		pass = teclado.nextLine();
		
		return pass;
	}

	private String solicitarUsuario() {
		// TODO Auto-generated method stub
		String usuario="";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un nombre de Usuario");
		usuario = teclado.nextLine();
		
		return usuario;
	}

}
