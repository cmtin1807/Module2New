package ss10_DSA_Danh_sach.bai_tap.Trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be >= 0");
        }
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {  // Cho phép thêm vào cuối
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        E elementsRemove = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return elementsRemove;
    }

    public int size() {
        return size;
    }
    public MyList<E> clone() {
        MyList<E> clone = new MyList<>(size);
        clone.elements = Arrays.copyOf(elements, size);
        clone.size = this.size;
        return clone;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E element) {
        if (contains(element)){
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }


    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int oldCapacity = elements.length;
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (E) elements[index];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
