import java.awt.*;

public class Face2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();
        
        int x = 10;
        int y = 30;
        
        for (int i = 0; i < 5; i++) {
        	drawFace(g, x, y);
        	x += 100;
        }
    }
    
    public static void drawFace(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100);   // face outline

        g.setColor(Color.BLUE);
        
        // eyes
        g.fillOval(x + 20, y + 30, 20, 20);
        g.fillOval(x + 60, y + 30, 20, 20);

        // mouth
        g.setColor(Color.RED);
        //g.drawLine(40, 100, 80, 100);
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
}