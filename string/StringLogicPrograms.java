package practice.string;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

//Author- kiran
public class StringLogicPrograms {

    public static void main(String[] args) {
        String str = "Java Programming, Hello World! 123 Java";

        // 1. Reverse a string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 2. Check if a string is a palindrome
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("Is palindrome: " + isPalindrome);

        // 3. Count vowels in a string
        long vowelCount = str.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count();
        System.out.println("Vowel count: " + vowelCount);

        // 4. Count consonants in a string
        long consonantCount = str.chars().filter(c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1).count();
        System.out.println("Consonant count: " + consonantCount);

        // 5. Check if a string contains only digits
        boolean isDigitsOnly = str.chars().allMatch(Character::isDigit);
        System.out.println("Contains only digits: " + isDigitsOnly);

        // 6. Check if a string contains only alphabets
        boolean isAlphabetsOnly = str.chars().allMatch(Character::isLetter);
        System.out.println("Contains only alphabets: " + isAlphabetsOnly);

        // 7. Replace all digits in a string with a character
        String noDigits = str.replaceAll("\\d", "#");
        System.out.println("String without digits: " + noDigits);

        // 8. Find the longest word in a string
        String longestWord = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest word: " + longestWord);

        // 9. Find the shortest word in a string
        String shortestWord = Arrays.stream(str.split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Shortest word: " + shortestWord);

        // 10. Count occurrences of a specific character
        long charCount = str.chars().filter(c -> c == 'a').count();
        System.out.println("Occurrences of 'a': " + charCount);

        // 11. Convert string to a char array
        char[] charArray = str.toCharArray();
        System.out.println("Char array: " + Arrays.toString(charArray));

        // 12. Convert string to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // 13. Convert string to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // 14. Remove white spaces from the string
        String noSpaces = str.replaceAll("\\s", "");
        System.out.println("No spaces: " + noSpaces);

        // 15. Check if a string starts with a specific prefix
        boolean startsWithPrefix = str.startsWith("Java");
        System.out.println("Starts with 'Java': " + startsWithPrefix);

        // 16. Check if a string ends with a specific suffix
        boolean endsWithSuffix = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithSuffix);

        // 17. Convert string into a list of words
        List<String> words = Arrays.asList(str.split("\\s+"));
        System.out.println("Words List: " + words);

        // 18. Find the first non-repeating character in a string
        char firstNonRepeating = str.chars()
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .mapToObj(c -> (char) c)
                .findFirst()
                .orElse('\0');
        System.out.println("First non-repeating character: " + firstNonRepeating);

        // 19. Find the last non-repeating character in a string
        char lastNonRepeating = str.chars()
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .mapToObj(c -> (char) c)
                .reduce((first, second) -> second)
                .orElse('\0');
        System.out.println("Last non-repeating character: " + lastNonRepeating);

        // 20. Check if a string contains a substring
        boolean containsSubstring = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsSubstring);

        // 21. Extract a substring from a string
        String substring = str.substring(5, 16);
        System.out.println("Substring from index 5 to 16: " + substring);

        // 22. Convert string into a Map of characters with their counts
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Character count map: " + charCountMap);

        // 23. Replace first occurrence of a substring
        String replacedFirst = str.replaceFirst("Java", "Python");
        System.out.println("Replaced first occurrence: " + replacedFirst);

        // 24. Replace all occurrences of a substring
        String replacedAll = str.replace("Java", "Python");
        System.out.println("Replaced all occurrences: " + replacedAll);

        // 25. Split a string based on a specific delimiter
        String[] splitWords = str.split(", ");
        System.out.println("Split words: " + Arrays.toString(splitWords));

        // 26. Check if a string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is string empty: " + isEmpty);

        // 27. Find the index of the first occurrence of a character
        int indexOfChar = str.indexOf('J');
        System.out.println("Index of 'J': " + indexOfChar);

