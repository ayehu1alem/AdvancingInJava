import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank){
    public enum Suit{CLUB, DIAMOND, HEART, SPADE;
        public char getImage(){
            return (new char[]{9827, 9830, 9829, 9824}[this.ordinal()]);
        }
    }

    public static Card getNumericCard(Suit suit, int cardNumber){
        if(cardNumber > 1 && cardNumber < 11){
            return new Card(suit, String.valueOf(cardNumber), cardNumber -2);
        }
        System.out.println("Invalid numeric Value");
        return null;
    }

    public static Card getFacedCard(Suit suit, char abrevated){
        int charIndex = "JQKA".indexOf(abrevated);

        if(charIndex > -1){
            return new Card(suit, "" + abrevated, charIndex + 9);
        }

        System.out.println("Invalid Character Value");
        return null;
    }

    public static List<Card> getStandardCard(){
        List<Card> deck = new ArrayList<>(52);
        for(Suit suit : Suit.values()){

            for(int i=2; i<=10; i++){
                deck.add(getNumericCard(suit, i));
            }

            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                deck.add(getFacedCard(suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card> deck){
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Card> deck, String description, int raw){
        System.out.println("----------------------------------");

        if(description != null){
            System.out.println(description);
        }

        int cardInRow = deck.size() / raw;
        for(int i=0; i<raw; i++){
            int start = i * cardInRow;
            int end = start + cardInRow;

            deck.subList(start, end).forEach(c -> System.out.print(" " + c));
            System.out.println();
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10")? 2 : 1;
        String facedString = face.substring(0, index);

        return "%s%s%d".formatted(facedString, suit.getImage(), rank + 1);
    }
}
