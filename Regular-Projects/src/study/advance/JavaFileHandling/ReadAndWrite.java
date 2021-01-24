package study.advance.JavaFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) {
		//create new file object
		File file = new File("Resources"); //Folder Name
		//create new folder
		file.mkdir();
		file = new File("Resources//team.txt");//File Name and Path
		
		//Create and Write into the File
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			bw.newLine();
			bw.write("Zahir");
			bw.newLine();
			bw.write("Nasir");
			bw.newLine();
			bw.write("Jesmin");
			System.out.println("Writing into the file completed!");
			bw.close();
		}
		catch(IOException e) {
			System.out.println("IOException while writing"+e);
		}
		
		//Read the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			System.out.println("******************************");
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException while reading: "+e);
		}
		catch(IOException e) {
			System.out.println("IOException while reading: "+e);
		}
	}

}
