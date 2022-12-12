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
    public static String firstcard;
    public static String seccard;
    public static String thirdcard;
    public static String fourthcard;

    public String cmpRandom(int index) {
        Random rd = new Random();
        firstcard = cmpcards[0];
        seccard = cmpcards[1];
        thirdcard = cmpcards[2];
        fourthcard = cmpcards[3];
        String[] cmprandom = { firstcard, seccard, thirdcard, fourthcard };
        index = rd.nextInt(cmprandom.length);
        String cardNum = cmprandom[index];
        while (cardNum == null) {
            index = rd.nextInt(cmprandom.length);
            cardNum = cmprandom[index];
        }
        return cardNum;
    }

    public void cmpTurn() {
        Random rd = new Random();
        firstcard = cmpcards[0];
        seccard = cmpcards[1];
        thirdcard = cmpcards[2];
        fourthcard = cmpcards[3];

        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                onBoard = board[i];
            }
        }
        if (board[0] == null) {
            String cardNum = cmpRandom(0);
            System.out.println("RAANDOMMM first : " + cardNum);
            board[0] = cardNum;
            if (cardNum.equals(firstcard)) {
                cmpcards[0] = null;
                cmpcards[0] = cmpcards[1];
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else if (cardNum.equals(seccard)) {
                cmpcards[1] = null;
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else if (cardNum.equals(thirdcard)) {
                cmpcards[2] = null;
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else
                cmpcards[3] = null;

            for (int i = 0; i < board.length; i++) {
                if (board[i] != null) {
                    onBoard = board[i];
                }
            }
        } else {
            if (firstcard != null && firstcard.charAt(1) == onBoard.charAt(1)) {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!   for computer");
                    pointYou += 10;
                    board[0] = null;
                }
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[0] = cmpcards[1];
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else if (seccard != null && seccard.charAt(1) == onBoard.charAt(1)) {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    pointYou += 10;
                    board[0] = null;
                }
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else if (thirdcard != null && thirdcard.charAt(1) == onBoard.charAt(1)) {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    pointYou += 10;
                    board[0] = null;
                }
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;
            } else if (fourthcard != null && fourthcard.charAt(1) == onBoard.charAt(1)) {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!     for computer");
                    pointYou += 10;
                    board[0] = null;
                }
                for (int i = 0; i < board.length; i++) {
                    board[i] = null;
                }
                cmpcards[3] = null;
            } else {
                String cardNum = cmpRandom(0);
                System.out.println("RAANDOMMM second random: " + cardNum);
                for (int i = board.length - 1; i >= 0; i--) {
                    if (board[i] != null) {
                        board[i + 1] = cardNum;
                        break;
                    }
                }
                if (cardNum != null && cardNum.equals(firstcard)) {
                    System.out.println("1.YE EŞİT");
                    cmpcards[0] = null;
                    cmpcards[0] = cmpcards[1];
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum != null && cardNum.equals(seccard)) {
                    System.out.println("2.YE EŞİT");
                    cmpcards[1] = null;
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum != null && cardNum.equals(thirdcard)) {
                    System.out.println("3.YE EŞİT");
                    cmpcards[2] = null;
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;

                } else if (cardNum != null && cardNum.equals(fourthcard)) {
                    System.out.println("4.YE EŞİT");
                    cmpcards[3] = null;
                }
            }
        }
    }
}
