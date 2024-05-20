package task_2.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("Z");
        arrayList.add("M");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println(arrayList);
        arrayList.sort(String::compareToIgnoreCase);
        System.out.println(arrayList);

        arrayList.add(0, "W");
        System.out.println(arrayList);

        arrayList.add(arrayList.size() / 2, "F");
        System.out.println(arrayList);

        arrayList.remove("A");
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);
    }
}
