package test;

import java.util.Random;

import javax.swing.JOptionPane;

public class Hard {
public static void main(String[] args) {
	int low = 0;
	int med = 0;
	int hi = 0;
	
	for (int i = 0; i < 100; i++) {
		int a = new Random().nextInt(101);
		System.out.println(a);
		
		if (a >= 0 && a <= 33) {
			low++;
		}
		if (a >= 34 && a <= 65) {
			med++;
		}
		if (a >= 66 && a <= 100) {
			hi++;
		}
	}
	JOptionPane.showMessageDialog(null, low);
	JOptionPane.showMessageDialog(null, med);
	JOptionPane.showMessageDialog(null, hi);
}
}
