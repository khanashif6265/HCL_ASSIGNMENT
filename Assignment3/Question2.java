
// 2 Write a program to demonstrate 15 methods of Vector, including all constructors.

package Assignment3;
import java.util.Vector;
import java.util.Iterator;
public class Question2 {

    public static void main(String[] args) {

        // 1️ Constructor: Vector()
        Vector<String> v1 = new Vector<>();

        v1.add("Java");
        v1.add("Python");
        v1.add("C++");

        System.out.println("v1: " + v1);

        // 2️ Constructor: Vector(int initialCapacity)

        Vector<String> v2 = new Vector<>(5);

        v2.add("HTML");
        v2.add("CSS");

        System.out.println("v2: " + v2);

        // 3️ Constructor: Vector(int initialCapacity, int capacityIncrement)

        Vector<String> v3 = new Vector<>(3, 2);

        v3.add("Spring");
        v3.add("Hibernate");

        System.out.println("v3: " + v3);
        System.out.println("v3 Capacity: " + v3.capacity());

        // 4️ Constructor: Vector(Collection c)

        Vector<String> v4 = new Vector<>(v1);
        System.out.println("v4 (copied from v1): " + v4);

        // -------- Vector Methods --------

        // 1. add(index, element)
        v1.add(1, "JavaScript");
        System.out.println("After add(index): " + v1);

        // 2. addElement()
        v1.addElement("NodeJS");
        System.out.println("After addElement(): " + v1);

        // 3. addAll()
        v1.addAll(v2);
        System.out.println("After addAll(): " + v1);

        // 4. get()
        System.out.println("Element at index 2: " + v1.get(2));

        // 5. set()
        v1.set(0, "Core Java");
        System.out.println("After set(): " + v1);

        // 6. remove(index)
        v1.remove(3);
        System.out.println("After remove(index): " + v1);

        // 7. remove(Object)
        v1.remove("CSS");
        System.out.println("After remove(object): " + v1);

        // 8. contains()
        System.out.println("Contains Python? " + v1.contains("Python"));

        // 9. size()
        System.out.println("Size of v1: " + v1.size());

        // 10. capacity()
        System.out.println("Capacity of v1: " + v1.capacity());

        // 11. isEmpty()
        System.out.println("Is v1 empty? " + v1.isEmpty());

        // 12. indexOf()
        System.out.println("Index of Python: " + v1.indexOf("Python"));

        // 13. iterator()
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr = v1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 14. clear()
        v2.clear();
        System.out.println("v2 after clear(): " + v2);

        // 15. isEmpty() after clear
        System.out.println("Is v2 empty now? " + v2.isEmpty());
    }
}
