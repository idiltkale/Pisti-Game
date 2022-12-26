import java.util.Random;

public class cmpPlay {
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String board[] = Cards.board;
    public static String cmpWins[] = Points.cmpWins;
    public static String onBoard;
    public static String cardNum;
    public static int cpisti=0;
    boolean b = false;
    int i =0;
    boolean boolee;

    public void cmpP (String cardNum) {
        System.out.println("            computer took all the cards");
        for (int k = (board.length - 1); k >= 0; k--) {
            if (board[k] != null) {
                board[k + 1] = cardNum;
                break;
            }
        }
        for(int y=0;y<cmpWins.length;y++) {
            if(cmpWins[y]==null&&board[i]!=null) {
                cmpWins[y]=board[i];
                if(i!=52) {
                    board[i]=null;
                    i++;
                }
                else{
                    i++;
                    break;
                }
            }
            else i=0;
        }
    }
    public String cmpRandom(int index) {
        Random rd = new Random();
        for(int i=0; i< cmpcards.length;i++) {
            String s = Counter.CheckCounts(cmpcards[i]);
            if (s != null){
                cardNum = s;
            }
            else {
                cardNum = null;
            }
        }
        if(cardNum==null) {
            String[] cmprandom = { cmpcards[0], cmpcards[1], cmpcards[2], cmpcards[3] };
            index = rd.nextInt(cmprandom.length);
            cardNum = cmprandom[index];
            while ((cardNum == null) || (cardNum.charAt(1) == 'J')) {
                index = rd.nextInt(cmprandom.length);
                cardNum = cmprandom[index];
            }
        }
        Counter.PlayThisCard=null;
        return cardNum;
    }

    public void cmpTurn() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            }
        }

        if (board[0] == null) {
            String cardNum = cmpRandom(0);
            board[0] = cardNum;

            int x=3;
            int y=0;
            for(int a=0;a<4;a++) {
                if (cardNum.equals(cmpcards[a])) {
                    if(a!=3) {
                        for(int i=0;i<x;i++) {
                            cmpcards[y]=null;
                            cmpcards[y]=cmpcards[y+1];
                            y++;
                        }
                    }
                    cmpcards[3]=null;
                }
                x--;
                y++;
            }

            for (int i = 0; i < board.length; i++) {
                if (board[i] != null) {
                    onBoard = board[i];
                }
            }
        }

        else {

            for(int i=0;i<4;i++) {

                if (cmpcards[i] != null && cmpcards[i].charAt(1) == onBoard.charAt(1) && cmpcards[i].charAt(1) != 'J' ) {
                    if (board[1] == null) {
                        System.out.println("     computer's   PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!");
                        cpisti++;
                        Points.cmpPoint+=10;
                        board[i] = null;
                        for (int a = 0; a < board.length; a++) {
                            board[a] = null;
                        }
                    }
                    else cmpP(cmpcards[i]);

                    int z=3;
                    int t=0;
                    for(int a=0;a<4;a++) {
                        if (i==a) {
                            if(a!=3) {
                                for(int c=0;c<z;c++) {
                                    cmpcards[t]=null;
                                    cmpcards[t]=cmpcards[t+1];
                                    t++;
                                }
                            }
                            cmpcards[3]=null;
                        }
                        z--;
                        t++;
                    }
                    boolee=true;
                    break;
                }
                else boolee=false;
            }
            if(boolee!=true){
                for (int w = 0; w < cmpcards.length; w++) {
                    if (cmpcards[w] != null && cmpcards[w].charAt(1) == 'J') {
                        System.out.println("               computer has joker!!");
                        cardNum = cmpcards[w];
                        b = true;
                        cmpP(cardNum);
                        break;
                    }
                    else b = false;
                }
                if (b==false) {
                    cardNum = cmpRandom(0);
                    for (int i = board.length - 1; i >= 0; i--) {
                        if (board[i] != null) {
                            board[i + 1] = cardNum;
                            break;
                        }
                    }
                }
                int k=3;
                int l=0;
                for(int a=0;a<4;a++) {
                    if ((cardNum != null &&cardNum.equals(cmpcards[a]))) {
                        if(a!=3) {
                            for(int i=0;i<k;i++) {
                                cmpcards[l]=cmpcards[l+1];
                                l++;
                            }
                        }
                        cmpcards[3]=null;
                    }
                    k--;
                    l++;
                }
            }
        }
    }
}
