/*
 * Mark Kazzaz
 * 2018-05-30
 * Bellevue College, CS210
 * Programming Assignment 3
 */

// This program reads an input file that contains sequences of integers to
// be added together.  The program reads them as Strings so that it can
// process large integers.  Reset the constant DIGITS to allow it to handle
// larger integers.

import java.io.*;
import java.util.*;

public class SumBigInts {
    public static final int MAX_DIGITS = 25;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("sum.txt"));
        
        processFile(input);
    }

    public static void processFile(Scanner input) {
    	while (input.hasNextLine()) {
    		String line = input.nextLine();
    		
    		processLine(line);
    	}
    }
    
    public static void processLine(String line) {
    	Scanner input = new Scanner(line);
    	
        // declare variables
    	String inputToken = "";
    	String overallLine = "";
    	
    	int[] listResult = new int[MAX_DIGITS];
    	
    	
    	
    	// run through and fill/flip the first array
    	inputToken = input.next();
    	overallLine = inputToken;
    	
    	stringToArray(inputToken, listResult);
    	
    	while (input.hasNext()) {
    		inputToken = input.next();
    		overallLine = overallLine + " + " + inputToken;
    		
    		int[] listNext = new int[MAX_DIGITS];
    		stringToArray(inputToken, listNext);
    		addArray(listResult, listNext);
    		fixTensArray(listResult);
    		
    	}
    	
    	// restate into string
    	String total = clipString(arrayToString(listResult));
    	
    	//Print the line
    	System.out.println(overallLine + " = " + total);
    }
    
    public static void stringToArray(String inputString, int[] inputArray) {
    	int aryStartingPoint = MAX_DIGITS - inputString.length();
    	int strIndex = 0;
    	
    	for (int i = aryStartingPoint; i < inputArray.length; i++) {
    		inputArray[i] = inputString.charAt(strIndex) - 48;
    		strIndex += 1;
    	}
    }
    
    public static String arrayToString(int[] inputArray) {
    	String result = "";
    	
    	for (int i = 0; i < inputArray.length; i++) {
    		result = result + Integer.toString(inputArray[i]);
    	}
    	
    	return(result);
    }
    
    public static void addArray(int[] list1, int[] list2) {
    	
    	for (int i = 0; i < list1.length; i++) {
    		list1[i] = list1[i] + list2[i];
    	}
    	
    }
    
    public static void fixTensArray(int[] inputArray) {
    	for (int i = inputArray.length - 1; i >= 0; i--) {
    		if (inputArray[i] >= 10) {
    			inputArray[i] -= 10;
    			inputArray[i-1] += 1;
    		}
    	}
    }
    
    public static String clipString(String input) {
    	for (int i = 0; i < input.length(); i++) {
    		if (input.charAt(i) != 48) {
    			return(input.substring(i, input.length()));
    		}
    	}
    	
    	return "0";
    }
}