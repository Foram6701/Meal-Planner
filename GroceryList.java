import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryList {
    private Map<String, Boolean> items;

    public GroceryList() {
        items = new HashMap<>();
    }

    public void addIngredients(List<String> ingredients) {
        for (String ingredient : ingredients) {
            items.putIfAbsent(ingredient, false); // false means not checked off
        }
    }

    public void checkOffItem(String item) {
        if (items.containsKey(item)) {
            items.put(item, true); // true means checked off
            System.out.println("Checked off: " + item);
        } else {
            System.out.println("Item not found in the grocery list.");
        }
    }

    public void checkOffAllItems() {
        items.replaceAll((key, value) -> true); // Mark all items as checked off
    }

    public boolean allItemsCheckedOff() {
        return items.values().stream().allMatch(checked -> checked); // Check if all are true
    }

    public void displayList() {
        System.out.println("\nGrocery List:");
        for (Map.Entry<String, Boolean> entry : items.entrySet()) {
            String status = entry.getValue() ? "(Checked Off)" : "(Pending)";
            System.out.println("- " + entry.getKey() + " " + status);
        }
    }
}
