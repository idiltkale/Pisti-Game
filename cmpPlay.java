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
        String firstcard = cmpcards[0];
        String seccard = cmpcards[1];
        String thirdcard = cmpcards[2];
        String fourthcard = cmpcards[3];
        int cmpchoose;
        boolean bool;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            }
        }

        if (board[0] == null) {
            cmpchoose = (int) (Math.random() * 3);
            String cardNum;
            if (cmpchoose == 1)
                cardNum = firstcard;
            else if (cmpchoose == 2)
                cardNum = seccard;
            else if (cmpchoose == 3)
                cardNum = thirdcard;
            else
                cardNum = fourthcard;
            for (int i = (board.length - 1); i > 0; i--) {
                if (board[i] != null) {
                    board[i + 1] = cardNum;
                }
            }
            if (board[0] == null)
                board[0] = cardNum;
        } else {
            if (firstcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 1;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            } else if (seccard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 2;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            } else if (thirdcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 3;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            } else if (fourthcard.charAt(1) == onBoard.charAt(1)) {
                cmpchoose = 4;
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
            } else {
                cmpchoose = (int) (Math.random() * 3); // FIX THIS ERROR
                String cardNum;
                if (cmpchoose == 1)
                    cardNum = firstcard;
                else if (cmpchoose == 2)
                    cardNum = seccard;
                else if (cmpchoose == 3)
                    cardNum = thirdcard;
                else
                    cardNum = fourthcard;
                for (int i = board.length - 1; i > 0; i--) {
                    if (board[i] != null) {
                        board[i + 1] = cardNum;
                    }
                }
            }
        }
        if (cmpchoose != 0)
            cmpcards[cmpchoose - 1] = null;
        else
            cmpcards[0] = null;
    }
}
