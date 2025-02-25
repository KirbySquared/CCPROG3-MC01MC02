package GUIINTERFACE;

import java.util.ArrayList;

/**
 * Represents a vending machine that sells items and provides change.
 */
public class CustomizableVendingMachine extends VendingMachine {

    /**
     * The list of items that can be included in the customizable product.
     */
    private ArrayList<Item> customizableItems;

    /**
     * The list of selected items by the user to customize the product.
     */
    /**
     * Constructs a customizable vending machine with the given name.
     *
     * @param name the name of the vending machine
     */
    public void addIngredienttoSlot(Ingredient ing) {
        super.addItemtoSlot(ing);
    }

    public CustomizableVendingMachine(String name) {
        super(name);
        this.customizableItems = new ArrayList<>();
    }

    /**
     * Constructs a customizable vending machine with a default name.
     */
    public CustomizableVendingMachine() {
        super("CustomizableMachine");
        this.customizableItems = new ArrayList<>();
    }

    /**
     * Adds a new item to the list of items that can be included in the customizable product.
     *
     * @param item  the item to be added to the customizable items list
     * @param price the price to set for the customizable item
     */
    public void addCustomizableItem(Item item, int price) {
        item.setPrice(price);
        customizableItems.add(item);
    }

    /**
     * Removes an item from the list of items that can be included in the customizable product.
     *
     * @param item the item to be removed from the customizable items list
     */
    public void removeCustomizableItem(Item item) {
        customizableItems.remove(item);
    }

    /**
     * Returns the list of items that can be included in the customizable product.
     *
     * @return the list of items that can be included in the customizable product
     */
    public ArrayList<Item> getCustomizableItems() {
        return customizableItems;
    }

    /**
     * Selects an item from the list of customizable items to be included in the custom product.
     *
     * @param item the item selected by the user to customize the product
     */

    /**
     * Prepares and returns a string representation of the custom product.
     *
     * @return a string representation of the custom product
     */
    public String prepareCustomProduct() {
        int totalCalories = 0;
        StringBuilder productSummary = new StringBuilder();

        productSummary.append("Custom Product Summary:\n");

       /*  for (Item item : selectedItems) {
            productSummary.append("Item: ").append(item.getName()).append("\n");
            productSummary.append("Price: ").append(item.getPrice()).append(" php\n");
            productSummary.append("Calories: ").append(item.getCalories()).append("\n\n");
            totalCalories += item.getCalories();
        } */

        productSummary.append("Total Calories: ").append(totalCalories).append(" kcal\n");

        return productSummary.toString();
    }

}
