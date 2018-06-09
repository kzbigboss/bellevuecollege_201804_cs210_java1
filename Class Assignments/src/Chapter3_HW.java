// Round One: 	Exercises 2, 7, 11, 12, 17
// Round Two:	Exercises 9, 14, 16, 20

public class Chapter3_HW {
	public static void main(String[] args) {
		//printPowersOf2(3);
		//System.out.print(largestAbsVal(7, -2, -11));
		//System.out.print(distance(10, 2, 3, 5));
		//System.out.print(scientific(6.23, 5.0));
		//System.out.print(padString("blahrah", 8));
		//mystery(3,3,1);
		//System.out.print(min(19, 27, 6));
		blahrah();
		
		
	}
	
	public static void printPowersOf2(int range) {
		for (int i = 0; i <= range; i++) {
			int result = (int) Math.pow(2, i);
			System.out.print(result + " ");
		}
		
	}
	
	public static int largestAbsVal(int numOne, int numTwo, int numThree) {
		numOne = Math.abs(numOne);
		numTwo = Math.abs(numTwo);
		numThree = Math.abs(numThree);
		
		int numMax = Math.max(Math.max(numOne, numTwo), numThree);
		
		return(numMax);
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		
		double result = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		
		return(result);
		
	}
	
	public static double scientific(double numValue, double numBase10) {
		
		numBase10 = Math.pow(10, numBase10);
		
		double result = numValue * numBase10;
		
		return(result);
	}
	
	
	public static String padString(String strInput, int numPadding) {
		int strLength = strInput.length();
		
		int reqPadding = Math.max(numPadding - strLength, 0);
		
		String spacing = "";
		
		for (int i = 0; i < reqPadding; i++) {
			spacing = spacing + " ";
		}
		
		String result = spacing + strInput;
		
		return(result);
		
	}
	
	public static int mystery(int z, int x, int y) {
		z--;
		x = 2 * y + z;
		y = x - 1;
		System.out.println(y + " " + z);
		
		return(x);
	}
	
	public static int min(int x, int y, int z) {
		int min = Math.min(x, Math.min(y, z));
		return min;
	}
	
	public static void blahrah() {
//		String str1 = "Q.E.D.";
		String str2 = "Arcturan Megadonkey";
		String str3 = "Sirius Cybernetic Corporation";
		
		System.out.print(str2.toLowerCase().substring(9,13) + str3.substring(18, str3.length()-7));
	}
	
}


