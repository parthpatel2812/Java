package T_50_GUI;
import javax.swing.JOptionPane;

public class A
{
	public static void main(String[] args) 
	{
		String Fn =JOptionPane.showInputDialog("Enter First Numbe : ");
		String Sn =JOptionPane.showInputDialog("Enter Second Numbe : ");
		
		int num1 = Integer.parseInt(Fn);
		int num2 = Integer.parseInt(Sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"The Ans is "+sum, "The titel",JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
