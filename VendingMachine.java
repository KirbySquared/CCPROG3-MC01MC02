import java.util.*;
public class VendingMachine {

    private final String name;
    private ArrayList<Slot> slots;
    private CashInventory cashInventory;
    private ItemInventory itemInventory;
    private TransactionLog transactionLog;

    public VendingMachine(String name)
    {
        this.name = name;
        this.slots = new ArrayList<>(8);
        this.cashInventory = new CashInventory();
        this.itemInventory = new ItemInventory();
        this.transactionLog = new TransactionLog ();
    }

    public VendingMachine()
    {
        this.name = "Stock Vending Machine";
        this.slots = new ArrayList<>(8);
        this.cashInventory = new CashInventory();
        this.itemInventory = new ItemInventory();
        this.transactionLog = new TransactionLog();
    }

    public void restockItem(Item item)
    {
        int i = 0;
        for (Slot temp: slots) //iterates over the slotsList in the vending machine
        {
            if ( temp.getItem().equals(item) ) //Checks if the slot in the vending machine has the item being looked for
            {
               i = slots.indexOf(temp);
               slots.get(i).addQuantity(8);
               break;
            }
        }

    }

    public void setItemPrice(int slot, double price)
    {
        slots.get(slot).getItem().setPrice(price);
    }

    public void insertCoin(Coin coin)
    {
       this.cashInventory.addCoin(coin);
    }

    public void selectItems(int slot)
    {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItem();
        int quantity = selectedSlot.getQuantity();

        if (quantity > 0) {
            double price = selecteditem.getPrice() * quantity;
            double availableCash = cashInventory.getTotalCash();

            if (availableCash >= price) {
                selectedSlot.decreaseQuantity(1);
                cashInventory.reducecashQuantity(availableCash, quantity); //Refers to the denominations

                Sale sale = new Sale(selecteditem);
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
        double availableCashTotal = cashInventory.getTotalCash();
        double change = totalCash - availableCashTotal;

        for (Cash cash : cashInventory.getcashList() )
        {
            System.out.println(cash.getValue() + ": IN STOCK = " + cash.getQuantity());
        }

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

 //need pa ayusin here //need pa ayusin here
        double totalSales = transactionLog.getTotalSales();

        summary.append("Starting Inventory: ").append(itemInventory.toString() ).append("\n");
        summary.append("Ending Inventory: ").append(itemInventory.toString() ).append("\n");
        summary.append("Total Sales: ").append(totalSales).append("\n");

        return summary.toString();
    }

    public ArrayList<Slot> getSlots()
    {
        return this.slots;
    }

    public String getName()
    {
        return this.name;
    }
    
}
