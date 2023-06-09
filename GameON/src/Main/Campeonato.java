package Main;
import Classes.*;
import Conexões.MySQL;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.System.exit;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class Campeonato extends javax.swing.JFrame{
    MySQL conectar = new MySQL();
    MySQL conT = new MySQL();
    public Campeonato(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        AtualizarComboCamp(ComboCamp1);
        AtualizarComboCamp(ComboCamp3);
        AtualizarComboTimes(ComboTimes);
        AtualizarComboCamp(ComboCamp4);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TxtFieldNome1 = new javax.swing.JTextField();
        ButLimpar = new javax.swing.JButton();
        ButCriar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacao = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ComboCamp1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ComboTimes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ButAdicionar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        ComboCamp3 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        ComboTimes1 = new javax.swing.JComboBox<>();
        ButRetirar = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        ButBuscar2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaResultado = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        ComboCamp4 = new javax.swing.JComboBox<>();
        ButBuscar4 = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButGerarPDF = new javax.swing.JButton();
        ButAtualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ButInicio = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        IconMesario = new javax.swing.JLabel();
        ButMesario = new javax.swing.JLabel();
        IconTimes = new javax.swing.JLabel();
        ButTimes = new javax.swing.JLabel();
        IconJogadores = new javax.swing.JLabel();
        ButJogadores = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
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
        jLabel3.setText("Campeonato.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 240, 50));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 21, 111));
        jLabel10.setText("Nome:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 50));

        TxtFieldNome1.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome1.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(TxtFieldNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 470, 50));

        ButLimpar.setBackground(new java.awt.Color(255, 255, 255));
        ButLimpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButLimpar.setForeground(new java.awt.Color(4, 21, 111));
        ButLimpar.setText("Limpar");
        ButLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimparActionPerformed(evt);
            }
        });
        jPanel3.add(ButLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 70));

        ButCriar.setBackground(new java.awt.Color(255, 255, 255));
        ButCriar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButCriar.setForeground(new java.awt.Color(4, 21, 111));
        ButCriar.setText("Criar");
        ButCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCriarActionPerformed(evt);
            }
        });
        jPanel3.add(ButCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Informações:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 260, 50));

        txtInformacao.setBackground(new java.awt.Color(255, 255, 255));
        txtInformacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtInformacao.setForeground(new java.awt.Color(4, 21, 111));
        jScrollPane2.setViewportView(txtInformacao);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 470, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, 70));

        jTabbedPane1.addTab("Criar Campeonato", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboCamp1.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(ComboCamp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 420, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 21, 111));
        jLabel11.setText("Campeonato:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, 50));

        ComboTimes.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTimes.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(ComboTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 420, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setText("Time:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        ButAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        ButAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAdicionar.setForeground(new java.awt.Color(4, 21, 111));
        ButAdicionar.setText("Adicionar");
        ButAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAdicionarActionPerformed(evt);
            }
        });
        jPanel4.add(ButAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 190, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, 70));

        jTabbedPane1.addTab("Adicionar Times", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(4, 21, 111));
        jLabel24.setText("Campeonato:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, 50));

        ComboCamp3.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.add(ComboCamp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 260, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(4, 21, 111));
        jLabel25.setText("Time:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        ComboTimes1.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimes1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTimes1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.add(ComboTimes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 420, 50));

        ButRetirar.setBackground(new java.awt.Color(255, 255, 255));
        ButRetirar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButRetirar.setForeground(new java.awt.Color(4, 21, 111));
        ButRetirar.setText("Retirar");
        ButRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRetirarActionPerformed(evt);
            }
        });
        jPanel6.add(ButRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 190, 70));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel6.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, 70));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        ButBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar2.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar2.setText("Buscar");
        ButBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar2ActionPerformed(evt);
            }
        });
        jPanel6.add(ButBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, 50));

        jTabbedPane1.addTab("Retirar Times", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(4, 21, 111));
        jLabel59.setText("Selecione Campeonato:");
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 50));

        ComboCamp4.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel7.add(ComboCamp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 400, 50));

        ButBuscar4.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar4.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar4.setText("Buscar");
        ButBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar4ActionPerformed(evt);
            }
        });
        jPanel7.add(ButBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 180, 50));

        ButExcluir.setBackground(new java.awt.Color(255, 255, 255));
        ButExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButExcluir.setForeground(new java.awt.Color(4, 21, 111));
        ButExcluir.setText("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });
        jPanel7.add(ButExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 50));

        ButGerarPDF.setBackground(new java.awt.Color(255, 255, 255));
        ButGerarPDF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButGerarPDF.setForeground(new java.awt.Color(4, 21, 111));
        ButGerarPDF.setText("Gerar PDF");
        ButGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButGerarPDFActionPerformed(evt);
            }
        });
        jPanel7.add(ButGerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 180, 50));

        ButAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        ButAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAtualizar.setForeground(new java.awt.Color(4, 21, 111));
        ButAtualizar.setText("Atualizar");
        ButAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAtualizarActionPerformed(evt);
            }
        });
        jPanel7.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 180, 50));

        jTabbedPane1.addTab("Tabela de Resultados", jPanel7);

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
        jPanel2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Campeonato");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campeonato_1.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 60));

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

        IconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-off.png"))); // NOI18N
        IconInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconInicioMouseClicked(evt);
            }
        });
        jPanel2.add(IconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

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

    private void ButLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimparActionPerformed
        LimparCriar();
    }//GEN-LAST:event_ButLimparActionPerformed

    private void ButCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCriarActionPerformed
        int status=0;
        conectar.conectaBanco();
        Campeonat c1 = new Campeonat();
        c1.setInformacoes(txtInformacao.getText());
        c1.setNome(TxtFieldNome1.getText());
        
        try {
            status = this.conectar.insertSQL("INSERT INTO campeonato ("
                    + "nome,"
                    + "informacoes"
                + ") VALUES ("
                    + "'" + c1.getNome() + "',"
                    + "'" + c1.getInformacoes()+ "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Campeonato criado com sucesso");
                    LimparCriar();
                    AtualizarComboCamp(ComboCamp1);
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
    }//GEN-LAST:event_ButCriarActionPerformed

    private void ButAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAdicionarActionPerformed
        String nt = (String) ComboTimes.getSelectedItem();
        String nc = (String) ComboCamp1.getSelectedItem();
        int idt= 0;
        int idc = 0;
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"id"
            +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ nt +"'"
                +";"
        );
        while(conectar.getResultSet().next()){
            idt = conectar.getResultSet().getInt(1);
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
            +"campeonato"
            +" WHERE "
            +" nome = '"+ nc +"'"
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
    
            int status=0;
            conectar.conectaBanco();

        try {
            status = this.conectar.insertSQL("INSERT INTO camp_time ("
                    + "id_camp,"
                    + "id_time"
                + ") VALUES ("
                    + "'" + idc + "',"
                    + "'" + idt + "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Time adicionado ao campeonato com sucesso");
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
    
    }//GEN-LAST:event_ButAdicionarActionPerformed

    private void ButRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRetirarActionPerformed
        String nCamp  = (String)ComboCamp3.getSelectedItem();
        String nTime = (String) ComboTimes1.getSelectedItem();
        int idCamp = 0;
        int idTime = 0;
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
        "SELECT "
            +"id"
        +" FROM "
            +"campeonato"
            +" WHERE "
            +" nome = '"+ nCamp +"'"
            +";"
        );
        while(conectar.getResultSet().next()){
            idCamp = conectar.getResultSet().getInt(1);
            
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
            +" nome = '"+ nTime +"'"
            +";"
        );
        while(conectar.getResultSet().next()){
            idTime = conectar.getResultSet().getInt(1);
            
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
                    "DELETE FROM camp_time "
                    + " WHERE "
                    + "id_camp = '" + idCamp + "'"
                    + " AND "
                    + "id_time = '" +idTime + "'"
                    + ";"
                );
                if(status){ JOptionPane.showMessageDialog(null, "Time retirado com sucesso");
                    ComboTimes1.removeAllItems();
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao retirar o time");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o time");
            } finally {conectar.fechaBanco();
            }
    }//GEN-LAST:event_ButRetirarActionPerformed

    private void ButBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar2ActionPerformed
        String item = (String)ComboCamp3.getSelectedItem();
        int id= 0;
        ComboTimes1.removeAllItems();
        conectar.conectaBanco();
        try{
            conectar.executarSQL(
                "SELECT "
                +"id"
                +" FROM "
                +"campeonato"
                +" WHERE "
                +" nome = '"+ item +"'"
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
                +"times.nome"
                +" FROM "
                +"camp_time "
                +"left join campeonato on camp_time.id_camp = campeonato.id "
                +"left join times on camp_time.id_time = times.id"
                +" WHERE "
                +" id_camp = '"+ id +"';"
            );
            while(conectar.getResultSet().next()){
                ComboTimes1.addItem(conectar.getResultSet().getString(1));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButBuscar2ActionPerformed

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
        String url = "http://localhost:3030/";
        String jsonInputString = "{\"campeonatoNome\":\"Campeonato Sorojaca\",\"times\":[{\"nome\":\"Criciúma\",\"responsavel\":\"Amaury Jr.\"},{\"nome\":\"Flamengo\",\"responsavel\":\"Jefferson\"},{\"nome\":\"Corinthians\",\"responsavel\":\"Joaquim Barbosa\"},{\"nome\":\"Grêmio\",\"responsavel\":\"Zacarias\"},{\"nome\":\"Seleção de Marrocos\",\"responsavel\":\"Zintz\"},{\"nome\":\"Palmeiras\",\"responsavel\":\"Michael Mayers\"},{\"nome\":\"Barcelona\",\"responsavel\":\"Vinicius\"}],\"partidas\":[{\"times\":[{\"nome\":\"Criciúma\",\"gols\":\"2\"},{\"nome\":\"Flamengo\",\"gols\":\"2\"}]},{\"times\":[{\"nome\":\"Corinthians\",\"gols\":\"0\"},{\"nome\":\"Tolima\",\"gols\":\"2\"}]},{\"times\":[{\"nome\":\"Grêmio\",\"gols\":\"3\"},{\"nome\":\"Seleção de Marrocos\",\"gols\":\"1\"}]},{\"times\":[{\"nome\":\"Palmeiras\",\"gols\":\"4\"},{\"nome\":\"Barcelona\",\"gols\":\"0\"}]}]}";
        
        try {
            // Cria a conexão HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            // Define o método da requisição como POST
            con.setRequestMethod("POST");

            // Define o cabeçalho da requisição
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            // Habilita a escrita do corpo da requisição
            con.setDoOutput(true);

            // Escreve o corpo da requisição
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.write(jsonInputString.getBytes(StandardCharsets.UTF_8));
            wr.flush();
            wr.close();

            // Obtém a resposta da requisição
            int responseCode = con.getResponseCode();
            
            // Lê a resposta da requisição
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            // Imprime a resposta da requisição
            System.out.println("Código de resposta: " + responseCode);
            System.out.println("Resposta: " + response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    public void AtualizarComboTimes(JComboBox hehe){
        hehe.removeAllItems();
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"times"
        );
        while(conectar.getResultSet().next()){   
            hehe.addItem(conectar.getResultSet().getString(1));
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            }finally{
            conectar.fechaBanco();
    }
    }
    public void LimparCriar(){
        TxtFieldNome1.setText("");
        txtInformacao.setText("");
    }
    public void sortearPosicao(List<String> times){
        Random random = new Random();
        Collections.shuffle(times,random);
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campeonato("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JButton ButAdicionar;
    private javax.swing.JButton ButAtualizar;
    private javax.swing.JButton ButBuscar2;
    private javax.swing.JButton ButBuscar4;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JButton ButCriar;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButGerarPDF;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButJogadores;
    private javax.swing.JButton ButLimpar;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JButton ButRetirar;
    private javax.swing.JLabel ButTimes;
    private javax.swing.JComboBox<String> ComboCamp1;
    private javax.swing.JComboBox<String> ComboCamp3;
    private javax.swing.JComboBox<String> ComboCamp4;
    private javax.swing.JComboBox<String> ComboTimes;
    private javax.swing.JComboBox<String> ComboTimes1;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconJogadores;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JLabel IconTimes;
    private javax.swing.JTable TabelaResultado;
    private javax.swing.JTextField TxtFieldNome1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane txtInformacao;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
