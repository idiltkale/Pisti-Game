import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡");
        System.out.println("♡ ♦ ♥ ♠ ♣ Welcome to the 'pişti' game ♦ ♥ ♠ ♣ ♡");
        System.out.println("                      ♡");
        System.out.println();
        System.out.println();
        Cards cd = new Cards();
        mePlay mp = new mePlay();
        cmpPlay cp = new cmpPlay();
        Points pt = new Points();
        Dealer dl = new Dealer();
        Counter ct = new Counter();
       /* String name;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        Formatter f = null;
        FileWriter fw = null;
        try {
            f = new Formatter("people2.txt");
            f = new Formatter(fw);
            f.format(" %s\n", name);
            fw. close();
        } catch (Exception e) {
            System.err.println("Something went wrong.");
        } finally {
            if (f != null) {
                f.close();
            }
        }*/
        cd.Define();
        cd.Shuffle();
        System.out.println("                      ♡");
        cd.Display();
        cd.Cutting();
        dl.DealCardsFirst();
        cd.PrintOurCards();

        int abc;
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a < 4; a++) {
                while(true) {
                    System.out.print("the card you chose:");
                    try{
                        abc = sc.nextInt();
                        if(abc>4||abc<0) {
                            while(abc>4 || abc<0) {
                                System.out.println("please choose a card between 1-4");
                                abc= sc.nextInt();
                            }
                        }
                        break;
                    }catch(Exception e) {
                        System.out.println("please choose a card between 1-4");
                        sc.nextLine();
                    }

                }
                mp.myTurn(abc);
                cd.PrintOurCards();
                cp.cmpTurn();
                cd.PrintOurCards();
            }
            if (i != 5) {
                System.out.println("                cards are dealing...");
                System.out.println("                        ♡");
                dl.dealCards();
                cd.PrintOurCards();
            } else System.out.println("                 the game is over");
        }
        pt.Points();
        pt.PrintPoints();

    }
}