package csa;

public class ArrayOps {
    public void copy (int[] source, int[] target){
        for (int count = 0; count < source.length; count++){
            target[count] = source[count];
        }
    }

    public void printList (int[] list){
        for (int index = 0; index < list.length; index++){
            System.out.println(list[index] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void squareList (int[] list){
        for (int index = 0; index < list.length; index++){
            list[index] *= list[index];
        }
    }

    public void rotateList (int[] list){
        int temp = list[list.length - 1];
        int[] listCopy = new int[list.length];
        copy(list, listCopy);
        for (int loop = listCopy.length -1; loop > 0; loop--){
            listCopy[loop] = listCopy[loop-1];
            listCopy[0] = temp;
        }

        System.out.println("Inside of rotateList: ");
        printList(listCopy);
    }
}
