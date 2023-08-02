/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIINTERFACE;
import java.util.ArrayList;
/**
 *
 * @author kurvy & emmanuel ting
 */
public class GUIModel { 
    private VendingMachine machine;
    private ArrayList<Item> itemList;
    private Item item1; 
    private Item item2; 
    private Item item3; 
    private Item item4; 
    private Item item5; 
    private Item item6;
    private Item item7; 
    private Item item8;
    private CustomItem item9;
    private Item adminSelectedItem;
    private Item selectedItem;
    private int selectedSlotIndex;
    private Ingredient ing1;
    private Ingredient ing2;
    private Ingredient ing3;
    private Ingredient ing4;
    private Ingredient ing5;
    private Ingredient ing6;
    private Cash cash1000;
    private Cash cash500;
    private Cash cash200;
    private Cash cash100;
    private Cash cash50;
    private Cash cash20;
    private Coin coin10;
    private Coin coin5;
    private Coin coin1;
    private int MachineBalance;
    private int UserBalance;

    public GUIModel () {
    //PRESET ITEMS TO INITIALIZE CODE
        this.itemList = new ArrayList<>();
        this.item1 = new Item("Coke", 50, 139);
        this.item2 = new Item("Sprite", 45, 105);
        this.item3 = new Item("Royal", 45, 76);
        this.item4 = new Item("Pepsi", 45, 105);
        this.item5 = new Item("Mug", 50, 107);
        this.item6 = new Item("7UP", 55, 150);
        this.item7 = new Item("Water", 20, 0);
        this.item8 = new Item("C2", 60, 105);
        this.item9 = new CustomItem("Personal Milk Tea", 0,0);
        this.ing1 = new Ingredient ("Tapioca Pearl", 20, 150);
        this.ing2 = new Ingredient ("Nata de Coco", 20 , 90);
        this.ing3 = new Ingredient ("Black Tea", 20, 200);
        this.ing4 = new Ingredient ("Plastic Straw", 10, 0);
        this.ing5= new Ingredient ("Milktea Cup", 70, 0);
        this.ing6 = new Ingredient ("Sugar Syrup", 20, 100);
        this.cash1000 = new Cash(1000,10);
        this.cash500 = new Cash(500,10);
        this.cash100 = new Cash(100,10);
        this.cash50 = new Cash(50,10);
        this.cash20 = new Cash(20,10);
        this.coin10 = new Coin(10,50);
        this.coin5 = new Coin(5,50);
        this.coin1 = new Coin(1, 50);
        this.machine = new VendingMachine();
        machine.addCashtocashInv(cash1000);
        machine.addCashtocashInv(cash500);
        machine.addCashtocashInv(cash100);
        machine.addCashtocashInv(cash50);
        machine.addCashtocashInv(cash20);
        machine.addCointocashInv(coin10);
        machine.addCointocashInv(coin5);
        machine.addCointocashInv(coin1);
        machine.addItemtoSlot(item1);
        machine.addItemtoSlot(item2);
        machine.addItemtoSlot(item3);
        machine.addItemtoSlot(item4);
        machine.addItemtoSlot(item5);
        machine.addItemtoSlot(item6);
        machine.addItemtoSlot(item7);
        machine.addItemtoSlot(item8);
        machine.addItemtoSlot(item9);
        machine.addItemtoSlot(ing4);
        machine.addItemtoSlot(ing5);
        machine.addItemtoSlot(ing6);
        machine.addItemtoSlot(ing1);
        machine.addItemtoSlot(ing2);
        machine.addItemtoSlot(ing3);
        machine.getSlots().get(0).addItems(this.item1, 9);
        machine.getSlots().get(1).addItems(this.item2, 9);
        machine.getSlots().get(2).addItems(this.item3, 9);
        machine.getSlots().get(3).addItems(this.item4, 9);
        machine.getSlots().get(4).addItems(this.item5, 9);
        machine.getSlots().get(5).addItems(this.item6, 9);
        machine.getSlots().get(6).addItems(this.item7, 9);
        machine.getSlots().get(7).addItems(this.item8, 9);
        machine.getSlots().get(9).addItems(this.ing4, 9);
        machine.getSlots().get(10).addItems(this.ing5, 9);
        machine.getSlots().get(11).addItems(this.ing6, 9);
        machine.getSlots().get(12).addItems(this.ing1, 9);
        machine.getSlots().get(13).addItems(this.ing2, 9);
        machine.getSlots().get(14).addItems(this.ing3, 9);
        this.selectedItem = null;
        this.itemList.add(item1);
        this.itemList.add(item2);
        this.itemList.add(item3);
        this.itemList.add(item4);
        this.itemList.add(item5);
        this.itemList.add(item6);
        this.itemList.add(item7);
        this.itemList.add(item8);
        this.itemList.add(item9);
        this.itemList.add(ing4);
        this.itemList.add(ing5);
        this.itemList.add(ing6);
        this.itemList.add(ing1);
        this.itemList.add(ing2);
        this.itemList.add(ing3);
        
        this.MachineBalance = machine.getcashInventory().getTotalCash();
        this.UserBalance = 0;
    }
    
