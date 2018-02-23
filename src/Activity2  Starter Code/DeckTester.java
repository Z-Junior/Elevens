/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck[] decks = new Deck[]{
                new Deck(new String[]{"ace", "2", "3", "4", },
                        new String[]{"spades", "hearts", "diamonds", "clubs"},
                        new int[]{1, 2, 3, 4}
                ),
                new Deck(new String[]{"ace", "2", "3", "4", },
                        new String[]{"spades", "hearts", "diamonds", "clubs"},
                        new int[]{1, 2, 3, 4}
                ),
                new Deck(new String[]{"ace", "2", "3", "4", },
                        new String[]{"spades", "hearts", "diamonds", "clubs"},
                        new int[]{1, 2, 3, 4}
                )
        };

		for (Deck d : decks)
        {
            System.out.println(d.toString());
            System.out.println(d.deal());
        }


	}
}
