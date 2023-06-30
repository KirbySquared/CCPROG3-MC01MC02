import java.util.*;
public class ItemInventory {
    private ArrayList<Item> items;

    public ItemInventory() {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
    }

    public int getItemCount() {
        int count = 0;
        for (Item item : items) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    public int getItemCalories(int slot) { //slot refers to Slot currently assigned to in the machine
        Item item = items.get(slot);
        if (item != null) {
            return item.getCalories();
        }
        return 0;
    }

    public ArrayList<Item> getInventory()
    {
        return this.items;
    }
}
