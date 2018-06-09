// CS210 Quiz, your name: Mark Kazzaz
import java.awt.*;
public class Chapter3G {
     public static void main(String[] args) {
          showOrbital(600, 200);
     }
     
     public static void showOrbital(int x, int y) {
    	 
 		// create panel, set red
    	DrawingPanel panel = new DrawingPanel(x, y);
 		panel.setBackground(Color.RED);
        
 		Graphics g = panel.getGraphics();
 		
 		// loop to draw circles

 		
 		for (int i = 1; i <= 4; i++) {
 			 			
			// alternate colors between black and white
 			if (i % 2 == 0) {
				g.setColor(Color.WHITE);
 			} else {
				g.setColor(Color.BLACK);
 			}
 			
 			g.fillOval (20 + (x / 12) * i, 20 + (y / 12) * i, x - 20 - (x / 12) * 2 * i, y - 20 - (y / 12) * 2 * i);

 		}
 		

 		
     }
// required method follows...
}