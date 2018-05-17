package csa;

public class Mystery {
    public static void strangeMethod(int x, int y)
    {
        x += y;
        y *= x;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args)
    {
        int a = 6, b = 3;
        strangeMethod(a,b);
        System.out.println(a + " " + b);
        String n = "abc";
        String s = new String("abc");
        System.out.println(n == (s));
        int z = (int) (Math.random() * 20) + 5;
    }
}
