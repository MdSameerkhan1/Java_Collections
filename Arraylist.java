
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access and print elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterate over the ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Remove an element
        fruits.remove("Apple");

        // Check if the ArrayList contains a specific element
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }
    }
}

