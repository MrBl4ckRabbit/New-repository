package task_2.my_arraylist;

public class MyArrayList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E e) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    public void addAll(MyArrayList<E> list) {
        for (int i = 0; i < list.size; i++) {
            add(list.get(i));
        }
    }
    public int size() {
        return size;
    }

    public void bubbleSort() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < size - 1; i++) {
                Comparable<E> c1 = (Comparable<E>) elements[i];
                Comparable<E> c2 = (Comparable<E>) elements[i + 1];
                if (c1.compareTo((E) c2) > 0) {
                    E temp = (E) elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }


    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }



}


