import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


class Thankyou extends JFrame
{
	JLabel thnx;
	
	Thankyou()
	{
		ImageIcon thankyou=new ImageIcon("C:\\Users\\CHIRAG\\Documents\\Java Programs\\thankyou1.jpg");
		thnx=new JLabel(thankyou);
		thnx.setBounds(0,0,1360,768);
		add(thnx);
	}
}
