package estructuras;

public class Mientras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ciclo mientras
		//boolean condicion = true;
		int i=0;
		boolean cond1, condic2, condic3;
		cond1 = 10<50;
		condic2 = 5 > 20;
		condic3= 1 < 6;
		boolean condicionFinal = cond1 & condic2 & condic3;
		while(condicionFinal  ){
			
			i++; 	// i cambia 
			System.out.println(i + "  Salta");
				
		}
		System.out.println("Fin del programa");
	}

}
