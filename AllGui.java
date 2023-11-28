import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class AllGui extends JFrame
{
    JLabel jl;
    JTextField jtf;
    JCheckBox jcb;
    JRadioButton jrb;
    JButton jb;
    JToggleButton jtb;
    JTextArea jta;
    JTabbedPane jtp;
    JPanel p1,p2,p3;
    JScrollPane jsp;
    JList jlist;
    JComboBox jcombo;
    JMenuBar jmb;
    JMenu main_m,sub_m;
    JMenuItem jmi1,jmi2,jmi3,jmi4;
    AllGui()
    {
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jl =  new JLabel("Message");
        jl.setBounds(20,20,100,20);
        jtf = new JTextField();
        jtf.setBounds(20,50,100,20);
        jcb = new JCheckBox("IT");
        jcb.setBounds(20,80,100,20);
        jrb = new JRadioButton("AIDS");
        jrb.setBounds(20,110,100,20);
        jb = new JButton("Click");
        jb.setBounds(20,140,100,20);
        jtb = new JToggleButton("ON/OFF");
        jtb.setBounds(20,170,100,20);

        jta = new JTextArea(100,100);
        p1= new JPanel();
        p1.add(jta);
        p2= new JPanel();
        p3= new JPanel();

        jtp = new JTabbedPane();
        jtp.setBounds(20,200,400,120);
        jtp.add("Main",p1);
        jtp.add("Edit",p2);
        jtp.add("Help",p3);

        jsp = new JScrollPane(p1);
        jsp.setBounds(20,330,400,120);

        String branch[]={"it","aids","cse"};
        jlist = new JList(branch);
        jlist.setBounds(20,460,400,50);

        jcombo = new JComboBox(branch);
        jcombo.setBounds(20,520,400,20);

        jmb = new JMenuBar();
        main_m = new JMenu("Main");
        sub_m = new JMenu("Edit");
        jmi1 = new JMenuItem("Item1");
        jmi2 = new JMenuItem("Item2");
        jmi3 = new JMenuItem("Item3");
        jmi4 = new JMenuItem("Item4");

        main_m.add(jmi1);
        main_m.add(jmi2);
        sub_m.add(jmi3);
        sub_m.add(jmi4);
        jmb.add(main_m);
        jmb.add(sub_m);

        

        add(jl);
        add(jtf);
        add(jcb);
        add(jrb);
        add(jb);
        add(jtb);
        add(jtp);
        add(jsp);
        add(jlist);
        add(jcombo);
        setJMenuBar(jmb);
    }

    public static void main(String args[])
    {
        new AllGui();
    }

}