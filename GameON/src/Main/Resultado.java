package Main;
import Classes.Partida;
import ClassesPDF.Partidas;
import ClassesPDF.TimeGols;
import ClassesPDF.TimeResponsavel;
import Conexões.MySQL;
import Metodos.SoNumeros;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.System.exit;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
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
        AtualizarComboCamp(ComboCamp2);
        parabens.setVisible(false);
        campeao.setVisible(false);
        butEncerrar.setEnabled(false);
        butEncerrar.setVisible(false);
    }   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ComboCamp2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Chaveamento1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        time8 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        time7 = new javax.swing.JTextPane();
        chave9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Chaveamento4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        time2 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        time1 = new javax.swing.JTextPane();
        chave12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Chaveamento5 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        time4 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        time3 = new javax.swing.JTextPane();
        chave13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Chaveamento3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        time6 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        time5 = new javax.swing.JTextPane();
        chave11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        time5678 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        time78 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        time56 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        time12 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        time34 = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        time1234 = new javax.swing.JTextPane();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        butSortear = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        campeao = new javax.swing.JLabel();
        parabens = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        butEncerrar = new javax.swing.JToggleButton();
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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 21, 111));
        jLabel14.setText("Selecione o Campeonato:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        ComboCamp2.setBackground(new java.awt.Color(255, 255, 255));
        ComboCamp2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboCamp2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.add(ComboCamp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, 50));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 215, -1, 10));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 165, -1, 10));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 265, -1, 10));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 265, -1, 10));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 165, -1, 10));

        Chaveamento1.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time8.setEditable(false);
        time8.setBackground(new java.awt.Color(255, 255, 255));
        time8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time8.setForeground(new java.awt.Color(4, 21, 111));
        time8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time8MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(time8);

        Chaveamento1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 30));

        time7.setEditable(false);
        time7.setBackground(new java.awt.Color(255, 255, 255));
        time7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time7.setForeground(new java.awt.Color(4, 21, 111));
        time7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time7MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(time7);

        Chaveamento1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        chave9.setBackground(new java.awt.Color(255, 255, 255));
        chave9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        chave9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 10));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        Chaveamento1.add(chave9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel6.add(Chaveamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, 100));

        Chaveamento4.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time2.setEditable(false);
        time2.setBackground(new java.awt.Color(255, 255, 255));
        time2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time2.setForeground(new java.awt.Color(4, 21, 111));
        time2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time2MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(time2);

        Chaveamento4.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));

        time1.setEditable(false);
        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time1.setForeground(new java.awt.Color(4, 21, 111));
        time1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time1MouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(time1);

        Chaveamento4.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        chave12.setBackground(new java.awt.Color(255, 255, 255));
        chave12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        chave12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 60));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 10));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        Chaveamento4.add(chave12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel6.add(Chaveamento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 100));

        Chaveamento5.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time4.setEditable(false);
        time4.setBackground(new java.awt.Color(255, 255, 255));
        time4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time4.setForeground(new java.awt.Color(4, 21, 111));
        time4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time4MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(time4);

        Chaveamento5.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));

        time3.setEditable(false);
        time3.setBackground(new java.awt.Color(255, 255, 255));
        time3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time3.setForeground(new java.awt.Color(4, 21, 111));
        time3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time3MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(time3);

        Chaveamento5.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        chave13.setBackground(new java.awt.Color(255, 255, 255));
        chave13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        chave13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 60));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 10));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        Chaveamento5.add(chave13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel6.add(Chaveamento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 100));

        Chaveamento3.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time6.setEditable(false);
        time6.setBackground(new java.awt.Color(255, 255, 255));
        time6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time6.setForeground(new java.awt.Color(4, 21, 111));
        time6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time6MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(time6);

        Chaveamento3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 30));

        time5.setEditable(false);
        time5.setBackground(new java.awt.Color(255, 255, 255));
        time5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time5.setForeground(new java.awt.Color(4, 21, 111));
        time5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time5MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(time5);

        Chaveamento3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        chave11.setBackground(new java.awt.Color(255, 255, 255));
        chave11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        chave11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 10));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        Chaveamento3.add(chave11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel6.add(Chaveamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, 100));

        time5678.setEditable(false);
        time5678.setBackground(new java.awt.Color(255, 255, 255));
        time5678.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time5678.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        time5678.setForeground(new java.awt.Color(4, 21, 111));
        time5678.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time5678MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(time5678);

        jPanel6.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, 40));

        time78.setEditable(false);
        time78.setBackground(new java.awt.Color(255, 255, 255));
        time78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time78.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time78.setForeground(new java.awt.Color(4, 21, 111));
        time78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time78MouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(time78);

        jPanel6.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, 30));

        time56.setEditable(false);
        time56.setBackground(new java.awt.Color(255, 255, 255));
        time56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time56.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time56.setForeground(new java.awt.Color(4, 21, 111));
        time56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time56MouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(time56);

        jPanel6.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 80, 30));

        time12.setEditable(false);
        time12.setBackground(new java.awt.Color(255, 255, 255));
        time12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time12.setForeground(new java.awt.Color(4, 21, 111));
        time12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time12MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(time12);

        jPanel6.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, 30));

        time34.setEditable(false);
        time34.setBackground(new java.awt.Color(255, 255, 255));
        time34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time34.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time34.setForeground(new java.awt.Color(4, 21, 111));
        time34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time34MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(time34);

        jPanel6.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, 30));

        time1234.setEditable(false);
        time1234.setBackground(new java.awt.Color(255, 255, 255));
        time1234.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time1234.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        time1234.setForeground(new java.awt.Color(4, 21, 111));
        time1234.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time1234MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(time1234);

        jPanel6.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 40));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 20, 60));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 20, 60));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 20, 60));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 20, 60));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 20, 60));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 20, 60));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 215, -1, 10));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 215, -1, 10));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 215, -1, 10));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xIcon.png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 40));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 20, 60));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 20, 60));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 20, 60));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 20, 60));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 20, 60));

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 20, 60));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 20, 60));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 20, 60));

        butSortear.setBackground(new java.awt.Color(255, 255, 255));
        butSortear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butSortear.setForeground(new java.awt.Color(4, 21, 111));
        butSortear.setText("Sortear");
        butSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortearActionPerformed(evt);
            }
        });
        jPanel6.add(butSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 190, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 60, 70));

        campeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        campeao.setForeground(new java.awt.Color(4, 21, 111));
        campeao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(campeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 170, 50));

        parabens.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        parabens.setForeground(new java.awt.Color(4, 21, 111));
        parabens.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        parabens.setText("Parabéns");
        jPanel6.add(parabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 110, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 60, 70));

        butEncerrar.setBackground(new java.awt.Color(255, 255, 255));
        butEncerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butEncerrar.setForeground(new java.awt.Color(4, 21, 111));
        butEncerrar.setText("Encerrar Campeonato");
        butEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEncerrarActionPerformed(evt);
            }
        });
        jPanel6.add(butEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 220, 50));

        jTabbedPane1.addTab("Sorteio e Chaveamento", jPanel6);

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
        String url = "http://localhost:3030/";
        int idc = 0;
        int puts1 = 0;
        int puts2 = 0;
        List<Partidas> partidasList = new ArrayList<>();
        TimeResponsavel[] timeResponsavelArray = new TimeResponsavel[8];
        String nomeC = (String)ComboCamp3.getSelectedItem();
        
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
            try{
            conectar.executarSQL(
                "SELECT "
                +"times.nome,"
                +"times.tecnico"
                +" FROM "
                +"camp_time "
                +"left join campeonato on camp_time.id_camp = campeonato.id "
                +"left join times on camp_time.id_time = times.id"
                +" WHERE "
                +" id_camp = '"+ idc +"';"
            );
            while(conectar.getResultSet().next()){
                timeResponsavelArray[puts1]= new TimeResponsavel(conectar.getResultSet().getString(1), conectar.getResultSet().getString(2));
                puts1 = puts1+1;
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
                +"a.nome,"
                +"partida.golsT1,"
                +"b.nome,"
                +"partida.golsT2"
                +" FROM "
                +"partida "
                +"left join campeonato on partida.id_camp = campeonato.id "
                +"left join times a on partida.id_time1 = a.id "
                +"left join times b on partida.id_time2 = b.id"
                +" WHERE "
                +" id_camp = '"+ idc +"';"
            );
            while(conectar.getResultSet().next()){
                Partidas partida1 = new Partidas(new TimeGols[] {
                new TimeGols(conectar.getResultSet().getString(1), conectar.getResultSet().getString(2)),
                new TimeGols(conectar.getResultSet().getString(3), conectar.getResultSet().getString(4))
            });
            partidasList.add(partida1);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
            
        try {
            // Cria um objeto para representar os dados do JSON
            ClassesPDF.Campeonato campeonato = new ClassesPDF.Campeonato();
            campeonato.setCampeonatoNome(nomeC);
            campeonato.setTimes(timeResponsavelArray);
            campeonato.setPartidas(partidasList.toArray(new Partidas[partidasList.size()]));

            // Converte o objeto para JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(campeonato);

            // Cria a conexão HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setDoOutput(true);

            // Envia o JSON no corpo da requisição
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Obtém a resposta da requisição
            int responseCode = con.getResponseCode();

            System.out.println("Código de resposta: " + responseCode);
            String jsonResponse = "";
            try (InputStream inputStream = con.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            jsonResponse = response.toString();
            }

            // Imprime a resposta JSON
            System.out.println("Resposta JSON: " + jsonResponse);
            
            // Analisa o JSON utilizando a biblioteca Jackson
            ObjectMapper finalMapper = new ObjectMapper();
            JsonNode jsonNode = finalMapper.readTree(jsonResponse);
            
            // Verifica se a propriedade "pdfURL" está presente no JSON
            if (jsonNode.has("pdfURL")) {
                String pdfURL = jsonNode.get("pdfURL").asText();
                System.out.println("URL do PDF: " + pdfURL);
                Object[] options = { "Baixar PDF", "Abrir Link" };

        // Mostrar o JOptionPane
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Verificar a opção selecionada
            if (choice == 0) {
            // Opção "Baixar PDF" selecionada
            // Coloque aqui o código para baixar o arquivo PDF
                System.out.println("Baixando o arquivo PDF...");
                String saveDirectory = "C:/Users/Pichau/Downloads"; // Substitua pelo diretório onde você deseja salvar o arquivo
                String fileName = "RegistroCamepeonato"+(String)ComboCamp3.getSelectedItem()+".pdf"; // Substitua pelo nome desejado para o arquivo

        try {
            // Abre a conexão com o link do arquivo
            URL ur = new URL(pdfURL);
            InputStream inputStream = ur.openStream();

            // Cria um InputStream bufferizado para leitura
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            // Define o caminho completo do arquivo
            Path saveFilePath = Path.of(saveDirectory, fileName);

            // Salva o arquivo localmente usando o NIO
            Files.copy(bufferedInputStream, saveFilePath, StandardCopyOption.REPLACE_EXISTING);

            // Fecha os streams abertos
            bufferedInputStream.close();
            inputStream.close();

            System.out.println("Download concluído. O arquivo foi salvo em: " + saveFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
            } else if (choice == 1) {
            // Opção "Abrir Link" selecionada
            // Coloque aqui o código para abrir o link do PDF no navegador
                System.out.println("Abrindo o link do PDF no navegador...");
                try {
            // Cria uma instância da classe Desktop
            Desktop desktop = Desktop.getDesktop();

            // Verifica se o suporte para abrir a URL está disponível
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                // Cria uma instância da classe URI com a URL
                URI uri = new URI(pdfURL);

                // Abre a URL no navegador padrão
                desktop.browse(uri);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
            } else {
            // O JOptionPane foi fechado sem selecionar uma opção
                System.out.println("Nenhuma opção selecionada.");
            }
                } else {
                    System.out.println("A propriedade 'pdfURL' não está presente no JSON.");
                }
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

    private void time8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time8MouseClicked
        String v = time8.getText();
        if(v!=""){
            time78.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time8MouseClicked

    private void time7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time7MouseClicked
        String v = time7.getText();
        if(v!=""){
            time78.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time7MouseClicked

    private void time2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time2MouseClicked
        String v = time2.getText();
        if(v!=""){
            time12.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time2MouseClicked

    private void time1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time1MouseClicked
        String v = time1.getText();
        if(v!=""){
            time12.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time1MouseClicked

    private void time4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time4MouseClicked
        String v = time4.getText();
        if(v!=""){
            time34.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time4MouseClicked

    private void time3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time3MouseClicked
        String v = time3.getText();
        if(v!=""){
            time34.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time3MouseClicked

    private void time6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time6MouseClicked
        String v = time6.getText();
        if(v!=""){
            time56.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time6MouseClicked

    private void time5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time5MouseClicked
        String v = time5.getText();
        if(v!=""){
            time56.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time5MouseClicked

    private void time5678MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time5678MouseClicked
        String v = time5678.getText();
        if(v!=""){
            campeao.setText(v);
            parabens.setVisible(true);
            campeao.setVisible(true);
            butEncerrar.setEnabled(true);
            butEncerrar.setVisible(true);
        }
    }//GEN-LAST:event_time5678MouseClicked

    private void time78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time78MouseClicked
        String v = time78.getText();
        if(v!=""){
            time5678.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time78MouseClicked

    private void time56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time56MouseClicked
        String v = time56.getText();
        if(v!=""){
            time5678.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time56MouseClicked

    private void time12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time12MouseClicked
        String v = time12.getText();
        if(v!=""){
            time1234.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time12MouseClicked

    private void time34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time34MouseClicked
        String v = time34.getText();
        if(v!=""){
            time1234.setText(v);
            if(campeao.getText()!=""){
                campeao.setText("");
                parabens.setVisible(false);
                campeao.setVisible(false);
                butEncerrar.setEnabled(false);
                butEncerrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_time34MouseClicked

    private void time1234MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time1234MouseClicked
        String v = time1234.getText();
        if(v!=""){
            campeao.setText(v);
            parabens.setVisible(true);
            campeao.setVisible(true);
            butEncerrar.setEnabled(true);
            butEncerrar.setVisible(true);
        }
    }//GEN-LAST:event_time1234MouseClicked

    private void butSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortearActionPerformed
        List<String> times = new ArrayList<>();
        int idCmp = 0;
        String nCam = (String) ComboCamp2.getSelectedItem();
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
                idCmp = conectar.getResultSet().getInt(1);
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
                +" id_camp = '"+ idCmp +"';"
            );
            while(conectar.getResultSet().next()){
                times.add(conectar.getResultSet().getString(1));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
        }finally{
            conectar.fechaBanco();
        }
        sortearPosicao(times);
        ArrayList<JTextPane> textpanels = new ArrayList<>();
        textpanels.add(time1);
        textpanels.add(time2);
        textpanels.add(time3);
        textpanels.add(time4);
        textpanels.add(time5);
        textpanels.add(time6);
        textpanels.add(time7);
        textpanels.add(time8);

        for (int i = 0; i < textpanels.size(); i++) {
            if(i<times.size()){
                textpanels.get(i).setText(times.get(i));
            }else{
                textpanels.get(i).setText("");
            }
        }
    }//GEN-LAST:event_butSortearActionPerformed

    private void butEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEncerrarActionPerformed
        parabens.setVisible(false);
        campeao.setVisible(false);
        butEncerrar.setVisible(false);
        butEncerrar.setEnabled(false);
        time1.setText("");
        time2.setText("");
        time3.setText("");
        time4.setText("");
        time5.setText("");
        time6.setText("");
        time7.setText("");
        time8.setText("");
        time12.setText("");
        time34.setText("");
        time56.setText("");
        time78.setText("");
        time1234.setText("");
        time5678.setText("");
    }//GEN-LAST:event_butEncerrarActionPerformed
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
    public void sortearPosicao(List<String> times){
        Random random = new Random();
        Collections.shuffle(times,random);
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
    private javax.swing.JPanel Chaveamento1;
    private javax.swing.JPanel Chaveamento3;
    private javax.swing.JPanel Chaveamento4;
    private javax.swing.JPanel Chaveamento5;
    private javax.swing.JComboBox<String> ComboCamp1;
    private javax.swing.JComboBox<String> ComboCamp2;
    private javax.swing.JComboBox<String> ComboCamp3;
    private javax.swing.JComboBox<String> ComboTime1;
    private javax.swing.JComboBox<String> ComboTime2;
    private javax.swing.JLabel IconEstatistica;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconResultado;
    private javax.swing.JTable TabelaResultado;
    private javax.swing.JToggleButton butEncerrar;
    private javax.swing.JToggleButton butSortear;
    private javax.swing.JLabel campeao;
    private javax.swing.JPanel chave11;
    private javax.swing.JPanel chave12;
    private javax.swing.JPanel chave13;
    private javax.swing.JPanel chave9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel parabens;
    private javax.swing.JTextPane time1;
    private javax.swing.JTextPane time12;
    private javax.swing.JTextPane time1234;
    private javax.swing.JTextPane time2;
    private javax.swing.JTextPane time3;
    private javax.swing.JTextPane time34;
    private javax.swing.JTextPane time4;
    private javax.swing.JTextPane time5;
    private javax.swing.JTextPane time56;
    private javax.swing.JTextPane time5678;
    private javax.swing.JTextPane time6;
    private javax.swing.JTextPane time7;
    private javax.swing.JTextPane time78;
    private javax.swing.JTextPane time8;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
