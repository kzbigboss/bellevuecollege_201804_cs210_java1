// Self-Check  2-4, 9, 11, 21-30, 32
// Exercises 3 through 8, and 20, 21


public class Chapter2 {

	public static void main(String[] args) {
		//selfcheck_2();
		//selfcheck_3();
		//selfcheck_4();
		//selfcheck_9();
		//selfcheck_21();
		//selfcheck_22();
		//selfcheck_23();
		//selfcheck_24();
		//selfcheck_32();
		//exercise_3();
		//exercise_4();
		//exercise_5();
		//exercise_6();
		//exercise_7();
		//exercise_8();
		exercise_20();
	}
	
	public static void selfcheck_2() {
		// 1 + 2 * 3 + 7 * 2 % 5
		// 1 + 6     + 14    % 5
		// 1 + 6     + 4
		// 11
		//System.out.print((1 + 2 * 3 + 7 * 2 % 5) == 11);
	}
	
	public static void selfcheck_3() {
		// a) 2 + 3 * 4 - 6 ; 8
		// b) 14 / 7 * 2 + 30 / 5 + 1 =  4 + 6 + 1 = 11 
		// c) (12 + 3) / 4 * 2 = 15 / 4 * 2 = 3 * 2 = 6 
		// d) (238 % 10 + 3) % 7 = (8 + 3) % 7 = 26 % 7 = 4
		// e) (18 - 7) * (43 % 10) = 11 * 3 = 33
		// f) 2 + 19 % 5 - (11 * (5 / 2)) = 2 + 4 - 22 = -16
		// g) 813 % 100 / 3 + 2.4 = 13 / 3 + 2.4 = 4 + 2.4 = 6.4
		// h) 26 % 10 % 4 * 3 = 6 % 4 * 3 = 2 * 3 = 6
		// i) 22 + 4 * 2 = 30
		// j) 23 % 8 % 3 = 3 % 2 = 1
		// k) 12 - 2 - 3 = 7
		// l) 6 / 2 + 7 / 3 = 3 + 2 = 5
		// m) 6 * 7 % 4 = 42 % 4 = 2
		// n) 3 * 4 + 2 * 3 = 12 + 6 = 18
		// o) 177 % 100 % 10 / 2 = 77 % 10 / 2 = 7 / 2 = 3
		// p) 89 % (5 + 5) % 5 = 89 % 10 % 5 = 9 % 5 = 4
		// q) 392 / 10 % 10 / 2 = 39 % 10 / 2 = 9 / 2 = 4
		// r) 8 * 2 - 7 / 4 = 16 - 1 = 15
		// s) 37 % 20 % 3 * 4 = 17 % 3 * 4 = 2 * 4 = 8
		// t) 17 % 10 / 4 = 7 / 4 = 1
		
		System.out.print(

				17 % 10 / 4
				
				);
	}
	
