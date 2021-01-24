package study.advance.JavaFileHandling.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjReading {
	public static void main(String[] args) {
		try(FileInputStream fio = new FileInputStream("Resources//vehicle.data")){
			try(ObjectInputStream ois =new ObjectInputStream(fio)){
				Vehicle v1 = (Vehicle) ois.readObject();
				Vehicle v2 = (Vehicle) ois.readObject();
				Vehicle v3 = (Vehicle) ois.readObject();
				
				System.out.println("v1: " + v1.toString());
				System.out.println("v2: " + v2.toString());
				System.out.println("v3: " + v3.toString());
			}
			catch(ClassNotFoundException e) {
					e.printStackTrace();
			}
		}
		catch(IOException e) {
			System.out.println("IOException: " + e);
		}
	}
}
