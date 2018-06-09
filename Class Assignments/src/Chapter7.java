import java.util.Arrays;

public class Chapter7 {

	public static void main(String[] args) {
		
		int[] intArray = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
		System.out.println(longestSortedSequence(intArray));
		
	}
	
	public static int lastIndexOf(int[] intArray, int intTarget) {
		
		for (int i = intArray.length - 1; i >= 0; i--) {
			if (intArray[i] == intTarget) {
				return i;
			}
		}
		return -1;
	}
	
	public static int range(int[] intArray) {
		int minNum = intArray[0];
		int maxNum = intArray[0];
		
		for (int i = 0; i < intArray.length; i++) {
			minNum = Math.min(minNum, intArray[i]);
			maxNum = Math.max(maxNum, intArray[i]);
			System.out.println("Max: " + maxNum + " Min: " + minNum);
		}
		
		return(maxNum - minNum + 1);
	}
	
	public static int countInRange(int[] intArray, int rangeStart, int rangeEnd) {
		int result = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] >= rangeStart && intArray[i] <= rangeEnd) {
				result += 1;
			}
		}
		
		return(result);
	}
	
	public static boolean isSorted(double[] dblArray) {
		
		if (dblArray.length == 1) {
			return true;
			}
		
		for(int i = 0; i < dblArray.length - 1; i++) {
			if (dblArray[i] > dblArray[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int mode(int[] inputArray) {
		int[] captureArray = new int[101];
		int largestIndex = 0;
		int result = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			captureArray[inputArray[i]] += 1;
		}
		
		for (int i = 0; i < captureArray.length; i++) {
			largestIndex = Math.max(largestIndex, captureArray[i]);
		}
		
		for (int i = 0; i < captureArray.length; i++) {
			if(captureArray[i] == largestIndex) {
				return i;
			}
		}
		
		return result;
		
	}
	
	public static double stdev(int[] inputArray) {
		
		// set up variables
		int intRunningTotal = 0;
		double dblAverage = 0.0;
		double dblResult = 0.0;
		
		// loop through array to find average
		for (int i = 0; i < inputArray.length; i++) {
			intRunningTotal += inputArray[i];
		}
		
		dblAverage = (double) intRunningTotal / inputArray.length;
		
		// loop through again and sum the delta squared
		for (int i = 0; i < inputArray.length; i++) {
			dblResult += Math.pow(inputArray[i] - dblAverage, 2);
		}
		
		return(Math.sqrt(dblResult / (inputArray.length - 1)));
	}
	
	public static int median(int[] inputArray) {
		Arrays.sort(inputArray);
		
		return(inputArray[ ( (int) Math.ceil( (double) inputArray.length / 2) ) - 1]);
	}
	
	public static int longestSortedSequence(int[] inputArray) {
		
		int countIncreasing = 0;
		
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] <= inputArray[i+1]) {
				countIncreasing += 1;
			}
		}
		
		return(countIncreasing);
	}
	
}