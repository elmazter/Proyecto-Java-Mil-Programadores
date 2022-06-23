package filtros;

import java.io.File;
import java.io.FileFilter;


public class PuntoPdf implements FileFilter{

	
	public boolean accept(File f) {
		
		
//		boolean terminaCon=false;
//		if(f.getName().endsWith(".pdf") | f.getName().endsWith(".doc")|f.getName().endsWith(".docx")) {
//			terminaCon =true;
//		}
//		return terminaCon;
		
		// TODO Auto-generated method stub
		return f.getName().endsWith(".pdf");
	}


}
