package ejemploVectores;

public class TestPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		PrimerVector obj = new PrimerVector();
		if(obj.esPrimo(n)){
			System.out.println("Es primo");
		}else{
			System.out.println("No es Primo");
		}
	}

}
