import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListPractice {

  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> animals = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

    // Print the element at index 1
    System.out.println("Element at index 1: " + animals.get(1));

    // Replace the element at index 1 with a new value
    animals.set(1, "Lion");

    // (Do not insert a new value. The length of the list should not change)
    // Insert a new element at index 0 (the length of the list will change)
    animals.add(0, "Elephant");

    // Check whether the list contains a certain string
       if (animals.contains("Rabbit")) {
          System.out.println("The list contains 'Rabbit'.");
      } else {
          System.out.println("The list does not contain 'Rabbit'.");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

      System.out.println("Using traditional for loop:");
      for (int i = 0; i < animals.size(); i++) {
        System.out.println("Index " + i + ": " + animals.get(i));
    }

    // Sort the list using the Collections library

    Collections.sort(animals);

    System.out.println("For-each loop after sorting:");
    for (String animal : animals) {
      System.out.println(animal);
    }

    // Iterate over the list using a for-each loop
    // Print each value on a second line

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}