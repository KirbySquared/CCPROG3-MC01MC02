import java.util.*;
public class ItemInventory {
    private ArrayList<Item> items;
    private ArrayList<Slot> inventoryslots;

    public ItemInventory() {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
        inventoryslots = this.VendingMachine.slots();
    }
    /**
     * addItem adds an Item to the ItemInventory
     * @param item
     * @param slot
     */
    public boolean addItem(Item item, int slot) {
        boolean value = false;

        if (slot >= 0 && slot < items.size() ) {
            items.add(slot, item);
            value = true;
        }

        return value;
    }

    public Item getItem(int slot) {
        if (slot >= 0 && slot < items.size()) {
            return items.get(slot);
        }
        
        return null;
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

    public int getItemCalories(int slot) {
        Item item = getItem(slot);
        if (item != null) {
            return item.getCalories();
        }
        return 0;
    }

    public boolean restockItems(Item item) {
       //need code hehe
       boolean value = false;
       ArrayList<Slot> tempslotlist = VendingMachine c.getSlots();
       if (items.contains(item) == true)
       {
        value = true;
        
        slot.get
       
       }

       return value;
    }
}
