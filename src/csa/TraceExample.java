package csa;

public class TraceExample {
    private int someNum;
    private boolean someBool;


    public TraceExample() {
        someNum = -1;
        someBool = false;
        System.out.println("Default Constructor");
    }

    public TraceExample(int num, boolean bool) {
        this.someNum = num;
        this.someBool = bool;
        System.out.println("Other Constructor");
    }

    public int methodOne() {
        System.out.println("methodOne prints " + someNum);
        int someNum = 4;
        if(someBool)
            someNum *= 3;
        System.out.println("methodOne returns " + someNum);
        return someNum;
    }

    public void mehtodTwo(boolean isTrue, int num){
        if(isTrue)
            someBool = !someBool;
        someNum += num;
        System.out.println("methodTwo someNum: " + someNum);
    }
    public static void main(String[] args){
        System.out.println("Main started.");
        TraceExample e1 = new TraceExample(8, true);
        TraceExample e2 = new TraceExample();
        System.out.println("Method One: ");
        int resultOne = e1.methodOne();
        int resultTwo = e2.methodOne();
        System.out.println("Method Two: ");
        e1.mehtodTwo(true, 7);
        e2.mehtodTwo(false, 3);
        System.out.println("Ending with: " + (resultOne + resultTwo));
    }
}