    public boolean restockItemInMachine(Item item, int quantity) {
        int slotIndex = findSlotIndexForItem(item);

        if (slotIndex >= 0) {
            machine.restockItem(slotIndex, quantity);
            return true; // Restocking successful
        } else {
            return false; // Item not found in the vending machine
        }
    }
    
    public void addCashToMachine(int cashValue, int quantity) {
        machine.getcashInventory().addcashQuantity(cashValue, quantity);
        this.MachineBalance = machine.getcashInventory().getTotalCash();
    }
    
    public void addCoinToMachine(int coinValue, int quantity) {
        machine.getcashInventory().addcoinQuantity(coinValue, quantity);
        this.MachineBalance = machine.getcashInventory().getTotalCash();
    }
    
    public String getTransactionSummary() {
        return machine.getTransactionSummary();
    }
    
    public String decreaseItem(Item selecteditem, int quantity) {
        String change = "NULL";
        String cashchange = "";
        String coinchange = "";
        int slotIndex = -1;
        try {
            slotIndex = findSlotIndexForItem (selecteditem);
                
        if (slotIndex >= 0) {
            Slot selectedSlot = machine.getSlots().get(slotIndex);
            int itemPrice = selecteditem.getPrice() * quantity;
            // Calculate change
            int insertedmoney = this.UserBalance;
            int userchange = this.UserBalance - itemPrice;
            int tempchange = userchange;
            boolean valuechecker = true;

        // Check if the user has enough balance to buy the item
        if (this.UserBalance >= itemPrice && selectedSlot.getQuantity() >= quantity) {
            // Update balances
                for (Cash cash : machine.getcashInventory().getcashList() ) 
                {
                    int tempquantity = tempchange / cash.getValue(); //How many 1000 pesos / 500 pesos are needed in the change
                    if (tempquantity >= 1 && cash.getQuantity() > 0 && tempquantity <= cash.getQuantity() )  
                    //if there is 1000 peso bill or not and if there is, is it within the quantity stored in the cash inventory
                    {
                        tempchange -= (tempquantity * cash.getValue() );
                        if ( machine.getcashInventory().reducecashQuantity(cash.getValue(), tempquantity) )
                        {
                            System.out.println(cash.getValue() + " by "+ tempquantity + " Cash Quantity reduced.");
                        }
                        else
                        {
                            System.out.println(cash.getValue() + " by "+ tempquantity + " WAS NOT REDUCED.");
                        }
                        
                        cashchange += cash.getValue() + ": " + tempquantity + "\n";//String line for printing
                    } 
                    else if ( (cash.getQuantity() <= 0 && tempquantity > 0) || tempquantity > cash.getQuantity() && machine.getcashInventory().getTotalCash() > insertedmoney )
                    {   
                        continue;
                        //valuechecker = false;
                       // break;
                    }
             
                }
                
                for (Coin coin : machine.getcashInventory().getcoinsList() ) 
                {
                    int tempquantity = tempchange / coin.getValue(); //How many 10 peso, 5 peso coins are there
                    if (tempquantity >= 1 && coin.getQuantity() > 0 && tempquantity <= coin.getQuantity() )  
                    //if there is 10/5/1 peso coin or not and if there is, is it within the quantity stored in the cash inventory
                    {
                        tempchange -= (tempquantity * coin.getValue() );
                        if ( machine.getcashInventory().reducecoinQuantity(coin.getValue(), tempquantity) )
                        {
                            System.out.println(coin.getValue() + " by "+ tempquantity + " Coin Quantity reduced.");
                        }
                        else
                        {
                            System.out.println(coin.getValue() + " by "+ tempquantity + " WAS NOT REDUCED.");
                        }

                        coinchange += "Php " + coin.getValue() + ": " + tempquantity + "\n";//String line for printing
                    } else if (coin.getQuantity() <= 0 || tempquantity > coin.getQuantity() && machine.getcashInventory().getTotalCash() > insertedmoney )
                        {   
                            continue;
                            //valuechecker = false;
                            //break;
                        }
                  
                }
            // Update MachineBalance and UserBalance
            if (valuechecker != false) {
                if ( machine.getSlots().get(slotIndex).decreaseQuantity(quantity) )
                    {
                        System.out.println(machine.getSlots().get(slotIndex).getItems().get(0).getName() + " HAS " +
                            machine.getSlots().get(slotIndex).getQuantity() + " IN STOCK." );
                    }
                else
                    {
                         System.out.println("ITEM " + machine.getSlots().get(slotIndex).getItems().get(0).getName()
                            + " HAS NO CHANGES!");
                    }
                
                this.MachineBalance = machine.getcashInventory().getTotalCash(); // Deduct the change from MachineBalance
                this.UserBalance -= itemPrice;
                change = "\nYou inserted: Php" + insertedmoney + "\nYour change is: Php" + userchange + "\n" + cashchange + coinchange;
                this.machine.gettransactionLog().addSale(new Sale(selecteditem, quantity) );
                return change; // Return the change text
            }
                else
                {
                    change = "\nMACHINE HAS NO MORE CHANGE!";
                }
        }
            else
            {
                change = "\nInvalid Balance or Quantity";
            }
    }
    else
    {
        System.out.println("INDEX NOT FOUND!: INDEX = " + slotIndex);
    }
        } catch (Exception e) 
            { 
            System.out.println("ERROR IN CODE! PRINTING VALUES: ");
            System.out.println("USER BAL: " + this.UserBalance);
            System.out.println("USER BAL: " + this.MachineBalance);
            
            for (Cash cash: this.machine.getcashInventory().getcashList() ) {
                System.out.println(cash.toString() );
            }
            
            for (Coin coin: this.machine.getcashInventory().getcoinsList() ) {
                System.out.println(coin.toString() );
            }
        }
    
    return change; // Indicates that the purchase cannot be completed (insufficient balance or quantity)
}
    
