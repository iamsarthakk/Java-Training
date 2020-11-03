package Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializationdemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
	
			MyClass object2 = null;
			FileInputStream fis = new FileInputStream("Serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				while((object2 = (MyClass)ois.readObject())!=null) {
					System.out.println("Object2: "+object2);
				}
			}catch(EOFException exp) {
				System.out.println("End of file");
				ois.close();
				System.out.println("Object2: "+object2);
			}
	}

}
