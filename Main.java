import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the 'pişti' game");
        Cards cd = new Cards();
        mePlay mp = new mePlay();
        cmpPlay cp = new cmpPlay();
        Points pt = new Points();
        Dealer dl = new Dealer();
        Counter ct = new Counter();
        cd.Define();
        cd.Shuffle();
        cd.Display();
        dl.DealCardsFirst();
        cd.PrintOurCards();
        int abc;
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a < 4; a++) {
                System.out.println("please choose a card");
                abc = sc.nextInt();
                mp.myTurn(abc);
                cd.PrintOurCards();
                cp.cmpTurn();
                cd.PrintOurCards();
                System.out.println("1 ONES: "+ct.onec);
                System.out.println("2 TWOS: "+ct.twoc);
                System.out.println("3 THREES: "+ct.threec);
                System.out.println("4 FOURS: " + ct.fourc);
                System.out.println("5 FİVES: "+ct.fivec);
                System.out.println("6 SİXES: "+ct.sixc);
                System.out.println("7 SEVENS: "+ct.sevenc);
                System.out.println("8 EİGHTS: "+ct.eightc);
                System.out.println("9 NİNES: "+ct.ninec);
                System.out.println("10 TENS: "+ct.tenc);
                System.out.println("K KİNG: "+ct.kingc);
                System.out.println("Q QUEEN: "+ct.queenc);
                System.out.println("J JOKER: "+ct.jokerc);
            }
            if (i != 5) {
                System.out.println("cards are dealing...");
                dl.dealCards();
                cd.PrintOurCards();
            } else System.out.println("the game is over");
        }
        pt.Points();
        pt.PrintPoints();

    }
}