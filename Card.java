//TODO: Complete the Card class according to the specifications.


/*

The Card class should store a card’s suit and rank. Its constructor receives an integer from 0 to
51 and computes the suit and rank accordingly. (It isn’t necessary to keep the original number.)
The Card class should be able to return:
1. Its numeric suit and rank
2. Its standard name, e.g., Ace of Clubs or Three of Hearts.
AI Tip: Research how to solve this part using the toString method.

A convenient way to create the standard names is to define String arrays for the rank and
suit names, then use the numeric values as indices to retrieve the appropriate names. Each
card does NOT need its own copies of these String arrays, so declare them in a way that all
Card objects share the arrays.

*/


/*

• Suits (0–3): diamonds (0), clubs (1), hearts (2), spades (3)
• Ranks (0–12): ace (0), two (1), three (2), …, Jack (10), Queen (11), King (12)

*/

public class Card {
    
    private static String[] suitName = {"Diamonds", "Clubs", "Hearts", "Spades"};
    private static String[] rankName = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


    private final int NUM_CARDS_PER_SUIT = 13;
    private int cardID;
    private int suit;
    private int rank;
    private String stdName;

    public Card (int cardID){

        this.cardID = cardID;
        this.suit = -1; //I elected to keep the cardID as an instance variable to use it in breaking out setRank and setSuit methods to make it more readable and not just
                        //perform calculations here using the parameter variable cardID.
        this.rank = -1;
        this.stdName = "";

    }


    public void setRank(){

        this.rank = this.cardID % NUM_CARDS_PER_SUIT; //The repeating pattern of ranks for each suit is like hours on a clock.
                            

    }

    public void setSuit(){

        this.suit = this.cardID / NUM_CARDS_PER_SUIT; //Integer division will get the suit.

    }

    public int getSuit(){

        return this.suit;

    }

    public int getRank(){

        return this.rank;

    }

    public String toString(){

        //Do AI research.

        /*
        
        A convenient way to create the standard names is to define String arrays for the rank and
        suit names, then use the numeric values as indices to retrieve the appropriate names. Each
        card does NOT need its own copies of these String arrays, so declare them in a way that all
        Card objects share the arrays.
        
        */

        String left = "";
        String middle = "of";
        String right = "";
        String composite = "";


        for (int i = 0; i < rankName.length; i++){

            if (i == this.getRank()){

                left = rankName[i];

            }

        }


        for (int i = 0; i < suitName.length; i++){

            if (i == this.getSuit()){

                right = suitName[i];

            }

        }

        composite = left + " " + middle + " " + right;

        return composite;

    }


}