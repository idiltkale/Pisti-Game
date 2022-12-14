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
        int abc;
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 4; a++) {
                System.out.println("please choose a card");
                abc = sc.nextInt();
                mp.myTurn(abc);
                cp.cmpTurn();
                cd.PrintOurCards();
            }
            System.out.println("kartlar dağıtılıyor...");
            // if(Cards.deste[51]!=null)
            cd.dealCards();
            cd.PrintOurCards();
        }
    }
}