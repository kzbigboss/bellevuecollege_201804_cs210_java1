import java.util.Scanner;

public class Chapter4_HW {

	public static void main(String[] args) {
		//System.out.print(fractionSum(5));
		//System.out.print(repl("blah",3));
		//System.out.print(season(3,16));
		//printGPA();
		//Scanner console = new Scanner(System.in);
		//longestName(console, 5);
		//printTriangleType(5, 7, 7);
		//printTriangleType(6, 6, 6);
		//printTriangleType(5, 7, 8);
		//printTriangleType(12, 18, 12);
		//System.out.print(getGrade(94)); 
		//Scanner console = new Scanner(System.in);
		//printPalindrome(console);
		System.out.print(stutter("Hello!"));
	}
	
	public static double fractionSum(int n) {
		double result = 0.0;
		
		for (int i = 1; i <= n; i++) {
			result = result + (1.0 / i);
		}
		
		return(result);
	}
	
	public static String repl(String strInput, int numRepeat) {
		String result = "";
		
		if(numRepeat <= 0) {
			return(result);
		}
		
		for (int i = 0; i < numRepeat; i++) {
			result = result + strInput;
		}
		
		return(result);
	}
	
	public static String season(int month, int day) {
		
		int date = (month * 100)  + day;
		
		String resultSeason = "";
		
		if (date >= 1216 || date <= 315) {
			resultSeason = "Winter";
		} else if (date >= 316 && date <= 615) {
			resultSeason = "Spring";
		} else if (date >= 616 && date <= 915) {
			resultSeason = "Summer";
		} else {
			resultSeason = "Fall";
		}
		
		return(resultSeason);
	}
	
	public static void printGPA() {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String studentName = console.next();
		
		int numGrades = console.nextInt();
		
		int sumGrade = 0;
		
		for (int i = 0; i < numGrades; i++) {
			sumGrade += console.nextInt();
		}
		
		double avgGrade = (double) sumGrade / (double) numGrades;
		System.out.println(studentName + "'s grade is " + avgGrade);
		
	}
	
	public static void longestName(Scanner console, int numNames) {
		// figure out how many loops we need
		// tell the user to enter the first name
		// begin the loop to capture the next input
		// store the input back in lower case, then uppercase the first letter
		// store the length of the name
		// figure out if that's the longest name seen yet
		// if so
			//	record the longest length
			//  check if it ties to the longest length
		// if not
			// cycle on
		
		// report results to user
			// report longest name in proper case
			// report if there was a tie
		
		String longestNameString = "";
		int longestNameLength = 0;
		boolean wasTie = false;
		
		
		for (int i = 1; i <= numNames; i++) {
			
			//prompt user for name #i
			System.out.print("name #" + i + "? ");
			String currentNameString = console.nextLine();
			
			//figure out if the name is the longest seen yet
			if (currentNameString.length() > longestNameLength) {
				longestNameLength = currentNameString.length();
				longestNameString = currentNameString;
				wasTie = false;
			} else if (currentNameString.length() == longestNameLength) {
				wasTie = true;
			}
		}
		
		//set name to proper case, print to user
		longestNameString = longestNameString.toLowerCase();
		char startNameString = longestNameString.toUpperCase().charAt(0);
		longestNameString = startNameString + longestNameString.substring(1, longestNameString.length());
		System.out.println(longestNameString + "\'s name is longest");
		
		//print if there was a tie
		if (wasTie == true) {
			System.out.println("(There was a tie!)");
		}
		
	}

	public static void printTriangleType(int sideA, int sideB, int sideC) {
		
		String result = "";
		
		if (sideA == sideB && sideA == sideC && sideB == sideC) {
			result = "equilateral";
		} else if (sideA == sideB || sideA == sideC || sideB == sideC) {
			result = "isosceles";
		} else {
			result = "scalene";
		}
		
		System.out.println(result);
	}

	public static double getGrade(int score) {
		
		double grade = 0.0;
		
		if (score < 0 || score > 100) {
			throw new IllegalArgumentException("Score is invalid");
		} else if (score >= 95) {
			grade = 4.0;
		} else if (score >= 63 && score < 95) {
			grade = 0.7 + (score - 62) * 0.1;
		} else if (score >= 60 && score <= 62) {
			grade = 0.7;
		} else {
			grade = 0.0;
		}
		
		return(grade);
	}
	
	public static void printPalindrome(Scanner console) {
		System.out.print("Type one or more words: ");
		String input = console.next();
		String inputReverse = "";
		
		for (int i = input.length()-1; i >= 0; i--) {
			inputReverse = inputReverse + input.charAt(i);
		}
		
		System.out.print("\n");
		
		if (input.equalsIgnoreCase(inputReverse)) {
			System.out.println(input + " is a palindrome!");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}

	public static String stutter(String input) {
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			result = result + input.charAt(i) + input.charAt(i);
		}
		
		return(result);
	}

}
