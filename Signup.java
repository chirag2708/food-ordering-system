import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



class Signup extends JFrame implements ActionListener
{
	JLabel n1,n5,n7,n9,n10,n12,n14,nimage;
	JComboBox nb1;
	JButton nb2;
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
		nb2.setBounds(175,575,300,50);
		nb2.setFont(new Font("Cheque", Font.PLAIN, 20));
		nimage.add(nb2);
		nb2.setBackground(Color.white);
		nb2.addActionListener(this);
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==nb2)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini project","root","Funnfood13!");
				
				x=nb1.getSelectedItem().toString();
				String query="insert into accounts values(?,?,?,?,?,?,?,?,?)";
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
			
			FoodDemo f1=new FoodDemo();
			f1.setSize(1360,768);
			f1.setTitle("Online Food Ordering App");
			
			f1.setLayout(null);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	}
	
	
	
	
	
	public static void main(String args[])
		{
			
			Signup s1=new Signup();
			s1.setSize(1360,768);
			s1.setTitle("Sign up");
			
			s1.setLayout(null);
			s1.setVisible(true);
			s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
		
		}
}