package cardgameweek4;
/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author dancye, 2019
 */
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateDeck();
                for(Card c: ch.deck)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
                
                ch.shuffleDeck();
                
                for(Card c: ch.shuffledDeck)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
                
                System.out.println();
                System.out.println();
                ch.splitDeck();
                
                for(Card c: ch.deckP1)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
                
                System.out.println();
                System.out.println();
                
                for(Card c: ch.deckCPU)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
                
               
	}

}