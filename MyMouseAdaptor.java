import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class MyMouseAdaptor extends MouseAdapter
{

    JLabel l;
    JFrame f;
    MyMouseAdaptor()
    {
        f = new JFrame("Adaptor Example");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);

        l= new JLabel("start");
        f.add(l);


    }
    public void mouseClicked(MouseEvent ev)
    {
        l.setText("Mouse CLicked");
    }

   
    public static void main(String args[])
    {
        new MyMouseAdaptor();
    }

}