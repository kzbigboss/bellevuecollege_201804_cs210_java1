/*
 * Mark Kazzaz
 * 2018-05-08
 * Bellevue College, CS210
 * Chapter 5 Quiz
 */

import java.util.*;

public class Chapter5 {

	//public static void main(String[] args) {
	
	//System.out.println(isPerfectNumber(8128));
	//System.out.println(24 % 6);
	//System.out.println(random4DigitNum());
	
	//Random r = new Random();
	//System.out.println(r.nextInt(10000));

	//}
	
	 public static void main(String[] args) { // provided main method
		   // A. Is Perfect Number ???
		   int test = 0;
		   while (test<999) {
		     if (isPerfectNumber(test)) 
		         System.out.println(test); // 6 and 28
		     test++;
		   }
		 
		   // B. Random Four Digit Number
		   do {
		     test = random4DigitNum();
		   } while (test != 1313);
		   System.out.println(test); // 1313
		 }
	
	public static boolean isPerfectNumber(int inputAmount) {
		//set input to be positive in case we get a negative
		inputAmount = Math.abs(inputAmount);
		int intTestAmount = inputAmount;
		int runningAmount = 0;
		
		
		// initialize result variable
		boolean result = false;
		
		//fence post
		intTestAmount -= 1;
		
		// loop through positive divisors and see if even divisors add up to original input
		while (intTestAmount > 0) {
			if (inputAmount % intTestAmount == 0) {
				runningAmount = runningAmount + intTestAmount;
			}
			intTestAmount -= 1;
		}
		
		// check if the running amount equals the input amount
		if (inputAmount == 0) { // if the input is zero, then signal is false
			result = false;
		} else if (inputAmount == runningAmount) {
				result = true;	
		}
		
		// return result
		return(result);
	}
	
	public static int random4DigitNum() {
		// initialize a random object
		Random r = new Random();
		
		// initialize variables
		int result = 0;
		
		// loop until number is large enough
		while (result < 999) {
			result = r.nextInt(10000); // upper bound is excluded from selection
		}
		
		// return result
		return(result);
	}

}
