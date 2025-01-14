import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String message = "Hello";

    // Find the length of the string
    int length = message.length();
    System.out.println("Length of the string: " + length);

    // Concatenate (add) two strings together and reassign the result
    message += " World!";
    System.out.println("Concatenated string: " + message);

    // Find the value of the character at index 3
    char charAtIndex3 = message.charAt(3);
    System.out.println("Character at index 3: " + charAtIndex3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsWord = message.contains("World");
    System.out.println("Does the string contain 'World'? " + containsWord);

    // Iterate over the characters of the string, printing each one on a separate line
     System.out.println("Characters in the string:");
     for (char ch : message.toCharArray()) {
      System.out.println(ch);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> words = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    words.add("Java");
    words.add("is");
    words.add("awesome");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedWords = String.join(", ", words);
    System.out.println("Joined string: " + joinedWords);

    // Check whether two strings are equal
    String str1 = "Hello";
    String str2 = "hello";
    boolean areEqual = str1.equalsIgnoreCase(str2);
    System.out.println("Are the strings equal (ignoring case)? " + areEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
