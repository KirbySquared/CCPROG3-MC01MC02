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
                SecondView.setcustomItemLabelStatus(false);
                SecondView.setcustomItemBuyStatus(false);
                SecondView.setIng1LabelStatus(false);
                SecondView.setIng1BuyStatus(false);
                SecondView.setIng2LabelStatus(false);
                SecondView.setIng2BuyStatus(false);
                SecondView.setIng3LabelStatus(false);
                SecondView.setIng3BuyStatus(false);
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
                SecondView.setcustomItemLabelStatus(true);
                SecondView.setcustomItemBuyStatus(true);
                SecondView.setIng1LabelStatus(true);
                SecondView.setIng1BuyStatus(true);
                SecondView.setIng2LabelStatus(true);
                SecondView.setIng2BuyStatus(true);
                SecondView.setIng3LabelStatus(true);
                SecondView.setIng3BuyStatus(true);
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
                FirstView.disposecreateMachine();
                SecondView.setMachinePrintDisplayText("");
                FirstView.setTestVendingMachineEnabled(true);
                FirstView.setmachineNameTextField("");
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
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "0");
           }
        });
        
        this.SecondView.setButtonCreate1ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "1");
           }
        });
        
        this.SecondView.setButtonCreate2ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "2");
           }
        });
        
        this.SecondView.setButtonCreate3ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "3");
           }
        });
        
        this.SecondView.setButtonCreate4ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "4");
           }
        });
        
        this.SecondView.setButtonCreate5ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "5");
           }
        });
        
        this.SecondView.setButtonCreate6ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "6");
           }
        });
        
        this.SecondView.setButtonCreate7ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "7");
           }
        });
        
        this.SecondView.setButtonCreate8ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "8");
           }
        });
        
        this.SecondView.setButtonCreate9ActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               SecondView.setNumPadDisplayText(SecondView.getNumPadDisplayText() + "9");
           }
        });
        
        this.SecondView.setClearButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SecondView.setNumPadDisplayText("");
            }
        });
        
        this.SecondView.setEnterButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("FUNCTION NOT DONE BUT MAKE SURE TO GET THE VALUE OF INPUT AND STORE IT TO A VARIABLE");
                //variable = Integer.parseInt(SecondView.getNumPadDisplayText() );
                SecondView.setNumPadDisplayText("");
            }
        });
        
        this.SecondView.setInsertMoneyButtonListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    //TODO: CODE FOR MODEL TO INTERACT AND CALCULATE USER BALANCE
                    //insert code here, final value must be stored in UserBalance
                    SecondView.setPersonBalLabelText("BALANCE: " + Model.getUserBalance() );
                    SecondView.setNumPadDisplayText("");
                    System.out.println("CODE INCOMPLETE.");
                    //END OF TODO
                } catch (Exception e) { 
                    SecondView.setPersonBalLabelText("BALANCE: ERROR IN CODE");
                }
            }
                
        });
        
        this.SecondView.setItem1BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem1Description());
            }
        });
        
         this.SecondView.setItem2BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem2Description());
            }
        });
         
        this.SecondView.setItem3BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem3Description());
            }
        });
        
         this.SecondView.setItem4BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem4Description());
            }
        }); 
         
        this.SecondView.setItem5BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem5Description());
            }
        });
        
        this.SecondView.setItem6BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem6Description());
            }
        });
         
        this.SecondView.setItem7BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem7Description());
            }
        });
        
        this.SecondView.setItem8BuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem8Description());
            }
        }); 
        
        this.SecondView.setCustomItemBuyActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent evt) {
                SecondView.setMachinePrintDisplayText(Model.getItem9Description());
            }
        }); 
    }

    public static void main (String[] args)  {
            
        GUIModel mainModel = new GUIModel();
        RegMachineView secondView = new RegMachineView ();
        MainMenuAndCreateMachineView firstView = new MainMenuAndCreateMachineView();
        
        Controller mainControl = new Controller (mainModel, firstView, secondView);
        
        mainControl.FirstView.setVisible(true);
    }
    
}
