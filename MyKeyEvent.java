import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class MyKeyEvent extends JFrame implements KeyListener
{

    JLabel l;
    JTextArea ta;
    MyKeyEvent()
    {
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        ta = new JTextArea();
        l= new JLabel("start");
        l.setBounds(10, 10, 200, 80);
        add(l);
        ta.setBounds(10, 60, 200,100);
        add(ta);
        ta.addKeyListener(this);


    }
    public void keyPressed(KeyEvent ke)
    {
        //l.setText("keyPressed");

    }
    public void keyReleased(KeyEvent ke)
    {
        String mesg = ta.getText();
        String words[] = mesg.split ("\\s");    
        l.setText("Length : "+mesg.length()+"No of words:"+words.length);

    }
    public void keyTyped(KeyEvent ke)
    {
       // l.setText("keyTyped");

    }
    public static void main(String args[])
    {
        new MyKeyEvent();
    }



}