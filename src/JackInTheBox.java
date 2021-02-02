import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
	
	int clicks = 0;
	JButton button = new JButton();
	
public void start() {
	
	JFrame frame = new JFrame();
	frame.setPreferredSize(new Dimension(500, 500));
	button.setPreferredSize(new Dimension(300, 300));
	button.setText("Surprise!");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.addActionListener(this);
	frame.add(button);
	frame.pack();
	
}
	
private void showPicture(String fileName) {
    try {
        JLabel imageLabel = createLabelImage(fileName);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
	try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
}
private void playSound(String soundFile) { 
    try {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
        sound.play();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource() == button){
	clicks += 1;	
	System.out.println(clicks);
	}
	
	if (clicks == 5) {
		String image = "JackInTheBox.png";
		String sound = "homer-woohoo.wav";
		showPicture(image);
		playSound(sound);
	}
	
}

}