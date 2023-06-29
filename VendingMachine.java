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

    public void insertCoin(Coin coin)
    {
       this.cashInventory.addCoin(coin);
    }

    public void selectItems(int slot)
    {
        Slot selectedSlot = slots.get(slot);
        Item selecteditem = selectedSlot.getItem();
        int quantity = selectedSlot.getQuantity();
        boolean valuechecker = true;

        if (quantity > 0) {
            int price = selecteditem.getPrice() * quantity;
            double availableCash = cashInventory.getTotalCash();

            for (Cash cash:  cashInventory.getcashList() )
            {
                if (cash.getQuantity() == 0)
                {
                    valuechecker = false;
                    break;
                }
            }

            for (Coin coin:  cashInventory.getcoinsList() )
            {
                if (coin.getQuantity() == 0)
                {
                    valuechecker = false;
                    break;
                }
            }

            if (availableCash >= price && valuechecker == true) {
                selectedSlot.decreaseQuantity(1);
                System.out.println("You purchased: " + selecteditem.getName() + "for Php " + selecteditem.getPrice() );
                cashInventory.reducecashQuantity(1000, price/1000);
                System.out.println( "Cash: " + price/1000 + "x " + "1000php| ");
                price %= 1000;
                cashInventory.reducecashQuantity(500, price/500);
                System.out.print( price/500 + "x " + "500php| ");
                price %= 500;
                cashInventory.reducecashQuantity(200, price/200);
                System.out.print( price/200 + "x " + "200php| ");
                price %= 200;
                cashInventory.reducecashQuantity(100, price/100);
                System.out.print( price/100 + "x " + "100php| ");
                price %= 100;
                cashInventory.reducecashQuantity(50, price/50);
                System.out.print( price/50 + "x " + "50php| ");
                price %= 50;
                cashInventory.reducecashQuantity(20, price/20);
                System.out.print( price/20 + "x " + "20php| ");
                price %= 20;
                cashInventory.reducecoinQuantity(10, price/10);
                System.out.println( "Coins: "+ price/10 + "x " + "10php| ");
                price %= 10;
                cashInventory.reducecoinQuantity(5, price/5);
                System.out.print( + price/5 + "x " + "5php| ");
                price %= 5;
                cashInventory.reducecoinQuantity(1, price);
                System.out.print( price + "x " + "1php| ");

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

    public String getName()
    {
        return this.name;
    }
    
}
