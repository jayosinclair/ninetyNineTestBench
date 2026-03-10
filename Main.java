public class Main {
    public static void main(String[] args) {
        
    int id = -1;

    id = 40;

    Card card = new Card(id);

        System.out.println("Card ID: " + id);

        card.setRank();
        card.setSuit();

        System.out.println("Suit: " + card.getSuit());
        System.out.println("Rank: " + card.getRank());
        System.out.println("String: " + card.toString());

    }
}
