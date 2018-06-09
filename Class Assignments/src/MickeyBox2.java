import java.awt.*;

public class MickeyBox2 {

	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(450,150);
		
		panel.setBackground(Color.YELLOW);
		
		Graphics g = panel.getGraphics();
		
		drawFigure(g, 50, 25);
		drawFigure(g, 250, 45);

	}
	
	public static void drawFigure(Graphics g, int x, int y) {
		// draw circles
		g.setColor(Color.BLUE);
		g.fillOval(x,y,40,40);
		g.fillOval(x+ 80,y,40,40);
		
		// draw square
		g.setColor(Color.RED);
		g.fillRect(x + 20, y + 20, 80, 80);
		
		// draw line
		g.setColor(Color.BLACK);
		g.drawLine(x + 20, y + 20 + 40, x + 20 + 80, y + 20 + 40);
	}

}
