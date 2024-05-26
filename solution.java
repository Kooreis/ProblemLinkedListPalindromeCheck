Here is a Java console application that checks if a linked list is a palindrome:

```java
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> linkedList = new LinkedList<>();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            linkedList.add(c);
        }

        boolean isPalindrome = isPalindrome(linkedList);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    private static boolean isPalindrome(LinkedList<Character> linkedList) {
        int start = 0;
        int end = linkedList.size() - 1;

        while (start < end) {
            if (!linkedList.get(start).equals(linkedList.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
```

This application reads a string from the console, adds each character to a linked list, and then checks if the linked list is a palindrome. The `isPalindrome` method works by comparing the characters at the start and end of the list, and then moving inwards until it has checked all pairs of characters. If it finds a pair that doesn't match, it returns `false`. If it checks all pairs without finding a mismatch, it returns `true`.