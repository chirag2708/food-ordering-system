import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


class MenuDemo extends JFrame implements ActionListener
{
	JLabel l3,l4,limage;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	JCheckBox d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
	
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
	JComboBox db1,db2,db3,db4,db5,db6,db7,db8,db9,db10;
	
	JButton b1,prev;
	int total1;
	OrderDemo p;
	int user_id;
	
	ArrayList<String> selectedItems = new ArrayList<>();
	ArrayList<String> quantityArray = new ArrayList<>();
	
	MenuDemo(OrderDemo obj, int user_id)
	{
		
		
		
		this.user_id = user_id;
		
		p=obj;
		ImageIcon veg=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\veg.jpg");
		l3=new JLabel(veg);
		
		ImageIcon nonveg=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\nonveg.jpg");
		l4=new JLabel(nonveg);
		
		ImageIcon i=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\menu.jpg");
		limage=new JLabel(i);
		
		c1=new JCheckBox("VEG. CRISPY     RS 180");
		c2=new JCheckBox("PANEER CRISPY     RS 200");
		c3=new JCheckBox("MUSHROOM CRISPY     RS 190");
		c4=new JCheckBox("PANEER TIKKA     RS 220");
		c5=new JCheckBox("MALAI PANEER TIKKA     RS 230");
		c6=new JCheckBox("PANEER ZAFRANI TIKKA     RS 220");
		c7=new JCheckBox("PANEER MAKHMALI     RS 250");
		c8=new JCheckBox("PANEER TANDOORI     RS 230");
		c9=new JCheckBox("VEG SPRING ROLL     RS 180");
		c10=new JCheckBox("MULTANI MUSHROOM     RS 210");
		
		d1=new JCheckBox("CHICKEN TIKKA     RS 200");
		d2=new JCheckBox("CHICKEN TANDOORI     RS 230");
		d3=new JCheckBox("CHICKEN CHEESE KABAB     RS 260");
		d4=new JCheckBox("PRAWNS/RAWAS TANDOORI     RS 350");
		d5=new JCheckBox("CHICKEN LOLLYPOP     RS 220");
		d6=new JCheckBox("CHICKEN TANDOORI LOLLYPOP     RS 220");
		d7=new JCheckBox("PROMFRET TANDOORI     RS 350");
		d8=new JCheckBox("FISH FRY     RS 300");
		d9=new JCheckBox("TANDOORI MACHLI     RS 320");
		d10=new JCheckBox("EGG OMLETTE     RS 100");
		
		b1=new JButton("NEXT");
		prev=new JButton("Previous");
		//System.out.println(c10.getText());
		
		String qty[]={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",};
		
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		
		db1=new JComboBox(qty);
		db2=new JComboBox(qty);
		db3=new JComboBox(qty);
		db4=new JComboBox(qty);
		db5=new JComboBox(qty);
		db6=new JComboBox(qty);
		db7=new JComboBox(qty);
		db8=new JComboBox(qty);
		db9=new JComboBox(qty);
		db10=new JComboBox(qty);
		
		
		l3.setBounds(45,113,300,20);
		l4.setBounds(445,113,300,20);
		limage.setBounds(0,0,1360,768);
		
		c1.setBounds(180,150,300,20);
		cb1.setBounds(500,150,50,20);
		
		
		c2.setBounds(180,200,300,20);
		cb2.setBounds(500,200,50,20);
		
		c3.setBounds(180,250,300,20);
		cb3.setBounds(500,250,50,20);
		
		c4.setBounds(180,300,300,20);
		cb4.setBounds(500,300,50,20);
		
		c5.setBounds(180,350,300,20);
		cb5.setBounds(500,350,50,20);
		
		c6.setBounds(180,400,300,20);
		cb6.setBounds(500,400,50,20);
		
		c7.setBounds(180,450,300,20);
		cb7.setBounds(500,450,50,20);
		
		c8.setBounds(180,500,300,20);
		cb8.setBounds(500,500,50,20);
		
		c9.setBounds(180,550,300,20);
		cb9.setBounds(500,550,50,20);
		
		c10.setBounds(180,600,300,20);
		cb10.setBounds(500,600,50,20);
		
		
		d1.setBounds(580,150,300,20);
		db1.setBounds(900,150,50,20);
		
		d2.setBounds(580,200,300,20);
		db2.setBounds(900,200,50,20);
		
		d3.setBounds(580,250,300,20);
		db3.setBounds(900,250,50,20);
		
		d4.setBounds(580,300,300,20);
		db4.setBounds(900,300,50,20);
		
		d5.setBounds(580,350,300,20);
		db5.setBounds(900,350,50,20);
		
		d6.setBounds(580,400,300,20);
		db6.setBounds(900,400,50,20);
		
		d7.setBounds(580,450,300,20);
		db7.setBounds(900,450,50,20);
		
		d8.setBounds(580,500,300,20);
		db8.setBounds(900,500,50,20);
		
		d9.setBounds(580,550,300,20);
		db9.setBounds(900,550,50,20);
		
		d10.setBounds(580,600,300,20);
		db10.setBounds(900,600,50,20);
		
		
		b1.setBounds(1030,550,120,40);
		b1.setBackground(Color.white);
		
		prev.setBounds(1030,500,120,40);
		prev.setBackground(Color.white);
		
		
		
		limage.add(l3);
		limage.add(l4);
		add(limage);
		
		limage.add(b1);
		b1.addActionListener(this);
		
		limage.add(prev);
		prev.addActionListener(this);
		
		limage.add(c1);
		limage.add(c2);
		limage.add(c3);
		limage.add(c4);
		limage.add(c5);
		limage.add(c6);
		limage.add(c7);
		limage.add(c8);
		limage.add(c9);
		limage.add(c10);
		
		limage.add(d1);
		limage.add(d2);
		limage.add(d3);
		limage.add(d4);
		limage.add(d5);
		limage.add(d6);
		limage.add(d7);
		limage.add(d8);
		limage.add(d9);
		limage.add(d10);
		
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(cb5);
		limage.add(cb6);
		limage.add(cb7);
		limage.add(cb8);
		limage.add(cb9);
		limage.add(cb10);
		
		limage.add(db1);
		limage.add(db2);
		limage.add(db3);
		limage.add(db4);
		limage.add(db5);
		limage.add(db6);
		limage.add(db7);
		limage.add(db8);
		limage.add(db9);
		limage.add(db10);
		
		
		
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		total1=0;
	    String s1;
		int x1;
		
		if(c1.isSelected())
		{
			selectedItems.add(c1.getText());
			s1=cb1.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+180*x1;
		}
		
		if(c2.isSelected())
		{
			selectedItems.add(c2.getText());
			s1=cb2.getSelectedItem().toString();
			quantityArray.add(s1);
			
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+200*x1;
		}
		
		if(c3.isSelected())
		{
			
			selectedItems.add(c3.getText());
			s1=cb3.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+190*x1;
		}
		
		if(c4.isSelected())
		{
			selectedItems.add(c4.getText());
			s1=cb4.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+220*x1;
		}
		
		if(c5.isSelected())
		{
			selectedItems.add(c5.getText());
			s1=cb5.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+230*x1;
		}
		
		if(c6.isSelected())
		{
			selectedItems.add(c6.getText());
			s1=cb6.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+220*x1;
		}
		
		if(c7.isSelected())
		{
			selectedItems.add(c7.getText());
			s1=cb7.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+250*x1;
		}
		
		if(c8.isSelected())
		{
			selectedItems.add(c8.getText());
			s1=cb8.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+230*x1;
		}
		
		if(c9.isSelected())
		{
			selectedItems.add(c9.getText());
			s1=cb9.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+180*x1;
		}
		
		if(c10.isSelected())
		{
			selectedItems.add(c10.getText());
			s1=cb10.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+210*x1;
		}
		
		if(d1.isSelected())
		{
			selectedItems.add(d1.getText());
			s1=db1.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+200*x1;
		}
		
		if(d2.isSelected())
		{
			selectedItems.add(d2.getText());
			s1=db2.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+230*x1;
		}
		
		if(d3.isSelected())
		{
			selectedItems.add(d3.getText());
			s1=db3.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+260*x1;
		}
		
		if(d4.isSelected())
		{
			selectedItems.add(d4.getText());
			s1=db4.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+350*x1;
		}
		
		if(d5.isSelected())
		{
			selectedItems.add(d5.getText());
			s1=db5.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+220*x1;
		}
		
		if(d6.isSelected())
		{
			selectedItems.add(d6.getText());
			s1=db6.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+220*x1;
		}
		
		if(d7.isSelected())
		{
			selectedItems.add(d7.getText());
			s1=db7.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+350*x1;
		}
		
		if(d8.isSelected())
		{
			selectedItems.add(d8.getText());
			s1=db8.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+300*x1;
		}
		
		if(d9.isSelected())
		{
			selectedItems.add(d9.getText());
			s1=db9.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+320*x1;
		}
		
		if(d10.isSelected())
		{
			selectedItems.add(d10.getText());
			s1=db10.getSelectedItem().toString();
			quantityArray.add(s1);
			if(s1.equals(" "))
				x1=0;
			else
			x1=Integer.parseInt(s1);
			total1=total1+100*x1;
		}
		
			MenuDemo1 m2=new MenuDemo1(total1,this,user_id,selectedItems,quantityArray);
			m2.setSize(1360,768);
			m2.setTitle("MAIN COURSE");
			m2.setLocation(0,0);
			m2.setLayout(null);
			
			m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (e.getSource()==prev)
		{
			this.setVisible(false);
			p.setVisible(true);
		}	

		else
		{
			
		/*try
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
			

		}
					con.close();
			}
			catch (Exception excc)
			{
				System.out.println(excc);
			}
			*/
			
			
			this.setVisible(false);
			
			
			m2.setVisible(true);
			
		}
	}
}	
