/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creworker.Controller.Frames;

import creworker.controller.Panels.Fileselect;
import creworker.controller.Panels.MainUi;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author bilal
 */
public class MainFrame extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    Fileselect fileselect;
    MainUi mainui;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        fileselect = new Fileselect();
        mainui = new MainUi();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(mainui,c);
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(fileselect,c);
        mainui.setVisible(true);
        fileselect.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        DynamicPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    // End of variables declaration//GEN-END:variables
}
