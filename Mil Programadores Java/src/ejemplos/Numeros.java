package ejemplos;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  {0, 1 , .... , 9}   0 1 2  ... 9 10 11 12 .... 19 20 21 ...
		//octal {0, 1 , 2 , ... 7 } 0 1 2 .. 7   10 11 12... 17 21 22 23...    45261
		//hexadecimal {0, 1 , 2 ,..., 9, A, B, C ,D ,E, F} 
		int octal; // 045
		octal = 012;
		System.out.println(octal);
		int hexa ;
		hexa = 0xF;
		System.out.println("Hexadecimal : " + hexa);
	}

}
