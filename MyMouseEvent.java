import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class MyMouseEvent extends JFrame implements MouseListener
{

    JLabel l;
    MyMouseEvent()
    {
        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);

        l= new JLabel("start");
        add(l);


    }

    public void mouseClicked(MouseEvent me)
    {
        l.setText("mouseClicked");
    }
    public void mouseEntered(MouseEvent me)
    {
        l.setText("mouseEntered");
    }
    public void mouseExited(MouseEvent me)
    {
        l.setText("mouseExited");
    }
    public void mousePressed(MouseEvent me)
    {
        l.setText("mousePressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        l.setText("mouseReleased");
    }
    public static void main(String args[])
    {
        new MyMouseEvent();
    }

}