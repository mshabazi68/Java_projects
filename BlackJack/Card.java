
public class Card {

	/*
	 * clubs -> 0 Dimonds -> 1 Hearts -> 2 Spades -> 3
	 *
	 * Ace -> 1 Jack -> 11 Queen -> 12 King -> 13
	 *
	 * 
	 * 
	 * private int rank; private int suit;
	 * 
	 * public Card(int rank, int suit) { this.rank = rank; this.suit = suit; }
	 * 
	 * public String toString() { String[] suits = { "Clubs", "Dimonds", "Hearts",
	 * "Spades" }; String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7",
	 * "8", "9", "10","Jack", "Queen", "King" }; String s = ranks[this.rank] +
	 * " Of " + suits[this.suit]; return s; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Card obj = new Card(11,1); System.out.println(obj);
	 * 
	 * }
	 */
	
	  public static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6",
	  "7", "8", "9", "10", "Jack", "Queen", "King"};
	  
	  public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts",
	  "Spades"};
	  
	  private final int rank;
	  
	  private final int suit;
	  
	/ * 
	 * Constructs a card of the given rank and suit.
	 */
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * Returns a negative integer if this card comes before the given card, zero if
	 * the two cards are equal, or a positive integer if this card comes after the
	 * card.
	 */
	public int compareTo(Card that) {
		if (this.suit < that.suit) {
			return -1;
		}
		if (this.suit > that.suit) {
			return 1;
		}
		if (this.rank < that.rank) {
			return -1;
		}
		if (this.rank > that.rank) {
			return 1;
		}
		return 0;
	}

	/**
	 * Returns true if the given card has the same rank AND same suit; otherwise
	 * returns false.
	 */
	public boolean equals(Card that) {
		return this.rank == that.rank && this.suit == that.suit;
	}

	/**
	 * Gets the card's rank.
	 */
	public int getRank() {
		return this.rank;
	}

	/**
	 * Gets the card's suit.
	 */
	public int getSuit() {
		return this.suit;
	}

	/**
	 * Returns the card's index in a sorted deck of 52 cards.
	 */
	public int position() {
		return this.suit * 13 + this.rank - 1;
	}

	/**
	 * Returns a string representation of the card.
	 */
	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}

}
