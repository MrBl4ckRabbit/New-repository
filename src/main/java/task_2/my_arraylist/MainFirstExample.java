package task_2.my_arraylist;

public class MainFirstExample {
    public static void main(String[] args) {

        MyArrayList<Integer> myList = new MyArrayList<>();

        myList.add(5);
        myList.add(3);
        myList.add(8);
        myList.add(1);
        myList.show();

        System.out.println(myList.get(2));

        System.out.println(myList.remove(1));

        MyArrayList<Integer> anotherList = new MyArrayList<>();
        anotherList.add(7);
        anotherList.add(6);
        myList.addAll(anotherList);
        myList.show();

        myList.bubbleSort();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}

