package task_2.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "A");
        hashMap.put("key2", "B");
        hashMap.put("key3", "C");
        hashMap.put("key4", "D");
        hashMap.put("key5", "E");
        System.out.println(hashMap);

        hashMap.put("key1", "W");
        hashMap.put("key3", "H");
        hashMap.put("key5", "G");
        System.out.println(hashMap);

        Set<Map.Entry<String,String>> set=hashMap.entrySet();

        for (Map.Entry<String,String>me:set){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }


        hashMap.remove("key1");
        System.out.println(hashMap);

        hashMap.clear();
        System.out.println(hashMap);
    }
}
