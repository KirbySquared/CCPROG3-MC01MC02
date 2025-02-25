package GUIINTERFACE;
import java.util.*;
/**
 * Represents the inventory of items in a vending machine.
 * The class holds a list of items that can be stored in the vending machine slots.
 */
public class ItemInventory {
    /**
     * The list of items in the inventory.
     */
    private ArrayList<Item> items;

    /**
     * Constructs an empty item inventory with an initial capacity of 8.
     * This constructor is typically used when initializing the inventory for a new vending machine.
     */
    public ItemInventory() {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
    }

    /**
     * Returns the count of items in the inventory.
     *
     * @return The count of items in the inventory.
     */
    public int getItemCount() {
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of calories for the item at the specified slot in the inventory.
     *
     * @param slot The slot number where the item is located in the inventory.
     * @return The number of calories for the item at the specified slot.
     */
    public int getItemCalories(int slot) {
        Item item = items.get(slot);
        if (item != null) {
            return item.getCalories();
        }
        return 0;
    }

    /**
     * Returns the list of items in the inventory.
     *
     * @return The list of items in the inventory.
     */
    public ArrayList<Item> getInventory() {
        return this.items;
    }
}
