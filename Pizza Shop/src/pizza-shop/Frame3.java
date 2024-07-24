package guiCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 {
	
	Frame3()
	{
		JFrame f = new JFrame();	
        JLabel l1=new JLabel(" 'Welcome to Italian Crust' ");
        l1.setForeground(Color.WHITE);
        JLabel l2 = new JLabel("Thank You");
        l1.setBounds(200,10,150,40);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setFont(new Font("Sitka Text", Font.BOLD, 25));
        l2.setFont(new Font("SitkA Text",Font.BOLD,22)); 
        f.setSize(600,600);
        f.setLocation(330,50);
        JPanel p = new JPanel(); 
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(Color.YELLOW);
		JLabel e3= new JLabel("Zipcode :");
		e3.setAlignmentX(Component.CENTER_ALIGNMENT);
		e3.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel e1=new JLabel("Customer Name :");
 		e1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
        JLabel l= new JLabel("Customer Information");
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
			l.setVerticalAlignment(SwingConstants.TOP);
			l.setFont(new Font("Sitka",Font.BOLD,20));
			p.add(l);//1
			e1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			p.add(e1);//2
			JTextField tf1= new JTextField(10);

			tf1.setMaximumSize(tf1.getPreferredSize());

	
			p.add(tf1);	//3
			JLabel e2 = new JLabel("Street:");
			e2.setAlignmentX(Component.RIGHT_ALIGNMENT);

			e2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			p.add(e2);//4
			JLabel e5= new JLabel("City :");
			e5.setAlignmentX(Component.CENTER_ALIGNMENT);

			e5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			JTextField tf2= new JTextField(10);
			tf2.setAlignmentY(Component.TOP_ALIGNMENT);

			tf2.setMaximumSize(tf2.getPreferredSize());
			p.add(tf2);//5
			p.add(e5);//6
			JTextField tf3= new JTextField(10);
			tf3.setAlignmentY(1.5f);
	
			tf3.setMaximumSize(tf3.getPreferredSize());
			p.add(tf3);//7
			p.add(e3);//8
	        f.add(p,BorderLayout.CENTER);
      	    JTextField tf4 = new JTextField(10);
     	    tf4.setAlignmentY(1.5f);
	        tf4.setMaximumSize(tf2.getPreferredSize());
	       f.setBackground(Color.BLACK);
	       p.add(tf4);//9
	       JLabel e4=new JLabel("Contact no :");
	       e4.setAlignmentX(Component.CENTER_ALIGNMENT);
	       e4.setAlignmentY(1.5f);
	       e5.setAlignmentX(1.5f);

	       e4.setFont(new Font("Tahoma", Font.BOLD,12));
	       p.add(e4);//10
	       JTextField tf5=new JTextField();
	       tf5.setMaximumSize(tf2.getPreferredSize());
	       p.add(tf5);
	       
	       JButton b= new JButton("Place Order");
	       b.setAlignmentY(0.0f);
	       b.setForeground(Color. WHITE);
	       b.setBackground(Color.BLACK);
	       b.setAlignmentX(Component.CENTER_ALIGNMENT);
	       b.setFont(new Font("Sitka Text", Font.BOLD, 20));
	       p.add(b);

	       b.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
		     String customerName = tf1.getText();
             String street = tf2.getText();
             String city = tf3.getText();
             String zipcode = tf4.getText();
             String contactNo = tf5.getText();
             
             Result RR=new Result(customerName,street,city,zipcode,contactNo);
             
             
	}
	      
	});
	f.setVisible(true);
	}
	
}

