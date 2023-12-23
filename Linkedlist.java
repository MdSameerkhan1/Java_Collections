import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Access and print elements
        System.out.println("First fruit: " + linkedList.getFirst());
        System.out.println("Last fruit: " + linkedList.getLast());

        // Iterate over the LinkedList
        System.out.println("All fruits:");
        for (String fruit : linkedList) {
            System.out.println("- " + fruit);
        }

        // Add an element at the beginning
        linkedList.addFirst("Grapes");
        

        // Add an element at the end
        linkedList.addLast("Pineapple");
          System.out.println("All Fruits after changes");
          for (String fruit : linkedList) {
              System.out.println("- " + fruit);
          }
        // Remove an element
        linkedList.remove("Banana");

        // Check if the LinkedList contains a specific element
        if (linkedList.contains("Banana")) {
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }
    }
}
