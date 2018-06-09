import java.util.*;

public class Chapter5_HW {

	public static void main(String[] args) {
		//System.out.println(allDigitsOdd(0));
		//test(5);
		//System.out.println(gcd(24,84));
		//System.out.println(toBinary(0));
		//System.out.print( consecutive(4,2,3) );
		//System.out.print(dominant(5, 3, 7));
		//System.out.print(digitSum(-215));
		//System.out.print(digitRange(9));
		randomLines();

	}
	
	public static boolean allDigitsOdd(int n) {
		
		n = Math.abs(n);
		
		int numCount = 0;
		int numCountOdd = 0;
		
		if (n == 0) {
			return false;
		} else {
			while (n > 0) {
				int numInspect = n % 10;
				//System.out.println(numInspect);
				numCount += 1;
				if (numInspect % 2 == 1) {
					numCountOdd += 1;
				}
				n = n / 10;
			}
			
			if (numCount == numCountOdd) {
				return true;
			} else {
				return false;
			}
		}

	}
	
	public static void test(int n) {
		System.out.println(n % 2);
	}
	
	public static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		
		return(a);
	}
	
	public static String toBinary(int n) {
		
		// initialize variables
		int powerTwo = 0;
		String result = "";
		
		if (n == 0) {
			return "0";
		}
		
		// find which power of two exceeds input
		while (n >= Math.pow(2, powerTwo)) {
			powerTwo += 1;
		}
		
		// reduce powerTwo by one before starting next loop
		powerTwo -= 1;
		
		// loop through each power of two and determine if
		// it should be on/off for binary representation
		while (powerTwo >= 0) {
			if (n >= Math.pow(2, powerTwo)) {
				result = result + "1";
				n -= Math.pow(2, powerTwo);
			} else {
				result = result + "0";
			}
			
			powerTwo -= 1;
		}
		
		return(result);
	}

	public static boolean consecutive(int inputFirst, int inputSecond, int inputThird) {

		int lowest = Math.min(inputFirst, Math.min(inputSecond, inputThird));
		int highest = Math.max(inputFirst, Math.max(inputSecond, inputThird));
		int middle = 0; 
				
		if (inputFirst != lowest && inputFirst != highest) {
			middle = inputFirst;
		} else if (inputSecond != lowest && inputSecond != highest) {
			middle = inputSecond;
		} else {
			middle = inputThird;
		}
		
		if (lowest == middle -1 && middle == highest -1) {
			return(true);
		} else {
			return(false);
		}
	
	}
	
	public static boolean dominant(int a, int b, int c) {
		
		boolean result = false;
		
		if (a > b + c) {
			result = true;
		} else if (b > a + c) {
			result = true;
		} else if (c > a + b) {
			result = true;
		}
		
		return(result);
	}
	
	public static int digitSum(int input) {
		input = Math.abs(input);
		
		int runSum = 0;
		
		while (input > 0) {
			int currentNum = input % 10;
			runSum = runSum + currentNum;
			input = input / 10;
		}
		
		return(runSum);
	}
	
	public static int digitRange(int input) {
		
		input = Math.abs(input);
		int result = 0;
		
		int runMax = 0;
		int runMin = input;
		
		while (input > 0) {
			int current = input % 10;

			runMax = Math.max(runMax, current);
			runMin = Math.min(runMin, current);

			input = input / 10;
		}
		
		result = runMax - runMin + 1;
		
		if(result == 0) {
			return 1;
		} else {
			return(result);
		}
		
	}
	
	public static void randomLines() {
		Random r = new Random();
		
		for (int i = 0; i < r.nextInt(5) + 5; i++) {
			// how many random chars to print?
			int numChar = r.nextInt(81);
			
			// print chars
			for (int j = 0; j < numChar; j++) {
				System.out.print((char) (r.nextInt(26) + 'a'));
			}
			System.out.println();
		}
	}
}
