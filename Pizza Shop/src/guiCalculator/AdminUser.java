package guiCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AdminUser {
	

	public static void main(String[] args)
	{
		
		JFrame firstF=new JFrame();
    	firstF.setTitle("LOGIN");
    	firstF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	firstF.setSize(400, 400);
    	firstF.setLocation(520,200);
    	firstF.setBackground(Color.LIGHT_GRAY);
    	firstF.setLayout(new FlowLayout(FlowLayout.LEFT));
    	
    	JLabel lb1=new JLabel("Push Button"); 
		lb1.setBounds(110,50,200,30);
		lb1.setForeground(Color.black);
		lb1.setFont(new Font("Sitka Text",Font.BOLD,22));
		
    	JButton btnAdmin=new JButton("Admin");
    	btnAdmin.setForeground(Color.WHITE);
    	btnAdmin.setBounds(135,100,100,40);	
    	btnAdmin.setFont(new Font("Sitka Text", Font.BOLD, 18));
    	btnAdmin.setBackground(Color.BLACK);
    	
    	JButton btnUser=new JButton("User");
    	btnUser.setForeground(Color.WHITE);
    	btnUser.setFont(new Font("Sitka Text", Font.BOLD, 18));
    	btnUser.setBackground(Color.BLACK);
    	btnUser.setBounds(135,160,100,40);
    	
        
    	firstF.add(lb1);
    	firstF.add(btnAdmin);
        firstF.add(btnUser);  
        
       firstF.setLayout(null);
        btnAdmin.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) 
        		{       		
             	 Admin adminObj=new Admin();       		
        		}
        		});
        btnUser.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) 
        		{
        		FirstFrame userObj=new FirstFrame();
        		}
        		});
        
        
        firstF.setVisible(true);
	}

}
