package study.advance.JavaFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any number:");
		int number = sc.nextInt();
		System.out.println(number);

		sc.close();// close the resource

		
		/*
		 * //create new file object File file = new File("Resources"); //Folder Name
		 * //create new folder file.mkdir(); file = new
		 * File("Resources//team.txt");//File Name and Path
		 * 
		 * // Create and Write into the File try(BufferedWriter bw = new
		 * BufferedWriter(new FileWriter(file, true))) { //BufferedWriter bw = new
		 * BufferedWriter(new FileWriter(file, true)); bw.newLine(); bw.write("Zahir");
		 * bw.newLine(); bw.write("Nasir"); bw.newLine(); bw.write("Jesmin");
		 * System.out.println("Writing into the file completed!"); //bw.close(); } catch
		 * (IOException e) { System.out.println("IOException while writing" + e); }
		 */
	}
}
