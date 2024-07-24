package guiCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FirstFrame {
	FirstFrame()
	{
		JFrame f = new JFrame("USER LOGIN");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500,500);
	    f.setLocation(500,200);	
	    f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JButton b1= new JButton("LOGIN");
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Sitka Text", Font.BOLD, 18));
		b1.setBackground(Color.BLACK);
		
		JButton b2= new JButton("CANCEL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Sitka Text",Font.BOLD,18));
        
		JLabel e= new JLabel("LOGIN");
        e.setFont(new Font("Sitka Text",Font.BOLD,30));
        
		JLabel l= new JLabel("Username");
	    JLabel l2= new JLabel("Password");
		
	    JTextField t= new JTextField();
	   	e.setFont(new Font("Sitka Text",Font.BOLD,20));
	    l.setFont(new Font("Sitka Text",Font.BOLD,18));
	    l2.setFont(new Font("Sitka Text",Font.BOLD,18));
	    JPasswordField p = new JPasswordField();
	   
	    	
		l.setBounds(40,100,100,30);	
		l2.setBounds(40,140,90,30);
		b1.setBounds(180,230,120,40);
		b2.setBounds(180,280,120,40);
		t.setBounds(150,100,200,30);
		p.setBounds(150,140,200,30);
		e.setBounds(180,11,117,46);	
		e.setFont(new Font("Serif",Font.BOLD,18));
		
		f.add(l);
		f.add(l2);
		f.add(t);
		f.add(p);
		f.add(b1);
		f.add(b2);
		f.add(e);
		f.add(b1);
		
        b1.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent e) {
	    	  Pizza f3=new Pizza();
		        f.dispose();

			}
			});
         b2.addActionListener(new ActionListener() {
    	     public void actionPerformed(ActionEvent e) {
    		        f.dispose();	
    			}
    			});

		
		
		
		f.setVisible(true);
	}
}
