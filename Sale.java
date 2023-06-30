public class Sale {
    private Item item;
    private int quantity;

    public Sale(Item item) {
        this.item = item;
        this.quantity = 1;
    }

    public Sale(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean addQuantity(int quantity) {

        boolean value = true;

        if (quantity > 0)
        this.quantity += quantity;
        else
        value = false;

        return value;
    }
}
