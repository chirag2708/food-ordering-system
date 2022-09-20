import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



class Signup extends JFrame implements ActionListener
{
	JLabel n1,n5,n7,n9,n10,n12,n14,nimage;
	JComboBox nb1;
	JButton nb2,nb3;
	JTextField  n2,n3,n4,n6,n8,n11;
	JPasswordField n13,n15;
	String x;
	
	
	Signup()
	{
		ImageIcon signup=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\signup.jpg");
		nimage=new JLabel(signup);
		nimage.setBounds(0,0,1360,768);
		add(nimage);
		
		n1=new JLabel("Name:-");
		n1.setBounds(50,50,95,20);
		n1.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n1);
		
		n2=new JTextField("First Name");
		n2.setBounds(200,50,175,30);
		n2.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n2);
		
		
		
		
		n2.addFocusListener(new FocusListener()
		{
			
			
			@Override
			public void focusLost(FocusEvent e)
			{
				if (n2.getText().isEmpty())
				{
					n2.setForeground(Color.GRAY);
					n2.setText("First Name");
				}
			}
			@Override
			public void focusGained(FocusEvent e)
			{
				if (n2.getText().equals("First Name"))
				{
					n2.setText("");
					n2.setForeground(Color.BLACK);
				}
			}
		});
		
		
		
		
		n3=new JTextField("Middle Name");
		n3.setBounds(400,50,175,30);
		n3.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n3);
		
		
		
		n3.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			if (n3.getText().equals("Middle Name")) {
				n3.setText("");
				n3.setForeground(Color.BLACK);
			}
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (n3.getText().isEmpty()) {
				n3.setForeground(Color.GRAY);
				n3.setText("Middle Name");
			}
		}
		});
		
		
		
		
		n4=new JTextField("Last Name");
		n4.setBounds(600,50,175,30);
		n4.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n4);
		
		
		
		n4.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			if (n4.getText().equals("Last Name")) {
				n4.setText("");
				n4.setForeground(Color.BLACK);
			}
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (n4.getText().isEmpty()) {
				n4.setForeground(Color.GRAY);
				n4.setText("Last Name");
			}
		}
		});
		
		
		
		
		n5=new JLabel("Phone Number:-");
		n5.setBounds(50,125,200,25);
		n5.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n5);
		
		n6=new JTextField();
		n6.setBounds(300,125,300,30);
		n6.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n6);
		
		n7=new JLabel("E-Mail ID:-");
		n7.setBounds(50,200,200,25);
		n7.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n7);
		
		n8=new JTextField();
		n8.setBounds(300,200,300,30);
		n8.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n8);
		
		n9=new JLabel("Gender:-");
		n9.setBounds(50,275,200,25);
		n9.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n9);
		
		String gender[]={" ","MALE","FEMALE","Others"};
		
		nb1=new JComboBox(gender);
		nb1.setBounds(300,275,300,30);
		nimage.add(nb1);
		nb1.setBackground(Color.white);
		
		n10=new JLabel("Username:-");
		n10.setBounds(50,350,200,25);
		n10.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n10);
		
		n11=new JTextField();
		n11.setBounds(300,350,300,30);
		n11.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n11);
		
		
		n12=new JLabel("Password:-");
		n12.setBounds(50,425,200,25);
		n12.setFont(new Font("Cheque", Font.PLAIN, 25));
		nimage.add(n12);
		
		n13=new JPasswordField();
		n13.setBounds(300,425,300,30);
		n13.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n13);
		
		n14=new JLabel("Confirm Password:-");
		n14.setBounds(50,500,200,25);
		n14.setFont(new Font("Cheque", Font.PLAIN, 22));
		nimage.add(n14);
		
		n15=new JPasswordField();
		n15.setBounds(300,500,300,30);
		n15.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(n15);
		
		nb2=new JButton("Create Account");
		nb2.setBounds(70,575,290,50);
		nb2.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(nb2);
		nb2.setBackground(Color.white);
		nb2.addActionListener(this);
		
		nb3=new JButton("Back");
		nb3.setBounds(370,575,290,50);
		nb3.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(nb3);
		nb3.setBackground(Color.white);
		nb3.addActionListener(this);
		
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		FoodDemo f1=new FoodDemo();
		f1.setSize(1360,768);
		f1.setTitle("Online Food Ordering App");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			f1.setLayout(null);
		if (ae.getSource()==nb2)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini project","root","Funnfood13!");
				
				x=nb1.getSelectedItem().toString();
				//"insert into orders(item_name, price, quantity,user_id, order_date) values(?,?,?,?,?)";
				String query="insert into accounts(firstname,middlename,lastname,phoneno,mail,gender,username,passwrd,cpasswrd) values(?,?,?,?,?,?,?,?,?)";
				PreparedStatement st=con.prepareStatement(query);
				st.setString(1, n2.getText());//firstname
				st.setString(2, n3.getText());//middlename
				st.setString(3, n4.getText());//lastname
				st.setString(4, n6.getText());//phone number
				st.setString(5, n8.getText());//e-mail id
				st.setString(6, x);//gender
				st.setString(7, n11.getText());//username
				st.setString(8, n13.getText());//password
				st.setString(9, n15.getText());//confirm password
				st.execute();
				con.close();
				
				
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			this.setVisible(false);
			
			
			f1.setVisible(true);
			
			
		}
		else if(ae.getSource()==nb3)
		{
			this.setVisible(false);
			f1.setVisible(true);
		}
		
		
		
	}
	
	
}

