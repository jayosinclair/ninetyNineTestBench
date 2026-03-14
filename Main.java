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

        for (int i = 0; i < 34; i++){

            System.out.println("\nCurrent Deck Size: " + deck.getCurrentCardCount());

            System.out.println("Card " + "#" + (i+1) + ": " + deck.getNextCard());

        }

        System.out.println("\nCurrent Deck Size: " + deck.getCurrentCardCount());

        
        
        
        Player p1 = new Player("Jay");

        System.out.println(p1.getName());
        System.out.println(p1.getCurrentCardCount());
       
        Card nextCard = deck.getNextCard();

        p1.addCard(nextCard);
    
        Card myCard = p1.getCard(0);
        System.out.println(myCard.toString());

        System.out.println(p1.getCurrentCardCount());

        p1.playCard(0);

        System.out.println(p1.getCurrentCardCount());

        


    }


}