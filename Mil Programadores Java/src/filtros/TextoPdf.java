package filtros;



import java.io.File;
import java.io.FilenameFilter;

public class TextoPdf implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		boolean filtro = false;
		filtro = name.endsWith(".txt") | name.endsWith(".pdf");
		return filtro;
	}

}
