// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic_8_Ball
{

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args)
	{
		int number  = new Random().nextInt(4);
//JOptionPane.showMessageDialog(null,number);
JOptionPane.showInputDialog("Ask a question!");
		if(number==0){
			String a=
			JOptionPane.showInputDialog(null, "yes");
			if (a.equalsIgnoreCase("How?")){
				JOptionPane.showMessageDialog(null, "I forgot!");
			}
		}
		if(number==1){
			JOptionPane.showInputDialog(null, "no");
		}
		if(number==2){
			JOptionPane.showInputDialog(null, "maybe?");
		}
		if (number==3){
			JOptionPane.showInputDialog(null, "who cares!?");
		}
	}

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe?"

	// 8. If the random number is 3

	// -- write your own answer

}
