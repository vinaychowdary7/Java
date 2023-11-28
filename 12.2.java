import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Ex12_2 implements ActionListener
{
    JFrame f;
    JLabel status;
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JButton bt;
    Ex12_2()
    {
        f=new JFrame();
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        status=new JLabel("started");
        status.setBounds(150,150,100,50);
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bt=new JButton("click");
        bt.addActionListener(this);
        f.setSize(200,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.add(status);
        f.add(rb1);
        f.add(rb2);
        f.add(bt);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(rb1.isSelected())
        {
        status.setText("Selected is male");
        JOptionPane.showMessageDialog(null,"Selected is male");
        }
        if(rb2.isSelected())
        {
            status.setText("selected is female");
            JOptionPane.showMessageDialog(null,"Selected is female");
        }
}
public static void main(String args[])
{
    Ex12_2 j=new Ex12_2();
}
}