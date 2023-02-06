//Event handling

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class java_swing
{
	JFrame jf1;
	JButton b1,b2,b3,b4,b5,b6;

	java_swing()
	{
	jf1 = new JFrame();
	Container c = jf1.getContentPane();
	c.setLayout(new FlowLayout());
	/////////////////////
	b1 = new JButton("Button 1");
	c.add(b1);
	b1.setBackground(Color.YELLOW);
	//////////////////////////
	ImageIcon imic1 = new ImageIcon("sasuke.jpg");
	b2 = new JButton(imic1);
	c.add(b2);
	///////////////////////////
	ImageIcon imic2 = new ImageIcon("sasuke.jpg");
	b3 = new JButton("Sasuke",imic2);
	c.setButtonSize(20,20);
	c.add(b3);
	b3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"title border"));
	/////////////////////////////
	ImageIcon imic3 = new ImageIcon("sasuke.jpg");
	b4 = new JButton("Sasuke button",imic3);
	c.add(b4);
	b4.setHorizontalTextPosition(SwingConstants.CENTER);
	b4.setBorder(BorderFactory.createLineBorder(Color.red,5,true));
	jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	///////////////////
	b5 = new JButton("<html><font size=20 color=blue>BUTTON 5</font></html>");
	c.add(b5);
	////////////////////////////
	b6 = new JButton("<html><font size=20 color=blue>BUT</font><font size=10 color=red>TON 5</font></html>");
	c.add(b6);
	//////////////////////////////

	jf1.setVisible(true);
	jf1.setSize(500,500);

	}



}

public class swing_attributes
{
public static void main(String [] args)
{

new java_swing();



}
}