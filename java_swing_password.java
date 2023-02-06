// swing set password field

import java.awt.*;
import javax.swing.*;

class swing_password
{
	JFrame jf1;
	JLabel l1;
	JPasswordField jp1;

	swing_password()
	{
		jf1 = new JFrame();
		l1 = new JLabel("Enter Password");
		jp1 = new JPasswordField(20);
		Container c = jf1.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(l1);
		c.add(jp1);
		l1.setToolTipText("this is label 1");
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setSize(500,500);
		jf1.setVisible(true);




	}


}
public class java_swing_password
{
public static void main (String [] args)
{

new swing_password();


}

}