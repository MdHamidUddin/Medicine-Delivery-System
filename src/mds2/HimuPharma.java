/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mds2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static mds2.BestCarePharma.TotalCost;


public class HimuPharma extends JFrame{
           public static final Color Violet = new Color(25,0,51);
    public static final Color Button = new Color(204,153,255);
    JLabel label,label2;
    JPanel jpanel = new JPanel();
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;

    
   int m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
   Component comp = SwingUtilities.getRoot(this);
   static double TotalCost=0;
   String list="";
   
   
         public HimuPharma()
    {
           super("Himu Pharma");
       this.setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,0,450,780);
        
         jpanel.setLayout(null);
        jpanel.setBackground(Violet);
        add(jpanel);
        
        
    label = new JLabel("Choose Medicine");
    label.setFont(new Font("Adobe Arabic", Font.PLAIN, 28));
    label.setForeground(Color.WHITE);
    label.setBounds(80,110,300,40);
    
    
    JLabel image=new JLabel();
    image.setIcon(new ImageIcon("F:\\NewFolder\\MDS2\\MDS.jpg"));
    image.setBounds(120,0,200,100);
    jpanel.add(image);
    
    label2 = new JLabel("Make  Faster  Your  Life");
    label2.setFont(new Font("Adobe Arabic", Font.PLAIN, 18));
    label2.setForeground(Color.WHITE);
    label2.setBounds(85,700,390,40);
        
        btn1=new JButton("Azelastine");
          btn1.setBounds(90,180,250,40);
        btn1.setBackground(Button);
       btn1.setForeground(Color.BLACK);
       
       btn2=new JButton("Ephedrine");
          btn2.setBounds(90,230,250,40);
        btn2.setBackground(Button);
       btn2.setForeground(Color.BLACK);
       
        btn3=new JButton("Oxymetazoline");
          btn3.setBounds(90,280,250,40);
        btn3.setBackground(Button);
       btn3.setForeground(Color.BLACK);
       
       
       
        btn4=new JButton("Xylometazoline");
          btn4.setBounds(90,330,250,40);
        btn4.setBackground(Button);
       btn4.setForeground(Color.BLACK);
       
        btn5=new JButton("Beclometasone");
          btn5.setBounds(90,380,250,40);
        btn5.setBackground(Button);
       btn5.setForeground(Color.BLACK);
       
        btn6=new JButton("Neomycin");
          btn6.setBounds(90,430,250,40);
        btn6.setBackground(Button);
       btn6.setForeground(Color.BLACK);
       
       
       
       
        btn7=new JButton("Tobramycin");
          btn7.setBounds(90,480,250,40);
        btn7.setBackground(Button);
       btn7.setForeground(Color.BLACK);
       
       
        btn8=new JButton("Gatifloxacin");
          btn8.setBounds(90,530,250,40);
        btn8.setBackground(Button);
       btn8.setForeground(Color.BLACK);
       
       
        btn9=new JButton("Hypromellose");
          btn9.setBounds(90,580,250,40);
        btn9.setBackground(Button);
       btn9.setForeground(Color.BLACK);
       
       
        btn10=new JButton("Back");
          btn10.setBounds(0,0,70,30);
        btn10.setBackground(Button);
       btn10.setForeground(Color.BLACK);
       

      
        btn11=new JButton("Check Out");
          btn11.setBounds(75,650,280,40);
        btn11.setBackground(Button);
       btn11.setForeground(Color.BLACK);
        
        
       btn1.setFont(new Font("Arial", Font.PLAIN, 20));
       btn2.setFont(new Font("Arial", Font.PLAIN, 20));
       btn3.setFont(new Font("Arial", Font.PLAIN, 20));
       btn4.setFont(new Font("Arial", Font.PLAIN, 20));
       btn5.setFont(new Font("Arial", Font.PLAIN, 20));
       btn6.setFont(new Font("Arial", Font.PLAIN, 20));
       btn7.setFont(new Font("Arial", Font.PLAIN, 20));
       btn8.setFont(new Font("Arial", Font.PLAIN, 20));
       btn9.setFont(new Font("Arial", Font.PLAIN, 20));
      btn10.setFont(new Font("Arial", Font.PLAIN, 12));
      btn11.setFont(new Font("Arial", Font.PLAIN, 20));
  
        
        
        jpanel.add(btn1);
        jpanel.add(btn2);
         jpanel.add(btn3);
         jpanel.add(btn4);
        jpanel.add(btn5);
         jpanel.add(btn6);
         jpanel.add(btn7);
        jpanel.add(btn8);
         jpanel.add(btn9);
          jpanel.add(btn10);
          jpanel.add(btn11);
        jpanel.add(label);
        jpanel.add(label2);
        
        
        
        HandlerClass  handler=new HandlerClass();
        
