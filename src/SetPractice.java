import java.util.HashSet;
import java.util.Set;



public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> fruits = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    // Check whether the Set contains a given String
     if (fruits.contains("Banana")) {
      System.out.println("The set contains 'Banana'.");
    } else {
      System.out.println("The set does not contain 'Banana'.");
    }

    // Remove an element from the Set
    fruits.remove("Cherry");

    // Get the size of the Set
    System.out.println("Size of the set: " + fruits.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("Elements in the set:");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
