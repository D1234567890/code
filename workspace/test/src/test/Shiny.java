package test;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Shiny {

	public static void main(String[] args) {
		String a = JOptionPane
				.showInputDialog("How many shiny objects do you want?");
		int c = Integer.parseInt(a);
		for (int i = 0; i < c; i++) {
			playMisterZee();
		}
	}

	public static void playMisterZee() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(
							"https://github.com/joonspoon/league-jars/blob/master/shiny%20objects.wav?raw=true"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
