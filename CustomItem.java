package GUIINTERFACE;

public class CustomItem extends Item {

    private Ingredient basetea;
    private Ingredient sinker;
    private Ingredient cupholder;
    private Ingredient straw;
    private Ingredient sugarsyrup;

    public CustomItem(String name, int price, int calories) {
        super(name, price, calories);
    }

    public Ingredient getBasetea() {
        return basetea;
    }

    public Ingredient getSinker() {
        return sinker;
    }

    
    public void setSugarsyrup(Ingredient sugarsyrup) {
        this.sugarsyrup = sugarsyrup;
    }

    public void setBasetea (Ingredient basetea) {
        this.basetea = basetea;
    }

    public void setCupholder (Ingredient cupholder) {
        this.cupholder = cupholder;
    }

    public void setSinker(Ingredient sinker) {
        this.sinker = sinker;
    }

    public void setStraw (Ingredient straw) {
        this.straw = straw;
    }

    public Ingredient getCupholder() {
        return cupholder;
    }

    public Ingredient getStraw() {
        return straw;
    }


    public Ingredient getSugarsyrup() {
        return sugarsyrup;
    }

    // Calculate the total calories of all ingredients excluding straw and cupholder
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
        // Excluding straw and cupholder from the total calories calculation
        return totalCalories;
    }


}
