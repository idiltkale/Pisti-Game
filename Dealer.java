public class Dealer {
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String deste[] = Cards.deste;
    public static String board[] = Cards.board;

    public static int counter = 0;
    public static int counter2= 1;
    public static int counter3=12;
    public static int m=0;
    public static int c=0;

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
}
