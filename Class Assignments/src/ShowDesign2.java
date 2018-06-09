import java.awt.*;

public class ShowDesign2 {

	public static void main(String[] args) {
		
		showDesign(300, 100);
		
		//g.drawRect(20, 20, 200-20-20, 200-20-20);
		
		//while(s < 100) {
		//	g.drawRect(s, s, 200-(s*2), 200-(s*2));
		//	s += 20;
		}
	
	public static void showDesign(int x, int y) { 
		
		DrawingPanel panel = new DrawingPanel(x, y);
        
		Graphics g = panel.getGraphics();
		
		int xx = 0;
		int yy = 0;
		
		for (int i = 0; i < 4; i++) {
			xx += 30;
			yy += 10;
			g.drawRect(xx, yy, x - (xx * 2), y - (yy * 2));
		}
	}

}
