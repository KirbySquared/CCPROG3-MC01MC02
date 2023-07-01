/**
 * Represents a sale of an item in the vending machine.
 */
public class Sale {

    /**
     * The item being sold.
     */
    private Item item;

    /**
     * The quantity of the item being sold.
     */
    private int quantity;

    /**
     * Constructs a sale with the specified item and a quantity of 1.
     *
     * @param item the item being sold
     */
    public Sale(Item item) {
        this.item = item;
        this.quantity = 1;
    }

    /**
     * Constructs a sale with the specified item and quantity.
     *
     * @param item     the item being sold
     * @param quantity the quantity of the item being sold
     */
    public Sale(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * Returns the item being sold.
     *
     * @return the item being sold
     */
    public Item getItem() {
        return item;
    }

     /**
     * Returns the quantity of the item being sold.
     *
     * @return the quantity of the item being sold
     */
    public int getQuantity() {
        return quantity;
    }

     /**
     * Adds the specified quantity to the current quantity of the item being sold.
     *
     * @param quantity the quantity to be added
     * @return true if the quantity was successfully added, false otherwise
     */
    public boolean addQuantity(int quantity) {

        boolean value = true;

        if (quantity > 0)
        this.quantity += quantity;
        else
        value = false;

        return value;
    }

     /**
     * Decreases the quantity of the item being sold by the specified amount.
     *
     * @param quantity the quantity to be decreased
     * @return true if the quantity was successfully decreased, false otherwise
     */
    public boolean decreaseQuantity(int quantity) {

        boolean value = true;

        if (quantity > 0 && this.quantity >= quantity)
        this.quantity -= quantity;
        else
        value = false;

        return value;
    }
}

