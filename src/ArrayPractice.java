public class ArrayPractice {
  public static void main(String[] args) {
    String[] fruits = new String[4];

// Set the value of the array at each index to be a different String

    // It's OK to do this one-by-one
    fruits[0] = "Orange"
    fruits[1] = "Pear"
    fruits[2] = "Banana"
    fruits[3] = "Cherry"

    

    // Get the value of the array at index 2
    String valueAtIndex2 = fruits[2];
    System.out.println("Value at index 2: " + valueAtIndex2);

    // Get the length of the array
    int arrayLength = fruits.length;
    System.out.println("Array length: " + arrayLength);


    // Iterate over the array using a traditional for loop and print out each item

      System.out.println("Traditional for loop:");
      for (int i = 0; i < fruits.length; i++) {
        System.out.println(fruits[i]);
    }

    // Iterate over the array using a for-each loop and print out each item

     System.out.println("For-each loop:");
      for (String fruit : fruits) {
      System.out.println(fruit);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
