// 3 Write a program to demonstrate all constructors and 15 methods of HashMap.
package Assignment3;

import java.util.HashMap;

import java.util.Map;

public class Question3 {
    public static void main(String[] args) {

        // 1️ Constructor: HashMap()
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");

        System.out.println("map1: " + map1);

        // 2️ Constructor: HashMap(int initialCapacity)

        HashMap<Integer, String> map2 = new HashMap<>(5);
        map2.put(4, "HTML");
        map2.put(5, "CSS");

        System.out.println("map2: " + map2);

        // 3️ Constructor: HashMap(int initialCapacity, float loadFactor)

        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
        map3.put(6, "Spring");
        map3.put(7, "Hibernate");

        System.out.println("map3: " + map3);

        // 4️ Constructor: HashMap(Map m)
        HashMap<Integer, String> map4 = new HashMap<>(map1);
        System.out.println("map4 (copied from map1): " + map4);

        // -------- HashMap Methods --------

        // 1. put()
        map1.put(4, "JavaScript");
        System.out.println("After put(): " + map1);

        // 2. putIfAbsent()
        map1.putIfAbsent(2, "NodeJS");
        map1.putIfAbsent(5, "React");
        System.out.println("After putIfAbsent(): " + map1);

        // 3. putAll()
        map1.putAll(map2);
        System.out.println("After putAll(): " + map1);

        // 4. get()
        System.out.println("Value for key 3: " + map1.get(3));

        // 5. remove(key)
        map1.remove(1);
        System.out.println("After remove(key): " + map1);

        // 6. remove(key, value)
        map1.remove(2, "Python");
        System.out.println("After remove(key,value): " + map1);

        // 7. containsKey()
        System.out.println("Contains key 3? " + map1.containsKey(3));

        // 8. containsValue()
        System.out.println("Contains value HTML? " + map1.containsValue("HTML"));

        // 9. size()
        System.out.println("Size of map1: " + map1.size());

        // 10. isEmpty()
        System.out.println("Is map1 empty? " + map1.isEmpty());

        // 11. keySet()
        System.out.println("Keys: " + map1.keySet());

        // 12. values()
        System.out.println("Values: " + map1.values());

        // 13. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 14. replace()
        map1.replace(3, "C Language");
        System.out.println("After replace(): " + map1);

        // 15. clear()
        map2.clear();
        System.out.println("map2 after clear(): " + map2);
        System.out.println("Is map2 empty now? " + map2.isEmpty());
    }
}
