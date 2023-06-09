package Main;

import Classes.*;
import Conexões.MySQL;
import static Metodos.CPFValidacao.validarCPF;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class Jogadores extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    MySQL con1 = new MySQL();
    public Jogadores(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        ListarDados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtFieldNome = new javax.swing.JTextField();
        TxtFieldCPF = new javax.swing.JFormattedTextField();
        Btn_addJogador = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ButLimpar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaJogador = new javax.swing.JTable();
        ButExcluir = new javax.swing.JButton();
        ButAtualizar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        IconMesario = new javax.swing.JLabel();
        ButMesario = new javax.swing.JLabel();
        IconCamp = new javax.swing.JLabel();
        ButCamp = new javax.swing.JLabel();
        IconTimes = new javax.swing.JLabel();
        ButTimes = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
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
        jLabel3.setText("Jogadores.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-clara.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 140, 120));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 21, 111));
        jLabel10.setText("Nome:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("CPF:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 50));

        TxtFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(TxtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 470, 50));

        TxtFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldCPF.setForeground(new java.awt.Color(4, 21, 111));
        try {
            TxtFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFieldCPF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel4.add(TxtFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 470, 50));

        Btn_addJogador.setBackground(new java.awt.Color(255, 255, 255));
        Btn_addJogador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Btn_addJogador.setForeground(new java.awt.Color(4, 21, 111));
        Btn_addJogador.setText("Adicionar");
        Btn_addJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_addJogadorActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_addJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogadorIcon.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        ButLimpar.setBackground(new java.awt.Color(255, 255, 255));
        ButLimpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButLimpar.setForeground(new java.awt.Color(4, 21, 111));
        ButLimpar.setText("Limpar");
        ButLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimparActionPerformed(evt);
            }
        });
        jPanel4.add(ButLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/golIcon.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 60, 90));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/goleiroIcon.png"))); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 60, 50));

        jTabbedPane1.addTab("Adicionar", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaJogador.setBackground(new java.awt.Color(255, 255, 255));
        TabelaJogador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabelaJogador.setForeground(new java.awt.Color(4, 21, 111));
        TabelaJogador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaJogador.setRowHeight(35);
        TabelaJogador.setSelectionBackground(new java.awt.Color(4, 21, 111));
        TabelaJogador.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TabelaJogador);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        ButExcluir.setBackground(new java.awt.Color(255, 255, 255));
        ButExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButExcluir.setForeground(new java.awt.Color(4, 21, 111));
        ButExcluir.setText("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(ButExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 70));

        ButAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        ButAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAtualizar.setForeground(new java.awt.Color(4, 21, 111));
        ButAtualizar.setText("Atualizar");
        ButAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogadorIcon.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 60, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/golIcon.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 60, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/goleiroIcon.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 60, 50));

        jTabbedPane1.addTab("Tabela", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 480));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Adicionar");

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));
        jPanel2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogadores_1.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 60, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Jogadores");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 40));

        IconMesario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mesario-off.png"))); // NOI18N
        IconMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMesarioMouseClicked(evt);
            }
        });
        jPanel2.add(IconMesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 60));

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

        IconCamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campeonato-off.png"))); // NOI18N
        IconCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCampMouseClicked(evt);
            }
        });
        jPanel2.add(IconCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 60));

        ButCamp.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
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

        IconTimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/times-off.png"))); // NOI18N
        IconTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconTimesMouseClicked(evt);
            }
        });
        jPanel2.add(IconTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 60));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

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

    public void ListarDados(){
        conectar.conectaBanco();
        String nomeT = "";
        String listar_dados = 
                "SELECT "
                + "* "                                
                + "FROM "
                + "jogador "
                + "ORDER BY "
                + "ID"
                + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaJogador.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
                int idt = this.conectar.getResultSet().getInt(4);
                System.out.println(idt);
                con1.conectaBanco();
        try{
            con1.executarSQL(
                "SELECT "
                    +"nome"
                +" FROM "
                    +"times"
                +" WHERE "
                +"id = '"+idt+"';"
            );
            while(con1.getResultSet().next()){
                nomeT = con1.getResultSet().getString(1);
                idt = 0;
            }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao buscar!");
                    
                }finally{
            con1.fechaBanco();
        }
                model.addRow(new Object[]{
                this.conectar.getResultSet().getString(1),
                this.conectar.getResultSet().getString(2),
                this.conectar.getResultSet().getString(3),
                nomeT
                });     
                nomeT="Livre no mercado";
            }
        } 
        catch (HeadlessException | SQLException e) {            
                JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{  
            ((DefaultTableCellRenderer) TabelaJogador.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaJogador.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }  
    }   
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void IconMesarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMesarioMouseClicked
        Mesario minhatela = new Mesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconMesarioMouseClicked

    private void ButMesarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButMesarioMouseClicked
        Mesario minhatela = new Mesario(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButMesarioMouseClicked

    private void IconCampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCampMouseClicked
        Campeonato minhatela = new Campeonato(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconCampMouseClicked

    private void ButCampMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCampMouseClicked
        Campeonato minhatela = new Campeonato(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCampMouseClicked

    private void IconTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconTimesMouseClicked
        Times minhatela = new Times(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_IconTimesMouseClicked

    private void ButTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButTimesMouseClicked
        Times minhatela = new Times(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButTimesMouseClicked

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

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        ConfiguracoesAdm minhatela = new ConfiguracoesAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void Btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_logoutMouseClicked
        String usu = null;
        Login minhatela = new Login();
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_logoutMouseClicked

    private void Btn_addJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_addJogadorActionPerformed
        boolean validacao = validarCPF(TxtFieldCPF.getText());
        if(validacao == true){
            int status=0;
        conectar.conectaBanco();
        Jogador pessoa = new Jogador();
        pessoa.setNome(TxtFieldNome.getText());
        pessoa.setCpf(TxtFieldCPF.getText());

        try {
            status = this.conectar.insertSQL("INSERT INTO jogador ("
                    + "nome,"
                    + "cpf"
                + ") VALUES ("
                    + "'" + pessoa.getNome() + "',"
                    + "'" + pessoa.getCpf() + "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso");
                    LimparAdicionar();
                    ListarDados();
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        }else{
            JOptionPane.showMessageDialog(null, "O Cpf inserido está inválido", "VALIDAÇÃO CPF", JOptionPane.ERROR_MESSAGE);
            TxtFieldCPF.setValue(null);
        }
        
    }//GEN-LAST:event_Btn_addJogadorActionPerformed

    private void ButLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimparActionPerformed
        LimparAdicionar();
    }//GEN-LAST:event_ButLimparActionPerformed

    private void ButAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAtualizarActionPerformed
        int c = TabelaJogador.getSelectedRow();
        if(c==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String id = (String) TabelaJogador.getValueAt(c, 0);
            String nom = (String) TabelaJogador.getValueAt(c, 1);
            String cpf = (String) TabelaJogador.getValueAt(c, 2);
            String time = (String) TabelaJogador.getValueAt(c, 3);
            boolean mn = validarCPF(cpf);
            if(mn ==true){
             
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE jogador SET "
                                    + "nome = '" + nom + "',"
                                    + "cpf = '" + cpf + "'"
                                + " WHERE "
                                + "id = '" + id + "'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                            ListarDados();
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conectar.fechaBanco();
                        }
        }else{
                JOptionPane.showMessageDialog(null, "O Cpf do jogador selecionado está errado", "VALIDAÇÃO CPF", JOptionPane.ERROR_MESSAGE);
            }
            }
    }//GEN-LAST:event_ButAtualizarActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        int b = TabelaJogador.getSelectedRow();
        if(b==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String a = (String) TabelaJogador.getValueAt(b, 0);
            conectar.conectaBanco();
            boolean status = false;
            try {
                status = this.conectar.updateSQL(
                    "DELETE FROM jogador "
                    + " WHERE "
                    + "id = '" + a + "'"
                    + ";"
                );
                if(status){ JOptionPane.showMessageDialog(null, "Jogador deletado com sucesso");
                    ListarDados();
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o time");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o time");
            } finally {conectar.fechaBanco();
            }
        }
    }//GEN-LAST:event_ButExcluirActionPerformed
    public void LimparAdicionar(){
        TxtFieldNome.setText("");
        TxtFieldCPF.setValue(null);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogadores("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_addJogador;
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JButton ButAtualizar;
    private javax.swing.JLabel ButCamp;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JButton ButLimpar;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JLabel ButTimes;
    private javax.swing.JLabel IconCamp;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JLabel IconTimes;
    private javax.swing.JTable TabelaJogador;
    private javax.swing.JFormattedTextField TxtFieldCPF;
    private javax.swing.JTextField TxtFieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
