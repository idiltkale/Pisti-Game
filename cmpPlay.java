import java.util.Random;

public class cmpPlay {
    public static String mycards[] = Cards.mycards;
    public static String cmpcards[] = Cards.cmpcards;
    public static String board[] = Cards.board;
    public static int cmpPoint = Points.cmpPoint;
    public static String cmpWins[] = Points.cmpWins;
    public static String onBoard;
    public static String firstcard;
    public static String seccard;
    public static String thirdcard;
    public static String fourthcard;
    public static String cardNum;
    public static int cpisti = 0;
    boolean b = false;
    int i = 0;

    public void cmpP(String cardNum) {
        for (int k = (board.length - 1); k >= 0; k--) {
            if (board[k] != null) {
                board[k + 1] = cardNum;
                break;
            }
        }
        for (int y = 0; y < cmpWins.length; y++) {
            if (cmpWins[y] == null && board[i] != null) {
                cmpWins[y] = board[i];
                if (i != 52) {
                    board[i] = null;
                    i++;
                } else {
                    i++;
                    break;
                }
            } else
                i = 0;
        }
    }

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

            if (firstcard != null && firstcard.charAt(1) == onBoard.charAt(1) && firstcard.charAt(1) != 'J') {

                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!   for computer");
                    cpisti++;
                    Points.cmpPoint += 10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }

                /*
                 * for (int i = 0; i < board.length; i++) {
                 * board[i] = null;
                 * }
                 */
                else
                    cmpP(firstcard);
                cmpcards[0] = cmpcards[1];
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;

            } else if (seccard != null && seccard.charAt(1) == onBoard.charAt(1) && seccard.charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    cpisti++;
                    Points.cmpPoint += 10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                /*
                 * for (int i = 0; i < board.length; i++) {
                 * board[i] = null;
                 * }
                 */
                else
                    cmpP(seccard);
                cmpcards[1] = cmpcards[2];
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;

            } else if (thirdcard != null && thirdcard.charAt(1) == onBoard.charAt(1) && thirdcard.charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!    for computer");
                    cpisti++;
                    Points.cmpPoint += 10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                /*
                 * for (int i = 0; i < board.length; i++) {
                 * board[i] = null;
                 * }
                 */
                else
                    cmpP(thirdcard);
                cmpcards[2] = cmpcards[3];
                cmpcards[3] = null;

            } else if (fourthcard != null && fourthcard.charAt(1) == onBoard.charAt(1) && fourthcard.charAt(1) != 'J') {
                if (board[1] == null) {
                    System.out.println("PİŞTİ!!!!PİŞTİ!!!!PİŞTİ!!!PİŞTİ!!!     for computer");
                    cpisti++;
                    Points.cmpPoint += 10;
                    board[0] = null;
                    for (int i = 0; i < board.length; i++) {
                        board[i] = null;
                    }
                }
                /*
                 * for (int i = 0; i < board.length; i++) {
                 * board[i] = null;
                 * }
                 */
                else
                    cmpP(fourthcard);
                cmpcards[3] = null;

            } else {
                for (int w = 0; w < cmpcards.length; w++) {
                    if (cmpcards[w] != null && cmpcards[w].charAt(1) == 'J') {
                        System.out.println("computer has joker!!");
                        cardNum = cmpcards[w];
                        b = true;
                        // for (String s : board) s = null;
                        /*
                         * for (int x = 0; x < board.length; x++) {
                         * board[x] = null;
                         * }
                         */
                        cmpP(cardNum);
                        break;
                    } else
                        b = false;
                }
                if (!b) {
                    cardNum = cmpRandom(0);
                    for (int i = board.length - 1; i >= 0; i--) {
                        if (board[i] != null) {
                            board[i + 1] = cardNum;
                            break;
                        }
                    }
                }
                if (cardNum != null && cardNum.equals(firstcard)) {
                    cmpcards[0] = null;
                    cmpcards[0] = cmpcards[1];
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum != null && cardNum.equals(seccard)) {
                    cmpcards[1] = null;
                    cmpcards[1] = cmpcards[2];
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;
                } else if (cardNum != null && cardNum.equals(thirdcard)) {
                    cmpcards[2] = null;
                    cmpcards[2] = cmpcards[3];
                    cmpcards[3] = null;

                } else if (cardNum != null && cardNum.equals(fourthcard)) {
                    cmpcards[3] = null;
                }
            }
        }
    }
}
