import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyUiGB extends Frame implements ActionListener
{
    Button bt1,bt2,bt3,bt4,bt5;
    CardLayout cl;
    MyUiGB()
    {
        bt1 = new Button("One");
        //bt1.setBounds(10,40,100,20);
        bt2 = new Button("Two");
        //bt2.setBounds(10,60,100,20);
        bt3 = new Button("Three");
        //bt3.setBounds(10,80,100,20);
        bt4 = new Button("Four");
        //bt4.setBounds(10,100,100,20);
        bt5 = new Button("Five");
        //bt5.setBounds(10,120,100,20);


        setSize(300,300);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //GridBagLayout gbl = new GridBagLayout();
        //GridBagConstraints gbs = new GridBagConstraints();
        cl = new CardLayout();
        setLayout(cl);
        add(bt1);
        add(bt2);
        add(bt3);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);



       
        //add(bt4);
        //add(bt5);

    }
    public void actionPerformed(ActionEvent e)
    {
        cl.next(this);
    }


    public static void main(String args[])
    {
        new MyUiGB();
    }
}