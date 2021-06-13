import Elec.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class new_customer extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	new_customer()
	{
		setLocation(170,100);
		setSize(650,600);

		JPanel p=new JPanel();
		p.setLayout(new GridLayout(9,2,10,10));
		p.setBackground(Color.WHITE);
		
		l1=new JLabel("Name");
		t1=new JTextField();
		p.add(l1);
		p.add(t1);

		l2=new JLabel("Meter No.");
		t2=new JTextField();
		p.add(l2);
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

		b1=new JButton("Submit");
		b2=new JButton("Cancel");

		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		p.add(b1);
		p.add(b2);
		setLayout(new BorderLayout());

		add(p,"Center");

		ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("hicon1.jpg"));
		Image i3=ic1.getImage().getScaledInstance(150,300,Image.SCALE_DEFAULT);
		ImageIcon ic2=new ImageIcon(i3);
		l8=new JLabel(ic2);

		add(l8,"West");
		getContentPane().setBackground(Color.WHITE);

		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String q1;	
		String a=t1.getText();
		String c=t2.getText();
		String d=t3.getText();
		String e=t4.getText();
		String f=t5.getText();
		String g=t6.getText();
		String h=t7.getText();
		
		if(ae.getSource()==b1)
		{
			if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Fields cannot be blank");
			}
			else if(!a.matches("[a-zA-Z]+"))
			{
				JOptionPane.showMessageDialog(null,"Invalid Text input");
				t1.setText("");
			}
			else if(!g.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0=9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
			{
				JOptionPane.showMessageDialog(null,"Invalid Email");
				t6.setText("");
			}
			else if(!h.matches("(0/91)?[6-9][0-9]{9}"))
			{
				JOptionPane.showMessageDialog(null,"Invalid Phone number");
				t7.setText("");
			}
			else if(h.length()!=10)
			{
				JOptionPane.showMessageDialog(null,"Phone number should be at least 10 digits");
				t7.setText("");
			}
			
			else
			{	ResultSet r1=null;
				try
				{
				conn c1 =new conn();
				
				r1=c1.s.executeQuery("select * from customer where meter_number="+c);
				
				
				}catch(Exception e11){}
				try
				{
					if(r1==null)
					{
						q1="insert into customer values('"+c+"','"+a+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";				
						//c1.s.executeUpdate(q1);
						JOptionPane.showMessageDialog(null,"Customer Created");
						this.setVisible(false);
					}
					else if(r1!=null)
					{
						JOptionPane.showMessageDialog(null,"Customer Already Created");
						this.setVisible(false);
					}
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		if(ae.getSource()==b2)
		{
			dispose();
		}

	}
	public static void main(String[] args)
	{
		new new_customer().setVisible(true);
	}
}
