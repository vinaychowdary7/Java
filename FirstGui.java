import java.awt.*;
import javax.swing.*;
class FirstGui 
{
   public static void main(String args[])
   {
        JFrame f= new JFrame();
        f.setTitle("First code");
        f.setSize(300,300);
        f.setVisible(true);
        JButton bt = new JButton("Click1");
        bt.setBounds(30,30,100,50);
        //JButton bt2 = new JButton("Click2");

        f.setLayout(null);
        f.add(bt);
        //f.add(bt2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
}