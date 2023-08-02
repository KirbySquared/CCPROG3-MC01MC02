package GUIINTERFACE;

/**
 * Represents an ingredient that can be used in a custom item.
 * This class extends the Item class and inherits its properties and methods.
 * An ingredient has a name, price, and calorie information.
 */
public class Ingredient extends Item {

    /**
     * Creates a new Ingredient object with the specified name, price, and calories.
     *
     * @param name     The name of the ingredient.
     * @param price    The price of the ingredient.
     * @param calories The calorie information of the ingredient.
     */
    public Ingredient(String name, int price, int calories) {
        super(name, price, calories);
    }
}

