public class Coin {
    
    private final int value;
    private int quantity;
    //Coin values MUST BE PRE-DEFINED AND HAVE AT LEAST 50 QUANTITY FOR OUR CODE (Such as 1 piso, 5 peso, 10 peso coins, etc . . .)

    public Coin (int value)
    {
        this.value = value;
        this.quantity = 50;
    }
    public Coin (int value, int quantity)
    {
        this.value = value;
        this.quantity = quantity;
    }

    public int getValue()
    {
        return this.value;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public boolean addQuantity(int newquantity)
    {   
        boolean value = true;

        if (newquantity > 0)
        this.quantity += newquantity;
        else
        value = false;
        
        return value;
    }

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
