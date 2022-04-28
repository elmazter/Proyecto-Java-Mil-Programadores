package jueves28_04;

public class TestAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a = new Agenda();
		//crear un contacto
		Contacto c = new Contacto("Juan", "Cruz", "3875487512");
		
		if(a.agregarContacto(c)){
			System.out.println("Contacto cargado exitoso");
		}else
		{
			System.out.println("No pudimos agregar el contacto");
		}
		System.out.println("Tam Lista : "+ a.getTamLista());
		//agregar un contacto repetido
		
		Contacto c2 = new Contacto("Juan", "Cruz", "387568912");
		if(a.agregarContacto(c2)){
			System.out.println("Contacto cargado exitoso");
		}else
		{
			System.out.println("No pudimos agregar el contacto");
		}
		System.out.println("Tam Lista : "+ a.getTamLista());

	}

}
