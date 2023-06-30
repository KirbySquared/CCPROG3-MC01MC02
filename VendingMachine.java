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
        this.name = "StockMachine";
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

    public void setItemPrice(int slot, int price)
    {
        slots.get(slot).getItem().setPrice(price);
    }

    public void selectItem(int slot, int money, int quantity) //For buying in vending machine
    {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItem();

        if (selectedSlot.getQuantity() > 0 && selectedSlot.getQuantity() >= quantity) {
            int price = selecteditem.getPrice() * quantity;
            double availableCash = cashInventory.getTotalCash();

            if (availableCash >= price && money >= price) 
            {
                selectedSlot.decreaseQuantity(quantity);
                produceChange(price, money);
                Sale sale = new Sale(selecteditem,quantity);
                transactionLog.addSale(sale);
            }
             else {
                System.out.println("Insufficient funds. Please insert more coins.");
            }
        }
        else if (selectedSlot.getQuantity() > 0 && selectedSlot.getQuantity() < quantity)
        {
            System.out.println("The quantity you have entered is invalid.");
        }
         else {
            System.out.println("Item is out of stock.");
        }
    }

    void produceChange(int price, int money)
    {
        int change = money - price;
        int tempchange = change;
        int tempchange2 = change;
        boolean valuechecker = true;

            for (Cash cash:  cashInventory.getcashList() )
            {
                if (tempchange / cash.getValue() >= 1 ) 
                {
                  tempchange -= (tempchange / cash.getValue()) * cash.getValue();
                  if (cash.getQuantity() == 0)
                    {
                        valuechecker = false;
                        break;
                    }
                }
               
            }

            for (Coin coin:  cashInventory.getcoinsList() ) //Checks
            {
                if (tempchange / coin.getValue() >= 1 ) 
                {
                tempchange -= (tempchange / coin.getValue()) * coin.getValue();
                  if (coin.getQuantity() == 0)
                    {
                        valuechecker = false;
                        break;
                    }
                }
            }

        if (valuechecker == true) 
        {
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
                cashInventory.reducecashQuantity(coin.getValue(), quantity);
                System.out.printf("Coin:\t%d\t\t%dphp%n", quantity, coin.getValue());
                change -= coin.getValue() * quantity;
            }

            System.out.println("\nYOU INSERTED: " + money + " php");
            System.out.println("TOTAL COST: " + price + " php");
            System.out.println("YOUR CHANGE IS: " + tempchange2 + " php");
            System.out.println("Vending Machine Remaining Cash: " + cashInventory.getTotalCash() + " php.\n");
        }
        else 
            {
                System.out.println("No change available.");
            }
        }

    /*
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
     * EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY EMMAN PAAYOS NITO PLS TY
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

    public void addItemtoSlot(Item item)
    {
        Slot temp = new Slot(item);
        slots.add(temp);
    }

    public void addCashtocashInv(Cash cash)
    {
        cashInventory.addCash(cash);
    }

    public void addCointocashInv(Coin coin)
    {
        cashInventory.addCoin(coin);
    }

    public ArrayList<Slot> getSlots()
    {
        return this.slots;
    }

    public CashInventory getcashInventory()
    {
        return this.cashInventory;
    }

    public ItemInventory getitemInventory()
    {
        return this.itemInventory;
    }

    public TransactionLog gettransactionLog()
    {
        return this.transactionLog;
    }

    public String getName()
    {
        return this.name;
    }
    
}
