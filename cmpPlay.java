import java.util.Random;

public class cmpPlay {
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String board[] = Cards.board;
    public static String onBoard;
    public static int pointMe = 0;
    public static int pointYou = 0;
    public static int pointDesk = 0;
    public static int point = 0;

    public void cmpTurn() {
        Random rd = new Random();
        String firstcard = cmpcards[0];
        String seccard = cmpcards[1];
        String thirdcard = cmpcards[2];
        String fourthcard = cmpcards[3];
        String[] cmprandom = { firstcard, seccard, thirdcard, fourthcard };
        int cmpchoose;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            }
        }

        if (board[0] == null) {
            int index = rd.nextInt(cmprandom.length);
            String cardNum = cmprandom[index];
            board[0] = cardNum;
            if (cardNum.equals(firstcard)) {
                cmpcards[0] = null;
                cmpcards[1] = cmpcards[0];
                cmpcards[2] = cmpcards[1];
                cmpcards[3] = cmpcards[2];
            } else if (cardNum.equals(seccard)) {
                cmpcards[1] = null;
                cmpcards[2] = cmpcards[1];
                cmpcards[3] = cmpcards[2];
            } else if (cardNum.equals(thirdcard)) {
                cmpcards[2] = null;
                cmpcards[3] = cmpcards[2];
            } else
                cmpcards[3] = null;

        } else {
            if (firstcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 1;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[1] = cmpcards[0];
                cmpcards[2] = cmpcards[1];
                cmpcards[3] = cmpcards[2];
            } else if (seccard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 2;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[2] = cmpcards[1];
                cmpcards[3] = cmpcards[2];
            } else if (thirdcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 3;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[3] = cmpcards[2];
            } else if (fourthcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 4;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            } else {
                int index = rd.nextInt(cmprandom.length);
                String cardNum = cmprandom[index];
                for (int i = board.length - 1; i > 0; i--) {
                    if (board[i] != null) {
                        board[i + 1] = cardNum;
                    }
                }
                if (cardNum.equals(firstcard)) {
                    cmpcards[0] = null;
                    cmpcards[1] = cmpcards[0];
                    cmpcards[2] = cmpcards[1];
                    cmpcards[3] = cmpcards[2];
                } else if (cardNum.equals(seccard)) {
                    cmpcards[1] = null;
                    cmpcards[2] = cmpcards[1];
                    cmpcards[3] = cmpcards[2];
                } else if (cardNum.equals(thirdcard)) {
                    cmpcards[2] = null;
                    cmpcards[3] = cmpcards[2];
                } else
                    cmpcards[3] = null;

                String[] newcmpcards = new String[cmpcards.length - 1];
                for (int i = 0; i < newcmpcards.length; i++) {
                    newcmpcards[i] = cmpcards[i];
                }
            }
        }
    }
}
