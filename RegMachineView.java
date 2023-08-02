/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIINTERFACE;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author kurvy morales & emmanuel ting
 */
public class RegMachineView extends JFrame {
    
    private JLabel MilkTeaQuantityLabel;
    private JSpinner MilkTeaQuantity;
    private JButton AdminBackButton;
    private JTextArea AdminDisplayArea;
    private JFrame AdminFrame;
    private JTextArea AdminOtherDisplay;
    private JPanel AdminPanel;
    private JButton AdminSettingsButton;
    private JPanel BigMachinePanel;
    private JPanel BuyItemPanel;
    private JButton ClearButton;
    private JButton CustomItemBuy;
    private JLabel CustomItemLabel;
    private JFrame CustomItemMenu;
    private JButton DispenseButton;
    private JButton ExitButton;
    private JButton Ing1Buy;
    private JLabel Ing1Label;
    private JButton Ing2Buy;
    private JLabel Ing2Label;
    private JButton Ing3Buy;
    private JLabel Ing3Label;
    private JLabel InputLabel;
    private JPanel InputPanel;
    private JButton InputQuantityButton;
    private JLabel InputQuantityLabel;
    private JButton InsertMoneyButton;
    private JButton Item1Buy;
    private JLabel Item1Label;
    private JButton Item2Buy;
    private JLabel Item2Label;
    private JButton Item3Buy;
    private JLabel Item3Label;
    private JButton Item4Buy;
    private JLabel Item4Label;
    private JButton Item5Buy;
    private JLabel Item5Label;
    private JButton Item6Buy;
    private JLabel Item6Label;
    private JButton Item7Buy;
    private JLabel Item7Label;
    private JButton Item8Buy;
    private JLabel Item8Label;
    private JPanel LayoutPanel;
    private JLabel MachineBalLabel;
    private JPanel MachineButtonPanel;
    private JTextArea MachinePrintDisplay;
    private JLabel MaintenanceLabel;
    private JLabel MaintenanceLabel1;
    private JLabel MilkteaFlavor;
    private JLabel MilkteaFlavor1;
    private JLabel MilkteaFlavor2;
    private JPanel MoneyPanel;
    private JTextField MoneyQuantityField;
    private JTextArea NumPadDisplay;
    private JLabel PersonBalLabel;
    private JLabel QuantityLabel;
    private JButton RestockButton;
    private JTextField RestockField;
    private JLabel RestockLabel;
    private JButton SetPriceButton;
    private JTextField SetPriceField;
    private JLabel SetPriceLabel;
    private JSpinner SpinnerQuantity;
    private JLabel VendingMachineName;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private ButtonGroup buttonGroup5;
    private JButton CollectPaymentButton;
    private JButton SummaryTransactionButton;
    private JButton CustomItemMenuExitButton;
    private JButton CreateMilkteaButton;
    private JButton jButtonCreate0;
    private JButton jButtonCreate1;
    private JButton jButtonCreate2;
    private JButton jButtonCreate3;
    private JButton jButtonCreate4;
    private JButton jButtonCreate5;
    private JButton jButtonCreate6;
    private JButton jButtonCreate7;
    private JButton jButtonCreate8;
    private JButton jButtonCreate9;
    private JLabel MilkteaFlavorStockLabel;
    private JLabel SugarLevelLabel;
    private JLabel SinkerStockLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton10;
    private JRadioButton jRadioButton11;
    private JRadioButton jRadioButton12;
    private JRadioButton jRadioButton13;
    private JRadioButton jRadioButton14;
    private JRadioButton jRadioButton15;
    private JRadioButton jRadioButton16;
    private JRadioButton jRadioButton17;
    private JRadioButton jRadioButton18;
    private JRadioButton jRadioButton19;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton20;
    private JRadioButton jRadioButton21;
    private JRadioButton jRadioButton22;
    private JRadioButton jRadioButton23;
    private JRadioButton jRadioButton24;
    private JRadioButton jRadioButton25;
    private JRadioButton jRadioButton26;
    private JRadioButton jRadioButton27;
    private JRadioButton jRadioButton28;
    private JRadioButton jRadioButton29;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton30;
    private JRadioButton jRadioButton31;
    private JRadioButton jRadioButton32;
    private JRadioButton jRadioButton33;
    private JRadioButton jRadioButton34;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JRadioButton jRadioButton9;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
          
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
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        MilkteaFlavorStockLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        SugarLevelLabel = new javax.swing.JLabel();
        CustomItemMenuExitButton = new javax.swing.JButton();
        CreateMilkteaButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        SinkerStockLabel = new javax.swing.JLabel();
        MilkTeaQuantity = new javax.swing.JSpinner();
        MilkTeaQuantityLabel = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
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
        AdminFrame.setPreferredSize(new java.awt.Dimension(1066, 703));
        AdminFrame.setResizable(false);
        AdminFrame.setSize(new java.awt.Dimension(1066, 703));

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Item 1");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Item 2");
        jPanel1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Item 3");
        jPanel1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Item 4");
        jPanel1.add(jRadioButton4);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Item 5");
        jPanel1.add(jRadioButton5);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Item 6");
        jPanel1.add(jRadioButton6);

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Item 7");
        jPanel1.add(jRadioButton7);

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Item 8");
        jPanel1.add(jRadioButton8);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("Item 9");
        jPanel1.add(jRadioButton9);

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("Item 10");
        jPanel1.add(jRadioButton10);

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.setText("Item 11");
        jPanel1.add(jRadioButton11);

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.setText("Item 12");
        jPanel1.add(jRadioButton12);

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.setText("Item 13");
        jPanel1.add(jRadioButton13);

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setText("Item 14");
        jPanel1.add(jRadioButton14);

        buttonGroup1.add(jRadioButton15);
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

        buttonGroup2.add(jRadioButton16);
        jRadioButton16.setText("Money 1");
        MoneyPanel.add(jRadioButton16);

        buttonGroup2.add(jRadioButton17);
        jRadioButton17.setText("Money 2");
        MoneyPanel.add(jRadioButton17);

        buttonGroup2.add(jRadioButton18);
        jRadioButton18.setText("Money 3");
        MoneyPanel.add(jRadioButton18);

        buttonGroup2.add(jRadioButton19);
        jRadioButton19.setText("Money 4");
        MoneyPanel.add(jRadioButton19);

        buttonGroup2.add(jRadioButton20);
        jRadioButton20.setText("Money 5");
        MoneyPanel.add(jRadioButton20);

        buttonGroup2.add(jRadioButton21);
        jRadioButton21.setText("Money 6");
        MoneyPanel.add(jRadioButton21);

        buttonGroup2.add(jRadioButton22);
        jRadioButton22.setText("Money 7");
        MoneyPanel.add(jRadioButton22);

        buttonGroup2.add(jRadioButton23);
        jRadioButton23.setText("Money 8");
        MoneyPanel.add(jRadioButton23);

        buttonGroup2.add(jRadioButton24);
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
                .addContainerGap(26, Short.MAX_VALUE))
        );
        AdminFrameLayout.setVerticalGroup(
            AdminFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminFrameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

        jRadioButton25.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup3.add(jRadioButton25);
        jRadioButton25.setText("Cookies and Cream");
        jPanel3.add(jRadioButton25);

        jRadioButton26.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup3.add(jRadioButton26);
        jRadioButton26.setText("Wintermelon");
        jPanel3.add(jRadioButton26);

        jRadioButton27.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup3.add(jRadioButton27);
        jRadioButton27.setText("Classic Flavor");
        jPanel3.add(jRadioButton27);

        MilkteaFlavorStockLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MilkteaFlavorStockLabel.setText("IN STOCK: ");
        jPanel3.add(MilkteaFlavorStockLabel);

        jPanel4.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        jRadioButton28.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup4.add(jRadioButton28);
        jRadioButton28.setText("100%");
        jPanel4.add(jRadioButton28);

        jRadioButton29.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup4.add(jRadioButton29);
        jRadioButton29.setText("75%");
        jPanel4.add(jRadioButton29);

        jRadioButton30.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup4.add(jRadioButton30);
        jRadioButton30.setText("50%");
        jPanel4.add(jRadioButton30);

        jRadioButton31.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup4.add(jRadioButton31);
        jRadioButton31.setText("25%");
        jPanel4.add(jRadioButton31);

        jRadioButton32.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup4.add(jRadioButton32);
        jRadioButton32.setText("0%");
        jPanel4.add(jRadioButton32);

        SugarLevelLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SugarLevelLabel.setText("IN STOCK: ");
        jPanel4.add(SugarLevelLabel);

        CustomItemMenuExitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomItemMenuExitButton.setText("Exit Menu");

        CreateMilkteaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateMilkteaButton.setText("Create Milktea");

        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jRadioButton33.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup5.add(jRadioButton33);
        jRadioButton33.setText("Nata De Coco");
        jPanel5.add(jRadioButton33);

        jRadioButton34.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup5.add(jRadioButton34);
        jRadioButton34.setText("Tapioca Pearl");
        jPanel5.add(jRadioButton34);

        SinkerStockLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SinkerStockLabel.setText("IN STOCK:");
        jPanel5.add(SinkerStockLabel);

        MilkTeaQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        MilkTeaQuantity.setAlignmentX(0.0F);
        MilkTeaQuantity.setAlignmentY(0.0F);
        MilkTeaQuantity.setEditor(new JSpinner.DefaultEditor(SpinnerQuantity));
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
    
    public void setjRadioButton1Listener (ActionListener actionlistener) {
        this.jRadioButton1.addActionListener(actionlistener);
    }
    
    public void setjRadioButton2Listener (ActionListener actionlistener) {
        this.jRadioButton2.addActionListener(actionlistener);
    }
    
    public void setjRadioButton3Listener (ActionListener actionlistener) {
        this.jRadioButton3.addActionListener(actionlistener);
    }
    
    public void setjRadioButton4Listener (ActionListener actionlistener) {
        this.jRadioButton4.addActionListener(actionlistener);
    }
    
    public void setjRadioButton5Listener (ActionListener actionlistener) {
        this.jRadioButton5.addActionListener(actionlistener);
    }
    
    public void setjRadioButton6Listener (ActionListener actionlistener) {
        this.jRadioButton6.addActionListener(actionlistener);
    }
    
    public void setjRadioButton7Listener (ActionListener actionlistener) {
        this.jRadioButton7.addActionListener(actionlistener);
    }
    
    public void setjRadioButton8Listener (ActionListener actionlistener) {
        this.jRadioButton8.addActionListener(actionlistener);
    }
    
    public void setjRadioButton9Listener (ActionListener actionlistener) {
        this.jRadioButton9.addActionListener(actionlistener);
    }
    
    public void setjRadioButton10Listener (ActionListener actionlistener) {
        this.jRadioButton10.addActionListener(actionlistener);
    }
    
    public void setjRadioButton11Listener (ActionListener actionlistener) {
        this.jRadioButton11.addActionListener(actionlistener);
    }
    
    public void setjRadioButton12Listener (ActionListener actionlistener) {
        this.jRadioButton12.addActionListener(actionlistener);
    }
    
    public void setjRadioButton13Listener (ActionListener actionlistener) {
        this.jRadioButton13.addActionListener(actionlistener);
    }
    
    public void setjRadioButton14Listener (ActionListener actionlistener) {
        this.jRadioButton14.addActionListener(actionlistener);
    }
    
    public void setjRadioButton15Listener (ActionListener actionlistener) {
        this.jRadioButton15.addActionListener(actionlistener);
    }
    
    public void setjRadioButton16Listener (ActionListener actionlistener) {
        this.jRadioButton16.addActionListener(actionlistener);
    }
    
    public void setjRadioButton17Listener (ActionListener actionlistener) {
        this.jRadioButton7.addActionListener(actionlistener);
    }
    
    public void setjRadioButton18Listener (ActionListener actionlistener) {
        this.jRadioButton8.addActionListener(actionlistener);
    }
    
    public void setjRadioButton19Listener (ActionListener actionlistener) {
        this.jRadioButton9.addActionListener(actionlistener);
    }
    
    public void setjRadioButton20Listener (ActionListener actionlistener) {
        this.jRadioButton10.addActionListener(actionlistener);
    }
    
    public void setjRadioButton21Listener (ActionListener actionlistener) {
        this.jRadioButton11.addActionListener(actionlistener);
    }
    
    public void setjRadioButton22Listener (ActionListener actionlistener) {
        this.jRadioButton12.addActionListener(actionlistener);
    }
    
    public void setjRadioButton23Listener (ActionListener actionlistener) {
        this.jRadioButton13.addActionListener(actionlistener);
    }
    
    public void setjRadioButton24Listener (ActionListener actionlistener) {
        this.jRadioButton14.addActionListener(actionlistener);
    }
    
    public JRadioButton getjRadioButton1 () {
        return this.jRadioButton1;
    }
    
    public JRadioButton getjRadioButton2 () {
        return this.jRadioButton2;
    }
    
    public JRadioButton getjRadioButton3 () {
        return this.jRadioButton3;
    }
    
    public JRadioButton getjRadioButton4 () {
        return this.jRadioButton4;
    }
    
    public JRadioButton getjRadioButton5 () {
        return this.jRadioButton5;
    }
    
    public JRadioButton getjRadioButton6 () {
        return this.jRadioButton6;
    }
    
    public JRadioButton getjRadioButton7 () {
        return this.jRadioButton7;
    }
    
    public JRadioButton getjRadioButton8 () {
        return this.jRadioButton8;
    }
    
    public JRadioButton getjRadioButton9 () {
        return this.jRadioButton9;
    }
    
    public JRadioButton getjRadioButton10 () {
        return this.jRadioButton10;
    }
    
    public JRadioButton getjRadioButton11 () {
        return this.jRadioButton11;
    }
    
    public JRadioButton getjRadioButton12 () {
        return this.jRadioButton12;
    }
    
    public JRadioButton getjRadioButton13 () {
        return this.jRadioButton13;
    }
    
    public JRadioButton getjRadioButton14 () {
        return this.jRadioButton14;
    }
    
    public JRadioButton getjRadioButton15 () {
        return this.jRadioButton15;
    }
    
    public JRadioButton getjRadioButton16 () {
        return this.jRadioButton5;
    }
    
    public JRadioButton getjRadioButton17 () {
        return this.jRadioButton6;
    }
    
    public JRadioButton getjRadioButton18 () {
        return this.jRadioButton7;
    }
    
    public JRadioButton getjRadioButton19 () {
        return this.jRadioButton8;
    }
    
    public JRadioButton getjRadioButton20 () {
        return this.jRadioButton9;
    }
    
    public JRadioButton getjRadioButton21 () {
        return this.jRadioButton10;
    }
    
    public JRadioButton getjRadioButton22 () {
        return this.jRadioButton11;
    }
    
    public JRadioButton getjRadioButton23 () {
        return this.jRadioButton12;
    }
    
    public JRadioButton getjRadioButton24 () {
        return this.jRadioButton13;
    }
    
    public void setAdminFrameVisibility(boolean value) {
        this.AdminFrame.setVisible(value);
    }
    
    public void disposeAdminFrame() {
        this.AdminFrame.dispose();
    }
    
    public void setMachinePrintDisplayText(String text) {
        this.MachinePrintDisplay.setText(text);
    }
    
    public String getMachinePrintDisplayText() {
        return this.MachinePrintDisplay.getText();
    }
    
    public void setPersonBalLabelText(String text) {
        this.PersonBalLabel.setText(text);
    }
    public void setmachineLabel(String text){
        this.VendingMachineName.setText(text);
    }
    
    public void setcustomItemLabelStatus (boolean value) {
        CustomItemLabel.setEnabled(value);
    }
    
    public void setcustomItemBuyStatus (boolean value) {
        CustomItemBuy.setEnabled(value);
    }
    
    public void setIng1LabelStatus (boolean value) {
        Ing1Label.setEnabled(value);
    }
    
     public void setIng1BuyStatus (boolean value) {
        Ing1Buy.setEnabled(value);
    }
    
    public void setIng2LabelStatus (boolean value) {
        Ing2Label.setEnabled(value);
    }
    
    public void setIng2BuyStatus (boolean value) {
        Ing2Buy.setEnabled(value);
    }
    
    public void setIng3LabelStatus (boolean value) {
        Ing3Label.setEnabled(value);
    }
    
     public void setIng3BuyStatus (boolean value) {
        Ing3Buy.setEnabled(value);
    }
    public void setNumPadDisplayText (String text) {
        NumPadDisplay.setText(text);
    }
    
    public String getNumPadDisplayText() {
        return this.NumPadDisplay.getText();
    }
    
    public int getSpinnerQuantity() {
       return( (Integer) this.SpinnerQuantity.getValue() );
    }
    
    public void setSpinnerQuantity(int quantity) {
      this.SpinnerQuantity.setValue(quantity);
    }
    
    public void setItem1BuyActionListener (ActionListener actionlistener) {
        this.Item1Buy.addActionListener(actionlistener);
    }
    
    public void setItem2BuyActionListener (ActionListener actionlistener) {
        this.Item2Buy.addActionListener(actionlistener);
    }
    
    public void setItem3BuyActionListener (ActionListener actionlistener) {
        this.Item3Buy.addActionListener(actionlistener);
    }
    
    public void setItem4BuyActionListener (ActionListener actionlistener) {
        this.Item4Buy.addActionListener(actionlistener);
    }
    
    public void setItem5BuyActionListener (ActionListener actionlistener) {
        this.Item5Buy.addActionListener(actionlistener);
    }
    
    public void setItem6BuyActionListener (ActionListener actionlistener) {
        this.Item6Buy.addActionListener(actionlistener);
    }
    
    public void setItem7BuyActionListener (ActionListener actionlistener) {
        this.Item7Buy.addActionListener(actionlistener);
    }
    
    public void setItem8BuyActionListener (ActionListener actionlistener) {
        this.Item8Buy.addActionListener(actionlistener);
    }
    
    public void setCustomItemBuyActionListener (ActionListener actionlistener) {
        this.CustomItemBuy.addActionListener(actionlistener);
    }
    
    public void setIng1BuyActionListener (ActionListener actionlistener) {
        this.Ing1Buy.addActionListener(actionlistener);
    }
    
    public void setIng2BuyActionListener (ActionListener actionlistener) {
        this.Ing2Buy.addActionListener(actionlistener);
    }
    
    public void setIng3BuyActionListener (ActionListener actionlistener) {
        this.Ing3Buy.addActionListener(actionlistener);
    }
    
    public void setItem1Label (String text) {
        this.Item1Label.setText(text);
    }
    
    public void setItem2Label (String text) {
        this.Item2Label.setText(text);
    }
     
    public void setItem3Label (String text) {
        this.Item3Label.setText(text);
    }
      
    public void setItem4Label (String text) {
        this.Item4Label.setText(text);
    }
       
    public void setItem5Label (String text) {
        this.Item5Label.setText(text);
    }
        
    public void setItem6Label (String text) {
        this.Item6Label.setText(text);
    }
         
    public void setItem7Label (String text) {
        this.Item7Label.setText(text);
    }
          
    public void setItem8Label (String text) {
        this.Item8Label.setText(text);
    }
    
    public void setCustomItemLabel (String text) {
        this.CustomItemLabel.setText(text);
    }
    
    public void setIng1Label (String text) {
        this.Ing1Label.setText(text);
    }
    
    public void setIng2Label (String text) {
        this.Ing2Label.setText(text);
    }
    
    public void setIng3Label (String text) {
        this.Ing3Label.setText(text);
    }
    
    public void setButtonCreate0ActionListener (ActionListener actionlistener) {
        this.jButtonCreate0.addActionListener(actionlistener);
    }
    
    public void setButtonCreate1ActionListener (ActionListener actionlistener) {
        this.jButtonCreate1.addActionListener(actionlistener);
    }
    
    public void setButtonCreate2ActionListener (ActionListener actionlistener) {
        this.jButtonCreate2.addActionListener(actionlistener);
    }
    
    public void setButtonCreate3ActionListener (ActionListener actionlistener) {
        this.jButtonCreate3.addActionListener(actionlistener);
    }
    
    public void setButtonCreate4ActionListener (ActionListener actionlistener) {
        this.jButtonCreate4.addActionListener(actionlistener);
    }
    
     public void setButtonCreate5ActionListener (ActionListener actionlistener) {
        this.jButtonCreate5.addActionListener(actionlistener);
    }
    
    public void setButtonCreate6ActionListener (ActionListener actionlistener) {
        this.jButtonCreate6.addActionListener(actionlistener);
    }
    
    public void setButtonCreate7ActionListener (ActionListener actionlistener) {
        this.jButtonCreate7.addActionListener(actionlistener);
    }
    
    public void setButtonCreate8ActionListener (ActionListener actionlistener) {
        this.jButtonCreate8.addActionListener(actionlistener);
    }
    
    public void setButtonCreate9ActionListener (ActionListener actionlistener) {
        this.jButtonCreate9.addActionListener(actionlistener);
    }
    
    public void setClearButtonListener(ActionListener actionlistener) {
        this.ClearButton.addActionListener(actionlistener);
    }
    
    public void setAdminSettingsButtonListener (ActionListener actionlistener) {
        this.AdminSettingsButton.addActionListener(actionlistener);
    }
    
    public void setMachineBalance(String text) {
        MachineBalLabel.setText(text);
    }
    public void setExitButtonActionListener(ActionListener listener) {
        this.ExitButton.addActionListener(listener);
    }
    
    public void setRestockButtonListener (ActionListener actionlistener) {
        this.RestockButton.addActionListener(actionlistener);
    }
    
    public void setSetPriceButtonListener (ActionListener actionlistener) {
        this.SetPriceButton.addActionListener(actionlistener);
    }
    
    public void setAdminBackButtonListener (ActionListener actionlistener) {
        this.AdminBackButton.addActionListener(actionlistener);
    }    
    
    public void setCollectPaymentButtonListener (ActionListener actionlistener) {
        this.CollectPaymentButton.addActionListener(actionlistener);
    }
    
    public void setSummaryTransactionButtonListener (ActionListener actionlistener) {
        this.SummaryTransactionButton.addActionListener(actionlistener);
    }
    
    public void setInputQuantityButtonListener (ActionListener actionlistener) {
        this.InputQuantityButton.addActionListener(actionlistener);
    }
    
    public void setInsertMoneyButtonListener (ActionListener actionlistener) {
        this.InsertMoneyButton.addActionListener(actionlistener);
    }
    
    public void setDispenseButtonActionListener(ActionListener actionlistener) {
        this.DispenseButton.addActionListener(actionlistener);
    }
    
    public void setCustomItemMenuExitButtonListener (ActionListener actionlistener) {
        this.CustomItemMenuExitButton.addActionListener(actionlistener);
    }
    
    public void setCreateMilkteaButtonListener (ActionListener actionlistener) {
        this.CreateMilkteaButton.addActionListener(actionlistener);
    }
    
    public JFrame getAdminFrame () {
        return this.AdminFrame;
    }
    
    public JFrame getCustomItemMenu () {
        return this.CustomItemMenu;
    }
    
    public JTextArea getAdminOtherDisplayArea() {
        return this.AdminOtherDisplay;
    }
    
    public String getAdminDisplayAreaText() {
        return this.AdminDisplayArea.getText();
    }
    
    public void setAdminDisplayAreaText(String text) {
        this.AdminDisplayArea.setText(text);
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
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CollectPaymentButton;
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
    private javax.swing.JPanel LayoutPanel;
    private javax.swing.JLabel MachineBalLabel;
    private javax.swing.JPanel MachineButtonPanel;
    private javax.swing.JTextArea MachinePrintDisplay;
    private javax.swing.JLabel MaintenanceLabel;
    private javax.swing.JLabel MaintenanceLabel1;
    private javax.swing.JSpinner MilkTeaQuantity;
    private javax.swing.JLabel MilkTeaQuantityLabel;
    private javax.swing.JLabel MilkteaFlavor;
    private javax.swing.JLabel MilkteaFlavor1;
    private javax.swing.JLabel MilkteaFlavor2;
    private javax.swing.JLabel MilkteaFlavorStockLabel;
    private javax.swing.JPanel MoneyPanel;
    private javax.swing.JTextField MoneyQuantityField;
    private javax.swing.JTextArea NumPadDisplay;
    private javax.swing.JLabel PersonBalLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JButton RestockButton;
    private javax.swing.JTextField RestockField;
    private javax.swing.JLabel RestockLabel;
    private javax.swing.JButton SetPriceButton;
    private javax.swing.JTextField SetPriceField;
    private javax.swing.JLabel SetPriceLabel;
    private javax.swing.JLabel SinkerStockLabel;
    private javax.swing.JSpinner SpinnerQuantity;
    private javax.swing.JLabel SugarLevelLabel;
    private javax.swing.JButton SummaryTransactionButton;
    private javax.swing.JLabel VendingMachineName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
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
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
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