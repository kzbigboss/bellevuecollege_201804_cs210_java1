/*
 * Mark Kazzaz
 * 2018-06-08
 * Bellevue College, CS210
 * Programming Assignment #4
 */

public class Date {
	
	// declare fields
	private int year;
	private int month;
	private int day;
	
	// constructors
	
	//// default constructor
	public Date() {
		this(1970,1,1);
	}
	
	//// specific constructor
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		this.validateDate();
	}
	
	// accessors
	
	//// default string output
	public String toString() {
		String strYear = String.valueOf(year);
		String strMonth;
		String strDay;
			
		if (String.valueOf(month).length() == 1) {
			strMonth = "0" + String.valueOf(month);
		} else {
			strMonth = String.valueOf(month);
		}
		
		if (String.valueOf(day).length() == 1) {
			strDay = "0" + String.valueOf(day);
		} else {
			strDay = String.valueOf(day);
		}
		
		return strYear + "/" + strMonth + "/" + strDay;

	}
	//// long string output
	public String longDate() {
		String monthName = "";
		
		if (this.month == 1) {
			monthName = "January";
		} else if (this.month == 2) {
			monthName = "February";
		} else if (this.month == 3) {
			monthName = "March";
		} else if (this.month == 4) {
			monthName = "April";
		} else if (this.month == 5) {
			monthName = "May";
		} else if (this.month == 6) {
			monthName = "June";
		} else if (this.month == 7) {
			monthName = "July";
		} else if (this.month == 8) {
			monthName = "August";
		} else if (this.month == 9) {
			monthName = "September";
		} else if (this.month == 10) {
			monthName = "October";
		} else if (this.month == 11) {
			monthName = "November";
		} else {
			monthName = "December";
		}
		
		return monthName + " " + this.day + ", " + this.year;
	}
	
	//// return whether or not year is a leap year
	public boolean isLeapYear() {
		
		// logic derived from:
		// https://support.microsoft.com/en-us/help/214019/method-to-determine-whether-a-year-is-a-leap-year
		
		if (year % 4 != 0) {					// is year divisible by 4? no = not leap year
			return false;
			} else if (year % 400 == 0) {		// is year divisible by 400? yes = leap year
				return true;
			} else if (year % 100 == 0) {		// is year divisible by 100? yes = not leap year
				return false;
			} else {							// nothing tripped? it's a leap year.
				return true;
			}
	}
	
	//// return how many days are in the current month
	public int getDaysInMonth() {
		
		if (this.month == 2 && this.isLeapYear()) {		// if feb & leap year, 29
			return 29;
		} else if (this.month == 2) {					// if feb & !leap year, 28
			return 28;
		} else if (	month == 1 || month == 3 || 		// if month with 31, 31
					month == 5 || month == 7 || 
					month == 8 || month == 10 || 
					month == 12) {
			return 31;
		} else {										// else, 30
			return 30;
		}
	}
	
	//// return the year of the date
	public int getYear() {
		return this.year;
	}
	
	//// return the month of the date
	public int getMonth() {
		return this.month;
	}
	
	//// return the day of the date
	public int getDay() {
		return this.day;
	}
	
	//// return next month of the date
	public int getNextMonth() {
		if (this.month == 12) {
			return 1;
		} else {
			return this.month + 1;
		}
	}
	
	//// return prior month of the date
	public int getPriorMonth() {
		if (this.month == 1) {
			return 12;
		} else {
			return this.month - 1;
		}
	}
	
	//// turn the date into a number to help
	//// compare two dates
	public int getDateNumber() {
		return (year * 1000) + (month * 100) + (day);
	}
	
	//// count days between dates leveraging static method
	public int daysTo(Date other) {
		Date start_date = new Date(this.year, this.month, this.day);
		Date end_date = other;
		
		return daysTo(start_date, end_date);
	}
	
	//// count days between dates
	public static int daysTo(Date start_date, Date end_date) {
		
		// if the same date is passed, return zero
		if (start_date.toString().equals(end_date.toString())) {
			return 0;
		}
		
		// convert the dates to numbers so we can determine
		// which one is larger than the other
		int startDateNum = start_date.getDateNumber();
		int endDateNum = end_date.getDateNumber();
		
		// figure out whether we need to move the date up or down
		int adjuster = 0;
		if (startDateNum < endDateNum) {
			adjuster = 1;
		} else {
			adjuster = -1;
		}
		
		// create a counter
		int counter = 0;
		
		while(!start_date.toString().equals(end_date.toString())) {
			start_date.addDays(adjuster);
			startDateNum = start_date.getDateNumber();
			counter += adjuster;
			
		}
		
		return counter;
	}
	
