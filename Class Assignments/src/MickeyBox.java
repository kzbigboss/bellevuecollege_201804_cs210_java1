import java.awt.*;

public class MickeyBox {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220,150);
		panel.setBackground(Color.YELLOW);
		
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.BLUE);
		
		g.fillOval(50,25,40,40);
		
		g.fillOval(50+80,25,40,40);
		
		g.setColor(Color.RED);
		
		g.fillRect(50+20, 25+20, 80, 80);
		
		g.setColor(Color.BLACK);
		
		g.drawLine(50+20, 45+40, 50+20+80, 45+40);

	}

}
