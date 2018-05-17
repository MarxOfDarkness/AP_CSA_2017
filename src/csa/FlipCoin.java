package csa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FlipCoin {
    private static int heads, tails;

    private static List<Coin> ListCoins = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );
        while(true) {
            System.out.println();
            System.out.println("Number of coins to flip: ");
            int numCoins = Integer.parseInt(in.readLine());
            int i = 0;
            while (i < numCoins) {
                ListCoins.add(new Coin());
                i++;
            }
            tails = 0;
            heads = 0;
            while (!ListCoins.isEmpty()) {
                int a = ListCoins.size() - 1;
                ListCoins.get(a).flip();
                if (ListCoins.get(a).toString().equalsIgnoreCase("heads"))
                    heads++;
                else
                    tails++;
                System.out.println("Coin" + (a + 1) + ": " + ListCoins.get(a).toString());
                ListCoins.remove(a);
            }
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
            if (numCoins == 0) {
                System.out.println();
                System.out.println("Bye");
                break;
            }
        }
    }
}
