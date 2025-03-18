package practice.collection_example;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class JavaCollectionsEx1 {

    public static void main(String[] args) {

        // 1. ArrayList Example - Add, remove elements, and iterate
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java"); // Duplicate
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("C++");
        System.out.println("ArrayList after removing C++: " + arrayList);

        // 2. LinkedList Example - Insertion at index
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "Ruby");
        System.out.println("LinkedList after adding Ruby: " + linkedList);

        // 3. HashSet Example - Uniqueness of elements
        Set<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet (unique elements): " + hashSet);

        // 4. TreeSet Example - Sorted order of elements
        Set<String> treeSet = new TreeSet<>(arrayList);
        System.out.println("TreeSet (sorted order): " + treeSet);

        // 5. HashMap Example - Key-value pairs
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(2, "Blueberry"); // Replace value of key 2
        System.out.println("HashMap: " + hashMap);

        // 6. TreeMap Example - Sorted by keys
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap (sorted by keys): " + treeMap);

        // 7. LinkedHashMap Example - Maintains insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // 8. PriorityQueue Example - Priority order
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");
        System.out.println("PriorityQueue (lexical order): " + queue);

        // 9. Stack Example - LIFO (Last In, First Out)
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        stack.pop(); // Pop the last element
        System.out.println("Stack after pop: " + stack);

        // 10. ArrayDeque Example - Double-ended queue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Java");
        deque.addLast("Python");
        System.out.println("ArrayDeque (first-last order): " + deque);

        // 11. Convert List to Set (remove duplicates)
        Set<String> setFromList = new HashSet<>(arrayList);
        System.out.println("Converted List to Set (no duplicates): " + setFromList);

        // 12. Convert Set to List
        List<String> listFromSet = new ArrayList<>(setFromList);
        System.out.println("Converted Set to List: " + listFromSet);

        // 13. Sorting a List using Comparator
        List<String> names = new ArrayList<>(Arrays.asList("Zebra", "Monkey", "Lion", "Elephant"));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + names);

        // 14. Iterate through Map entries using for-each
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 15. Find the maximum element in List
        String maxElement = Collections.max(names);
        System.out.println("Max element in List: " + maxElement);

        // 16. Synchronized List Example (Thread-safe)
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Java");
        syncList.add("Python");
        System.out.println("Synchronized List: " + syncList);

        // 17. Check if List contains an element
        boolean containsElement = arrayList.contains("Python");
        System.out.println("Contains 'Python': " + containsElement);

        // 18. ListIterator Example - Forward and backward traversal
        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.print("ListIterator forward: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.print("ListIterator backward: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        // 19. Enumeration Example - Legacy Enumeration for Vector
        Vector<String> vector = new Vector<>(arrayList);
        Enumeration<String> enumeration = vector.elements();
        System.out.print("\nEnumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // 20. Hashtable Example - Synchronized key-value store
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Red");
        hashtable.put(2, "Green");
        hashtable.put(3, "Blue");
        System.out.println("\nHashtable: " + hashtable);

        // 21. ConcurrentHashMap Example - Thread-safe Map
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Item1");
        concurrentMap.put(2, "Item2");
        concurrentMap.put(3, "Item3");
        concurrentMap.put(2, "UpdatedItem2"); // Replace value of key 2
        System.out.println("ConcurrentHashMap: " + concurrentMap);

        // 22. Removing duplicates using Java 8 Streams
        List<String> listWithDuplicates = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        List<String> uniqueList = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List without duplicates: " + uniqueList);

        // 23. Merge two Lists
        List<String> anotherList = Arrays.asList("Kotlin", "Scala");
        List<String> mergedList = new ArrayList<>(arrayList);
        mergedList.addAll(anotherList);
        System.out.println("Merged List: " + mergedList);

        // 24. Sum of elements in a List (using Java 8 Streams)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        // 25. Filter even numbers from List using Java 8 Streams
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
    }
}
