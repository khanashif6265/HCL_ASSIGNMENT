// 5 Write a program to demonstrate all constructors and 15 methods of TreeMap.
package Assignment3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Question5 {

    public static void main(String[] args) {

        // 1️ Constructor: TreeMap()
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        tm1.put(3, "Java");
        tm1.put(1, "Python");
        tm1.put(2, "C++");

        System.out.println("tm1: " + tm1);

        // 2️ Constructor: TreeMap(Comparator)
        TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
        tm2.put(1, "HTML");
        tm2.put(2, "CSS");
        tm2.put(3, "JavaScript");

        System.out.println("tm2 (Reverse Order): " + tm2);

        // 3️ Constructor: TreeMap(Map m)
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
        System.out.println("tm3 (copied from tm1): " + tm3);

        // 4️⃣ Constructor: TreeMap(SortedMap m)
        TreeMap<Integer, String> tm4 = new TreeMap<>(tm1);
        System.out.println("tm4 (SortedMap copy): " + tm4);

        // -------- TreeMap Methods --------

        // 1. put()
        tm1.put(4, "Spring");
        System.out.println("After put(): " + tm1);

        // 2. putIfAbsent()
        tm1.putIfAbsent(2, "NodeJS");
        tm1.putIfAbsent(5, "React");
        System.out.println("After putIfAbsent(): " + tm1);

        // 3. putAll()
        tm1.putAll(tm2);
        System.out.println("After putAll(): " + tm1);

        // 4. get()
        System.out.println("Value for key 3: " + tm1.get(3));

        // 5. remove(key)
        tm1.remove(1);

        System.out.println("After remove(key): " + tm1);

        // 6. containsKey()
        System.out.println("Contains key 2? " + tm1.containsKey(2));

        // 7. containsValue()
        System.out.println("Contains value React? " + tm1.containsValue("React"));

        // 8. size()
        System.out.println("Size of tm1: " + tm1.size());

        // 9. isEmpty()
        System.out.println("Is tm1 empty? " + tm1.isEmpty());

        // 10. firstKey()
        System.out.println("First key: " + tm1.firstKey());

        // 11. lastKey()
                System.out.println("Last key: " + tm1.lastKey());

        // 12. higherKey()
        System.out.println("Higher key than 2: " + tm1.higherKey(2));

        // 13. lowerKey()
        System.out.println("Lower key than 4: " + tm1.lowerKey(4));

        // 14. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : tm1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 15. clear()
              tm2.clear();
        System.out.println("tm2 after clear(): " + tm2);
        System.out.println("Is tm2 empty now? " + tm2.isEmpty());
    }
}
