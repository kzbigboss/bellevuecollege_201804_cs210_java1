/*
 * Mark Kazzaz
 * 2018-05-29
 * Bellevue College, CS210
 * Chapter 7 Quiz
 */

public class Chapter7 {

	 public static void main(String[] args) {
		    int[] array = {12, 7, -1, 25, 3, 9};
		    int[] list1 = {16, 12, 22, 14};
		    int[] list2 = {46, 25, 19, 7, 4, 1};
		    int score = 0;
		    // Part A.
		    if (max(array)==25) score+=5;
		    // Part B.
		    if (!isDescending(list1)) score+=5;
		    if (isDescending(list2)) score+=5;
		    System.out.println(score); // 15 points is a good start
		    
		 }
	 
	 public static int max(int[] inputArray) {
		 if (inputArray.length == 1) {
			 return(inputArray[0]);
		 }
		 
		 int intMax = 0;
		 
		 for (int i = 0; i < inputArray.length; i++) {
			 intMax = Math.max(intMax, inputArray[i]);
		 }
		 
		 return(intMax);
	 }
	 
	 public static boolean isDescending(int[] inputArray) {
		 if (inputArray.length ==1) {
			 return(true);
		 }
		 
			for(int i = 0; i < inputArray.length - 1; i++) {
				if (inputArray[i] < inputArray[i + 1]) {
					return false;
				}
			}
			
			return true;
	 }
}
