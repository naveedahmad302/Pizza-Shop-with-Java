package guiCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admin 
{
	static String ADMINNAME="naveed";
	 static String PASSWORD="12345";
	
	Admin()
	{ 
		
			JFrame f = new JFrame("ADMIN LOGIN");
			f.setBackground(Color.LIGHT_GRAY);
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
	        
			JLabel e= new JLabel("ADMIN LOGIN");
	        e.setFont(new Font("Sitka Text",Font.BOLD,50));
	        e.setBounds(150,10,200,90);

			JLabel l= new JLabel("Adminname");
			l.setBounds(40,100,90,30);
			l.setFont(new Font("Sitka Text",Font.BOLD,16));

		    JLabel l2= new JLabel("Password");
			l2.setBounds(40,140,90,30);
			l2.setFont(new Font("Sitka Text",Font.BOLD,16));

		   JTextField txtName= new JTextField();
		   JPasswordField txtPass= new JPasswordField();
		   txtName.setBounds(40,100,100,30);	

		   txtPass.setBounds(150,140,200,30);
		   
			//f.setVisible(true);
			
			b1.setBounds(180,230,120,40);
			b2.setBounds(180,280,120,40);
			txtName.setBounds(150,100,200,30);
			e.setBounds(180,11,117,46);	
			e.setFont(new Font("Serif",Font.BOLD,18));
			
			f.add(l);
			f.add(l2);
			f.add(txtName);
			f.add(txtPass);
			f.add(b1);
			f.add(b2);
			f.add(e);
			f.add(b1);

	         b1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		    	 
		    	    String username = txtName.getText();
	                String password = new String(txtPass.getPassword());

	        		if(username.equals(ADMINNAME) && password.equals(PASSWORD))
	        		{
		    	     AdminAction222 obj=new AdminAction222();
	        		}
	        		else
	        		{
	                 JOptionPane.showMessageDialog(f, "Incorrect password! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	        		}
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
