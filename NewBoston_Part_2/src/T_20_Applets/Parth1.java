package T_20_Applets;
import javax.swing.*;
import java.applet.*;
import java.awt.Graphics;

public class Parth1 extends JApplet
{
	private double sum;
	
	public void init()
	{
		String fn = JOptionPane.showInputDialog("Enter first num : ");
		String sn = JOptionPane.showInputDialog("Enter second num :");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("The sum is : "+sum , 25, 30);
	}
}
