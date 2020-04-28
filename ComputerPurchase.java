//****************************************************************************************************
//
//              File:                                   ComputerPurchase.java
//		
//              Student:                                Kyle McColgan
//
//              Assignment:                             Program  # 12
//
//              Course Name:                            Java programming I
// 
//              Course Number:                          COSC 2050 - 01
//
//              Due:                                    April 29th, 2020
//
//
//              This file contains the ComputerPurchase Java swing GUI application.
//
//              Other files required:
//                      1. ComputerPurchase.form - required Java fxml file.
//
//		 
//		
//****************************************************************************************************


import java.text.NumberFormat;
import javax.swing.JOptionPane;

//****************************************************************************************************

public class ComputerPurchase extends javax.swing.JFrame
{
    
      public static void main(String args [ ] )
      {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new ComputerPurchase().setVisible(true);
            }
        });
    }

    public ComputerPurchase() 
    {
        initComponents();
        price = 500.0;
    }
    
    //****************************************************************************************************
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        hardwarePanel = new javax.swing.JPanel();
        hardwareLabel = new javax.swing.JLabel();
        processerLabel = new javax.swing.JLabel();
        memoryLabel = new javax.swing.JLabel();
        diskLabel = new javax.swing.JLabel();
        processorComboBox = new javax.swing.JComboBox<>();
        memoryComboBox = new javax.swing.JComboBox<>();
        diskComboBox = new javax.swing.JComboBox<>();
        priceLabel = new javax.swing.JLabel();
        softwarePanel = new javax.swing.JPanel();
        softwareLabel = new javax.swing.JLabel();
        osRadioButton1 = new javax.swing.JRadioButton();
        osRadioButton2 = new javax.swing.JRadioButton();
        packageCheckBox1 = new javax.swing.JCheckBox();
        packageCheckBox2 = new javax.swing.JCheckBox();
        packageCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        priceTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hardwarePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        hardwareLabel.setText("Hardware");

        processerLabel.setText("Processor: ");

        memoryLabel.setText("Memory: ");

        diskLabel.setText("Disk: ");

        processorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quad Core 3.40GHz", "Quad Core 3.50GHz", "Quad Core 3.60GHz" }));

        memoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GB", "8GB", "16GB", "32GB" }));

        diskComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500GB", "1TB", "2TB" }));

        javax.swing.GroupLayout hardwarePanelLayout = new javax.swing.GroupLayout(hardwarePanel);
        hardwarePanel.setLayout(hardwarePanelLayout);
        hardwarePanelLayout.setHorizontalGroup(
            hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hardwarePanelLayout.createSequentialGroup()
                .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hardwareLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hardwarePanelLayout.createSequentialGroup()
                        .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hardwarePanelLayout.createSequentialGroup()
                                .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(processerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(hardwarePanelLayout.createSequentialGroup()
                                .addComponent(memoryLabel)
                                .addGap(12, 12, 12)))
                        .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(processorComboBox, 0, 123, Short.MAX_VALUE)
                            .addComponent(diskComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        hardwarePanelLayout.setVerticalGroup(
            hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hardwarePanelLayout.createSequentialGroup()
                .addComponent(hardwareLabel)
                .addGap(18, 18, 18)
                .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processerLabel)
                    .addComponent(processorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memoryLabel)
                    .addComponent(memoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hardwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diskLabel)
                    .addComponent(diskComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        priceLabel.setText("Price: ");

        softwarePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        softwareLabel.setText("Software: ");

        buttonGroup1.add(osRadioButton1);
        osRadioButton1.setText("Windows 10 Pro");

        buttonGroup1.add(osRadioButton2);
        osRadioButton2.setSelected(true);
        osRadioButton2.setText("Windows 10 Home");

        packageCheckBox1.setText("Office package");

        packageCheckBox2.setText("Accounting package");

        packageCheckBox3.setText("Graphics package");

        javax.swing.GroupLayout softwarePanelLayout = new javax.swing.GroupLayout(softwarePanel);
        softwarePanel.setLayout(softwarePanelLayout);
        softwarePanelLayout.setHorizontalGroup(
            softwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(softwarePanelLayout.createSequentialGroup()
                .addComponent(softwareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(softwarePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(softwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(packageCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(packageCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(softwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(packageCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(osRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(osRadioButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        softwarePanelLayout.setVerticalGroup(
            softwarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(softwarePanelLayout.createSequentialGroup()
                .addComponent(softwareLabel)
                .addGap(18, 18, 18)
                .addComponent(osRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(osRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(packageCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(packageCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packageCheckBox3)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        priceTextArea.setEditable(false);
        priceTextArea.setColumns(20);
        priceTextArea.setRows(5);
        jScrollPane1.setViewportView(priceTextArea);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hardwarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(softwarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(calculateButton)
                        .addGap(38, 38, 38)
                        .addComponent(exitButton)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hardwarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(softwarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calculateButton)
                        .addComponent(exitButton)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //****************************************************************************************************
    
    private void _calculateDisk ( )
    {    
        final double DISK_1TB_PRICE = 50.00;
        final double DISK_2TB_PRICE = 150.00;
        
        int disk;
        
        disk = diskComboBox.getSelectedIndex();
        
        switch ( disk )
        {
            case 2:
                price += DISK_1TB_PRICE;
                break;
            case 3:
                price += DISK_2TB_PRICE;
                break;                  
        }
    }
    
    //****************************************************************************************************
    
    private void _calculateMemory ( )
    {
        final double MEMORY_8GB_PRICE = 50.00;
        final double MEMORY_16GB_PRICE = 100.00;
        final double MEMORY_32GB_PRICE = 150.00;
        
        int memory;
        
        memory = memoryComboBox.getSelectedIndex();
        
        switch ( memory )
        {
            case 1:
                price += MEMORY_8GB_PRICE;
                break;
            case 2:
                price += MEMORY_16GB_PRICE;
                break;
            case 3:
                price += MEMORY_32GB_PRICE;
                break;                
        }
    }
    
    //****************************************************************************************************
    
    private String _calculatePackage ( )
    {
        final double PACKAGE_PRICE1 = 400.00;
        final double PACKAGE_PRICE2 = 200.00;
        final double PACKAGE_PRICE3 = 600.00;
        
        boolean packageSelected;

        String packageList;
        
        packageSelected = false;
        packageList = "none";
 
        if ( packageCheckBox1.isSelected() )
        {
            packageList = packageCheckBox1.getText();
            price += PACKAGE_PRICE1;
            packageSelected = true;
        }
        if ( packageCheckBox2.isSelected() )
        {    
            if ( packageSelected == true ) 
                 packageList += "\n" + packageCheckBox2.getText();
            else
                packageList = "\n" + packageCheckBox2.getText();
            
            packageSelected = true;
            price += PACKAGE_PRICE2;
        }
        if ( packageCheckBox3.isSelected() )
        {
            if ( packageSelected == true )
                packageList += "\n" + packageCheckBox3.getText();
            else
                packageList = "\n" + packageCheckBox3.getText();
            
            price += PACKAGE_PRICE3;
        }
        
        return packageList;
    }
    
    //****************************************************************************************************
    
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed

        final double PROCESSOR_PRICE2 = 50.00;
        final double PROCESSOR_PRICE3 = 150.00;
        final double OS_PRICE1 = 100.00;
              
        String os = "",
               packageList = "",
               msg = "";
        
        price = 500.00;
        
        if ( processorComboBox.getSelectedIndex() == 1 )
            price += PROCESSOR_PRICE2;
        else if ( processorComboBox.getSelectedIndex() == 2)
            price += PROCESSOR_PRICE3;
        
        _calculateDisk ( );
        _calculateMemory ( );
        packageList = _calculatePackage ( );
        
        if ( osRadioButton1.isSelected() )
        {
            os += osRadioButton1.getText();
            price += OS_PRICE1;
        }
        else
            os += osRadioButton2.getText();
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
               
        priceTextArea.setText ( fmt.format(price));
        
        msg += "You have selected:\nProcessor: " + String.valueOf ( processorComboBox.getSelectedItem());
        msg += "\nMemory: " + (String.valueOf ( memoryComboBox.getSelectedItem()));
        msg += "\nDisk: " + (String.valueOf(diskComboBox.getSelectedItem()));
        msg += "\nOperating System: " + os + "\nSoftware: " + packageList;
        
        JOptionPane.showMessageDialog ( this , msg , "Configuration" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_calculateButtonActionPerformed

    //****************************************************************************************************
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    //****************************************************************************************************
    
    private double price;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateButton;
    private javax.swing.JComboBox<String> diskComboBox;
    private javax.swing.JLabel diskLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel hardwareLabel;
    private javax.swing.JPanel hardwarePanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> memoryComboBox;
    private javax.swing.JLabel memoryLabel;
    private javax.swing.JRadioButton osRadioButton1;
    private javax.swing.JRadioButton osRadioButton2;
    private javax.swing.JCheckBox packageCheckBox1;
    private javax.swing.JCheckBox packageCheckBox2;
    private javax.swing.JCheckBox packageCheckBox3;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextArea priceTextArea;
    private javax.swing.JLabel processerLabel;
    private javax.swing.JComboBox<String> processorComboBox;
    private javax.swing.JLabel softwareLabel;
    private javax.swing.JPanel softwarePanel;
    // End of variables declaration//GEN-END:variables
}
