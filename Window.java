
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirtysearch;

import java.awt.TextArea;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Matt
 */
public class Window extends javax.swing.JFrame {
    Search search = new Search();
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldSEARCH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEXTN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSEARCH = new javax.swing.JButton();
        jTextFieldPARSE = new java.awt.TextArea();
        textArea1 = new java.awt.TextArea();
        label1 = new java.awt.Label();
        jTextFieldRESULT = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIRTY SEARCH - By Matt Barker");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.textHighlight);
        jLabel1.setText("Search String:");

        jTextFieldSEARCH.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jTextFieldSEARCH.setForeground(java.awt.Color.red);
        jTextFieldSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSEARCHActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.textHighlight);
        jLabel2.setText("File Extn:");

        jTextFieldEXTN.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jTextFieldEXTN.setForeground(java.awt.Color.red);
        jTextFieldEXTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEXTNActionPerformed(evt);
            }
        });
        jTextFieldEXTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEXTNKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEXTNKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.textHighlight);
        jLabel3.setText("Parse:");

        jButtonSEARCH.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jButtonSEARCH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSEARCH.setForeground(java.awt.SystemColor.textHighlight);
        jButtonSEARCH.setText("Search");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jTextFieldPARSE.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jTextFieldPARSE.setEditable(false);
        jTextFieldPARSE.setForeground(java.awt.SystemColor.textHighlight);

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setForeground(java.awt.SystemColor.textHighlight);
        label1.setText("Result:");

        jTextFieldRESULT.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        jTextFieldRESULT.setEditable(false);
        jTextFieldRESULT.setForeground(java.awt.SystemColor.textHighlight);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldRESULT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPARSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEXTN, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                            .addComponent(jButtonSEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEXTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonSEARCH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPARSE, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRESULT, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTextFieldSEARCHActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
      
        
    }                                                

    private void jTextFieldEXTNActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
             String input = jTextFieldEXTN.getText().toLowerCase();
       jTextFieldEXTN.setText(input);
        
        jTextFieldPARSE.setText("");
        jTextFieldRESULT.setText("");
        
        
        File[] files = search.listFiles(this);
        search.parseFiles(files);
        System.out.println(files.toString());
    }                                             

    private void jTextFieldEXTNKeyTyped(java.awt.event.KeyEvent evt) {                                        
     
               
    }                                       

    private void jTextFieldEXTNKeyPressed(java.awt.event.KeyEvent evt) {                                          
        // TODO add your handling code here:
        
    
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
             
            }
        });
    }
    


    public TextArea getjTextFieldRESULT() {
        return jTextFieldRESULT;
    }

    public void setjTextFieldRESULT(String result) {
        jTextFieldRESULT.setText(result);
    }

  

    public String getjTextFieldEXTN() {
       String string = jTextFieldEXTN.getText();
       return string;
    }

    public void setjTextFieldEXTN(String string) {
        jTextFieldEXTN.setText(string);
    }

    public String getjTextFieldSEARCH() {
        String string = jTextFieldSEARCH.getText();
        return string;
    }

    public void setjTextFieldSEARCH(String string) {
      jTextFieldSEARCH.setText(string);
    }



    public void setjTextFieldPARSE(ArrayList<String> names) {
     
        
      for(String n : names){
           
     String current = jTextFieldPARSE.getText();
          jTextFieldPARSE.setText(current + "\n" + n);
      }  
  
    }

    
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldEXTN;
    private java.awt.TextArea jTextFieldPARSE;
    private java.awt.TextArea jTextFieldRESULT;
    private javax.swing.JTextField jTextFieldSEARCH;
    private java.awt.Label label1;
    private java.awt.TextArea textArea1;
    // End of variables declaration                   
}
