import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cards cd = new Cards();
        cd.Define();
        cd.Shuffle();
        cd.Display();
        cd.DealCardsFirst();
        cd.PrintOurCards();
        System.out.println("please choose a card");
        int abc = sc.nextInt();
        cd.mePlay(abc);
    }
}