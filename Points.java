public class Points {
    public static int myPoint;
    public static int cmpPoint;
    public static int mycardcounter;
    public static int cmpcardcounter;
    public static String myWins[] = new String[52];
    public static String cmpWins[] = new String[52];

    public void Points() {
        for(int i=0;i<myWins.length;i++) {
            if(myWins[i]!=null) {
                if(myWins[i].equals("♦10♦")) myPoint +=3;
                else if (myWins[i].equals("♣2♣")) myPoint +=2;
                else myPoint++;

                mycardcounter++;
            }
            else break;
        }
        for(int i=0;i<cmpWins.length;i++) {
            if(cmpWins[i]!=null) {
                if(cmpWins[i].equals("♦10♦")) cmpPoint +=3;
                else if (cmpWins[i].equals("♣2♣")) cmpPoint +=2;
                else cmpPoint++;

                cmpcardcounter++;
            }
            else break;
        }
        if(mycardcounter>cmpcardcounter) myPoint+=3;
        else if(cmpcardcounter>mycardcounter) cmpPoint+=3;
    }
    public void PrintPoints() {
       // for(String s: myWins) System.out.println(s);
       //System.out.println("************************************");
        //for(String s: cmpWins) System.out.println(s);
        System.out.println();

        System.out.println("your points: " + Points.myPoint);
        System.out.println("computer's points: " + Points.cmpPoint);

        System.out.println();

        System.out.println("your pişti count: " + mePlay.mpisti);
        System.out.println("computer's pişti count: " + cmpPlay.cpisti);
        System.out.println();

        if(Points.myPoint>Points.cmpPoint) {
            System.out.println("YOU WINNNNN!!");
        }
        else if(Points.cmpPoint>Points.myPoint) {
            System.out.println("computer win :(");
        }
        else{
            System.out.println("we both win!!");
        }
    }
}