
package progressbar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rect extends JPanel
{
    private float v;
    private int w , h;
    public Rect(int value , int width , int height) 
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
        Color c = new Color(0, 178, 148);
        float val = v / 100 * w;
        g.setColor(c);
        g.drawRect(0, 0,w*2, h);
        if(v < 100)
        {
            g.fillRect(0, 0,(int)val*2, h);
            g.setColor(Color.BLACK);
            g.drawString(v + " %", w, h / 2);
        }
        else
        {
            g.fillRect(0, 0,w*2, h);
            g.setColor(Color.BLACK);
            g.drawString("100 % Complet", w, h / 2);
        }
       
    }
    
    
    
}
