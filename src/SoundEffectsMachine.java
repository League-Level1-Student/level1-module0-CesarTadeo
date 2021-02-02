import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JApplet;
import javax.swing.JButton;

public class SoundEffectsMachine implements ActionListener {

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	String quack = "quack.wav";
	String ding = "ding.wav";
	String moo = "moo.wav";
	String cymbal = "cymbal.wav";
	
	public void start() {
		
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setVisible(true);
		
		button1.setText("quack");
		button2.setText("ding");
		button3.setText("moo");
		button4.setText("cymbal");
		
		button1.setPreferredSize(new Dimension(200, 200));
		button2.setPreferredSize(new Dimension(200, 200));
		button3.setPreferredSize(new Dimension(200, 200));
		button4.setPreferredSize(new Dimension(200, 200));
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.pack();
		
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
		if (arg0.getSource() == button1){
			playSound(quack);
		}
		else if (arg0.getSource() == button2){
			playSound(ding);
		}
		else if (arg0.getSource() == button3){
			playSound(moo);
		}
		else if (arg0.getSource() == button4){
			playSound(cymbal);
		}
	}
}
