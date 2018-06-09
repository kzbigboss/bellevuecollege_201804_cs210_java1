/*
 * Mark Kazzaz
 * 2018-05-01
 * Bellevue College, CS210
 * Chapter 4 Quiz
 */

public class Chapter4 {

	public static void main(String[] args) {
	//System.out.print(medianOf3(-200, 1817, -6));
	//System.out.print(reverseStutter("racecar"));

	}
	
	public static int medianOf3(int value1, int value2, int value3) {
		
		// median of three means middle of the list, so 
		// let's figure out which number isn't either
		// the max or min of the int values provided.
		
		int valueMax = Math.max(value1, Math.max(value2, value3));
		int valueMin = Math.min(value1, Math.min(value2, value3));
		int valueResult = 0;
		
		if (value1 != valueMax && value1 != valueMin) {
			valueResult = value1;
		} else if (value2 != valueMax && value2 != valueMin) {
			valueResult = value2;
		} else {
			valueResult = value3;
	}
		return(valueResult);
	}
	
	public static String reverseStutter(String input) {
		
		// for loop counting down the length of input
		// doubling the char @ i being saved each time
		
		String inputReverse = "";
		
		for (int i = input.length()-1; i >= 0; i--) {
			inputReverse = inputReverse + input.charAt(i) + input.charAt(i);
		}
		
		return(inputReverse);
	}

}
