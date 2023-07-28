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
    
    public GUIModel () {
     this.machine = new VendingMachine();
    }
    public GUIModel(String name) {
     this.machine = new VendingMachine(name);
    }
    
}
