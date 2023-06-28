public class Coin {
    
    private final double value;
    private int quantity;
    //Coin values MUST BE PRE-DEFINED AND HAVE AT LEAST 50 QUANTITY FOR OUR CODE (Such as 1 piso, 5 peso, 10 peso coins, etc . . .)

    public Coin (double value)
    {
        this.value = value;
        this.quantity = 50;
    }

    public double getValue()
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
