import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RadBut implements ActionListener
{
    JRadioButton rb1,rb2;
    JLabel status;
    public RadBut()
    {
        JFrame f=new JFrame("Radio buttons");
        status=new JLabel("status");
        
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        status.setBounds(150,150,100,50);
        JButton bt=new JButton("click me");
        bt.addActionListener(this);
        f.setSize(500,500);
        f.add(rb1);
        f.add(rb2);
        f.add(bt);
        f.add(status);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

    }
    public void actionPerformed(ActionEvent e)
    {
        if(rb1.isSelected())
        {
            status.setText("selected is male");
            JOptionPane.showMessageDialog(null,"selected is male");
        }
        if(rb2.isSelected())
        {
            status.setText("selected is Female");
            JOptionPane.showMessageDialog(null,"selected is Female");
        }
    }
    public static void main(String args[])
    {
        RadBut obj=new RadBut();
    } 

}