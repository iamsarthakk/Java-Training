package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		try {
			MyClass object1 = new MyClass("Hello", -7, 2.7e10);
			MyClass object3 = new MyClass("Hello3", -8, 3.5e10);
			System.out.println("object1: "+object1);
			System.out.println("object3: "+object3);
			FileOutputStream fos = new FileOutputStream("Serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.writeObject(object3);
			oos.flush();
			oos.close();
			
		}catch(Exception e) {
			System.out.println("Exception during serialization: "+e);
			System.exit(0);
		}
	}

}
