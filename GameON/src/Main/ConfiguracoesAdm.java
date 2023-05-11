
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Conexões.MySQL;
import java.awt.Toolkit;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class ConfiguracoesAdm extends javax.swing.JFrame {
    String senha;
    String senhaCensura;
    ImageIcon Esconder = new ImageIcon(this.getClass().getResource("/Imagens//Cadeado fechado.png"));
    ImageIcon Mostrar = new ImageIcon(this.getClass().getResource("/Imagens//Cadeado aberto.png"));
    MySQL conectar = new MySQL();
    String usuario;
    String nome;
    public ConfiguracoesAdm(String usu) {
        initComponents();
        usuario = usu;
        ButAtualizar.setVisible(false);
        ButAtualizar.setEnabled(false);
        txtAtualizar.setVisible(false);
        txtAtualizar.setEnabled(false);
        ButEsconder.setVisible(false);
        ButEsconder.setEnabled(false);
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone]
        
        this.conectar.conectaBanco();
        try{
        this.conectar.executarSQL(
            "SELECT "
                +"nome,"
                +"senha"
            +" FROM "
                +"admin"
            + " WHERE " 
                     + " usuario = '" + usu + "'"
                + ";"
        );
        while(this.conectar.getResultSet().next()){
            nome = this.conectar.getResultSet().getString(1);
            senha = this.conectar.getResultSet().getString(2);
            senhaCensura = censurarTexto(senha);
            txtNome.setText(nome);
            TxtSenha.setText(senhaCensura);
        }
        
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar usuário!");
            }finally{
            
            this.conectar.fechaBanco();
    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButAtualizar = new javax.swing.JLabel();
        txtAtualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IconJogadores = new javax.swing.JLabel();
        ButJogadores = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
        ButMesario = new javax.swing.JLabel();
        ButCamp = new javax.swing.JLabel();
        ButTimes = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        IconMesario = new javax.swing.JLabel();
        IconCamp = new javax.swing.JLabel();
        IconTimes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        ImagemSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JLabel();
        ButTrocarU = new javax.swing.JButton();
        txtNome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ButTrocarS = new javax.swing.JButton();
        ButMostrar = new javax.swing.JButton();
        ButEsconder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        ButAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButAtualizarMouseClicked(evt);
            }
        });
        jPanel1.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 80, 80));

        txtAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAtualizar.setForeground(new java.awt.Color(4, 21, 111));
        txtAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAtualizar.setText("Atualizar");
        txtAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAtualizarMouseClicked(evt);
            }
        });
        jPanel1.add(txtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Configurações.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 270, 50));

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));
        jPanel2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogadores-off.png"))); // NOI18N
        IconJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconJogadoresMouseClicked(evt);
            }
        });
        jPanel2.add(IconJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 60, 60));

        ButJogadores.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButJogadores.setForeground(new java.awt.Color(118, 127, 176));
        ButJogadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButJogadores.setText("Jogadores");
        ButJogadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButJogadoresMouseClicked(evt);
            }
        });
        jPanel2.add(ButJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 40));

        ButInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ButInicio.setForeground(new java.awt.Color(118, 127, 176));
        ButInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButInicio.setText("Início");
        ButInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButInicioMouseClicked(evt);
            }
        });
        jPanel2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 40));

        ButMesario.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ButMesario.setForeground(new java.awt.Color(118, 127, 176));
        ButMesario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButMesario.setText("Mesário");
        ButMesario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButMesarioMouseClicked(evt);
            }
        });
        jPanel2.add(ButMesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 40));

        ButCamp.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButCamp.setForeground(new java.awt.Color(118, 127, 176));
        ButCamp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButCamp.setText("Campeonato");
        ButCamp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCampMouseClicked(evt);
            }
        });
        jPanel2.add(ButCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        ButTimes.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ButTimes.setForeground(new java.awt.Color(118, 127, 176));
        ButTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButTimes.setText("Times");
        ButTimes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButTimesMouseClicked(evt);
            }
        });
        jPanel2.add(ButTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 40));

        IconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-off.png"))); // NOI18N
        IconInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconInicioMouseClicked(evt);
            }
        });
        jPanel2.add(IconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        IconMesario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mesario-off.png"))); // NOI18N
        IconMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMesarioMouseClicked(evt);
            }
        });
        jPanel2.add(IconMesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 60));

        IconCamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campeonato-off.png"))); // NOI18N
        IconCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCampMouseClicked(evt);
            }
        });
        jPanel2.add(IconCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 60));

        IconTimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/times-off.png"))); // NOI18N
        IconTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconTimesMouseClicked(evt);
            }
        });
        jPanel2.add(IconTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-clara.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 140, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Fechar.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 110, 110));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 21, 111));
        jLabel4.setText("_________________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 660, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 21, 111));
        jLabel8.setText("Conta.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 70, 70));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 160, 50));

        ImagemSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadeado fechado.png"))); // NOI18N
        jPanel3.add(ImagemSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Senha:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 21, 111));
        jLabel5.setText("Usuário:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, 50));

        TxtSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(4, 21, 111));
        TxtSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 50));

        ButTrocarU.setBackground(new java.awt.Color(255, 255, 255));
        ButTrocarU.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        ButTrocarU.setForeground(new java.awt.Color(4, 21, 111));
        ButTrocarU.setText("Trocar Usuário");
        ButTrocarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTrocarUActionPerformed(evt);
            }
        });
        jPanel3.add(ButTrocarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 190, 60));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(4, 21, 111));
        txtNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setText("Nome:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 200, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 70));

        ButTrocarS.setBackground(new java.awt.Color(255, 255, 255));
        ButTrocarS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButTrocarS.setForeground(new java.awt.Color(4, 21, 111));
        ButTrocarS.setText("Trocar Senha");
        ButTrocarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTrocarSActionPerformed(evt);
            }
        });
        jPanel3.add(ButTrocarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 190, 60));

        ButMostrar.setBackground(new java.awt.Color(255, 255, 255));
        ButMostrar.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        ButMostrar.setForeground(new java.awt.Color(4, 21, 111));
        ButMostrar.setText("Mostrar Senha");
        ButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(ButMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        ButEsconder.setBackground(new java.awt.Color(255, 255, 255));
        ButEsconder.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButEsconder.setForeground(new java.awt.Color(4, 21, 111));
        ButEsconder.setText("Esconder Senha");
        ButEsconder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEsconderActionPerformed(evt);
            }
        });
        jPanel3.add(ButEsconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 670, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String censurarTexto(String texto) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        sb.append('*');
    }
    return sb.toString();
}
    
    private void IconJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconJogadoresMouseClicked
        Jogadores minhatela = new Jogadores(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconJogadoresMouseClicked

    private void ButJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButJogadoresMouseClicked
        Jogadores minhatela = new Jogadores(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButJogadoresMouseClicked

    private void ButMesarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButMesarioMouseClicked
        Mesario minhatela = new Mesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButMesarioMouseClicked

    private void ButCampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCampMouseClicked
        Campeonato minhatela = new Campeonato(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCampMouseClicked

    private void ButTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButTimesMouseClicked
        Times minhatela = new Times(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButTimesMouseClicked

    private void IconMesarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMesarioMouseClicked
        Mesario minhatela = new Mesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconMesarioMouseClicked

    private void IconCampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCampMouseClicked
        Campeonato minhatela = new Campeonato(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconCampMouseClicked

    private void IconTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconTimesMouseClicked
        Times minhatela = new Times(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconTimesMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void IconInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconInicioMouseClicked
        InicioAdm minhatela = new InicioAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconInicioMouseClicked

    private void ButInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicioMouseClicked
        InicioAdm minhatela = new InicioAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicioMouseClicked

    private void ButTrocarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTrocarUActionPerformed
        TrocarUsuarioAdm minhatela = new TrocarUsuarioAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        ButAtualizar.setVisible(true);
        ButAtualizar.setEnabled(true);
        txtAtualizar.setVisible(true);
        txtAtualizar.setEnabled(true);
    }//GEN-LAST:event_ButTrocarUActionPerformed

    private void ButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMostrarActionPerformed
        ButEsconder.setVisible(true);
        ButEsconder.setEnabled(true);
        ButMostrar.setVisible(false);
        ButMostrar.setEnabled(false);
        TxtSenha.setText(senha);
        ImagemSenha.setIcon(Mostrar);
    }//GEN-LAST:event_ButMostrarActionPerformed

    private void ButEsconderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEsconderActionPerformed
        ButEsconder.setVisible(false);
        ButEsconder.setEnabled(false);
        ButMostrar.setVisible(true);
        ButMostrar.setEnabled(true);
        TxtSenha.setText(senhaCensura);
        ImagemSenha.setIcon(Esconder);
    }//GEN-LAST:event_ButEsconderActionPerformed

    private void ButAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButAtualizarMouseClicked
        this.conectar.conectaBanco();
        try{
        this.conectar.executarSQL(
            "SELECT "
                +"usuario,"
                +"senha"
            +" FROM "
                +"admin"
            + " WHERE " 
                     + " nome = '" + txtNome.getText() + "'"
                + ";"
        );
        while(this.conectar.getResultSet().next()){
            usuario = this.conectar.getResultSet().getString(1);
            senha = this.conectar.getResultSet().getString(2);
            senhaCensura = censurarTexto(senha);
            TxtSenha.setText(senhaCensura);
            txtUsuario.setText(usuario);
            ImagemSenha.setIcon(Esconder);
            ButEsconder.setVisible(false);
            ButEsconder.setEnabled(false);
            ButMostrar.setVisible(true);
            ButMostrar.setEnabled(true);
            ButAtualizar.setVisible(false);
            ButAtualizar.setEnabled(false);
            txtAtualizar.setVisible(false);
            txtAtualizar.setEnabled(false);
        }
        
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar usuário!");
            }finally{
            
            this.conectar.fechaBanco();
    }
    }//GEN-LAST:event_ButAtualizarMouseClicked

    private void txtAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAtualizarMouseClicked
        this.conectar.conectaBanco();
        try{
        this.conectar.executarSQL(
            "SELECT "
                +"usuario,"
                +"senha"
            +" FROM "
                +"admin"
            + " WHERE " 
                     + " nome = '" + txtNome.getText() + "'"
                + ";"
        );
        while(this.conectar.getResultSet().next()){
            usuario = this.conectar.getResultSet().getString(1);
            senha = this.conectar.getResultSet().getString(2);
            senhaCensura = censurarTexto(senha);
            TxtSenha.setText(senhaCensura);
            txtUsuario.setText(usuario);
            ImagemSenha.setIcon(Esconder);
            ButEsconder.setVisible(false);
            ButEsconder.setEnabled(false);
            ButMostrar.setVisible(true);
            ButMostrar.setEnabled(true);
            ButAtualizar.setVisible(false);
            ButAtualizar.setEnabled(false);
            txtAtualizar.setVisible(false);
            txtAtualizar.setEnabled(false);
        }
        
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar usuário!");
            }finally{
            
            this.conectar.fechaBanco();
    }
    }//GEN-LAST:event_txtAtualizarMouseClicked

    private void ButTrocarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTrocarSActionPerformed
        TrocarSenhaAdm minhatela = new TrocarSenhaAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        ButAtualizar.setVisible(true);
        ButAtualizar.setEnabled(true);
        txtAtualizar.setVisible(true);
        txtAtualizar.setEnabled(true);
    }//GEN-LAST:event_ButTrocarSActionPerformed
                                
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracoesAdm("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButAtualizar;
    private javax.swing.JLabel ButCamp;
    private javax.swing.JButton ButEsconder;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButJogadores;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JButton ButMostrar;
    private javax.swing.JLabel ButTimes;
    private javax.swing.JButton ButTrocarS;
    private javax.swing.JButton ButTrocarU;
    private javax.swing.JLabel IconCamp;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconJogadores;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JLabel IconTimes;
    private javax.swing.JLabel ImagemSenha;
    private javax.swing.JLabel TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAtualizar;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

}
