package GUIINTERFACE;
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
     * @param name     The name of the item.
     * @param price    The price of the item.
     * @param calories The number of calories in the item.
     */
    public Item(String name, int price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    /**
     * Returns the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item to the specified value.
     *
     * @param name The new name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the item.
     *
     * @return The price of the item.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the item to the specified value.
     *
     * @param price The new price of the item.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns the number of calories in the item.
     *
     * @return The number of calories in the item.
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Provides a string representation of the item, including its name, price, and calories.
     *
     * @return A string representation of the item.
     */
    public String toString() {
        return "Item: " + name + "\nPrice: " + price + "\nCalories: " + calories;
    }
}

