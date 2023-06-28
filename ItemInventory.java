import java.util.*;
public class ItemInventory {
    private ArrayList<Item> items;
    private ArrayList<Slot> inventoryslots;
    private ItemInventory startingInventory;

    public ItemInventory(ArrayList<Slot> slots) {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
        this.inventoryslots = slots;
    }
    public ItemInventory() {
        this.items = new ArrayList<>(8); // Assuming 8 slots in the vending machine
        this.inventoryslots = new ArrayList<Slot>(8);
    }
    /**
     * addItem adds an Item to the ItemInventory
     * @param item
     * @param slot
     */
    public boolean addItem(Item item, int slot) {
        boolean value = false;
        slot -=1;

        if (slot >= 0 && slot < items.size() ) {
            items.set(slot, item);
            value = true;
        }
        else if (slot >= 0 && slot > items.size() )
        {
            items.add(slot,item);
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

    public ArrayList<Item> getInventory()
    {
        return this.items;
    }

     public ItemInventory getStartingInventory() {
        return startingInventory;
    }

    /* public ItemInventory getEndingInventory(ItemInventory runningInventory) {

        ItemInventory endingInventory = runningInventory;
        return endingInventory;
        What if yung current inventory nalang ng VendingMachine gamitin since ending Inventory din naman
    } */
}
