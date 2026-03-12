public class Main {
    public static void main(String[] args) {
        
    for (int i = 0; i < 52; i++){

        Card card = new Card(i);

        System.out.println("Suit: " + card.getSuit());
        System.out.println("Rank: " + card.getRank());
        System.out.println("String: " + card.toString());
        System.out.println("");

    }
    
    
    
    Deck deck = new Deck(1);

        System.out.println("\nCurrent Deck Size: " + deck.getCurrentCardCount());

        System.out.println("First Card: " + deck.getNextCard());

        System.out.println("Current Deck Size: " + deck.getCurrentCardCount());

        System.out.println("Second Card: " + deck.getNextCard());

        System.out.println("Current Deck Size: " + deck.getCurrentCardCount());

        System.out.println("Third Card: " + deck.getNextCard());

        System.out.println("Current Deck Size: " + deck.getCurrentCardCount());

        System.out.println("Fourth Card: " + deck.getNextCard());

        System.out.println("Current Deck Size: " + deck.getCurrentCardCount());





    }
}
