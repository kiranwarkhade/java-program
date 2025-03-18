package practice.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Author- KIRAN
public class ArrayOperationsJava8 {

    public static void main(String[] args) {

        // Sample array of integers
        int[] numbers = {10, 5, 20, 15, 35, 50, 40, 25, 30, 45};

        // Display the original array
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(numbers));

        // 1. Sorting the array in ascending order using Java 8 Streams
        int[] sortedNumbers = Arrays.stream(numbers)
                .sorted() // Sorting in ascending order
                .toArray();
        System.out.println("\nSorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(sortedNumbers));

        // 2. Find even numbers using filter
        System.out.println("\nEven Numbers in the Array: ");
        Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)  // Filtering even numbers
                .forEach(num -> System.out.print(num + " "));

        // 3. Multiply each element by 2 using map
        System.out.println("\n\nMultiply each element by 2: ");
        Arrays.stream(numbers)
                .map(num -> num * 2)  // Multiplying each element by 2
                .forEach(num -> System.out.print(num + " "));

        // 4. Calculate the sum of all elements using reduce
        int sum = Arrays.stream(numbers)
                .reduce(0, Integer::sum); // Summing elements using reduce
        System.out.println("\n\nSum of all elements in the array: " + sum);

        // 5. Convert array to List using Streams (to demonstrate Collection conversion)
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed() // Convert int[] to Integer
                .collect(Collectors.toList());
        System.out.println("\nArray converted to List: ");
        System.out.println(numberList);

        // 6. Using forEach with Method Reference (instead of Lambda)
        System.out.println("\nArray elements using forEach with Method Reference: ");
        Arrays.stream(numbers)
                .forEach(System.out::print);  // Using method reference to print each element

        // 7. Check if all numbers are greater than 5
        boolean allGreaterThan5 = Arrays.stream(numbers)
                .allMatch(num -> num > 5);
        System.out.println("\n\nAre all numbers greater than 5? " + allGreaterThan5);

        // 8. Find the max element in the array
        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println("\nMax element in the array: " + max);

        // 9. Find the min element in the array
        int min = Arrays.stream(numbers)
                .min()
                .orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println("\nMin element in the array: " + min);

        // 10. Count the number of elements greater than 20
        long countGreaterThan20 = Arrays.stream(numbers)
                .filter(num -> num > 20)
                .count();
        System.out.println("\nNumber of elements greater than 20: " + countGreaterThan20);
    }
}

