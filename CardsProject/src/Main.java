import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<Card> deck = Card.getStandardCard();
       Card.printDeck(deck, "A new Deck of Cards", 4);

       Collections.shuffle(deck);
       Card.printDeck(deck, "Shuffle Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck", 4);
        var sortingAlgorism = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorism);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);

   


//        List<Card> tens = new ArrayList<>(deck.subList(32, 36));
//        Card.printDeck(tens, "Tens in deck", 1);
//
//        List<Card> kings = new ArrayList<>(deck.subList(44, 48));
//        Card.printDeck(kings, "Kings in deck", 1);
//
//        List<Card> allIn = new ArrayList<>(deck.subList(0, 52));
//        Card.printDeck(allIn, "All elements in deck", 4);
//        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
//        int searchIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorism);
//        System.out.println("Found Index:  " + searchIndex);
//
//        Card[] cardArray = new Card[13];
//        Card facedHearts = Card.getFacedCard(Card.Suit.HEART, 'A');
//        Card numericHearts = Card.getNumericCard(Card.Suit.HEART, 5);
//        System.out.println("Faced Hearts:    " + facedHearts);
//        System.out.println("Numeric Hearts:  " + numericHearts);
//
//        Arrays.fill(cardArray, facedHearts);
//        System.out.println("Card Array:  " + Arrays.toString(cardArray));
//        Arrays.fill(cardArray, numericHearts);
//        System.out.println("Card Array:  " + Arrays.toString(cardArray));
//
//
//        System.out.println("Frequency of tens:  " + Collections.frequency(deck, tens));
//       Collections.reverse(deck);
//       Card.printDeck(deck, "Reversed Deck", 4);
//       System.out.println(deck);
//
//       Arrays.fill(cardArray, facedHearts);
//       Card.printDeck(Arrays.asList(facedHearts), "Face of A Hearts", 1);
////
////
////
////       Card[] cardArray2 = new Card[13];
//       Card facedSpades = Card.getFacedCard(Card.Suit.SPADE, 'A');
//       Card numericSpades = Card.getNumericCard(Card.Suit.SPADE, 5);
////       Arrays.fill(cardArray2, facedSpades);
////       Card.printDeck(Collections.singletonList(facedSpades), "Face of A Spades", 1);
//
//       List<Card> cards = new ArrayList<>();
//       System.out.println();
//       Collections.addAll(cards, facedHearts);
//       Collections.addAll(cards, numericHearts);
//       Collections.addAll(cards, facedHearts);
//       Collections.addAll(cards, numericSpades);
//       Card.printDeck(cards, "Collections", 1);








    }
}
