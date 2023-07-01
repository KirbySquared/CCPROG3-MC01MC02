/**
 * Represents a slot in the vending machine that holds an item and its quantity.
 */
public class Slot {

     /**
     * The item stored in the slot.
     */
    private Item item;

    /**
     * The quantity of the item in the slot.
     */
    private int quantity;

    /**
     * Constructs a slot with the specified item and quantity.
     *
     * @param item     the item stored in the slot
     * @param quantity the quantity of the item in the slot
     */
    public Slot(Item item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * Constructs a slot with the specified item and a default quantity of 10.
     *
     * @param item the item stored in the slot
     */
    public Slot(Item item)
    {
        this.item = item;
        this.quantity = 10;
    }

    /**
     * Returns the item stored in the slot.
     *
     * @return the item stored in the slot
     */
    public Item getItem()
    {
        return this.item;
    }

    /**
     * Returns the quantity of the item in the slot.
     *
     * @return the quantity of the item in the slot
     */
    public int getQuantity()
    {
        return this.quantity;
    }

     /**
     * Decreases the quantity of the item in the slot by the specified amount.
     *
     * @param quantity the quantity to be decreased
     * @return true if the quantity was successfully decreased, false otherwise
     */
    public boolean decreaseQuantity(int quantity)
    {   
        boolean value = true;

        if (this.quantity >= quantity)
        this.quantity -= quantity;
        else
        value = false;

        return value;
    }

     /**
     * Adds the specified quantity to the current quantity of the item in the slot.
     *
     * @param quantity the quantity to be added
     * @return true if the quantity was successfully added, false otherwise
     */
    public boolean addQuantity(int quantity)
    {   
        boolean value = true;

        if (quantity > 0)
        this.quantity += quantity;
        else
        value = false;

        return value;
    }
}
