package pkg3;

//import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("file.txt");
//		BufferedReader br = new BufferedReader(fr);
		Scanner sc = new Scanner(fr);
//		String s;
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		fr.close();
		sc.close();

	}

}
