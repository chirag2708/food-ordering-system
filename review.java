import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

class review extends JFrame implements ActionListener
{
	Container c;
	Bill prev;
	JTable jt;
	JScrollPane sp;
	JButton b1;
	
	ArrayList<String> selectedItems;
	ArrayList<String> quantityArray;
	String column[]={"Item Name","Quantity"};
	String data[][];
	
	
	review(Bill obj,ArrayList<String> obj1,ArrayList<String> obj2)
	{
		
		//this.setLayout(null);
		prev=obj;
		
		selectedItems=obj1;
		quantityArray=obj2;
		
		data=new String[selectedItems.size()][2];
		System.out.println(selectedItems);
		System.out.println(quantityArray);
		b1=new JButton("BACK");
        for(int i=0;i<selectedItems.size();i++)
		{
			data[i][0]=selectedItems.get(i);
			data[i][1]=quantityArray.get(i);
		}
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(data[i][j]);
			}
		}
		
		
		 jt=new JTable(data,column);
		sp=new JScrollPane(jt);
		//b1.setBounds(150, 310, 100, 25);
       // sp.setBounds(20,200,250,150);
		//add(sp);
		//sp.setVisible(true);
				 
		add(sp,BorderLayout.CENTER);
		 add(b1,BorderLayout.SOUTH);
		 b1.addActionListener(this);
		 this.setVisible(true);
		 this.setSize(600,200);
	}
	
	public void actionPerformed(ActionEvent e)
				{
					if(e.getActionCommand().equals("BACK"))
					{
						this.setVisible(false);
						prev.setVisible(true);
					}
				}
}