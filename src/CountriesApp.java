import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountriesApp {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int userChoice = 0;
	
	

	System.out.println("Welcome to Grand Circus Travel Assistant App!");
do {
	System.out.println(" 1 - See the list of countries you can travel to");
	System.out.println(" 2 - Add a country to the list of places you would like to visit ");
	System.out.println(" 3 - Exit");
	
	
	userChoice = ValidationMethods.getInt(scan, "Enter your selection  ", 1 , 3);
	 userSelection(userChoice);
	
} while  (! (userChoice == 3 ));
	

//scan.close();
}


public static void userSelection(int  userChoice   ) {
	Scanner scan = new Scanner (System.in);
	String directoryFolder = "resources";
	String fileName = "countries.txt";
	String countryAdded;
	
	if (userChoice == 1) {
		System.out.println("Heres a list of some interesting travel destinations: ");
		CountriesTextFile.readFromFile(directoryFolder, fileName);
	}
	else if (userChoice == 2)   {
	System.out.println("Where would you like to go?");
	
	countryAdded =ValidationMethods.getStringMatchingRegex(scan, " ","^[A-z]+${30}" );
	CountriesTextFile.writeToFile(directoryFolder , fileName , countryAdded);
	   System.out.println("Great " + countryAdded + " has been added to your list");
	
	}


else  {
	System.out.println("Goodbye , thank you for choosing us for your travel needs!");
	
}


}

}
  





