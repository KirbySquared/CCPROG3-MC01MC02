public class TransactionLog {
    private Sale[] sales;
    private int[] startingInventory;
    private double totalSales;

    public TransactionLog() {
        sales = new Sale[8];
        startingInventory = new int[8];
        totalSales = 0.0;
    }

    public void addSale(int slot, int quantity) {
        sales[slot] = new Sale(slot, quantity);
        startingInventory[slot] -= quantity;
        totalSales += sales[slot].getItem().getPrice() * quantity;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public int[] getStartingInventory() {
        return startingInventory;
    }

    public int[] getEndingInventory() {
        int[] endingInventory = new int[8];
        for (int i = 0; i < 8; i++) {
            endingInventory[i] = startingInventory[i] + sales[i].getQuantity();
        }
        return endingInventory;
    }
}
