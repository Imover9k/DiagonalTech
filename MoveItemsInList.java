import java.util.ArrayList;
import java.util.List;

public class MoveItemsInList {

    public static void main(String[] args) {
        // Create a list of items
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");

        // Print the original list
        System.out.println("Original list:");
        System.out.println(items);

        // Move items in the list
        moveItem(items, 1, 3); // Move "Item 2" to position 3

        // Print the modified list
        System.out.println("\nList after moving an item:");
        System.out.println(items);
    }

    public static void moveItem(List<String> list, int currentIndex, int newIndex) {
        // Check if the indices are valid
        if (currentIndex < 0 || currentIndex >= list.size() || newIndex < 0 || newIndex >= list.size()) {
            System.out.println("Invalid indices.");
            return;
        }

        // Remove the item from the current position
        String item = list.remove(currentIndex);

        // Add the item to the new position
        list.add(newIndex, item);
    }
}
