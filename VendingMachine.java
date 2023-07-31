package GUIINTERFACE;
import java.util.*;

/**
 * Represents a vending machine that sells items and provides change.
 */
public class VendingMachine {

    /**
     * The name of the vending machine.
     */
    private final String name;

    /**
     * The list of slots containing items in the vending machine.
     */
    private ArrayList<Slot> slots;

    /**
     * The inventory of cash in the vending machine.
     */
    private CashInventory cashInventory;

    /**
     * The inventory of items in the vending machine.
     */
    private ItemInventory itemInventory;

    /**
     * The transaction log for keeping track of sales in the vending machine.
     */
    private TransactionLog transactionLog;


    /**
     * Constructs a vending machine with the given name.
     *
     * @param name the name of the vending machine
     */
    public VendingMachine(String name)
    {
        this.name = name;
        this.slots = new ArrayList<>(8);
        this.cashInventory = new CashInventory();
        this.itemInventory = new ItemInventory();
        this.transactionLog = new TransactionLog ();
    }

    /**
     * Constructs a vending machine with a default name.
     */
    public VendingMachine()
    {
        this.name = "StockMachine";
        this.slots = new ArrayList<>(8);
        this.cashInventory = new CashInventory();
        this.itemInventory = new ItemInventory();
        this.transactionLog = new TransactionLog();
    }

    /**
     * Restocks the specified slot in the vending machine with the given quantity of items.
     *
     * @param slot     the slot index to restock
     * @param quantity the quantity of items to add to the slot
     */
    public void restockItem(int slot, int quantity) {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItems().get(0); // Get the first item in the slot
        selectedSlot.addItems(selecteditem, quantity);
    }
    /**
     * Sets the price of the item in the specified slot.
     *
     * @param slot  the slot index to set the item price
     * @param price the price to set for the item
     */
    public void setItemPrice(int slot, int price) {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItemAtIndex(0); // Get the first item in the slot
        if (selecteditem != null) {
            selecteditem.setPrice(price);
        } else {
            System.out.println("Slot is empty. Cannot set item price.");
        }
    }

    /**
     * Selects the item from the specified slot and processes the transaction.
     *
     * @param slot     the slot index to select the item from
     * @param money    the amount of money inserted by the user
     * @param quantity the quantity of items to purchase
     */
    public void selectItem(int slot, int money, int quantity) //For buying in vending machine
    {
        Slot selectedSlot = slots.get(slot);
        int itemsAvailable = selectedSlot.getQuantity();
    
        if (itemsAvailable > 0 && itemsAvailable >= quantity) {
            Item selecteditem = selectedSlot.getItemAtIndex(0); // Get the first item in the slot
            int price = selecteditem.getPrice() * quantity;
            double availableCash = cashInventory.getTotalCash();
    
            if (availableCash >= price && money >= price && (money - price) < availableCash) {
                selectedSlot.decreaseQuantity(quantity);
                produceChange(price, money, selecteditem, quantity);
                Sale sale = new Sale(selecteditem, quantity);
                transactionLog.addSale(sale);
            } else if (availableCash <= price && money >= price && (money - price) > availableCash) {
                System.out.println("Vending Machine is out of change. Please contact the maintenance manager.");
            } else {
                System.out.println("Insufficient funds. Please insert more coins.");
            }
        } else if (itemsAvailable > 0 && itemsAvailable < quantity) {
            System.out.println("The quantity you have entered is invalid.");
        } else {
            System.out.println("Item is out of stock.");
        }
    }
    

