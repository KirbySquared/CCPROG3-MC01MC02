/*
 * We/I, Morales,Kurvy & Ting, Emmanuel of section S26, declare that the code, resources, and documents that we
submitted for the [2nd] phase of the major course output (MCO) for CCPROG3 are our own work and
effort. We take full responsibility for the submission and understand the repercussions of committing
academic dishonesty, as stated in the DLSU Student Handbook. We affirm that we have not used any
unauthorized assistance or unfair means in completing this project.
 */

package GUIINTERFACE;
import java.awt.event.*;

public class Controller {
    GUIModel Model;
    MainMenuAndCreateMachineView FirstView;
    RegMachineView SecondView;

    public Controller (GUIModel model, MainMenuAndCreateMachineView firstView, RegMachineView secondView) {
        this.Model = model;
        this.FirstView = firstView;
        this.SecondView = secondView;

        this.FirstView.setBtnTestVendingMachineListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
              SecondView.setVisible(false);
              SecondView.setVisible(true);
            }
        });
        
        this.FirstView.setCreateVendingBtnListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                   firstView.setCreateMachineVisible(true);
           }
        });
        
        this.FirstView.setExitButtonListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
           }
        });

        this.FirstView.setRegMachineButtonListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                FirstView.setCreateMachineButtonEnabled(true);
                Model = new GUIModel();
                FirstView.setItemListDisplayText(Model.getItem1Name()+"\n"+Model.getItem2Name()+"\n"+Model.getItem3Name()
                +"\n"+Model.getItem4Name()+"\n"+Model.getItem5Name()+"\n"+Model.getItem6Name()+"\n"+Model.getItem7Name()
                +"\n"+Model.getItem8Name() );
                SecondView.setAdminDisplayAreaText("");
                SecondView.setcustomItemLabelStatus(false);
                SecondView.setcustomItemBuyStatus(false);
                SecondView.setIng1LabelStatus(false);
                SecondView.setIng1BuyStatus(false);
                SecondView.setIng2LabelStatus(false);
                SecondView.setIng2BuyStatus(false);
                SecondView.setIng3LabelStatus(false);
                SecondView.setIng3BuyStatus(false);
                SecondView.getjRadioButton9().setEnabled(false);
                SecondView.getjRadioButton10().setEnabled(false);
                SecondView.getjRadioButton11().setEnabled(false);
                SecondView.getjRadioButton12().setEnabled(false);
                SecondView.getjRadioButton13().setEnabled(false);
                SecondView.getjRadioButton14().setEnabled(false);
                SecondView.getjRadioButton15().setEnabled(false);
            }
        }); 
        
        this.FirstView.setSpecialMachineButtonListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                FirstView.setCreateMachineButtonEnabled(true);
                Model = new GUIModel();
                FirstView.setItemListDisplayText(Model.getItem1Name()+"\n"+Model.getItem2Name()+"\n"+Model.getItem3Name()
                +"\n"+Model.getItem4Name()+"\n"+Model.getItem5Name()+"\n"+Model.getItem6Name()+"\n"+Model.getItem7Name()
                +"\n"+Model.getItem8Name()+"\n"+Model.getItem9Name()+"\n"+Model.getIng1Name()+"\n"+Model.getIng2Name()
                +"\n"+Model.getIng3Name()+"\n"+Model.getIng4Name()+"\n"+Model.getIng5Name()+"\n"+Model.getIng6Name());
                SecondView.setAdminDisplayAreaText("");
                SecondView.setcustomItemLabelStatus(true);
                SecondView.setcustomItemBuyStatus(true);
                SecondView.setIng1LabelStatus(true);
                SecondView.setIng1BuyStatus(true);
                SecondView.setIng2LabelStatus(true);
                SecondView.setIng2BuyStatus(true);
                SecondView.setIng3LabelStatus(true);
                SecondView.setIng3BuyStatus(true);
                SecondView.getjRadioButton9().setEnabled(true);
                SecondView.getjRadioButton10().setEnabled(true);
                SecondView.getjRadioButton11().setEnabled(true);
                SecondView.getjRadioButton12().setEnabled(true);
                SecondView.getjRadioButton13().setEnabled(true);
                SecondView.getjRadioButton14().setEnabled(true);
                SecondView.getjRadioButton15().setEnabled(true);
            }
        });
        
        this.FirstView.setCreateMachineButtonListener(new ActionListener () {
            @Override
                public void actionPerformed(ActionEvent evt) {
                    if (FirstView.isRegMachineButtonSelected() ) {
                secondView.setmachineLabel(FirstView.getmachineNameTextField());
                SecondView.setTitle("Regular Vending Machine MCO2");
                System.out.println("REGULAR MACHINE HAS BEEN SET.");
            } else if (FirstView.isSpecialMachineButtonSelected() ) {
                secondView.setmachineLabel(FirstView.getmachineNameTextField());
                SecondView.setTitle("Special Vending Machine MCO2");
                System.out.println("SPECIAL MACHINE HAS BEEN SET.");
            }
                SecondView.setItem1Label(Model.getItem1Name());
                SecondView.setItem2Label(Model.getItem2Name());
                SecondView.setItem3Label(Model.getItem3Name());
                SecondView.setItem4Label(Model.getItem4Name());
                SecondView.setItem5Label(Model.getItem5Name());
                SecondView.setItem6Label(Model.getItem6Name());
                SecondView.setItem7Label(Model.getItem7Name());
                SecondView.setItem8Label(Model.getItem8Name());
                SecondView.setCustomItemLabel(Model.getItem9Name());
                SecondView.setIng1Label(Model.getIng4Name());
                SecondView.setIng2Label(Model.getIng5Name());
                SecondView.setIng3Label(Model.getIng6Name());
                SecondView.getjRadioButton1().setText(Model.getItem1Name() );
                SecondView.getjRadioButton2().setText(Model.getItem2Name() );
                SecondView.getjRadioButton3().setText(Model.getItem3Name() );
                SecondView.getjRadioButton4().setText(Model.getItem4Name() );
                SecondView.getjRadioButton5().setText(Model.getItem5Name() );
                SecondView.getjRadioButton6().setText(Model.getItem6Name() );
                SecondView.getjRadioButton7().setText(Model.getItem7Name() );
                SecondView.getjRadioButton8().setText(Model.getItem8Name() );
                SecondView.getjRadioButton9().setText(Model.getItem9Name() );
                SecondView.getjRadioButton10().setText(Model.getIng1Name());
                SecondView.getjRadioButton11().setText(Model.getIng2Name() );
                SecondView.getjRadioButton12().setText(Model.getIng3Name() );
                SecondView.getjRadioButton13().setText(Model.getIng4Name() );
                SecondView.getjRadioButton14().setText(Model.getIng5Name() );
                SecondView.getjRadioButton15().setText(Model.getIng6Name() );
                FirstView.disposecreateMachine();
                SecondView.setMachinePrintDisplayText("");
                FirstView.setTestVendingMachineEnabled(true);
                FirstView.setmachineNameTextField("");
                SecondView.setPersonBalLabelText("BALANCE: " + Model.getUserBalance());
                SecondView.setMachineBalance("MACHINE BALANCE: " + Model.getMachineBalance() );
            }
        });
        
        this.SecondView.setExitButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.dispose();
            }
        });
        
        this.SecondView.setButtonCreate0ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("0");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "0");
           }
        });
        
        this.SecondView.setButtonCreate1ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("1");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "1");
           }
        });
        
        this.SecondView.setButtonCreate2ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("2");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "2");
           }
        });
        
        this.SecondView.setButtonCreate3ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("3");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "3");
           }
        });
        
        this.SecondView.setButtonCreate4ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("4");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "4");
           }
        });
        
        this.SecondView.setButtonCreate5ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("5");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "5");
           }
        });
        
        this.SecondView.setButtonCreate6ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("6");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "6");
           }
        });
        
        this.SecondView.setButtonCreate7ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("7");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "7");
           }
        });
        
        this.SecondView.setButtonCreate8ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("8");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "8");
           }
        });
        
        this.SecondView.setButtonCreate9ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               if (SecondView.getNumPadDisplayText().equals("Incorrect Input.") )
               SecondView.setNumPadDisplayText("9");    
               else
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "9");
           }
        });
        
        this.SecondView.setClearButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SecondView.setNumPadDisplayText("");
            }
        });
        
        this.SecondView.setDispenseButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            String change = null;
            if ( !(Model.getSelectedItem() == null) && !(Model.getSelectedItem().getName().equals("Dummy Item")) )
            {
                try {
                    int index = Model.findSlotIndexForItem(Model.getSelectedItem() );
                    String itemname = Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getName();
                    int itemcal = Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getCalories();
                    int itemprice = Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getPrice() * SecondView.getSpinnerQuantity();
                    change = Model.decreaseItem(Model.getSelectedItem(), SecondView.getSpinnerQuantity() );
                    
                      if (change != null ) {
                          SecondView.setMachinePrintDisplayText("DISPENSING ITEM. . .\n" + 
                          SecondView.getSpinnerQuantity()+ " quantities of " + itemname +  " containing " + itemcal
                          + " calories per item for a total of " + itemprice +"php\nREMAINING STOCK: " 
                          + Model.getVendingMachine().getSlots().get(index).getQuantity() + change );
                                                  
                          SecondView.setMachineBalance("MACHINE BALANCE: " + Model.getMachineBalance() );
                          SecondView.setPersonBalLabelText("BALANCE: " + Model.getUserBalance() );
                      }
                      else
                      {
                          SecondView.setMachinePrintDisplayText("DISPENSING FAILED! INSUFFICIENT BALANCE OR QUANTITY OR ITEM IS OUT OF STOCK" );
                      }
                   } catch (Exception e) {
                        SecondView.setMachinePrintDisplayText("DISPENSING FAILED!");
                        if ( Model.getSelectedItem().getName().equals("Dummy Item") )
                        {
                            System.out.println("SELECTED ITEM IS A DUMMY ITEM!");
                        }
                        else
                        {
                        int index = Model.findSlotIndexForItem(Model.getSelectedItem() );
                        System.out.println("USER BAL: " + Model.getUserBalance() + " MACHINE BAL: " + Model.getMachineBalance() );
                        System.out.println("Item: " + Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getName()
                        + "Cal: " + Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getCalories()
                        + "Price: " + Model.getVendingMachine().getSlots().get(index).getItemAtIndex(0).getPrice() 
                        + "IN STOCK: " + Model.getVendingMachine().getSlots().get(index).getQuantity() );
                    for (Cash cash: Model.getVendingMachine().getcashInventory().getcashList() )
                    {
                        System.out.println(cash.toString() );
                    }
                    for (Coin coin: Model.getVendingMachine().getcashInventory().getcoinsList() )
                    {
                        System.out.println(coin.toString() );
                    }
                         System.out.println(change);
                        }
                   }
            }
            else
            {
                SecondView.setMachinePrintDisplayText("EITHER SELECT AN ITEM FIRST OR THE SLOT YOU ARE BUYING FROM IS OUT OF STOCK!");
            }
                                                            }
        });
        
        this.SecondView.setInsertMoneyButtonListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    //TODO: CODE FOR MODEL TO INTERACT AND CALCULATE USER BALANCE
                    //insert code here, final value must be stored in UserBalance
                    Model.addUserBalance(Integer.parseInt(SecondView.getNumPadDisplayText()) );
                    SecondView.setPersonBalLabelText("BALANCE: " + Model.getUserBalance() );
                    SecondView.setNumPadDisplayText("");
                    //END OF TODO
                } catch (Exception e) { 
                    SecondView.setPersonBalLabelText("BALANCE: " + Model.getUserBalance() );
                    SecondView.setNumPadDisplayText("Incorrect Input.");
                }
            }
        });
        
        this.SecondView.setIng1BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(9).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(9).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(9).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(9).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getIng1().getName();
                        tempcal = Model.getIng1().getCalories();
                        tempprice = Model.getIng1().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getIng1().getName();
                        tempcal = Model.getIng1().getCalories();
                        tempprice = Model.getIng1().getPrice();
                        tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(9).getItemAtIndex(0) );
            }
        });
        
        this.SecondView.setIng2BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(10).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(10).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(10).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(10).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getIng2().getName();
                        tempcal = Model.getIng2().getCalories();
                        tempprice = Model.getIng2().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getIng2().getName();
                    tempcal = Model.getIng2().getCalories();
                    tempprice = Model.getIng2().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(10).getItemAtIndex(0) );
            }
        });
        
        this.SecondView.setIng3BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(11).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(11).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(11).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(11).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getIng3().getName();
                        tempcal = Model.getIng3().getCalories();
                        tempprice = Model.getIng3().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                        tempname = Model.getIng3().getName();
                        tempcal = Model.getIng3().getCalories();
                        tempprice = Model.getIng3().getPrice();
                        tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(11).getItemAtIndex(0) );
            }
        });
        
        
        this.SecondView.setItem1BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(0).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(0).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(0).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(0).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem1().getName();
                        tempcal = Model.getItem1().getCalories();
                        tempprice = Model.getItem1().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem1().getName();
                    tempcal = Model.getItem1().getCalories();
                    tempprice = Model.getItem1().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(0).getItemAtIndex(0) );
            }
        });
        
         this.SecondView.setItem2BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(1).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(1).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(1).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(1).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem2().getName();
                        tempcal = Model.getItem2().getCalories();
                        tempprice = Model.getItem2().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem2().getName();
                    tempcal = Model.getItem2().getCalories();
                    tempprice = Model.getItem2().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(1).getItemAtIndex(0) );
            }
        });
         
        this.SecondView.setItem3BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(2).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(2).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(2).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(2).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem3().getName();
                        tempcal = Model.getItem3().getCalories();
                        tempprice = Model.getItem3().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem3().getName();
                    tempcal = Model.getItem3().getCalories();
                    tempprice = Model.getItem3().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(2).getItemAtIndex(0) );
            }
        });
        
         this.SecondView.setItem4BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(3).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(3).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(3).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(3).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem4().getName();
                        tempcal = Model.getItem4().getCalories();
                        tempprice = Model.getItem4().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem4().getName();
                    tempcal = Model.getItem4().getCalories();
                    tempprice = Model.getItem4().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(3).getItemAtIndex(0) );
            }
        }); 
         
        this.SecondView.setItem5BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(4).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(4).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(4).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(4).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem5().getName();
                        tempcal = Model.getItem5().getCalories();
                        tempprice = Model.getItem5().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem5().getName();
                    tempcal = Model.getItem5().getCalories();
                    tempprice = Model.getItem5().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(4).getItemAtIndex(0) );
            }
        });
        
        this.SecondView.setItem6BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(5).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(5).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(5).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(5).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem6().getName();
                        tempcal = Model.getItem6().getCalories();
                        tempprice = Model.getItem6().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem6().getName();
                    tempcal = Model.getItem6().getCalories();
                    tempprice = Model.getItem6().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(5).getItemAtIndex(0) );
            }
        });
         
        this.SecondView.setItem7BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(6).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(6).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(6).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(6).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem7().getName();
                        tempcal = Model.getItem7().getCalories();
                        tempprice = Model.getItem7().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem7().getName();
                    tempcal = Model.getItem7().getCalories();
                    tempprice = Model.getItem7().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(6).getItemAtIndex(0) );
            }
        });
        
        this.SecondView.setItem8BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(7).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(7).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(7).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(7).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem8().getName();
                        tempcal = Model.getItem8().getCalories();
                        tempprice = Model.getItem8().getPrice();
                        tempstock = 0;
                     }
                } catch (Exception e) {
                    tempname = Model.getItem8().getName();
                    tempcal = Model.getItem8().getCalories();
                    tempprice = Model.getItem8().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(7).getItemAtIndex(0) );
            }
        }); 
        
        this.SecondView.setCustomItemBuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                String tempname = "NULL";
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                try {
                    tempname = Model.getVendingMachine().getSlots().get(8).getItemAtIndex(0).getName();
                    tempcal = Model.getVendingMachine().getSlots().get(8).getItemAtIndex(0).getCalories();
                    tempprice = Model.getVendingMachine().getSlots().get(8).getItemAtIndex(0).getPrice();
                    tempstock = Model.getVendingMachine().getSlots().get(8).getQuantity();
                     if (tempname.equals("Dummy Item") )
                     {
                        tempname = Model.getItem9().getName();
                        tempcal = Model.getItem9().getCalories();
                        tempprice = Model.getItem9().getPrice();
                        tempstock = 0;
                     }
                     SecondView.getCustomItemMenu().setVisible(true);
                } catch (Exception e) {
                    tempname = Model.getItem9().getName();
                    tempcal = Model.getItem9().getCalories();
                    tempprice = Model.getItem9().getPrice();
                    tempstock = 0;
                }
                SecondView.setMachinePrintDisplayText("Item: " + tempname + "\nCalories: " + tempcal * SecondView.getSpinnerQuantity() + " (" + tempcal + " per item)" 
                + "\nPrice: " + tempprice * SecondView.getSpinnerQuantity() + "\nIN STOCK: " + tempstock);
                Model.setSelectedItem(Model.getVendingMachine().getSlots().get(8).getItemAtIndex(0) );
            }
        }); 
        
        this.SecondView.setAdminSettingsButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String tempname = "NULL";
                int index = 0;
                int tempcal = 0;
                int tempprice = 0;
                int tempstock = 0;
                SecondView.setAdminDisplayAreaText("");
                for (Slot tempslots : Model.getVendingMachine().getSlots() ){
                    try {
                        if (tempslots.getItems().get(0).getName().equals("Dummy Item") )
                        {
                            tempname = Model.getItemList().get(index).getName();
                            tempcal = Model.getItemList().get(index).getCalories();
                            tempprice = Model.getItemList().get(index).getPrice();
                            tempstock = 0;
                        }
                        else {
                        tempname = tempslots.getItemAtIndex(0).getName();
                        tempcal = tempslots.getItemAtIndex(0).getCalories();
                        tempprice = tempslots.getItemAtIndex(0).getPrice();
                        tempstock = tempslots.getQuantity();
                            }
                        index++;
                    } catch (Exception e) {
                        index++;
                        tempname = Model.getItemList().get(index).getName();
                        tempcal = Model.getItemList().get(index).getCalories();
                        tempprice = Model.getItemList().get(index).getPrice();
                        tempstock = 0;
                    } 
                        SecondView.setAdminDisplayAreaText(SecondView.getAdminDisplayAreaText() + "Item: " + tempname
                        + "\nCalories: " + tempcal
                        + "\nPrice: " + tempprice
                        + "\nSTOCK: " + tempstock + "\n\n");
                }
            SecondView.setAdminFrameVisibility(true);
            }
        });
        
        this.SecondView.setAdminBackButtonListener(new ActionListener () {
            @Override 
            public void actionPerformed(ActionEvent evt) {
                SecondView.disposeAdminFrame();
            }
        }); 
        
        this.SecondView.setjRadioButton1Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton2Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton3Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton4Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton5Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton6Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton7Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton8Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton9Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton10Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton11Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton12Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton13Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton14Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        this.SecondView.setjRadioButton15Listener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
    } //End of line for Controller

    public static void main (String[] args)  {
            
        GUIModel mainModel = new GUIModel();
        RegMachineView secondView = new RegMachineView ();
        MainMenuAndCreateMachineView firstView = new MainMenuAndCreateMachineView();
        
        Controller mainControl = new Controller (mainModel, firstView, secondView);
        
        mainControl.FirstView.setVisible(true);
    }
    
}
