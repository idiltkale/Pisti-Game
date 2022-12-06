public class Cards {
    int deck[] = new int[52];
    public static String suits[] = { "♦", "♥", "♠", "♣" };
    public static String ranks[] = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
    public static String mycards[] = new String[4];
    public static String yourcards[] = new String[4];
    String deste[] = new String[52];

    public void Define() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public void Shuffle() {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public void Display() {
        for (int i = 0; i < deck.length; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            deste[i] = (suit + rank + suit);
            System.out.println(deste[i]);
        }
    }

    public void Cutting(int origin) {
        int[] topdeck = new int[52 - origin];
        int[] bottomdeck = new int[origin];
    }

    public void DealCards() {
        for (int i = 0; i < 4; i++) {
            int counter = 0;
            counter++;
            if (counter % 2 == 0) {
                mycards[counter] = deste[counter];
            } else {
                yourcards[counter] = deste[counter];
            }
        }
    }

    public void PrintOurCards() {
        for (int i = 0; i < 4; i++) {
            System.out.println("my cards: " + mycards[i]);
            System.out.println("your cards: " + yourcards[i]);
        }
    }
}