public class Cards {
    int deck[] = new int[52];
    public static String suits[] = { "♦", "♥", "♠", "♣" };
    public static String ranks[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    public static String mycards[] = new String[4];
    public static String cmpcards[] = new String[4];
    public static String board[] = new String[52];
    public static String deste[] = new String[52];
    public static int myPoint = Points.myPoint;
    public static int cmpPoint = Points.cmpPoint;
    public static String myWins[] = Points.myWins;
    public static String cmpWins[] = Points.cmpWins;

    public static int counter = 0;
    public static int counter2 = 1;
    public static int counter3 = 12;
    public static int m = 0;
    public static int c = 0;

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
                deste[counter] = null;
            }
            counter += 2;
        }
        for (int i = 0; i < 4; i++) {
            if (counter2 % 2 != 0) {
                cmpcards[(counter2 - 1) / 2] = deste[counter2];
                deste[counter2] = null;
            }
            counter2 += 2;
        }
        int boardstart = 0;
        for (int i = 8; i <= 11; i++) {
            board[boardstart] = deste[i];
            deste[i] = null;
            boardstart++;
        }
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
            }
        }
        // for(int x=0; x<13 ; x++) {
        // System.out.println("counter" + x + ":" + counterc[x]);
        // }
        // System.out.println("mypoints: " + mePlay.pointMe);
        // System.out.println("yourpoints: " + mePlay.pointYou);
        // System.out.println("boards points: " + mePlay.pointDesk);
        System.out.println("***********************");
    }

    public void PrintDeste() {
        for (String s : deste) {
            System.out.println(s);
        }
    }

    public void dealCards() {
        for (int i = 0; i < counter3 + 8; i++) {
            if (deste[i] != null) {
                if (i % 2 != 0) {
                    cmpcards[c] = deste[i];
                    deste[i] = null;
                    c++;
                } else if (i % 2 == 0) {
                    mycards[m] = deste[i];
                    deste[i] = null;
                    m++;
                }
            }
        }
        counter3 += 8;
        m = 0;
        c = 0;
    }

    public void Points() {
        for (String s : myWins)
            System.out.println(s);
        System.out.println("************************************");
        for (String s : cmpWins)
            System.out.println(s);
        System.out.println("******************");
        System.out.println("my p: " + Points.myPoint + "pisti: " + mePlay.mpisti);
        System.out.println("cmop p: " + Points.cmpPoint + "pisti: " + cmpPlay.cpisti);
        System.out.println();
    }
}
