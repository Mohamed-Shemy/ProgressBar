
package progressbar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MacBar extends JPanel
{
    private float v;
    private int w , h;
    public MacBar() 
    {
       w = getWidth();
       h = getHeight();
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g); 
       w = 300;
       h = 50;
        g.drawRect(0, 0,w, h);
        int cc = 0;
        boolean b = false;
        for(int i = 0 ; i < h ; i++)
        {
            int co = (220 - i);
            g.setColor(new Color(co , co , co));
            g.fillRect(0, i, w, i);
        }
    }
}
