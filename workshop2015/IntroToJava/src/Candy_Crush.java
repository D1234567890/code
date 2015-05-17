//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class Candy_Crush {

	public static void main(String[] args) {
		String dont=
JOptionPane.showInputDialog("Who don't you like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+dont);
		String like=
JOptionPane.showInputDialog("What's the name of your best friend?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, "Your friend "+like+" is as sweet as candy.");
	} 
}

