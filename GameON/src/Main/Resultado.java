package Main;
import Classes.Partida;
import Conexões.MySQL;
import Metodos.SoNumeros;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class Resultado extends javax.swing.JFrame {
    MySQL conectar = new MySQL();    
    MySQL conT = new MySQL();
    Partida p = new Partida();
    DefaultTableModel model = new DefaultTableModel();
    public Resultado(String usu) {
        initComponents();
        TabelaResultado.getColumnModel().getColumn(1).setCellEditor(new SoNumeros());
        TabelaResultado.getColumnModel().getColumn(3).setCellEditor(new SoNumeros());
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        AtualizarComboCamp(ComboCamp1);
        AtualizarComboCamp(ComboCamp3);
    }   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ComboTime2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ComboCamp1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        ComboTime1 = new javax.swing.JComboBox<>();
        ButCriar = new javax.swing.JButton();
        ButBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaResultado = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        ComboCamp3 = new javax.swing.JComboBox<>();
        ButBuscar4 = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButGerarPDF = new javax.swing.JButton();
        ButAtualizar = new javax.swing.JButton();
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

        ComboTime2.setBackground(new java.awt.Color(255, 255, 255));
        ComboTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTime2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.add(ComboTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 220, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(4, 21, 111));
        jLabel12.setText("Selecione Campeonato:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 420, 50));

        ComboCamp1.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp1.setForeground(new java.awt.Color(4, 21, 111));
        ComboCamp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCamp1ActionPerformed(evt);
            }
        });
        jPanel3.add(ComboCamp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 310, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(4, 21, 111));
        jLabel13.setText("Time 1:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        ComboTime1.setBackground(new java.awt.Color(255, 255, 255));
        ComboTime1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTime1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.add(ComboTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, 50));

        ButCriar.setBackground(new java.awt.Color(255, 255, 255));
        ButCriar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButCriar.setForeground(new java.awt.Color(4, 21, 111));
        ButCriar.setText("Criar ");
        ButCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCriarActionPerformed(evt);
            }
        });
        jPanel3.add(ButCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, 70));

        ButBuscar.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar.setText("Buscar");
        ButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(ButBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 150, 50));

        jTabbedPane1.addTab("Criar Partida", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaResultado.setBackground(new java.awt.Color(255, 255, 255));
        TabelaResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabelaResultado.setForeground(new java.awt.Color(4, 21, 111));
        TabelaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time 1", "Gols", "", "Gols", "Time 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaResultado.setRowHeight(35);
        TabelaResultado.setSelectionBackground(new java.awt.Color(4, 21, 111));
        TabelaResultado.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TabelaResultado);
        if (TabelaResultado.getColumnModel().getColumnCount() > 0) {
            TabelaResultado.getColumnModel().getColumn(1).setMinWidth(50);
            TabelaResultado.getColumnModel().getColumn(1).setPreferredWidth(50);
            TabelaResultado.getColumnModel().getColumn(1).setMaxWidth(50);
            TabelaResultado.getColumnModel().getColumn(2).setMinWidth(50);
            TabelaResultado.getColumnModel().getColumn(2).setPreferredWidth(50);
            TabelaResultado.getColumnModel().getColumn(2).setMaxWidth(50);
            TabelaResultado.getColumnModel().getColumn(3).setMinWidth(50);
            TabelaResultado.getColumnModel().getColumn(3).setPreferredWidth(50);
            TabelaResultado.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(4, 21, 111));
        jLabel21.setText("Selecione Campeonato:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 50));

        ComboCamp3.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.add(ComboCamp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 400, 50));

        ButBuscar4.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar4.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar4.setText("Buscar");
        ButBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar4ActionPerformed(evt);
            }
        });
        jPanel5.add(ButBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 180, 50));

        ButExcluir.setBackground(new java.awt.Color(255, 255, 255));
        ButExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButExcluir.setForeground(new java.awt.Color(4, 21, 111));
        ButExcluir.setText("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });
        jPanel5.add(ButExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 50));

        ButGerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        ButGerarPDF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButGerarPDF.setForeground(new java.awt.Color(4, 21, 111));
        ButGerarPDF.setText("Gerar PDF");
        ButGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButGerarPDFActionPerformed(evt);
            }
        });
        jPanel5.add(ButGerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 180, 50));

        ButAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        ButAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAtualizar.setForeground(new java.awt.Color(4, 21, 111));
        ButAtualizar.setText("Atualizar");
        ButAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAtualizarActionPerformed(evt);
            }
        });
        jPanel5.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 180, 50));

        jTabbedPane1.addTab("Tabela de Resultados", jPanel5);

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

    private void ButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscarActionPerformed
        ComboTime1.removeAllItems();
        ComboTime2.removeAllItems();
        String nCampeonato = (String) ComboCamp1.getSelectedItem();
        int idC = 0;
        String idT = "";
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"campeonato"
                +" WHERE "
                +" nome = '"+ nCampeonato +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idC = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }

        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"times.nome"
                +" FROM "
                +"camp_time "
                +"left join campeonato on camp_time.id_camp = campeonato.id "
                +"left join times on camp_time.id_time = times.id"
                +" WHERE "
                +" id_camp = '"+ idC +"';"
            );
            while(conectar.getResultSet().next()){
                ComboTime1.addItem(conectar.getResultSet().getString(1));
                ComboTime2.addItem(conectar.getResultSet().getString(1));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButBuscarActionPerformed

    private void ButCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCriarActionPerformed
        int idt1 = 0;
        int idt2 = 0;
        int idc = 0;
        String nCam = (String)ComboCamp1.getSelectedItem();
        String nTim1 = (String)ComboTime1.getSelectedItem();
        String nTim2 = (String)ComboTime2.getSelectedItem();

            conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"campeonato"
                +" WHERE "
                +" nome = '"+ nCam +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idc = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ nTim1 +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt1 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ nTim2 +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt2 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        if(idt1 == idt2){
            JOptionPane.showMessageDialog(null, "Os times não podem ser iguais", "Erro Criar Partida", JOptionPane.ERROR_MESSAGE);
        
        }else{
            int status=0;
        conectar.conectaBanco();
        try {
            status = this.conectar.insertSQL("INSERT INTO partida ("
                    + "id_camp,"
                    + "id_time1,"
                    + "id_time2"
                + ") VALUES ("
                    + "'" + idc + "',"
                    + "'" + idt1 + "',"
                    + "'" + idt2+ "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Partida criada com sucesso");
                    ComboTime1.removeAllItems();
                    ComboTime2.removeAllItems();
                    AtualizarTabela();
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        }
        
        
    }//GEN-LAST:event_ButCriarActionPerformed

    private void ComboCamp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCamp1ActionPerformed
        ComboTime1.removeAllItems();
        ComboTime2.removeAllItems();
    }//GEN-LAST:event_ComboCamp1ActionPerformed

    private void ButBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar4ActionPerformed
        String nomeC = (String)ComboCamp3.getSelectedItem();
        String nomeT1 = "";
        String idt1 = "";
        String nomeT2 = "";
        String idt2 = "";
        int idc = 0;

        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"campeonato"
                +" WHERE "
                +" nome = '"+ nomeC +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idc = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }

        conectar.conectaBanco();
        String listar_dados =
        "SELECT "
        +"id_time1, "
        +"id_time2, "
        +"golsT1, "
        +"golsT2 "
        + "FROM "
        + "partida "
        + " WHERE "
        + "id_camp = '"+idc+"' "
        + "ORDER BY "
        + "id"
        + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaResultado.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
                idt1 = conectar.getResultSet().getString(1);
                idt2 = conectar.getResultSet().getString(2);
                conT.conectaBanco();
                try{
                    conT.executarSQL(
                        "SELECT "
                        +"nome"
                        +" FROM "
                        +"times"
                        +" WHERE "
                        +"id = '"+idt1+"';"
                    );
                    while(conT.getResultSet().next()){
                        nomeT1 = conT.getResultSet().getString(1);
                        idt1 = "";
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");

                }finally{
                    conT.fechaBanco();
                }
                conT.conectaBanco();
                try{
                    conT.executarSQL(
                        "SELECT "
                        +"nome"
                        +" FROM "
                        +"times"
                        +" WHERE "
                        +"id = '"+idt2+"';"
                    );
                    while(conT.getResultSet().next()){
                        nomeT2 = conT.getResultSet().getString(1);
                        idt2 = "";
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");

                }finally{
                    conT.fechaBanco();
                }
                model.addRow(new Object[]{
                    nomeT1,
                    this.conectar.getResultSet().getString(3),
                    "x",
                    this.conectar.getResultSet().getString(4),
                    nomeT2
                });
            }
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{
            ((DefaultTableCellRenderer) TabelaResultado.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaResultado.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }

    }//GEN-LAST:event_ButBuscar4ActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        int b = TabelaResultado.getSelectedRow();
        if(b==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String a = (String) TabelaResultado.getValueAt(b, 0);
            String c = (String) TabelaResultado.getValueAt(b,4);
            int idt1 = 0;
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ a +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt1 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        int idt2 = 0;
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ c +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt2 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
            conectar.conectaBanco();
            boolean status = false;
            try {
                status = this.conectar.updateSQL(
                    "DELETE FROM partida "
                    + " WHERE "
                    + "id_time1 = '" + idt1 + "'"
                    + " AND "
                    + "id_time2 = '"+ idt2 + "'"
                    + ";"
                );
                if(status){ JOptionPane.showMessageDialog(null, "Partida deletada com sucesso");
                AtualizarTabela();
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao apagar a partida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um erro");
            } finally {conectar.fechaBanco();
            }
        }
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButGerarPDFActionPerformed
        JOptionPane.showMessageDialog(null, "PDF Gerado agora procura ai bobo");
    }//GEN-LAST:event_ButGerarPDFActionPerformed

    private void ButAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAtualizarActionPerformed
        int c = TabelaResultado.getSelectedRow();
        if(c==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String nt1 = (String) TabelaResultado.getValueAt(c, 0);
            String golst1 = (String) TabelaResultado.getValueAt(c, 1);
            String golst2 = (String) TabelaResultado.getValueAt(c, 3);
            String nt2 = (String) TabelaResultado.getValueAt(c, 4);
            int idt1 = 0;
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ nt1 +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt1 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        int idt2 = 0;
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ nt2 +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idt2 = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
            
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE partida SET "
                                    + "golsT1 = '" + golst1 + "',"
                                    + "golsT2 = '" + golst2 + "'"
                                + " WHERE "
                                + "id_time1 = '" + idt1 + "'"
                                + " AND "
                                + "id_time2 = '"+idt2+"'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                        AtualizarTabela();
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conectar.fechaBanco();
                        }
        
            }
    }//GEN-LAST:event_ButAtualizarActionPerformed
    public void AtualizarTabela(){
        String nomeC = (String)ComboCamp3.getSelectedItem();
        String nomeT1 = "";
        String idt1 = "";
        String nomeT2 = "";
        String idt2 = "";
        int idc = 0;

        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"campeonato"
                +" WHERE "
                +" nome = '"+ nomeC +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idc = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }

        conectar.conectaBanco();
        String listar_dados =
        "SELECT "
        +"id_time1, "
        +"id_time2, "
        +"golsT1, "
        +"golsT2 "
        + "FROM "
        + "partida "
        + " WHERE "
        + "id_camp = '"+idc+"' "
        + "ORDER BY "
        + "id"
        + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaResultado.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
                idt1 = conectar.getResultSet().getString(1);
                idt2 = conectar.getResultSet().getString(2);
                conT.conectaBanco();
                try{
                    conT.executarSQL(
                        "SELECT "
                        +"nome"
                        +" FROM "
                        +"times"
                        +" WHERE "
                        +"id = '"+idt1+"';"
                    );
                    while(conT.getResultSet().next()){
                        nomeT1 = conT.getResultSet().getString(1);
                        idt1 = "";
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");

                }finally{
                    conT.fechaBanco();
                }
                conT.conectaBanco();
                try{
                    conT.executarSQL(
                        "SELECT "
                        +"nome"
                        +" FROM "
                        +"times"
                        +" WHERE "
                        +"id = '"+idt2+"';"
                    );
                    while(conT.getResultSet().next()){
                        nomeT2 = conT.getResultSet().getString(1);
                        idt2 = "";
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");

                }finally{
                    conT.fechaBanco();
                }
                model.addRow(new Object[]{
                    nomeT1,
                    this.conectar.getResultSet().getString(3),
                    "x",
                    this.conectar.getResultSet().getString(4),
                    nomeT2
                });
            }
        }
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{
            ((DefaultTableCellRenderer) TabelaResultado.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaResultado.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }
    }
    public void AtualizarComboCamp(JComboBox si){
        si.removeAllItems();
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"campeonato"
        );
        while(conectar.getResultSet().next()){   
            si.addItem(conectar.getResultSet().getString(1));
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            }finally{
            conectar.fechaBanco();
    }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JButton ButAtualizar;
    private javax.swing.JButton ButBuscar;
    private javax.swing.JButton ButBuscar4;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JButton ButCriar;
    private javax.swing.JLabel ButEstatistica;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButGerarPDF;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButResultado;
    private javax.swing.JComboBox<String> ComboCamp1;
    private javax.swing.JComboBox<String> ComboCamp3;
    private javax.swing.JComboBox<String> ComboTime1;
    private javax.swing.JComboBox<String> ComboTime2;
    private javax.swing.JLabel IconEstatistica;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconResultado;
    private javax.swing.JTable TabelaResultado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
