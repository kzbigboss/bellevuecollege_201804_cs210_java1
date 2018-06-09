
public class DateClient {

	public static void main(String[] args) {
		
		Date start_date = new Date(1582,10,15);
		Date end_date = new Date(2016,1,28);
		
		Date one = new Date(1582,10,15);
		Date two = new Date(2016,1,28);
		//Date two = new Date(1582,10,15);;
		
		start_date.addDays(1);
		start_date.addWeeks(10);
		
		one.addDays(1);
		one.addWeeks(10);
		
		System.out.println();
		System.out.println(end_date.daysTo(start_date));
		
		System.out.println(Date.daysTo(two, one));
		

	}

}
