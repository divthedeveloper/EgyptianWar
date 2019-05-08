package EgyptianWarPackage;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Driver {

	public static void main (String [] args) throws IOException {
		Card[] a = new Card[52];
		Deck deck1 = new Deck(a);
		
		
		Card aceOfSpades = a[0];
		Card aceOfHearts = a[1];
		
		// create a JFrame
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a JPanel
		JPanel contentPane = new JPanel(new BorderLayout());

		JLabel cardLabel = new JLabel(
				new ImageIcon(aceOfSpades.getCardImage()));
		cardLabel.setSize(100, 100);
		
		JLabel cardLabel2 = new JLabel(
				new ImageIcon(aceOfHearts.getCardImage()));
		cardLabel.setSize(100, 100);
		

		contentPane.add(cardLabel, BorderLayout.SOUTH);
		contentPane.add(cardLabel2, BorderLayout.NORTH);
		window.add(contentPane);

		window.setVisible(true);
	}

}