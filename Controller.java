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
            FirstView.setTestVendingMachineEnabled(true);
            FirstView.setmachineNameTextField("");
            }
        });
    }

    public static void main (String[] args)  {
            
        GUIModel mainModel = new GUIModel();
        RegMachineView secondView = new RegMachineView (mainModel);
        MainMenuAndCreateMachineView firstView = new MainMenuAndCreateMachineView(mainModel, secondView);
        
        Controller mainControl = new Controller (mainModel, firstView, secondView);
        
        mainControl.FirstView.setVisible(true);
    }
    
}
