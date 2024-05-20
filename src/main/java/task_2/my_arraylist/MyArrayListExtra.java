package task_2.my_arraylist;

import java.util.Collection;

public class MyArrayListExtra<E> {
    private Object[] elements;
    private int size;

    public MyArrayListExtra() {
        elements = new Object[10];
        size = 0;
    }

    // Конструктор, который принимает другую коллекцию
    public MyArrayListExtra(Collection<? extends E> c) {
        elements = c.toArray();
        size = elements.length;
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

    public void addAll(MyArrayListExtra<E> list) {
        for (int i = 0; i < list.size; i++) {
            add(list.get(i));
        }
    }

    // Статический метод сортировки
    public static <E extends Comparable<E>> void bubbleSort(MyArrayListExtra<E> list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.size - 1; i++) {
                Comparable<E> c1 = (Comparable<E>) list.elements[i];
                Comparable<E> c2 = (Comparable<E>) list.elements[i + 1];
                if (c1.compareTo((E) c2) > 0) {
                    E temp = (E) list.elements[i];
                    list.elements[i] = list.elements[i + 1];
                    list.elements[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}

