package study.advance.JavaFileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("Resources//team.txt");
		//Delete File
		if(file.delete()) {
			System.out.println("File Delete Successfully");
		}
		else {
			System.out.println("File not delete successfully!");
		}

	}

}
