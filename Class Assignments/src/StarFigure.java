
public class StarFigure {
	public static void main(String[] args) {
		exercise_20();
	}
	
	public static void exercise_20() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i) * 4; j++) {
				System.out.print("/");
			}
			
			for (int l = 1; l <= (i - 1) * 8; l++) {
				System.out.print("*");
			}
			
			for (int k = 1; k <= (5 - i) * 4; k++) {
				System.out.print("\\");
			}
			System.out.println();
		}

	}
}
