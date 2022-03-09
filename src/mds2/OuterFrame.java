
package mds2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lenovo
 */
public class OuterFrame extends JFrame {
    
    
        File f=new File("F:\\NewFolder\\MDS2\\MDS");
    String Username,Password,Email;
    int ln;
    Component comp = SwingUtilities.getRoot(this);
    
        public static final Color Gray = new Color(153,153,153);
    public static final Color Violet = new Color(25,0,51);
    public static final Color Violet1 = new Color(224,224,224);
    public static final Color Button1 = new Color(141,58,162);
    public static final Color Button = new Color(204,153,255);
    JLabel label,welcome,mds;
    JPanel jpanel = new JPanel();
    JButton btn1,btn2,btn3;
    
    
        OuterFrame()
        {
             super("Login/Registration");
       //this.setResizable(false);
    // setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,0,450,780);
        
        jpanel.setLayout(null);
        jpanel.setBackground(Violet);
        add(jpanel);
        
       btn1=new JButton("Sign in");
       btn1.setBounds(50,350,350,40);
       btn1.setBackground(Button);
       btn1.setForeground(Color.BLACK);
       btn1.setFont(new Font("sherif",Font.BOLD,15));
       
       btn2=new JButton("Sign up");
       btn2.setBounds(50,405,350,40);
       btn2.setBackground(Button);
       btn2.setForeground(Color.BLACK);
       btn2.setFont(new Font("sherif",Font.BOLD,15));
       
       
    JLabel image=new JLabel();
    image.setIcon(new ImageIcon("F:\\NewFolder\\MDS2\\MDS.jpg"));
    image.setBounds(120,0,300,100);
    jpanel.add(image);
    
        welcome=new JLabel("Welcome To");
        welcome.setFont(new Font("sherif",Font.PLAIN,20));
        welcome.setForeground(Color.WHITE);
        welcome.setBounds(150,150,200,50);
        
    label = new JLabel("Medicine Delivery System");
    label.setFont(new Font("sherif", Font.PLAIN, 20));
    label.setForeground(Color.WHITE);
    label.setBounds(90,200,400,50);
    
    
    
       jpanel.add(btn1);
       jpanel.add(btn2);
       jpanel.add(welcome);
       jpanel.add(label);
       
       
    HandlerClass handler=new HandlerClass();
    
    btn1.addActionListener(handler);
    btn2.addActionListener(handler);
      
        }
        
        
       public class HandlerClass implements ActionListener{
         
            @Override
         public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==btn1)
            {
                ((Window) comp).dispose();
                Login l=new Login();
                l.setVisible(true);
            }
             else  if(event.getSource()==btn2)
            {
                ((Window) comp).dispose();
                Registration l=new Registration();
                l.setVisible(true);
            }
        }
        }
    
}
