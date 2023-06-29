import java.util.*;

public class Driver {
/*
 * Create 8 Item objects using Real life drinks (Coke, sprite, royal etc)
 * Add items to Slots using VendingMachine.addItemtoSlot
 * Create Actual Money using Coin / Cash constructors ( Cash(1000), Coin(5), Coin(10), etc . . .)
 * Add items to cashInv using addCashtocashInv(Cash cash) and addCointocashInv(Coin coin)
 * Create method to PRINT ITEM INVENTORY OF VENDING MACHINE / CASH INVENTORY ALONG WITH TRANSACTION LOG
 * The methods to print inventories / transaction logs will not be used until called by the user.
 */

    public void createVendingMachine(VendingMachine vendingMachine) {
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

        System.out.println("Vending machine created successfully!");
        System.out.println(vendingMachine.getName());

        scanner.close();
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = null;
        Driver driver = new Driver();
        driver.createVendingMachine(vendingMachine);
        // Continue with the vending machine operations
    }
    

}
