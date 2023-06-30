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

    public void setItemPrice(int slot, int price)
    {
        slots.get(slot).getItem().setPrice(price);
    }

    public void selectItem(int slot, int money, int quantity) //For buying in vending machine
    {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItem();

        if (selectedSlot.getQuantity() > 0) {
            int price = selecteditem.getPrice() * quantity;
            double availableCash = cashInventory.getTotalCash();

            if (availableCash >= price && money > price) {
                selectedSlot.decreaseQuantity(1);

                produceChange(price, money);

                Sale sale = new Sale(selecteditem);
                transactionLog.addSale(sale);
            }
            else if (availableCash >= price && money == price)
            {
                selectedSlot.decreaseQuantity(1);
                System.out.println("NO Change is produced as the exact amount was given. Thank you!");
                Sale sale = new Sale(selecteditem);
                transactionLog.addSale(sale);
            }
             else {
                System.out.println("Insufficient funds. Please insert more coins.");
            }
        } else {
            System.out.println("Item is out of stock.");
        }
    }

    void produceChange(int price, int money)
    {
        int change = money - price;
        int tempchange = change;
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
            for (Cash cash: cashInventory.getcashList() )
        {
            cashInventory.reducecashQuantity(cash.getValue(), change/cash.getValue());
                System.out.println( "Cash: " + change/cash.getValue() + "x " + cash.getValue() + "php| ");
                change -= cash.getValue() * (change/cash.getValue() );
        }
             for (Coin coin: cashInventory.getcoinsList() )
        {
            cashInventory.reducecashQuantity(coin.getValue(), change/coin.getValue());
                System.out.println( "Coin: " + change/coin.getValue() + "x " + coin.getValue() + "php| ");
                change -= coin.getValue() * (change/coin.getValue() );
        }
                System.out.println("Vending Machine Remaining Cash: " + cashInventory.getTotalCash() + "php." );
        } else 
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
        StringBuilder summary = new StringBuilder();
        summary.append("Transaction Summary:\n");

        //need pa ayusin here //need pa ayusin here
        double totalSales = transactionLog.getTotalSales();

        summary.append("Starting Inventory: ").append(itemInventory.toString() ).append("\n");
        //Need ihiwalay yung pagdisplay ng ending inventory and starting inventory, this function must only be called
        //when restocking
        summary.append("Ending Inventory: ").append(itemInventory.toString() ).append("\n");
        summary.append("Total Sales: ").append(totalSales).append("\n");

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
