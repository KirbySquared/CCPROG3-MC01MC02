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
    private Item item1; //MOVE ITEMS TO MODEL FOR MVC
    private Item item2; //MOVE ITEMS TO MODEL FOR MVC
    private Item item3; //MOVE ITEMS TO MODEL FOR MVC
    private Item item4; //MOVE ITEMS TO MODEL FOR MVC 
    private Item item5; //MOVE ITEMS TO MODEL FOR MVC
    private Item item6; //MOVE ITEMS TO MODEL FOR MVC
    private Item item7; 
    private Item item8;
    private Item item9;
    private Ingredient ing1;
    private Ingredient ing2;
    private Ingredient ing3;
    private Ingredient ing4;
    private Ingredient ing5;
    private Ingredient ing6;

    public GUIModel () {
        //PRESET ITEMS TO INITIALIZE CODE
     this.machine = new VendingMachine();
     this.item1 = new Item("Coke", 50, 139);
     this.item2 = new Item("Sprite", 45, 105);
     this.item3 = new Item("Royal", 45, 76);
     this.item4 = new Item("Pepsi", 45, 105);
     this.item5 = new Item("Mug", 50, 107);
     this.item6 = new Item("7UP", 55, 150);
     this.item7 = new Item("Water", 20, 0);
     this.item8 = new Item("C2", 60, 105);
     this.item9 = new Item("Customizable Milk Tea", 0, 500);//Change to Custom Item
     this.ing1 = new Ingredient ("Tapioca Pearl", 20, 10);
     this.ing2 = new Ingredient ("Nata de Coco", 20 , 7);
     this.ing3 = new Ingredient ("Black Tea", 0, 50);
     this.ing4 = new Ingredient ("Plastic Straw", 0, 0);
     this.ing5= new Ingredient ("Plastic Milktea Cup", 0, 0);
     this.ing6 = new Ingredient ("Sugar Syrup", 0, 100);
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
    
}
