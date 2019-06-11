package cardgameweek4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * a class that models the Card Hand. A Card hand has an array of cards. How can
 * you change the size of the hand? how big is it right now?
 *
 * @suthor dancye, 2019.
 */

public class CardHand {

    private int handSize = 52;
    public Card[] deck = new Card[handSize];
    public Card[] shuffledDeck = new Card[handSize];
    public ArrayList<Card> deckP1 = new ArrayList<>(handSize/2);
    public ArrayList<Card> deckCPU = new ArrayList<>(handSize/2);
    

    /**
     * Add comments during class to explain what this method does.
     */
    public void generateDeck() {
        int countCards = 0;
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Value v : Card.Value.values()) {
                deck[countCards] = (new Card(s, v));
                countCards++;
            }
        }//end outter for
    }//end method

    public void shuffleDeck() {
        
        ArrayList<Integer> deckInd = new ArrayList<>(handSize);
        
        for (int dex = 0; dex < handSize; dex++){
            deckInd.add(dex);
        }
        System.out.println(deckInd);
        
        Collections.shuffle(deckInd);
        
        System.out.println(deckInd);
        
        for (int dex = 0; dex < handSize; dex++){
            shuffledDeck[dex] = deck[deckInd.get(dex)];
        }
    }
    
    public void splitDeck(){

        for(int dex = 0; dex < handSize; dex+=2){
           deckP1.add(shuffledDeck[dex]);
        }
        
        for(int dex = 1; dex < handSize; dex+=2){
            deckCPU.add(shuffledDeck[dex]);
        }
    }

}