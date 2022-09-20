import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

class PreviousOrders extends JFrame implements ActionListener
{
	
	int user_id;
	OrderDemo prev;
	Container c;
	
	JTable jt;
	JScrollPane sp;
	JButton b1;
	
	PreviousOrders(OrderDemo obj,int id)
	{
		this.user_id=id;
		prev=obj;
		
		c=getContentPane();
		String column[]={"Item Name","Price","Quantity","Date/time"};
		String data[][]=new String[1000][4];
		
		b1=new JButton("BACK");
		try{  
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini project","root","Funnfood13!");
               
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select item_name,price,quantity,order_date from orders where user_id="+user_id);
				int i=0;
                while(rs.next()==true) 
                       
                {
					
					
					data[i][0]=rs.getString(1);
                    data[i][1]=rs.getString(2);
                    data[i][2]=rs.getString(3);
                    data[i][3]=rs.getString(4);
                    
					i++;
                 }
                jt=new JTable(data,column);
				sp=new JScrollPane(jt);
				
				 add(sp,BorderLayout.CENTER);
				 add(b1,BorderLayout.SOUTH);
				 b1.addActionListener(this);
				 this.setSize(600,200);
				 //this.setVisible(true);
                con.close();  
				
            }
			catch(Exception ex)
                { 
                    System.out.println(ex);
                }  
		
		
		
		
		
		
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


