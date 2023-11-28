import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class MyDialog {

    private static JDialog d;  
    MyDialog() {  
        JFrame f= new JFrame();  
        d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("OK");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                d.setVisible(false);
            }
        });  
        
        d.add( new JLabel ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new MyDialog();  
    }  
}  