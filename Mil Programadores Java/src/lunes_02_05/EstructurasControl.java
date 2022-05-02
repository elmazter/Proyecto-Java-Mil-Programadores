package lunes_02_05;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		edad = 30;
		boolean esMayor; // true | false
		esMayor = edad < 18;
		if ( !esMayor ){ // variable de tipo logico (booleana)
			//para q ingrese aqui, la condicion NO ES VERDADERA
			System.out.println("Es mayor de edad");
		}else{		
			
			//para q ingrese aqui, la condicion debe ser VERDADERA
			System.out.println("Es menor de edad");
		}
		
		// operaciones booleanas  &  |  
		boolean a, b, c;
		a = false; b = false;
		c = a & b;
		System.out.println("C: " +c);
		
	}

}
