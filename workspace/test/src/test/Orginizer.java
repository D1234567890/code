package test;

import javax.swing.JOptionPane;

public class Orginizer {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("Type in a number!");
	int b = Integer.parseInt(a);
	if(b>=0 && b<=10){
		JOptionPane.showMessageDialog(null, "Low");
	}
	if(b>=11 && b<=100){
		JOptionPane.showMessageDialog(null, "Medium");
	}
	if(b>=101){
		JOptionPane.showMessageDialog(null, "High");
	}
}
}
