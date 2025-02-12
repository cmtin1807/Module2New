package ss10_DSA_Danh_sach.thuc_hanh.Trien_khai_lop_List_don_gian;


import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public void add (E element) {
        ensureCapacity();
        elements[size++] = element;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
