/**
 * Represents a coin with a specific value and quantity.
 */
public class Coin {
    
    /**
     * The value of the coin.
     */
    private final int value;

    /**
     * The quantity of the coin.
     */
    private int quantity;
    //Coin values MUST BE PRE-DEFINED AND HAVE AT LEAST 50 QUANTITY FOR OUR CODE (Such as 1 piso, 5 peso, 10 peso coins, etc . . .)

    /**
     * Constructs a coin with the specified value and a default quantity of 50.
     *
     * @param value the value of the coin
     */
    public Coin (int value)
    {
        this.value = value;
        this.quantity = 50;
    }

    /**
     * Constructs a coin with the specified value and quantity.
     *
     * @param value    the value of the coin
     * @param quantity the quantity of the coin
     */
    public Coin (int value, int quantity)
    {
        this.value = value;
        this.quantity = quantity;
    }

     /**
     * Returns the value of the coin.
     *
     * @return the value of the coin
     */
    public int getValue()
    {
        return this.value;
    }

    /**
     * Returns the quantity of the coin.
     *
     * @return the quantity of the coin
     */
    public int getQuantity()
    {
        return this.quantity;
    }

    /**
     * Adds the specified quantity to the current quantity of the coin.
     *
     * @param newquantity the quantity to be added
     * @return true if the quantity was successfully added, false otherwise
     */
    public boolean addQuantity(int newquantity)
    {   
        boolean value = true;

        if (newquantity > 0)
        this.quantity += newquantity;
        else
        value = false;
        
        return value;
    }

    /**
     * Deducts the specified quantity from the current quantity of the coin.
     *
     * @param newquantity the quantity to be deducted
     * @return true if the quantity was successfully deducted, false otherwise
     */
    public boolean deductQuantity(int newquantity)
    {   
        boolean value = true;

        if (this.quantity > newquantity)
        this.quantity -= newquantity;
        else
        value = false;

        return value;
    }
}
