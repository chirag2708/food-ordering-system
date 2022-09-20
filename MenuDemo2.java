import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 



class MenuDemo2 extends JFrame implements ActionListener
{
	JLabel l11,l12,l13,limage2;
	JCheckBox g1,g2,g3,g4,g5,g6,g7,g8,g9,g10;
	JCheckBox h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
	
	JComboBox gb1,gb2,gb3,gb4,gb5,gb6,gb7,gb8,gb9,gb10;
	JComboBox hb1,hb2,hb3,hb4,hb5,hb6,hb7,hb8,hb9,hb10;
	
	JButton b3,prev2;
	int total3;
	MenuDemo1 p;
	int user_id;
	
	ArrayList<String> selectedItems;
	ArrayList<String> quantityArray;
	
	MenuDemo2(int x,MenuDemo1 obj,int user_id,ArrayList<String> obj1,ArrayList<String> obj2)
	{
		
		selectedItems=obj1;
		quantityArray=obj2;
		
		total3=x;
		p=obj;
		this.user_id = user_id;
		
		ImageIcon roti=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\roti.jpg");
		l11=new JLabel(roti);
		
		ImageIcon vegrice=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\vegrice.jpg");
		l12=new JLabel(vegrice);
		
		ImageIcon j=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\menu.jpg");
		limage2=new JLabel(j);
		
		
		g1=new JCheckBox("ROTI     RS 15");
		g2=new JCheckBox("BUTTER ROTI     RS 20");
		g3=new JCheckBox("BUTTER GARLIC ROTI     RS 25");
		g4=new JCheckBox("NAAN     RS 40");
		g5=new JCheckBox("BUTTER NAAN     RS 45");
		g6=new JCheckBox("GARLIC NAAN     RS 50");
		g7=new JCheckBox("CHUR CHUR NAAN     RS 60");
		g8=new JCheckBox("CHEESE GARLIC NAAN     RS 70");
		g9=new JCheckBox("CHAPATI     RS 10");
		g10=new JCheckBox("SPECIAL CHAPATI     RS 15");
		
		h1=new JCheckBox("JEERA RICE     RS 200");
		h2=new JCheckBox("STEAM RICE     RS 180");
		h3=new JCheckBox("LEMON RICE     RS 210");
		h4=new JCheckBox("VEG BIRYANI     RS 250");
		h5=new JCheckBox("DUM BIRYANI     RS 300");
		
		ImageIcon nonvegrice=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\nonvegrice.jpg");
		l13=new JLabel(nonvegrice);
		
		h7=new JCheckBox("CHICKEN BIRYANI     RS 320");
		h8=new JCheckBox("MUTTON BIRYANI     RS 380");
		h9=new JCheckBox("CHICKEN DUM BIRYANI     RS 350");
		h10=new JCheckBox("HYDRABADI BIRYANI     RS 300");
	
		b3=new JButton("NEXT");
		prev2=new JButton("Previous");
		
		String qty[]={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",};
		
		gb1=new JComboBox(qty);
		gb2=new JComboBox(qty);
		gb3=new JComboBox(qty);
		gb4=new JComboBox(qty);
		gb5=new JComboBox(qty);
		gb6=new JComboBox(qty);
		gb7=new JComboBox(qty);
		gb8=new JComboBox(qty);
		gb9=new JComboBox(qty);
		gb10=new JComboBox(qty);
		
		hb1=new JComboBox(qty);
		hb2=new JComboBox(qty);
		hb3=new JComboBox(qty);
		hb4=new JComboBox(qty);
		hb5=new JComboBox(qty);
		
		hb7=new JComboBox(qty);
		hb8=new JComboBox(qty);
		hb9=new JComboBox(qty);
		hb10=new JComboBox(qty);
		
		
		
		l11.setBounds(45,113,300,20);
		l12.setBounds(445,113,300,20);
		limage2.setBounds(0,0,1360,768);
		l13.setBounds(445,400,300,20);
		
		g1.setBounds(180,150,300,20);
		gb1.setBounds(500,150,50,20);
		
		g2.setBounds(180,200,300,20);
		gb2.setBounds(500,200,50,20);
		
		g3.setBounds(180,250,300,20);
		gb3.setBounds(500,250,50,20);
		
		g4.setBounds(180,300,300,20);
		gb4.setBounds(500,300,50,20);
		
		g5.setBounds(180,350,300,20);
		gb5.setBounds(500,350,50,20);
		
		g6.setBounds(180,400,300,20);
		gb6.setBounds(500,400,50,20);
		
		g7.setBounds(180,450,300,20);
		gb7.setBounds(500,450,50,20);
		
		g8.setBounds(180,500,300,20);
		gb8.setBounds(500,500,50,20);
		
		g9.setBounds(180,550,300,20);
		gb9.setBounds(500,550,50,20);
		
		g10.setBounds(180,600,300,20);
		gb10.setBounds(500,600,50,20);
		
		
		h1.setBounds(580,150,300,20);
		hb1.setBounds(900,150,50,20);
		
		h2.setBounds(580,200,300,20);
		hb2.setBounds(900,200,50,20);
		
		h3.setBounds(580,250,300,20);
		hb3.setBounds(900,250,50,20);
		
		h4.setBounds(580,300,300,20);
		hb4.setBounds(900,300,50,20);
		
		h5.setBounds(580,350,300,20);
		hb5.setBounds(900,350,50,20);
		
		
		
		
		h7.setBounds(580,450,300,20);
		hb7.setBounds(900,450,50,20);
		
		h8.setBounds(580,500,300,20);
		hb8.setBounds(900,500,50,20);
		
		h9.setBounds(580,550,300,20);
		hb9.setBounds(900,550,50,20);
		
		h10.setBounds(580,600,300,20);
		hb10.setBounds(900,600,50,20);
		
		
		b3.setBounds(1030,550,120,40);
		b3.setBackground(Color.white);
		
		prev2.setBounds(1030,500,120,40);
		prev2.setBackground(Color.white);
		
		
		
		limage2.add(l11);
		limage2.add(l12);
		add(limage2);
		
		
		limage2.add(b3);
		b3.addActionListener(this);
		
		limage2.add(prev2);
		prev2.addActionListener(this);
		
		limage2.add(g1);
		limage2.add(g2);
		limage2.add(g3);
		limage2.add(g4);
		limage2.add(g5);
		limage2.add(g6);
		limage2.add(g7);
		limage2.add(g8);
		limage2.add(g9);
		limage2.add(g10);
		
		limage2.add(h1);
		limage2.add(h2);
		limage2.add(h3);
		limage2.add(h4);
		limage2.add(h5);
		limage2.add(l13);
		limage2.add(h7);
		limage2.add(h8);
		limage2.add(h9);
		limage2.add(h10);
		
		limage2.add(gb1);
		limage2.add(gb2);
		limage2.add(gb3);
		limage2.add(gb4);
		limage2.add(gb5);
		limage2.add(gb6);
		limage2.add(gb7);
		limage2.add(gb8);
		limage2.add(gb9);
		limage2.add(gb10);
		
		limage2.add(hb1);
		limage2.add(hb2);
		limage2.add(hb3);
		limage2.add(hb4);
		limage2.add(hb5);
		
		limage2.add(hb7);
		limage2.add(hb8);
		limage2.add(hb9);
		limage2.add(hb10);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	    String s3;
		int x3;
		
		if(g1.isSelected())
		{
			selectedItems.add(g1.getText());
			s3=gb1.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+15*x3;
		}
		
		if(g2.isSelected())
		{
			selectedItems.add(g2.getText());
			s3=gb2.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+20*x3;
		}
		
		if(g3.isSelected())
		{
			selectedItems.add(g3.getText());
			s3=gb3.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+25*x3;
		}
		
		if(g4.isSelected())
		{
			selectedItems.add(g4.getText());
			s3=gb4.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+40*x3;
		}
		
		if(g5.isSelected())
		{
			selectedItems.add(g5.getText());
			s3=gb5.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+45*x3;
		}
		
		if(g6.isSelected())
		{
			selectedItems.add(g6.getText());
			s3=gb6.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+50*x3;
		}
		
		if(g7.isSelected())
		{
			selectedItems.add(g7.getText());
			s3=gb7.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+60*x3;
		}
		
		if(g8.isSelected())
		{
			selectedItems.add(g8.getText());
			s3=gb8.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+70*x3;
		}
		
		if(g9.isSelected())
		{
			selectedItems.add(g9.getText());
			s3=gb9.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+10*x3;
		}
		
		if(g10.isSelected())
		{
			selectedItems.add(g10.getText());
			s3=gb10.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+15*x3;
		}
		
		if(h1.isSelected())
		{
			selectedItems.add(h1.getText());
			s3=hb1.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+200*x3;
		}
		
		if(h2.isSelected())
		{
			selectedItems.add(h2.getText());
			s3=hb2.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+180*x3;
		}
		
		if(h3.isSelected())
		{
			selectedItems.add(h3.getText());
			s3=hb3.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+210*x3;
		}
		
		if(h4.isSelected())
		{
			selectedItems.add(h4.getText());
			s3=hb4.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+250*x3;
		}
		
		if(h5.isSelected())
		{
			selectedItems.add(h5.getText());
			s3=hb5.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+300*x3;
		}
		
	
		
		if(h7.isSelected())
		{
			selectedItems.add(h7.getText());
			s3=hb7.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+320*x3;
		}
		
		if(h8.isSelected())
		{
			selectedItems.add(h8.getText());
			s3=hb8.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+380*x3;
		}
		
		if(h9.isSelected())
		{
			selectedItems.add(h9.getText());
			s3=hb9.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+350*x3;
		}
		
		if(h10.isSelected())
		{
			selectedItems.add(h10.getText());
			s3=hb10.getSelectedItem().toString();
			quantityArray.add(s3);
			if(s3.equals(" "))
				x3=0;
			else
			x3=Integer.parseInt(s3);
			total3=total3+300*x3;
		}
		
			MenuDemo3 m4=new MenuDemo3(total3,this,user_id,selectedItems,quantityArray);
			m4.setSize(1360,768);
			m4.setTitle("DESERTS");
			m4.setLocation(0,0);
			m4.setLayout(null);
			m4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (e.getSource()==prev2)
		{
			this.setVisible(false);
			p.setVisible(true);
		}	
		
		else
		{
			this.setVisible(false);
			
			
			m4.setVisible(true);
			
		}
	}
}
