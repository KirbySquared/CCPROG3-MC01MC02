package GUIINTERFACE;
/*
 * We/I, Morales,Kurvy & Ting, Emmanuel of section S26, declare that the code, resources, and documents that we
submitted for the [1st/2nd] phase of the major course output (MCO) for CCPROG3 are our own work and
effort. We take full responsibility for the submission and understand the repercussions of committing
academic dishonesty, as stated in the DLSU Student Handbook. We affirm that we have not used any
unauthorized assistance or unfair means in completing this project.
 */
import java.util.*;

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
    System.out.println("************************************");
    System.out.println(vendingmachine.getName() + " Machine Item Inventory: ");
    System.out.println("Slot #\t| Item\t\t  | In Stock\t | Price     | Calories");
    for (Slot slot : vendingmachine.getSlots()) {
        Item item = slot.getItem();
        System.out.printf("%-7d | %-15s | %-12d | %-6dphp | %-8d%n",
                i, item.getName(), slot.getQuantity(), item.getPrice(), item.getCalories());
        i++;
    }
    System.out.println("************************************");
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

public VendingMachine createVendingMachine(Scanner scanner) {
    VendingMachine vendingMachine;
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
           vendingMachine.addItemtoSlot(new Item("Coke", 50, 139));
           vendingMachine.addItemtoSlot(new Item("Sprite",45, 105));
           vendingMachine.addItemtoSlot(new Item("Royal",45,76));
           vendingMachine.addItemtoSlot(new Item("Pepsi",45,105));
           vendingMachine.addItemtoSlot(new Item("Mug",50,107));
           vendingMachine.addItemtoSlot(new Item("7UP",55,150));
           vendingMachine.addItemtoSlot(new Item("Water",20,0));
           vendingMachine.addItemtoSlot(new Item("C2",60,105));
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

     public void buyfromMachine(VendingMachine vendingmachine, Scanner scanner)
    {   
        boolean value = true;
        boolean terminator;
        String choice;
        int slot = 0;
        int money = 0;
        int quantity = 0;

        while (value)
        {
            terminator = true;
            printItemInventory(vendingmachine);
            System.out.println("PLEASE BE CAREFUL IN INPUTTING YOUR NUMBERS OR ELSE THE PROGRAM WILL CRASH");
            System.out.println("Select slot to buy from: ");
            slot = scanner.nextInt();
            System.out.println("How much money will you insert? (Keep it less than or equal to 1000 php) ");
            money = scanner.nextInt();
            System.out.println("How many are you going to buy? (Keep it less than or equal to the current quantity)");
            quantity = scanner.nextInt();

            scanner.nextLine(); //Removes the newline character after the recent scanner

            vendingmachine.selectItem(slot-1, money, quantity);
            
                while (terminator)
                {
                    System.out.println("Would you like to buy again? Y/N");

                    choice = scanner.nextLine();

                    if ( choice.equalsIgnoreCase("Y"))
                    {
                        terminator = false;
                    }
                    else if (choice.equalsIgnoreCase("N") )
                    {
                        terminator = false;
                        value = false;
                    }
                    else
                    {
                        System.out.println("Invalid Input. Try again.");
                    }
                }
        }
        
    }

    public void setItemPrice(VendingMachine vendingmachine, Scanner scanner)
    {
        boolean value = true;
        boolean terminator;
        String choice;
        int slot = 0;
        int price = 0;

        while (value)
        {
            terminator = true;
            printItemInventory(vendingmachine);
            System.out.println("Select which slot you want to edit: ");
            slot = scanner.nextInt();
            System.out.println("Set the new (int) price you want the product in Slot " + slot + " to be: ");
            price = scanner.nextInt();
            
            System.out.println("HERE IS THE UPDATED INVENTORY: ");
            vendingmachine.setItemPrice(slot-1, price);

            printItemInventory(vendingmachine);

            scanner.nextLine(); //Removes the newline character after the recent scanner
            
                while (terminator)
                {
                    System.out.println("Would you like to edit again? Y/N");

                    choice = scanner.nextLine();

                    if ( choice.equalsIgnoreCase("Y"))
                    {
                        terminator = false;
                    }
                    else if (choice.equalsIgnoreCase("N") )
                    {
                        terminator = false;
                        value = false;
                    }
                    else
                    {
                        System.out.println("Invalid Input. Try again.");
                    }
                }
        }
    }

    public void restockmachineItem(VendingMachine vendingmachine, Scanner scanner)
    {
        boolean value = true;
        boolean terminator;
        String choice;
        int slot = 0;
        int quantity = 0;

        while (value)
        {
            terminator = true;
            printItemInventory(vendingmachine);
            System.out.println("!!!INVENTORY BEFORE RESTOCKING!!!");
            System.out.println("Select which slot you want to edit: ");
            slot = scanner.nextInt();
            System.out.println("Set the new (int) quantity you want add in the product at Slot " + slot);
            quantity = scanner.nextInt();
            
            System.out.println("!!!INVENTORY AFTER RESTOCKING!!!");
            vendingmachine.restockItem(slot-1, quantity);
            printItemInventory(vendingmachine);

            scanner.nextLine(); //Removes the newline character after the recent scanner
            
                while (terminator)
                {
                    System.out.println("Would you like to restock again? Y/N");

                    choice = scanner.nextLine();

                    if ( choice.equalsIgnoreCase("Y"))
                    {
                        terminator = false;
                    }
                    else if (choice.equalsIgnoreCase("N") )
                    {
                        terminator = false;
                        value = false;
                    }
                    else
                    {
                        System.out.println("Invalid Input. Try again.");
                    }
                }
        }
    }
    
 public void addCashQuantity(VendingMachine vendingMachine, Scanner scanner) {
        boolean value = true;
        boolean terminator;
        String choice;
        int cashValue = 0;
        int quantity = 0;

        while (value) {
            terminator = true;
            printCashInventory(vendingMachine);
            System.out.println("Select which cash value you want to add quantity to: ");
            cashValue = scanner.nextInt();
            System.out.println("Enter the quantity to add: ");
            quantity = scanner.nextInt();

            boolean result = vendingMachine.getcashInventory().addcashQuantity(cashValue, quantity);
            if (result) {
                System.out.println("Quantity added successfully!");
                printCashInventory(vendingMachine);
            } else {
                System.out.println("Invalid cash value or quantity. Please try again.");
            }

            scanner.nextLine(); // Removes the newline character after the recent scanner

            while (terminator) {
                System.out.println("Would you like to add quantity to another cash value? (Y/N)");

                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    terminator = false;
                } else if (choice.equalsIgnoreCase("N")) {
                    terminator = false;
                    value = false;
                } else {
                    System.out.println("Invalid Input. Try again.");
                }
            }
        }
    }

