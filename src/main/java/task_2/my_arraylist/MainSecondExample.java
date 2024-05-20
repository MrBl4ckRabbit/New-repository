package task_2.my_arraylist;

import java.util.Arrays;

public class MainSecondExample {
    public static void main(String[] args) {
        MyArrayListExtra<Integer> myList = new MyArrayListExtra<>(Arrays.asList(5, 3, 8, 1));

        System.out.println("Элементы коллекции до сортировки:");
        myList.show();

        MyArrayListExtra.bubbleSort(myList);

        System.out.println("Элементы коллекции после сортировки:");
        myList.show();
        
        System.out.println("Размер коллекции: " + myList.size());
    }
}
