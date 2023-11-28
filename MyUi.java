import javax.swing.*;
import java.awt.*;
class MyUi extends JFrame
{
    JButton bt1,bt2,bt3,bt4,bt5;
    MyUi()
    {
        bt1 = new JButton("One");
        //bt1.setBounds(10,40,100,20);
        bt2 = new JButton("Two");
        //bt2.setBounds(10,60,100,20);

        bt3 = new JButton("Three");
        //bt3.setBounds(10,80,100,20);

        bt4 = new JButton("Four");
        //bt4.setBounds(10,100,100,20);

        bt5 = new JButton("Five");
        //bt5.setBounds(10,120,100,20);


        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));

        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        //add(bt5);

    }


    public static void main(String args[])
    {
        new MyUi();
    }
}