//	public int daysTo(Date other) {
//		int start_date = this.getDateNumber();
//		int end_date = this.getDateNumber();
//	}
	
	// mutators
	
	//// validate the date is correct
	
	public void validateDate() {
		// throw error if day > days in month
		if (this.day > this.getDaysInMonth()) {
			throw new IllegalArgumentException("day exceeds days in month");
		}
		
		// throw error if day is less than 1
		if (this.day < 1) {
			throw new IllegalArgumentException("day less than one");
		}
		
		// throw error if month greater than 12
		if (this.month > 12) {
			throw new IllegalArgumentException("month exceeds tweleve");
		}
		
		// throw error if month is less than 1
		if (this.month < 1) {
			throw new IllegalArgumentException("month less than one");
		}
		
		// throw error if year is less than 1
		if (this.year < 1) {
			throw new IllegalArgumentException("year less than one");	
		}
		
	}
	
	//// modify the year, validate result
	public void setYear(int year) {
		this.year = year;
		this.validateDate();
	}
	
	//// modify the month, validate result
	public void setMonth(int month) {
		this.month = month;
		this.validateDate();
	}
	
	//// modify the day, validate result
	public void setDay(int day) {
		this.day = day;
		this.validateDate();
	}
	
	//// change the date by n number of days
	public void addDays(int days) {
		
		// if the user passes in zero, don't do anything
		if (days == 0) {
			return;
		}
		
		// move the date up or down based on the direction of the addDays parameter
		if (days > 0) {
			this.moveDateForward(days);
		} else {
			this.moveDateBackward(days);
		}
		
	}
	
	//// change the date by n number of weeks
	public void addWeeks(int weeks) {
		
		// transform weeks into days then spin
		// through addDays() method
		int days = 0;
		days = weeks * 7;
		
		addDays(days);
	}
	
	public void moveDateForward(int days) {
		
		// loop until we consume all days from the input parameter
		while (days != 0) {
			
			// figure out the month end of the current month
			int monthend = 0;
			monthend = this.getDaysInMonth();
			
			// move to the first of the next month if the days added
			// exceeds the month end of the current month
			if(this.day + days <= monthend) {
				// change doesn't cross months, just add it
				this.day += days;
				days = 0;
			} else {
				// change crossed months;
				// reloop after moving to the start of the next month
				
				int daysConsumed = monthend - this.day + 1;		// record days forward we just moved
				days -= daysConsumed;							// reduce days by consumption
				
				if (this.month == 12) {							// roll year foward if Dec
					this.year +=1;
				}
				
				this.month = this.getNextMonth();				// set to next month
				
				this.day = 1;									// set to 1st of the month
				
			}
		}
		
		// validate date
		this.validateDate();
	}
	
	public void moveDateBackward(int days) {
		
		// loop until we consume all days from the input parameter
		while (days != 0) {
			
			// move to the last day of the prior month if the days subtracted
			// are less than 1
			if(1 <= this.day + days) {
				// change doesn't cross months, just add it
				this.day += days;
				days = 0;
			} else {
				// change will cross months
				// reloop from the end of the prior month
				
				int daysConsumed = this.day; 			// calc how many days we just consumed
				days += daysConsumed; 					// reduce days by consumed days
				
				if (this.month == 1) { 					// if it's currently Jan, roll back the year
					this.year -=1;
				}
				
				this.month = this.getPriorMonth(); 		// roll back one month
				this.day = this.getDaysInMonth(); 		// roll back to end of month
				
			}
		}
		
		// validate date
		this.validateDate();
	}
}
