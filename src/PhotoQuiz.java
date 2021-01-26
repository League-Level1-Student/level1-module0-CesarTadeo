/*
 *	Copyright (c) The League of Amazing Programmers 2013-2017
 *	Level 1
 */

import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

    public static void main(String[] args) throws Exception {
   	 JFrame quizWindow = new JFrame();
   	 quizWindow.setVisible(true);
   	 quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
   																 // close the window
   	 quizWindow.setPreferredSize(new Dimension(500, 500));

   	 // 1. find an image on the internet, and put its URL in a String variable (from
   	 // your browser, right click on the image, and select “Copy Image Address”)
   	 String image = "hedgehog.jpg";
   	 // 2. create a variable of type "Component" that will hold your image
   	 Component comp = loadImage(image);
   	 // 3. use the "createImage()" method below to initialize your Component

   	 // 4. add the image to the quiz window
   	 quizWindow.add(comp);
   	 // 5. call the pack() method on the quiz window
   	 quizWindow.pack();
   	 // 6. ask a question that relates to the image
   	 String question = JOptionPane.showInputDialog("What is the animal shown on the window?");
   	 // 7. print "CORRECT" if the user gave the right answer
   	 if (question.equalsIgnoreCase("hedgehog")) {
   		 JOptionPane.showMessageDialog(null, "CORRECT");
   	 } else {
   		 JOptionPane.showMessageDialog(null, "INCORRECT");
   	 }
   	 // 9. remove the component from the quiz window (you may not see the effect of
   	 // this until step 12)
   	 quizWindow.remove(comp);
   	 // 10. find another image and create it (might take more than one line of code)
   	 String image2 = "pug.jpg";
   	 // 11. add the second image to the quiz window
   	 Component comp2 = loadImage(image2);
   	 quizWindow.add(comp2);
   	 // 12. pack the quiz window
   	 quizWindow.pack();
   	 // 13. ask another question
   	 String question2 = JOptionPane.showInputDialog("What is the animal shown on the window?");
   	 // 14+ check answer, say if correct or incorrect, etc.
   	 if (question2.equalsIgnoreCase("pug")) {
   		 JOptionPane.showMessageDialog(null, "CORRECT");
   	 } else {
   		 JOptionPane.showMessageDialog(null, "INCORRECT");
   	 }
    }

    private static Component createImage(String imageUrl) throws MalformedURLException {
   	 URL url = new URL(imageUrl);
   	 Icon icon = new ImageIcon(url);
   	 JLabel imageLabel = new JLabel(icon);
   	 return imageLabel;
    }
    
    public static Component loadImage(String fileName){
   	 Component c = null;
   	 try
   	 {    ImageIcon i = new ImageIcon(ImageIO.read(new PhotoQuiz().getClass().getResourceAsStream(fileName)));
   	 c = new JLabel(i);
   	 }
   	 
   	 catch (IOException e) {
   		 
   		 return null;
   	 }
   	 return c;
    }

    /* OPTIONAL */
    // *14. add scoring to your quiz
    // *15. make something happen when mouse enters image
    // (imageComponent.addMouseMotionListener())
}