        // 28. Find the index of the last occurrence of a character
        int lastIndexOfChar = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfChar);

        // 29. Convert string to an integer
        String numStr = "12345";
        int num = Integer.parseInt(numStr);
        System.out.println("Converted to integer: " + num);

        // 30. Check if a string is a valid integer (try-catch)
        try {
            Integer.parseInt(str);
            System.out.println("Valid integer");
        } catch (NumberFormatException e) {
            System.out.println("Not a valid integer");
        }

        // 31. Find the longest sequence of vowels in the string
        String[] vowelSequences = str.split("[^AEIOUaeiou]+");
        String longestVowelSeq = Arrays.stream(vowelSequences)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest vowel sequence: " + longestVowelSeq);

        // 32. Count the number of words in a string
        long wordCount = Arrays.stream(str.split("\\s+")).count();
        System.out.println("Word count: " + wordCount);

        // 33. Reverse each word in a string
        String reversedWords = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed words: " + reversedWords);

        // 34. Remove all vowels from a string
        String withoutVowels = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Without vowels: " + withoutVowels);

        // 35. Check if string is an anagram of another string
        String str2 = "avaJ";
        boolean isAnagram = sortString(str).equals(sortString(str2));
        System.out.println("Is anagram: " + isAnagram);

        // 36. Sort characters of a string alphabetically
        String sortedString = str.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Sorted string: " + sortedString);

        // 37. Convert a string to a list of characters
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println("List of characters: " + charList);

        // 38. Capitalize the first letter of each word in the string
        String capitalizedWords = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println("Capitalized words: " + capitalizedWords);

        // 39. Check if a string contains only one word (without spaces)
        boolean containsOneWord = !str.contains(" ");
        System.out.println("Contains only one word: " + containsOneWord);

        // 40. Convert a string to an array of integers
        int[] intArray = str.chars().map(c -> (int) c).toArray();
        System.out.println("String to int array: " + Arrays.toString(intArray));

        // 41. Remove duplicate characters from a string
        String uniqueChars = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Unique characters: " + uniqueChars);

        // 42. Swap first and last characters of the string
        String swapped = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        System.out.println("Swapped first and last characters: " + swapped);

        // 43. Check if a string contains any punctuation
        boolean containsPunctuation = str.matches(".*[!,.?;:].*");
        System.out.println("Contains punctuation: " + containsPunctuation);

        // 44. Convert a string into a Set of words
        Set<String> wordSet = new HashSet<>(Arrays.asList(str.split("\\s+")));
        System.out.println("Set of words: " + wordSet);

        // 45. Convert string to camel case
        String camelCase = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
        camelCase = Character.toLowerCase(camelCase.charAt(0)) + camelCase.substring(1);
        System.out.println("Camel case: " + camelCase);

        // 46. Convert string into ASCII codes
        String asciiCodes = str.chars()
                .mapToObj(c -> String.valueOf(c))
                .collect(Collectors.joining(" "));
        System.out.println("ASCII codes: " + asciiCodes);

        // 47. Reverse the words in a sentence
        String reversedWordsSentence = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed words in sentence: " + reversedWordsSentence);

        // 48. Check if a string is a valid email address (simple validation)
        boolean isValidEmail = str.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        System.out.println("Valid email address: " + isValidEmail);

        // 49. Remove all non-alphabetic characters from the string
        String alphabeticOnly = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("Only alphabetic: " + alphabeticOnly);

        // 50. Count the number of uppercase letters
        long upperCaseCount = str.chars().filter(Character::isUpperCase).count();
        System.out.println("Uppercase letters count: " + upperCaseCount);
    }

    // Helper method to sort a string
    private static String sortString(String str) {
        return str.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // 1. Reverse a string using for loop
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // 2. Check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 3. Count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    // 4. Count the number of consonants in a string
    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')) {
                count++;
            }
        }
        return count;
    }

    // 5. Check if a string contains a specific character
    public static boolean containsCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    // 6. Remove all digits from a string
    public static String removeDigits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // 7. Convert string to uppercase using for loop
    public static String toUpperCase(String str) {
        StringBuilder upperCaseStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                upperCaseStr.append(Character.toUpperCase(ch));
            } else {
                upperCaseStr.append(ch);
            }
        }
        return upperCaseStr.toString();
    }

    // 8. Find the first non-repeating character in a string
    public static char firstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0'; // Return null character if no non-repeating character found
    }

    // 9. Count occurrences of a specific character in the string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // 10. Check if a string contains only alphabets using a for loop
    public static boolean isAlphaOnly(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
