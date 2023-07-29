package GUIINTERFACE;
import java.util.*;
/**
 * Represents the inventory of items in a vending machine.
 */

public class ItemInventory {
    /**
     * The list of items in the inventory.
     */
    private ArrayList<Item> items;

    /**
     * Constructs an empty item inventory with an initial capacity of 8.
     *
     */
    public ItemInventory() {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
    }

     /**
     * Returns the count of items in the inventory.
     *
     * @return the count of items
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
     * @param slot the slot number
     * @return the number of calories for the item at the specified slot
     */
    public int getItemCalories(int slot) { //slot refers to Slot currently assigned to in the machine
        Item item = items.get(slot);
        if (item != null) {
            return item.getCalories();
        }
        return 0;
    }

    /**
     * Returns the list of items in the inventory.
     *
     * @return the list of items
     */
    public ArrayList<Item> getInventory()
    {
        return this.items;
    }
}