	public static void selfcheck_4() {
		// a) 	4.0 / 2 * 9 / 2
		//		2.0 * 9 / 2
		//		18.0 / 2
		//		9.0
		
		// b)	2.5 * 2 + 8 / 5.0 + 10 / 3
		//		5.0     + 1.6     + 3
		//		9.6
		
		// c)	12 / 7 * 4.4 * 2 / 4
		//		1      * 4.4 * 2 / 4
		//		         4.4 * 2 / 4
		//                   8.8 / 4
		//                       2.2
		
		// d)	4 * 3 / 8 + 2.5 * 2
		//		   12 / 8 + 5.0
		//			    1 + 5.0
		//				6.0
		
		// e) 	(5 * 7.0 / 2 - 2.5) / 5 * 2
		//		(35.0 / 2 - 2.5) / 5 * 2
		//		(17.5 - 2.5) /5 * 2
		//		(15.0) / 5 * 2
		//		3.0 * 2
		//		6.0
		
		// f)	41 % 7 * 3 / 5 + 5 / 2 * 2.5
		//		6	   * 3 / 5 +     2 * 2.5
		//		        18 / 5 +         5.0
		//                   3 + 5.0
		//                   8.0
				
		// g) 	10.0 / 2 / 4
		//		5.0 / 4
		//		1.25
		
		// h)	8 / 5 + 13 / 2 / 3.0
		//		1     + 6      / 3.0
		//      1     + 2.0
		//      3.0
		
		// i)	(2.5 + 3.5) / 2
		//		6.0 / 2
		//		3.0
		
		// j)	9 / 4 * 2.0 - 5 / 4
		//		    2 * 2.0 - 1
		//          4.0 - 1
		//          3.0
		
		// k)	9 / 2.0 + 7 / 3 - 3.0 / 2
		//		    4.5 + 2     - 1.5
		//			5.0
		
		// l)	813 % 100 / 3 + 2.4
		//		       13 / 3 + 2.4
		//		            4 + 2.4
		//                      6.4
		
		// m) 	27 / 2 / 2.0 * (4.3 + 1.7) - 8 / 3
		//		    13 / 2.0 * (6.0) - 2
		//               6.5 * 6.0 - 2
		//              39.0 - 2
		//              37.0
		
		// n)	53 / 5 / (0.6 + 1.4) / 2 + 13 / 2
		//		    10 / (2.)        / 2 + 6
		//          5.0 / 2 + 6
		//          2.5 + 6
		//          8.5
		
		// o)	2 * 3 / 4 * 2 / 4.0 + 4.5 - 1
		//		6     / 4 * 2 / 4.0 + 4.5 - 1
		//              1 * 2 / 4.0 + 4.5 - 1
		//                  2 / 4.0 + 4.5 - 1
		//                      0.5 + 4.5 - 1
		//                      4.0
		
		// p)	89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2
		//		9       / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2
		//                2 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2
		//                    4.0 / 5 + (1.5 + 1.0 / 2) * 2
		//                        0.8 + (1.5 + 0.5) * 2
		//						  0.8 + (2.0) * 2
		//		0.8 + 4.0
		//		4.8
		
		
		
		System.out.print(

				89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2
				
				);
	}
	
	public static void selfcheck_9() {
		int number = 4213;
		System.out.print(number % 1000 / 100);
	}
	
	public static void selfcheck_21() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("2 times " + i + " = " + (i * 2));
		}
	}
	
	public static void selfcheck_22() {
		for (int count = 1; count <= 6; count++) {
			System.out.println(
					
					count * -10 + 40
					
					);
		}
	}
	
	public static void selfcheck_23() {
		for (int i = 1; i <= 6; i++) {
			System.out.println( i * 18 - 22	);
		}
	}
	
	public static void selfcheck_24() {
	int number = 4;
	for (int count = 1; count <= number; count++) {
		System.out.println(number);
		number = number / 2;
	}
	}

	public static void selfcheck_25() {
		// via math table
	}
	
	public static void selfcheck_26() {
		// on web, solve printed loop output
	}
	
	public static void selfcheck_27() {
		// trick question: for loop had no brackets.
		// only immediate command is impacted by loop.
	}
	
	public static void selfcheck_28() {
		// count down loop
	}
	
	public static void selfcheck_29() {
		// nested loop with multiplication
	}
	
	public static void selfcheck_30() {
		// ascii art
	}
	
	public static void selfcheck_32() {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 4; k++) {
					System.out.print("*");
				}
			}
			System.out.print("!");
			System.out.println();
		}
	}
	
	public static void exercise_3() {
		int first_num = 1;
		int second_num = 1;
		int work_num = 0;
		System.out.print(first_num + " ");
		System.out.print(second_num + " ");
		for (int i = 1; i <= 10; i++) {
			work_num = first_num + second_num;
			System.out.print(work_num + " ");
			first_num = second_num;
			second_num = work_num;
		}
	}
	
	public static void exercise_4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void exercise_5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void exercise_6() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void exercise_7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
	
	public static void exercise_8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
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