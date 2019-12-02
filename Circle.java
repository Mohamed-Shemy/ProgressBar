
package progressbar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel
{
    private float v = 0;
    private int w = 0;
    private int h = 0;
    public Circle(int value , int width , int height) 
    {
        v = value;
        w = width;
        h = height;
        setSize(w, h);
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Color c = new Color(0, 120, 215);
        float val = v / 100 * 360;
        g.setColor(c);
        g.drawOval(0, 0, w, h);
        if(v < 100)
        {
            g.fillArc(0, 0, w, h, 0,(int) val);
            g.setColor(Color.BLACK);
            g.drawString(v + " %", w/2, h/2);
        }
        else
        {
            g.fillArc(0, 0, w, h, 0,360);
            g.setColor(Color.BLACK);
            g.drawString("100 % Complet", w/2, h/2);
        }
    }
    
    
}
