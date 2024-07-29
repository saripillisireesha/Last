package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("rev.txt");
		String s="hello siri";
		 byte b[]=s.getBytes();
		f.write(b);
		//f.flush();
		f.close();
		System.out.println("finish");
		//f.close();

	}

}
