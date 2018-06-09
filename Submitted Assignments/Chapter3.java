/*
 * Mark Kazzaz
 * 2018-04-24
 * Bellevue College, CS210
 * Chapter 3 Quiz
 */

public class Chapter3 {
	
	public static void main(String[] args) {
		//System.out.println(pentagonArea(3.14));
		//System.out.println(addSpaces("aBcD"));
	}
	
	public static double pentagonArea(double side) {
		// capture side of pentagon and
		// run it through the following formula
		double result = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) ) * Math.pow(side, 2) ;
		return(result);
	}
	
	public static String addSpaces(String input) {
		// remove whitespace from input
		input = input.replaceAll("\\s+","");
		
		// setup an empty output string
		String output = "";
		
		// for the length of input, save back each
		// character and add a space
		for (int i = 0; i < input.length(); i++) {
			output = output + input.charAt(i);
			output = output + " ";
			//System.out.println(i);
		}
		
		// use trim to cut off trailing space
		return(output.trim());
	}
	
}
