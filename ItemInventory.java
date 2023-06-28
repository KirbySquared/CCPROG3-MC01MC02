public class ItemInventory {
    private Item[] items;

    public ItemInventory() {
        items = new Item[8]; // Assuming 8 slots in the vending machine
    }

    public void addItem(Item item, int slot) {
        if (slot >= 0 && slot < items.length) {
            items[slot] = item;
        }
    }

    public Item getItem(int slot) {
        if (slot >= 0 && slot < items.length) {
            return items[slot];
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

    public void restockItems() {
       //need code hehe
    }
}
