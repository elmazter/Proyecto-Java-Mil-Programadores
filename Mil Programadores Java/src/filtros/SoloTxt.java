package filtros;

import java.io.File;
import java.io.FilenameFilter;

public class SoloTxt implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".txt");
	}

}
