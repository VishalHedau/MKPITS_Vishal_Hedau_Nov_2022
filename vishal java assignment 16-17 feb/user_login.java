// student login page

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class user_info implements ActionListener
{
JFrame jf1,jf2;
Container c;

JLabel l1,l2;
JTextField jt1;
JPasswordField jp1;
JButton jb1,jb2;

user_info()
{
	jf1 = new JFrame();
	JFrame.setDefaultLookAndFeelDecorated(true);

	c = jf1.getContentPane();
	jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


	l1 = new JLabel("Enter Name :");
	//Font font= new Font("serif",Font.BOLD,18);
	l2 = new JLabel("Enter Password :");

	jt1 = new JTextField();
	jp1 = new JPasswordField(20);

	jb1 = new JButton("LOGIN");
	jb2 = new JButton("RESET");

//set layout and Bounds
jf1.setLayout(null);
l1.setBounds(50,50,300,30);
jt1.setBounds(150,50,300,30);
l2.setBounds(50,100,300,30);
jp1.setBounds(150,100,300,30);
jb1.setBounds(100,200,100,50);
jb2.setBounds(250,200,100,50);

c.add(l1);
c.add(l2);
c.add(jt1);
c.add(jp1);
c.add(jb1);
c.add(jb2);
//c.add(jt2);


	jf2 = new JFrame();
	this.actionPerformed(jb1);

	jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf2.setVisible(true);

jf1.setVisible(true);
jf1.setSize(500,500);

jb1.addActionListener(this);
jb2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==jb1)
	{
	System.out.println("Login");


	}
	if(e.getSource()==jb2)
	{
	System.out.println("Reset");
	}
	}

}
public class user_login
{
public static void main(String[] args)
{

new user_info();

}
}