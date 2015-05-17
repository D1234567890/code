package test;

import java.util.Random;

import javax.swing.JOptionPane;

public class Game {
	public static void main(String[] args) {
		int a = new Random().nextInt(10);
		String b = JOptionPane
				.showInputDialog("Guess what number I'm thinking of!");
		int c = Integer.parseInt(b);
		if (c == a) {
			JOptionPane.showMessageDialog(null, "How did you know?");
		}
		while (c != a) {
			if (c > a) {
				b = JOptionPane.showInputDialog("Lower");
				c = Integer.parseInt(b);
			} else if (c < a) {
				b = JOptionPane.showInputDialog("Higher");
				c = Integer.parseInt(b);
			} else if (c == a) {
				JOptionPane.showMessageDialog(null, "How did you know?");
			}
		}
	}
}