    /**
     * Calculates and dispenses the change to the user after a successful transaction.
     *
     * @param price          the total price of the items
     * @param money          the amount of money inserted by the user
     * @param selecteditem   the item selected by the user
     * @param quantitydisplay the quantity of items purchased
     */
    void produceChange(int price, int money, Item selecteditem, int quantitydisplay)
    {
        int change = money - price;
        int tempchange = change;
        int tempchange2 = change;
        boolean valuechecker = true;

            for (Cash cash:  cashInventory.getcashList() )
            {
                if (tempchange / cash.getValue() >= 1) 
                {
                  tempchange -= (tempchange / cash.getValue() ) * cash.getValue(); //(1643 / 1000) * 1000, denomination
                  if (cash.getQuantity() == 0 )
                    {
                        valuechecker = false;
                        break;
                    }
                }
               
            }

            for (Coin coin:  cashInventory.getcoinsList() ) 
            {
                if (tempchange / coin.getValue() >= 1) 
                {
                tempchange -= (tempchange / coin.getValue()) * coin.getValue();
                  if (coin.getQuantity() == 0 )
                    {
                        valuechecker = false;
                        break;
                    }
                }
                
            }

        if (valuechecker == true && cashInventory.getTotalCash() >= change) 
        {
            System.out.println("Getting your product. . .");
            System.out.println("Cash:\tQuantity\tValue");
            for (Cash cash : cashInventory.getcashList()) {
                int quantity = change / cash.getValue();
                cashInventory.reducecashQuantity(cash.getValue(), quantity);
                System.out.printf("Cash:\t%d\t\t%dphp%n", quantity, cash.getValue());
                change -= cash.getValue() * quantity;
            }

            System.out.println("\nCoin:\tQuantity\tValue");
            for (Coin coin : cashInventory.getcoinsList()) {
                int quantity = change / coin.getValue();
                cashInventory.reducecoinQuantity(coin.getValue(), quantity);
                System.out.printf("Coin:\t%d\t\t%dphp%n", quantity, coin.getValue());
                change -= coin.getValue() * quantity;
            }
            System.out.println("Dispensing product . . .");
            System.out.println("\nYOU BOUGHT: " + selecteditem.getName() + " " + quantitydisplay + "x");
            System.out.println("TOTAL COST: " + price + " php");
            System.out.println("\nYOU INSERTED: " + money + " php");
            System.out.println("YOUR CHANGE IS: " + tempchange2 + " php");
            System.out.println("Product dispensed! ! ! Don't forget to take your product and your change.");
            System.out.println("Vending Machine Remaining Cash: " + cashInventory.getTotalCash() + " php.\n");
        }
        else 
            {
                System.out.println("No change available.");
            }
        }

     /**
     * Retrieves the summary of all transactions from the transaction log.
     *
     * @return the summary of all transactions in the vending machine
     */    
    String getTransactionSummary() 
    {
        
    TransactionLog transactionLog = gettransactionLog();

    StringBuilder summary = new StringBuilder();
    ArrayList<Sale> salesList = transactionLog.getsalesList();

    summary.append("Transaction Log:\n");

    for (Sale sale : salesList) {
        summary.append("Item: ").append(sale.getItem().getName()).append("\n");
        summary.append("Price per item: ").append(sale.getItem().getPrice()).append("\n");
        summary.append("Quantity: ").append(sale.getQuantity()).append("\n");
        summary.append("Total price: ").append(sale.getItem().getPrice() * sale.getQuantity()).append("\n\n");
    }

    summary.append("Total Sales: ").append(transactionLog.getTotalSales());

    return summary.toString();

    }

    /**
     * Adds an item to the next available slot in the vending machine.
     *
     * @param item the item to be added to the vending machine
     */
    public void addItemtoSlot(Item item)
    {
        Slot temp = new Slot(item);
        slots.add(temp);
    }

    /**
     * Adds cash to the cash inventory of the vending machine.
     *
     * @param cash the cash to be added to the cash inventory
     */
    public void addCashtocashInv(Cash cash)
    {
        cashInventory.addCash(cash);
    }

     /**
     * Adds a coin to the cash inventory of the vending machine.
     *
     * @param coin the coin to be added to the cash inventory
     */
    public void addCointocashInv(Coin coin)
    {
        cashInventory.addCoin(coin);
    }

    /**
     * Returns the list of slots in the vending machine.
     *
     * @return the list of slots in the vending machine
     */
    public ArrayList<Slot> getSlots()
    {
        return this.slots;
    }

    /**
     * Returns the cash inventory of the vending machine.
     *
     * @return the cash inventory of the vending machine
     */
    public CashInventory getcashInventory()
    {
        return this.cashInventory;
    }

    /**
     * Returns the item inventory of the vending machine.
     *
     * @return the item inventory of the vending machine
     */
    public ItemInventory getitemInventory()
    {
        return this.itemInventory;
    }

    /**
     * Returns the transaction log of the vending machine.
     *
     * @return the transaction log of the vending machine
     */
    public TransactionLog gettransactionLog()
    {
        return this.transactionLog;
    }

    /**
     * Returns the name of the vending machine.
     *
     * @return the name of the vending machine
     */
    public String getName()
    {
        return this.name;
    }
    
}
