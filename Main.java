import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cards cd = new Cards();
        mePlay mp = new mePlay();
        cmpPlay cp = new cmpPlay();
        cd.Define();
        cd.Shuffle();
        cd.Display();
        cd.DealCardsFirst();
        cd.PrintOurCards();
        System.out.println("please choose a card");
        int abc = sc.nextInt();
        mp.myTurn(abc);
        cd.PrintOurCards();
        cp.cmpTurn();
        cd.PrintOurCards();
        for (int i = 0; i < 4; i++) {
            System.out.println("please choose a card");
            abc = sc.nextInt();
            mp.myTurn(abc);
            cd.PrintOurCards();
            cp.cmpTurn();
            cd.PrintOurCards();
        }
    }
}