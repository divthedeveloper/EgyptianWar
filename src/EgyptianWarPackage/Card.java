package EgyptianWarPackage;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author Divam Kumar
 *
 */
public class Card {

	private String suit;
	private int rank;
	private BufferedImage cardImage;

	/**
	 * Constructor
	 * 
	 * @param suit
	 * @param rank
	 * @param cardImage
	 */
	public Card(int rank, String suit,
			BufferedImage cardImage, String fileName) {
		super();
		this.suit = suit;
		this.rank = rank;
		BufferedImage tempCardImage;
		try {
			tempCardImage = ImageIO.read(new File(fileName));
			this.cardImage = resize(tempCardImage, 200, 300);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Getters and Setters
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public BufferedImage getCardImage() {
		return cardImage;
	}

	public static BufferedImage resize(BufferedImage img, int newW, int newH) {
		Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
		BufferedImage dimg = new BufferedImage(newW, newH,
				BufferedImage.TYPE_INT_ARGB);

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
		return "Card [suit =" + suit + ", rank ="
				+ rank + ", cardImage=" + cardImage + "]";
	}
}
