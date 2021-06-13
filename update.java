import Elec.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class update extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	Connection c=null;
 	Statement s=null;
	PreparedStatement ps1=null;
	update()
	{
		setLocation(350,200);
		setSize(650,600);

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

	

		l3=new JLabel("Address");
		t3=new JTextField();
		p.add(l3);
		p.add(t3);

		l4=new JLabel("State");
		t4=new JTextField();
		p.add(l4);
		p.add(t4);

		l5=new JLabel("City");
		t5=new JTextField();
		p.add(l5);
		p.add(t5);

		l6=new JLabel("Email");
		t6=new JTextField();
		p.add(l6);
		p.add(t6);

		l7=new JLabel("Phone Number");
		t7=new JTextField();
		p.add(l7);
		p.add(t7);

		b1=new JButton("Update");
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
		
		if(ae.getSource()==b1)
		{
		try
		{
			int ip=Integer.parseInt(t1.getText());
			
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://192.168.16.1/BG21","BG21","");
			ps1=c.prepareStatement("Update customer set name=?, address=?, state=?, city=?, email=?, phone=? where customer.meter_number="+ip);
		        ps1.setString(1,t2.getText());
			ps1.setString(2,t3.getText());
			ps1.setString(3,t4.getText());
			ps1.setString(4,t5.getText());
			ps1.setString(5,t6.getText());
			ps1.setString(6,t7.getText());
			//ps1.setInt(7,ip);
			int f=ps1.executeUpdate();
			System.out.println(f);
			if(f>0)
			{
				JOptionPane.showMessageDialog(null,"Data Updated Successfully","Success",JOptionPane.PLAIN_MESSAGE);
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				
			}
			else
				JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.PLAIN_MESSAGE);
				
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		}

	}
	public static void main(String[] args)
	{
		new update().setVisible(true);
	}
}
