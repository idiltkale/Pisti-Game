public class Play {
    public static String mycards[]= Cards.mycards;
    public static String yourcards[]= Cards.yourcards;
    public static String board[] = Cards.board;
    public static String onBoard;
    public static int pointMe = 0;
    public static int pointYou = 0;
    public static int pointDesk = 0;
    public void mePlay(int choose) {
        String firstcard = mycards[0];
        String seccard = mycards[1];
        String thirdcard = mycards[2];
        String fourthcard = mycards[3];

        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            } else {
                continue;
            }
        }
        String cardNum;
        if (choose == 1)
            cardNum = firstcard;
        else if (choose == 2)
            cardNum = seccard;
        else if (choose == 3)
            cardNum = thirdcard;
        else
            cardNum = fourthcard;
        if (cardNum.charAt(1) == onBoard.charAt(1)) {
            if (board[1] == null) {
                System.out.println("Pişti!!!!");
                pointMe += 20;
            }
            board[0] = null;
            pointMe += pointDesk;
            for (int i = 0; i < board.length; i++) {
                board[i] = null;
            }
        } else {
            for (int i = (board.length - 1); i > 0; i--) {
                if (board[i] != null) {
                    board[i] = cardNum;
                }
            }
        }
        mycards[choose-1]=null;
    }
}
