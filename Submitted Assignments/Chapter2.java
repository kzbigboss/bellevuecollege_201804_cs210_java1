/*
 * Mark Kazzaz
 * 2018-04-17
 * Bellevue College, CS210
 * Chapter 1 Quiz
 */

public class Chapter2 {
    public static void main (String args[]) {
        triangle(); // write nested loop to print a 10 line triangle
        fibonacci(); // write Exercise 2.3 from BJP text as a method
    }
    
    public static void triangle() {
    	// triangle overall shape is 10 lines
    	// with each line a mix of " " and "*"
    	// where "*" is center, starts at 19, 
    	// and ends at 1 hovering about the 
    	// number 13 from the fibonacci method.
    	
    	for (int i = 1; i <= 10; i++) {
    		
    		for (int k = 1; k <= (i - 1) + 3; k++) {
    			// wont lie, pretty much just tweaked the run condition
    			// until the alignment was over the 13
    			System.out.print(" ");
    		}
    		
    		for (int j = 1; j <= (21 - i * 2) ; j++) {
    			// wont lie, pretty much just tweaked the run condition
    			// until the alignment was over the 13
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    
    public static void fibonacci() {
    	// Borrowed from homework solution I wrote up.
    	// curious if there's a more elegant solution than
    	// having to use three variables.
    	
		int first_num = 1;
		int second_num = 1;
		int work_num = 0;
		
		System.out.print(first_num + " ");
		System.out.print(second_num + " ");
		for (int i = 1; i <= 10; i++) {
			work_num = first_num + second_num; 	// sum the two preceding numbers
			System.out.print(work_num + " ");
			first_num = second_num; 			// store the second number as the first number
			second_num = work_num;				// store the working number as the second number
		}
    }
}
