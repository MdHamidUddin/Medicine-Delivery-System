
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
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lenovo
 */
public class ShopList extends JFrame{
    
    public static final Color Violet = new Color(25,0,51);
    public static final Color Button1 = new Color(102,0,204);
    public static final Color Button = new Color(204,153,255);
    JLabel label,label2;
    JPanel jpanel = new JPanel();
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn33,btn;
    Component comp = SwingUtilities.getRoot(this);
    
    
    public ShopList()
    {
        super("Shop List");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(800,0,450,780);
        
         jpanel.setLayout(null);
        jpanel.setBackground(Violet);
        add(jpanel);
        
        
    label = new JLabel("Choose  Medicine Shop");
    label.setFont(new Font("Adobe Arabic", Font.PLAIN, 22));
    label.setForeground(Button);
    label.setBounds(50,130,350,40);
    
    
        btn=new JButton("Sign Out");
        btn.setBounds(10,650,100,30);
        btn.setBackground(Button);
        btn.setForeground(Color.BLACK);
        
        btn1=new JButton("Best Pharma");
        btn1.setBounds(90,180,250,40);
        btn1.setBackground(Button);
        btn1.setForeground(Color.BLACK);
       
          btn2=new JButton("World Pharmacy");
          btn2.setBounds(90,230,250,40);
          btn2.setBackground(Button);
          btn2.setForeground(Color.BLACK);
       
          btn3=new JButton("Best Care Pharma");
          btn3.setBounds(90,280,250,40);
          btn3.setBackground(Button);
          btn3.setForeground(Color.BLACK);
       
       
       
        btn4=new JButton("Lifeshave Pharma");
        btn4.setBounds(90,330,250,40);
          btn4.setBackground(Button);
          btn4.setForeground(Color.BLACK);
       
        btn5=new JButton("Little Sprout");
        btn5.setBounds(90,380,250,40);
          btn5.setBackground(Button);
          btn5.setForeground(Color.BLACK);
       
        btn6=new JButton("Nusrat Pharma");
        btn6.setBounds(90,430,250,40);
          btn6.setBackground(Button);
          btn6.setForeground(Color.BLACK);
       
       
       
       
        btn7=new JButton("Afendi Pharma");
        btn7.setBounds(90,480,250,40);
          btn7.setBackground(Button);
          btn7.setForeground(Color.BLACK);
       
       
        btn8=new JButton("Pretum Pharma");
        btn8.setBounds(90,530,250,40);
          btn8.setBackground(Button);
          btn8.setForeground(Color.BLACK);
       
       
        btn9=new JButton("Himu Pharma");
          btn9.setBounds(90,580,250,40);
          btn9.setBackground(Button);
          btn9.setForeground(Color.BLACK);
       
       
//        btn10=new JButton("World Pharmacy");
//          btn10.setBounds(700,100,200,45);
//        btn10.setBackground(Color.BLACK);
//       btn10.setForeground(Color.WHITE);
//       
//        btn11=new JButton("World Pharmacy");
//          btn11.setBounds(700,100,200,45);
//        btn11.setBackground(Color.BLACK);
//       btn11.setForeground(Color.WHITE);
        


    label2 = new JLabel("Make  Faster  Your  Life");
    label2.setFont(new Font("Adobe Arabic", Font.PLAIN, 18));
    label2.setForeground(Button);
    label2.setBounds(85,700,390,40);
    
    
       btn33=new JButton("Back");
       btn33.setBounds(0,0,70,30);
       btn33.setBackground(Button);
       btn33.setForeground(Color.WHITE);
       btn33.setFont(new Font("sherif",Font.PLAIN,12));
        
     JLabel image=new JLabel();
    image.setIcon(new ImageIcon("F:\\NewFolder\\MDS2\\MDS.jpg"));
    image.setBounds(120,0,200,100);
    jpanel.add(image);
       
       
       
       btn1.setFont(new Font("Arial", Font.PLAIN, 20));
       btn2.setFont(new Font("Arial", Font.PLAIN, 20));
       btn3.setFont(new Font("Arial", Font.PLAIN, 20));
       btn4.setFont(new Font("Arial", Font.PLAIN, 20));
       btn5.setFont(new Font("Arial", Font.PLAIN, 20));
       btn6.setFont(new Font("Arial", Font.PLAIN, 20));
       btn7.setFont(new Font("Arial", Font.PLAIN, 20));
       btn8.setFont(new Font("Arial", Font.PLAIN, 20));
       btn9.setFont(new Font("Arial", Font.PLAIN, 20));
//       btn10.setFont(new Font("Arial", Font.PLAIN, 20));
//       btn11.setFont(new Font("Arial", Font.PLAIN, 20));
  
        
        
        jpanel.add(btn1);
        jpanel.add(btn2);
         jpanel.add(btn3);
         jpanel.add(btn4);
        jpanel.add(btn5);
         jpanel.add(btn6);
         jpanel.add(btn7);
        jpanel.add(btn8);
         jpanel.add(btn9);
        jpanel.add(label);
        jpanel.add(label2);
       jpanel.add(btn);
        
        
        
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
        btn.addActionListener(handler);
        
        
        
        
    }
    
    
     public class HandlerClass implements ActionListener{
         
         @Override
         public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==btn)
            {
                ((Window) comp).dispose();
                OuterFrame b=new OuterFrame();
                b.setVisible(true);
            }
            if(event.getSource()==btn1)
            {
                ((Window) comp).dispose();
                BestPharma b=new BestPharma();
                b.setVisible(true);
            }
            
             if(event.getSource()==btn2)
            {
                 ((Window) comp).dispose();
                WorldPharmacy w=new WorldPharmacy();
                w.setVisible(true);
            }
             
              if(event.getSource()==btn3)
            {
                 ((Window) comp).dispose();
                BestCarePharma b=new BestCarePharma();
                b.setVisible(true);
            }
              
               if(event.getSource()==btn4)
            {
                ((Window) comp).dispose();
                LifeshavePharma l=new LifeshavePharma();
                 l.setVisible(true);
            }
               
                if(event.getSource()==btn5)
            {
                ((Window) comp).dispose();
                LittleSprout l=new LittleSprout();
                l.setVisible(true);
            }
                
                 if(event.getSource()==btn6)
            {
                ((Window) comp).dispose();
               NusratPharma n=new NusratPharma();
                n.setVisible(true);
            }
                 
                  if(event.getSource()==btn7)
            {
                ((Window) comp).dispose();
                AfendiPharma a=new AfendiPharma();
                a.setVisible(true);
            }
                  
                   if(event.getSource()==btn8)
            {
               ((Window) comp).dispose();
               PretumPharma p=new PretumPharma();
               p.setVisible(true);
            }
                   
                    if(event.getSource()==btn9)
            {
                ((Window) comp).dispose();
                HimuPharma h=new HimuPharma();
                h.setVisible(true);
                
            }
        }

        
         
         
     }
    
    
}
