package practice.collection_example;

import java.util.*;
import java.util.stream.Collectors;

//Author- KIRAN
public class CollectionOperation {
    public static void main(String[] args) {

        // 1. ArrayList example - Add and remove elements
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        System.out.println("ArrayList: " + list);
        list.remove("C++");
        System.out.println("After removing C++: " + list);

        // 2. LinkedList example - Insertion at specific index
        List<String> linkedList = new LinkedList<>(list);
        linkedList.add(1, "Ruby");
        System.out.println("LinkedList: " + linkedList);

        // 3. HashSet example - Uniqueness of elements
        Set<String> hashSet = new HashSet<>(list);
        System.out.println("HashSet (unique elements): " + hashSet);

        // 4. TreeSet example - Sorted order
        Set<String> treeSet = new TreeSet<>(list);
        System.out.println("TreeSet (sorted order): " + treeSet);

        // 5. HashMap example - Store key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(1, "Avocado"); // Update existing key
        System.out.println("HashMap: " + map);

        // 6. TreeMap example - Sorted by keys
        Map<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println("TreeMap (sorted by keys): " + treeMap);

        // 7. LinkedHashMap example - Insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(map);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // 8. PriorityQueue example - Priority order
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");
        System.out.println("PriorityQueue: " + queue);

        // 9. Stack example - LIFO order
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        stack.pop();
        System.out.println("After pop: " + stack);

        // 10. ArrayDeque example - Double-ended queue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Java");
        deque.addLast("Python");
        System.out.println("ArrayDeque: " + deque);

        // 11. Convert List to Set (remove duplicates)
        Set<String> setFromList = new HashSet<>(list);
        System.out.println("Converted List to Set (no duplicates): " + setFromList);

        // 12. Convert Set to List
        List<String> listFromSet = new ArrayList<>(setFromList);
        System.out.println("Converted Set to List: " + listFromSet);

        // 13. Sort List using Comparator
        List<String> names = new ArrayList<>(Arrays.asList("Zebra", "Monkey", "Lion", "Elephant"));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + names);

        // 14. Iterate through Map entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 15. Find max element in List
        String maxElement = Collections.max(names);
        System.out.println("Max element in List: " + maxElement);

        // 16. Create and print a synchronized List
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Java");
        syncList.add("Python");
        syncList.add("C++");
        System.out.println("Synchronized List: " + syncList);

        // 17. Check if List contains an element
        boolean containsElement = list.contains("Python");
        System.out.println("Contains 'Python': " + containsElement);

        // 18. Use ListIterator to traverse List
        ListIterator<String> iterator = list.listIterator();
        System.out.print("ListIterator output: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // 19. Group elements of a List into a Map (group by length of string)
        Map<Integer, List<String>> groupedByLength = new HashMap<>();
        for (String word : list) {
            groupedByLength.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        }
        System.out.println("Grouped by word length: " + groupedByLength);

        // 20. Compute sum of elements in a List (using streams)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        // 21. Find the first occurrence of an element in List
        int firstIndex = list.indexOf("Python");
        System.out.println("First occurrence of 'Python': " + firstIndex);

        // 22. Filter even numbers from List using Java 8 Streams
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // 23. Merge two lists
        List<String> anotherList = Arrays.asList("Kotlin", "Scala");
        List<String> mergedList = new ArrayList<>(list);
        mergedList.addAll(anotherList);
        System.out.println("Merged List: " + mergedList);

        // 24. Remove duplicates from List using Java 8 Streams
        List<String> listWithDuplicates = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        List<String> uniqueList = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List without duplicates: " + uniqueList);
    }
}
