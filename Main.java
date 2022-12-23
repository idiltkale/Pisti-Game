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