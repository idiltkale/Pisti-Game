public class Cards {
    int deck[] = new int[52];
    public static String suits[] = { "♦", "♥", "♠", "♣" };
    public static String ranks[] = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
    public static String mycards[] = new String[4];
    public static String yourcards[] = new String[4];
    public static String board[] = new String[4];
    String deste[] = new String[52];
    public static int counter = 0;
    public static int counter2 = 1;

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

    public void DealCardsFirst() {
        for (int i = 0; i < 4; i++) {
            if (counter % 2 == 0) {
                mycards[counter / 2] = deste[counter];
            }
            counter += 2;
        }
        for (int i = 0; i < 4; i++) {
            if (counter2 % 2 != 0) {
                yourcards[(counter2 - 1) / 2] = deste[counter2];
            }
            counter2 += 2;
        }
        int boardstart = 0;
        for (int i = 8; i <= 11; i++) {
            board[boardstart] = deste[i];
            boardstart++;
        }
    }

    public void PrintOurCards() {
        for (int i = 0; i < 4; i++) {
            System.out.println("my " + (i + 1) + ". " + "card: " + mycards[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("your " + (i + 1) + ". " + "card: " + yourcards[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("boards " + (i + 1) + "." + "card: " + board[i]);
        }
    }
}