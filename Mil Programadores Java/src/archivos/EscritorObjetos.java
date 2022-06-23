package archivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscritorObjetos extends ObjectOutputStream{

	protected EscritorObjetos() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	public EscritorObjetos(FileOutputStream fileOutputStream) throws IOException {
		// TODO Auto-generated constructor stub
		super(fileOutputStream);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub

	}

}
