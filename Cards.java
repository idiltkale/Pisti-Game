public class Cards {
    int deck[] = new int[52];
    public static String suits[] = { "♦", "♥", "♠", "♣" };
    public static String ranks[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    public static String mycards[] = new String[4];
    public static String cmpcards[] = new String[4];
    public static String board[] = new String[52];
    public static String deste[] = new String[52];
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


    public void PrintOurCards() {
        System.out.println("***********************");
        for (int i = 0; i < 4; i++) {
            if (mycards[i] != null) {
                System.out.println("my " + (i + 1) + ". " + "card: " + mycards[i]);
            }
        }
          for (int i = 0; i < 4; i++) {
            if (cmpcards[i] != null) {
                System.out.println("computer's " + (i + 1) + ". " + "card: " + cmpcards[i]);
            }
        }

        for (int i = 51; i >= 0; i--) {
            if (board[i] != null) {
                System.out.println(board[i]);
                break;
            }
        }
        System.out.println("***********************");
    }

    public void PrintDeste() {
        for (String s : deste) {
            System.out.println(s);
        }
    }
}
