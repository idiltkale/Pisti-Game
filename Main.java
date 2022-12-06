public class Main {
    public static void main(String[] args) {
        Cards cd = new Cards();
        cd.Define();
        cd.Shuffle();
        cd.Display();
        cd.DealCards();
        cd.PrintOurCards();
    }
}