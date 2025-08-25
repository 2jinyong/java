package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteArrayStreamExam {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/jinyong/test1/test2.db");
			byte[] array = {10,20,30,40,50,60};
			os.write(array);
			os.flush();
			os.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
