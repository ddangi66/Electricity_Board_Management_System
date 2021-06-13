import Elec.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.io.File;
import java.awt.image.BufferedImage;

public class Project extends JFrame implements ActionListener
{
	BufferedImage bIcon1,bIcon2,bIcon3;
	JButton b1,b2,b3;
	JLabel bl1,bl2,bl3;
	JFrame f;	
	Project()
	{
	 
		super("Electricity Billing System");
		//JFrame f=new JFrame("Electricity Billing System");
		setSize(1920,1030);
		setLayout(null);
		/*f.setVisible(true);
		f.setSize(1000,670);
		f.setLayout(null);*/

		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("elect1.jpg"));
		Image i3=ic.getImage().getScaledInstance(1200,670,Image.SCALE_DEFAULT);
		ImageIcon icc3=new ImageIcon(i3);
		JLabel ll=new JLabel(icc3);
		add(ll);
	  try
	  {
		JMenuBar mb=new JMenuBar();
		JMenu master=new JMenu("Master");
		JMenuItem m1=new JMenuItem("New Customer");
		JMenuItem m2=new JMenuItem("Customer Details");
		JMenuItem m3=new JMenuItem("Update Details");
		JMenuItem m4=new JMenuItem("Delete Customer");
		master.setForeground(Color.BLUE);

		m1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon1.png"));
		Image image1=icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		m1.setIcon(new ImageIcon(image1));
		m1.setMnemonic('D');
		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		m1.setBackground(Color.WHITE);
		

		m2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon2.png"));
		Image image2=icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		m2.setIcon(new ImageIcon(image2));
		m2.setMnemonic('M');
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
		m2.setBackground(Color.WHITE);


		m3.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon3.png"));
		Image image3=icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		m3.setIcon(new ImageIcon(image3));
		m3.setMnemonic('N');
		m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		m3.setBackground(Color.WHITE);


		m4.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon41=new ImageIcon(ClassLoader.getSystemResource("icon1.png"));
		Image image41=icon41.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		m4.setIcon(new ImageIcon(image1));
		m4.setMnemonic('U');
		m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
		m4.setBackground(Color.WHITE);

		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
	
//--------------------------------------------------------------------------------------------------------------//

		JMenu user=new JMenu("User");
		JMenuItem u1=new JMenuItem("Pay Bill");
		JMenuItem u2=new JMenuItem("Calculate Bill");
		JMenuItem u3=new JMenuItem("Last Bill");
		user.setForeground(Color.RED);

		u1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon4.png"));
		Image image4=icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		u1.setIcon(new ImageIcon(image4));
		u1.setMnemonic('P');
		u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		u1.setBackground(Color.WHITE);
		

		u2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon5.png"));
		Image image5=icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		u2.setIcon(new ImageIcon(image5));
		u2.setMnemonic('B');
		u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
		u2.setBackground(Color.WHITE);


		u3.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon6.png"));
		Image image6=icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		u3.setIcon(new ImageIcon(image6));
		u3.setMnemonic('L');
		u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
		u3.setBackground(Color.WHITE);

		
		u1.addActionListener(this);
		u2.addActionListener(this);
		u3.addActionListener(this);

//---------------------------------------------------------------------------------------------------------------------//


		JMenu report=new JMenu("Report");
		JMenuItem r1=new JMenuItem("Generate Bill");
		report.setForeground(Color.BLUE);

		r1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon7.png"));
		Image image7=icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		r1.setIcon(new ImageIcon(image7));
		r1.setMnemonic('R');
		r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		r1.setBackground(Color.WHITE);

		r1.addActionListener(this);

//--------------------------------------------------------------------------------------------------------------------//

		JMenu utility=new JMenu("Utility");
		JMenuItem ut1=new JMenuItem("Notepad");
		JMenuItem ut2=new JMenuItem("Calculator");
		JMenuItem ut3=new JMenuItem("Web Browser");
		utility.setForeground(Color.RED);

		ut1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon8.png"));
		Image image8=icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ut1.setIcon(new ImageIcon(image8));
		ut1.setMnemonic('C');
		ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		ut1.setBackground(Color.WHITE);
		

		ut2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon9.png"));
		Image image9=icon9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ut2.setIcon(new ImageIcon(image9));
		ut2.setMnemonic('X');
		ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		ut2.setBackground(Color.WHITE);


		ut3.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon10.png"));
		Image image10=icon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ut3.setIcon(new ImageIcon(image10));
		ut3.setMnemonic('W');
		ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
		ut3.setBackground(Color.WHITE);

		
		ut1.addActionListener(this);
		ut2.addActionListener(this);
		ut3.addActionListener(this);
//---------------------------------------------------------------------------------------------------------------------//

		JMenu exit=new JMenu("Exit");
		JMenuItem ex=new JMenuItem("Exit");
		report.setForeground(Color.BLUE);

		ex.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon11.png"));
		Image image11=icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ex.setIcon(new ImageIcon(image11));
		ex.setMnemonic('Z');
		ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		ex.setBackground(Color.WHITE);

		ex.addActionListener(this);

//---------------------------------------------------------------------------------------------------------------------//
	
		
		bIcon1=ImageIO.read(new File("icon6.png"));
		bIcon2=ImageIO.read(new File("icon7.png"));
		bIcon3=ImageIO.read(new File("icon3.png"));

		b1=new JButton(new ImageIcon(bIcon1));
		b2=new JButton(new ImageIcon(bIcon2));
		b3=new JButton(new ImageIcon(bIcon3));


		b1.setBounds(80,200,250,250);
		b2.setBounds(380,200,250,250);
		b3.setBounds(680,200,250,250);
	



		bl1=new JLabel("New Customer",SwingConstants.CENTER);
		bl2=new JLabel("Generate Bill",SwingConstants.CENTER);
		bl3=new JLabel("Pay Bill",SwingConstants.CENTER);

		Font f1=new Font("Dejavu Sans",Font.BOLD,18);

		bl1.setFont(f1);
		bl2.setFont(f1);
		bl3.setFont(f1);

		bl1.setForeground(Color.WHITE);
		bl2.setForeground(Color.WHITE);
		bl3.setForeground(Color.WHITE);

		bl1.setBounds(80,350,250,250);
		bl2.setBounds(380,350,250,250);
		bl3.setBounds(680,350,250,250);
	
		/*b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);*/

		
//---------------------------------------------------------------------------------------------------------------------//

	master.add(m1);
	master.add(m2);
	master.add(m3);
	master.add(m4);

	user.add(u1);
	user.add(u2);
	user.add(u3);

	report.add(r1);
	
	utility.add(ut1);
	utility.add(ut2);
	utility.add(ut3);

	exit.add(ex);

	mb.add(master);
	mb.add(user);
	mb.add(report);	
	mb.add(utility);
	mb.add(exit);


	setJMenuBar(mb);
	
	setContentPane(new JLabel(new ImageIcon("elect1.jpg")));
	

	add(b1);
	add(bl1);
	add(b2);
	add(bl2);
	add(b3);
	add(bl3);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	
	
	setFont(new Font("Senserif",Font.BOLD,16));
	//setLayout(new FlowLayout());
	setVisible(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}catch(IOException e){}

	}
	public void actionPerformed(ActionEvent ae)
	{
		String msg=ae.getActionCommand();
		if(ae.getSource()==b1)
		{
			new new_customer().setVisible(true);	
		}
		if(ae.getSource()==b2)
		{
			new generate_bill().setVisible(true);
		}
		if(ae.getSource()==b3)
		{
			new pay_bill().setVisible(true);
		}
		else if(msg.equals("Customer Details"))
		{
			new customer_details().setVisible(true);
		}else if(msg.equals("New Customer"))
		{
			new new_customer().setVisible(true);
		}else if(msg.equals("Update Details"))
		{
			new update().setVisible(true);
		}else if(msg.equals("Calculate Bill"))
		{
			new calculate_bill().setVisible(true);
		}else if(msg.equals("Delete Customer"))
		{
			new delete().setVisible(true);
		}
		else if(msg.equals("Pay Bill"))
		{
			new pay_bill().setVisible(true);
		}else if(msg.equals("Notepad"))
		{
			try
			{
				Runtime.getRuntime().exec("gedit");
			}catch(Exception e){}
		}else  if(msg.equals("Calculator"))
		{
			try
			{
				Runtime.getRuntime().exec("gcalctool");
			}catch(Exception e){}
		}else if(msg.equals("Web Browser"))
		{
			try
			{
				Runtime.getRuntime().exec("firefox");
			}catch(Exception e){}
		}else if(msg.equals("Exit"))
		{
			System.exit(0);
		}else if(msg.equals("Generate Bill"))
		{
			new generate_bill().setVisible(true);
		}
		else if(msg.equals("Last Bill"))
		{
			new LastBill().setVisible(true);
		}

	}
	public static void main(String[] args)
	{
		new Project().setVisible(true);
	}
}
