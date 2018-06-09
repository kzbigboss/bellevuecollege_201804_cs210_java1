import java.awt.*;

public class ShowDesign {

	public static void main(String[] args) {
		
		int x = 200;
		int y = 200;
		int s = 20;
		
		DrawingPanel panel = new DrawingPanel(200, 200);
        
		Graphics g = panel.getGraphics();
		
		g.drawRect(20, 20, 200-20-20, 200-20-20);
		
		while(s < 100) {
			g.drawRect(s, s, 200-(s*2), 200-(s*2));
			s += 20;
		}
		

	}

}
