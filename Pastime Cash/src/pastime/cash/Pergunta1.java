/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastime.cash;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eric_massaneiro
 */
public class Pergunta1 extends javax.swing.JFrame {
    public static boolean finalizar;
    public static int agitacao=0, calmaria=0, natureza=0, cidade=0, esportesCBola=0, esportesSBola=0;
    /**
     * Creates new form Pergunta1
     */
    
    public void DecideHobbies(){
    if (esportesCBola>esportesSBola){
                ArmazenaUsuario.basquete=true;
                ArmazenaUsuario.futebol=true;
                ArmazenaUsuario.volei=true;
                ArmazenaUsuario.tenis=true;
            }else if (esportesSBola>esportesCBola){
                ArmazenaUsuario.basquete=false;
                ArmazenaUsuario.futebol=false;
                ArmazenaUsuario.volei=false;
                ArmazenaUsuario.tenis=false;
                ArmazenaUsuario.natacao=true;
                ArmazenaUsuario.ciclismo=true;
            }else if (esportesSBola==esportesCBola){
                ArmazenaUsuario.basquete=true;
                ArmazenaUsuario.futebol=true;
                ArmazenaUsuario.volei=true;
                ArmazenaUsuario.tenis=true;
                ArmazenaUsuario.natacao=true;
                ArmazenaUsuario.ciclismo=true;
            }
            if (calmaria>agitacao){
               ArmazenaUsuario.passeio=true;
               ArmazenaUsuario.corrida=false;
           }
           if (agitacao>calmaria){
               ArmazenaUsuario.corrida=true;
               ArmazenaUsuario.passeio=false;
           }else {
               ArmazenaUsuario.corrida=true;
               ArmazenaUsuario.passeio=true;
           }
    }
    
    public Pergunta1() {
        initComponents();
        finalizar=false;
        ArmazenaUsuario.basquete=false;
        ArmazenaUsuario.futebol=false;
        ArmazenaUsuario.volei=false;
        ArmazenaUsuario.tenis=false;
        ArmazenaUsuario.natacao=false;
        ArmazenaUsuario.ciclismo=false;
        ArmazenaUsuario.corrida=false;
        ArmazenaUsuario.caminhada=false;
        ArmazenaUsuario.trilha=false;
        ArmazenaUsuario.passeio=false;
    
    alternativa3.setVisible(false);
     alternativa4.setVisible(false);
     alternativa5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        alternativa3 = new javax.swing.JRadioButton();
        alternativa4 = new javax.swing.JRadioButton();
        alternativa5 = new javax.swing.JRadioButton();
        alternativa1 = new javax.swing.JRadioButton();
        alternativa2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Branco = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alternativa3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(alternativa3);
        alternativa3.setText("Esportes com bola");
        getContentPane().add(alternativa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        alternativa4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(alternativa4);
        alternativa4.setText("Esportes sem bola");
        getContentPane().add(alternativa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        alternativa5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(alternativa5);
        alternativa5.setText("Tanto faz");
        getContentPane().add(alternativa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        buttonGroup1.add(alternativa1);
        alternativa1.setText("Sair");
        alternativa1.setContentAreaFilled(false);
        alternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativa1ActionPerformed(evt);
            }
        });
        getContentPane().add(alternativa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        buttonGroup1.add(alternativa2);
        alternativa2.setText("Ficar em casa");
        alternativa2.setContentAreaFilled(false);
        getContentPane().add(alternativa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Próxima");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Você prefere:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/Fundo Quiz Perguntas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        buttonGroup1.add(Branco);
        Branco.setText("jRadioButton1");
        getContentPane().add(Branco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativa1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    String texto1 = alternativa1.getText();
    String texto2 = alternativa2.getText();
    
    
    if(alternativa1.isSelected() || alternativa2.isSelected() || alternativa3.isSelected() || alternativa4.isSelected() || alternativa5.isSelected()){      
        // esse if serve para saber se ele esta na ultima questão e entao enviar os hobbies
        if (finalizar==true){         
            Lobby lobby = new Lobby();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado!");
            dispose();
            lobby.setVisible(true);
        }
 
    if((texto1.equals("Sair"))&&(texto2.equals("Ficar em casa"))){
        alternativa1.setText("Natureza");
        alternativa2.setText("Cidade");
        if (alternativa1.isSelected()){
            agitacao=+1;
        }else {
            calmaria=+1;
            
        }
    }else if((texto1.equals("Natureza"))&&(texto2.equals("Cidade"))){
        alternativa1.setText("Cinema");
        alternativa2.setText("Balada");
        if (alternativa1.isSelected()){
            natureza=+1;
        }else {
            cidade=+1;
        }
    }else if((texto1.equals("Cinema"))&&(texto2.equals("Balada"))){
        alternativa1.setText("Ler livros");
        alternativa2.setText("Ver filmes");
        if (alternativa1.isSelected()){
            calmaria=+1;
        }else {
            agitacao=+1;
        }
    }else if ((texto1.equals("Ler livros"))&&(texto2.equals("Ver filmes"))){
        alternativa1.setText("Praticar esportes");
        alternativa2.setText("Ficar deitado no sofá");
        if (alternativa1.isSelected()){
            calmaria=+1;
        }else {
            agitacao=+1;
        }
    }else if((texto1.equals("Praticar esportes"))&&(texto2.equals("Ficar deitado no sofá"))){
        alternativa1.setText("Gastar tudo em compras");
        alternativa2.setText("Economizar para viajar");  
        // Aqui ta invertido, mais pra ter q escrever ao contrario
        if (alternativa2.isSelected()){
            calmaria=+1;
        }else {
            agitacao=+1;
        }
    }else if((texto1.equals("Gastar tudo em compras"))&&(texto2.equals("Economizar para viajar"))){
     alternativa1.setVisible(false);
     alternativa2.setVisible(false);
     alternativa3.setVisible(true);
     alternativa4.setVisible(true);
     alternativa5.setVisible(true);
     if (alternativa3.isSelected()){
         esportesCBola=1;
     }else if (alternativa4.isSelected()){
         esportesSBola=1;
     }else if (alternativa5.isSelected()){
         esportesCBola=1;
         esportesSBola=1;
     }
     jButton1.setText("Finalizar");
     jButton1.setBackground(Color.green);
     finalizar = true;
     
    }
    
    
        
    
    }else {
        JOptionPane.showMessageDialog(null,"Para prosseguir selecione uma das alternativas!");
    }
    if (finalizar==true){
            DecideHobbies(); 
    }
    Branco.setSelected(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pergunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pergunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Branco;
    private javax.swing.JRadioButton alternativa1;
    private javax.swing.JRadioButton alternativa2;
    private javax.swing.JRadioButton alternativa3;
    private javax.swing.JRadioButton alternativa4;
    private javax.swing.JRadioButton alternativa5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
