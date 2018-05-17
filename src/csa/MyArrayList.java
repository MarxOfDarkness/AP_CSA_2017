package csa;

public class MyArrayList<E> {
    private Object[] a;
    private int size;

    public MyArrayList() {
        // TODO: implement
    }

    public MyArrayList(int initialCapacity) {
        if (true) // TODO: replace this with the correct condition
            throw new IllegalArgumentException();

        // TODO: implement
    }

    public int size() {
        return -1; // TODO: implement
    }

    public E get(int index) {
        if (true) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        // Note: You must cast the reference from the array to type E.
        // For example, to return element 6 from a: return (E) a[6];

        return null; // TODO: implement
    }

    public E set(int index, E element) {
        if (true) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        return null; // TODO: implement
    }

    public boolean contains(Object elem) {
        return false; // TODO: implement
    }

    public void trimToSize() {
        // TODO: implement
    }

    public void add(int index, E element) {
        if (true) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        // TODO: implement
    }

    public boolean add(E elem) {
        return false; // TODO: implement
    }

    public E remove(int index) {
        if (true) // TODO: replace this with the correct condition
            throw new IndexOutOfBoundsException();

        return null; // TODO: implement
    }

    public boolean remove(Object elem) {
        return false; // TODO: implement
    }

    // start package access methods to facilitate automated testing
    // do not modify these methods

    Object[] getA() {
        return a;
    }

    void setA(Object[] newA) {
        a = newA;
    }

    int getSize() {
        return size;
    }

    void setSize(int newSize) {
        size = newSize;
    }

    // end package access methods to facilitate automated testing
}
