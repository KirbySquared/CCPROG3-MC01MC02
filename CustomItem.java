package GUIINTERFACE;
/**
 * CustomItem class represents a customizable item with various ingredients.
 * It extends the Item class, which is a base class for all items in the system.
 */
public class CustomItem extends Item {

    private Ingredient basetea;
    private Ingredient sinker;
    private Ingredient cupholder;
    private Ingredient straw;
    private Ingredient sugarsyrup;

    /**
     * Constructor for the CustomItem class.
     *
     * @param name     The name of the custom item.
     * @param price    The price of the custom item.
     * @param calories The total calories of the custom item.
     */
    public CustomItem(String name, int price, int calories) {
        super(name, price, calories);
    }

    /**
     * Get the base tea ingredient.
     *
     * @return The base tea ingredient.
     */
    public Ingredient getBasetea() {
        return basetea;
    }

    /**
     * Get the sinker ingredient.
     *
     * @return The sinker ingredient.
     */
    public Ingredient getSinker() {
        return sinker;
    }

    /**
     * Set the sugar syrup ingredient.
     *
     * @param sugarsyrup The sugar syrup ingredient to set.
     */
    public void setSugarsyrup(Ingredient sugarsyrup) {
        this.sugarsyrup = sugarsyrup;
    }

    /**
     * Set the base tea ingredient.
     *
     * @param basetea The base tea ingredient to set.
     */
    public void setBasetea(Ingredient basetea) {
        this.basetea = basetea;
    }

    /**
     * Set the cup holder ingredient.
     *
     * @param cupholder The cup holder ingredient to set.
     */
    public void setCupholder(Ingredient cupholder) {
        this.cupholder = cupholder;
    }

    /**
     * Set the sinker ingredient.
     *
     * @param sinker The sinker ingredient to set.
     */
    public void setSinker(Ingredient sinker) {
        this.sinker = sinker;
    }

    /**
     * Set the straw ingredient.
     *
     * @param straw The straw ingredient to set.
     */
    public void setStraw(Ingredient straw) {
        this.straw = straw;
    }

    /**
     * Get the cup holder ingredient.
     *
     * @return The cup holder ingredient.
     */
    public Ingredient getCupholder() {
        return cupholder;
    }

    /**
     * Get the straw ingredient.
     *
     * @return The straw ingredient.
     */
    public Ingredient getStraw() {
        return straw;
    }

    /**
     * Get the sugar syrup ingredient.
     *
     * @return The sugar syrup ingredient.
     */
    public Ingredient getSugarsyrup() {
        return sugarsyrup;
    }

    /**
     * Calculate the total calories of all ingredients excluding straw and cup holder.
     *
     * @return The total calories of all ingredients excluding straw and cup holder.
     */
    public int calculateTotalCaloriesOfIngredients() {
        int totalCalories = 0;
        if (basetea != null) {
            totalCalories += basetea.getCalories();
        }
        if (sinker != null) {
            totalCalories += sinker.getCalories();
        }
        if (sugarsyrup != null) {
            totalCalories += sugarsyrup.getCalories();
        }
        // Excluding straw and cup holder from the total calories calculation
        return totalCalories;
    }
    
    /**
 * Calculates the total price of the custom item, including the prices of all selected ingredients.
 *
 * @return The total price of the custom item.
 */
public int getTotalPrice() {
    int totalprice = 0;
    totalprice += sugarsyrup.getPrice() + straw.getPrice() + cupholder.getPrice() + sinker.getPrice() + basetea.getPrice();
    return totalprice;
    }
}
