package Main;

import Classes.*;
import Conexões.MySQL;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
public class Mesario extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    public Mesario(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        CadeadoAberto.setVisible(false);
        CadeadoAberto.setEnabled(false);
        ListarDados();
    }
    public void ListarDados() {
        conectar.conectaBanco();
    
        String listar_dados = 
                "SELECT "
                + "* "                                
                + "FROM "
                + "mesario "
                + "ORDER BY "
                + "ID"
                + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){  
                
                model.addRow(new Object[]{
                this.conectar.getResultSet().getString(1),
                this.conectar.getResultSet().getString(2),
                this.conectar.getResultSet().getString(3),
                this.conectar.getResultSet().getString(4)
                });     
            }
        } 
        catch (HeadlessException | SQLException e) {            
                JOptionPane.showMessageDialog(null, "Falha em buscar usuário!");
        } finally{  
            ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }  
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        IconMesario = new javax.swing.JLabel();
        ButMesario = new javax.swing.JLabel();
        IconCamp = new javax.swing.JLabel();
        ButCamp = new javax.swing.JLabel();
        IconTimes = new javax.swing.JLabel();
        ButTimes = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        ButInicio1 = new javax.swing.JLabel();
        IconJogadores = new javax.swing.JLabel();
        ButJogadores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButConfig = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CadeadoFechado = new javax.swing.JLabel();
        CadeadoAberto = new javax.swing.JLabel();
        TxtFieldSenha = new javax.swing.JPasswordField();
        TxtFieldUsuario = new javax.swing.JTextField();
        Adicionar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TxtFieldNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ExcluirBut = new javax.swing.JButton();
        AtualizarBut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Btn_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 21, 111));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mesário.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 50));

        jPanel4.setBackground(new java.awt.Color(4, 21, 111));
        jPanel4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconMesario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mesario.png"))); // NOI18N
        IconMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMesarioMouseClicked(evt);
            }
        });
        jPanel4.add(IconMesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 60));

        ButMesario.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ButMesario.setForeground(new java.awt.Color(255, 255, 255));
        ButMesario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButMesario.setText("Mesário");
        ButMesario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButMesarioMouseClicked(evt);
            }
        });
        jPanel4.add(ButMesario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 40));

        IconCamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campeonato-off.png"))); // NOI18N
        IconCamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCampMouseClicked(evt);
            }
        });
        jPanel4.add(IconCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 60));

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
        jPanel4.add(ButCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        IconTimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/times-off.png"))); // NOI18N
        IconTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconTimesMouseClicked(evt);
            }
        });
        jPanel4.add(IconTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 60));

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
        jPanel4.add(ButTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 40));

        IconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-off.png"))); // NOI18N
        IconInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconInicioMouseClicked(evt);
            }
        });
        jPanel4.add(IconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        ButInicio1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ButInicio1.setForeground(new java.awt.Color(118, 127, 176));
        ButInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButInicio1.setText("Início");
        ButInicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButInicio1MouseClicked(evt);
            }
        });
        jPanel4.add(ButInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 40));

        IconJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogadores-off.png"))); // NOI18N
        IconJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconJogadoresMouseClicked(evt);
            }
        });
        jPanel4.add(IconJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 60, 60));

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
        jPanel4.add(ButJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-clara.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 140, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Fechar.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 110, 110));

        ButConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/config.png"))); // NOI18N
        ButConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButConfigMouseClicked(evt);
            }
        });
        jPanel3.add(ButConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 110, 60, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 70, 70));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 160, 50));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setText("Usuário:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 200, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Senha:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 50));

        CadeadoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadeado fechado.png"))); // NOI18N
        CadeadoFechado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadeadoFechadoMouseClicked(evt);
            }
        });
        jPanel2.add(CadeadoFechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 70));

        CadeadoAberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadeado aberto.png"))); // NOI18N
        CadeadoAberto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadeadoAbertoMouseClicked(evt);
            }
        });
        jPanel2.add(CadeadoAberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 70));

        TxtFieldSenha.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldSenha.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel2.add(TxtFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 190, 50));

        TxtFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldUsuario.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(TxtFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 190, 50));

        Adicionar.setBackground(new java.awt.Color(255, 255, 255));
        Adicionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Adicionar.setForeground(new java.awt.Color(4, 21, 111));
        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 190, 70));

        Limpar.setBackground(new java.awt.Color(255, 255, 255));
        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Limpar.setForeground(new java.awt.Color(4, 21, 111));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPanel2.add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 21, 111));
        jLabel11.setText("Nome:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 200, 50));

        TxtFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(TxtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 480, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 70));

        jTabbedPane1.addTab("Adicionar", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(4, 21, 111));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Usuário", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(4, 21, 111));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        ExcluirBut.setBackground(new java.awt.Color(255, 255, 255));
        ExcluirBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ExcluirBut.setForeground(new java.awt.Color(4, 21, 111));
        ExcluirBut.setText("Excluir");
        ExcluirBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButActionPerformed(evt);
            }
        });
        jPanel1.add(ExcluirBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 70));

        AtualizarBut.setBackground(new java.awt.Color(255, 255, 255));
        AtualizarBut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AtualizarBut.setForeground(new java.awt.Color(4, 21, 111));
        AtualizarBut.setLabel("Atualizar\n");
        AtualizarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarButActionPerformed(evt);
            }
        });
        jPanel1.add(AtualizarBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 70));

        jTabbedPane1.addTab("Tabela", jPanel1);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 480));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 21, 111));
        jLabel6.setText("________________________________________________________________");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 660, 90));

        Btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logout.png"))); // NOI18N
        Btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_logoutMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
        
    
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void ButInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicio1MouseClicked
        InicioAdm minhatela = new InicioAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicio1MouseClicked

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

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        ConfiguracoesAdm minhatela = new ConfiguracoesAdm(txtUsuario.getText());
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        int status=0;
        conectar.conectaBanco();
        Funcionario pessoa = new Funcionario();
        pessoa.setNome(TxtFieldNome.getText());
        pessoa.setUsuario(TxtFieldUsuario.getText());
        pessoa.setSenha(TxtFieldSenha.getText());

        try {
            status = this.conectar.insertSQL("INSERT INTO mesario ("
                    + "nome,"
                    + "usuario,"
                    + "senha"
                + ") VALUES ("
                    + "'" + pessoa.getNome() + "',"
                    + "'" + pessoa.getUsuario() + "',"
                    + "'" + pessoa.getSenha() + "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Mesário cadastrado com sucesso");
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
    }//GEN-LAST:event_AdicionarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        LimparAdicionar();
    }//GEN-LAST:event_LimparActionPerformed

    private void CadeadoAbertoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadeadoAbertoMouseClicked
        CadeadoAberto.setVisible(false);
        CadeadoAberto.setEnabled(false);
        CadeadoFechado.setVisible(true);
        CadeadoFechado.setEnabled(true);
        TxtFieldSenha.setEchoChar((char)(8226));
    }//GEN-LAST:event_CadeadoAbertoMouseClicked

    private void CadeadoFechadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadeadoFechadoMouseClicked
        CadeadoAberto.setVisible(true);
        CadeadoAberto.setEnabled(true);
        CadeadoFechado.setVisible(false);
        CadeadoFechado.setEnabled(false);
        TxtFieldSenha.setEchoChar((char)(0));
    }//GEN-LAST:event_CadeadoFechadoMouseClicked

    private void ExcluirButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButActionPerformed
        int b = jTable1.getSelectedRow();
        if(b==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String a = (String) jTable1.getValueAt(b, 0);
            conectar.conectaBanco();
            boolean status = false;
            try {
                status = this.conectar.updateSQL(
                    "DELETE FROM mesario "
                    + " WHERE "
                    + "id = '" + a + "'"
                    + ";"
                );
                if(status){ JOptionPane.showMessageDialog(null, "Mesário deletado com sucesso");
                    ListarDados();
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o mesário");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o mesário");
            } finally {conectar.fechaBanco();
            }
        }
    }//GEN-LAST:event_ExcluirButActionPerformed

    private void AtualizarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarButActionPerformed
        int c = jTable1.getSelectedRow();
        if(c==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String id = (String) jTable1.getValueAt(c, 0);
            String nom = (String) jTable1.getValueAt(c, 1);
            String usua = (String) jTable1.getValueAt(c, 2);
            String sen = (String) jTable1.getValueAt(c, 3);
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE mesario SET "
                                    + "nome = '" + nom + "',"
                                    + "usuario = '" + usua + "',"
                                    + "senha = '" + sen + "'"
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
        }
    }//GEN-LAST:event_AtualizarButActionPerformed

    private void Btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_logoutMouseClicked
        String usu = null;
        Login minhatela = new Login();
        minhatela.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_logoutMouseClicked
    
    private void LimparAdicionar(){
        TxtFieldNome.setText("");
        TxtFieldUsuario.setText("");
        TxtFieldSenha.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesario("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton AtualizarBut;
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JLabel ButCamp;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio1;
    private javax.swing.JLabel ButJogadores;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JLabel ButTimes;
    private javax.swing.JLabel CadeadoAberto;
    private javax.swing.JLabel CadeadoFechado;
    private javax.swing.JButton ExcluirBut;
    private javax.swing.JLabel IconCamp;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconJogadores;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JLabel IconTimes;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField TxtFieldNome;
    private javax.swing.JPasswordField TxtFieldSenha;
    private javax.swing.JTextField TxtFieldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
