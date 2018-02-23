import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = new Card[]{
                new Card("Ace", "Spade", 5),
                new Card("Queen", "Diamond", 10),
                new Card("King", "Clubs", 20)
        };

		for (Card c : cards)
            System.out.println(c.toString());

        System.out.println(cards[0].matches(cards[1]));
	}
}
