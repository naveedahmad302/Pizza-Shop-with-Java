package guiCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Pizza
{
	static String selectedSize;
	static String Topping;
	static String Cheese;
	static String Type;
	
	Pizza()
	{	
		JFrame f = new JFrame("' Welcome to Italian Crust '");
		JLabel e= new JLabel("'Place Your Order'");
		e.setBounds(260,0,200,40);
		e.setForeground(Color.BLUE);
		e.setFont(new Font("Sitka Text",Font.BOLD,22));
		
		JLabel e1=new JLabel("Select pizza Size");
		e1.setForeground(Color.RED);
 		e1.setBounds(90, 40,160, 40);
 		 			
 		e1.setFont(new Font("Sitka Text",Font.BOLD,18));
 		JCheckBox c1= new JCheckBox("Small");
 		c1.setBounds(90, 80, 160, 30);
 		
 		e1.setFont(new Font("Sitka Text",Font.BOLD,18));
 		JCheckBox c2= new JCheckBox("Medium");
 		c2.setBounds(90, 110, 80, 40);
 
		JCheckBox c3= new JCheckBox("Large");
		c3.setBounds(90, 140,60,40);
		JLabel e2 = new JLabel("Select Topping");
		e2.setForeground(Color.RED);
		e2.setBounds(90, 187,137,30);
		e2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		
		JCheckBox c4= new JCheckBox("Tomatto");
		c4.setBounds(90,230,80,30);
		
		JCheckBox c5= new JCheckBox("Green Pepper");
		c5.setBounds(90,255,120,40);
		
		JCheckBox c6= new JCheckBox("Black Olives");
		c6.setBounds(90,290,100,30);
		
		JCheckBox c7 = new JCheckBox("Pepproni");
		c7.setBounds(90,320,150,30);
		c7.isSelected();

		JLabel e3=new JLabel("Extra Cheese");
		e3.setForeground(Color.RED);
		e3.setBounds(90,360,150,30);
		
		e3.setFont(new Font("Sitka Text",Font.BOLD,16));
		JCheckBox c8= new JCheckBox("Yes");

		c8.setBounds(90,390,150,40);
		JCheckBox c9 = new JCheckBox("No");
		c9.setBounds(90,420,150,40);
		Label e4= new Label("Pizza Type");
		e4.setForeground(Color.RED);
		e4.setForeground(Color.RED);
		e4.setBounds(500,40,120,30);
		e4.setFont(new Font("Sitka Text", Font.BOLD, 18));
		
		JRadioButton r1= new JRadioButton("Thin Crust");
          r1.setBounds(500,80,120,20);
		JRadioButton r2= new JRadioButton("Medium Crust");
		r2.setBounds(500,110,120,40);
		
		JRadioButton r3= new JRadioButton("Pan");
		r3.setBounds(500,150,120,40);
		JLabel e5 = new JLabel("Select Drink");
		e5.setForeground(Color.RED);

		e5.setBounds(500,200,120,40);
		e5.setFont(new Font("Sitka Text", Font.BOLD, 18));
		String drink_flav[]= {"Coca-Cola","Sprite","7 Up","Fanta"};
        JComboBox c= new JComboBox(drink_flav);
        c.setBounds(500,230,120,40);
        JButton b=new JButton("NEXT");
       
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        b.setFont(new Font("Sitka Text",Font.BOLD,16));
        b.setBounds(480,470,190,40);
 
        ButtonGroup GrpOne = new ButtonGroup();
        ButtonGroup GrpTwo = new ButtonGroup();
        ButtonGroup GrpThree = new ButtonGroup();
        ButtonGroup GrpFour = new ButtonGroup();

        f.add(e);
        f.add(e1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        GrpOne.add(c1);
        GrpOne.add(c2);
        GrpOne.add(c3);
		f.add(e2);
		f.add(c4);
		f.add(c5);
		f.add(c6);
		f.add(c7);
		GrpTwo.add(c4);
		GrpTwo.add(c5);
		GrpTwo.add(c6);
		GrpTwo.add(c7);
		f.add(e3);
		f.add(c8);
		f.add(c9);
		GrpThree.add(c8);
		GrpThree.add(c9);
		f.add(e4);	
		f.add(r1);
		f.add(r2);
		f.add(r3);
		GrpFour.add(r1);
		GrpFour.add(r2);
		GrpFour.add(r3);
		f.add(c);
		f.add(e5);
		f.add(b);
		f.setLayout(null);
		f.setSize(700, 600);
		f.setLocation(250, 100);
		
		
        
		 b.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) 
	        	{
	        		
	        		Frame3 RR =new Frame3();
	        		
	        		
	        	}
	        });
		 
		 f.setVisible(true);
}


}