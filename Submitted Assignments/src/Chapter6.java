/*
 * Mark Kazzaz
 * 2018-05-22
 * Bellevue College, CS210
 * Chapter 6 Quiz
 */

import java.io.*;

import java.util.*;

public class Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
        File file = new File("whatever.txt"); // any file will work
        Scanner input = new Scanner(file);
        System.out.println(oneLiner(input));
    }
	
	public static String oneLiner(Scanner input) {
		
		String runningString = "";
		
		while (input.hasNextLine()) {
			
			String currentLine = input.nextLine();
			
			Scanner processLine = new Scanner(currentLine);
			
			while (processLine.hasNext()) {
				runningString += processLine.next() + " ";
			}
		
		}
		
		return(runningString);
	}
    
}