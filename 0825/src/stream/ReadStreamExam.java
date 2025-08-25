package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadStreamExam {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("C:/jinyong/test1/test1.db");
			while(true) {
				int date = is.read();
				if(date == -1) break;
				System.out.println(date);
			}
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
