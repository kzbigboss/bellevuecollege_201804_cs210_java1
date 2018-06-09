
public class MidTermPrep {
	public static void main(String[] args) {
		System.out.println(1234 % 10);
		
	}
	
	public static void ifElseMystery(int a, int b) {
		if ( b < a ) {
			b += a + 9;
		} else {
			a += b + 9;
		}
		
		System.out.println(a + " " + b);
	}
}
