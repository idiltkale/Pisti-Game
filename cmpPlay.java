import java.util.Random;

public class cmpPlay {
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String board[] = Cards.board;
    public static String cmpWins[] = Points.cmpWins;
    public static String onBoard;
    public static String cardNum;
    public static int cpisti=0;
    boolean bool = false;
    int i =0;
    public void Counter() {
        for(int i=0;i<14;i++) {

        }
    }
    public void cmpP (String cardNum) {
        for (int k = (board.length - 1); k >= 0; k--) {
            if (board[k] != null) {
                board[k + 1] = cardNum;
                break;
            }
        }for(int y=0;y<cmpWins.length;y++) {
            if(cmpWins[y]==null&&board[i]!=null) {
                 cmpWins[y]=board[i];
                if(i!=52) {
                    board[i]=null;
                    i++;
                } else{
                    i++;
                    break;
                }
            } else i=0;
        }
    }
    public String cmpRandom(int index) {
        Random rd = new Random();
        String[] cmprandom = { cmpcards[0], cmpcards[1], cmpcards[2], cmpcards[3] };
        index = rd.nextInt(cmprandom.length);
        String cardNum = cmprandom[index];
        while ((cardNum == null) || (cardNum.charAt(1) == 'J')) {
            index = rd.nextInt(cmprandom.length);
            cardNum = cmprandom[index];
        }
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
            if (cardNum != null) {
                if (cardNum.equals(cmpcards[0])) {
                    cmpcards[0] = cmpcards[1];
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum.equals(cmpcards[1])) {
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum.equals(cmpcards[2])) {
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;

                } else if (cardNum.equals(cmpcards[3])) {
                    cmpcards[3] = null;
                }
                /*for(int i=0;i<4;i++) {
                    if(cardNum.equals(cmpcards[i])) {
                        cmpcards[i] = null;
                        cmpcards[i]= cmpcards[i+1];
                    }
                }*/
            }
            for (int i = 0; i < board.length; i++) {
                if (board[i] != null) {
                    onBoard = board[i];
                }
            }


        } else {

            if (cmpcards[0] != null && cmpcards[0].charAt(1) == onBoard.charAt(1) && cmpcards[0].charAt(1) != 'J' ) {

                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!   for computer");
                    cpisti++;
                    Points.cmpPoint+=10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                else cmpP(cmpcards[0]);
                cmpcards[0] = cmpcards[1];
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;

            }
            else if (cmpcards[1] != null && cmpcards[1].charAt(1) == onBoard.charAt(1)&&cmpcards[1].charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    cpisti++;
                    Points.cmpPoint+=10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                else cmpP(cmpcards[1]);
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;


            }
            else if (cmpcards[2] != null && cmpcards[2].charAt(1) == onBoard.charAt(1)&&cmpcards[2].charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    cpisti++;
                    Points.cmpPoint+=10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                else cmpP(cmpcards[2]);
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;


            }
            else if (cmpcards[3] != null && cmpcards[3].charAt(1) == onBoard.charAt(1)&&cmpcards[3].charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!     for computer");
                    cpisti++;
                    Points.cmpPoint+=10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                else cmpP(cmpcards[3]);
                cmpcards[3] = null;

            }
            else {
                for (int w = 0; w < cmpcards.length; w++) {
                    if (cmpcards[w] != null && cmpcards[w].charAt(1) == 'J') {
                        System.out.println("computer has joker!!");
                        cardNum = cmpcards[w];
                        bool = true;
                        cmpP(cardNum);
                        break;
                    }
                    else bool = false;
                }
                if (!bool) {
                    cardNum = cmpRandom(0);
                    for (int i = board.length - 1; i >= 0; i--) {
                        if (board[i] != null) {
                            board[i + 1] = cardNum;
                            break;
                        }
                    }
                }
                if (cardNum != null) {
                    if (cardNum.equals(cmpcards[0])) {
                        cmpcards[0] = cmpcards[1];
                        cmpcards[1] = cmpcards[2];
                        cmpcards[2] = cmpcards[3];
                        cmpcards[3] = null;
                    } else if (cardNum.equals(cmpcards[1])) {
                        cmpcards[1] = cmpcards[2];
                        cmpcards[2] = cmpcards[3];
                        cmpcards[3] = null;
                    } else if (cardNum.equals(cmpcards[2])) {
                        cmpcards[2] = cmpcards[3];
                        cmpcards[3] = null;

                    } else if (cardNum.equals(cmpcards[3])) {
                        cmpcards[3] = null;
                    }
                }
            }
        }
    }
}
