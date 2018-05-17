package csa;

public class TriangleTest {
    public static void main(String[] args){
        System.out.println(Triangle(0));
        System.out.println(Triangle(2));
        System.out.println(Triangle(1));
        System.out.println(HiCount("hijksljefldskhiHi"));
        System.out.println(HiCount("hiiiiiiiiihiiiihihiihiihiih"));
        fun2(3);
    }

    private static int Triangle (int rows){
        if (rows == 0){
            return 0;
        }
        return rows + Triangle(rows - 1);
    }

    private static int HiCount ( String s){
        if (s.length() <= 1){
            return 0;
        }
        else if (s.substring(0, 2).equals("hi")){
            return 1 + HiCount(s.substring(1));
        }
        return HiCount(s.substring(1));
    }

    private static void fun2(int n) {
        if(n == 0)
            return;
        fun2(n/2);
        System.out.printf("%d", n%2);
    }


}
