package test;

import java.util.Random;

import javax.swing.JOptionPane;

public class Slot_Machine {
public static void main(String[] args) {
	int a = new Random().nextInt(2);
	int b = new Random().nextInt(2);
	int c = new Random().nextInt(2);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	if(a==b && b==c){
		JOptionPane.showMessageDialog(null, "You Win!!");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "Too Bad!!");
	}
}
}
