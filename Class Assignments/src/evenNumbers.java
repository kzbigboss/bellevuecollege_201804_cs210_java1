import java.io.*;
import java.util.*;


public class evenNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("numbers.txt"));
		evenNumbers2(input);

	}
	
	public static void evenNumbers2(Scanner input) {
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

}
