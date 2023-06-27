import java.util.*;
public class VendingMachine {

    private ArrayList<Slot> slots;
    private CashInventory cashInventory;
    private ItemInventory itemInventory;
    private TransactionLog transactionLog;

    public void VendingMachine()
    {
        slots = new Slot[8];
        cashInventory = new CashInventory();
        itemInventory = new ItemInventory();
        transactionLog = new TransactionLog();
    }

    public void restockItems()
    {
        itemInventory.restockItems();
        transactionLog.setStartingInventory(itemInventory.getInventory());
    }

    public void setItemPrice(int slot, double price)
    {
        slots[slot].getItem().setPrice(price);
    }

    public void insertCoin(Coin coin)
    {
        cashInventory.addCoin(coin);
    }

    public void selectItems(int slot)
    {
         Slot selectedSlot = slots[slot];
        Item selecteditem = selectedSlot.getItem();
        int quantity = selectedSlot.getQuantity();

        if (quantity > 0) {
            double price = selecteditem.getPrice();
            double availableCash = cashInventory.getTotalCash();

            if (availableCash >= price) {
                selectedSlot.decreaseQuantity();
                cashInventory.deductCash(price);

                Sale sale = new Sale(slot, 1);
                transactionLog.addSale(sale);
            } else {
                System.out.println("Insufficient funds. Please insert more coins.");
            }
        } else {
            System.out.println("Item is out of stock.");
        }
    }

    public void produceChange()
    {
        double totalCash = cashInventory.getTotalCash();
        double availableCash = cashInventory.getAvailableCash();
        double change = totalCash - availableCash;

        if (change > 0) {
            // Dispense change to the user
        } else {
            System.out.println("No change available.");
        }
    }

    public void cancelTransaction()
    {
         cashInventory.clearCash();
    }

    String getTransactionSummary()
    {
        StringBuilder summary = new StringBuilder();
        summary.append("Transaction Summary:\n");

        int[] startingInventory = transactionLog.getStartingInventory();
        int[] endingInventory = transactionLog.getEndingInventory();
        double totalSales = transactionLog.getTotalSales();

        summary.append("Starting Inventory: ").append(Arrays.toString(startingInventory)).append("\n");
        summary.append("Ending Inventory: ").append(Arrays.toString(endingInventory)).append("\n");
        summary.append("Total Sales: ").append(totalSales).append("\n");

        return summary.toString();
    }
    
}
