/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.robotcontrol;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Colin
 */
public class RobotControlUI extends javax.swing.JFrame {

    /**
     * Creates new form RobotControlUI
     */
    
    ControlInterface myInterface;
    public RobotControlUI() {
	initComponents();
	myInterface = new ControlInterface();
	String[] controllerNames = myInterface.getControllerNames();
	joystickSelect.setModel(new javax.swing.DefaultComboBoxModel(controllerNames));
	myInterface.setActiveController(joystickSelect.getSelectedIndex());
	Timer mainTimer = new Timer();
	mainTimer.schedule(new runLoop(), 0, 100);
	
	String[] portNames = myInterface.getSerialPorts();
	serialSelect.setModel(new javax.swing.DefaultComboBoxModel(portNames));
    }
    
    private class runLoop extends TimerTask {
	public void run() {
	   String controllerData = myInterface.getControllerData();
	   joystickData.setText(controllerData);
	   float drive = myInterface.getComponentData("Y Axis");
	   float turn = myInterface.getComponentData("X Rotation");
	   StringBuilder sb = new StringBuilder();
	   sb.append("drive is at " + (int)drive + "\n");
	   sb.append("turn is at " + (int)turn + "\n");
	   //jTextArea1.setText(sb.toString());
	   jTextArea1.setText(myInterface.getControllerData());
	   jTextArea2.append(myInterface.getDataAsString());
	   myInterface.sendDriveData2();
	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JoystickDialog = new javax.swing.JDialog();
        joystickSelect = new javax.swing.JComboBox();
        calibrateBtn = new javax.swing.JButton();
        mapControlsBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        joystickData = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JoystickConfigureBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        serialSelect = new javax.swing.JComboBox();
        serialConfigure = new javax.swing.JButton();
        serialConnect = new javax.swing.JButton();
        serialDisconnect = new javax.swing.JButton();
        SerialRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        JoystickDialog.setTitle("Configuge Joystick");
        JoystickDialog.setMinimumSize(new java.awt.Dimension(500, 500));
        JoystickDialog.setModal(true);
        JoystickDialog.setName("JoystickDialog"); // NOI18N

        joystickSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        joystickSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joystickSelectActionPerformed(evt);
            }
        });

        calibrateBtn.setText("Calibrate");

        mapControlsBtn.setText("Map Controls");
        mapControlsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapControlsBtnActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(java.awt.SystemColor.controlHighlight);

        joystickData.setBackground(java.awt.SystemColor.controlHighlight);
        joystickData.setColumns(20);
        joystickData.setRows(5);
        jScrollPane3.setViewportView(joystickData);

        javax.swing.GroupLayout JoystickDialogLayout = new javax.swing.GroupLayout(JoystickDialog.getContentPane());
        JoystickDialog.getContentPane().setLayout(JoystickDialogLayout);
        JoystickDialogLayout.setHorizontalGroup(
            JoystickDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JoystickDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JoystickDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(JoystickDialogLayout.createSequentialGroup()
                        .addComponent(joystickSelect, 0, 115, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calibrateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mapControlsBtn)))
                .addContainerGap())
        );

        JoystickDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {calibrateBtn, mapControlsBtn});

        JoystickDialogLayout.setVerticalGroup(
            JoystickDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JoystickDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JoystickDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JoystickDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calibrateBtn)
                        .addComponent(mapControlsBtn))
                    .addGroup(JoystickDialogLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(joystickSelect)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setText("jButton3");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Joystick"));

        JoystickConfigureBtn.setText("Configure");
        JoystickConfigureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoystickConfigureBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(java.awt.SystemColor.controlHighlight);

        jTextArea1.setBackground(java.awt.SystemColor.control);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JoystickConfigureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JoystickConfigureBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial Status"));

        jTextArea2.setBackground(java.awt.SystemColor.control);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        serialSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        serialConfigure.setText("Configure");
        serialConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialConfigureActionPerformed(evt);
            }
        });

        serialConnect.setText("Connect");
        serialConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialConnectActionPerformed(evt);
            }
        });

        serialDisconnect.setText("Disconnect");
        serialDisconnect.setEnabled(false);
        serialDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialDisconnectActionPerformed(evt);
            }
        });

        SerialRefresh.setText("Refresh");
        SerialRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerialRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(serialSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serialConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serialDisconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SerialRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serialConfigure)
                        .addGap(0, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialConfigure)
                    .addComponent(serialConnect)
                    .addComponent(serialDisconnect)
                    .addComponent(SerialRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial Monitor"));

        jTextArea5.setBackground(java.awt.SystemColor.control);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jCheckBox1.setText("Auto Scroll");
        jCheckBox1.setToolTipText("");

        jCheckBox2.setText("Show Transmitted Data");

        jCheckBox3.setText("Show Recieved Data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JoystickConfigureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoystickConfigureBtnActionPerformed
        // TODO add your handling code here:
	JoystickDialog.setVisible(true);
    }//GEN-LAST:event_JoystickConfigureBtnActionPerformed

    private void serialConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialConfigureActionPerformed
        // TODO add your handling code here:
	System.out.println("found controllers: ");
	String[] names = myInterface.getControllerNames();
	for (int i=0; i<names.length; i++) {
	    System.out.println(names[i]);
	}
	System.out.println();
    }//GEN-LAST:event_serialConfigureActionPerformed

    private void mapControlsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapControlsBtnActionPerformed
        // TODO add your handling code here:
	joystickData.setText(myInterface.getControllerData());
    }//GEN-LAST:event_mapControlsBtnActionPerformed

    private void joystickSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joystickSelectActionPerformed
        // TODO add your handling code here:
	myInterface.setActiveController(joystickSelect.getSelectedIndex());
	
    }//GEN-LAST:event_joystickSelectActionPerformed

    private void serialConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialConnectActionPerformed
        // TODO add your handling code here:
	try {
	    serialConnect.setEnabled(false);
	    myInterface.serialConnect((String)serialSelect.getSelectedItem());
	    serialDisconnect.setEnabled(true);
	}
	catch (Exception e) {
	    System.out.println(e);
	    serialConnect.setEnabled(true);
	}
    }//GEN-LAST:event_serialConnectActionPerformed

    private void SerialRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerialRefreshActionPerformed
        // TODO add your handling code here:
	String[] portNames = myInterface.getSerialPorts();
	serialSelect.setModel(new javax.swing.DefaultComboBoxModel(portNames));
    }//GEN-LAST:event_SerialRefreshActionPerformed

    private void serialDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialDisconnectActionPerformed
        // TODO add your handling code here:
	myInterface.serialDisconnect();
	serialConnect.setEnabled(true);
	serialDisconnect.setEnabled(false);
    }//GEN-LAST:event_serialDisconnectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(RobotControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(RobotControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(RobotControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(RobotControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new RobotControlUI().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JoystickConfigureBtn;
    private javax.swing.JDialog JoystickDialog;
    private javax.swing.JButton SerialRefresh;
    private javax.swing.JButton calibrateBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea joystickData;
    private javax.swing.JComboBox joystickSelect;
    private javax.swing.JButton mapControlsBtn;
    private javax.swing.JButton serialConfigure;
    private javax.swing.JButton serialConnect;
    private javax.swing.JButton serialDisconnect;
    private javax.swing.JComboBox serialSelect;
    // End of variables declaration//GEN-END:variables
}