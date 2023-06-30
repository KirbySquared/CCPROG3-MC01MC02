

public class Slot {

    private Item item;
    private int quantity;

    public Slot(Item item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
    }

    public Slot(Item item)
    {
        this.item = item;
        this.quantity = 10;
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

    public boolean addQuantity(int quantity)
    {   
        boolean value = true;

        if (quantity > 0)
        this.quantity += quantity;
        else
        value = false;

        return value;
    }
}
