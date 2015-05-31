// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		String website = "http://www.minecraft101.net/reference/images/village-plus-villager.jpg";
		String website1 = "http://fc09.deviantart.net/fs71/f/2012/350/a/a/minecraft_zombie_by_inuyasha0560-d5o8ic0.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		Component image1;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(website);
		image1 = createImage(website1);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ask = JOptionPane
				.showInputDialog("What is the creature on the left?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ask.equalsIgnoreCase("zombie")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		if (!ask.equalsIgnoreCase("zombie")) {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		quizWindow.remove(image1);
		// 10. find another image and create it

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
