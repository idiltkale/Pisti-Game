public class Points {
    public static int myPoint;
    public static int cmpPoint;
    public static String myWins[] = new String[52];
    public static String cmpWins[] = new String[52];

    public void Points() {
        for (int i = 0; i < myWins.length; i++) {
            if (myWins[i] != null) {
                if (myWins[i].equals("♦10♦"))
                    myPoint += 3;
                else if (myWins[i].equals("♣2♣"))
                    myPoint += 2;
                else
                    myPoint++;
            } else
                break;
        }
        for (int i = 0; i < cmpWins.length; i++) {
            if (cmpWins[i] != null) {
                if (cmpWins[i].equals("♦10♦"))
                    cmpPoint += 3;
                else if (cmpWins[i].equals("♣2♣"))
                    cmpPoint += 2;
                else
                    cmpPoint++;
            } else
                break;
        }

    }
}
