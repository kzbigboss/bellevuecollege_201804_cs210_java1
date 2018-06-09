import java.io.*;
import java.util.*;

public class Chapter6 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner input = new Scanner(new File("numbers.txt"));
		//evenNumbers(input);
		
		//negativeSum(new Scanner(new File("negativesum.txt")));
		
		//countCoins(new Scanner(new File("coins.txt")));
		
		readEntireFile(new Scanner(new File("lines spaces.txt")));

	}
	
	public static void evenNumbers(Scanner input) {

		int numCurrent = 0;
		int count = 0;
		int countEven = 0;
		int sum = 0;
		
		while (input.hasNextInt()) {
			numCurrent = input.nextInt();
			
			count += 1;
			sum += numCurrent;
			if (numCurrent % 2 == 0) {
				countEven += 1;
				}
		}
		
		System.out.println(count + " numbers, sum = " + sum);
		System.out.printf("%d evens (%.2f%" + "%)", countEven, ((float) countEven / count) * 100 );
	}
	
	public static boolean negativeSum(Scanner input) {
		int numCount = 0;
		int numSum = 0;
		boolean turnedNegative = false;
		
		while (input.hasNextInt()) {
			numCount += 1;
			numSum += input.nextInt();
			
			if (numSum < 0) {
				System.out.println(numSum + " after " + numCount + " steps");
				return(!turnedNegative);
			}
		}
		
		if (!turnedNegative) {
			System.out.println("no negative sum");
		}
		return(turnedNegative);
	}
	
	public static void countCoins(Scanner input) {

		double totalAmount = 0;
		int countCoin = 0;
		String currentCoin = "";
		double currentMultiple = 0.0;
		
		while(input.hasNext()) {
			
			countCoin = input.nextInt(); // store number of coins
			currentCoin = input.next(); // store type of coin
			
			currentCoin = currentCoin.toLowerCase(); // reset coin to lower case
			
			if (currentCoin.equals("quarters")) { //figure out how much the coin is worth
				currentMultiple = .25;
			} else if (currentCoin.equals("dimes")) {
				currentMultiple = .10;
			} else if (currentCoin.equals("nickels")) {
				currentMultiple = .05;
			} else {
				currentMultiple = .01;
			}
			
			totalAmount += (currentMultiple * countCoin); // add the current result to the total
			
//			System.out.println(countCoin + " " + currentCoin + " " + currentMultiple + " " + totalAmount);
			
		}
		
		System.out.printf("Total money: $%.2f", totalAmount);
	}
	
	public static void collapseSpaces(Scanner input) {
		
		String processedLine = "";
		
		while (input.hasNext()) {
			String currentLine = input.nextLine();
			
			Scanner processLine = new Scanner(currentLine);
			
			while (processLine.hasNext()) {
				processedLine += processLine.next() + " ";
			}
			
			processedLine += "\n";
		}
		
		System.out.println(processedLine);
	}
	
	public static String readEntireFile(Scanner input) {
		String allLines = "";

		while(input.hasNextLine()) {
			allLines += input.nextLine() + "\n";
		}
		
		return(allLines);
	}

}
