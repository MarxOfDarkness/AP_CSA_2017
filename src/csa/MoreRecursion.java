package csa;

public class MoreRecursion {
    public static void main(String[] args){
        System.out.println(perplexing("Hello"));
        System.out.println(morePerplexing("Hello"));
        System.out.println(unknown(4, 2));
        System.out.println(sums(5, 1) + 3);
    }

    private static String perplexing(String s){
        if (s.length() == 1){
            return s;
        }
        return perplexing(s.substring(1)) + s.charAt(0);
    }

    private static String morePerplexing(String s){
        if(s.length() == 1){
            return s;
        }
        return morePerplexing(s.substring(1)) + s;
    }

    private static int unknown(int n, int r){
        if (n == 0 || r <= 0 || r >= n){
            return 1;
        }
        System.out.println(1);
        return unknown(n - 1, r - 1 ) + unknown(n - 1, r);
    }

    private static int sums(int hi, int low){
        if (hi <= low){
            return 0;
        }
        return hi + low + sums(hi - 1, low + 1);
    }
}
