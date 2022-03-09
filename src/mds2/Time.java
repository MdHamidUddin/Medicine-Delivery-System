
package mds2;
         
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import java.util.TimerTask;
import static mds2.BestPharma.Button;
import static mds2.OuterFrame.Button;


public class Time extends JFrame
	{
	   public static final Color Button = new Color(204,153,255);
	  public static final Color Violet = new Color(25,0,51);
	   JPanel jpanel=new JPanel();
            
		int k=300;
                int left=300/60;
                int right=k-(left*60);
		JButton btn8;
	   JButton btn2 =new JButton(); 
           Component comp = SwingUtilities.getRoot(this);
		 Time(String list,double cost,String loc,String pn)
		{
                   
	super("Best Pharma");
      // this.setResizable(false);
      this.setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350,0,450,780);
        
         jpanel.setLayout(null);
        jpanel.setBackground(Violet);
        add(jpanel);
         
    JLabel label2=new JLabel();
    label2 = new JLabel("Make  Faster  Your  Life");
    label2.setFont(new Font("Adobe Arabic", Font.PLAIN, 18));
    label2.setForeground(Button);
    label2.setBounds(85,700,390,40);
        
        
    JLabel image=new JLabel();
    image.setIcon(new ImageIcon("F:\\NewFolder\\MDS2\\MDS.jpg"));
    image.setBounds(120,0,200,100);
    jpanel.add(image);
       

                
                JLabel time=new JLabel();
		time.setFont(new Font("sherif", Font.PLAIN, 36));
                time.setForeground(Button);
		time.setBounds(160,260,130,40);
                
                JLabel tr0=new JLabel();
		tr0.setFont(new Font("sherif", Font.PLAIN, 24));
                tr0.setForeground(Color.WHITE);
		tr0.setBounds(150,150,350,40);
                
                JLabel tr=new JLabel();
		tr.setFont(new Font("sherif", Font.PLAIN, 24));
                tr.setForeground(Color.WHITE);
		tr.setBounds(70,200,390,40);
                
//                JLabel tr2=new JLabel(list);
//		tr2.setFont(new Font("sherif", Font.PLAIN, 24));
//                tr2.setForeground(Color.WHITE);
//		tr2.setBounds(70,480,350,300);

                JLabel dc=new JLabel("Delivery Cost : 30 tk");
		dc.setFont(new Font("sherif", Font.PLAIN, 24));
                dc.setForeground(Color.WHITE);
		dc.setBounds(30,320,350,40);


                
                JLabel tr3=new JLabel("Total Cost : "+cost+" tk");
		tr3.setFont(new Font("sherif", Font.PLAIN, 24));
                tr3.setForeground(Color.WHITE);
		tr3.setBounds(30,360,350,40);
                
                JLabel tr4=new JLabel("Delivery Location : "+loc);
		tr4.setFont(new Font("sherif", Font.PLAIN, 24));
                tr4.setForeground(Color.WHITE);
		tr4.setBounds(30,400,350,40);
                
                JLabel tr5=new JLabel("Contact Number : "+pn);
		tr5.setFont(new Font("sherif", Font.PLAIN, 24));
                tr5.setForeground(Color.WHITE);
		tr5.setBounds(30,440,350,40);
       
                JLabel newac=new JLabel();
        newac=new JLabel("Want to buy more Medicine ?");
        newac.setFont(new Font("sherif",Font.PLAIN,18));
        newac.setForeground(Color.WHITE);
        newac.setBounds(100,570,400,40);
        
       
       btn2=new JButton("Medicine Shop");
       btn2.setBounds(46,625,350,45);
       btn2.setBackground(Button);
       btn2.setForeground(Color.BLACK);
       btn2.setFont(new Font("sherif",Font.BOLD,15));
       
       //jpanel.add(btn8);
       jpanel.add(time);
        jpanel.add(tr0);
         jpanel.add(tr);
         jpanel.add(dc);
         jpanel.add(newac);
           jpanel.add(tr3);
            jpanel.add(tr4);
             jpanel.add(tr5);
          jpanel.add(label2);
          jpanel.add(btn2);
       
       
		 Timer timer;
		
		
	  timer=new Timer(1000,new ActionListener()
	   {
                   @Override
		   public void actionPerformed(ActionEvent e)
		   {
                       
                       if(right<0 && left>0)
                       {
                           right=59;
                           left--;
                       }
			
                      else if(right==-1 && left ==0)
                       {
                           right++;
                       }
                       
                       
                      else  if(left==0 && right ==0)
                           {
//                               tr0.setText(String.valueOf("Your Order is "));
//                               tr.setText(String.valueOf("on your Door "));
                               ((Window) comp).dispose();
                           }
                       
                      else if(left>=0 && right>0)
                      {
                                 tr0.setText(String.valueOf("Please Wait "));
                               tr.setText(String.valueOf("Your Order is Processing"));
                              
                      }
                           time.setText(String.valueOf(left +" : "+ right));
			   right--;
                           
                          
                       
                       
                       
                       
		   }              
         
	   }
                     
	   );

		 timer.start();
                 Handler handler=new Handler();
                 btn2.addActionListener(handler);
		}
                 
                 
                 public class Handler implements ActionListener{
                     
                      @Override
                      public void actionPerformed(ActionEvent event)
                      {
                          if(event.getSource()==btn2)
                          {
                              ShopList s=new ShopList();
                                s.setVisible(true);
                          }
                      }
                 }
                 
                 
                 
	
	
	}
