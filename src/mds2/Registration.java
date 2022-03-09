/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mds2;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mds2.Login.Violet;
import static mds2.OuterFrame.Button;
import static mds2.OuterFrame.Violet;
public class Registration extends JFrame{
    
    
    File f=new File("D:\\java project\\NewFolder\\MDS2");
    String Username,Password,Email;
    int ln;
    Component comp = SwingUtilities.getRoot(this);
    
    public static final Color Gray = new Color(153,153,153);
    public static final Color Violet1 = new Color(80,5,98);
    public static final Color Violet = new Color(25,0,51);
    JLabel label,jluser,jlmail,jlpass,welcome,newac;
    JPanel jpanel = new JPanel();
    JPanel jpanel2=new JPanel();
    JTextField tfuser,tfmail;
    JPasswordField pass;
    JButton btn1,btn2,btn3;
    
   public  Registration()
    {
         
        super("Sign in");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,0,450,780);
        
        jpanel.setLayout(null);
        jpanel.setBackground(Violet);
        add(jpanel);
        
    JLabel image=new JLabel();
    image.setIcon(new ImageIcon("D:\\java project\\NewFolder\\MDS2\\MDS.jpg"));
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
         
         
    tfuser = new JTextField("Enter your UserName");
    tfuser.setFont(new Font("sherif", Font.PLAIN, 14));
    tfuser.setForeground(Color.BLACK);
    tfuser.setBackground(Color.WHITE);
    tfuser.setBounds(46,350,350,35);
    tfuser.setToolTipText("Click to edit");
 
    

    pass=new JPasswordField("Enter password");
    pass.setFont(new Font("sherif", Font.PLAIN, 14));
    pass.setBounds(46,400,350,35);
    pass.setForeground(Color.BLACK);
    pass.setBackground(Color.WHITE);
    pass.setToolTipText("Click to edit");
    
    
    tfmail = new JTextField("Email/Phone");
    tfmail.setFont(new Font("sherif", Font.PLAIN, 14));
    tfmail.setForeground(Color.BLACK);
    tfmail.setBackground(Color.WHITE);
    tfmail.setBounds(46,450,350,35);
    tfmail.setToolTipText("Click to edit");
    
       btn2=new JButton("Sign up");
       btn2.setBounds(46,500,350,45);
       btn2.setBackground(Button);
       btn2.setForeground(Color.BLACK);
       btn2.setFont(new Font("sherif",Font.PLAIN,15));
       
       btn3=new JButton("Back");
       btn3.setBounds(0,0,70,30);
       btn3.setBackground(Button);
       btn3.setForeground(Color.BLACK);
       btn3.setFont(new Font("sherif",Font.PLAIN,12));
       
       
       
        jpanel.add(welcome);
       jpanel.add(label);
       jpanel.add(tfuser);
       jpanel.add(pass);
       jpanel.add(tfmail);
       jpanel.add(btn2);
       jpanel.add(btn3);
       
       
   HandlerClass handler=new HandlerClass();
    
    btn2.addActionListener(handler);
    btn3.addActionListener(handler); 
        
    
    
    tfuser.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (tfuser.getText().equals("Enter your UserName")) {
            tfuser.setText("");
            tfuser.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (tfuser.getText().isEmpty()) {
            tfuser.setForeground(Color.GRAY);
            tfuser.setText("Enter your UserName");
        }
    }
    });
    
    
    tfmail.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (tfmail.getText().equals("Email/Phone")) {
            tfmail.setText("");
            tfmail.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (tfmail.getText().isEmpty()) {
            tfmail.setForeground(Color.GRAY);
            tfmail.setText("Email/Phone");
        }
    }
    });
        
    pass.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
        if (pass.getText().equals("Enter password")) {
            pass.setText("");
            pass.setForeground(Color.BLACK);
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (pass.getText().isEmpty()) {
            pass.setForeground(Color.GRAY);
            pass.setText("Enter password");
        }
    }
    });
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    }
    
    
     void creatFolder()
     {
         if(!f.exists()){
             f.mkdirs();
         }
         
         }
     
     
     
     void readFile()
    {
        try {
            FileReader fr=new FileReader(f+"\\Login.txt");
            System.out.println("file exists !");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw=new FileWriter(f+"\\Login.txt");
                System.out.println("File Created ");
            } catch (IOException ex1) {
               Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
         
    }
     
     
         void addData(String usr,String pswd,String mail )
    {
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\login.txt","rw");
            for(int i=0;i<ln;i++)
            {
                raf.readLine();
            }
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            raf.writeBytes("Username:"+usr+ "\r\n");
            raf.writeBytes("Password:"+pswd+ "\r\n");
            raf.writeBytes("Email:"+mail);
            JOptionPane.showMessageDialog(null, "Successfully Registered " );
            JOptionPane.showMessageDialog(null, "Now you can login with your username & password " );
            
        } catch (FileNotFoundException ex) {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
     
     
     
     void countLines()
{
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(f+"\\login.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("Number of lines :"+ln);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     
     
     
     void Text()
     {
      if(tfuser.getText().equals(""))
      {
          tfuser.setVisible(true);
          tfuser.setEnabled(false);
          
      }
      else 
      {
           tfuser.setVisible(false);
          tfuser.setEnabled(false);
      }
     }
     
      class HandlerClass implements ActionListener{
         
         public void actionPerformed(ActionEvent event)
        {
            
            
            if(event.getSource()==btn2)
            {
                ((Window) comp).dispose();
                Login l=new Login();
                l.setVisible(true);
                Text();
                creatFolder();    
                readFile();
                countLines();
                addData(tfuser.getText(),pass.getText(),tfmail.getText());
                
            }
            
            else  if(event.getSource()==btn3)
            {
                ((Window) comp).dispose();
                OuterFrame O=new OuterFrame();
                O.setVisible(true);
            }
            
        }
         
      }
    
}
