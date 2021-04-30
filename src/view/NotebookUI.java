
package view;

import control.Controller;
import java.awt.Color;
import java.awt.Font;


public class NotebookUI extends javax.swing.JFrame {

    private static final int WIDTH_ = 900;
    private static final int HEIGHT_ = 600;
    private final String TITLE = "NoteBook";
    boolean elsosor;
    Controller controller;
    
    public NotebookUI() {
        initComponents();
        init();
    }

    private void init(){
        this.setSize(WIDTH_, HEIGHT_);
        this.setTitle(TITLE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnSave_as = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnUndo = new javax.swing.JMenuItem();
        mnRedo = new javax.swing.JMenuItem();
        mnCut = new javax.swing.JMenuItem();
        mnCopy = new javax.swing.JMenuItem();
        mnPaste = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnWordWrap = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnS8 = new javax.swing.JMenuItem();
        mnS12 = new javax.swing.JMenuItem();
        mnS16 = new javax.swing.JMenuItem();
        mnS20 = new javax.swing.JMenuItem();
        mnS24 = new javax.swing.JMenuItem();
        mnS28 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnArial = new javax.swing.JMenuItem();
        mnComic_San_MS = new javax.swing.JMenuItem();
        mnDialog = new javax.swing.JMenuItem();
        mnHelvetica = new javax.swing.JMenuItem();
        mnMSGothic = new javax.swing.JMenuItem();
        mnTimesRoman = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnWhite = new javax.swing.JMenuItem();
        mnBlack = new javax.swing.JMenuItem();
        mnBlue = new javax.swing.JMenuItem();
        mnRed = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tArea.setColumns(20);
        tArea.setRows(5);
        jScrollPane1.setViewportView(tArea);

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnNew);

        mnOpen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnOpen.setText("Open");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnOpen);

        mnSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);

        mnSave_as.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnSave_as.setText("Save as");
        mnSave_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSave_asActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave_as);

        mnExit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnUndo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnUndo.setText("Undo");
        jMenu2.add(mnUndo);

        mnRedo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnRedo.setText("Redo");
        jMenu2.add(mnRedo);

        mnCut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnCut.setText("Cut");
        jMenu2.add(mnCut);

        mnCopy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnCopy.setText("Copy");
        jMenu2.add(mnCopy);

        mnPaste.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnPaste.setText("Paste");
        mnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPasteActionPerformed(evt);
            }
        });
        jMenu2.add(mnPaste);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Format");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnWordWrap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnWordWrap.setText("Word Wrap: Ott");
        mnWordWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnWordWrapActionPerformed(evt);
            }
        });
        jMenu4.add(mnWordWrap);

        jMenu5.setText("Font Size");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnS8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS8.setText("8");
        mnS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS8ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS8);

        mnS12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS12.setText("12");
        mnS12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS12ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS12);

        mnS16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS16.setText("16");
        mnS16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS16ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS16);

        mnS20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS20.setText("20");
        mnS20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS20ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS20);

        mnS24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS24.setText("24");
        mnS24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS24ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS24);

        mnS28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnS28.setText("28");
        mnS28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnS28ActionPerformed(evt);
            }
        });
        jMenu5.add(mnS28);

        jMenu4.add(jMenu5);

        jMenu7.setText("Font ");
        jMenu7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnArial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnArial.setText("Arial");
        mnArial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArialActionPerformed(evt);
            }
        });
        jMenu7.add(mnArial);

        mnComic_San_MS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnComic_San_MS.setText("Comic Sans MS");
        mnComic_San_MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnComic_San_MSActionPerformed(evt);
            }
        });
        jMenu7.add(mnComic_San_MS);

        mnDialog.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnDialog.setText("Dialog");
        mnDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDialogActionPerformed(evt);
            }
        });
        jMenu7.add(mnDialog);

        mnHelvetica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnHelvetica.setText("Helvetica");
        mnHelvetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHelveticaActionPerformed(evt);
            }
        });
        jMenu7.add(mnHelvetica);

        mnMSGothic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnMSGothic.setText("MS Gothic");
        mnMSGothic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMSGothicActionPerformed(evt);
            }
        });
        jMenu7.add(mnMSGothic);

        mnTimesRoman.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnTimesRoman.setText("Times New Roman ");
        mnTimesRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTimesRomanActionPerformed(evt);
            }
        });
        jMenu7.add(mnTimesRoman);

        jMenu4.add(jMenu7);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Color");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mnWhite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnWhite.setText("White");
        mnWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnWhiteActionPerformed(evt);
            }
        });
        jMenu6.add(mnWhite);

        mnBlack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnBlack.setText("Black");
        mnBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBlackActionPerformed(evt);
            }
        });
        jMenu6.add(mnBlack);

        mnBlue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnBlue.setText("Blue");
        mnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBlueActionPerformed(evt);
            }
        });
        jMenu6.add(mnBlue);

        mnRed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mnRed.setText("Red");
        mnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRedActionPerformed(evt);
            }
        });
        jMenu6.add(mnRed);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        elsosor = true;
        controller.openFile();
    }//GEN-LAST:event_mnOpenActionPerformed

    private void mnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPasteActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        this.del();
        this.setTitle("New");
        controller.newFile();
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnSave_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSave_asActionPerformed
        controller.saveAsFile();
    }//GEN-LAST:event_mnSave_asActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        controller.exitFile();
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        controller.saveFile();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnWordWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnWordWrapActionPerformed
        controller.wrapFormat();
    }//GEN-LAST:event_mnWordWrapActionPerformed

    private void mnS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS8ActionPerformed
        controller.generateFont(8);
    }//GEN-LAST:event_mnS8ActionPerformed

    private void mnComic_San_MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnComic_San_MSActionPerformed
        controller.setFont(Controller.FONTNAME.COMIC);
    }//GEN-LAST:event_mnComic_San_MSActionPerformed

    private void mnArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArialActionPerformed
        controller.setFont(Controller.FONTNAME.ARIAL);
    }//GEN-LAST:event_mnArialActionPerformed

    private void mnDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDialogActionPerformed
        controller.setFont(Controller.FONTNAME.DIALOG);
    }//GEN-LAST:event_mnDialogActionPerformed

    private void mnHelveticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHelveticaActionPerformed
        controller.setFont(Controller.FONTNAME.HELVETICA);
    }//GEN-LAST:event_mnHelveticaActionPerformed

    private void mnMSGothicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMSGothicActionPerformed
        controller.setFont(Controller.FONTNAME.MGOTHIC);
    }//GEN-LAST:event_mnMSGothicActionPerformed

    private void mnTimesRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTimesRomanActionPerformed
        controller.setFont(Controller.FONTNAME.TIMES);
    }//GEN-LAST:event_mnTimesRomanActionPerformed

    private void mnS12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS12ActionPerformed
        controller.generateFont(12);
    }//GEN-LAST:event_mnS12ActionPerformed

    private void mnS16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS16ActionPerformed
        controller.generateFont(16);
    }//GEN-LAST:event_mnS16ActionPerformed

    private void mnS20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS20ActionPerformed
        controller.generateFont(20);
    }//GEN-LAST:event_mnS20ActionPerformed

    private void mnS24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS24ActionPerformed
        controller.generateFont(24);
    }//GEN-LAST:event_mnS24ActionPerformed

    private void mnS28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnS28ActionPerformed
        controller.generateFont(26);
    }//GEN-LAST:event_mnS28ActionPerformed

    private void mnWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnWhiteActionPerformed
        controller.setColor(Controller.COLORNAME.WHITE);
    }//GEN-LAST:event_mnWhiteActionPerformed

    private void mnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBlackActionPerformed
        controller.setColor(Controller.COLORNAME.BLACK);
    }//GEN-LAST:event_mnBlackActionPerformed

    private void mnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBlueActionPerformed
        controller.setColor(Controller.COLORNAME.BLUE);
    }//GEN-LAST:event_mnBlueActionPerformed

    private void mnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRedActionPerformed
        controller.setColor(Controller.COLORNAME.RED);
    }//GEN-LAST:event_mnRedActionPerformed

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
            java.util.logging.Logger.getLogger(NotebookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotebookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotebookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotebookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotebookUI().start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnArial;
    private javax.swing.JMenuItem mnBlack;
    private javax.swing.JMenuItem mnBlue;
    private javax.swing.JMenuItem mnComic_San_MS;
    private javax.swing.JMenuItem mnCopy;
    private javax.swing.JMenuItem mnCut;
    private javax.swing.JMenuItem mnDialog;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnHelvetica;
    private javax.swing.JMenuItem mnMSGothic;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnPaste;
    private javax.swing.JMenuItem mnRed;
    private javax.swing.JMenuItem mnRedo;
    private javax.swing.JMenuItem mnS12;
    private javax.swing.JMenuItem mnS16;
    private javax.swing.JMenuItem mnS20;
    private javax.swing.JMenuItem mnS24;
    private javax.swing.JMenuItem mnS28;
    private javax.swing.JMenuItem mnS8;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnSave_as;
    private javax.swing.JMenuItem mnTimesRoman;
    private javax.swing.JMenuItem mnUndo;
    private javax.swing.JMenuItem mnWhite;
    private javax.swing.JMenuItem mnWordWrap;
    private javax.swing.JTextArea tArea;
    // End of variables declaration//GEN-END:variables

    private void start(){
        setVisible(true);
        controller = new Controller(this);
    }
    
    public void del(){
        this.tArea.setText("");
    }
    
    public  void cimkeIr(String cimke){
        this.setTitle(cimke);
    }
    
    public void sortIr(String sor){
        if (!elsosor){
            tArea.append("\n");
        }
        tArea.append(sor);
        elsosor = false;
    }
    
    public String olvas(){
        return tArea.getText();
    }
    
    public void wordWrapOn(){
        tArea.setLineWrap(true);
        tArea.setWrapStyleWord(true);
        mnWordWrap.setText("Word Wrap: On");
    }
    
    public void wordWrapOff(){
        tArea.setLineWrap(false);
        tArea.setWrapStyleWord(false);
        mnWordWrap.setText("Word Wrap: Off");
    }
    
    public void setFont_(Font font){
        tArea.setFont(font);
    }
    
    public void setColor(Color color, Color fColor){
        this.getContentPane().setBackground(color);
        tArea.setBackground(color);
        tArea.setForeground(fColor);
    }
}
