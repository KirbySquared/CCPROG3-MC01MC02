
/**
 * Represents an item in the vending machine.
 */
public class Item {
    /**
     * The name of the item.
     */
    private String name;

     /**
     * The price of the item.
     */
    private int price;

    /**
     * The number of calories in the item.
     */
    private int calories;

    /**
     * Constructs an item with the specified name, price, and calories.
     *
     * @param name     the name of the item
     * @param price    the price of the item
     * @param calories the number of calories in the item
     */
    public Item(String name, int price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

     /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the item.
     *
     * @return the price of the item
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the item to the specified value.
     *
     * @param price the new price of the item
     */
    public void setPrice(int price) {
        this.price = price;
    }

     /**
     * Returns the number of calories in the item.
     *
     * @return the number of calories in the item
     */
    public int getCalories() { 
        return calories;
    }
}
