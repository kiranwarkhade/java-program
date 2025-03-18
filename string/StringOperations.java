package practice.string;

import java.util.*;
import java.util.stream.Collectors;
//Author- kiran
public class StringOperations {

    public static void main(String[] args) throws Exception {

        // Sample string for all operations
        String str = "  Java 8, 11, 17, and 21 string manipulation examples! ";

        // 1. Trim spaces from both ends of a string
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // 2. Convert string to uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // 3. Convert string to lowercase
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // 4. Check if string contains a specific substring
        boolean contains = str.contains("Java");
        System.out.println("Contains 'Java': " + contains);

        // 5. Check if string starts with a specific prefix
        boolean startsWith = str.startsWith(" Java");
        System.out.println("Starts with ' Java': " + startsWith);

        // 6. Check if string ends with a specific suffix
        boolean endsWith = str.endsWith("examples!");
        System.out.println("Ends with 'examples!': " + endsWith);

        // 7. Get the length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // 8. Replace all occurrences of a substring
        String replaced = str.replace("Java", "Java 8/11/17");
        System.out.println("Replaced: " + replaced);

        // 9. Remove all spaces from a string
        String noSpaces = str.replaceAll("\\s", "");
        System.out.println("No spaces: " + noSpaces);

        // 10. Split a string into an array
        String[] words = str.split(" ");
        System.out.println("Split into words: " + Arrays.toString(words));

        // 11. Join elements of a collection into a string (Java 8)
        List<String> stringList = Arrays.asList("Java", "8", "11", "17", "21");
        String joined = String.join(" | ", stringList);
        System.out.println("Joined: " + joined);

        // 12. Convert string to a stream and filter elements (Java 8)
        List<String> filtered = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(s -> s.equals("a"))
                .collect(Collectors.toList());
        System.out.println("Filtered 'a': " + filtered);

        // 13. Check if string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is string empty: " + isEmpty);

        // 14. Check if string is blank (Java 11)
        boolean isBlank = str.isBlank();
        System.out.println("Is string blank: " + isBlank);

        // 15. Repeat a string (Java 11)
        String repeated = "Java".repeat(3);
        System.out.println("Repeated 'Java' 3 times: " + repeated);

        // 16. Remove leading whitespace (Java 11)
        String leadingRemoved = str.stripLeading();
        System.out.println("Strip leading: " + leadingRemoved);

        // 17. Remove trailing whitespace (Java 11)
        String trailingRemoved = str.stripTrailing();
        System.out.println("Strip trailing: " + trailingRemoved);

        // 18. Convert string to a stream of characters and collect (Java 8)
        List<Character> charsList = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println("String to char list: " + charsList);

        // 19. String format with placeholders (Java 8)
        String formatted = String.format("Hello %s, today is %s", "John", "Monday");
        System.out.println("Formatted string: " + formatted);

        // 20. Get substring from a string
        String substring = str.substring(6, 10);
        System.out.println("Substring: " + substring);

        // 21. Remove all non-alphabetic characters
        String alphabetsOnly = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("Alphabets only: " + alphabetsOnly);

        // 22. Convert string to an Optional (Java 8)
        Optional<String> optionalStr = Optional.ofNullable(str);
        System.out.println("Optional: " + optionalStr.orElse("Default Value"));

        // 23. Check if string matches a regular expression
        boolean matches = str.matches(".*Java.*");
        System.out.println("Matches '.*Java.*': " + matches);

        // 24. Convert string to an array of characters
        char[] charArray = str.toCharArray();
        System.out.println("Char array: " + Arrays.toString(charArray));

        // 25. Get the index of the first occurrence of a character
        int indexOfChar = str.indexOf('J');
        System.out.println("Index of 'J': " + indexOfChar);

        // 26. Get the index of the last occurrence of a character
        int lastIndexOfChar = str.lastIndexOf('a');
        System.out.println("Last index of 'a': " + lastIndexOfChar);

        // 27. Convert string to a stream and print each character (Java 8)
        str.chars().forEach(c -> System.out.print((char) c + " "));
        System.out.println();

       /* // 28. Convert string to title case (Java 8)
        String titleCase = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println("Title case: " + titleCase);
*/
        // 29. Compare two strings ignoring case
        boolean equalsIgnoreCase = "java".equalsIgnoreCase("JAVA");
        System.out.println("Equals ignoring case: " + equalsIgnoreCase);

        // 30. Check if a string starts with any of the prefixes (Java 17)
        boolean startsWithPrefix = str.startsWith(" Ja") || str.startsWith(" Ja");
        System.out.println("Starts with ' Ja' or ' Ja': " + startsWithPrefix);

        // 31. Strip leading and trailing whitespaces (Java 17)
        String stripped = str.strip();
        System.out.println("Stripped: " + stripped);

      /*  // 32. Transform string (Java 17)
        String transformed = str.transform(s -> s.replace("Java", "Java 8/11/17/21"));
        System.out.println("Transformed: " + transformed);

        // 33. Strip unnecessary whitespaces (Java 21)
        String stripped21 = str.stripIndent();
        System.out.println("Stripped indent: " + stripped21);
*/
        // 34. Get the code point count in string
        int codePointCount = str.codePointCount(0, str.length());
        System.out.println("Code point count: " + codePointCount);

        // 35. Retrieve a substring from the string using offsets (Java 17)
        String substringOffset = str.substring(5, 15);
        System.out.println("Substring using offsets: " + substringOffset);

        // 36. Check if a string ends with a given suffix using Java 8
        boolean endsWithSuffix = str.endsWith("examples!");
        System.out.println("Ends with 'examples!': " + endsWithSuffix);

        // 37. Convert string to a list of words (Java 8)
        List<String> wordsList = Arrays.asList(str.split("\\s+"));
        System.out.println("Words List: " + wordsList);

        // 38. Format string with dynamic input (Java 8)
        String name = "John";
        String city = "New York";
        String formatted2 = String.format("My name is %s, and I live in %s.", name, city);
        System.out.println(formatted2);

        // 39. Concatenate multiple strings (Java 11)
        String concatenated = String.join("-", "Java", "8", "11", "17", "21");
        System.out.println("Concatenated string: " + concatenated);

        // 40. Check if string contains only digits (Java 17)
        boolean isDigits = str.chars().allMatch(Character::isDigit);
        System.out.println("Contains only digits: " + isDigits);

        // 41. Compare two strings lexicographically
        int compare = "java".compareTo("java");
        System.out.println("Compare: " + compare);

        // 42. Get a substring before a certain character
        String beforeChar = str.substring(0, str.indexOf(','));
        System.out.println("Substring before comma: " + beforeChar);

        // 43. Remove all digits from a string
        String withoutDigits = str.replaceAll("\\d", "");
        System.out.println("Without digits: " + withoutDigits);

        // 44. Convert a string to a Set of characters
        Set<Character> charSet = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        System.out.println("Set of characters: " + charSet);

        // 45. Check if a string contains only alphabetic characters
        boolean isAlpha = str.matches("[a-zA-Z ]+");
        System.out.println("Is alphabetic: " + isAlpha);

        // 46. Split string by multiple delimiters
        String[] multiSplit = str.split("[,\\s!]");
        System.out.println("Multi split: " + Arrays.toString(multiSplit));

        // 47. Replace first occurrence of a substring
        String replacedFirst = str.replaceFirst("Java", "Java 8");
        System.out.println("Replaced first 'Java': " + replacedFirst);

    }
    }