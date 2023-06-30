import java.util.*;
import java.util.Scanner;

public class Driver {
/*
 * Create 8 Item objects using Real life drinks (Coke, sprite, royal etc)
 * Add items to Slots using VendingMachine.addItemtoSlot
 * Create Actual Money using Coin / Cash constructors ( Cash(1000), Coin(5), Coin(10), etc . . .)
 * Add Cash to cashInv using addCashtocashInv(Cash cash) and addCointocashInv(Coin coin)
 * Create method to PRINT ITEM INVENTORY OF VENDING MACHINE / CASH INVENTORY ALONG WITH TRANSACTION LOG
 * The methods to print inventories / transaction logs will not be used until called by the user.
 * But the method to print the current items in the slots + their quantity and price should always be displayed as it is
 * updated using the different methods.
 */

 public void printItemInventory(VendingMachine vendingmachine) {
    int i = 1;
    System.out.println("Item Inventory:");
    for (Slot slot : vendingmachine.getSlots()) {
        Item item = slot.getItem();
        System.out.println("Slot #" + i + " " + item.getName() + ": " + slot.getQuantity() + " In stock");
        i++;
    }
}

public void printCashInventory(VendingMachine vendingmachine) {
    System.out.println("Cash Inventory:");
    CashInventory cashinv = vendingmachine.getcashInventory();
    CashInventory coininv = vendingmachine.getcashInventory();
    for (Cash cash : cashinv.getcashList()) {
        int quantity = cash.getQuantity();
        System.out.println(cash.getValue() + "php: " + quantity);
    }
    for (Coin coin : coininv.getcoinsList()) {
        int quantity = coin.getQuantity();
        System.out.println(coin.getValue() + "php: " + quantity);
    }
}

public void printTransactionLog(VendingMachine vendingmachine) {
    System.out.println("Transaction Log:");
    TransactionLog templog = vendingmachine.gettransactionLog();
    for (Sale sale : templog.getsalesList()) {
        Item item = sale.getItem();
        System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
    }
}


public VendingMachine createVendingMachine() {
    VendingMachine vendingMachine;
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.print("Do you want to name your vending machine? (Y/N): ");
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("Enter the name of your vending machine: ");
            String name = scanner.nextLine();
            vendingMachine = new VendingMachine(name);
        } else {
            vendingMachine = new VendingMachine();
        }

        // Rest of the vending machine setup
           // Add 8 Item objects to the vending machine
           vendingMachine.addItemtoSlot(new Item("Coke", 10, 10));
           vendingMachine.addItemtoSlot(new Item("Sprite",20, 20));
           vendingMachine.addItemtoSlot(new Item("Royal",30,30));
           vendingMachine.addItemtoSlot(new Item("Pepsi",40,40));
           vendingMachine.addItemtoSlot(new Item("Mug",50,50));
           vendingMachine.addItemtoSlot(new Item("7UP",60,60));
           vendingMachine.addItemtoSlot(new Item("Water",70,70));
           vendingMachine.addItemtoSlot(new Item("C2",80,80));
           // Add Philippine peso bills
           vendingMachine.addCashtocashInv(new Cash(1000)); 
           vendingMachine.addCashtocashInv(new Cash(500));
           vendingMachine.addCashtocashInv(new Cash(200));
           vendingMachine.addCashtocashInv(new Cash(100));
           vendingMachine.addCashtocashInv(new Cash(50));
           vendingMachine.addCashtocashInv(new Cash(20));
           vendingMachine.addCointocashInv(new Coin(10));
           vendingMachine.addCointocashInv(new Coin(5));
           vendingMachine.addCointocashInv(new Coin(1));


           System.out.println("Vending machine created successfully!\n");

           return vendingMachine;
    }

    public void testVendingMachine(VendingMachine vendingMachine)
    {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (choice != 7)
        {
            printItemInventory(vendingMachine);

            System.out.println("************************************");
            System.out.println("What would you like to do? ");
            System.out.println("1. Buy from Machine");
            System.out.println("2. Buy from Machine");
            System.out.println("3. Buy from Machine");
            System.out.println("4. Buy from Machine");
            System.out.println("5. Buy from Machine");
            System.out.println("6. Buy from Machine");
            System.out.println("7. Exit Vending Machine");
            System.out.println("************************************");

            if (scanner.hasNextInt()) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //function here
                    break;
                case 2:
                    //function here
                    break;
                case 3:
                    //function here
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please enter a valid integer.");
            scanner.nextLine(); // Consumes the invalid input
        }
    }
        }
        

    public void VendingMachineFactory() {
    int choice = 0;
    Scanner scanner = new Scanner(System.in);
    VendingMachine vendingmachine = null;

    while (choice != 3) {
        System.out.println("VENDING MACHINE FACTORY - MC01 EDITION");
        System.out.println("1. Create Vending Machine");
        System.out.println("2. Test Vending Machine");
        System.out.println("3. Exit Program\n");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingmachine = createVendingMachine();
                    break;
                case 2:
                    if (vendingmachine == null) {
                        System.out.println("Please create a vending machine first.");
                    } else {
                        testVendingMachine(vendingmachine);
                    }
                    break;
                case 3:
                    System.out.println("\nThank you for using the Vending Machine Factory!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please enter a valid integer.");
            scanner.nextLine(); // Consumes the invalid input
        }
    }
    scanner.close();
}

    public static void main(String[] args) {
       Driver driver = new Driver();

       driver.VendingMachineFactory();
        // Continue with the vending machine operations
    }
    

}
