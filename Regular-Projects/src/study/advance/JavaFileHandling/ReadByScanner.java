package study.advance.JavaFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) {
		
		File file = new File("Resources//team.txt");
		//Read File by Scanner
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException while reading: "+e);
		}
		catch(IOException e) {
			System.out.println("IOException while reading: "+e);
		}
	}
}
