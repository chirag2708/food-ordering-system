import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 


class MenuDemo1 extends JFrame implements ActionListener
{
	JLabel l7,l8,limage1;
	JCheckBox e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
	JCheckBox f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
	
	JComboBox eb1,eb2,eb3,eb4,eb5,eb6,eb7,eb8,eb9,eb10;
	JComboBox fb1,fb2,fb3,fb4,fb5,fb6,fb7,fb8,fb9,fb10;
	
	JButton b2,prev1;
	int total2;
	MenuDemo p;
	int user_id;
	
	ArrayList<String> selectedItems;
	ArrayList<String> quantityArray;
	
	MenuDemo1(int x,MenuDemo obj,int user_id,ArrayList<String> obj1,ArrayList<String> obj2)
	{
		selectedItems=obj1;
		quantityArray=obj2;
		
		p=obj;
		total2=x;
		this.user_id = user_id;
		
		ImageIcon veg=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\veg.jpg");
		l7=new JLabel(veg);
		
		ImageIcon nonveg=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\nonveg.jpg");
		l8=new JLabel(nonveg);
		
		ImageIcon j=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\menu.jpg");
		limage1=new JLabel(j);
		
		
		e1=new JCheckBox("DAL FRY     RS 180");
		e2=new JCheckBox("VEG HANDI     RS 250");
		e3=new JCheckBox("VEG KOLHAPURI     RS 270");
		e4=new JCheckBox("PANEER HANDI     RS 300");
		e5=new JCheckBox("PANEER KOLHAPURI     RS 320");
		e6=new JCheckBox("VEG PATIALA     RS 350");
		e7=new JCheckBox("VEG MALWANI     RS 250");
		e8=new JCheckBox("MUSHROOM HANDI     RS 270");
		e9=new JCheckBox("MUSHROOM FRY     RS 250");
		e10=new JCheckBox("FUN-N-FOOD SPECIAL     RS 500");
		
		f1=new JCheckBox("CHICKEN HANDI     RS 900");
		f2=new JCheckBox("CHICKEN KOLHAPURI     RS 450");
		f3=new JCheckBox("FISH CURRY     RS 600");
		f4=new JCheckBox("EGG CURRY     RS 300");
		f5=new JCheckBox("CHICKEN AMRITSARI     RS 350");
		f6=new JCheckBox("CHICKEN BBC     RS 700");
		f7=new JCheckBox("MUTTON KOLHAPURI     RS 550");
		f8=new JCheckBox("MUTTON CURRY     RS 500");
		f9=new JCheckBox("MUTTON MASALA     RS 500");
		f10=new JCheckBox("EGG BHURJI     RS 180");
	
		b2=new JButton("NEXT");
		prev1=new JButton("Previous");
		
		String qty[]={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",};
		
		eb1=new JComboBox(qty);
		eb2=new JComboBox(qty);
		eb3=new JComboBox(qty);
		eb4=new JComboBox(qty);
		eb5=new JComboBox(qty);
		eb6=new JComboBox(qty);
		eb7=new JComboBox(qty);
		eb8=new JComboBox(qty);
		eb9=new JComboBox(qty);
		eb10=new JComboBox(qty);
		
		fb1=new JComboBox(qty);
		fb2=new JComboBox(qty);
		fb3=new JComboBox(qty);
		fb4=new JComboBox(qty);
		fb5=new JComboBox(qty);
		fb6=new JComboBox(qty);
		fb7=new JComboBox(qty);
		fb8=new JComboBox(qty);
		fb9=new JComboBox(qty);
		fb10=new JComboBox(qty);
		
		l7.setBounds(45,113,300,20);
		l8.setBounds(445,113,300,20);
		limage1.setBounds(0,0,1360,768);
		
		e1.setBounds(180,150,300,20);
		eb1.setBounds(500,150,50,20);
		
		e2.setBounds(180,200,300,20);
		eb2.setBounds(500,200,50,20);
		
		e3.setBounds(180,250,300,20);
		eb3.setBounds(500,250,50,20);
		
		e4.setBounds(180,300,300,20);
		eb4.setBounds(500,300,50,20);
		
		e5.setBounds(180,350,300,20);
		eb5.setBounds(500,350,50,20);
		
		e6.setBounds(180,400,300,20);
		eb6.setBounds(500,400,50,20);
		
		e7.setBounds(180,450,300,20);
		eb7.setBounds(500,450,50,20);
		
		e8.setBounds(180,500,300,20);
		eb8.setBounds(500,500,50,20);
		
		e9.setBounds(180,550,300,20);
		eb9.setBounds(500,550,50,20);
		
		e10.setBounds(180,600,300,20);
		eb10.setBounds(500,600,50,20);
		
		
		f1.setBounds(580,150,300,20);
		fb1.setBounds(900,150,50,20);
		
		f2.setBounds(580,200,300,20);
		fb2.setBounds(900,200,50,20);
		
		f3.setBounds(580,250,300,20);
		fb3.setBounds(900,250,50,20);
		
		f4.setBounds(580,300,300,20);
		fb4.setBounds(900,300,50,20);
		
		f5.setBounds(580,350,300,20);
		fb5.setBounds(900,350,50,20);
		
		f6.setBounds(580,400,300,20);
		fb6.setBounds(900,400,50,20);
		
		f7.setBounds(580,450,300,20);
		fb7.setBounds(900,450,50,20);
		
		f8.setBounds(580,500,300,20);
		fb8.setBounds(900,500,50,20);
		
		f9.setBounds(580,550,300,20);
		fb9.setBounds(900,550,50,20);
		
		f10.setBounds(580,600,300,20);
		fb10.setBounds(900,600,50,20);
		
		
		b2.setBounds(1030,550,120,40);
		b2.setBackground(Color.white);
		
		prev1.setBounds(1030,500,120,40);
		prev1.setBackground(Color.white);
		
		
		limage1.add(l7);
		limage1.add(l8);
		add(limage1);
		
		limage1.add(b2);
		b2.addActionListener(this);
		
		limage1.add(prev1);
		prev1.addActionListener(this);
		
		limage1.add(e1);
		limage1.add(e2);
		limage1.add(e3);
		limage1.add(e4);
		limage1.add(e5);
		limage1.add(e6);
		limage1.add(e7);
		limage1.add(e8);
		limage1.add(e9);
		limage1.add(e10);
		
		limage1.add(f1);
		limage1.add(f2);
		limage1.add(f3);
		limage1.add(f4);
		limage1.add(f5);
		limage1.add(f6);
		limage1.add(f7);
		limage1.add(f8);
		limage1.add(f9);
		limage1.add(f10);
		
		limage1.add(eb1);
		limage1.add(eb2);
		limage1.add(eb3);
		limage1.add(eb4);
		limage1.add(eb5);
		limage1.add(eb6);
		limage1.add(eb7);
		limage1.add(eb8);
		limage1.add(eb9);
		limage1.add(eb10);
		
		limage1.add(fb1);
		limage1.add(fb2);
		limage1.add(fb3);
		limage1.add(fb4);
		limage1.add(fb5);
		limage1.add(fb6);
		limage1.add(fb7);
		limage1.add(fb8);
		limage1.add(fb9);
		limage1.add(fb10);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	    String s2;
		int x2;
		
		if(e1.isSelected())
		{
			selectedItems.add(e1.getText());
			s2=eb1.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+180*x2;
		}
		
		if(e2.isSelected())
		{
			selectedItems.add(e2.getText());
			s2=eb2.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+250*x2;
		}
		
		if(e3.isSelected())
		{
			selectedItems.add(e3.getText());
			s2=eb3.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+270*x2;
		}
		
		if(e4.isSelected())
		{
			selectedItems.add(e4.getText());
			s2=eb4.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+300*x2;
		}
		
		if(e5.isSelected())
		{
			selectedItems.add(e5.getText());
			s2=eb5.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+320*x2;
		}
		
		if(e6.isSelected())
		{
			selectedItems.add(e6.getText());
			s2=eb6.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+350*x2;
		}
		
		if(e7.isSelected())
		{
			selectedItems.add(e7.getText());
			s2=eb7.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+250*x2;
		}
		
		if(e8.isSelected())
		{
			selectedItems.add(e8.getText());
			s2=eb8.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+270*x2;
		}
		
		if(e9.isSelected())
		{
			selectedItems.add(e9.getText());
			s2=eb9.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+250*x2;
		}
		
		if(e10.isSelected())
		{
			selectedItems.add(e10.getText());
			s2=eb10.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+500*x2;
		}
		
		if(f1.isSelected())
		{
			selectedItems.add(f1.getText());
			s2=fb1.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+900*x2;
		}
		
		if(f2.isSelected())
		{
			
			selectedItems.add(f2.getText());
			s2=fb2.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+450*x2;
		}
		
		if(f3.isSelected())
		{
			selectedItems.add(f3.getText());
			s2=fb3.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+600*x2;
		}
		
		if(f4.isSelected())
		{
			selectedItems.add(f4.getText());
			s2=fb4.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+300*x2;
		}
		
		if(f5.isSelected())
		{
			selectedItems.add(f5.getText());
			s2=fb5.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+350*x2;
		}
		
		if(f6.isSelected())
		{
			selectedItems.add(f6.getText());
			s2=fb6.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+700*x2;
		}
		
		if(f7.isSelected())
		{
			selectedItems.add(f7.getText());
			s2=fb7.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+550*x2;
		}
		
		if(f8.isSelected())
		{
			selectedItems.add(f8.getText());
			s2=fb8.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+500*x2;
		}
		
		if(f9.isSelected())
		{
			selectedItems.add(f9.getText());
			s2=fb9.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+500*x2;
		}
		
		if(f10.isSelected())
		{
			selectedItems.add(f10.getText());
			s2=fb10.getSelectedItem().toString();
			quantityArray.add(s2);
			if(s2.equals(" "))
				x2=0;
			else
			x2=Integer.parseInt(s2);
			total2=total2+180*x2;
		}
		
		
		
		
			MenuDemo2 m3=new MenuDemo2(total2,this,user_id,selectedItems,quantityArray);
			m3.setSize(1360,768);
			m3.setTitle("BREADS/RICE");
			m3.setLocation(0,0);
			m3.setLayout(null);
			m3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		if (e.getSource()==prev1)
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
			m3.setVisible(true);
			
		}
	}
}
