/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIINTERFACE;
/**
 *
 * @author kurvy
 */
public class GUIModel { //Model class for our GUI si emman na bahala dito
    private VendingMachine machine;
    private CustomizableVendingMachine customMachine;
    private Item item1; 
    private Item item2; 
    private Item item3; 
    private Item item4; 
    private Item item5; 
    private Item item6;
    private Item item7; 
    private Item item8;
    private Item item9;
    private Ingredient ing1;
    private Ingredient ing2;
    private Ingredient ing3;
    private Ingredient ing4;
    private Ingredient ing5;
    private Ingredient ing6;
    private int MachineBalance;
    private int UserBalance;

    public GUIModel () {
    //PRESET ITEMS TO INITIALIZE CODE
        this.item1 = new Item("Coke", 50, 139);
        this.item2 = new Item("Sprite", 45, 105);
        this.item3 = new Item("Royal", 45, 76);
        this.item4 = new Item("Pepsi", 45, 105);
        this.item5 = new Item("Mug", 50, 107);
        this.item6 = new Item("7UP", 55, 150);
        this.item7 = new Item("Water", 20, 0);
        this.item8 = new Item("C2", 60, 105);
        //TODO: CHANGE TO CUSTOM ITEM
        this.item9 = new Item("Custom Milk Tea", 0, 500);
        //END OF TODO
        this.ing1 = new Ingredient ("Tapioca Pearl", 20, 10);
        this.ing2 = new Ingredient ("Nata de Coco", 20 , 7);
        this.ing3 = new Ingredient ("Black Tea", 0, 50);
        this.ing4 = new Ingredient ("Plastic Straw", 0, 0);
        this.ing5= new Ingredient ("Milktea Cup", 0, 0);
        this.ing6 = new Ingredient ("Sugar Syrup", 0, 100);
        this.machine = new VendingMachine();
        this.customMachine = new CustomizableVendingMachine();
        machine.addItemtoSlot(item1);
        machine.addItemtoSlot(item2);
        machine.addItemtoSlot(item3);
        machine.addItemtoSlot(item4);
        machine.addItemtoSlot(item5);
        machine.addItemtoSlot(item6);
        machine.addItemtoSlot(item7);
        machine.addItemtoSlot(item8);
        customMachine.addItemtoSlot(item1);
        customMachine.addItemtoSlot(item2);
        customMachine.addItemtoSlot(item3);
        customMachine.addItemtoSlot(item4);
        customMachine.addItemtoSlot(item5);
        customMachine.addItemtoSlot(item6);
        customMachine.addItemtoSlot(item7);
        customMachine.addItemtoSlot(item8);
        customMachine.addItemtoSlot(item9);
        customMachine.addIngredienttoSlot(ing4);
        customMachine.addIngredienttoSlot(ing5);
        customMachine.addIngredienttoSlot(ing6);
        this.MachineBalance = 0;
        this.UserBalance = 0;
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
    
    public int getUserBalance() {
        return this.UserBalance;
    }
    
    public int getMachineBalance () {
        return this.MachineBalance;
    }
    
}
