package test;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How do you want to be?  Rate it from 1-10.");
		int b = Integer.parseInt(a);
		dance(b);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
