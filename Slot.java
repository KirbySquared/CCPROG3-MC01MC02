import java.util.*;
public class Slot {

    private Item item;
    private int quantity;

    public Slot(Item item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem()
    {
        return this.item;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public boolean decreaseQuantity(int quantity)
    {   
        boolean value = true;

        if (this.quantity > quantity)
        this.quantity -= quantity;
        else
        value = false;

        return value;
    }
}
