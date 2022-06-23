package filtros;

import java.io.File;
import java.io.FilenameFilter;

public class PuntoDoc implements FilenameFilter {

	
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".docx");
	}




}
