/**
 * 
 */

/**
 * @author Yee
 *
 */
public class PlayingWithCards {

    public enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;
        
        highCard = Rank.ACE;
        faceCard = Rank.KING;
        card1 = Rank.NINE;
        card2 = Rank.TWO;
        
        System.out.println("A blackjack hand: " + highCard +
                            " and " + faceCard);
        
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;
        
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val+card2Val));

    }

}
