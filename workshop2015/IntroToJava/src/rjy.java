import java.util.Random;

import javax.swing.JOptionPane;

public class rjy
{

	public static void main(String[] args)
	{
		int a = new Random().nextInt(10);
		String input = JOptionPane.showInputDialog("Guess a number I'm thinking from 1-10!");
		int number = Integer.parseInt(input);
		while( number.notequals a){
			
		}
	}
}