        btn1.addActionListener((ActionListener) handler);
        btn2.addActionListener(handler);
        btn3.addActionListener(handler);
        btn4.addActionListener(handler);
        btn5.addActionListener(handler);
        btn6.addActionListener(handler);
        btn7.addActionListener(handler);
        btn8.addActionListener(handler);
        btn9.addActionListener(handler);
        btn10.addActionListener(handler);
         btn11.addActionListener(handler);
        
        
        
        
    }
    
    
        public void CheckOut(){
            if(m1>0)
        {
            TotalCost=TotalCost+(m1*12);
            list=m1+"piece  AAzelastine \n";   
        }
        if(m2>0)
        {
          //  JOptionPane.showMessageDialog(null, m2 +" piece Ciferex");
            TotalCost+=m2*3;;
            list+=m2+" piece Ephedrine\n";
        }
        if(m3>0)
        {
            //JOptionPane.showMessageDialog(null, m3 +" piece Elavil");
            TotalCost+=m3*10;
             list+=m3+" piece Oxymetazoline\n";
        }
         if(m4>0)
        {
           // JOptionPane.showMessageDialog(null, m4 +" piece Oral Gel");
            TotalCost+=m4*17;
            list+=m4+" piece Xylometazoline\n";
        }
         if(m5>0)
        {
            //JOptionPane.showMessageDialog(null, m5 +" piece Biotin");
            TotalCost+=m5*13;
            list+=m5+" piece Beclometasone\n";
        }
        if(m6>0)
        {
          //  JOptionPane.showMessageDialog(null, m6 +" piece Toradol");
            TotalCost+=m6*10;
            list+=m6 +" piece Neomycin\n";
        }
          if(m7>0)
        {
            //JOptionPane.showMessageDialog(null, m7 +" piece Lasix");
            TotalCost+=m7*11;
            list+=m7 +" piece Tobramycin\n";
        }
           if(m8>0)
        {
           // JOptionPane.showMessageDialog(null, m8 +" piece Timolol");
            TotalCost+=m8*18;
            list+=m8 +" piece Gatifloxacin\n";
        }
           if(m9>0)
        {
          //  JOptionPane.showMessageDialog(null, m9 +" piece Cifrazol");
            TotalCost+=m9*12;
            list+=m9 +" piece Hypromellose\n";
        }
          
       }
    
    
     public class HandlerClass implements ActionListener{
         
         public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==btn1)
            {
                String s1=JOptionPane.showInputDialog(" Azelastine ,price per piece 12tk\nHow much do you want ??");
                m1=Integer.parseInt(s1);
                JOptionPane.showMessageDialog(null,+m1+" piece added ");
            }
            
             if(event.getSource()==btn2)
            {
               String s1=JOptionPane.showInputDialog(" Ephedrine ,price per piece 12tk\nHow much do you want ??");
              m2=Integer.parseInt(s1);
              JOptionPane.showMessageDialog(null,+m2+" piece added ");
            }
             
              if(event.getSource()==btn3)
            {
                 String s1=JOptionPane.showInputDialog("Oxymetazoline ,price per piece 12tk\nHow much do you want ??");
              m3=Integer.parseInt(s1);
             JOptionPane.showMessageDialog(null,+m3+" piece added ");
            }
              
               if(event.getSource()==btn4)
            {
           String s1=JOptionPane.showInputDialog(" Xylometazoline ,price per piece 12tk\nHow much do you want ??");
        m4=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m4+" piece added ");
            }
               
                if(event.getSource()==btn5)
            {
           String s1=JOptionPane.showInputDialog("Beclometasone ,price per piece 12tk\nHow much do you want ??");
        m5=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m5+" piece added ");
            }
                
                 if(event.getSource()==btn6)
            {
         String s1=JOptionPane.showInputDialog(" Neomycin ,price per piece 12tk\nHow much do you want ??");
        m6=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m6+" piece added ");
            }
                 
              if(event.getSource()==btn7)
            {
         String s1=JOptionPane.showInputDialog("Tobramycin ,price per piece 12tk\nHow much do you want ??");
        m7=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m7+" piece added ");
            }
                  
             if(event.getSource()==btn8)
            {
           String s1=JOptionPane.showInputDialog("Gatifloxacin ,price per piece 12tk\nHow much do you want ??");
        m8=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m8+" piece added ");
            }
                   
                    if(event.getSource()==btn9)
            {
          String s1=JOptionPane.showInputDialog("Hypromellose ,price per piece 12tk\nHow much do you want ??");
        m9=Integer.parseInt(s1);
        JOptionPane.showMessageDialog(null,+m9+" piece added ");
            }
                 
                    
                    
  if(event.getSource()==btn10)
      {
                
       String x= JOptionPane.showInputDialog("Your cart item will be deleted ! \nAre you sure to continue ?");;
      if(x.equals("Yes") || x.equals("yes"))
      {
        ((Window) comp).dispose();
        ShopList s=new ShopList();
s.setVisible(true);
      }
                
       }
                  
                  
                  if(event.getSource()==btn11)
                  {
          String l=  JOptionPane.showInputDialog("Enter your Location : ");
          String pn=  JOptionPane.showInputDialog("Enter your phone Number ");
          ((Window) comp).dispose();
           CheckOut();
           TotalCost+=30;
           JOptionPane.showMessageDialog(null,list);
       
           Time t= new Time(list,TotalCost,l,pn);
           
//             ShopList s=new ShopList();
//            s.setVisible(true);
                  }
        }
   
     }
}

        
    

