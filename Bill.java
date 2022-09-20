import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 

class Bill extends JFrame implements ActionListener
{
	JLabel lamount,bobj;
	JButton confirm,cancel,review;
	MenuDemo3 p;
	
	int user_id;
	
	ArrayList<String> selectedItems;
	ArrayList<String> quantityArray;
	
	Bill(int x,MenuDemo3 obj,int user_id,ArrayList<String> obj1,ArrayList<String> obj2)
	{
		
		
		selectedItems=obj1;
		quantityArray=obj2;
		
		p=obj;
		
		this.user_id = user_id;
		
		lamount=new JLabel();
		lamount.setBounds(600,280,400,200);
		
		ImageIcon bimage=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\bimage1.jpg");
		bobj=new JLabel(bimage);
		bobj.setBounds(0,0,1360,768);
		add(bobj);
		
		bobj.add(lamount);
		lamount.setText("Rs."+x);
		lamount.setFont(new Font("Cheque", Font.PLAIN, 54));
		lamount.setForeground(Color.white);
		
		cancel=new JButton("Previous");
		cancel.setBounds(150,470,200,50);
		cancel.setFont(new Font("Cheque", Font.PLAIN, 14));
		bobj.add(cancel);
		cancel.addActionListener(this);
		cancel.setBackground(Color.white);
		
		review=new JButton("Review Order");
		review.setBounds(300,550,200,50);
		review.setFont(new Font("Cheque", Font.PLAIN, 14));
		bobj.add(review);
		review.addActionListener(this);
		review.setBackground(Color.white);
		
		confirm=new JButton("Place Order");
		confirm.setBounds(450,470,200,50);
		confirm.setFont(new Font("Cheque", Font.PLAIN, 14));
		bobj.add(confirm);
		confirm.addActionListener(this);
		confirm.setBackground(Color.white);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		
		Thankyou t1=new Thankyou();
		t1.setSize(1360,768);
		t1.setTitle("Thankyou");
		t1.setLocation(0,0);
		t1.setLayout(null);
		
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (e.getSource()==cancel)
		{
			this.setVisible(false);
			p.setVisible(true);
		}	
		
		else if(e.getSource()==confirm)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini project","root","Funnfood13!");
			
				for(int i=0;i<selectedItems.size();i++)
					{
						System.out.println(selectedItems.size());
						for(String s: selectedItems){
							System.out.println(s);
						}
						String temp = selectedItems.get(i);
						
						String[] arrOfStr = temp.split("     RS ");
			 
						System.out.println(arrOfStr[0]);
						System.out.println(Double.parseDouble(arrOfStr[1]));
						
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
						Date date = new Date();  
						System.out.println(formatter.format(date)); 
						
						String query="insert into orders(item_name, price, quantity,user_id, order_date) values(?,?,?,?,?)";
						PreparedStatement st=con.prepareStatement(query);
						st.setString(1, arrOfStr[0]);
						st.setDouble(2, Double.parseDouble(arrOfStr[1]));
						st.setInt(3,Integer.parseInt(quantityArray.get(i)));
						st.setInt(4, user_id);
						st.setString(5, formatter.format(date));
						System.out.println(st);
						st.execute();

						
						/*
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
						Date now = new Date();  
						Select * from  orders where user_id=? and order_date<=?
						
					
						st.setInt(1, user_id);
						st.setString(2, formatter.format(now));
						*/

					}
						con.close();
			}
			catch (Exception excc)
			{
				System.out.println(excc);
			}
			
			
			this.setVisible(false);
			t1.setVisible(true);
		}
		   
		
		if(e.getSource()==review)
		{
			 review r=new review(this,selectedItems,quantityArray);
			r.setSize(1360,650);
			r.setTitle("Review");
			r.setLocation(0,0);
			
			r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setVisible(false);
			r.setVisible(true);
		}
	}
	
	
	
	
}