    public int findSlotIndexForItem(Item item) {
        
        int value = -1;
        for (Slot tempslot: this.machine.getSlots() )
            {
                if (tempslot.getItemAtIndex(0).equals(item) ) {
                    value = this.machine.getSlots().indexOf(tempslot);
                    break;
                }
            }
    
        return value; // Indicates that the item was not found in any slot
    }
    
    public Item getItem1(){
        return this.item1;
    }
    
    public Item getItem2(){
        return this.item2;
    }
    
    public Item getItem3(){
        return this.item3;
    }
    
    public Item getItem4(){
        return this.item4;
    }
    
    public Item getItem5(){
        return this.item5;
    }
    
    public Item getItem6(){
        return this.item6;
    }
    
    public Item getItem7(){
        return this.item7;
    }
    
    public Item getItem8(){
        return this.item8;
    }
    
    public Item getItem9(){
        return this.item9;
    }
    
    public Ingredient getIng1(){
        return this.ing1;
    }
    
    public Ingredient getIng2(){
        return this.ing2;
    }
    
    public Ingredient getIng3(){
        return this.ing3;
    }
    
    public Ingredient getIng4(){
        return this.ing4;
    }
    
    public Ingredient getIng5(){
        return this.ing5;
    }
    
    public Ingredient getIng6(){
        return this.ing6;
    }
    
    public String getItem1Name(){
        return item1.getName();
    }
    
     public String getItem2Name(){
        return item2.getName();
    }
     
    public String getItem3Name(){
        return item3.getName();
    }
    
    public String getItem4Name(){
        return item4.getName();
    }
    
    public String getItem5Name(){
        return item5.getName();
    }
     
    public String getItem6Name(){
        return item6.getName();
    }
    
     public String getItem7Name(){
        return item7.getName();
    }
    
     public String getItem8Name(){
        return item8.getName();
    }
     
    public String getItem9Name(){
        return item9.getName();
    }
    
    public String getIng1Name() {
        return ing1.getName();
    }
    
    public String getIng2Name() {
        return ing2.getName();
    }
    
    public String getIng3Name() {
        return ing3.getName();
    }
    
    public String getIng4Name() {
        return ing4.getName();
    }
    
    public String getIng5Name() {
        return ing5.getName();
    }
    
    public String getIng6Name() {
        return ing6.getName();
    }
    
    public String getItem1Description() {
        return this.item1.toString();
    }
    
    public String getItem2Description() {
        return this.item2.toString();
    }
    
    public String getItem3Description() {
        return this.item3.toString();
    }
    
     public String getItem4Description() {
        return this.item4.toString();
    }
    
    public String getItem5Description() {
        return this.item5.toString();
    }
    
    public String getItem6Description() {
        return this.item6.toString();
    }
    
     public String getItem7Description() {
        return this.item7.toString();
    }
    
    public String getItem8Description() {
        return this.item8.toString();
    }
    
    public String getItem9Description() {
        return this.item9.toString();
    }
    
    public void setSelectedItem (Item item) {
        this.selectedItem = item;
    }
    
    public Item getSelectedItem () {
        return this.selectedItem;
    }
    
    public void removeSelectedItem (){
        this.selectedItem = null;
    }
    
    public void addUserBalance(int value) {
        this.UserBalance += value;
    }
    
    public int getUserBalance() {
        return this.UserBalance;
    }
    
    public int getMachineBalance () {
        return this.MachineBalance;
    }
    
    public int getSelectedSlotIndex() {
        return this.selectedSlotIndex;
    }
    
    public VendingMachine getVendingMachine () {
        return this.machine;
    }
    
    //List of stored items in vending machine
    public ArrayList<Item> getItemList() {
        return this.itemList;
    }
 
}
