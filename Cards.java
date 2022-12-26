import java.util.Random;

public class Cards {
    int deckk[] = new int[52];
    public static String suits[] = { "♦", "♥", "♠", "♣" };
    public static String ranks[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    public static String mycards[] = new String[4];
    public static String cmpcards[] = new String[4];
    public static String board[] = new String[52];
    public static String deck[] = new String[52];
    public void Define() {
        for (int i = 0; i < deckk.length; i++) {
            deckk[i] = i;
        }
    }

    public void Shuffle() {
        for (int i = 0; i < deckk.length; i++) {
            int index = (int) (Math.random() * deckk.length);
            int temp = deckk[i];
            deckk[i] = deckk[index];
            deckk[index] = temp;
        }
        System.out.println("            ♡ Cards are shuffled ♡");
    }

    public void Display() {
        for (int i = 0; i < deckk.length; i++) {
            String suit = suits[deckk[i] / 13];
            String rank = ranks[deckk[i] % 13];
            deck[i] = (suit + rank + suit);
           // System.out.println(deck[i]);
        }
        System.out.println();
    }

    public void Cutting() {
        Random rd = new Random();
        int a = rd.nextInt(52);
        String topdeck[] = new String[a];
        String bottomdeck[] = new String[52-a];
        int temp =a;
        int m =0;
        int n=0;
        int k =0;
        int l=0;
        for(int i = 0 ;i<a ;i++) {
           topdeck[m] = deck[i];
           m++;
        }
        for(int i=a;i<deck.length ;i++) {
            bottomdeck[n]=deck[i];
            n++;
        }
        for(int i=0;i< 52-a ;i++) {
            deck[i]=bottomdeck[k];
            k++;
        }
        for(int i=52-a ;i<deck.length;i++) {
            deck[i]= topdeck[l];
            l++;
        }
        /*for (int i = 0; i < deckk.length; i++) {
            System.out.println(deck[i]);
        }*/
        System.out.println("     ♡ The deck is cut from the " + a + ". card ♡ ");
    }


    public void PrintOurCards() {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (mycards[i] != null) {
                System.out.println("              your " + (i + 1) + ". " + "card: " + mycards[i]);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (cmpcards[i] != null) {
                System.out.println("              computer's " + (i + 1) + ". " + "card: " + cmpcards[i]);
            }
        }
        System.out.println();

        for (int i = 51; i >= 0; i--) {
            if (board[i] != null) {
                System.out.println("                      "+ board[i]);
                //break;
            }
        }
        System.out.println("        ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡");
    }
}