import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
        public void showButton() {
            System.out.println("Button clicked");
            JFrame frame = new JFrame();
            frame.setVisible(true);
            JButton button = new JButton();
            frame.add(button);
            frame.setPreferredSize(new Dimension(500,500));
            button.setPreferredSize(new Dimension(400,400));
            button.setText("Click here for a fortune.");
            frame.pack();
            button.addActionListener(this);     
       }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Woohoo");
			int rand = new Random().nextInt(5);
            if (rand == 0) {
            	JOptionPane.showMessageDialog(null, "You will find money on the floor tomorrow.");
			}
            else if (rand == 1) {
				JOptionPane.showMessageDialog(null, "You will have no homework today.");
			}
            else if (rand == 2) {
				JOptionPane.showMessageDialog(null, "You will end class early today.");
			}
            else if (rand == 3) {
				JOptionPane.showMessageDialog(null, "You will not have school tomorrow.");
			}
            else {
				JOptionPane.showMessageDialog(null, "You will have lots of homework due tomorrow.");
			}
			
}
}

        
    