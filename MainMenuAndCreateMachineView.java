/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIINTERFACE;

import javax.swing.*;
/*
 * @author kurvy morales & emmanuel ting
 */
public class MainMenuAndCreateMachineView extends javax.swing.JFrame {
    /**
     * Creates new form BaseFrame
     */
    private RegMachineView Machine; //REMOVE ONCE CONTROLLER CODE IS IMPLEMENTED
    //private Model something something;
    private GUIModel Model;
    private JFrame CreateMachine;
    private ButtonGroup buttonGroup;
    private JButton ExitButton;
    private JButton CreateVendingMachine;
    private JButton TestVendingMachine;
    private JButton CreateMachineButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel ItemDisplayLabel;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JRadioButton RegMachineButton;
    private JRadioButton SpecialMachineButton;
    private JScrollPane jScrollPane1;
    private JTextArea ItemListDisplay;
    private JTextField jTextField1;
    
    public MainMenuAndCreateMachineView(GUIModel model, RegMachineView secondView) {
        this.Model = model;
        this.Machine = secondView;
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

        buttonGroup = new javax.swing.ButtonGroup();
        CreateMachine = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RegMachineButton = new javax.swing.JRadioButton();
        SpecialMachineButton = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        ItemDisplayLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemListDisplay = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CreateMachineButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        CreateVendingMachine = new javax.swing.JButton();
        TestVendingMachine = new javax.swing.JButton();

        CreateMachine.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        CreateMachine.setResizable(false);
        CreateMachine.setSize(new java.awt.Dimension(807, 420));
        CreateMachine.setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Create your Vending Machine");

        buttonGroup.add(RegMachineButton);
        RegMachineButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegMachineButton.setText("Regular Vending Machine");
        RegMachineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegMachineButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(SpecialMachineButton);
        SpecialMachineButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SpecialMachineButton.setText("Special Vending Machine");
        SpecialMachineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialMachineButtonActionPerformed(evt);
            }
        });

        ItemDisplayLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemDisplayLabel.setText("Items in the Machine: ");

        ItemListDisplay.setEditable(false);
        ItemListDisplay.setColumns(20);
        ItemListDisplay.setRows(5);
        ItemListDisplay.setText(Model.getItem1Name()+"\n"+Model.getItem2Name()+"\n"+Model.getItem3Name()
            +"\n"+Model.getItem4Name()+"\n"+Model.getItem5Name()+"\n"+Model.getItem6Name()+"\n"+Model.getItem7Name()
            +"\n"+Model.getItem8Name()+"\n"+Model.getItem9Name()
        );
        ItemListDisplay.setFocusable(false);
        jScrollPane1.setViewportView(ItemListDisplay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItemDisplayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Enter your Vending Machine Name:");

        CreateMachineButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateMachineButton.setText("Create Machine");
        CreateMachineButton.setEnabled(false);
        CreateMachineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMachineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpecialMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(CreateMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RegMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpecialMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateMachineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout CreateMachineLayout = new javax.swing.GroupLayout(CreateMachine.getContentPane());
        CreateMachine.getContentPane().setLayout(CreateMachineLayout);
        CreateMachineLayout.setHorizontalGroup(
            CreateMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateMachineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        CreateMachineLayout.setVerticalGroup(
            CreateMachineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateMachineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MCO2 Vending Machine");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel1.setText("MCO2 Vending Machine");

        ExitButton.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        ExitButton.setText("Exit Program");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CreateVendingMachine.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        CreateVendingMachine.setText("Create Vending Machine");
        CreateVendingMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateVendingMachineActionPerformed(evt);
            }
        });

        TestVendingMachine.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        TestVendingMachine.setText("Test Vending Machine");
        TestVendingMachine.setEnabled(false);
        TestVendingMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestVendingMachineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreateVendingMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TestVendingMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(CreateVendingMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(TestVendingMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("FirstFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void TestVendingMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestVendingMachineActionPerformed
        this.Machine.setVisible(false);
        this.Machine.setVisible(true);
    }//GEN-LAST:event_TestVendingMachineActionPerformed

    private void CreateVendingMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateVendingMachineActionPerformed
        CreateMachine.setVisible(true);
    }//GEN-LAST:event_CreateVendingMachineActionPerformed

    private void RegMachineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegMachineButtonActionPerformed
        CreateMachineButton.setEnabled(true);
        ItemListDisplay.setText(Model.getItem1Name()+"\n"+Model.getItem2Name()+"\n"+Model.getItem3Name()
    +"\n"+Model.getItem4Name()+"\n"+Model.getItem5Name()+"\n"+Model.getItem6Name()+"\n"+Model.getItem7Name()
    +"\n"+Model.getItem8Name() );
    }//GEN-LAST:event_RegMachineButtonActionPerformed

    private void SpecialMachineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialMachineButtonActionPerformed
        CreateMachineButton.setEnabled(true);
        ItemListDisplay.setText(Model.getItem1Name()+"\n"+Model.getItem2Name()+"\n"+Model.getItem3Name()
    +"\n"+Model.getItem4Name()+"\n"+Model.getItem5Name()+"\n"+Model.getItem6Name()+"\n"+Model.getItem7Name()
    +"\n"+Model.getItem8Name()+"\n"+Model.getItem9Name()+"\n"+Model.getIng1Name()+"\n"+Model.getIng2Name()
    +"\n"+Model.getIng3Name()+"\n"+Model.getIng4Name()+"\n"+Model.getIng5Name()+"\n"+Model.getIng6Name());
    }//GEN-LAST:event_SpecialMachineButtonActionPerformed

    private void CreateMachineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMachineButtonActionPerformed

        if (RegMachineButton.isSelected() ) {
            this.Machine.setmachineLabel(jTextField1.getText());
            this.Machine.dispose();
            this.Machine.setTitle("Regular Vending Machine MCO2");
            
            System.out.println("REGULAR MACHINE HAS BEEN SET.");
        } else if (SpecialMachineButton.isSelected() ) {
            this.Machine.setmachineLabel(jTextField1.getText());
            this.Machine.dispose();
            this.Machine.setTitle("Special Vending Machine MCO2");
            System.out.println("SPECIAL MACHINE HAS BEEN SET.");
        }
        CreateMachine.dispose();
        TestVendingMachine.setEnabled(true);
        jTextField1.setText("");
        RegMachineButton.setSelected(false);
        SpecialMachineButton.setSelected(false);
    }//GEN-LAST:event_CreateMachineButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
 
}
/* DEFAULT VARIABLE DECLARATION FROM NETBEANS
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CreateMachine;
    private javax.swing.JButton CreateMachineButton;
    private javax.swing.JButton CreateVendingMachine;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ItemDisplayLabel;
    private javax.swing.JTextArea ItemListDisplay;
    private javax.swing.JRadioButton RegMachineButton;
    private javax.swing.JRadioButton SpecialMachineButton;
    private javax.swing.JButton TestVendingMachine;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
*/
