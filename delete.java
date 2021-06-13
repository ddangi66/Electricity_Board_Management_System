import Elec.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class delete extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	Connection c=null;
 	Statement s=null;
	PreparedStatement ps1=null;
	delete()
	{
		setLocation(150,100);
		setSize(550,400);

		JPanel p=new JPanel();
		p.setLayout(new GridLayout(9,2,10,10));
		p.setBackground(Color.WHITE);
		

		l2=new JLabel("Meter No.");
		t1=new JTextField();
		p.add(l2);
		p.add(t1);		

		l1=new JLabel("Name");
		t2=new JTextField();
		p.add(l1);
		p.add(t2);



		b1=new JButton("Delete");
//		b2=new JButton("Cancel");

		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

//		b2.setBackground(Color.BLACK);
//		b2.setForeground(Color.WHITE);

		p.add(b1);
//		p.add(b2);
		setLayout(new BorderLayout());

		add(p,"Center");

		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("hicon1.jpg"));
		Image i3=ic1.getImage().getScaledInstance(150,300,Image.SCALE_DEFAULT);
		ImageIcon ic2=new ImageIcon(i3);
		l8=new JLabel(ic2);

		add(l8,"West");
		getContentPane().setBackground(Color.WHITE);

		b1.addActionListener(this);
//		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		
		//if(ae.getSource()==b1)
		//{
			try
			{
				//int fp=Integer.parseInt(t1.getText());
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://192.168.16.1/BG21","BG21","");
				ps1=c.prepareStatement("delete from customer where meter_number=? and name=?");	
		        	ps1.setInt(1,Integer.parseInt(t1.getText()));
				ps1.setString(2,t2.getText());
					
				int f=ps1.executeUpdate();
						System.out.println(f);
				if(f>0)
				{
					JOptionPane.showMessageDialog(null,"Deleted Successfully","Success",JOptionPane.PLAIN_MESSAGE);
					t1.setText("");
					t2.setText("");
					
					
				}
				else
					JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.PLAIN_MESSAGE);
				
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		//}

	}
	public static void main(String[] args)
	{
		new delete().setVisible(true);
	}
}
