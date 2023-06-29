import java.util.*;

public class Driver {

    public void testVendingMachine(VendingMachine vendingmachine) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            displayRestockMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to restock: ");
                    String itemToRestock = scanner.nextLine();
                    Item item = new Item(itemToRestock, 0, 0); // Create a dummy item with zero price and calories
                    vendingmachine.restockItem(item);
                    break;
                case 2:
                    System.out.print("Enter the slot number: ");
                    int slotNumber = scanner.nextInt();
                    System.out.print("Enter the new price: ");
                    int newPrice = scanner.nextInt();
                    vendingmachine.setItemPrice(slotNumber, newPrice);
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine("My Vending Machine");
        Driver driver = new Driver();
        driver.testVendingMachine(vendingMachine);
    }

    private static void displayRestockMenu() {
        System.out.println("------ Restock Menu ------");
        System.out.println("1. Restock Item");
        System.out.println("2. Set Item Price");
        System.out.println("3. Return to main menu");
        System.out.print("Enter your choice: ");
    }
    
    /* public static void main(String[] args)
    {
        
    }
     */
}
