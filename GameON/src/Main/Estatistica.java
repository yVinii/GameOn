package Main;
import Conexões.MySQL;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class Estatistica extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    MySQL conT = new MySQL();
    
    public Estatistica(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        AtualizarComboCamp(ComboCamp);
        AtualizarComboCamp(ComboCamp1);
        AtualizarTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        ComboCamp = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ComboJogador = new javax.swing.JComboBox<>();
        MenosUm = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        TxtGols = new javax.swing.JTextField();
        MaisUm = new javax.swing.JButton();
        ButBuscar2 = new javax.swing.JButton();
        ButBuscar3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        ComboCamp1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaArtilheiro = new javax.swing.JTable();
        ButBuscar4 = new javax.swing.JButton();
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
        ButConfig = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Btn_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCamp.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp.setForeground(new java.awt.Color(4, 21, 111));
        ComboCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCampActionPerformed(evt);
            }
        });
        jPanel3.add(ComboCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 290, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(4, 21, 111));
        jLabel18.setText("Selecione Campeonato:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 21, 111));
        jLabel17.setText("Selecione Jogador:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 230, 50));

        ComboJogador.setBackground(new java.awt.Color(255, 255, 255));
        ComboJogador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboJogador.setForeground(new java.awt.Color(4, 21, 111));
        ComboJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboJogadorActionPerformed(evt);
            }
        });
        jPanel3.add(ComboJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 290, 50));

        MenosUm.setBackground(new java.awt.Color(255, 255, 255));
        MenosUm.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        MenosUm.setForeground(new java.awt.Color(4, 21, 111));
        MenosUm.setText("-1");
        MenosUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosUmActionPerformed(evt);
            }
        });
        jPanel3.add(MenosUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 80, 70));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(4, 21, 111));
        jLabel19.setText("Total de gols:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 140, 50));

        TxtGols.setEditable(false);
        TxtGols.setBackground(new java.awt.Color(153, 204, 255));
        TxtGols.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TxtGols.setForeground(new java.awt.Color(4, 21, 111));
        TxtGols.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtGols.setText("0");
        TxtGols.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel3.add(TxtGols, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 70));

        MaisUm.setBackground(new java.awt.Color(255, 255, 255));
        MaisUm.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        MaisUm.setForeground(new java.awt.Color(4, 21, 111));
        MaisUm.setText("+1");
        MaisUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaisUmActionPerformed(evt);
            }
        });
        jPanel3.add(MaisUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 80, 70));

        ButBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar2.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar2.setText("Buscar");
        ButBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar2ActionPerformed(evt);
            }
        });
        jPanel3.add(ButBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 150, 50));

        ButBuscar3.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar3.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar3.setText("Buscar");
        ButBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar3ActionPerformed(evt);
            }
        });
        jPanel3.add(ButBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, 50));

        jTabbedPane1.addTab("Cadastrar Gols", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(4, 21, 111));
        jLabel21.setText("Selecione Campeonato:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 50));

        ComboCamp1.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(ComboCamp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 400, 50));

        TabelaArtilheiro.setBackground(new java.awt.Color(255, 255, 255));
        TabelaArtilheiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabelaArtilheiro.setForeground(new java.awt.Color(4, 21, 111));
        TabelaArtilheiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogador", "Gols"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaArtilheiro.setRowHeight(35);
        TabelaArtilheiro.setSelectionBackground(new java.awt.Color(4, 21, 111));
        TabelaArtilheiro.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TabelaArtilheiro);
        if (TabelaArtilheiro.getColumnModel().getColumnCount() > 0) {
            TabelaArtilheiro.getColumnModel().getColumn(0).setResizable(false);
            TabelaArtilheiro.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        ButBuscar4.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar4.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar4.setText("Buscar");
        ButBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar4ActionPerformed(evt);
            }
        });
        jPanel4.add(ButBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 180, 50));

        jTabbedPane1.addTab("Tabela de Artilheiro", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 480));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estatística.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 50));

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
        ButEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        ButEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButEstatistica.setText("Estatística");
        ButEstatistica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ButEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        IconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-off.png"))); // NOI18N
        IconInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconInicioMouseClicked(evt);
            }
        });
        jPanel2.add(IconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 60));

        IconEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estatistica.png"))); // NOI18N
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

    private void ButBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar2ActionPerformed
        
        String nCampeonato = (String) ComboCamp.getSelectedItem();
        String nJogador = (String) ComboJogador.getSelectedItem();
        int idC = 0;
        int id = 0;
        String sus = "";
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
                +"id"
                +" FROM "
                +"jogador"
                +" WHERE "
                +" nome = '"+ nJogador +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                id = conectar.getResultSet().getInt(1);
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
                +"id_camp"
                +" FROM "
                +"artilheiros"
                +" WHERE "
                +" id_camp = '"+ idC +"'"
                +" AND "        
                +" id_jogador = '"+ id + "'"
                +";"
            );
            while(conectar.getResultSet().next()){
                sus = conectar.getResultSet().getString(1);
            }
            if(sus.equals("")){
                int status=0;
                conectar.conectaBanco();
        try {
            status = this.conectar.insertSQL("INSERT INTO artilheiros ("
                    + "id_camp,"
                    + "id_jogador,"
                    + "gols"
                + ") VALUES ("
                    + "'" + idC + "',"
                    + "'" + id+ "',"
                    + "'" + 0 +"'"
                + ");");
                if(status == 1){
                    TxtGols.setText("0");
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        
            }else{
                String gols = "0";
                conT.conectaBanco();
        try{
            conT.executarSQL(
                "SELECT "
                +"gols"
                +" FROM "
                +"artilheiros"
                +" WHERE "
                +" id_camp = '"+ idC +"'"
                +" AND "
                +" id_jogador = '"+ id +"'"
                +";"
            );
            while(conT.getResultSet().next()){
                gols = conT.getResultSet().getString(1);
                TxtGols.setText(gols);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conT.fechaBanco();
        }
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        
    }//GEN-LAST:event_ButBuscar2ActionPerformed

    private void ButBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar3ActionPerformed
        ComboJogador.removeAllItems();
        String nCampeonato = (String) ComboCamp.getSelectedItem();
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
                +"id_time"
                +" FROM "
                +"camp_time"
                +" WHERE "
                +" id_camp = '"+ idC +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                idT = conectar.getResultSet().getString(1);
                conT.conectaBanco();
        try{
            conT.executarSQL(
                "SELECT "
                +"nome"
                +" FROM "
                +"jogador"
                +" WHERE "
                +" id_time = '"+ idT +"'"
                +";"
            );
            while(conT.getResultSet().next()){
                ComboJogador.addItem(conT.getResultSet().getString(1));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conT.fechaBanco();
        }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButBuscar3ActionPerformed

    private void MaisUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaisUmActionPerformed
        String nCam = (String)ComboCamp.getSelectedItem();
        String nJog = (String)ComboJogador.getSelectedItem();
        int idC = 0;
        int id = 0;
        String sus = "";
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
                idC = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aquiee!");
        }finally{
            conectar.fechaBanco();
        }
        
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"jogador"
                +" WHERE "
                +" nome = '"+ nJog +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                id = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aquie!");
        }finally{
            conectar.fechaBanco();
        }
        
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"gols"
                +" FROM "
                +"artilheiros"
                +" WHERE "
                +" id_camp = '"+ idC +"'"
                +" AND "
                +" id_jogador = '"+id+"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                int gols = conectar.getResultSet().getInt(1)+1;
                TxtGols.setText(String.valueOf(gols));
                conT.conectaBanco();
                    boolean status = false;
                        try {status = this.conT.updateSQL(
                                "UPDATE artilheiros SET "
                                    + "gols = '" + gols + "'"
                                + " WHERE "
                                + "id_camp = '" + idC + "'"
                                + " AND "
                                + "id_jogador = '"+id+"'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conT.fechaBanco();
                        }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aq!");
        }finally{
            conectar.fechaBanco();
        }
        AtualizarTabela();
    }//GEN-LAST:event_MaisUmActionPerformed

    private void MenosUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosUmActionPerformed
        String nCam = (String)ComboCamp.getSelectedItem();
        String nJog = (String)ComboJogador.getSelectedItem();
        int idC = 0;
        int id = 0;
        String sus = "";
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
                idC = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aquiee!");
        }finally{
            conectar.fechaBanco();
        }
        
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"jogador"
                +" WHERE "
                +" nome = '"+ nJog +"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                id = conectar.getResultSet().getInt(1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aquie!");
        }finally{
            conectar.fechaBanco();
        }
        
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"gols"
                +" FROM "
                +"artilheiros"
                +" WHERE "
                +" id_camp = '"+ idC +"'"
                +" AND "
                +" id_jogador = '"+id+"'"
                +";"
            );
            while(conectar.getResultSet().next()){
                int gols = conectar.getResultSet().getInt(1)-1;
                TxtGols.setText(String.valueOf(gols));
                conT.conectaBanco();
                    boolean status = false;
                        try {status = this.conT.updateSQL(
                                "UPDATE artilheiros SET "
                                    + "gols = '" + gols + "'"
                                + " WHERE "
                                + "id_camp = '" + idC + "'"
                                + " AND "
                                + "id_jogador = '"+id+"'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conT.fechaBanco();
                        }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar aq!");
        }finally{
            conectar.fechaBanco();
        }
        AtualizarTabela();
    }//GEN-LAST:event_MenosUmActionPerformed

    private void ComboJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboJogadorActionPerformed
        TxtGols.setText("0");
    }//GEN-LAST:event_ComboJogadorActionPerformed

    private void ComboCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCampActionPerformed
        TxtGols.setText("0");
        ComboJogador.removeAllItems();
    }//GEN-LAST:event_ComboCampActionPerformed

    private void ButBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar4ActionPerformed
        String nomeC = (String)ComboCamp1.getSelectedItem();
        String nomeJ = "";
        String idj = "";
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
                +"id_jogador, "
                +"gols "
                + "FROM "
                + "artilheiros "
                + " WHERE "
                + "id_camp = '"+idc+"' "
                + "ORDER BY "
                + "gols"
                + " DESC"
                + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaArtilheiro.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
            idj = conectar.getResultSet().getString(1);
        conT.conectaBanco();
        try{
            conT.executarSQL(
                "SELECT "
                    +"nome"
                +" FROM "
                    +"jogador"
                +" WHERE "
                +"id = '"+idj+"';"
            );
            while(conT.getResultSet().next()){
                nomeJ = conT.getResultSet().getString(1);
                idj = "";
            }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");
                    
                }finally{
            conT.fechaBanco();
        }
                model.addRow(new Object[]{
                nomeJ,
                this.conectar.getResultSet().getString(2)
                });
            }
        } 
        catch (HeadlessException | SQLException e) {            
                JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{  
            ((DefaultTableCellRenderer) TabelaArtilheiro.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaArtilheiro.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }  
        
    }//GEN-LAST:event_ButBuscar4ActionPerformed
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
    public void AtualizarTabela(){
        String nomeC = (String)ComboCamp1.getSelectedItem();
        String nomeJ = "";
        String idj = "";
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
                +"id_jogador, "
                +"gols "
                + "FROM "
                + "artilheiros "
                + " WHERE "
                + "id_camp = '"+idc+"' "
                + "ORDER BY "
                + "gols"
                + " DESC"
                + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaArtilheiro.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
            idj = conectar.getResultSet().getString(1);
        conT.conectaBanco();
        try{
            conT.executarSQL(
                "SELECT "
                    +"nome"
                +" FROM "
                    +"jogador"
                +" WHERE "
                +"id = '"+idj+"';"
            );
            while(conT.getResultSet().next()){
                nomeJ = conT.getResultSet().getString(1);
                idj = "";
            }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");
                    
                }finally{
            conT.fechaBanco();
        }
                model.addRow(new Object[]{
                nomeJ,
                this.conectar.getResultSet().getString(2)
                });
            }
        } 
        catch (HeadlessException | SQLException e) {            
                JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{  
            ((DefaultTableCellRenderer) TabelaArtilheiro.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaArtilheiro.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }  
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estatistica("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JButton ButBuscar2;
    private javax.swing.JButton ButBuscar3;
    private javax.swing.JButton ButBuscar4;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButEstatistica;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButResultado;
    private javax.swing.JComboBox<String> ComboCamp;
    private javax.swing.JComboBox<String> ComboCamp1;
    private javax.swing.JComboBox<String> ComboJogador;
    private javax.swing.JLabel IconEstatistica;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconResultado;
    private javax.swing.JButton MaisUm;
    private javax.swing.JButton MenosUm;
    private javax.swing.JTable TabelaArtilheiro;
    private javax.swing.JTextField TxtGols;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
