public class Dealer{
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String deck[] = Cards.deck;
    public static String board[] = Cards.board;
    public static int counter3=0;
    public static int m=0;
    public static int c=0;

    public void DealCardsFirst() {
        for (int i = 0; i < counter3 + 8; i++) {
            if (deck[i] != null) {
                if (i % 2 != 0) {
                    cmpcards[c] = deck[i];
                    deck[i] = null;
                    c++;
                } else if (i % 2 == 0) {
                    mycards[m] = deck[i];
                    deck[i] = null;
                    m++;
                }
            }
        }
        counter3 += 8;
        m = 0;
        c = 0;
        int boardstart = 0;
        for (int i = 8; i <= 11; i++) {
            board[boardstart] = deck[i];
            deck[i] = null;
            boardstart++;
        }
        counter3+=4;

        for(int i=0;i<4;i++) {
            if(cmpcards[i]!=null)Counter.CountForComp(cmpcards[i]);
        }
    }

    public void dealCards() {
        for (int i = 0; i < counter3 + 8; i++) {
            if (deck[i] != null) {
                if (i % 2 != 0) {
                    cmpcards[c] = deck[i];
                    deck[i] = null;
                    c++;
                } else if (i % 2 == 0) {
                    mycards[m] = deck[i];
                    deck[i] = null;
                    m++;
                }
            }
        }
        counter3 += 8;
        m = 0;
        c = 0;

        for(int i=0;i<4;i++) {
            if(cmpcards[i]!=null)Counter.CountForComp(cmpcards[i]);
        }
    }
}
