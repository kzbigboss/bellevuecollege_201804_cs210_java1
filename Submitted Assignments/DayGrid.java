/*
 * Mark Kazzaz
 * 2018-05-15
 * Bellevue College, CS210
 * Programming Assignment #2
 */

import java.util.*;
import java.awt.*;

public class DayGrid {

	public static void main(String[] args) {
		
		int month = 8;
		int year = 2017;
		
    	DrawingPanel panel = new DrawingPanel(400, 200);
    	Graphics g = panel.getGraphics();
		
		showGrid(g, month, year);

	}
	
	public static void showGrid(Graphics g, int month, int year) {
		
		// validate inputs
		validateInputs(month, year);
		
		// create calendar object
		GregorianCalendar inputDate = new GregorianCalendar(year,month-1,1);
		
		// figure out which day of the week the month starts on
		int firstDayOfMonth = firstDayOfMonth(inputDate);
		
		// figure out how many blank days at start of calendar
		int blankDaysStart = firstDayOfMonth - 1;
		
		// figure out how many days exist in the month
		int numDaysInMonth = daysInMonth(inputDate);
		
		// figure out how many weeks to print
		int weeksToPrint = ((blankDaysStart + numDaysInMonth) / 7) +
				( (blankDaysStart + numDaysInMonth) % 7 == 0 ? 0 : 1  );

		// figure out total blocks to print
		int totalBlocks = weeksToPrint * 7;
		
		// draw
		
		int box_width = 50;
		int box_height = 20;
		
		int printCounter = 0;
		int numDayCounter = 1;
		
		String printValue = "";
		
		printTitleRow(g);
		
		for (int i = 0; i < weeksToPrint; i++) {
			for (int j = 0; j < 7; j++) {
				if(j % 2 == 0) {
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(j * box_width, 20 + i * 20, box_width, box_height);
					g.setColor(Color.BLACK);
					g.drawRect(j * box_width, 20 + i * 20, box_width, box_height);
				} else {
					g.setColor(Color.BLACK);
					g.drawRect(j * box_width, 20 + i * 20, box_width, box_height);
				}
				
				g.setColor(Color.BLACK);
				
				if (printCounter < blankDaysStart) {
					printValue = "";
				} else if (numDayCounter <= numDaysInMonth) {
					printValue = Integer.toString(numDayCounter);
					numDayCounter += 1;
				} else {
					printValue = "";
				}
				printCounter += 1;
				
				g.drawString(printValue, j * box_width + 19, 20 + i * 20 + 15);
			}
		}
		

		
//		printTitleRow();
//		printBorderRow();
//		printDateRows(firstDayOfMonth, numDaysInMonth);
//		printBorderRow();
		
		
	}
	
	public static int daysInMonth(GregorianCalendar inputDate) {
		return(inputDate.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
	public static int firstDayOfMonth(GregorianCalendar inputDate) {
		return(inputDate.get(Calendar.DAY_OF_WEEK));
	}
	
	public static void printTitleRow(Graphics g) {
		g.drawString("Sun", 15 + 50 * 0, 18);
		g.drawString("Mon", 15 + 50 * 1, 18);
		g.drawString("Tue", 15 + 50 * 2, 18);
		g.drawString("Wed", 15 + 50 * 3, 18);
		g.drawString("Thu", 15 + 50 * 4, 18);
		g.drawString("Fri", 15 + 50 * 5, 18);
		g.drawString("Sat", 15 + 50 * 6, 18);
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
