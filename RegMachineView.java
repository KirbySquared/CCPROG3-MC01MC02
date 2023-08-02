/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIINTERFACE;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 *
 * @author kurvy morales and emmanuel ting
 */
public class RegMachineView extends JFrame {
    
    /**
 * Represents the label displaying the quantity of Milk Tea selected by the user.
 */
private JLabel MilkTeaQuantityLabel;

/**
 * Represents the spinner control for selecting the quantity of Milk Tea.
 */
private JSpinner MilkTeaQuantity;

/**
 * Represents the button used to navigate back to the admin panel.
 */
private JButton AdminBackButton;

/**
 * Represents the text area used to display administrative information.
 */
private JTextArea AdminDisplayArea;

/**
 * Represents the main frame for the admin panel.
 */
private JFrame AdminFrame;

/**
 * Represents the text area used to display other administrative information.
 */
private JTextArea AdminOtherDisplay;

/**
 * Represents the panel used for the admin functionalities.
 */
private JPanel AdminPanel;

/**
 * Represents the button used to access the admin settings.
 */
private JButton AdminSettingsButton;

/**
 * Represents the main panel for the vending machine interface.
 */
private JPanel BigMachinePanel;

/**
 * Represents the panel used for the buying items in the vending machine.
 */
private JPanel BuyItemPanel;

    /**
 * Represents the button used to clear a custom item purchase.
 */
private JButton ClearButton;

/**
 * Represents the button used for custom item purchase in the vending machine.
 */
private JButton CustomItemBuy;

/**
 * Represents the label for the custom item.
 */
private JLabel CustomItemLabel;

/**
 * Represents the frame for the custom item menu in the vending machine.
 */
private JFrame CustomItemMenu;

/**
 * Represents the button used to dispense items from the vending machine.
 */
private JButton DispenseButton;

/**
 * Represents the button used to exit the vending machine interface.
 */
private JButton ExitButton;

/**
 * Represents the button used to buy ingredient 1 in the vending machine.
 */
private JButton Ing1Buy;

/**
 * Represents the label for ingredient 1 in the vending machine.
 */
private JLabel Ing1Label;

/**
 * Represents the button used to buy ingredient 2 in the vending machine.
 */
private JButton Ing2Buy;

/**
 * Represents the label for ingredient 2 in the vending machine.
 */
private JLabel Ing2Label;

/**
 * Represents the button used to buy ingredient 3 in the vending machine.
 */
private JButton Ing3Buy;

/**
 * Represents the label for ingredient 3 in the vending machine.
 */
private JLabel Ing3Label;

/**
 * Represents the label for input in the vending machine.
 */
private JLabel InputLabel;

/**
 * Represents the panel used for input in the vending machine.
 */
private JPanel InputPanel;

/**
 * Represents the button used to input quantity in the vending machine.
 */
private JButton InputQuantityButton;

/**
 * Represents the label for input quantity in the vending machine.
 */
private JLabel InputQuantityLabel;

/**
 * Represents the button used to insert money in the vending machine.
 */
private JButton InsertMoneyButton;

/**
 * Represents the button used to buy item 1 in the vending machine.
 */
private JButton Item1Buy;

/**
 * Represents the label for item 1 in the vending machine.
 */
private JLabel Item1Label;

/**
 * Represents the button used to buy item 2 in the vending machine.
 */
private JButton Item2Buy;

/**
 * Represents the label for item 2 in the vending machine.
 */
private JLabel Item2Label;

/**
 * Represents the button used to buy item 3 in the vending machine.
 */
private JButton Item3Buy;

/**
 * Represents the label for item 3 in the vending machine.
 */
private JLabel Item3Label;

/**
 * Represents the button used to buy item 4 in the vending machine.
 */
private JButton Item4Buy;

/**
 * Represents the label for item 4 in the vending machine.
 */
private JLabel Item4Label;

/**
 * Represents the button used to buy item 5 in the vending machine.
 */
private JButton Item5Buy;

/**
 * Represents the label for item 5 in the vending machine.
 */
private JLabel Item5Label;

/**
 * Represents the button used to buy item 6 in the vending machine.
 */
private JButton Item6Buy;

/**
 * Represents the label for item 6 in the vending machine.
 */
private JLabel Item6Label;

/**
 * Represents the button used to buy item 7 in the vending machine.
 */
private JButton Item7Buy;

/**
 * Represents the label for item 7 in the vending machine.
 */
private JLabel Item7Label;

/**
 * Represents the button used to buy item 8 in the vending machine.
 */
private JButton Item8Buy;

/**
 * Represents the label for item 8 in the vending machine.
 */
private JLabel Item8Label;

/**
 * Represents the panel for the layout of the vending machine interface.
 */
private JPanel LayoutPanel;

/**
 * Represents the label displaying the machine balance in the vending machine.
 */
private JLabel MachineBalLabel;

/**
 * Represents the panel containing the buttons for various vending machine functionalities.
 */
private JPanel MachineButtonPanel;

/**
 * Represents the text area used to display messages and transactions in the vending machine.
 */
private JTextArea MachinePrintDisplay;

/**
 * Represents the label used for maintenance information in the vending machine.
 */
private JLabel MaintenanceLabel;

/**
 * Represents the label used for additional maintenance information in the vending machine.
 */
private JLabel MaintenanceLabel1;
    /**
 * Represents the label for milk tea flavor in the vending machine.
 */
private JLabel MilkteaFlavor;

/**
 * Represents an additional label for milk tea flavor in the vending machine.
 */
private JLabel MilkteaFlavor1;

/**
 * Represents another additional label for milk tea flavor in the vending machine.
 */
private JLabel MilkteaFlavor2;

/**
 * Represents the panel used for handling money in the vending machine.
 */
private JPanel MoneyPanel;

/**
 * Represents the field used for entering money quantity in the vending machine.
 */
private JTextField MoneyQuantityField;

/**
 * Represents the text area used to display the numpad input in the vending machine.
 */
private JTextArea NumPadDisplay;

/**
 * Represents the label displaying the person's balance in the vending machine.
 */
private JLabel PersonBalLabel;

/**
 * Represents the label for quantity in the vending machine.
 */
private JLabel QuantityLabel;

/**
 * Represents the button used to restock items in the vending machine.
 */
private JButton RestockButton;

/**
 * Represents the field used for entering restock quantity in the vending machine.
 */
private JTextField RestockField;

/**
 * Represents the label for restocking in the vending machine.
 */
private JLabel RestockLabel;

/**
 * Represents the button used to set the item price in the vending machine.
 */
private JButton SetPriceButton;

/**
 * Represents the field used for entering the item price in the vending machine.
 */
private JTextField SetPriceField;

/**
 * Represents the label for setting the item price in the vending machine.
 */
private JLabel SetPriceLabel;

/**
 * Represents the spinner used for selecting the quantity of items in the vending machine.
 */
private JSpinner SpinnerQuantity;

/**
 * Represents the label for the vending machine name in the vending machine.
 */
private JLabel VendingMachineName;

/**
 * Represents the button group for item buttons in the vending machine.
 */
private ButtonGroup ItemButtonGroup;

/**
 * Represents the button group for money buttons in the vending machine.
 */
private ButtonGroup MoneyButtonGroup;

/**
 * Represents the button group for milk tea flavor selection in the vending machine.
 */
private ButtonGroup MilkTeaFlavorGroup;

/**
 * Represents the button group for sugar level selection in the vending machine.
 */
private ButtonGroup SugarLevelButtonGroup;

/**
 * Represents the button group for sinker selection in the vending machine.
 */
private ButtonGroup SinkerButtonGroup;

/**
 * Represents the button used to collect payment in the vending machine.
 */
private JButton CollectPaymentButton;

/**
 * Represents the button used to view transaction summaries in the vending machine.
 */
private JButton SummaryTransactionButton;

/**
 * Represents the button used to exit the custom item menu in the vending machine.
 */
private JButton CustomItemMenuExitButton;

/**
 * Represents the button used to create a milk tea in the vending machine.
 */
private JButton CreateMilkteaButton;

/**
 * Represents the button used for the digit "0" in the vending machine.
 */
private JButton jButtonCreate0;

    /**
 * Represents the button used for the digit "1" in the vending machine.
 */
private JButton jButtonCreate1;

/**
 * Represents the button used for the digit "2" in the vending machine.
 */
private JButton jButtonCreate2;

/**
 * Represents the button used for the digit "3" in the vending machine.
 */
private JButton jButtonCreate3;

/**
 * Represents the button used for the digit "4" in the vending machine.
 */
private JButton jButtonCreate4;

/**
 * Represents the button used for the digit "5" in the vending machine.
 */
private JButton jButtonCreate5;

/**
 * Represents the button used for the digit "6" in the vending machine.
 */
private JButton jButtonCreate6;

/**
 * Represents the button used for the digit "7" in the vending machine.
 */
private JButton jButtonCreate7;

/**
 * Represents the button used for the digit "8" in the vending machine.
 */
private JButton jButtonCreate8;

/**
 * Represents the button used for the digit "9" in the vending machine.
 */
private JButton jButtonCreate9;

/**
 * Represents the label displaying the stock of milk tea flavors in the vending machine.
 */
private JLabel MilkteaFlavorStockLabel;

/**
 * Represents the label for sugar level selection in the vending machine.
 */
private JLabel SugarLevelStockLabel;

/**
 * Represents the label displaying the stock of sinkers in the vending machine.
 */
private JLabel SinkerStockLabel;

/**
 * Represents the panel used for handling the first set of buttons in the vending machine.
 */
private JPanel jPanel1;

/**
 * Represents the panel used for handling the second set of buttons in the vending machine.
 */
private JPanel jPanel2;

/**
 * Represents the panel used for handling the third set of buttons in the vending machine.
 */
private JPanel jPanel3;

/**
 * Represents the panel used for handling the fourth set of buttons in the vending machine.
 */
private JPanel jPanel4;

/**
 * Represents the panel used for handling the fifth set of buttons in the vending machine.
 */
private JPanel jPanel5;

/**
 * Represents the first radio button in the vending machine.
 */
private JRadioButton jRadioButton1;

/**
 * Represents the tenth radio button in the vending machine.
 */
private JRadioButton jRadioButton10;

/**
 * Represents the eleventh radio button in the vending machine.
 */
private JRadioButton jRadioButton11;