class FoodDemo extends JFrame implements ActionListener
{
		JLabel limage,iusername,ipassword;
		JButton b1,b2;
		JTextField t;
		JPasswordField p;
		JOptionPane p1;
		
		int id;
		FoodDemo()
		{
			
			
			
			ImageIcon i=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\login4.jpg");
			limage=new JLabel(i);
			limage.setBounds(0,0,1360,768);
			add(limage);
			
			ImageIcon j=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\username.png");
			iusername=new JLabel(j);
			iusername.setBounds(485,410,30,30);
			limage.add(iusername);
			
			ImageIcon k=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\password.png");
			ipassword=new JLabel(k);
			ipassword.setBounds(485,460,30,30);
			limage.add(ipassword);
			
			
			
			
			t=new JTextField("Username");
			t.setBounds(525,410,300,30);
			limage.add(t);
			
			
			
			t.addFocusListener(new FocusListener()
		{
			
			
			@Override
			public void focusLost(FocusEvent e)
			{
				if (t.getText().isEmpty())
				{
					t.setForeground(Color.GRAY);
					t.setText("Username");
				}
			}
			@Override
			public void focusGained(FocusEvent e)
			{
				if (t.getText().equals("Username"))
				{
					t.setText("");
					t.setForeground(Color.BLACK);
				}
			}
		});
			
			
			
			p=new JPasswordField("Password");
			p.setBounds(525,460,300,30);
			limage.add(p);
			
			
			p.addFocusListener(new FocusListener()
		{
			
			
			@Override
			public void focusLost(FocusEvent e)
			{
				if (p.getText().isEmpty())
				{
					p.setForeground(Color.GRAY);
					p.setText("Password");
				}
			}
			@Override
			public void focusGained(FocusEvent e)
			{
				if (p.getText().equals("Password"))
				{
					p.setText("");
					p.setForeground(Color.BLACK);
				}
			}
		});
			
			
			
			
			b1=new JButton("Login");
			b1.setBounds(525,510,135,30);
			limage.add(b1);
			b1.addActionListener(this);
			
			b2=new JButton("Sign Up");
			b2.setBounds(690,510,135,30);
			limage.add(b2);
			b2.addActionListener(this);
			
			
			
			
			
			
		}
		public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b2)
		{
			this.setVisible(false);
			
			Signup s1=new Signup();
			s1.setSize(1360,768);
			s1.setTitle("Sign up");
			
			s1.setLayout(null);
			s1.setVisible(true);
			s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		if (e.getSource()==b1)
		{
			
			
			
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini project","root","Funnfood13!");
				Statement stmt=con.createStatement();
				String sql="Select * from accounts where username='"+t.getText()+"'and passwrd='"+p.getText().toString()+"'";
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					this.setVisible(false);
					this.id = rs.getInt("user_id");
					OrderDemo o1=new OrderDemo(id,this);
					o1.setSize(1360,768);
					o1.setTitle("Welcome Page");
					o1.setLocation(0,0);
					o1.setLayout(null);
					o1.setVisible(true);
					o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					System.out.println(id);
					
				}
				else				
				{
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
					
				}
				con.close();
			}
			catch(Exception ae)
			{
				System.out.println(ae);
			}
		}
	}
	
	
	public static void main(String args[])
	{
		FoodDemo f1=new FoodDemo();
		f1.setSize(1360,768);
		f1.setTitle("Online Food Ordering App");
		
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}