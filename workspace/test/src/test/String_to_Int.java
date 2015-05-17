package test;

import javax.swing.JOptionPane;

public class String_to_Int {
public static void main(String[] args) {
	String a = "+10=";
	String convert = JOptionPane.showInputDialog("Type in a number.");
	System.out.print(convert+a);
	int integerConversion = Integer.parseInt(convert);
	integerConversion+=10;
	System.out.print(integerConversion);
}
}
