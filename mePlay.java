public class mePlay {
    public static String mycards[] = Cards.mycards;
    public static String board[] = Cards.board;
    public static String onBoard;
    public static int myPoint = Points.myPoint;
    public static String myWins[] = Points.myWins;
    public static int mpisti=0;
    boolean bool2 = true;
    int i = 0;

    public void meP (String cardNum) {
        for (int k = (board.length - 1); k >= 0; k--) {
            if (board[k] != null) {
                board[k + 1] = cardNum;
                break;
            }
        }
        for(int y=0;y<myWins.length;y++) {
            if(myWins[y]==null && board[i]!=null) {
                myWins[y]=board[i];
                if(i!=52) {
                    board[i]=null;
                    i++;
                }
                else{
                    break;
                }
            }
            else i=0;
        }
    }
    public void myTurn(int choose) {
        for (int i = board.length-1; i >=0; i--) {
            if (board[i] != null) {
                onBoard = board[i];
                if (bool2==true) {
                    Counter.CountForComp(board[0]);
                    Counter.CountForComp(board[1]);
                    Counter.CountForComp(board[2]);
                    Counter.CountForComp(board[3]);
                }
                bool2=false;
                break;
            }
        }
        String cardNum;
        if (choose == 1)
            cardNum = mycards[0];
        else if (choose == 2)
            cardNum = mycards[1];
        else if (choose == 3)
            cardNum = mycards[2];
        else if (choose == 4)
            cardNum = mycards[3];
        else
            cardNum = mycards[3]; // fix here

        if (onBoard==null) {
           // mycards[choose] = onBoard;
            onBoard = mycards[choose];
        }

        if (cardNum.charAt(1) == 'J') {
            System.out.println("bc of joker, you'll get all the cards");
            /*for (int i = 0; i < board.length; i++) {
                board[i] = null;
            }*/
            meP(cardNum);
            Counter.CountForComp(cardNum);
        }
        else if (cardNum.charAt(1) == onBoard.charAt(1)) {
            if (board[1] == null) {
                System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!");
                mpisti++;
                Points.myPoint+=10;
                board[0] = null;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            }
            /*for (int i = 0; i < board.length; i++) {
                board[i] = null;
            }*/
            else meP(cardNum);

            Counter.CountForComp(cardNum);
        }
        else {
            for (int i = (board.length - 1); i >= 0; i--) {
                if (board[0] == null) {
                    board[0] = cardNum;
                    break;
                }
                if (board[i] != null) {
                    board[i + 1] = cardNum;
                    break;
                }
            }
            Counter.CountForComp(cardNum);
        }
        if (cardNum.equals(mycards[0])) {
            mycards[0] = null;
            mycards[0] = mycards[1];
            mycards[1] = mycards[2];
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else if (cardNum.equals(mycards[1])) {
            mycards[1] = null;
            mycards[1] = mycards[2];
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else if (cardNum.equals(mycards[2])) {
            mycards[2] = null;
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else
            mycards[3] = null;
    }
}
