package GUIINTERFACE;

import java.util.ArrayList;

/**
 * Represents a slot in the vending machine that holds multiple items and their quantity.
 */
public class Slot {

    /**
     * The list of items stored in the slot.
     */
    private ArrayList<Item> items;

    /**
     * Constructs a slot with the specified list of items and their quantity.
     *
     * @param items    the list of items stored in the slot
     */
    public Slot(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * Constructs a slot with the specified item and a default quantity of 10.
     *
     * @param item the item to be added to the slot
     */
    public Slot(Item item) {
        this.items = new ArrayList<>();
        this.items.add(item);
    }

    /**
     * Returns the list of items stored in the slot.
     *
     * @return the list of items stored in the slot
     */
    public ArrayList<Item> getItems() {
        return this.items;
    }

    /**
     * Returns the quantity of the item in the slot.
     *
     * @return the quantity of the item in the slot
     */
    public int getQuantity() {
        int value = 0;
        Item dummyItem = new Item("Dummy Item", 0,0); // Create a dummy item with zero price
        
        if (items.isEmpty() ) 
        {
            // If the slot is empty, add a dummy item and return its quantity as 0
            items.add(dummyItem);
            return value;
        } 
        else if ( items.get(0).getName().equals("Dummy Item") )
        {
            return value;
        }
       else
       {
            return this.items.size();
       } 
    }

    /**
     * Decreases the quantity of the item in the slot by the specified amount.
     *
     * @param quantity the quantity to be decreased
     * @return true if the quantity was successfully decreased, false otherwise
     */
    public boolean decreaseQuantity(int quantity) {
        boolean value = true;
        if (this.items.size() >= quantity) 
        {
            for (int i = 0; i < quantity; i++) {
                this.items.remove(0); // Remove items from the front of the list
            }
            if (this.items.isEmpty() )
            {
               this.items.add(new Item("Dummy Item", 0,0));
            }
        } 
        else {
            value = false;
        }
        return value;
    }

    /**
     * Adds the specified quantity of items to the current items in the slot.
     *
     * @param item     the item to be added
     * @param quantity the quantity to be added
     */
    public void addItems(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.items.add(item);
        }
    }

    public Item getItemAtIndex(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}
