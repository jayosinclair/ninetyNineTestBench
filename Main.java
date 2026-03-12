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

        for (int i = 0; i < 54; i++){

            System.out.println("\nCurrent Deck Size: " + deck.getCurrentCardCount());

            System.out.println("Card " + "#" + (i+1) + ": " + deck.getNextCard());

        }

        System.out.println("\nCurrent Deck Size: " + deck.getCurrentCardCount());


    }
}
