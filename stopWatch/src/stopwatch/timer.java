/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Toby
 */
public class timer extends javax.swing.JFrame {

    public static boolean incrementStopwatch = false;
    public static boolean incrementTimer = false;
    public static int timerRunTimeInMILLIS = 0;
    
    public void countDown() throws InterruptedException {
        
        setHoursTxt.setVisible(false);
        setMinTxt.setVisible(false);
        setSecondsTxt.setVisible(false);
        confirm.setVisible(false);
        setTimeTxt.setVisible(false);
        timerValueSECONDS.setVisible(false);
        timerValueMINS.setVisible(false);
        timerValueHOURS.setVisible(false);
        timerValueColon1.setVisible(false);
        timerValueColon2.setVisible(false);
        pauseTIMEer.setVisible(false);
        
        while (true) {
            TimeUnit.MILLISECONDS.sleep(10);
            
            //STOPWATCH
            if(incrementStopwatch == true){
                if(millisecondsText.getText().equals("99")){
                    millisecondsText.setText("0");
                    if(secondsText.getText().equals("59 s")){
                        secondsText.setText("0 s");
                        minText.setText(String.valueOf(Integer.valueOf(minText.getText().substring(0, minText.getText().length()-2))+1) + " m");
                    }else{
                        secondsText.setText(String.valueOf(Integer.valueOf(secondsText.getText().substring(0, secondsText.getText().length()-2))+1) + " s");
                    }
                    
                }else{
                    millisecondsText.setText(String.valueOf(Integer.valueOf(millisecondsText.getText())+1));
                }
            }
           
            
            //TIMER
            if(incrementTimer){
                timerRunTimeInMILLIS += 10;
                
                if(((timerRunTimeInMILLIS + 10) % 1000 == 0)    &&  (!timerValueHOURS.getText().equals("0") || !timerValueMINS.getText().equals("0") || !timerValueSECONDS.getText().equals("0") ) ){
                
                if(Integer.valueOf(timerValueSECONDS.getText()) <= 0){
                    if(Integer.valueOf(timerValueMINS.getText()) > 0){
                        timerValueMINS.setText(String.valueOf(Integer.valueOf(timerValueMINS.getText())-1) );
                        timerValueSECONDS.setText("59");
                    }else if (Integer.valueOf(timerValueHOURS.getText()) > 0){
                        timerValueHOURS.setText(String.valueOf(Integer.valueOf(timerValueHOURS.getText())-1) );
                        timerValueSECONDS.setText("59");
                        timerValueMINS.setText("59");
                    }
                }else{
                    timerValueSECONDS.setText(String.valueOf(Integer.valueOf(timerValueSECONDS.getText())-1) );
                }
            }
                
            }
            
            
            
            
        }
    }
    
    
    /** Creates new form timer */
    public timer() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minText = new javax.swing.JLabel();
        startStopButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        stopwatchButton = new javax.swing.JButton();
        timerButton = new javax.swing.JButton();
        millisecondsText = new javax.swing.JLabel();
        secondsText = new javax.swing.JLabel();
        setHoursTxt = new javax.swing.JTextField();
        setTimeTxt = new javax.swing.JLabel();
        setSecondsTxt = new javax.swing.JTextField();
        setMinTxt = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        timerValueSECONDS = new javax.swing.JLabel();
        timerValueMINS = new javax.swing.JLabel();
        timerValueColon2 = new javax.swing.JLabel();
        timerValueHOURS = new javax.swing.JLabel();
        timerValueColon1 = new javax.swing.JLabel();
        pauseTIMEer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        minText.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        minText.setText("0 m");
        getContentPane().add(minText);
        minText.setBounds(20, 80, 190, 92);

