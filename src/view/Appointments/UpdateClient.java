/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;

import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Appointments.HandleClient;
import model.Appointments.ValidateClient;


public class UpdateClient extends javax.swing.JDialog {

    private final ImageIcon saveOut;
    private final ImageIcon saveEnter;
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private String selectedClientID;
    
    
    
    public UpdateClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveOut = new ImageIcon(getClass().getResource("/view/Appointments/saveOut.png"));  
        saveEnter = new ImageIcon(getClass().getResource("/view/Appointments/saveEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
        firstNameValidateLabel.setVisible(false);
        lastNameValidateLabel.setVisible(false);
        contactNumberValidateLabel.setVisible(false);   
        
        
        this.pack();
        
        
    }
    
    public UpdateClient(java.awt.Frame parent, boolean modal,String clientID) {
        super(parent, modal);
        initComponents();
        
        saveOut = new ImageIcon(getClass().getResource("/view/Appointments/saveOut.png"));  
        saveEnter = new ImageIcon(getClass().getResource("/view/Appointments/saveEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
        this.selectedClientID = clientID;
        this.loadClientDetails();
        
        firstNameValidateLabel.setVisible(false);
        lastNameValidateLabel.setVisible(false);
        contactNumberValidateLabel.setVisible(false);   
        
        this.pack();
        
        
    }
    
    private void loadClientDetails() {
        HandleClient hc = new HandleClient();        
        hc.setClientID(this.selectedClientID);
        try{
            ResultSet rs = hc.getSelectedClientDetails();
            
            if (rs.next()) {
                firstNameText.setText(rs.getString(1));
                lastNameText.setText(rs.getString(2));
                contactNumberText.setText(rs.getString(3));                
                firstInDateChooser.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(4)));
            }
            else{
                JOptionPane.showMessageDialog(null, "Cannot find client details.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(ClassNotFoundException ex){
              JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstInDateLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        contactNumberText = new javax.swing.JTextField();
        firstInDateChooser = new com.toedter.calendar.JDateChooser();
        firstNameValidateLabel = new javax.swing.JLabel();
        lastNameValidateLabel = new javax.swing.JLabel();
        contactNumberValidateLabel = new javax.swing.JLabel();
        TitlePanelLabel = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        ButtonPanelLabel = new javax.swing.JLabel();
        BodyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Client details");
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setBackground(new java.awt.Color(51, 0, 51));
        TitleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Update Client Details");
        jPanel1.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 35));

        lastNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        lastNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 100, 30));

        firstNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        firstNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 30));

        firstInDateLabel.setBackground(new java.awt.Color(51, 0, 51));
        firstInDateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstInDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstInDateLabel.setText("First In Date");
        jPanel1.add(firstInDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        contactNumberLabel.setBackground(new java.awt.Color(51, 0, 51));
        contactNumberLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNumberLabel.setText("Contact Number");
        jPanel1.add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        lastNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(lastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 200, 30));

        firstNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 30));

        contactNumberText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(contactNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 30));

        firstInDateChooser.setDateFormatString("yyyy-MM-dd");
        firstInDateChooser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(firstInDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 30));

        firstNameValidateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameValidateLabel.setForeground(new java.awt.Color(153, 0, 0));
        firstNameValidateLabel.setText("First Name is incorrect");
        firstNameValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        firstNameValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        firstNameValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(firstNameValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, 15));

        lastNameValidateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameValidateLabel.setForeground(new java.awt.Color(153, 0, 0));
        lastNameValidateLabel.setText("Last Name is incorrect");
        lastNameValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        lastNameValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        lastNameValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(lastNameValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 200, 15));

        contactNumberValidateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactNumberValidateLabel.setForeground(new java.awt.Color(153, 0, 0));
        contactNumberValidateLabel.setText("Contact Number is incorrect");
        contactNumberValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        contactNumberValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        contactNumberValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(contactNumberValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 200, 15));

        TitlePanelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/titleGlass.png"))); // NOI18N
        TitlePanelLabel.setIconTextGap(0);
        jPanel1.add(TitlePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/saveOut.png"))); // NOI18N
        doneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneLabel.setIconTextGap(0);
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneLabelMouseExited(evt);
            }
        });
        jPanel1.add(doneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 150, 50));

        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"))); // NOI18N
        cancelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLabel.setIconTextGap(0);
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });
        jPanel1.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 50));

        ButtonPanelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        ButtonPanelLabel.setIconTextGap(0);
        jPanel1.add(ButtonPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 540, 75));

        BodyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backgroundsmall.jpg"))); // NOI18N
        BodyLabel.setIconTextGap(0);
        jPanel1.add(BodyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseEntered
         doneLabel.setIcon(saveEnter);
    }//GEN-LAST:event_doneLabelMouseEntered

    private void doneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseExited
         doneLabel.setIcon(saveOut);
    }//GEN-LAST:event_doneLabelMouseExited

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
         this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
         cancelLabel.setIcon(cancelEnter);
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
         cancelLabel.setIcon(cancelOut);
    }//GEN-LAST:event_cancelLabelMouseExited

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked
        
        HandleClient hc = new HandleClient();               
        ValidateClient vc = new ValidateClient();
        
        
        if (firstNameText.getText().equalsIgnoreCase("") || lastNameText.getText().equalsIgnoreCase("") || contactNumberText.getText().equalsIgnoreCase("") ) {
            
            JOptionPane.showMessageDialog(null, "All fields are required.", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }        
        else{ 
              if (vc.validateName(firstNameText.getText()) && vc.validateName(lastNameText.getText()) && vc.validateContactNumber(contactNumberText.getText())) {
                
                hc.setClientID(this.selectedClientID);
                hc.setFirstName(vc.capitalizeFirstLetter(firstNameText.getText().trim())); 
                hc.setLastName(vc.capitalizeFirstLetter(lastNameText.getText().trim()));
                hc.setContactNumber(contactNumberText.getText().trim()); 
                
                 try{                
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date= sdf.format(firstInDateChooser.getDate());
                
                    hc.setFirstInDate(date);
                    
                    
                    try{
                        int i = hc.updateClient();
                        if (i!=0) {
                            JOptionPane.showMessageDialog(null, "Client has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "This record cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                            this.dispose();
                        }
            
                    }
                    catch(SQLIntegrityConstraintViolationException ex){
                        JOptionPane.showMessageDialog(null, "Some of data is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
                    } 
                    catch(DataTruncation ex){
                        JOptionPane.showMessageDialog(null, "Some fields have exceeded the maximum number of characters.", "DataTruncation", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(ClassNotFoundException ex){
                        JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
                    } 
                    catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    
                }
                catch(NullPointerException ex){
                    JOptionPane.showMessageDialog(null, "All fields are required.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                 
                
                 
                 
                
              }
              else{
                  
                  if (!vc.validateName(firstNameText.getText())) {
                    firstNameValidateLabel.setVisible(true); 
                  }
                  if (!vc.validateName(lastNameText.getText())) {
                    lastNameValidateLabel.setVisible(true);            
                  }
                  if (!vc.validateContactNumber(contactNumberText.getText())) {
                    contactNumberValidateLabel.setVisible(true);            
                  }
                  
              }
            
        }
        
        
        
        
    }//GEN-LAST:event_doneLabelMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateClient dialog = new UpdateClient(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BodyLabel;
    private javax.swing.JLabel ButtonPanelLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitlePanelLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JTextField contactNumberText;
    private javax.swing.JLabel contactNumberValidateLabel;
    private javax.swing.JLabel doneLabel;
    private com.toedter.calendar.JDateChooser firstInDateChooser;
    private javax.swing.JLabel firstInDateLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel firstNameValidateLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel lastNameValidateLabel;
    // End of variables declaration//GEN-END:variables

    
}
