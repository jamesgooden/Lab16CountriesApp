import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class CountriesTextFile {
	String directoryFolder = "resources";
	String fileName = "countries.txt";



	public static void readFromFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();

			}
             reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found.");
		}
	}

	public static void writeToFile(String dir, String fileName , String userInput) {

		Path filePath = Paths.get(dir, fileName);
		File file = filePath.toFile();

	

		try {
			// the true parameter for the for FileOutputStream() constructor
			// appends data to the end of the file
			// false rewrites the file
			
			
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, false));
            
			outW.println("India");
		    outW.println("United States");
		    outW.println("China");
		    outW.println("Rwanda");
	     	outW.println(userInput);
			outW.close();

		} catch (FileNotFoundException e) {
			System.out.println("FILE WAS NOT FOUND");
			e.printStackTrace();
		}
	}

	public static void createDirectory() {
		String dirPath = "resources";

		Path folder = Paths.get(dirPath);

		if (Files.notExists(folder)) {

			try {// this is a example of a checked exception
				Files.createDirectories(folder);
				System.out.println("Folder was created succesfully");
			} catch (IOException e) {
				System.out.println("Something we wrong with the folder creation");
				e.printStackTrace();
			}
		}

	
	}

	public static void createFile(String directoryFolder, String fileName) {
//	String directoryFolder= "resources";
//	String fileName = "votes.txt";

		Path filePath = Paths.get(directoryFolder, fileName);
		if (Files.notExists(filePath)) {
			try {

				Files.createFile(filePath);
				System.out.println("Files were created succesfully");
			} catch (IOException e) {
				System.out.println("Something went wrong with the file creation");
				e.printStackTrace();
			}
		} else {

			System.out.println("File already exists");

		}
	}
	
}
	

