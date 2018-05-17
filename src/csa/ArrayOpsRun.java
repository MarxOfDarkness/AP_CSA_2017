package csa;

public class ArrayOpsRun {
    public static void main (String[] args){
        final int MAX = 6;
        ArrayOps arrayOps = new ArrayOps();
        int[] data = new int[MAX];
        for (int loop = 0; loop < MAX; loop++){
            data[loop] = loop;
        }

        System.out.println("Array initialized: ");
        arrayOps.printList(data);
        arrayOps.squareList(data);
        System.out.println("Array after call of squareList: ");
        arrayOps.printList(data);
        arrayOps.rotateList(data);
        System.out.println("Array after call rotateList: ");
        arrayOps.printList(data);
    }
}
