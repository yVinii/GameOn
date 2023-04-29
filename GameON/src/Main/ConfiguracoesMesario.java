package Main;
import static java.lang.System.exit;
import Conexões.MySQL;
import Classes.Pessoa;
import static Main.ConfiguracoesAdm.censurarTexto;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ConfiguracoesMesario extends javax.swing.JFrame {
    String senha;
    String senhaCensura;
    ImageIcon Esconder = new ImageIcon(this.getClass().getResource("/Imagens//Cadeado fechado.png"));
    ImageIcon Mostrar = new ImageIcon(this.getClass().getResource("/Imagens//Cadeado aberto.png"));
    MySQL conectar = new MySQL();
    public ConfiguracoesMesario(String usu) {
        initComponents();
        ButEsconder.setVisible(false);
        ButEsconder.setEnabled(false);
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone]
        
        this.conectar.conectaBanco();
        try{
        this.conectar.executarSQL(
            "SELECT "
                +"senha"
            +" FROM "
                +"mesario"
            + " WHERE " 
                     + " usuario = '" + usu + "'"
                + ";"
        );
        while(this.conectar.getResultSet().next()){
            senha = this.conectar.getResultSet().getString(1);
            senhaCensura = censurarTexto(senha);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ButInicio = new javax.swing.JLabel();
        ButEstatistica = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        IconEstatistica = new javax.swing.JLabel();
        IconResultado = new javax.swing.JLabel();
        ButResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ImagemSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JLabel();
        ButMostrar = new javax.swing.JButton();
        ButEsconder = new javax.swing.JButton();
        ButTrocar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Configurações.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 270, 50));

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));
        jPanel2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 40));

        ButEstatistica.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        ButEstatistica.setForeground(new java.awt.Color(118, 127, 176));
        ButEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButEstatistica.setText("Estatística");
        ButEstatistica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButEstatisticaMouseClicked(evt);
            }
        });
        jPanel2.add(ButEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        IconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-off.png"))); // NOI18N
        IconInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconInicioMouseClicked(evt);
            }
        });
        jPanel2.add(IconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 60));

        IconEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estatistica off.png"))); // NOI18N
        IconEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconEstatisticaMouseClicked(evt);
            }
        });
        jPanel2.add(IconEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 60));

        IconResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/resultado off.png"))); // NOI18N
        IconResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconResultadoMouseClicked(evt);
            }
        });
        jPanel2.add(IconResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 60));

        ButResultado.setFont(new java.awt.Font("Segoe UI Black", 1, 23)); // NOI18N
        ButResultado.setForeground(new java.awt.Color(118, 127, 176));
        ButResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButResultado.setText("Resultado");
        ButResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButResultadoMouseClicked(evt);
            }
        });
        jPanel2.add(ButResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, 40));

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
        jLabel4.setText("__________________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 660, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 21, 111));
        jLabel8.setText("Conta.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 70));

        ImagemSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadeado fechado.png"))); // NOI18N
        jPanel3.add(ImagemSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Senha:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 21, 111));
        jLabel5.setText("Usuário:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 200, 50));

        TxtSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(4, 21, 111));
        TxtSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 50));

        ButMostrar.setBackground(new java.awt.Color(255, 255, 255));
        ButMostrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButMostrar.setForeground(new java.awt.Color(4, 21, 111));
        ButMostrar.setText("Mostrar Senha");
        ButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(ButMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 60));

        ButEsconder.setBackground(new java.awt.Color(255, 255, 255));
        ButEsconder.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButEsconder.setForeground(new java.awt.Color(4, 21, 111));
        ButEsconder.setText("Esconder Senha");
        ButEsconder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        ButEsconder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEsconderActionPerformed(evt);
            }
        });
        jPanel3.add(ButEsconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 60));

        ButTrocar.setBackground(new java.awt.Color(255, 255, 255));
        ButTrocar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButTrocar.setForeground(new java.awt.Color(4, 21, 111));
        ButTrocar.setText("Trocar Senha");
        ButTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTrocarActionPerformed(evt);
            }
        });
        jPanel3.add(ButTrocar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 200, 60));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

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
    private void ButEstatisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButEstatisticaMouseClicked
        Estatistica minhatela = new Estatistica(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButEstatisticaMouseClicked

    private void IconEstatisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconEstatisticaMouseClicked
        Estatistica minhatela = new Estatistica(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconEstatisticaMouseClicked

    private void IconResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconResultadoMouseClicked
        Resultado minhatela = new Resultado(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconResultadoMouseClicked

    private void ButResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButResultadoMouseClicked
        Resultado minhatela = new Resultado(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButResultadoMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void IconInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconInicioMouseClicked
        InicioMesario minhatela = new InicioMesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconInicioMouseClicked

    private void ButInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicioMouseClicked
        InicioMesario minhatela = new InicioMesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicioMouseClicked

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

    private void ButTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTrocarActionPerformed
        TrocarSenhaMesario minhatela = new TrocarSenhaMesario(txtUsuario.getText());
        minhatela.setVisible(true);
    }//GEN-LAST:event_ButTrocarActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracoesMesario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesMesario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesMesario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesMesario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracoesMesario("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEsconder;
    private javax.swing.JLabel ButEstatistica;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JButton ButMostrar;
    private javax.swing.JLabel ButResultado;
    private javax.swing.JButton ButTrocar;
    private javax.swing.JLabel IconEstatistica;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconResultado;
    private javax.swing.JLabel ImagemSenha;
    private javax.swing.JLabel TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
