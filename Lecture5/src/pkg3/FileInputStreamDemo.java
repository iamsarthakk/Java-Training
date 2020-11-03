package pkg3;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo{

	public static void main(String[] args)  throws Exception {
		int size;
		InputStream f = new FileInputStream("fileA.txt");
		System.out.println("Total Available Bytes: "+(size=f.available()));
		int n = size/4;
		System.out.println("first "+n+" bytes of the file in one read() at a time");
		
		for(int i=1;i<n;i++) {
			System.out.println((char) f.read());
		}
	}

}
