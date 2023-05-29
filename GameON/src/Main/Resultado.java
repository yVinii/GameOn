package Main;
import java.awt.Toolkit;
import static java.lang.System.exit;
public class Resultado extends javax.swing.JFrame {
    public Resultado(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
    }   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        TxtFieldNome1 = new javax.swing.JTextField();
        TxtFieldNome2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ButInicio = new javax.swing.JLabel();
        ButEstatistica = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        IconEstatistica = new javax.swing.JLabel();
        IconResultado = new javax.swing.JLabel();
        ButResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButConfig = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Btn_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resultado.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 50));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 21, 111));
        jLabel11.setText("Time 2:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 220, 50));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 220, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(4, 21, 111));
        jLabel12.setText("Selecione Campeonato:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 420, 50));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 480, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(4, 21, 111));
        jLabel13.setText("Time 1:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(4, 21, 111));
        jButton5.setText("Limpar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, 70));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(4, 21, 111));
        jButton6.setText("Criar ");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 220, 70));

        jTabbedPane1.addTab("Criar Partida", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 21, 111));
        jLabel14.setText("Selecione Partida:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 230, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 21, 111));
        jLabel15.setText("Gols Time 2:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 230, 50));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 220, 50));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 220, 50));

        TxtFieldNome1.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome1.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(TxtFieldNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, 50));

        TxtFieldNome2.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome2.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(TxtFieldNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 220, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 21, 111));
        jLabel16.setText("Selecione Campeonato:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 21, 111));
        jLabel17.setText("Gols Time 1:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 230, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xIcon.png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 40, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(4, 21, 111));
        jButton7.setText("Limpar");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 220, 70));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(4, 21, 111));
        jButton8.setText("Inserir");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 220, 70));

        jTabbedPane1.addTab("Inserir Resultado", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 480));

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

        ButEstatistica.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
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

        IconResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/resultado.png"))); // NOI18N
        jPanel2.add(IconResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 60));

        ButResultado.setFont(new java.awt.Font("Segoe UI Black", 1, 23)); // NOI18N
        ButResultado.setForeground(new java.awt.Color(255, 255, 255));
        ButResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButResultado.setText("Resultado");
        ButResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        ButConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/config.png"))); // NOI18N
        ButConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButConfigMouseClicked(evt);
            }
        });
        jPanel1.add(ButConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 110, 60, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 70, 70));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 160, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 21, 111));
        jLabel4.setText("__________________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 660, 90));

        Btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logout.png"))); // NOI18N
        Btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 60, -1));

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

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        ConfiguracoesMesario minhatela = new ConfiguracoesMesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void Btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_logoutMouseClicked
        String usu = null;
        Login minhatela = new Login();
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_logoutMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButEstatistica;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButResultado;
    private javax.swing.JLabel IconEstatistica;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconResultado;
    private javax.swing.JTextField TxtFieldNome1;
    private javax.swing.JTextField TxtFieldNome2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
