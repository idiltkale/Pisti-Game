import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void Compare(String[] arr,int[] arr2) {
        String temp = null;
        int temp2 =0;
        for (int j = 0; j < arr.length - 1; j++) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    temp = arr[i];
                    temp2 = arr2[i];

                    arr2[i]=arr2[i + 1];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    arr2[i + 1] = temp2;
                    swapped = true;
                }
            }
        }
        for(int x=9;x>=0;x--) {
            if(arr[x]!=null) System.out.println(arr[x] + ": "+ arr2[x]);
        }

    }

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
        String name;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        

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
                while (true) {
                    System.out.print("the card you chose:");
                    try {
                        abc = sc.nextInt();
                        if (abc > 4 || abc < 0) {
                            System.out.println("Out of index");
                            continue;
                        }
                        if (mePlay.mycards[abc - 1].equals(null)) {
                            System.out.println("");
                            continue;
                        }

                        break;
                    } catch (Exception e) {
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

        pt.Pointss();
        pt.PrintPoints();
        Formatter f = null;
        FileWriter fw = null;
        String[] top10names = new String[10];
        int[] top10points = new int[10];
        try {
            fw = new FileWriter("Top10", true);
            f = new Formatter(fw);
            System.out.println(Points.myPoint);
            f.format("");
            f.format("%s,%d\n", name, Points.myPoint);
            fw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong.");
        } finally {
            if (f != null) {
                f.close();
            }
        }
        Scanner reader;
        reader = null;
        try {
            reader = new Scanner(Paths.get("Top10"));
            while (reader.hasNextLine()) {
                String[] Line = reader.nextLine().split(",");
                for (int i = 0; i < 10; i++) {
                    if(top10names[i]==null) {
                        top10names[i] = Line[0];
                        break;
                    }
                }
                for (int a = 0; a < 10; a++){
                    if(top10points[a]==0){
                        top10points[a] = Integer.parseInt(Line[1]);
                        break;
                    }
                }
                for(int x=0;x<10;x++) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println("Score table:");
        Compare(top10names,top10points);
    }
}