
public class StarFigure2 {
	public static void main(String[] args) {
		exercise_20();
	}
	
	public static final int SIZE = 6;
	
	public static void exercise_20() {
		for (int i = 1; i <= SIZE; i++) {
			for (int j = 1; j <= (SIZE - i) * 4; j++) {
				System.out.print("/");
			}
			
			for (int l = 1; l <= (i - 1) * 8; l++) {
				System.out.print("*");
			}
			
			for (int k = 1; k <= (SIZE - i) * 4; k++) {
				System.out.print("\\");
			}
			System.out.println();
		}

	}
}
