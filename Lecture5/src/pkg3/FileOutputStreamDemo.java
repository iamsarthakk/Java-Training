package pkg3;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception{
			String source = "Welcome to Java Data Files!!";
			
			byte buf[] = source.getBytes();
			FileOutputStream f0 = new FileOutputStream("fileA.txt");
			for(int i=0;i<buf.length;i+=2) {
				f0.write(buf[i]);
			}
			f0.close();
			
		
	}

}
