/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastime.cash;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author elisabeth_mello
 */
public final class Perfil extends javax.swing.JFrame {
 public static int contadora;
 public static int contadora1;
 public static String nome;
public static String nascimento;
public static String sexo;
public static String diretorio;
 
 /**
     * Creates new form Perfil
     */

    public void AtualizaImagem(boolean botao){
        if (botao==true){    
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Importar imagem");
            fileChooser.setFileSelectionMode(seletor.FILES_ONLY);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg","png");
            fileChooser.setFileFilter(filter);
            int retorno = fileChooser.showOpenDialog(this);
            if(retorno == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               jLabel7.setText(file.getPath());
               ImageIcon icon = new ImageIcon(file.getPath());
               icon.setImage(icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), 1)); 
               jLabel5.setIcon(icon);
               diretorio=(file.getPath());
            }
        }
    }

    public void AtualizaDados(){
        txtUsuario.setText(ArmazenaUsuario.usuario);
        txtNome.setText(ArmazenaUsuario.nome);
        jLabel7.setText(ArmazenaUsuario.imagemDiretorio);
        if (ArmazenaUsuario.imagemDiretorio!=null){
        ImageIcon icon = new ImageIcon(ArmazenaUsuario.imagemDiretorio);
        icon.setImage(icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), 1));
        jLabel5.setIcon(icon);
        }
        
        if (ArmazenaUsuario.sexo==null){
            txtSexo.setText("Sexo: Não informado");
        }else {
            txtSexo.setText("Sexo: "+ArmazenaUsuario.sexo );
        }
        if (ArmazenaUsuario.nascimento==null){
            txtNasc.setText("Nasceu em: Não informado");
        }else {
            txtNasc.setText("Nasceu em: "+ArmazenaUsuario.nascimento );
        }
    }
    
    public void Hobbies(){
        if (ArmazenaUsuario.basquete){
            xBasquete.setVisible(false);
        }else {
            xBasquete.setVisible(true);
        }
        if (ArmazenaUsuario.futebol){
            xFutebol.setVisible(false);
        }else {
            xFutebol.setVisible(true);
        }
        if (ArmazenaUsuario.volei){
            xVolei.setVisible(false);
        }else {
            xVolei.setVisible(true);
        }
        if (ArmazenaUsuario.tenis){
            xTenis.setVisible(false);
        }else {
            xTenis.setVisible(true);
        }
        if (ArmazenaUsuario.natacao){
            xNatacao.setVisible(false);
        }else {
            xNatacao.setVisible(true);
        }
        if (ArmazenaUsuario.ciclismo){
            xCiclismo.setVisible(false);
        }else {
            xCiclismo.setVisible(true);
        }
        if (ArmazenaUsuario.corrida){
            xCorrida.setVisible(false);
        }else {
            xCorrida.setVisible(true);
        }
        if (ArmazenaUsuario.caminhada){
            xCaminhada.setVisible(false);
        }else {
            xCaminhada.setVisible(true);
        }
        if (ArmazenaUsuario.trilha){
            xTrilha.setVisible(false);
        }else {
            xTrilha.setVisible(true);
        }
        if (ArmazenaUsuario.passeio){
            xPasseio.setVisible(false);
        }else {
            xPasseio.setVisible(true);
        }
        
    }
      
    public static String hobbieSelecionado="";  
     
    public Perfil() {
      
        
        initComponents();
        AtualizaDados();
        Hobbies();
        jPanel1.setVisible(false);
        contadora=0;
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
        seletor = new javax.swing.JFileChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdMasc = new javax.swing.JRadioButton();
        rdFem = new javax.swing.JRadioButton();
        bAlterarFoto = new javax.swing.JButton();
        cNascimento = new javax.swing.JFormattedTextField();
        bConcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtxEngrenagem = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtNasc = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        xBasquete = new javax.swing.JLabel();
        jBasquete = new javax.swing.JLabel();
        xFutebol = new javax.swing.JLabel();
        jFutebol = new javax.swing.JLabel();
        xVolei = new javax.swing.JLabel();
        jVolei = new javax.swing.JLabel();
        xTenis = new javax.swing.JLabel();
        jTenis = new javax.swing.JLabel();
        xNatacao = new javax.swing.JLabel();
        jNatacao = new javax.swing.JLabel();
        xCiclismo = new javax.swing.JLabel();
        jCiclismo = new javax.swing.JLabel();
        xCorrida = new javax.swing.JLabel();
        jCorrida = new javax.swing.JLabel();
        xCaminhada = new javax.swing.JLabel();
        jCaminhada = new javax.swing.JLabel();
        xTrilha = new javax.swing.JLabel();
        jTrilha = new javax.swing.JLabel();
        xPasseio = new javax.swing.JLabel();
        jPasseio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/perfill.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/perfill.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, 120));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/voltar pagina branco.png"))); // NOI18N
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cNome.setForeground(new java.awt.Color(204, 204, 204));
        cNome.setText("Editar Nome");
        cNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cNomeFocusLost(evt);
            }
        });
        cNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNomeActionPerformed(evt);
            }
        });
        jPanel1.add(cNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, 24));

        jLabel1.setText("Sexo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        rdMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdMasc);
        rdMasc.setText("Masculino");
        rdMasc.setBorder(null);
        rdMasc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMascActionPerformed(evt);
            }
        });
        jPanel1.add(rdMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        rdFem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdFem);
        rdFem.setText("Feminino");
        rdFem.setBorder(null);
        rdFem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(rdFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        bAlterarFoto.setBackground(new java.awt.Color(0, 153, 102));
        bAlterarFoto.setForeground(new java.awt.Color(255, 255, 255));
        bAlterarFoto.setText("Alterar foto");
        bAlterarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAlterarFoto.setFocusPainted(false);
        bAlterarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(bAlterarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, -1));

        cNascimento.setForeground(new java.awt.Color(204, 204, 204));
        try {
            cNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cNascimentoFocusLost(evt);
            }
        });
        cNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(cNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 60, 24));

        bConcluir.setBackground(new java.awt.Color(0, 102, 0));
        bConcluir.setForeground(new java.awt.Color(255, 255, 255));
        bConcluir.setText("Concluir");
        bConcluir.setToolTipText("Clicando em Concluir os dados e a imagem serão salvos.");
        bConcluir.setBorderPainted(false);
        bConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirActionPerformed(evt);
            }
        });
        jPanel1.add(bConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data Nascimento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, 40));

        bVoltar.setBackground(new java.awt.Color(153, 0, 0));
        bVoltar.setForeground(new java.awt.Color(255, 255, 255));
        bVoltar.setText("Voltar");
        bVoltar.setToolTipText("Clicando em Voltar todos os dados dessa parte não serão salvos.");
        bVoltar.setBorderPainted(false);
        bVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(bVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 24));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtxEngrenagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/Engrenagem (1).png"))); // NOI18N
        txtxEngrenagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtxEngrenagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtxEngrenagemMouseClicked(evt);
            }
        });
        jPanel2.add(txtxEngrenagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 11, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Levenim MT", 1, 24)); // NOI18N
        txtUsuario.setText("Usuario");
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        txtSexo.setText("Sexo: Masculino");
        jPanel2.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        txtNasc.setText("Idade: 96 anos");
        jPanel2.add(txtNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        txtNome.setText("Nome");
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        xBasquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xBasquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 40, 40));

        jBasquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Basket.png"))); // NOI18N
        jBasquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBasquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBasqueteMouseClicked(evt);
            }
        });
        jPanel2.add(jBasquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        xFutebol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        xFutebol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xFutebolMouseClicked(evt);
            }
        });
        jPanel2.add(xFutebol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 40, 40));

        jFutebol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Futbalo.png"))); // NOI18N
        jFutebol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFutebol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFutebolMouseClicked(evt);
            }
        });
        jPanel2.add(jFutebol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        xVolei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xVolei, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 40, 40));

        jVolei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Volei.png"))); // NOI18N
        jVolei.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVolei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoleiMouseClicked(evt);
            }
        });
        jPanel2.add(jVolei, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        xTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 40, 40));

        jTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Tenis.png"))); // NOI18N
        jTenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTenisMouseClicked(evt);
            }
        });
        jPanel2.add(jTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        xNatacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xNatacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 40, 40));

        jNatacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Swim.png"))); // NOI18N
        jNatacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNatacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNatacaoMouseClicked(evt);
            }
        });
        jPanel2.add(jNatacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        xCiclismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xCiclismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 40, 40));

        jCiclismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bike.png"))); // NOI18N
        jCiclismo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCiclismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCiclismoMouseClicked(evt);
            }
        });
        jPanel2.add(jCiclismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        xCorrida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xCorrida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 40, 40));

        jCorrida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Run.png"))); // NOI18N
        jCorrida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCorrida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCorridaMouseClicked(evt);
            }
        });
        jPanel2.add(jCorrida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        xCaminhada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xCaminhada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        jCaminhada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Walk.png"))); // NOI18N
        jCaminhada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCaminhada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCaminhadaMouseClicked(evt);
            }
        });
        jPanel2.add(jCaminhada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        xTrilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xTrilha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 40, 40));

        jTrilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trilha.png"))); // NOI18N
        jTrilha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTrilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTrilhaMouseClicked(evt);
            }
        });
        jPanel2.add(jTrilha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        xPasseio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x vermelho.png"))); // NOI18N
        jPanel2.add(xPasseio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 40, 40));

        jPasseio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Route.png"))); // NOI18N
        jPasseio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPasseio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasseioMouseClicked(evt);
            }
        });
        jPanel2.add(jPasseio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 30, 24));

        jLabel4.setText("Editar Hobbies");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 250));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pastime/cash/Imagens/fundo perfil.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        Lobby lobby = new Lobby();
        dispose();
        lobby.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked

    private void rdMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMascActionPerformed

    private void cNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNomeFocusGained
        String tempnome = cNome.getText();
        if(tempnome.equals("Editar Nome")){
        contadora= 1;           
        }
        switch(contadora){
            case 1:
                cNome.setText("");
                cNome.setForeground(Color.black);
                contadora=0;
                break;
        }
        
    }//GEN-LAST:event_cNomeFocusGained

    private void cNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNomeFocusLost
        String tempnome=cNome.getText();
        if(tempnome.equals("")){
            cNome.setText("Editar Nome");
            cNome.setForeground(Color.gray);
            contadora=1;
        }
    }//GEN-LAST:event_cNomeFocusLost

    private void txtxEngrenagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtxEngrenagemMouseClicked
        jPanel1.setVisible(true);
        if (!ArmazenaUsuario.nome.equals("")){
            cNome.setText(ArmazenaUsuario.nome);
            cNome.setForeground(Color.black);
            if (!ArmazenaUsuario.nascimento.equals("")){
            cNascimento.setText(ArmazenaUsuario.nascimento);
            }
            if (ArmazenaUsuario.sexo.equals("Masculino")){
                rdMasc.setSelected(true);
            }else if (ArmazenaUsuario.sexo.equals("Feminino")){
                rdFem.setSelected(true);
            }
        }
    }//GEN-LAST:event_txtxEngrenagemMouseClicked

    private void bConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirActionPerformed
        nome= cNome.getText();
        nascimento=cNascimento.getText();
        boolean sexoMasc = rdMasc.isSelected();

        if(nome.equals("Editar Nome") || nascimento.equals("  /  /    ") || nome.equals("") || nascimento.equals("")){
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");} 
        else{
        if(sexoMasc==false){
            ArmazenaUsuario.sexo="Feminino";
        }else {
            ArmazenaUsuario.sexo="Masculino";
            }
        ArmazenaUsuario.nome=nome;
        ArmazenaUsuario.nascimento=nascimento;
        txtNome.setText(ArmazenaUsuario.nome);
        txtUsuario.setText(ArmazenaUsuario.usuario);
        txtSexo.setText("Sexo: "+ArmazenaUsuario.sexo);
        txtNasc.setText("Nasceu em: "+ArmazenaUsuario.nascimento);
        //txtUsuario.setFont(new Font("Levenim MT",Font.ITALIC,24));
        jPanel1.setVisible(false);
            if (diretorio!=null){
                ArmazenaUsuario.imagemDiretorio=diretorio;
                ImageIcon icon = new ImageIcon(ArmazenaUsuario.imagemDiretorio);
                icon.setImage(icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), 1));
                jLabel5.setIcon(icon);
            } else {
            }
        }
        
        
        
    }//GEN-LAST:event_bConcluirActionPerformed

    private void cNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNascimentoFocusGained
        cNascimento.setForeground(Color.black);   
        String tempNasc = cNascimento.getText();
        if(tempNasc.equals("  /  /    ")){
        contadora1= 1;           
        }
        if (contadora1==1) {
            cNascimento.setText("");
            cNascimento.setForeground(Color.black);
            contadora1=0;
        }
    }//GEN-LAST:event_cNascimentoFocusGained

    private void cNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNomeActionPerformed
        
    }//GEN-LAST:event_cNomeActionPerformed

    private void cNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNascimentoFocusLost
        String tempnasc=cNascimento.getText();
        if(tempnasc.equals("  /  /    ")){
            cNascimento.setForeground(Color.gray);
            cNascimento.setText("  /  /    ");
            contadora1=1;
        }
    }//GEN-LAST:event_cNascimentoFocusLost

    private void bAlterarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarFotoActionPerformed
        boolean botao=true;
        AtualizaImagem(botao);
        
    }//GEN-LAST:event_bAlterarFotoActionPerformed

    private void cNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNascimentoActionPerformed

    private void jBasqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBasqueteMouseClicked
        if (ArmazenaUsuario.basquete && ArmazenaUsuario.saldo>=10){
            hobbieSelecionado="Basquete";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }else if (ArmazenaUsuario.basquete && ArmazenaUsuario.saldo<10){
            JOptionPane.showMessageDialog(null, "Infelizmente não há nenhum local para esse hobbie no valor de R$"+ArmazenaUsuario.saldo
                    +". \nVocê pode alterar seu saldo na área 'Meu Bolso'\nEnvie sugestões no site https://mobbyentertainment.wixsite.com/mobby ");
        }
    }//GEN-LAST:event_jBasqueteMouseClicked

    private void xFutebolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xFutebolMouseClicked
        //Excluir evento se possivel
    }//GEN-LAST:event_xFutebolMouseClicked

    private void jVoleiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoleiMouseClicked
        if (ArmazenaUsuario.volei && ArmazenaUsuario.saldo>=10){
            hobbieSelecionado="Vôlei";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }else if (ArmazenaUsuario.volei && ArmazenaUsuario.saldo<10){
            JOptionPane.showMessageDialog(null, "Infelizmente não há nenhum local para esse hobbie no valor de R$"+ArmazenaUsuario.saldo
                    +". \nVocê pode alterar seu saldo na área 'Meu Bolso'\nEnvie sugestões no site https://mobbyentertainment.wixsite.com/mobby ");
        }
    }//GEN-LAST:event_jVoleiMouseClicked

    private void jTenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTenisMouseClicked
        if (ArmazenaUsuario.tenis && ArmazenaUsuario.saldo>=30){
            hobbieSelecionado="Tênis";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }else if (ArmazenaUsuario.tenis && ArmazenaUsuario.saldo<30){
            JOptionPane.showMessageDialog(null, "Infelizmente não há nenhum local para esse hobbie no valor de R$"+ArmazenaUsuario.saldo
                    +". \nVocê pode alterar seu saldo na área 'Meu Bolso'\nEnvie sugestões no site https://mobbyentertainment.wixsite.com/mobby ");
        }
    }//GEN-LAST:event_jTenisMouseClicked

    private void jNatacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNatacaoMouseClicked
        if (ArmazenaUsuario.natacao && ArmazenaUsuario.saldo>=10){
            hobbieSelecionado="Natação";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }else if (ArmazenaUsuario.natacao && ArmazenaUsuario.saldo<10){
            JOptionPane.showMessageDialog(null, "Infelizmente não há nenhum local para esse hobbie no valor de R$"+ArmazenaUsuario.saldo
                    +". \nVocê pode alterar seu saldo na área 'Meu Bolso'\nEnvie sugestões no site https://mobbyentertainment.wixsite.com/mobby ");
        }
    }//GEN-LAST:event_jNatacaoMouseClicked

    private void jCiclismoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCiclismoMouseClicked
        if (ArmazenaUsuario.ciclismo){
            hobbieSelecionado="Ciclismo";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }
    }//GEN-LAST:event_jCiclismoMouseClicked

    private void jCorridaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCorridaMouseClicked
        if (ArmazenaUsuario.corrida){
            hobbieSelecionado="Corrida";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }
    }//GEN-LAST:event_jCorridaMouseClicked

    private void jCaminhadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCaminhadaMouseClicked
        if (ArmazenaUsuario.caminhada){
            hobbieSelecionado="Caminhada";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }
    }//GEN-LAST:event_jCaminhadaMouseClicked

    private void jTrilhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrilhaMouseClicked
        if (ArmazenaUsuario.trilha){
            hobbieSelecionado="Trilha";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }
    }//GEN-LAST:event_jTrilhaMouseClicked

    private void jPasseioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasseioMouseClicked
        if (ArmazenaUsuario.passeio){
            hobbieSelecionado="Passeio";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }
    }//GEN-LAST:event_jPasseioMouseClicked

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        jPanel1.setVisible(false);
        jLabel7.setText("");
        ImageIcon icon = new ImageIcon(ArmazenaUsuario.imagemDiretorio);
        icon.setImage(icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), 1));
        jLabel5.setIcon(icon);
        diretorio="";
    }//GEN-LAST:event_bVoltarActionPerformed

    private void jFutebolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFutebolMouseClicked
        if (ArmazenaUsuario.futebol && ArmazenaUsuario.saldo>=10){
            hobbieSelecionado="Futebol";
            Local local = new Local();
            dispose();
            local.setVisible(true);
        }else if (ArmazenaUsuario.futebol && ArmazenaUsuario.saldo<10){
        JOptionPane.showMessageDialog(null, "Infelizmente não há nenhum local para esse hobbie no valor de R$"+ArmazenaUsuario.saldo
                    +". \nVocê pode alterar seu saldo na área 'Meu Bolso'\nEnvie sugestões no site https://mobbyentertainment.wixsite.com/mobby ");
        }
    }//GEN-LAST:event_jFutebolMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Hobbies hobbies = new Hobbies();
        dispose();
        hobbies.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterarFoto;
    private javax.swing.JButton bConcluir;
    private javax.swing.JButton bVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField cNascimento;
    private javax.swing.JTextField cNome;
    private javax.swing.JLabel jBasquete;
    private javax.swing.JLabel jCaminhada;
    private javax.swing.JLabel jCiclismo;
    private javax.swing.JLabel jCorrida;
    private javax.swing.JLabel jFutebol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jNatacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPasseio;
    private javax.swing.JLabel jTenis;
    private javax.swing.JLabel jTrilha;
    private javax.swing.JLabel jVolei;
    private javax.swing.JRadioButton rdFem;
    private javax.swing.JRadioButton rdMasc;
    private javax.swing.JFileChooser seletor;
    private javax.swing.JLabel txtNasc;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtxEngrenagem;
    private javax.swing.JLabel voltar;
    private javax.swing.JLabel xBasquete;
    private javax.swing.JLabel xCaminhada;
    private javax.swing.JLabel xCiclismo;
    private javax.swing.JLabel xCorrida;
    private javax.swing.JLabel xFutebol;
    private javax.swing.JLabel xNatacao;
    private javax.swing.JLabel xPasseio;
    private javax.swing.JLabel xTenis;
    private javax.swing.JLabel xTrilha;
    private javax.swing.JLabel xVolei;
    // End of variables declaration//GEN-END:variables
}