        startStopButton.setBackground(new java.awt.Color(51, 153, 255));
        startStopButton.setForeground(new java.awt.Color(240, 240, 240));
        startStopButton.setText("Start");
        startStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStopButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startStopButton);
        startStopButton.setBounds(60, 180, 80, 30);

        resetButton.setBackground(new java.awt.Color(204, 204, 204));
        resetButton.setForeground(new java.awt.Color(102, 102, 102));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton);
        resetButton.setBounds(140, 180, 80, 30);

        stopwatchButton.setBackground(new java.awt.Color(236, 236, 236));
        stopwatchButton.setForeground(new java.awt.Color(102, 102, 102));
        stopwatchButton.setText("Stopwatch");
        stopwatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stopwatchButton);
        stopwatchButton.setBounds(170, 30, 120, 20);

        timerButton.setBackground(new java.awt.Color(236, 236, 236));
        timerButton.setForeground(new java.awt.Color(102, 102, 102));
        timerButton.setText("Timer");
        timerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(timerButton);
        timerButton.setBounds(40, 30, 120, 20);

        millisecondsText.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        millisecondsText.setText("0");
        getContentPane().add(millisecondsText);
        millisecondsText.setBounds(310, 80, 130, 100);

        secondsText.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        secondsText.setText("0 s");
        getContentPane().add(secondsText);
        secondsText.setBounds(180, 80, 130, 92);

        setHoursTxt.setText("00");
        getContentPane().add(setHoursTxt);
        setHoursTxt.setBounds(110, 60, 20, 20);

        setTimeTxt.setText("Set time:               :         :");
        getContentPane().add(setTimeTxt);
        setTimeTxt.setBounds(40, 60, 140, 20);

        setSecondsTxt.setText("00");
        getContentPane().add(setSecondsTxt);
        setSecondsTxt.setBounds(170, 60, 20, 20);

        setMinTxt.setText("00");
        getContentPane().add(setMinTxt);
        setMinTxt.setBounds(140, 60, 20, 20);

        confirm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm);
        confirm.setBounds(200, 60, 70, 20);

        timerValueSECONDS.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        timerValueSECONDS.setText("00");
        getContentPane().add(timerValueSECONDS);
        timerValueSECONDS.setBounds(250, 80, 130, 100);

        timerValueMINS.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        timerValueMINS.setText("00");
        getContentPane().add(timerValueMINS);
        timerValueMINS.setBounds(150, 80, 80, 100);

        timerValueColon2.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        timerValueColon2.setText(":");
        getContentPane().add(timerValueColon2);
        timerValueColon2.setBounds(220, 70, 30, 110);

        timerValueHOURS.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        timerValueHOURS.setText("00");
        getContentPane().add(timerValueHOURS);
        timerValueHOURS.setBounds(60, 80, 70, 100);

        timerValueColon1.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        timerValueColon1.setText(":");
        getContentPane().add(timerValueColon1);
        timerValueColon1.setBounds(130, 70, 30, 110);

        pauseTIMEer.setBackground(new java.awt.Color(51, 153, 255));
        pauseTIMEer.setForeground(new java.awt.Color(240, 240, 240));
        pauseTIMEer.setText("Start");
        pauseTIMEer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseTIMEerActionPerformed(evt);
            }
        });
        getContentPane().add(pauseTIMEer);
        pauseTIMEer.setBounds(60, 180, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStopButtonActionPerformed
        if(startStopButton.getText().equalsIgnoreCase("start")){
            startStopButton.setText("Stop");
            incrementStopwatch = true;
        }else{
            startStopButton.setText("Start");
            incrementStopwatch = false;
        }
            
    }//GEN-LAST:event_startStopButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        minText.setText("0 m");
        millisecondsText.setText("0");
        secondsText.setText("0 s");
        startStopButton.setText("Start");
        incrementStopwatch = false;
    }//GEN-LAST:event_resetButtonActionPerformed

    private void stopwatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatchButtonActionPerformed
        minText.setVisible(true);
        millisecondsText.setVisible(true);
        secondsText.setVisible(true);
        startStopButton.setVisible(true);
        resetButton.setVisible(true);
        
        setHoursTxt.setVisible(false);
        setMinTxt.setVisible(false);
        setSecondsTxt.setVisible(false);
        confirm.setVisible(false);
        setTimeTxt.setVisible(false);
        timerValueSECONDS.setVisible(false);
        timerValueSECONDS.setVisible(false);
        timerValueMINS.setVisible(false);
        timerValueHOURS.setVisible(false);
        timerValueColon1.setVisible(false);
        timerValueColon2.setVisible(false);
        pauseTIMEer.setVisible(false);
    }//GEN-LAST:event_stopwatchButtonActionPerformed

    private void timerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerButtonActionPerformed
        minText.setVisible(false);
        millisecondsText.setVisible(false);
        secondsText.setVisible(false);
        startStopButton.setVisible(false);
        resetButton.setVisible(false);
        
        setHoursTxt.setVisible(true);
        setMinTxt.setVisible(true);
        setSecondsTxt.setVisible(true);
        confirm.setVisible(true);
        setTimeTxt.setVisible(true);
        timerValueSECONDS.setVisible(true);
        timerValueSECONDS.setVisible(true);
        timerValueMINS.setVisible(true);
        timerValueHOURS.setVisible(true);
        timerValueColon1.setVisible(true);
        timerValueColon2.setVisible(true);
        pauseTIMEer.setVisible(true);
    }//GEN-LAST:event_timerButtonActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        try{
            int seconds = Integer.valueOf(setSecondsTxt.getText());
            int mins = Integer.valueOf(setMinTxt.getText());
            int hours = Integer.valueOf(setHoursTxt.getText());
            if(seconds > 59){
                seconds = 59;
            }
            if(mins > 59){
                mins = 59;
            }
            if(hours > 99){
                hours  = 99;
            }
            timerValueSECONDS.setText(String.valueOf(seconds));
            timerValueMINS.setText(String.valueOf(mins));
            timerValueHOURS.setText(String.valueOf(hours));
        }catch(NumberFormatException e){
            System.out.println("ERROR: "+ e);
        }
        setSecondsTxt.setText("00");
        setMinTxt.setText("00");
        setHoursTxt.setText("00");
        
        timerRunTimeInMILLIS = 0;
        
    }//GEN-LAST:event_confirmActionPerformed

    private void pauseTIMEerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseTIMEerActionPerformed
        if(pauseTIMEer.getText().equalsIgnoreCase("start")){
            pauseTIMEer.setText("Stop");
            incrementTimer = true;
        }else{
            pauseTIMEer.setText("Start");
            incrementTimer = false;
        }
    }//GEN-LAST:event_pauseTIMEerActionPerformed


    
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
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel millisecondsText;
    private javax.swing.JLabel minText;
    private javax.swing.JButton pauseTIMEer;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel secondsText;
    private javax.swing.JTextField setHoursTxt;
    private javax.swing.JTextField setMinTxt;
    private javax.swing.JTextField setSecondsTxt;
    private javax.swing.JLabel setTimeTxt;
    private javax.swing.JButton startStopButton;
    private javax.swing.JButton stopwatchButton;
    private javax.swing.JButton timerButton;
    private javax.swing.JLabel timerValueColon1;
    private javax.swing.JLabel timerValueColon2;
    private javax.swing.JLabel timerValueHOURS;
    private javax.swing.JLabel timerValueMINS;
    private javax.swing.JLabel timerValueSECONDS;
    // End of variables declaration//GEN-END:variables

}