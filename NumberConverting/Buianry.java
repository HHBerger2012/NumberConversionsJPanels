import javax.swing.*;

public class Buianry extends JFrame
{
	private static final long serialVersionUID = 1L;
	static JFrame frame = new JFrame();
	static int choice;
	public static void main(String[] args)
	    {
	    	doIntro();
	    }
	public static void doIntro()
	{
		Object[] options = {"Binary (Base 2)", "Hexadecimal (Base 16)", "Other"};
		ImageIcon icon =  new ImageIcon("betterfish.gif");
		choice = JOptionPane.showOptionDialog(null, 
			"What Would You Like Your Number To Be Converted To?",
			"Decide Your Number Conversion Method",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE, 
			icon,
			options, 
			options[1]);
			switch(choice)
			{
				case 0:
						{
							doBinary();
							break;
						}
				case 1:
						{
							doHex();
							break;
						}
				case 2:
						{
							doOther();
							break;
						}
			}
	}
	public static void doBinary()
	{
	    String s = (String)JOptionPane.showInputDialog(
		                    frame,
		                    "What Number Do You Want Converted to Binary?",
		                    "Binary Conversions",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    null,
		                    null); 
		String binary = "";
		Integer r = Integer.valueOf(s);
		while (r>0)
			{
					int rem = r % 2;
					binary = rem + binary;
					r = r / 2;		
			}
		System.out.println(binary);
		final ImageIcon icon =  new ImageIcon("betterfish.gif");
		JOptionPane.showMessageDialog(
				frame, 
                "The Binary Verion of " + s + " is " + binary, 
                "Binary Conversion Result", 
                JOptionPane.INFORMATION_MESSAGE, icon); 
	    }
	public static void doHex()
	{
		 String s = (String)JOptionPane.showInputDialog(
                 frame,
                 "What Number Do You Want Converted to Binary?",
                 "Binary Conversions",
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 null,
                 null); 
		 String hexa = "";
		 Integer r = Integer.valueOf(s);
		 int rem;   
	     char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	     while(r>0)
	     {
	       rem=r%16; 
	       hexa=hex[rem]+hexa; 
	       r=r/16;
	     }
		 final ImageIcon icon =  new ImageIcon("betterfish.gif");
		 JOptionPane.showMessageDialog(
				 frame, 
				 "The Hexadecimal Verion of " + s + " is " + hexa, 
				 "Binary Conversion Result", 
				 JOptionPane.INFORMATION_MESSAGE, icon); 
	}
	public static void doOther()
	{
		Object[] options = {"Base 5", "Base 8", "I don't want to convert"};
		ImageIcon icon =  new ImageIcon("betterfish.gif");
		choice = JOptionPane.showOptionDialog(null, 
			"What Would You Like Your Number To Be Converted To?",
			"Decide Your Number Conversion Method",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE, 
			icon,
			options, 
			options[1]);
			switch(choice)
			{
				case 0:
						{
							doFive();
							break;
						}
				case 1:
						{
							doEight();
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(
									 frame, 
									 "OK. Cya!", 
									 "Conversions", 
									 JOptionPane.INFORMATION_MESSAGE, icon); 
							break;
						}
			}
	}
	public static void doFive()
	{
		String s = (String)JOptionPane.showInputDialog(
                frame,
                "What Number Do You Want Converted to Base 5?",
                "Base 5 Conversions",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null); 
		String binary = "";
		Integer r = Integer.valueOf(s);
		while (r>0)
			{
				int rem = r % 5;
				binary = rem + binary;
				r = r / 5;		
			}
		System.out.println(binary);
		final ImageIcon icon =  new ImageIcon("betterfish.gif");
		JOptionPane.showMessageDialog(
				frame, 
				"The Base 5 Verion of " + s + " is " + binary, 
				"Base 5 Conversion Result", 
				JOptionPane.INFORMATION_MESSAGE, icon); 
	}
	public static void doEight()
	{
		String s = (String)JOptionPane.showInputDialog(
                frame,
                "What Number Do You Want Converted to Base 8?",
                "Base 8 Conversions",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null); 
		String binary = "";
		Integer r = Integer.valueOf(s);
		while (r>0)
			{
				int rem = r % 8;
				binary = rem + binary;
				r = r / 8;		
			}
		System.out.println(binary);
		final ImageIcon icon =  new ImageIcon("betterfish.gif");
		JOptionPane.showMessageDialog(
				frame, 
				"The Base 8 Verion of " + s + " is " + binary, 
				"Base 8 Conversion Result", 
				JOptionPane.INFORMATION_MESSAGE, icon); 
	}
} 