public void decreaseCashQuantity(VendingMachine vendingMachine, Scanner scanner) {
    boolean value = true;
    boolean terminator;
    String choice;
    int cashValue = 0;
    int quantity = 0;

    while (value) {
        terminator = true;
        printCashInventory(vendingMachine);
        System.out.println("Select which cash value you want to decrease quantity from: ");
        cashValue = scanner.nextInt();
        System.out.println("Enter the quantity to decrease: ");
        quantity = scanner.nextInt();

        boolean result = vendingMachine.getcashInventory().reducecashQuantity(cashValue, quantity);
        if (result) {
            System.out.println("Quantity decreased successfully!");
            printCashInventory(vendingMachine);
        } else {
            System.out.println("Invalid cash value or quantity. Please try again.");
        }

        scanner.nextLine(); // Removes the newline character after the recent scanner

        while (terminator) {
            System.out.println("Would you like to decrease quantity from another cash value? (Y/N)");

            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                terminator = false;
            } else if (choice.equalsIgnoreCase("N")) {
                terminator = false;
                value = false;
            } else {
                System.out.println("Invalid Input. Try again.");
            }
        }
    }
}

public void addCoinQuantity(VendingMachine vendingMachine, Scanner scanner) {
        boolean value = true;
        boolean terminator;
        String choice;
        int coinValue = 0;
        int quantity = 0;

        while (value) {
            terminator = true;
            printCashInventory(vendingMachine);
            System.out.println("Select which coin value you want to add quantity to: ");
            coinValue = scanner.nextInt();
            System.out.println("Enter the quantity to add: ");
            quantity = scanner.nextInt();

            boolean result = vendingMachine.getcashInventory().addcoinQuantity(coinValue, quantity);
            if (result) {
                System.out.println("Quantity added successfully!");
                printCashInventory(vendingMachine);
            } else {
                System.out.println("Invalid coin value or quantity. Please try again.");
            }

            scanner.nextLine(); // Removes the newline character after the recent scanner

            while (terminator) {
                System.out.println("Would you like to add quantity to another coin value? (Y/N)");

                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    terminator = false;
                } else if (choice.equalsIgnoreCase("N")) {
                    terminator = false;
                    value = false;
                } else {
                    System.out.println("Invalid Input. Try again.");
                }
            }
        }
    }

    public void reduceCoinQuantity(VendingMachine vendingMachine, Scanner scanner) {
        boolean value = true;
        boolean terminator;
        String choice;
        int coinValue = 0;
        int quantity = 0;

        while (value) {
            terminator = true;
            printCashInventory(vendingMachine);
            System.out.println("Select which coin value you want to decrease the quantity of: ");
            coinValue = scanner.nextInt();
            System.out.println("Enter the quantity to decrease: ");
            quantity = scanner.nextInt();

            boolean result = vendingMachine.getcashInventory().reducecoinQuantity(coinValue, quantity);
            if (result) {
                System.out.println("Quantity decreased successfully!");
                printCashInventory(vendingMachine);
            } else {
                System.out.println("Invalid coin value or quantity. Please try again.");
            }

            scanner.nextLine(); // Removes the newline character after the recent scanner

            while (terminator) {
                System.out.println("Would you like to add quantity to another coin value? (Y/N)");

                choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    terminator = false;
                } else if (choice.equalsIgnoreCase("N")) {
                    terminator = false;
                    value = false;
                } else {
                    System.out.println("Invalid Input. Try again.");
                }
            }
        }
    }
    
    public void testVendingMachine(VendingMachine vendingMachine, Scanner scanner)
    {
        int choice = 0;

        while (choice != 10)
        {
                printItemInventory(vendingMachine);

                System.out.println("************************************");
                System.out.println("What would you like to do? ");
                System.out.println("1. Buy from Machine");
                System.out.println("2. Restock Items");
                System.out.println("3. Add Cash Quantity");
                System.out.println("4. Add Coin Quantity");
                System.out.println("5. Decrease Cash Quantity");
                System.out.println("6. Decrease Coin Quantity");
                System.out.println("7. Set Item Price");
                System.out.println("8. Show Transaction Summary");
                System.out.println("9. Collect Money");
                System.out.println("10. Exit Vending Machine");
                System.out.println("************************************");

                if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        buyfromMachine(vendingMachine, scanner);
                        break;
                    case 2:
                        restockmachineItem(vendingMachine, scanner);
                        break;
                    case 3:
                        addCashQuantity(vendingMachine, scanner);
                        break;
                    case 4:
                        addCoinQuantity(vendingMachine, scanner);
                        break;
                    case 5:
                        decreaseCashQuantity(vendingMachine,scanner);
                        break;
                    case 6:
                        reduceCoinQuantity(vendingMachine,scanner);
                        break;
                    case 7:
                        setItemPrice(vendingMachine, scanner);
                        break;
                    case 8:
                        String transactionSummary = vendingMachine.getTransactionSummary();
                        System.out.println(transactionSummary);
                        break;
                    case 9: vendingMachine.getcashInventory().clearCash();
                        vendingMachine.getcashInventory().clearCoins();
                        printCashInventory(vendingMachine);
                        System.out.println("Available Cash: " + vendingMachine.getcashInventory().getTotalCash());
                    break;
                    case 10:
                        System.out.println("Exiting Vending Machine. . . ");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                    }
                }
                else 
                {
                    System.out.println("Invalid choice. Please enter a valid integer.");
                    scanner.nextLine(); // Consumes the invalid input
                }
            
        } 
    }
        

    public void VendingMachineFactory(Scanner scanner) {
    int choice = 0;
    VendingMachine vendingmachine = null;

    while (choice != 3) {
        System.out.println("VENDING MACHINE FACTORY - MC01 EDITION");
        System.out.println("1. Create Vending Machine");
        System.out.println("2. Test Vending Machine");
        System.out.println("3. Exit Program");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    vendingmachine = createVendingMachine(scanner);
                    break;
                case 2:
                    if (vendingmachine == null) {
                        System.out.println("Please create a vending machine first.");
                    } else {
                        testVendingMachine(vendingmachine, scanner);
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
}

    public static void main(String[] args) {
       Driver driver = new Driver();
       Scanner scanner = new Scanner(System.in);

       driver.VendingMachineFactory(scanner);
        
        scanner.close();
    }
    

}
