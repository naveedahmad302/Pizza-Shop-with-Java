package guiCalculator;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AdminAction222 
{
	AdminAction222()
	{
	  JFrame f = new JFrame("Items");
	  f.setLayout(null);
	  f.setSize(700, 600);
	  f.setLocation(250, 100);
	  
	  JLabel lb1= new JLabel("Available Items");
	  lb1.setBounds(260,0,200,40);
	  lb1.setForeground(Color.BLUE);
	  lb1.setFont(new Font("Sitka Text",Font.BOLD,23));

	  JLabel lb2=new JLabel("Pizza Size");
	  lb2.setForeground(Color.RED);
	  lb2.setBounds(90, 40,160, 40);
	  lb2.setFont(new Font("Sitka Text",Font.BOLD,18));

			
	  JLabel c1= new JLabel(">Small");
	  c1.setBounds(90, 80, 160, 30);
		
	  JLabel c2= new JLabel(">Medium");
	  c2.setBounds(90, 110, 80, 40);

	  JLabel c3= new JLabel(">Large");
	  c3.setBounds(90, 140,60,40);
	 JLabel lb3 = new JLabel("Toppings");
	 lb3.setForeground(Color.RED);
	 lb3.setBounds(90, 187,137,30);
	 lb3.setFont(new Font("Sitka Text", Font.BOLD, 18));
	
	 JLabel c4= new JLabel(">Tomatto");
	c4.setBounds(90,230,80,30);
	
	JLabel c5= new JLabel(">Green Pepper");
	c5.setBounds(90,255,120,40);
	
	JLabel c6= new JLabel(">Black Olives");
	c6.setBounds(90,290,100,30);

	JLabel lb4=new JLabel("Extra Cheese");
	lb4.setForeground(Color.RED);
	lb4.setBounds(90,340,150,30);
	lb4.setFont(new Font("Sitka Text",Font.BOLD,18));
	JLabel c8= new JLabel(">Yes");
	c8.setBounds(90,360,150,40);

	
	Label lb5= new Label("Pizza Type");
	lb5.setForeground(Color.RED);
	lb5.setBounds(500,40,120,30);
	lb5.setFont(new Font("Sitka Text", Font.BOLD, 18));
	
	JLabel r1= new JLabel(">Thin Crust");
    r1.setBounds(500,80,120,20);
    JLabel r2= new JLabel(">Medium Crust");
	r2.setBounds(500,110,120,40);
	
	JLabel lb6= new JLabel("Drink");
	lb6.setForeground(Color.RED);

	lb6.setBounds(500,200,120,40);
	lb6.setFont(new Font("Sitka Text", Font.BOLD, 18));
	String drink_flav[]= {"Coca-Cola","Sprite","7 Up","Fanta"};
    JComboBox c= new JComboBox(drink_flav);
    c.setBounds(500,230,120,40);
   
    JButton ocy=new JButton("OK");
    ocy.setBounds(240,450,190,50);
    ocy.setForeground(Color.white);
    ocy.setBackground(Color.black);
    ocy.setFont(new Font("Sitka Text",Font.BOLD,25));
    
    f.add(lb1);
    f.add(lb2);
    f.add(c1);
	f.add(c2);
	f.add(c3);
	f.add(lb3);
	f.add(c4);
	f.add(c5);
	f.add(c6);
	f.add(lb4);
	f.add(c8);
	f.add(lb5);
	f.add(r1);
	f.add(r2);
	f.add(c);
	f.add(lb6);
	f.add(ocy);
	
	f.setVisible(true);
	ocy.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			f.dispose();
		}
	});
	
	
	
}
}