    /**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton12;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton13;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton14;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton15;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton16;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton17;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton18;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton19;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton2;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton20;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton21;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton22;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton23;

/**
 * Represents a specific radio button used in the user interface.
 * This radio button is used for a specific purpose, but its purpose is not described in the Javadoc comment.
 */
private JRadioButton jRadioButton24;

    /**
 * Represents a JRadioButton for Cookies and Cream flavor.
 */
private JRadioButton CookiesCream;

/**
 * Represents a JRadioButton for Winter Melon flavor.
 */
private JRadioButton WinterMelon;

/**
 * Represents a JRadioButton for Classic Flavor.
 */
private JRadioButton ClassicFlavor;

/**
 * Represents a JRadioButton for 100% Sugar level.
 */
private JRadioButton Sugar100;

/**
 * Represents a JRadioButton for 75% Sugar level.
 */
private JRadioButton Sugar75;

/**
 * Represents a JRadioButton for some option 3 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton3;

/**
 * Represents a JRadioButton for 50% Sugar level.
 */
private JRadioButton Sugar50;

/**
 * Represents a JRadioButton for 25% Sugar level.
 */
private JRadioButton Sugar25;

/**
 * Represents a JRadioButton for 0% Sugar level.
 */
private JRadioButton Sugar0;

/**
 * Represents a JRadioButton for Nata De Coco topping.
 */
private JRadioButton NataDeCoco;

/**
 * Represents a JRadioButton for Tapioca Pearl topping.
 */
private JRadioButton TapiocaPearl;

/**
 * Represents a JRadioButton for some option 4 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton4;

/**
 * Represents a JRadioButton for some option 5 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton5;

/**
 * Represents a JRadioButton for some option 6 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton6;

/**
 * Represents a JRadioButton for some option 7 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton7;

/**
 * Represents a JRadioButton for some option 8 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton8;

/**
 * Represents a JRadioButton for some option 9 (Please provide a descriptive name).
 */
private JRadioButton jRadioButton9;

/**
 * Represents a JScrollPane for some content 2 (Please provide a descriptive name).
 */
private JScrollPane jScrollPane2;

/**
 * Represents a JScrollPane for some content 3 (Please provide a descriptive name).
 */
private JScrollPane jScrollPane3;

/**
 * Represents a JScrollPane for some content 4 (Please provide a descriptive name).
 */
private JScrollPane jScrollPane4;

/**
 * Represents a JScrollPane for some content 5 (Please provide a descriptive name).
 */
private JScrollPane jScrollPane5;

/**
 * Creates a new instance of the Registration Machine View.
 * This constructor initializes the components of the view.
 */          
    public RegMachineView() {
        //Initializes components
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminFrame = new javax.swing.JFrame();
        AdminPanel = new javax.swing.JPanel();
        AdminBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AdminOtherDisplay = new javax.swing.JTextArea();
        MaintenanceLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        CollectPaymentButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        AdminDisplayArea = new javax.swing.JTextArea();
        RestockLabel = new javax.swing.JLabel();
        RestockField = new javax.swing.JTextField();
        RestockButton = new javax.swing.JButton();
        SetPriceLabel = new javax.swing.JLabel();
        SetPriceField = new javax.swing.JTextField();
        SetPriceButton = new javax.swing.JButton();
        MoneyPanel = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        InputQuantityLabel = new javax.swing.JLabel();
        MoneyQuantityField = new javax.swing.JTextField();
        InputQuantityButton = new javax.swing.JButton();
        SummaryTransactionButton = new javax.swing.JButton();
        CustomItemMenu = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        MaintenanceLabel1 = new javax.swing.JLabel();
        MilkteaFlavor = new javax.swing.JLabel();
        MilkteaFlavor1 = new javax.swing.JLabel();
        MilkteaFlavor2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CookiesCream = new javax.swing.JRadioButton();
        WinterMelon = new javax.swing.JRadioButton();
        ClassicFlavor = new javax.swing.JRadioButton();
        MilkteaFlavorStockLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Sugar100 = new javax.swing.JRadioButton();
        Sugar75 = new javax.swing.JRadioButton();
        Sugar50 = new javax.swing.JRadioButton();
        Sugar25 = new javax.swing.JRadioButton();
        Sugar0 = new javax.swing.JRadioButton();
        SugarLevelStockLabel = new javax.swing.JLabel();
        CustomItemMenuExitButton = new javax.swing.JButton();
        CreateMilkteaButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        NataDeCoco = new javax.swing.JRadioButton();
        TapiocaPearl = new javax.swing.JRadioButton();
        SinkerStockLabel = new javax.swing.JLabel();
        MilkTeaQuantity = new javax.swing.JSpinner();
        MilkTeaQuantityLabel = new javax.swing.JLabel();
        ItemButtonGroup = new javax.swing.ButtonGroup();
        MoneyButtonGroup = new javax.swing.ButtonGroup();
        MilkTeaFlavorGroup = new javax.swing.ButtonGroup();
        SugarLevelButtonGroup = new javax.swing.ButtonGroup();
        SinkerButtonGroup = new javax.swing.ButtonGroup();
        BigMachinePanel = new javax.swing.JPanel();
        VendingMachineName = new javax.swing.JLabel();
        InputPanel = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        InsertMoneyButton = new javax.swing.JButton();
        MachineButtonPanel = new javax.swing.JPanel();
        jButtonCreate1 = new javax.swing.JButton();
        jButtonCreate2 = new javax.swing.JButton();
        jButtonCreate3 = new javax.swing.JButton();
        jButtonCreate4 = new javax.swing.JButton();
        jButtonCreate5 = new javax.swing.JButton();
        jButtonCreate6 = new javax.swing.JButton();
        jButtonCreate7 = new javax.swing.JButton();
        jButtonCreate8 = new javax.swing.JButton();
        jButtonCreate9 = new javax.swing.JButton();
        jButtonCreate0 = new javax.swing.JButton();
        LayoutPanel = new javax.swing.JPanel();
        AdminSettingsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        MachineBalLabel = new javax.swing.JLabel();
        PersonBalLabel = new javax.swing.JLabel();
        DispenseButton = new javax.swing.JButton();
        BuyItemPanel = new javax.swing.JPanel();
        Item1Label = new javax.swing.JLabel();
        Item2Label = new javax.swing.JLabel();
        Item3Label = new javax.swing.JLabel();
        Item4Label = new javax.swing.JLabel();
        Item1Buy = new javax.swing.JButton();
        Item2Buy = new javax.swing.JButton();
        Item3Buy = new javax.swing.JButton();
        Item4Buy = new javax.swing.JButton();
        Item5Label = new javax.swing.JLabel();
        Item6Label = new javax.swing.JLabel();
        Item7Label = new javax.swing.JLabel();
        Item8Label = new javax.swing.JLabel();
        Item5Buy = new javax.swing.JButton();
        Item6Buy = new javax.swing.JButton();
        Item7Buy = new javax.swing.JButton();
        Item8Buy = new javax.swing.JButton();
        CustomItemLabel = new javax.swing.JLabel();
        Ing1Label = new javax.swing.JLabel();
        Ing2Label = new javax.swing.JLabel();
        Ing3Label = new javax.swing.JLabel();
        CustomItemBuy = new javax.swing.JButton();
        Ing1Buy = new javax.swing.JButton();
        Ing2Buy = new javax.swing.JButton();
        Ing3Buy = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        NumPadDisplay = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        MachinePrintDisplay = new javax.swing.JTextArea();
        InputLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        SpinnerQuantity = new javax.swing.JSpinner();

        AdminFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AdminFrame.setPreferredSize(new java.awt.Dimension(1072, 750));
        AdminFrame.setResizable(false);
        AdminFrame.setSize(new java.awt.Dimension(1072, 750));

        AdminPanel.setBackground(new java.awt.Color(204, 204, 204));
        AdminPanel.setPreferredSize(new java.awt.Dimension(1020, 660));

        AdminBackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminBackButton.setText("Back to previous menu");

        AdminOtherDisplay.setEditable(false);
        AdminOtherDisplay.setColumns(20);
        AdminOtherDisplay.setLineWrap(true);
        AdminOtherDisplay.setRows(6);
        AdminOtherDisplay.setWrapStyleWord(true);
        AdminOtherDisplay.setFocusable(false);
        jScrollPane2.setViewportView(AdminOtherDisplay);

        MaintenanceLabel.setBackground(new java.awt.Color(255, 204, 102));
        MaintenanceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        MaintenanceLabel.setForeground(new java.awt.Color(255, 102, 255));
        MaintenanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaintenanceLabel.setText("Maintenance Panel (Admins Only)");
        MaintenanceLabel.setAlignmentY(0.0F);
        MaintenanceLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MaintenanceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MaintenanceLabel.setMaximumSize(new java.awt.Dimension(50, 34));
        MaintenanceLabel.setMinimumSize(new java.awt.Dimension(50, 34));
        MaintenanceLabel.setName(""); // NOI18N
        MaintenanceLabel.setOpaque(true);
        MaintenanceLabel.setPreferredSize(new java.awt.Dimension(50, 34));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new java.awt.GridLayout(15, 1));

        ItemButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Item 1");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jRadioButton1);

        ItemButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("Item 2");
        jPanel1.add(jRadioButton2);

        ItemButtonGroup.add(jRadioButton3);
        jRadioButton3.setText("Item 3");
        jPanel1.add(jRadioButton3);

        ItemButtonGroup.add(jRadioButton4);
        jRadioButton4.setText("Item 4");
        jPanel1.add(jRadioButton4);

        ItemButtonGroup.add(jRadioButton5);
        jRadioButton5.setText("Item 5");
        jPanel1.add(jRadioButton5);

        ItemButtonGroup.add(jRadioButton6);
        jRadioButton6.setText("Item 6");
        jPanel1.add(jRadioButton6);

        ItemButtonGroup.add(jRadioButton7);
        jRadioButton7.setText("Item 7");
        jPanel1.add(jRadioButton7);

        ItemButtonGroup.add(jRadioButton8);
        jRadioButton8.setText("Item 8");
        jPanel1.add(jRadioButton8);

        ItemButtonGroup.add(jRadioButton9);
        jRadioButton9.setText("Item 9");
        jPanel1.add(jRadioButton9);

        ItemButtonGroup.add(jRadioButton10);
        jRadioButton10.setText("Item 10");
        jPanel1.add(jRadioButton10);

        ItemButtonGroup.add(jRadioButton11);
        jRadioButton11.setText("Item 11");
        jPanel1.add(jRadioButton11);

        ItemButtonGroup.add(jRadioButton12);
        jRadioButton12.setText("Item 12");
        jPanel1.add(jRadioButton12);

        ItemButtonGroup.add(jRadioButton13);
        jRadioButton13.setText("Item 13");
        jPanel1.add(jRadioButton13);

        ItemButtonGroup.add(jRadioButton14);
        jRadioButton14.setText("Item 14");
        jPanel1.add(jRadioButton14);

        ItemButtonGroup.add(jRadioButton15);
        jRadioButton15.setText("Item 15");
        jPanel1.add(jRadioButton15);

        CollectPaymentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CollectPaymentButton.setText("Collect Payment");

        AdminDisplayArea.setEditable(false);
        AdminDisplayArea.setColumns(20);
        AdminDisplayArea.setLineWrap(true);
        AdminDisplayArea.setRows(6);
        AdminDisplayArea.setWrapStyleWord(true);
        AdminDisplayArea.setFocusable(false);
        jScrollPane5.setViewportView(AdminDisplayArea);

        RestockLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RestockLabel.setText("RESTOCK (INTEGERS ONLY): ");

        RestockButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RestockButton.setText("SUBMIT");

        SetPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SetPriceLabel.setText("SET PRICE (INTEGERS ONLY):  ");

        SetPriceButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SetPriceButton.setText("SUBMIT");

        MoneyPanel.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        MoneyButtonGroup.add(jRadioButton16);
        jRadioButton16.setText("Money 1");
        MoneyPanel.add(jRadioButton16);

        MoneyButtonGroup.add(jRadioButton17);
        jRadioButton17.setText("Money 2");
        MoneyPanel.add(jRadioButton17);

        MoneyButtonGroup.add(jRadioButton18);
        jRadioButton18.setText("Money 3");
        MoneyPanel.add(jRadioButton18);

        MoneyButtonGroup.add(jRadioButton19);
        jRadioButton19.setText("Money 4");
        MoneyPanel.add(jRadioButton19);

        MoneyButtonGroup.add(jRadioButton20);
        jRadioButton20.setText("Money 5");
        MoneyPanel.add(jRadioButton20);

        MoneyButtonGroup.add(jRadioButton21);
        jRadioButton21.setText("Money 6");
        MoneyPanel.add(jRadioButton21);

        MoneyButtonGroup.add(jRadioButton22);
        jRadioButton22.setText("Money 7");
        MoneyPanel.add(jRadioButton22);

        MoneyButtonGroup.add(jRadioButton23);
        jRadioButton23.setText("Money 8");
        MoneyPanel.add(jRadioButton23);

        MoneyButtonGroup.add(jRadioButton24);
        jRadioButton24.setText("Money 9");
        MoneyPanel.add(jRadioButton24);

        InputQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InputQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        InputQuantityLabel.setText("Input Quantity:");
        InputQuantityLabel.setToolTipText("");
        InputQuantityLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MoneyPanel.add(InputQuantityLabel);
        MoneyPanel.add(MoneyQuantityField);

        InputQuantityButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InputQuantityButton.setText("ADD QUANTITY");
        MoneyPanel.add(InputQuantityButton);

        SummaryTransactionButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SummaryTransactionButton.setText("Summary Transaction");

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(AdminBackButton)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2))
                                    .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RestockLabel)
                                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(RestockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(RestockField))))
                                        .addGap(18, 18, 18)
                                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SetPriceLabel)
                                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(SetPriceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(SetPriceField))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(36, 36, 36))
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MoneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(155, Short.MAX_VALUE))))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CollectPaymentButton)
                        .addGap(18, 18, 18)
                        .addComponent(SummaryTransactionButton)
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaintenanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminPanelLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(738, Short.MAX_VALUE)))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MaintenanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(RestockLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RestockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RestockButton))
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(SetPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SetPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SetPriceButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CollectPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SummaryTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AdminPanelLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout AdminFrameLayout = new javax.swing.GroupLayout(AdminFrame.getContentPane());
        AdminFrame.getContentPane().setLayout(AdminFrameLayout);
        AdminFrameLayout.setHorizontalGroup(
            AdminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        AdminFrameLayout.setVerticalGroup(
            AdminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        CustomItemMenu.setPreferredSize(new java.awt.Dimension(680, 620));
        CustomItemMenu.setResizable(false);
        CustomItemMenu.setSize(new java.awt.Dimension(680, 620));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        MaintenanceLabel1.setBackground(new java.awt.Color(255, 204, 102));
        MaintenanceLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        MaintenanceLabel1.setForeground(new java.awt.Color(255, 102, 255));
        MaintenanceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaintenanceLabel1.setText("Create your own Milktea!");
        MaintenanceLabel1.setAlignmentY(0.0F);
        MaintenanceLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MaintenanceLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MaintenanceLabel1.setMaximumSize(new java.awt.Dimension(50, 34));
        MaintenanceLabel1.setMinimumSize(new java.awt.Dimension(50, 34));
        MaintenanceLabel1.setName(""); // NOI18N
        MaintenanceLabel1.setOpaque(true);
        MaintenanceLabel1.setPreferredSize(new java.awt.Dimension(50, 34));

        MilkteaFlavor.setBackground(new java.awt.Color(255, 204, 102));
        MilkteaFlavor.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MilkteaFlavor.setForeground(new java.awt.Color(255, 102, 204));
        MilkteaFlavor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MilkteaFlavor.setText("Select your Milktea Flavor:");
        MilkteaFlavor.setOpaque(true);

        MilkteaFlavor1.setBackground(new java.awt.Color(255, 204, 102));
        MilkteaFlavor1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MilkteaFlavor1.setForeground(new java.awt.Color(255, 102, 204));
        MilkteaFlavor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MilkteaFlavor1.setText("Select your Sinkers:");
        MilkteaFlavor1.setOpaque(true);

        MilkteaFlavor2.setBackground(new java.awt.Color(255, 204, 102));
        MilkteaFlavor2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MilkteaFlavor2.setForeground(new java.awt.Color(255, 102, 204));
        MilkteaFlavor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MilkteaFlavor2.setText("Select your Sugar Level: ");
        MilkteaFlavor2.setOpaque(true);

        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        CookiesCream.setBackground(new java.awt.Color(204, 255, 255));
        MilkTeaFlavorGroup.add(CookiesCream);
        CookiesCream.setText("Cookies and Cream");
        jPanel3.add(CookiesCream);

        WinterMelon.setBackground(new java.awt.Color(204, 255, 255));
        MilkTeaFlavorGroup.add(WinterMelon);
        WinterMelon.setText("Wintermelon");
        jPanel3.add(WinterMelon);

        ClassicFlavor.setBackground(new java.awt.Color(204, 255, 255));
        MilkTeaFlavorGroup.add(ClassicFlavor);
        ClassicFlavor.setText("Classic Flavor");
        jPanel3.add(ClassicFlavor);

        MilkteaFlavorStockLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MilkteaFlavorStockLabel.setText("IN STOCK: ");
        jPanel3.add(MilkteaFlavorStockLabel);

        jPanel4.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        Sugar100.setBackground(new java.awt.Color(204, 255, 255));
        SugarLevelButtonGroup.add(Sugar100);
        Sugar100.setText("100%");
        jPanel4.add(Sugar100);

        Sugar75.setBackground(new java.awt.Color(204, 255, 255));
        SugarLevelButtonGroup.add(Sugar75);
        Sugar75.setText("75%");
        jPanel4.add(Sugar75);

        Sugar50.setBackground(new java.awt.Color(204, 255, 255));
        SugarLevelButtonGroup.add(Sugar50);
        Sugar50.setText("50%");
        jPanel4.add(Sugar50);

        Sugar25.setBackground(new java.awt.Color(204, 255, 255));
        SugarLevelButtonGroup.add(Sugar25);
        Sugar25.setText("25%");
        jPanel4.add(Sugar25);

        Sugar0.setBackground(new java.awt.Color(204, 255, 255));
        SugarLevelButtonGroup.add(Sugar0);
        Sugar0.setText("0%");
        jPanel4.add(Sugar0);

        SugarLevelStockLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SugarLevelStockLabel.setText("IN STOCK: ");
        jPanel4.add(SugarLevelStockLabel);

        CustomItemMenuExitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomItemMenuExitButton.setText("Exit Menu");

        CreateMilkteaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateMilkteaButton.setText("Create Milktea");

        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        NataDeCoco.setBackground(new java.awt.Color(204, 255, 255));
        SinkerButtonGroup.add(NataDeCoco);
        NataDeCoco.setText("Nata De Coco");
        jPanel5.add(NataDeCoco);

        TapiocaPearl.setBackground(new java.awt.Color(204, 255, 255));
        SinkerButtonGroup.add(TapiocaPearl);
        TapiocaPearl.setText("Tapioca Pearl");
        jPanel5.add(TapiocaPearl);

        SinkerStockLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SinkerStockLabel.setText("IN STOCK:");
        jPanel5.add(SinkerStockLabel);

        MilkTeaQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        MilkTeaQuantity.setAlignmentX(0.0F);
        MilkTeaQuantity.setAlignmentY(0.0F);
        MilkTeaQuantity.setEditor(new JSpinner.DefaultEditor(MilkTeaQuantity));
        MilkTeaQuantity.setMaximumSize(new java.awt.Dimension(64, 22));

        MilkTeaQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MilkTeaQuantityLabel.setText("QUANTITY:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MaintenanceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MilkteaFlavor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MilkteaFlavor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(MilkteaFlavor2)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomItemMenuExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CreateMilkteaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MilkTeaQuantityLabel)
                                .addGap(15, 15, 15)
                                .addComponent(MilkTeaQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MaintenanceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MilkteaFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MilkteaFlavor2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomItemMenuExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(MilkteaFlavor1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CreateMilkteaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MilkTeaQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MilkTeaQuantityLabel))))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout CustomItemMenuLayout = new javax.swing.GroupLayout(CustomItemMenu.getContentPane());
        CustomItemMenu.getContentPane().setLayout(CustomItemMenuLayout);
        CustomItemMenuLayout.setHorizontalGroup(
            CustomItemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomItemMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        CustomItemMenuLayout.setVerticalGroup(
            CustomItemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomItemMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vending Machine MCO2");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(927, 651));

        BigMachinePanel.setBackground(new java.awt.Color(204, 204, 204));
        BigMachinePanel.setMaximumSize(new java.awt.Dimension(1000, 1000));

        VendingMachineName.setBackground(new java.awt.Color(255, 204, 102));
        VendingMachineName.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        VendingMachineName.setForeground(new java.awt.Color(255, 102, 255));
        VendingMachineName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VendingMachineName.setText("Vending Machine Name Here");
        VendingMachineName.setAlignmentY(0.0F);
        VendingMachineName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VendingMachineName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VendingMachineName.setMaximumSize(new java.awt.Dimension(50, 34));
        VendingMachineName.setMinimumSize(new java.awt.Dimension(50, 34));
        VendingMachineName.setName(""); // NOI18N
        VendingMachineName.setOpaque(true);
        VendingMachineName.setPreferredSize(new java.awt.Dimension(50, 34));

        InputPanel.setBackground(new java.awt.Color(255, 255, 255));

        ClearButton.setText("CLEAR");

        InsertMoneyButton.setText("Insert Money");

        MachineButtonPanel.setBackground(new java.awt.Color(204, 255, 255));

        jButtonCreate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate1.setText("1");

        jButtonCreate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate2.setText("2");

        jButtonCreate3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate3.setText("3");

        jButtonCreate4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate4.setText("4");

        jButtonCreate5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate5.setText("5");

        jButtonCreate6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate6.setText("6");

        jButtonCreate7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate7.setText("7");

        jButtonCreate8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate8.setText("8");

        jButtonCreate9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate9.setText("9");

        jButtonCreate0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreate0.setText("0");

        javax.swing.GroupLayout MachineButtonPanelLayout = new javax.swing.GroupLayout(MachineButtonPanel);
        MachineButtonPanel.setLayout(MachineButtonPanelLayout);
        MachineButtonPanelLayout.setHorizontalGroup(
            MachineButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MachineButtonPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MachineButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MachineButtonPanelLayout.createSequentialGroup()
                        .addComponent(jButtonCreate1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate4)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate5))
                    .addGroup(MachineButtonPanelLayout.createSequentialGroup()
                        .addComponent(jButtonCreate6)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate7)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate8)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate9)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCreate0)))
                .addGap(20, 20, 20))
        );
        MachineButtonPanelLayout.setVerticalGroup(
            MachineButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MachineButtonPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MachineButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate5)
                    .addComponent(jButtonCreate4)
                    .addComponent(jButtonCreate3)
                    .addComponent(jButtonCreate2)
                    .addComponent(jButtonCreate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MachineButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate6)
                    .addComponent(jButtonCreate7)
                    .addComponent(jButtonCreate0)
                    .addComponent(jButtonCreate8)
                    .addComponent(jButtonCreate9))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsertMoneyButton))
                    .addComponent(MachineButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MachineButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButton)
                    .addComponent(InsertMoneyButton))
                .addGap(20, 20, 20))
        );

        LayoutPanel.setMaximumSize(new java.awt.Dimension(526, 486));
        LayoutPanel.setMinimumSize(new java.awt.Dimension(526, 486));

        AdminSettingsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminSettingsButton.setText("ADMIN SETTINGS");

        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExitButton.setText("EXIT MACHINE");

        MachineBalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MachineBalLabel.setText("MACHINE BALANCE: 0");

        PersonBalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PersonBalLabel.setText("BALANCE: 0");

        DispenseButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DispenseButton.setText("DISPENSE");

        BuyItemPanel.setBackground(new java.awt.Color(204, 204, 204));
        BuyItemPanel.setMaximumSize(new java.awt.Dimension(481, 349));
        BuyItemPanel.setLayout(new java.awt.GridLayout(6, 4, 15, 5));

        Item1Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item1Label.setText(" ITEM 1");
        Item1Label.setAlignmentX(5.0F);
        Item1Label.setAlignmentY(5.0F);
        Item1Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Item1Label);

        Item2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item2Label.setText(" ITEM 2");
        Item2Label.setAlignmentY(0.0F);
        Item2Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BuyItemPanel.add(Item2Label);

        Item3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item3Label.setText(" ITEM 3");
        Item3Label.setAlignmentY(0.0F);
        Item3Label.setAutoscrolls(true);
        Item3Label.setFocusable(false);
        Item3Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Item3Label.setVerifyInputWhenFocusTarget(false);
        BuyItemPanel.add(Item3Label);

        Item4Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item4Label.setText(" ITEM 4");
        Item4Label.setAlignmentY(0.0F);
        Item4Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BuyItemPanel.add(Item4Label);

        Item1Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item1Buy.setText("BUY");
        BuyItemPanel.add(Item1Buy);

        Item2Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item2Buy.setText("BUY");
        BuyItemPanel.add(Item2Buy);

        Item3Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item3Buy.setText("BUY");
        BuyItemPanel.add(Item3Buy);

        Item4Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item4Buy.setText("BUY");
        BuyItemPanel.add(Item4Buy);

        Item5Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item5Label.setText(" ITEM 5");
        Item5Label.setAlignmentY(0.0F);
        Item5Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Item5Label);

        Item6Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item6Label.setText(" ITEM 6 ");
        Item6Label.setAlignmentY(0.0F);
        Item6Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Item6Label);

        Item7Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item7Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item7Label.setText(" ITEM 7");
        Item7Label.setAlignmentY(0.0F);
        Item7Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Item7Label);

        Item8Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item8Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item8Label.setText(" ITEM 8");
        Item8Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Item8Label);

        Item5Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item5Buy.setText("BUY");
        BuyItemPanel.add(Item5Buy);

        Item6Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item6Buy.setText("BUY");
        BuyItemPanel.add(Item6Buy);

        Item7Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item7Buy.setText("BUY");
        BuyItemPanel.add(Item7Buy);

        Item8Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item8Buy.setText("BUY");
        BuyItemPanel.add(Item8Buy);

        CustomItemLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CustomItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomItemLabel.setText("CUSTOM ITEM");
        CustomItemLabel.setEnabled(false);
        CustomItemLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(CustomItemLabel);

        Ing1Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ing1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ing1Label.setText("ING 1");
        Ing1Label.setEnabled(false);
        Ing1Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Ing1Label);

        Ing2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ing2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ing2Label.setText("ING 2");
        Ing2Label.setEnabled(false);
        Ing2Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Ing2Label);

        Ing3Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ing3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ing3Label.setText("ING 3");
        Ing3Label.setEnabled(false);
        Ing3Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyItemPanel.add(Ing3Label);

        CustomItemBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomItemBuy.setText("BUY");
        CustomItemBuy.setEnabled(false);
        BuyItemPanel.add(CustomItemBuy);

        Ing1Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ing1Buy.setText("BUY");
        Ing1Buy.setEnabled(false);
        BuyItemPanel.add(Ing1Buy);

        Ing2Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ing2Buy.setText("BUY");
        Ing2Buy.setEnabled(false);
        BuyItemPanel.add(Ing2Buy);

        Ing3Buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ing3Buy.setText("BUY");
        Ing3Buy.setEnabled(false);
        BuyItemPanel.add(Ing3Buy);

        javax.swing.GroupLayout LayoutPanelLayout = new javax.swing.GroupLayout(LayoutPanel);
        LayoutPanel.setLayout(LayoutPanelLayout);
        LayoutPanelLayout.setHorizontalGroup(
            LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayoutPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LayoutPanelLayout.createSequentialGroup()
                        .addGroup(LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuyItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LayoutPanelLayout.createSequentialGroup()
                                .addComponent(AdminSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(ExitButton)
                                .addGap(15, 15, 15)
                                .addComponent(DispenseButton)))
                        .addGap(23, 23, 23))
                    .addGroup(LayoutPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(MachineBalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PersonBalLabel)
                        .addGap(120, 120, 120))))
        );
        LayoutPanelLayout.setVerticalGroup(
            LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayoutPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BuyItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DispenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(LayoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MachineBalLabel)
                    .addComponent(PersonBalLabel))
                .addGap(46, 46, 46))
        );

        NumPadDisplay.setEditable(false);
        NumPadDisplay.setBackground(new java.awt.Color(255, 255, 204));
        NumPadDisplay.setColumns(20);
        NumPadDisplay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NumPadDisplay.setLineWrap(true);
        NumPadDisplay.setRows(6);
        NumPadDisplay.setWrapStyleWord(true);
        NumPadDisplay.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(NumPadDisplay);

        MachinePrintDisplay.setEditable(false);
        MachinePrintDisplay.setBackground(new java.awt.Color(204, 255, 204));
        MachinePrintDisplay.setColumns(10);
        MachinePrintDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MachinePrintDisplay.setLineWrap(true);
        MachinePrintDisplay.setRows(6);
        MachinePrintDisplay.setWrapStyleWord(true);
        MachinePrintDisplay.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(MachinePrintDisplay);

        InputLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InputLabel.setText("INPUT USER BALANCE:");
        InputLabel.setAlignmentY(0.0F);
        InputLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        QuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuantityLabel.setText("QUANTITY:");
        QuantityLabel.setAlignmentY(0.0F);
        QuantityLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SpinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        SpinnerQuantity.setAlignmentX(0.0F);
        SpinnerQuantity.setAlignmentY(0.0F);
        SpinnerQuantity.setEditor(new JSpinner.DefaultEditor(SpinnerQuantity));
        SpinnerQuantity.setMaximumSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout BigMachinePanelLayout = new javax.swing.GroupLayout(BigMachinePanel);
        BigMachinePanel.setLayout(BigMachinePanelLayout);
        BigMachinePanelLayout.setHorizontalGroup(
            BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BigMachinePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VendingMachineName, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BigMachinePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BigMachinePanelLayout.createSequentialGroup()
                        .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinnerQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addGap(25, 25, 25))
        );
        BigMachinePanelLayout.setVerticalGroup(
            BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BigMachinePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BigMachinePanelLayout.createSequentialGroup()
                        .addComponent(VendingMachineName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(LayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BigMachinePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BigMachinePanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(InputLabel)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BigMachinePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuantityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(BigMachinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        VendingMachineName.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BigMachinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BigMachinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
 * Gets the ButtonGroup for selecting items.
 *
 * @return The ButtonGroup representing item selection.
 */
public ButtonGroup getItemButtonGroup() {
    return this.ItemButtonGroup;
}

/**
 * Gets the ButtonGroup for selecting money options.
 *
 * @return The ButtonGroup representing money selection.
 */
public ButtonGroup getMoneyButtonGroup() {
    return this.MoneyButtonGroup;
}

/**
 * Gets the ButtonGroup for selecting milk tea flavors.
 *
 * @return The ButtonGroup representing milk tea flavor selection.
 */
public ButtonGroup getMilkTeaFlavorGroup() {
    return this.MilkTeaFlavorGroup;
}

/**
 * Gets the ButtonGroup for selecting sugar levels.
 *
 * @return The ButtonGroup representing sugar level selection.
 */
public ButtonGroup getSugarLevelButtonGroup() {
    return this.SugarLevelButtonGroup;
}

/**
 * Gets the ButtonGroup for selecting sinker options.
 *
 * @return The ButtonGroup representing sinker selection.
 */
public ButtonGroup getSinkerButtonGroup() {
    return this.SinkerButtonGroup;
}
    
    /**
 * Sets an ActionListener for jRadioButton1.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton1.
 */
public void setjRadioButton1Listener(ActionListener actionlistener) {
    this.jRadioButton1.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton2.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton2.
 */
public void setjRadioButton2Listener(ActionListener actionlistener) {
    this.jRadioButton2.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton3.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton3.
 */
public void setjRadioButton3Listener(ActionListener actionlistener) {
    this.jRadioButton3.addActionListener(actionlistener);
}
    
    /**
 * Sets an ActionListener for jRadioButton4.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton4.
 */
public void setjRadioButton4Listener(ActionListener actionlistener) {
    this.jRadioButton4.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton5.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton5.
 */
public void setjRadioButton5Listener(ActionListener actionlistener) {
    this.jRadioButton5.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton6.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton6.
 */
public void setjRadioButton6Listener(ActionListener actionlistener) {
    this.jRadioButton6.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton7.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton7.
 */
public void setjRadioButton7Listener(ActionListener actionlistener) {
    this.jRadioButton7.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton8.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton8.
 */
public void setjRadioButton8Listener(ActionListener actionlistener) {
    this.jRadioButton8.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton9.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton9.
 */
public void setjRadioButton9Listener(ActionListener actionlistener) {
    this.jRadioButton9.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton10.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton10.
 */
public void setjRadioButton10Listener(ActionListener actionlistener) {
    this.jRadioButton10.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton11.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton11.
 */
public void setjRadioButton11Listener(ActionListener actionlistener) {
    this.jRadioButton11.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton12.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton12.
 */
public void setjRadioButton12Listener(ActionListener actionlistener) {
    this.jRadioButton12.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton13.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton13.
 */
public void setjRadioButton13Listener(ActionListener actionlistener) {
    this.jRadioButton13.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton14.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton14.
 */
public void setjRadioButton14Listener(ActionListener actionlistener) {
    this.jRadioButton14.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton15.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton15.
 */
public void setjRadioButton15Listener(ActionListener actionlistener) {
    this.jRadioButton15.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton16.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton16.
 */
public void setjRadioButton16Listener(ActionListener actionlistener) {
    this.jRadioButton16.addActionListener(actionlistener);
}

    
    /**
 * Sets an ActionListener for jRadioButton17.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton17.
 */
public void setjRadioButton17Listener(ActionListener actionlistener) {
    this.jRadioButton7.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton18.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton18.
 */
public void setjRadioButton18Listener(ActionListener actionlistener) {
    this.jRadioButton8.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton19.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton19.
 */
public void setjRadioButton19Listener(ActionListener actionlistener) {
    this.jRadioButton9.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton20.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton20.
 */
public void setjRadioButton20Listener(ActionListener actionlistener) {
    this.jRadioButton10.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton21.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton21.
 */
public void setjRadioButton21Listener(ActionListener actionlistener) {
    this.jRadioButton11.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton22.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton22.
 */
public void setjRadioButton22Listener(ActionListener actionlistener) {
    this.jRadioButton12.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton23.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton23.
 */
public void setjRadioButton23Listener(ActionListener actionlistener) {
    this.jRadioButton13.addActionListener(actionlistener);
}

/**
 * Sets an ActionListener for jRadioButton24.
 *
 * @param actionlistener The ActionListener to be set for jRadioButton24.
 */
public void setjRadioButton24Listener(ActionListener actionlistener) {
    this.jRadioButton14.addActionListener(actionlistener);
}

    
    /**
 * Gets the JRadioButton jRadioButton1.
 *
 * @return The JRadioButton jRadioButton1.
 */
public JRadioButton getjRadioButton1() {
    return this.jRadioButton1;
}

/**
 * Gets the JRadioButton jRadioButton2.
 *
 * @return The JRadioButton jRadioButton2.
 */
public JRadioButton getjRadioButton2() {
    return this.jRadioButton2;
}

/**
 * Gets the JRadioButton jRadioButton3.
 *
 * @return The JRadioButton jRadioButton3.
 */
public JRadioButton getjRadioButton3() {
    return this.jRadioButton3;
}

/**
 * Gets the JRadioButton jRadioButton4.
 *
 * @return The JRadioButton jRadioButton4.
 */
public JRadioButton getjRadioButton4() {
    return this.jRadioButton4;
}

/**
 * Gets the JRadioButton jRadioButton5.
 *
 * @return The JRadioButton jRadioButton5.
 */
public JRadioButton getjRadioButton5() {
    return this.jRadioButton5;
}

/**
 * Gets the JRadioButton jRadioButton6.
 *
 * @return The JRadioButton jRadioButton6.
 */
public JRadioButton getjRadioButton6() {
    return this.jRadioButton6;
}

/**
 * Gets the JRadioButton jRadioButton7.
 *
 * @return The JRadioButton jRadioButton7.
 */
public JRadioButton getjRadioButton7() {
    return this.jRadioButton7;
}

/**
 * Gets the JRadioButton jRadioButton8.
 *
 * @return The JRadioButton jRadioButton8.
 */
public JRadioButton getjRadioButton8() {
    return this.jRadioButton8;
}

/**
 * Gets the JRadioButton jRadioButton9.
 *
 * @return The JRadioButton jRadioButton9.
 */
public JRadioButton getjRadioButton9() {
    return this.jRadioButton9;
}

/**
 * Gets the JRadioButton jRadioButton10.
 *
 * @return The JRadioButton jRadioButton10.
 */
public JRadioButton getjRadioButton10() {
    return this.jRadioButton10;
}

/**
 * Gets the JRadioButton jRadioButton11.
 *
 * @return The JRadioButton jRadioButton11.
 */
public JRadioButton getjRadioButton11() {
    return this.jRadioButton11;
}

/**
 * Gets the JRadioButton jRadioButton12.
 *
 * @return The JRadioButton jRadioButton12.
 */
public JRadioButton getjRadioButton12() {
    return this.jRadioButton12;
}

/**
 * Gets the JRadioButton jRadioButton13.
 *
 * @return The JRadioButton jRadioButton13.
 */
public JRadioButton getjRadioButton13() {
    return this.jRadioButton13;
}

/**
 * Gets the JRadioButton jRadioButton14.
 *
 * @return The JRadioButton jRadioButton14.
 */
public JRadioButton getjRadioButton14() {
    return this.jRadioButton14;
}

/**
 * Gets the JRadioButton jRadioButton15.
 *
 * @return The JRadioButton jRadioButton15.
 */
public JRadioButton getjRadioButton15() {
    return this.jRadioButton15;
}

/**
 * Gets the JRadioButton jRadioButton16.
 *
 * @return The JRadioButton jRadioButton16.
 */
public JRadioButton getjRadioButton16() {
    return this.jRadioButton16;
}

/**
 * Gets the JRadioButton jRadioButton17.
 *
 * @return The JRadioButton jRadioButton17.
 */
public JRadioButton getjRadioButton17() {
    return this.jRadioButton17;
}

/**
 * Gets the JRadioButton jRadioButton18.
 *
 * @return The JRadioButton jRadioButton18.
 */
public JRadioButton getjRadioButton18() {
    return this.jRadioButton18;
}

/**
 * Gets the JRadioButton jRadioButton19.
 *
 * @return The JRadioButton jRadioButton19.
 */
public JRadioButton getjRadioButton19() {
    return this.jRadioButton19;
}

/**
 * Gets the JRadioButton jRadioButton20.
 *
 * @return The JRadioButton jRadioButton20.
 */
public JRadioButton getjRadioButton20() {
    return this.jRadioButton20;
}

/**
 * Gets the JRadioButton jRadioButton21.
 *
 * @return The JRadioButton jRadioButton21.
 */
public JRadioButton getjRadioButton21() {
    return this.jRadioButton21;
}

/**
 * Gets the JRadioButton jRadioButton22.
 *
 * @return The JRadioButton jRadioButton22.
 */
public JRadioButton getjRadioButton22() {
    return this.jRadioButton22;
}

/**
 * Gets the JRadioButton jRadioButton23.
 *
 * @return The JRadioButton jRadioButton23.
 */
public JRadioButton getjRadioButton23() {
    return this.jRadioButton23;
}

/**
 * Gets the JRadioButton jRadioButton24.
 *
 * @return The JRadioButton jRadioButton24.
 */
public JRadioButton getjRadioButton24() {
    return this.jRadioButton24;
}

    
    /**
 * Gets the JTextField MoneyQuantityField used for inputting money quantity.
 *
 * @return The MoneyQuantityField for money input.
 */
public JTextField getMoneyQuantityField() {
    return this.MoneyQuantityField;
}

/**
 * Sets the visibility of the AdminFrame.
 *
 * @param value True to make the AdminFrame visible, false to hide it.
 */
public void setAdminFrameVisibility(boolean value) {
    this.AdminFrame.setVisible(value);
}

/**
 * Gets the JFrame CustomItemMenu used for custom item display.
 *
 * @return The CustomItemMenu JFrame.
 */
public JFrame getCustomItemMenu() {
    return this.CustomItemMenu;
}

/**
 * Gets the JTextArea MachinePrintDisplay used for displaying machine print.
 *
 * @return The MachinePrintDisplay JTextArea.
 */
public JTextArea getMachinePrintDisplay() {
    return this.MachinePrintDisplay;
}

/**
 * Disposes the AdminFrame, closing it.
 */
public void disposeAdminFrame() {
    this.AdminFrame.dispose();
}

/**
 * Sets the text of the MachinePrintDisplay.
 *
 * @param text The text to set in the MachinePrintDisplay.
 */
public void setMachinePrintDisplayText(String text) {
    this.MachinePrintDisplay.setText(text);
}

/**
 * Gets the text from the MachinePrintDisplay.
 *
 * @return The text currently displayed in the MachinePrintDisplay.
 */
public String getMachinePrintDisplayText() {
    return this.MachinePrintDisplay.getText();
}

/**
 * Sets the text of the PersonBalLabel.
 *
 * @param text The text to set in the PersonBalLabel.
 */
public void setPersonBalLabelText(String text) {
    this.PersonBalLabel.setText(text);
}

/**
 * Sets the text of the VendingMachineName label.
 *
 * @param text The text to set in the VendingMachineName label.
 */
public void setmachineLabel(String text) {
    this.VendingMachineName.setText(text);
}

/**
 * Sets the status (enabled or disabled) of the CustomItemLabel.
 *
 * @param value True to enable the CustomItemLabel, false to disable it.
 */
public void setcustomItemLabelStatus(boolean value) {
    CustomItemLabel.setEnabled(value);
}
    
    /**
 * Sets the status (enabled or disabled) of the CustomItemBuy button.
 *
 * @param value True to enable the CustomItemBuy button, false to disable it.
 */
public void setcustomItemBuyStatus(boolean value) {
    CustomItemBuy.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing1Label.
 *
 * @param value True to enable the Ing1Label, false to disable it.
 */
public void setIng1LabelStatus(boolean value) {
    Ing1Label.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing1Buy button.
 *
 * @param value True to enable the Ing1Buy button, false to disable it.
 */
public void setIng1BuyStatus(boolean value) {
    Ing1Buy.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing2Label.
 *
 * @param value True to enable the Ing2Label, false to disable it.
 */
public void setIng2LabelStatus(boolean value) {
    Ing2Label.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing2Buy button.
 *
 * @param value True to enable the Ing2Buy button, false to disable it.
 */
public void setIng2BuyStatus(boolean value) {
    Ing2Buy.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing3Label.
 *
 * @param value True to enable the Ing3Label, false to disable it.
 */
public void setIng3LabelStatus(boolean value) {
    Ing3Label.setEnabled(value);
}

/**
 * Sets the status (enabled or disabled) of the Ing3Buy button.
 *
 * @param value True to enable the Ing3Buy button, false to disable it.
 */
public void setIng3BuyStatus(boolean value) {
    Ing3Buy.setEnabled(value);
}

/**
 * Sets the text of the NumPadDisplay.
 *
 * @param text The text to set in the NumPadDisplay.
 */
public void setNumPadDisplayText(String text) {
    NumPadDisplay.setText(text);
}

/**
 * Gets the text from the NumPadDisplay.
 *
 * @return The text currently displayed in the NumPadDisplay.
 */
public String getNumPadDisplayText() {
    return this.NumPadDisplay.getText();
}

/**
 * Gets the selected quantity from the SpinnerQuantity.
 *
 * @return The selected quantity from the SpinnerQuantity.
 */
public int getSpinnerQuantity() {
    return ((Integer) this.SpinnerQuantity.getValue());
}

/**
 * Sets the quantity value of the SpinnerQuantity.
 *
 * @param quantity The quantity value to set in the SpinnerQuantity.
 */
public void setSpinnerQuantity(int quantity) {
    this.SpinnerQuantity.setValue(quantity);
}

    
   /**
 * Sets the ActionListener for Item1Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item1Buy button.
 */
public void setItem1BuyActionListener(ActionListener actionlistener) {
    this.Item1Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item2Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item2Buy button.
 */
public void setItem2BuyActionListener(ActionListener actionlistener) {
    this.Item2Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item3Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item3Buy button.
 */
public void setItem3BuyActionListener(ActionListener actionlistener) {
    this.Item3Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item4Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item4Buy button.
 */
public void setItem4BuyActionListener(ActionListener actionlistener) {
    this.Item4Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item5Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item5Buy button.
 */
public void setItem5BuyActionListener(ActionListener actionlistener) {
    this.Item5Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item6Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item6Buy button.
 */
public void setItem6BuyActionListener(ActionListener actionlistener) {
    this.Item6Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item7Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item7Buy button.
 */
public void setItem7BuyActionListener(ActionListener actionlistener) {
    this.Item7Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Item8Buy button.
 *
 * @param actionlistener The ActionListener to be set for Item8Buy button.
 */
public void setItem8BuyActionListener(ActionListener actionlistener) {
    this.Item8Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for CustomItemBuy button.
 *
 * @param actionlistener The ActionListener to be set for CustomItemBuy button.
 */
public void setCustomItemBuyActionListener(ActionListener actionlistener) {
    this.CustomItemBuy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Ing1Buy button.
 *
 * @param actionlistener The ActionListener to be set for Ing1Buy button.
 */
public void setIng1BuyActionListener(ActionListener actionlistener) {
    this.Ing1Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Ing2Buy button.
 *
 * @param actionlistener The ActionListener to be set for Ing2Buy button.
 */
public void setIng2BuyActionListener(ActionListener actionlistener) {
    this.Ing2Buy.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for Ing3Buy button.
 *
 * @param actionlistener The ActionListener to be set for Ing3Buy button.
 */
public void setIng3BuyActionListener(ActionListener actionlistener) {
    this.Ing3Buy.addActionListener(actionlistener);
}

/**
 * Sets the text of Item1Label.
 *
 * @param text The text to set in Item1Label.
 */
public void setItem1Label(String text) {
    this.Item1Label.setText(text);
}

/**
 * Sets the text of Item2Label.
 *
 * @param text The text to set in Item2Label.
 */
public void setItem2Label(String text) {
    this.Item2Label.setText(text);
}

/**
 * Sets the text of Item3Label.
 *
 * @param text The text to set in Item3Label.
 */
public void setItem3Label(String text) {
    this.Item3Label.setText(text);
}

/**
 * Sets the text of Item4Label.
 *
 * @param text The text to set in Item4Label.
 */
public void setItem4Label(String text) {
    this.Item4Label.setText(text);
}

/**
 * Sets the text of Item5Label.
 *
 * @param text The text to set in Item5Label.
 */
public void setItem5Label(String text) {
    this.Item5Label.setText(text);
}

/**
 * Sets the text of Item6Label.
 *
 * @param text The text to set in Item6Label.
 */
public void setItem6Label(String text) {
    this.Item6Label.setText(text);
}

/**
 * Sets the text of Item7Label.
 *
 * @param text The text to set in Item7Label.
 */
public void setItem7Label(String text) {
    this.Item7Label.setText(text);
}

/**
 * Sets the text of Item8Label.
 *
 * @param text The text to set in Item8Label.
 */
public void setItem8Label(String text) {
    this.Item8Label.setText(text);
}  
    /**
 * Sets the text of the CustomItemLabel.
 *
 * @param text The text to set in the CustomItemLabel.
 */
public void setCustomItemLabel(String text) {
    this.CustomItemLabel.setText(text);
}

/**
 * Sets the text of the Ing1Label.
 *
 * @param text The text to set in the Ing1Label.
 */
public void setIng1Label(String text) {
    this.Ing1Label.setText(text);
}

/**
 * Sets the text of the Ing2Label.
 *
 * @param text The text to set in the Ing2Label.
 */
public void setIng2Label(String text) {
    this.Ing2Label.setText(text);
}

/**
 * Sets the text of the Ing3Label.
 *
 * @param text The text to set in the Ing3Label.
 */
public void setIng3Label(String text) {
    this.Ing3Label.setText(text);
}

/**
 * Sets the ActionListener for the ButtonCreate0 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate0 button.
 */
public void setButtonCreate0ActionListener(ActionListener actionlistener) {
    this.jButtonCreate0.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate1 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate1 button.
 */
public void setButtonCreate1ActionListener(ActionListener actionlistener) {
    this.jButtonCreate1.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate2 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate2 button.
 */
public void setButtonCreate2ActionListener(ActionListener actionlistener) {
    this.jButtonCreate2.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate3 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate3 button.
 */
public void setButtonCreate3ActionListener(ActionListener actionlistener) {
    this.jButtonCreate3.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate4 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate4 button.
 */
public void setButtonCreate4ActionListener(ActionListener actionlistener) {
    this.jButtonCreate4.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate5 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate5 button.
 */
public void setButtonCreate5ActionListener(ActionListener actionlistener) {
    this.jButtonCreate5.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate6 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate6 button.
 */
public void setButtonCreate6ActionListener(ActionListener actionlistener) {
    this.jButtonCreate6.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate7 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate7 button.
 */
public void setButtonCreate7ActionListener(ActionListener actionlistener) {
    this.jButtonCreate7.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate8 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate8 button.
 */
public void setButtonCreate8ActionListener(ActionListener actionlistener) {
    this.jButtonCreate8.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the ButtonCreate9 button.
 *
 * @param actionlistener The ActionListener to be set for ButtonCreate9 button.
 */
public void setButtonCreate9ActionListener(ActionListener actionlistener) {
    this.jButtonCreate9.addActionListener(actionlistener);
}
    
    /**
 * Sets the ActionListener for the ClearButton.
 *
 * @param actionlistener The ActionListener to be set for the ClearButton.
 */
public void setClearButtonListener(ActionListener actionlistener) {
    this.ClearButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the AdminSettingsButton.
 *
 * @param actionlistener The ActionListener to be set for the AdminSettingsButton.
 */
public void setAdminSettingsButtonListener(ActionListener actionlistener) {
    this.AdminSettingsButton.addActionListener(actionlistener);
}

/**
 * Sets the text of MachineBalLabel to display the machine balance.
 *
 * @param text The text to set in MachineBalLabel to display the machine balance.
 */
public void setMachineBalance(String text) {
    MachineBalLabel.setText(text);
}

/**
 * Sets the ActionListener for the ExitButton.
 *
 * @param listener The ActionListener to be set for the ExitButton.
 */
public void setExitButtonActionListener(ActionListener listener) {
    this.ExitButton.addActionListener(listener);
}

/**
 * Sets the ActionListener for the RestockButton.
 *
 * @param actionlistener The ActionListener to be set for the RestockButton.
 */
public void setRestockButtonListener(ActionListener actionlistener) {
    this.RestockButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the SetPriceButton.
 *
 * @param actionlistener The ActionListener to be set for the SetPriceButton.
 */
public void setSetPriceButtonListener(ActionListener actionlistener) {
    this.SetPriceButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the AdminBackButton.
 *
 * @param actionlistener The ActionListener to be set for the AdminBackButton.
 */
public void setAdminBackButtonListener(ActionListener actionlistener) {
    this.AdminBackButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the CollectPaymentButton.
 *
 * @param actionlistener The ActionListener to be set for the CollectPaymentButton.
 */
public void setCollectPaymentButtonListener(ActionListener actionlistener) {
    this.CollectPaymentButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the SummaryTransactionButton.
 *
 * @param actionlistener The ActionListener to be set for the SummaryTransactionButton.
 */
public void setSummaryTransactionButtonListener(ActionListener actionlistener) {
    this.SummaryTransactionButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the InputQuantityButton.
 *
 * @param actionlistener The ActionListener to be set for the InputQuantityButton.
 */
public void setInputQuantityButtonListener(ActionListener actionlistener) {
    this.InputQuantityButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the InsertMoneyButton.
 *
 * @param actionlistener The ActionListener to be set for the InsertMoneyButton.
 */
public void setInsertMoneyButtonListener(ActionListener actionlistener) {
    this.InsertMoneyButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the DispenseButton.
 *
 * @param actionlistener The ActionListener to be set for the DispenseButton.
 */
public void setDispenseButtonActionListener(ActionListener actionlistener) {
    this.DispenseButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the CustomItemMenuExitButton.
 *
 * @param actionlistener The ActionListener to be set for the CustomItemMenuExitButton.
 */
public void setCustomItemMenuExitButtonListener(ActionListener actionlistener) {
    this.CustomItemMenuExitButton.addActionListener(actionlistener);
}

/**
 * Sets the ActionListener for the CreateMilkteaButton.
 *
 * @param actionlistener The ActionListener to be set for the CreateMilkteaButton.
 */
public void setCreateMilkteaButtonListener(ActionListener actionlistener) {
    this.CreateMilkteaButton.addActionListener(actionlistener);
}
    
    /**
 * Returns the JTextField for setting the price of an item.
 *
 * @return The SetPriceField, a JTextField for setting item price.
 */
public JTextField getSetPriceField() {
    return this.SetPriceField;
}

/**
 * Returns the JTextField for restocking an item's quantity.
 *
 * @return The RestockField, a JTextField for restocking item quantity.
 */
public JTextField getRestockField() {
    return this.RestockField;
}

/**
 * Returns the JFrame object representing the admin frame.
 *
 * @return The AdminFrame, a JFrame object representing the admin interface.
 */
public JFrame getAdminFrame() {
    return this.AdminFrame;
}

/**
 * Returns the JTextArea for displaying additional admin information.
 *
 * @return The AdminOtherDisplay, a JTextArea for showing admin information.
 */
public JTextArea getAdminOtherDisplayArea() {
    return this.AdminOtherDisplay;
}

/**
 * Returns the text content of the AdminDisplayArea, an area for displaying admin information.
 *
 * @return The text content of the AdminDisplayArea as a String.
 */
public String getAdminDisplayAreaText() {
    return this.AdminDisplayArea.getText();
}

/**
 * Sets the text content of the AdminDisplayArea, an area for displaying admin information.
 *
 * @param text The text to be set in the AdminDisplayArea.
 */
public void setAdminDisplayAreaText(String text) {
    this.AdminDisplayArea.setText(text);
}

/**
 * Returns the JRadioButton representing the "Cookies and Cream" option.
 *
 * @return The CookiesCream JRadioButton.
 */
public JRadioButton getCookiesCream() {
    return this.CookiesCream;
}

/**
 * Returns the JLabel displaying the stock of milk tea flavors.
 *
 * @return The MilkTeaFlavorStockLabel, a JLabel showing the stock of milk tea flavors.
 */
public JLabel getMilkTeaFlavorStockLabel() {
    return this.MilkteaFlavorStockLabel;
}

/**
 * Returns the JLabel displaying the stock of sugar levels.
 *
 * @return The SugarLevelStockLabel, a JLabel showing the stock of sugar levels.
 */
public JLabel getSugarLevelStockStockLabel() {
    return this.SugarLevelStockLabel;
}

/**
 * Returns the JLabel displaying the stock of sinkers.
 *
 * @return The SinkerStockLabel, a JLabel showing the stock of sinkers.
 */
public JLabel getSinkerStockLabel() {
    return this.SinkerStockLabel;
}

/**
 * Returns the JRadioButton representing the "100% Sugar" option.
 *
 * @return The Sugar100 JRadioButton.
 */
public JRadioButton getSugar100() {
    return this.Sugar100;
}

/**
 * Returns the JRadioButton representing the "75% Sugar" option.
 *
 * @return The Sugar75 JRadioButton.
 */
public JRadioButton getSugar75() {
    return this.Sugar75;
}

/**
 * Returns the JRadioButton representing the "50% Sugar" option.
 *
 * @return The Sugar50 JRadioButton.
 */
public JRadioButton getSugar50() {
    return this.Sugar50;
}

/**
 * Returns the JRadioButton representing the "25% Sugar" option.
 *
 * @return The Sugar25 JRadioButton.
 */
public JRadioButton getSugar25() {
    return this.Sugar25;
}

/**
 * Returns the JRadioButton representing the "0% Sugar" option.
 *
 * @return The Sugar0 JRadioButton.
 */
public JRadioButton getSugar0() {
    return this.Sugar0;
}

/**
 * Returns the JRadioButton representing the "Nata de Coco" option.
 *
 * @return The NataDeCoco JRadioButton.
 */
public JRadioButton getNataDeCoco() {
    return this.NataDeCoco;
}

/**
 * Returns the JRadioButton representing the "Tapioca Pearl" option.
 *
 * @return The TapiocaPearl JRadioButton.
 */
public JRadioButton getTapiocaPearl() {
    return this.TapiocaPearl;
}

/**
 * Returns the JRadioButton representing the "Classic Flavor" option.
 *
 * @return The ClassicFlavor JRadioButton.
 */
public JRadioButton getClassicFlavor() {
    return this.ClassicFlavor;
}

/**
 * Returns the JRadioButton representing the "Winter Melon" option.
 *
 * @return The WinterMelon JRadioButton.
 */
public JRadioButton getWinterMelon() {
    return this.WinterMelon;
}

/**
 * Returns the JSpinner for selecting the quantity of milk tea.
 *
 * @return The MilkTeaQuantity JSpinner for selecting milk tea quantity.
 */
public JSpinner getMilkTeaQuantity() {
    return this.MilkTeaQuantity;
}

}

 
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBackButton;
    private javax.swing.JTextArea AdminDisplayArea;
    private javax.swing.JFrame AdminFrame;
    private javax.swing.JTextArea AdminOtherDisplay;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton AdminSettingsButton;
    private javax.swing.JPanel BigMachinePanel;
    private javax.swing.JPanel BuyItemPanel;
    private javax.swing.JRadioButton ClassicFlavor;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CollectPaymentButton;
    private javax.swing.JRadioButton CookiesCream;
    private javax.swing.JButton CreateMilkteaButton;
    private javax.swing.JButton CustomItemBuy;
    private javax.swing.JLabel CustomItemLabel;
    private javax.swing.JFrame CustomItemMenu;
    private javax.swing.JButton CustomItemMenuExitButton;
    private javax.swing.JButton DispenseButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Ing1Buy;
    private javax.swing.JLabel Ing1Label;
    private javax.swing.JButton Ing2Buy;
    private javax.swing.JLabel Ing2Label;
    private javax.swing.JButton Ing3Buy;
    private javax.swing.JLabel Ing3Label;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JButton InputQuantityButton;
    private javax.swing.JLabel InputQuantityLabel;
    private javax.swing.JButton InsertMoneyButton;
    private javax.swing.JButton Item1Buy;
    private javax.swing.JLabel Item1Label;
    private javax.swing.JButton Item2Buy;
    private javax.swing.JLabel Item2Label;
    private javax.swing.JButton Item3Buy;
    private javax.swing.JLabel Item3Label;
    private javax.swing.JButton Item4Buy;
    private javax.swing.JLabel Item4Label;
    private javax.swing.JButton Item5Buy;
    private javax.swing.JLabel Item5Label;
    private javax.swing.JButton Item6Buy;
    private javax.swing.JLabel Item6Label;
    private javax.swing.JButton Item7Buy;
    private javax.swing.JLabel Item7Label;
    private javax.swing.JButton Item8Buy;
    private javax.swing.JLabel Item8Label;
    private javax.swing.ButtonGroup ItemButtonGroup;
    private javax.swing.JPanel LayoutPanel;
    private javax.swing.JLabel MachineBalLabel;
    private javax.swing.JPanel MachineButtonPanel;
    private javax.swing.JTextArea MachinePrintDisplay;
    private javax.swing.JLabel MaintenanceLabel;
    private javax.swing.JLabel MaintenanceLabel1;
    private javax.swing.ButtonGroup MilkTeaFlavorGroup;
    private javax.swing.JSpinner MilkTeaQuantity;
    private javax.swing.JLabel MilkTeaQuantityLabel;
    private javax.swing.JLabel MilkteaFlavor;
    private javax.swing.JLabel MilkteaFlavor1;
    private javax.swing.JLabel MilkteaFlavor2;
    private javax.swing.JLabel MilkteaFlavorStockLabel;
    private javax.swing.ButtonGroup MoneyButtonGroup;
    private javax.swing.JPanel MoneyPanel;
    private javax.swing.JTextField MoneyQuantityField;
    private javax.swing.JRadioButton NataDeCoco;
    private javax.swing.JTextArea NumPadDisplay;
    private javax.swing.JLabel PersonBalLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JButton RestockButton;
    private javax.swing.JTextField RestockField;
    private javax.swing.JLabel RestockLabel;
    private javax.swing.JButton SetPriceButton;
    private javax.swing.JTextField SetPriceField;
    private javax.swing.JLabel SetPriceLabel;
    private javax.swing.ButtonGroup SinkerButtonGroup;
    private javax.swing.JLabel SinkerStockLabel;
    private javax.swing.JSpinner SpinnerQuantity;
    private javax.swing.JRadioButton Sugar0;
    private javax.swing.JRadioButton Sugar100;
    private javax.swing.JRadioButton Sugar25;
    private javax.swing.JRadioButton Sugar50;
    private javax.swing.JRadioButton Sugar75;
    private javax.swing.ButtonGroup SugarLevelButtonGroup;
    private javax.swing.JLabel SugarLevelStockLabel;
    private javax.swing.JButton SummaryTransactionButton;
    private javax.swing.JRadioButton TapiocaPearl;
    private javax.swing.JLabel VendingMachineName;
    private javax.swing.JRadioButton WinterMelon;
    private javax.swing.JButton jButtonCreate0;
    private javax.swing.JButton jButtonCreate1;
    private javax.swing.JButton jButtonCreate2;
    private javax.swing.JButton jButtonCreate3;
    private javax.swing.JButton jButtonCreate4;
    private javax.swing.JButton jButtonCreate5;
    private javax.swing.JButton jButtonCreate6;
    private javax.swing.JButton jButtonCreate7;
    private javax.swing.JButton jButtonCreate8;
    private javax.swing.JButton jButtonCreate9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
*/