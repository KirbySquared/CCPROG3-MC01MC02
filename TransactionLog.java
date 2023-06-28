import java.util.*;

public class TransactionLog {
    private ArrayList<Sale> sales;
    private ArrayList<Integer> startingInventory;
    private double totalSales;

    public TransactionLog() {
        this.sales = new ArrayList<>(8);
        this.startingInventory = new ArrayList<>(8);
        totalSales = 0.0;
    }

    public void addSale(int slot, int quantity) {

        Sale tempsale = new Sale(slot,quantity);

        sales.add(tempsale);
        //startingInventory[slot] -= quantity;
        //totalSales += sales.get(slot).getItem().getPrice() * quantity;
    }

    public void addSale(Sale sale) 
    {
        sales.add(sale);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public ArrayList<Integer> getStartingInventory() {
        return startingInventory;
    }

    public ArrayList<Integer> getEndingInventory() {
        ArrayList<Integer> endingInventory = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {

            endingInventory.add(i, startingInventory.get(i) + sales.get(i).getQuantity() );
        }
        return endingInventory;
    }
}
