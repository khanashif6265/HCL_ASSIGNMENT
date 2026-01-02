
// 1 Write a program to demonstrate all constructors and 15 methods of ArrayList.

package Assignment3;
import java.util.ArrayList;
import java.util.Iterator;
public class Question1 {
    public static void main(String[] args) {

        // 1️ Constructor: ArrayList()
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");

        list1.add("Python");
        list1.add("C++");

        System.out.println("list1: " + list1);

        // 2️ Constructor: ArrayList(int initialCapacity)

        ArrayList<String> list2 = new ArrayList<>(5);

        list2.add("HTML");
        list2.add("CSS");

        System.out.println("list2: " + list2);

        // 3️ Constructor: ArrayList(Collection c)

        ArrayList<String> list3 = new ArrayList<>(list1);

        System.out.println("list3 (copied from list1): " + list3);

        // ---------- ArrayList Methods ----------

        // 1. add(index, element)
        list1.add(1, "JavaScript");

        System.out.println("After add(index): " + list1);

        // 2. addAll()
        list1.addAll(list2);

        System.out.println("After addAll(): " + list1);

        // 3. get()
        System.out.println("Element at index 2: " + list1.get(2));

        // 4. set()
        list1.set(0, "Core Java");
        System.out.println("After set(): " + list1);

        // 5. remove(index)
        list1.remove(3);
        System.out.println("After remove(index): " + list1);

        // 6. remove(Object)
        list1.remove("CSS");
        System.out.println("After remove(object): " + list1);

        // 7. contains()
        System.out.println("Contains Java? " + list1.contains("Java"));

        // 8. size()
        System.out.println("Size of list1: " + list1.size());

        // 9. isEmpty()
        System.out.println("Is list1 empty? " + list1.isEmpty());

        // 10. indexOf()
        System.out.println("Index of Python: " + list1.indexOf("Python"));

        // 11. lastIndexOf()
        list1.add("Python");
        System.out.println("Last index of Python: " + list1.lastIndexOf("Python"));

        // 12. iterator()
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 13. toArray()
        Object[] arr = list1.toArray();
        System.out.print("Array elements: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 14. clear()
        list2.clear();
        System.out.println("list2 after clear(): " + list2);

        // 15. isEmpty() after clear
        System.out.println("Is list2 empty now? " + list2.isEmpty());
    }
}


