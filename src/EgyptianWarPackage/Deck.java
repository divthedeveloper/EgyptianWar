package EgyptianWarPackage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Deck {

	private Card[] deck = new Card[52];

	public Deck(Card[] deck) throws IOException {
		super();
		BufferedImage fillerImage = ImageIO.read(new File(
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AS.png"));

		// instantiate all the card objects
		for (int i = 0; i < this.deck.length; i++) {
			deck[i] = new Card(1, "suit", fillerImage,
					"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AS.png");
		}

		// I HAD TO INSTANTIATE ALL OF THEM MANUALLY

		// ACES
		Card aceOfSpades = new Card(1, "Spades", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AS.png");
		deck[0] = aceOfSpades;

		Card aceOfHearts = new Card(1, "Hearts", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AH.png");
		deck[1] = aceOfHearts;

		Card aceOfClubs = new Card(1, "Clubs", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AC.png");
		deck[2] = aceOfClubs;

		Card aceOfDiamonds = new Card(1, "Diamonds", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\AD.png");
		deck[3] = aceOfDiamonds;

		// 2s

		Card spades2 = new Card(2, "Spades", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\2S.png");
		deck[4] = spades2;

		Card hearts2 = new Card(2, "Hearts", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\2H.png");
		deck[5] = hearts2;

		Card clubs2 = new Card(2, "Clubs", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\2C.png");
		deck[6] = clubs2;

		Card diamonds2 = new Card(2, "Diamonds", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\2D.png");
		deck[7] = diamonds2;

		// 3s

		Card spades3 = new Card(3, "Spades", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\3S.png");
		deck[8] = spades3;

		Card hearts3 = new Card(2, "Hearts", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\3H.png");
		deck[9] = hearts3;

		Card clubs3 = new Card(2, "Clubs", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\3C.png");
		deck[10] = clubs3;

		Card diamonds3 = new Card(2, "Diamonds", fillerImage,
				"C:\\Users\\DK\\eclipse-workspace\\EgyptianWar\\src\\EgyptianWarPackage\\3D.png");
		deck[11] = diamonds3;

		this.deck = deck;

	}

	public Card[] returnDeck() {
		return deck;
	}
}
