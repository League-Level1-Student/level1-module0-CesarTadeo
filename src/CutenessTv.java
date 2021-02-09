import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();	
	
	public void start() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setVisible(true);
		
		button1.setText("duck");
		button2.setText("frog");
		button3.setText("unicorn");
		
		button1.setPreferredSize(new Dimension(200, 200));
		button2.setPreferredSize(new Dimension(200, 200));
		button3.setPreferredSize(new Dimension(200, 200));
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.pack();
		
	}

	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getSource() == button1){
			showDucks();
		}
		else if (arg0.getSource() == button2){
			showFrog();
		}
		else if (arg0.getSource() == button3){
			showFluffyUnicorns();
		}
	}
}
