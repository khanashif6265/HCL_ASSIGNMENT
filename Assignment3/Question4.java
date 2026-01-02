
//  4 Write a program to demonstrate all constructors and 15 methods of HashTable.

package Assignment3;

import java.util.Hashtable;

import java.util.Map;

public class Question4 {
    public static void main(String[] args) {

        // 1️ Constructor: Hashtable()
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "Java");
        ht1.put(2, "Python");
        ht1.put(3, "C++");

        System.out.println("ht1: " + ht1);

        // 2️ Constructor: Hashtable(int initialCapacity)
        Hashtable<Integer, String> ht2 = new Hashtable<>(5);
        ht2.put(4, "HTML");
        ht2.put(5, "CSS");

        System.out.println("ht2: " + ht2);

        // 3️ Constructor: Hashtable(int initialCapacity, float loadFactor)
        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
        ht3.put(6, "Spring");
        ht3.put(7, "Hibernate");

        System.out.println("ht3: " + ht3);

        // 4️ Constructor: Hashtable(Map m)

        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);
        System.out.println("ht4 (copied from ht1): " + ht4);

        // -------- Hashtable Methods --------

        // 1. put()
        ht1.put(4, "JavaScript");
        System.out.println("After put(): " + ht1);

        // 2. putIfAbsent()
        ht1.putIfAbsent(2, "NodeJS");
        ht1.putIfAbsent(5, "React");
        System.out.println("After putIfAbsent(): " + ht1);

        // 3. putAll()
        ht1.putAll(ht2);
        System.out.println("After putAll(): " + ht1);

        // 4. get()
        System.out.println("Value for key 3: " + ht1.get(3));

        // 5. remove(key)
        ht1.remove(1);
        System.out.println("After remove(key): " + ht1);

        // 6. remove(key, value)
        ht1.remove(2, "Python");
        System.out.println("After remove(key, value): " + ht1);

        // 7. containsKey()
        System.out.println("Contains key 3? " + ht1.containsKey(3));

        // 8. containsValue()
        System.out.println("Contains value HTML? " + ht1.containsValue("HTML"));

        // 9. size()
        System.out.println("Size of ht1: " + ht1.size());

        // 10. isEmpty()
        System.out.println("Is ht1 empty? " + ht1.isEmpty());

        // 11. keySet()
        System.out.println("Keys: " + ht1.keySet());

        // 12. values()
        System.out.println("Values: " + ht1.values());

        // 13. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : ht1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 14. replace()
        ht1.replace(3, "C Language");
        System.out.println("After replace(): " + ht1);

        // 15. clear()
        ht2.clear();
        System.out.println("ht2 after clear(): " + ht2);
        System.out.println("Is ht2 empty now? " + ht2.isEmpty());
    }
}

