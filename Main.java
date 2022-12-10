import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cards cd = new Cards();
        Play pl = new Play();
        cd.Define();
        cd.Shuffle();
        cd.Display();
        cd.DealCardsFirst();
        cd.PrintOurCards();
        System.out.println("please choose a card");
        int abc = sc.nextInt();
        pl.mePlay(abc);
        cd.PrintOurCards();
    }
}