import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 


class MenuDemo3 extends JFrame implements ActionListener
{
	JLabel l14,l15,l16,limage3;
	JCheckBox i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
	JCheckBox j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
	
	JComboBox ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10;
	JComboBox jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	
	JButton b4,prev3;
	int total4;
	MenuDemo2 p;
	
	int user_id;
	
	ArrayList<String> selectedItems;
	ArrayList<String> quantityArray;
	
	
	MenuDemo3(int x,MenuDemo2 obj,int user_id,ArrayList<String> obj1,ArrayList<String> obj2)
	{
		selectedItems=obj1;
		quantityArray=obj2;
		
		total4=x;
		p=obj;
		
		this.user_id = user_id;
		
		ImageIcon mocktail=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\mocktail.jpg");
		l14=new JLabel(mocktail);
		
		ImageIcon icecream=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\icecream.jpg");
		l15=new JLabel(icecream);
		
		ImageIcon k=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\menu.jpg");
		limage3=new JLabel(k);
		
		
		
		i1=new JCheckBox("MOJITO     RS 180");
		i2=new JCheckBox("ESPRESSO MARTINI     RS 220");
		i3=new JCheckBox("PIMM'S     RS 220");
		i4=new JCheckBox("BLUEBERRY MINT     RS 250");
		i5=new JCheckBox("PINA COLADA     RS 250");
		i6=new JCheckBox("VIRGIN MOJITO     RS 300");
		i7=new JCheckBox("RUMPUNCH     RS 220");
		i8=new JCheckBox("COSMOPOLITAN     RS 230");
		i9=new JCheckBox("NEGRONI     RS 200");
		i10=new JCheckBox("APEROL SPRITZ     RS 300");
		
		j1=new JCheckBox("VANILLA ICE-CREAM     RS 180");
		j2=new JCheckBox("CHOCOLATE ICE-CREAM     RS 200");
		j3=new JCheckBox("PAN ICE-CREAM     RS 220");
		j4=new JCheckBox("DRY-FRUIT FALOODA     RS 250");
		j5=new JCheckBox("DRINKING FALOODA     RS 220");
		
		ImageIcon brownie=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\brownie.jpg");
		l16=new JLabel(brownie);
		
		j7=new JCheckBox("GULAB JAMUN     RS 50");
		j8=new JCheckBox("WALNUT HALWA     RS 180");
		j9=new JCheckBox("GAJAR KA HALWA     RS 200");
		j10=new JCheckBox("CHOCOLATE BROWNIE     RS 250");
	
		b4=new JButton("CHECKOUT");
		prev3=new JButton("Previous");
		
		String qty[]={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",};
		
		ib1=new JComboBox(qty);
		ib2=new JComboBox(qty);
		ib3=new JComboBox(qty);
		ib4=new JComboBox(qty);
		ib5=new JComboBox(qty);
		ib6=new JComboBox(qty);
		ib7=new JComboBox(qty);
		ib8=new JComboBox(qty);
		ib9=new JComboBox(qty);
		ib10=new JComboBox(qty);
		
		jb1=new JComboBox(qty);
		jb2=new JComboBox(qty);
		jb3=new JComboBox(qty);
		jb4=new JComboBox(qty);
		jb5=new JComboBox(qty);
		
		jb7=new JComboBox(qty);
		jb8=new JComboBox(qty);
		jb9=new JComboBox(qty);
		jb10=new JComboBox(qty);
		
		
		
		l14.setBounds(45,113,300,20);
		l15.setBounds(445,113,300,20);
		limage3.setBounds(0,0,1360,768);
		l16.setBounds(445,400,300,20);
		
		i1.setBounds(180,150,300,20);
		ib1.setBounds(500,150,50,20);
		
		i2.setBounds(180,200,300,20);
		ib2.setBounds(500,200,50,20);
		
		i3.setBounds(180,250,300,20);
		ib3.setBounds(500,250,50,20);
		
		i4.setBounds(180,300,300,20);
		ib4.setBounds(500,300,50,20);
		
		i5.setBounds(180,350,300,20);
		ib5.setBounds(500,350,50,20);
		
		i6.setBounds(180,400,300,20);
		ib6.setBounds(500,400,50,20);
		
		i7.setBounds(180,450,300,20);
		ib7.setBounds(500,450,50,20);
		
		i8.setBounds(180,500,300,20);
		ib8.setBounds(500,500,50,20);
		
		i9.setBounds(180,550,300,20);
		ib9.setBounds(500,550,50,20);
		
		i10.setBounds(180,600,300,20);
		ib10.setBounds(500,600,50,20);
		
		
		j1.setBounds(580,150,300,20);
		jb1.setBounds(900,150,50,20);
		
		j2.setBounds(580,200,300,20);
		jb2.setBounds(900,200,50,20);
		
		j3.setBounds(580,250,300,20);
		jb3.setBounds(900,250,50,20);
		
		j4.setBounds(580,300,300,20);
		jb4.setBounds(900,300,50,20);
		
		j5.setBounds(580,350,300,20);
		jb5.setBounds(900,350,50,20);
		
		
		
		
		j7.setBounds(580,450,300,20);
		jb7.setBounds(900,450,50,20);
		
		j8.setBounds(580,500,300,20);
		jb8.setBounds(900,500,50,20);
		
		j9.setBounds(580,550,300,20);
		jb9.setBounds(900,550,50,20);
		
		j10.setBounds(580,600,300,20);
		jb10.setBounds(900,600,50,20);
		
		
		b4.setBounds(1030,550,120,40);
		b4.setBackground(Color.white);
		
		prev3.setBounds(1030,500,120,40);
		prev3.setBackground(Color.white);
		
		
		
		limage3.add(l14);
		limage3.add(l15);
		add(limage3);
		
		
		limage3.add(b4);
		b4.addActionListener(this);
		
		limage3.add(prev3);
		prev3.addActionListener(this);
		
		limage3.add(i1);
		limage3.add(i2);
		limage3.add(i3);
		limage3.add(i4);
		limage3.add(i5);
		limage3.add(i6);
		limage3.add(i7);
		limage3.add(i8);
		limage3.add(i9);
		limage3.add(i10);
		
		limage3.add(j1);
		limage3.add(j2);
		limage3.add(j3);
		limage3.add(j4);
		limage3.add(j5);
		
		limage3.add(l16);
		
		limage3.add(j7);
		limage3.add(j8);
		limage3.add(j9);
		limage3.add(j10);
	
		limage3.add(ib1);
		limage3.add(ib2);
		limage3.add(ib3);
		limage3.add(ib4);
		limage3.add(ib5);
		limage3.add(ib6);
		limage3.add(ib7);
		limage3.add(ib8);
		limage3.add(ib9);
		limage3.add(ib10);
		
		limage3.add(jb1);
		limage3.add(jb2);
		limage3.add(jb3);
		limage3.add(jb4);
		limage3.add(jb5);
		
		limage3.add(jb7);
		limage3.add(jb8);
		limage3.add(jb9);
		limage3.add(jb10);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	    
		String s4;
		int x4;
		
		if(i1.isSelected())
		{
			selectedItems.add(i1.getText());
			s4=ib1.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+180*x4;
		}
		
		if(i2.isSelected())
		{
			selectedItems.add(i2.getText());
			s4=ib2.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+220*x4;
		}
		
		if(i3.isSelected())
		{
			selectedItems.add(i3.getText());
			s4=ib3.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+220*x4;
		}
		
		if(i4.isSelected())
		{
			selectedItems.add(i4.getText());
			s4=ib4.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+250*x4;
		}
		
		if(i5.isSelected())
		{
			selectedItems.add(i5.getText());
			s4=ib5.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+250*x4;
		}
		
		if(i6.isSelected())
		{
			selectedItems.add(i6.getText());
			s4=ib6.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+300*x4;
		}
		
		if(i7.isSelected())
		{
			selectedItems.add(i7.getText());
			s4=ib7.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+220*x4;
		}
		
		if(i8.isSelected())
		{
			selectedItems.add(i8.getText());
			s4=ib8.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+230*x4;
		}
		
		if(i9.isSelected())
		{
			selectedItems.add(i9.getText());
			s4=ib9.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+200*x4;
		}
		
		if(i10.isSelected())
		{
			selectedItems.add(i10.getText());
			s4=ib10.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+300*x4;
		}
		
		if(j1.isSelected())
		{
			selectedItems.add(j1.getText());
			s4=jb1.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+180*x4;
		}
		
		if(j2.isSelected())
		{
			selectedItems.add(j2.getText());
			s4=jb2.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+200*x4;
		}
		
		if(j3.isSelected())
		{
			selectedItems.add(j3.getText());
			s4=jb3.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+220*x4;
		}
		
		if(j4.isSelected())
		{
			selectedItems.add(j4.getText());
			s4=jb4.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+250*x4;
		}
		
		if(j5.isSelected())
		{
			selectedItems.add(j5.getText());
			s4=jb5.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+220*x4;
		}
		
		
		
		if(j7.isSelected())
		{
			selectedItems.add(j7.getText());
			s4=jb7.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+50*x4;
		}
		
		if(j8.isSelected())
		{
			selectedItems.add(j8.getText());
			s4=jb8.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+180*x4;
		}
		
		if(j9.isSelected())
		{
			selectedItems.add(j9.getText());
			s4=jb9.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+200*x4;
		}
		
		if(j10.isSelected())
		{
			selectedItems.add(j10.getText());
			s4=jb10.getSelectedItem().toString();
			quantityArray.add(s4);
			if(s4.equals(" "))
				x4=0;
			else
			x4=Integer.parseInt(s4);
			total4=total4+250*x4;
		}
		
			
			
			Bill b=new Bill(total4,this,user_id,selectedItems,quantityArray);
			b.setSize(1360,768);
			b.setTitle("bill");
			b.setLocation(0,0);
			b.setLayout(null);
			b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (e.getSource()==prev3)
		{
			this.setVisible(false);
			p.setVisible(true);
		}	
		
		else
		{
			this.setVisible(false);
			b.setVisible(true);
			
		}
	}
}
