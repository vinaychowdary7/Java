import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Movement implements MouseMotionListener
{
    JFrame f;
    JLabel status;
    Movement()
    {
        f=new JFrame();
        status=new JLabel("started");
        f.setLayout(new FlowLayout());
        f.add(status);
        f.addMouseMotionListener(this);
        f.setSize(500,500);
        f.setVisible(true);

    }
    public void mouseDragged(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        status.setText("moved at"+x+","+y);
    }
    public void mouseMoved(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        status.setText("moved at"+x+","+y);
    }
    public static void main(String args[])
    {
        Movement obj=new Movement();
    }
}

