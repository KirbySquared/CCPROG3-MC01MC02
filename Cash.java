package GUIINTERFACE;
/**
 * Represents a cash denomination, which is a specific type of coin.
 */
public class Cash extends Coin{
    
    
    /**
     * Constructs a cash denomination with the specified value.
     *
     * @param value the value of the cash denomination
     */
    public Cash (int value)
    {
        super(value);
    }

      /**
     * Constructs a cash denomination with the specified value and quantity.
     *
     * @param value    the value of the cash denomination
     * @param quantity the quantity of the cash denomination
     */
    public Cash (int value, int quantity)
    {
        super(value, quantity);
    }
    
}
