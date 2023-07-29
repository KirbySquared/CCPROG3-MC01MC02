package GUIINTERFACE;

public class Controller {
    GUIModel Model;
    MainMenuAndCreateMachineView FirstView;
    RegMachineView SecondView;

    public Controller (GUIModel model, MainMenuAndCreateMachineView firstView, RegMachineView secondView) {
        this.Model = model;
        this.FirstView = firstView;
        this.SecondView = secondView;
    }
    
    public void setModel (GUIModel model) {
        this.Model = model;
    }

    public static void main (String[] args)  {
            
        GUIModel mainModel = new GUIModel();
        RegMachineView secondView = new RegMachineView (mainModel);
        MainMenuAndCreateMachineView firstView = new MainMenuAndCreateMachineView(mainModel, secondView);
        
        Controller mainControl = new Controller (mainModel, firstView, secondView);
        
        mainControl.FirstView.setVisible(true);
    }
    
}
