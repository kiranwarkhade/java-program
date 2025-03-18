package practice.array;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperations {

    public static void main(String[] args) {

        // Sample array for all operations
        int[] numbers = {10, 5, 20, 50, 35, 40, 15, 25, 30, 45};

        // 1. Find the largest number in an array
        int largest = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest number: " + largest);

        // 2. Find the smallest number in an array
        int smallest = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Smallest number: " + smallest);

        // 3. Sort the array in ascending order
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));

        // 4. Reverse the array
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // 5. Check if the array is sorted
        boolean isSorted = Arrays.equals(numbers, Arrays.stream(numbers).sorted().toArray());
        System.out.println("Is array sorted: " + isSorted);

        // 6. Find the second largest element
        int secondLargest = Arrays.stream(numbers).distinct().sorted().toArray()[numbers.length - 2];
        System.out.println("Second largest number: " + secondLargest);

        // 7. Count occurrences of a specific number
        int count = (int) Arrays.stream(numbers).filter(n -> n == 20).count();
        System.out.println("Occurrences of 20: " + count);

        // 8. Merge two arrays
        int[] anotherArray = {60, 70, 80};
        int[] mergedArray = new int[numbers.length + anotherArray.length];
        System.arraycopy(numbers, 0, mergedArray, 0, numbers.length);
        System.arraycopy(anotherArray, 0, mergedArray, numbers.length, anotherArray.length);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // 9. Remove duplicate elements from an array
        int[] withoutDuplicates = Arrays.stream(numbers).distinct().toArray();
        System.out.println("Array without duplicates: " + Arrays.toString(withoutDuplicates));

        // 10. Find the average of the elements
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Average of the array: " + average);

        // 11. Multiply each element by 2
        int[] multipliedArray = Arrays.stream(numbers).map(n -> n * 2).toArray();
        System.out.println("Array with elements multiplied by 2: " + Arrays.toString(multipliedArray));

        // 12. Check if all elements are greater than a specific value
        boolean allGreaterThan20 = Arrays.stream(numbers).allMatch(n -> n > 20);
        System.out.println("All elements greater than 20: " + allGreaterThan20);

        // 13. Check if any element is even
        boolean anyEven = Arrays.stream(numbers).anyMatch(n -> n % 2 == 0);
        System.out.println("Any even number: " + anyEven);

        // 14. Get the sum of all elements
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of elements: " + sum);

        // 15. Find the maximum value using reduce
        int maxValue = Arrays.stream(numbers).reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Maximum value using reduce: " + maxValue);

        // 16. Find the minimum value using reduce
        int minValue = Arrays.stream(numbers).reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Minimum value using reduce: " + minValue);

        // 17. Convert array to a list
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println("Array as List: " + numberList);

        // 18. Find the first element greater than 20
        OptionalInt firstGreaterThan20 = Arrays.stream(numbers).filter(n -> n > 20).findFirst();
        firstGreaterThan20.ifPresent(value -> System.out.println("First number greater than 20: " + value));

        // 19. Sort the array in descending order
        int[] descendingArray = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Sorted in descending order: " + Arrays.toString(descendingArray));

        // 20. Find the count of elements greater than 30
        long countGreaterThan30 = Arrays.stream(numbers).filter(n -> n > 30).count();
        System.out.println("Count of numbers greater than 30: " + countGreaterThan30);

        // 21. Rotate array by n positions
        int n = 2;
        int[] rotatedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotatedArray[(i + n) % numbers.length] = numbers[i];
        }
        System.out.println("Array after rotation by " + n + " positions: " + Arrays.toString(rotatedArray));

        // 22. Find the intersection of two arrays
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {20, 30, 50, 60};
        int[] intersection = Arrays.stream(array1).filter(n -> Arrays.stream(array2).anyMatch(x -> x == n)).toArray();
        System.out.println("Intersection of two arrays: " + Arrays.toString(intersection));

        // 23. Find the union of two arrays
        int[] union = Arrays.stream(new int[][]{array1, array2})
                .flatMapToInt(Arrays::stream)
                .distinct()
                .toArray();
        System.out.println("Union of two arrays: " + Arrays.toString(union));

        // 24. Remove all elements less than 20
        int[] filteredArray = Arrays.stream(numbers).filter(n -> n >= 20).toArray();
        System.out.println("Array with elements >= 20: " + Arrays.toString(filteredArray));

        // 25. Create an array of squares of the elements
        int[] squaredArray = Arrays.stream(numbers).map(n -> n * n).toArray();
        System.out.println("Array of squares: " + Arrays.toString(squaredArray));
    }
}
