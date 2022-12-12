
public class mePlay {
    public static String mycards[] = Cards.mycards;
    public static String board[] = Cards.board;
    public static String onBoard;
    public static int pointMe = 0;
    public static int pointYou = 0;
    public static int pointDesk = 0;
    public static int point = 0;

    public int calcPoint(String[] arr, int a) {
        if (arr[a].contains("J") == true || arr[a].contains("A") == true) {
            point += 1;
        }
        if (arr[a].equals("♣2♣") == true) {
            point += 2;
        }
        if (arr[a].equals("♦10♦") == true) {
            point += 2;
        }
        return point;
    }

    public void myTurn(int choose) {
        String firstcard = mycards[0];
        String seccard = mycards[1];
        String thirdcard = mycards[2];
        String fourthcard = mycards[3];

        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            }
        }
        String cardNum;
        if (choose == 1)
            cardNum = firstcard;
        else if (choose == 2)
            cardNum = seccard;
        else if (choose == 3)
            cardNum = thirdcard;
        else if (choose == 4)
            cardNum = fourthcard;
        else
            cardNum = fourthcard;

        if (cardNum.charAt(1) == onBoard.charAt(1)) {
            if (board[1] == null) {
                System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!");
                pointMe += 10;
                board[0] = null;
            }

            for (int i = 0; i < board.length; i++) {
                board[i] = null;
            }
        } else {
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
        }
        if (cardNum.equals(firstcard)) {
            mycards[0] = null;
            mycards[0] = mycards[1];
            mycards[1] = mycards[2];
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else if (cardNum.equals(seccard)) {
            mycards[1] = null;
            mycards[1] = mycards[2];
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else if (cardNum.equals(thirdcard)) {
            mycards[2] = null;
            mycards[2] = mycards[3];
            mycards[3] = null;
        } else
            mycards[3] = null;

    }
}
