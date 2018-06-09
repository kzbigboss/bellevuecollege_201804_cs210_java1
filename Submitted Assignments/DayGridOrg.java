/*
 * Mark Kazzaz
 * 2018-05-02
 * Bellevue College, CS210
 * Programming Assignment #1
 */

import java.util.*;

public class DayGridOrg {

	public static void main(String[] args) {
		
		showGrid(12,2018);

	}
	
	public static void showGrid(int month, int year) {
		
		// validate inputs
		validateInputs(month, year);
		
		// create calendar object
		GregorianCalendar inputDate = new GregorianCalendar(year,month-1,1);
		
		// figure out which day of the week the month starts on
		int firstDayOfMonth = firstDayOfMonth(inputDate);
		System.out.println(firstDayOfMonth);
		
		// figure out how many days exist in the month
		int numDaysInMonth = daysInMonth(inputDate);
		System.out.println(numDaysInMonth);
		
		int weeksToPrint = (((firstDayOfMonth - 1) + numDaysInMonth) / 7) +
				( ((firstDayOfMonth - 1) + numDaysInMonth) % 7 == 0 ? 0 : 1  );
		System.out.println(weeksToPrint);
		
		printTitleRow();
		printBorderRow();
		printDateRows(firstDayOfMonth, numDaysInMonth);
		printBorderRow();
		
		
	}
	
	public static int daysInMonth(GregorianCalendar inputDate) {
		return(inputDate.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
	public static int firstDayOfMonth(GregorianCalendar inputDate) {
		return(inputDate.get(Calendar.DAY_OF_WEEK));
	}
	
	public static void printTitleRow() {
		// wasn't sure how to center text across a block, hacked it instead
		System.out.print("  Sun  ");
		System.out.print("  Mon  ");
		System.out.print("  Tue  ");
		System.out.print("  Wed  ");
		System.out.print("  Thu  ");
		System.out.print("  Fri  ");
		System.out.println("  Sat  ");
	}
	
	public static void printBorderRow() {
		System.out.print("+");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("-");
			}
			System.out.print("+");
		}
		System.out.print("\n");
	}
	
	public static void printDateRows(int firstDayOfMonth, int numDaysInMonth) {
		// loop through the first week, figure out where the week starts
		// once you know where the week starts, keep printing the label for each day until EOW
		// every seven results, move down a line
		// stop when printing when label == days in month
		// finish off the week with empties after done printing dates
		
		int dayOfWeekCounter = 1;
		int datePrinted = 0;
		
		for (int i = 1; i < numDaysInMonth + firstDayOfMonth + 1 ; i++) {
			
			// print start of row if it's the first day of the week
			if (dayOfWeekCounter == 1) {
				System.out.print("|");
			}

			// logic to figure out what to print	
			if (i < firstDayOfMonth) { // blank spaces until month starts
				dayOfWeekCounter += 1;
				printEmptyCell(1);
			
			} else if (dayOfWeekCounter == 7) { // last day of week, print date then start new row
				printDateCell(i - firstDayOfMonth + 1);
				System.out.print("\n");
				dayOfWeekCounter = 1;
				datePrinted += 1;
				
			} else if (datePrinted == numDaysInMonth) { 	// if we've printed everything, 
				printEmptyCell(7 - dayOfWeekCounter + 1);   // finish the week with empties
			
			} else { // either past start or not last day of week, print date
			printDateCell(i - firstDayOfMonth + 1);
			dayOfWeekCounter += 1;
			datePrinted += 1;
		}
			}
		
		System.out.print("\n");
	}
	
	public static void printEmptyCell(int times) {
		for (int i = 0; i < times; i++) {
			System.out.print("      |");
		}
	}
	
	public static void printDateCell(int dateValue) {
		System.out.printf("  %2d  |", dateValue);
	}
	
	public static void validateInputs(int month, int year) {
		boolean errorMonth = false;
		boolean errorYear = false;
		
		if (month < 1 || month > 12) {
			errorMonth = true;
		}
		
		if (year < 1900 || year > 2100) {
			errorYear = true;
		}
		
		if(errorMonth && errorYear) {
			throw new IllegalArgumentException("Invalid month ("+month+") and year ("+year+") entered");
		} else if (errorMonth) {
			throw new IllegalArgumentException("Invalid month ("+month+") entered");
		} else if (errorYear) {
			throw new IllegalArgumentException("Invalid year ("+year+") entered");
		}
	}
}
