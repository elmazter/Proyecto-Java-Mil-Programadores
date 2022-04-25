package modulo2_tp1_2_3;

public class NumerosEnteros {
	private int num;
	
	
	
	public NumerosEnteros(int num) {
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void suma(NumerosEnteros n){
		this.num = this.num + n.getNum();
	}
	public void resta(NumerosEnteros n){
		this.num = this.num - n.getNum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosEnteros a = new NumerosEnteros(10);
		NumerosEnteros b = new NumerosEnteros(50);
		b.suma(a);
		System.out.println(b.getNum());
	}

}
