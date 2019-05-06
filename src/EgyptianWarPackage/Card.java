package EgyptianWarPackage;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Divam Kumar
 *
 */
public class Card {
	private String faceName;
	private String face;
	private int faceValue;
	private BufferedImage cardImage;

	private String fileName;

	/**
	 * Constructor
	 * 
	 * @param faceName
	 * @param face
	 * @param faceValue
	 * @param cardImage
	 */
	public Card(String faceName, String face, int faceValue,
			BufferedImage cardImage) {
		super();
		this.faceName = faceName;
		this.face = face;
		this.faceValue = faceValue;
		this.cardImage = cardImage;
	}

	public String getFaceName() {
		return faceName;
	}

	public void setFaceName(String faceName) {
		this.faceName = faceName;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public BufferedImage getCardImage() {
		return cardImage;
	}
	
	public static BufferedImage resize(BufferedImage img, int newW, int newH) { 
	    Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();

	    return dimg;
	}  
	
	
	public void setCardImage(BufferedImage cardImage) {
		this.cardImage = cardImage;
	}

	@Override
	public String toString() {
		return "Card [faceName=" + faceName + ", face=" + face + ", faceValue="
				+ faceValue + ", cardImage=" + cardImage + "]";
	}

	public static void main(String[] args) throws IOException {
		BufferedImage aceofSpadesimage = ImageIO.read(new File(
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AS.png"));

		BufferedImage newimg = resize(aceofSpadesimage, 200, 300);
		
		Card aceOfSpades = new Card("Spades", "Ace", 1, newimg);
		// create a JFrame
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a JPanel
		JPanel contentPane = new JPanel(new BorderLayout());

		JLabel cardLabel = new JLabel(
				new ImageIcon(aceOfSpades.getCardImage()));
		cardLabel.setSize(100, 100);

		contentPane.add(cardLabel);
		window.add(contentPane);

		window.setVisible(true);
	}
}
