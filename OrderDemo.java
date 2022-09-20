import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


	class OrderDemo extends JFrame implements ActionListener
	{
			JLabel welcome, welcomeobj;
			JButton clickhere,porders,logout;
			int user_id;
			String x;
			FoodDemo prev;
			
			OrderDemo(int id,FoodDemo obj)
			{
				this.user_id=id;
				prev=obj;
				ImageIcon welcome=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\welcome.jpg");
				welcomeobj=new JLabel(welcome);
				welcomeobj.setBounds(0,0,1360,768);
				add(welcomeobj);
				
				
				clickhere=new JButton("Click here to Order");
				porders=new JButton("View Previous Orders");
				
				clickhere.setBounds(445,400,400,50);
				porders.setBounds(445,500,400,50);
				
				welcomeobj.add(clickhere);
				clickhere.addActionListener(this);
				clickhere.setBackground(Color.white);
				clickhere.setFont(new Font("Serif", Font.PLAIN, 24));
				
				welcomeobj.add(porders);
				porders.setBackground(Color.white);
				porders.setFont(new Font("Serif", Font.PLAIN, 24));
				porders.addActionListener(this);
				
				
				
				logout=new JButton("Logout");
				logout.setBounds(1100,250,100,40);
				logout.setFont(new Font("Cheque", Font.PLAIN, 20));
				welcomeobj.add(logout);
				logout.setBackground(Color.white);
				logout.setForeground(Color.black);
				logout.addActionListener(this);
			}
			
			public void actionPerformed(ActionEvent e)
			{
				MenuDemo m1=new MenuDemo(this, user_id);
				m1.setSize(1360,768);
				m1.setTitle("Starter");
				m1.setLocation(0,0);
				m1.setLayout(null);
				m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				PreviousOrders p1=new PreviousOrders(this,user_id);
				
				
				
				if(e.getSource()==clickhere)
				{
					this.setVisible(false);
					m1.setVisible(true);
				}
				
				if(e.getSource()==porders)
				{
					this.setVisible(false);
					p1.setVisible(true);
					
				}
				
				if(e.getSource()==logout)
				{
					this.setVisible(false);
					prev.setVisible(true);
					
				}
				
				
			
			}
			
			
		
		
		
		
		
		/*public static void main(String args[])
		{
			
			OrderDemo o1=new OrderDemo(user_id);
			o1.setSize(1360,768);
			o1.setTitle("Welcome Page");
			o1.setLocation(0,0);
			o1.setLayout(null);
			o1.setVisible(true);
			o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
		
		}
	*/
	}
	
	
