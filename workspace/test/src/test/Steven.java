package test;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Steven {
	public static void main(String[] args) {
	String type =
	JOptionPane.showInputDialog("Type a scentence!");
	speak(type);
    // 4. make this repeat a lot of times
	}
static void speak(String words) {
	for(int a = 0; a <= 10; a++){
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}
}

// Copyright Wintriss Technical Schools 2014


