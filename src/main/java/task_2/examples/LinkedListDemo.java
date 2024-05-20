package task_2.examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println(linkedList);

        linkedList.add(0, "Q");
        System.out.println(linkedList);

        linkedList.add(linkedList.size() / 2, "F");
        System.out.println(linkedList);

        linkedList.remove("B");
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
