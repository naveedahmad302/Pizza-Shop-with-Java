package guiCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Result 
{
	Result(String customerName, String street, String city, String zipcode, String contactNo)
	{
		JFrame jR=new JFrame("BILL");
		jR.setSize(500, 700);
		jR.setLocation(250, 100);
		jR.setLayout(null);
		
		JLabel lb=new JLabel("Your Bill"); 
		lb.setBounds(150,30,200,30);
		lb.setForeground(Color.red);
		lb.setFont(new Font("Sitka Text",Font.BOLD,23));

		JLabel lb1=new JLabel("Customer Name : "+customerName); 
		lb1.setBounds(150,60,300,30);
		lb1.setForeground(Color.black);
		lb1.setFont(new Font("Sitka Text",Font.BOLD,16));
		
		JLabel lb2=new JLabel("Street : "+street); 
		lb2.setBounds(150,80,200,30);
		lb2.setForeground(Color.black);
		lb2.setFont(new Font("Sitka Text",Font.BOLD,16));
		
		JLabel lb3=new JLabel("City : "+city); 
		lb3.setBounds(150,100,200,30);
		lb3.setForeground(Color.black);
		lb3.setFont(new Font("Sitka Text",Font.BOLD,16));

		JLabel lb4=new JLabel("Zip Code : "+zipcode); 
		lb4.setBounds(150,120,200,30);
		lb4.setForeground(Color.black);
		lb4.setFont(new Font("Sitka Text",Font.BOLD,16));

		JLabel lb5=new JLabel("Phone Num: "+contactNo); 
		lb5.setBounds(150,140,200,30);
		lb5.setForeground(Color.black);
		lb5.setFont(new Font("Sitka Text",Font.BOLD,16));

		
		JButton btn1=new JButton("OK");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(150,350,200,60);
		btn1.setFont(new Font("Sitka Text",Font.BOLD,23));
		
		jR.add(lb);
		jR.add(lb1);
		jR.add(lb2);
		jR.add(lb3);
		jR.add(lb4);
		jR.add(btn1); 
		jR.add(lb5);


		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
		        JOptionPane.showMessageDialog(null, "Your Order will Arrive in 1 hour.", "Thank You", JOptionPane.INFORMATION_MESSAGE);
		        System.exit(0);
			}
		});

		
		jR.setVisible(true);
	
	}
}
