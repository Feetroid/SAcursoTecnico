/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastime.cash;

/**
 *
 * @author eric_massaneiro
 */
public class Créditos extends javax.swing.JFrame {

    /**
     * Creates new form Créditos
     */
    public Créditos() {
        initComponents();
         setSize(480, 355);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        site = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/voltar pagina branco.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        site.setForeground(new java.awt.Color(204, 255, 255));
        site.setText("mobbyentertainment.wixsite.com/mobby");
        getContentPane().add(site, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 340, -1));

        texto5.setForeground(new java.awt.Color(255, 255, 255));
        texto5.setText("Mais informações em:");
        texto5.setToolTipText("");
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 330, -1));

        texto4.setForeground(new java.awt.Color(255, 255, 255));
        texto4.setText("Gabriel Felipe Junkes");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, -1));

        texto3.setForeground(new java.awt.Color(255, 255, 255));
        texto3.setText("Eric Henrique Massaneiro");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 220, -1));

        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setText("Elisabeth Cecilia de Mello");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 310, -1));

        texto1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        texto1.setForeground(new java.awt.Color(255, 255, 255));
        texto1.setText("Software desenvolvido pela empresa Mobby©");
        texto1.setToolTipText("");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 330, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desenvolvedores:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/Logo mobby formatada.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, 100));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/fundo creditos.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    Lobby lobby = new Lobby();
        dispose();
    lobby.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Créditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Créditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Créditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Créditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Créditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel site;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    // End of variables declaration//GEN-END:variables
}
