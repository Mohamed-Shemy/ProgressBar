
package progressbar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Main extends JFrame
{
    private JButton btn;
    private JPanel content;
    private JPanel rect;
    private JPanel ovel;
    private int count  = 1;
    public Main() 
    {
        setLayout(new BorderLayout());
        btn = new JButton("Set");
        content = new JPanel(new GridLayout(3, 1));
        content.setBorder(new TitledBorder("Rect"));
        setSize(500  ,500);
        btn.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                content.removeAll();
               //content.add(new Rect(count, 500 / 2 - 20, 500 / 12));
               //content.add(new Circle(count, 500 / 2 - 20, 500 / 2 - 20));
               //content.add(new MacBar());
              JPanel p = new JPanel();
              p = new Circle(count , 200 , 200);
                btn.setBackground(p.getBackground());
                content.add(p);
                System.out.println(count);
                count++;
                count %=100;
                setSize(getWidth() - 1, getHeight() - 1);
                setSize(getWidth() + 1, getHeight() + 1);
            }
        });
        add(btn , BorderLayout.NORTH);
        add(content);
    }
    
    public static void main(String[] args)
    {
        Main frame = new Main();
        frame.setTitle("Geometric Object");
        frame.setSize(500, 500);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
