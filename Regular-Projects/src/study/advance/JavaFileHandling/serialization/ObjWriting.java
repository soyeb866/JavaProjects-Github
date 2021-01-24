package study.advance.JavaFileHandling.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjWriting {
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Toyota", 2);
		Vehicle vehicle2 = new Vehicle("Hona", 3);
		Vehicle vehicle3 = new Vehicle("Mercediz", 4);
		
		try(FileOutputStream fos = new FileOutputStream("Resources//vehicle.data")){
			try(ObjectOutputStream oos =new ObjectOutputStream(fos)){
				oos.writeObject(vehicle1);
				oos.writeObject(vehicle2);
				oos.writeObject(vehicle3);
			}
		}
		catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		
	}
	
}
