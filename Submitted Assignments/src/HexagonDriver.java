
public class HexagonDriver {
	
	public static void main(String argsp[]) {
		 // Client tests the Class we've made
		Hexagon h1 = new Hexagon(new Point(82,92),10);
		h1.setSide(60);
		System.out.println(h1.area());  // returns 6495.19
		System.out.println(h1.perimeter());   // returns 300.0
	}

}
