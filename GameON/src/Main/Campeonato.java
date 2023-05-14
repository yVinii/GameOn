package Main;
import java.awt.Toolkit;
import static java.lang.System.exit;
public class Campeonato extends javax.swing.JFrame {
    public Campeonato(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        parabens.setVisible(false);
        campeao.setVisible(false);
        butEncerrar.setEnabled(false);
        butEncerrar.setVisible(false);
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
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
        jLabel21 = new javax.swing.JLabel();
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
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 21, 111));
        jLabel10.setText("Nome:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 50));

        TxtFieldNome1.setBackground(new java.awt.Color(255, 255, 255));
        TxtFieldNome1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtFieldNome1.setForeground(new java.awt.Color(4, 21, 111));
        TxtFieldNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtFieldNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(TxtFieldNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(4, 21, 111));
        jButton2.setText("Limpar");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 70));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(4, 21, 111));
        jButton1.setText("Adicionar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 190, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Quadra e Data:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 260, 50));

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(4, 21, 111));
        jScrollPane2.setViewportView(jTextPane1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 60, 70));

        jTabbedPane1.addTab("Criar Campeonato", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 21, 111));
        jLabel11.setText("Campeonato:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 230, 50));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 190, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setText("Time:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 220, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(4, 21, 111));
        jButton5.setText("Adicionar");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 190, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 60, 70));

        jTabbedPane1.addTab("Adicionar Times", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 21, 111));
        jLabel14.setText("Selecione o Campeonato:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 30));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 215, -1, 10));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 165, -1, 10));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 265, -1, 10));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 265, -1, 10));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 165, -1, 10));

        Chaveamento1.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time8.setEditable(false);
        time8.setBackground(new java.awt.Color(255, 255, 255));
        time8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time8.setForeground(new java.awt.Color(4, 21, 111));
        time8.setText("FLUMINENSE");
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
        time7.setText("CRUZEIRO");
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

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        chave9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 10));

        Chaveamento1.add(chave9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel5.add(Chaveamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, 100));

        Chaveamento4.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time2.setEditable(false);
        time2.setBackground(new java.awt.Color(255, 255, 255));
        time2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time2.setForeground(new java.awt.Color(4, 21, 111));
        time2.setText("ATLETICO");
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
        time1.setText("CORINTHIANS");
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

        jPanel5.add(Chaveamento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 100));

        Chaveamento5.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time4.setEditable(false);
        time4.setBackground(new java.awt.Color(255, 255, 255));
        time4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time4.setForeground(new java.awt.Color(4, 21, 111));
        time4.setText("FORTALEZA");
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
        time3.setText("PALMEIRAS");
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

        jPanel5.add(Chaveamento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 100));

        Chaveamento3.setBackground(new java.awt.Color(255, 255, 255));
        Chaveamento3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time6.setEditable(false);
        time6.setBackground(new java.awt.Color(255, 255, 255));
        time6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        time6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        time6.setForeground(new java.awt.Color(4, 21, 111));
        time6.setText("BAHIA");
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
        time5.setText("FLAMENGO");
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

        jPanel5.add(Chaveamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, 100));

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

        jPanel5.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, 40));

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

        jPanel5.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, 30));

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

        jPanel5.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 80, 30));

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

        jPanel5.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, 30));

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

        jPanel5.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, 30));

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

        jPanel5.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 40));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 20, 60));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 20, 60));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 20, 60));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 20, 60));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 20, 60));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 20, 60));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 215, -1, 10));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 215, -1, 10));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/retaIcon.png"))); // NOI18N
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 215, -1, 10));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xIcon.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 40));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 20, 60));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 20, 60));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 20, 60));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 20, 60));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 20, 60));

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 20, 60));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 20, 60));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verticalIcon.png"))); // NOI18N
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 20, 60));

        butSortear.setBackground(new java.awt.Color(255, 255, 255));
        butSortear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butSortear.setForeground(new java.awt.Color(4, 21, 111));
        butSortear.setText("Sortear");
        jPanel5.add(butSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 190, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trofeuIcon.png"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 60, 70));

        campeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        campeao.setForeground(new java.awt.Color(4, 21, 111));
        campeao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(campeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 130, 50));

        parabens.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        parabens.setForeground(new java.awt.Color(4, 21, 111));
        parabens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parabens.setText("Parabéns");
        jPanel5.add(parabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campoIcon.png"))); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 60, 70));

        butEncerrar.setBackground(new java.awt.Color(255, 255, 255));
        butEncerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butEncerrar.setForeground(new java.awt.Color(4, 21, 111));
        butEncerrar.setText("Encerrar Campeonato");
        jPanel5.add(butEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 220, 50));

        jTabbedPane1.addTab("Sorteio e Chaveamento", jPanel5);

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

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
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
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campeonato("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButJogadores;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JLabel ButTimes;
    private javax.swing.JPanel Chaveamento1;
    private javax.swing.JPanel Chaveamento3;
    private javax.swing.JPanel Chaveamento4;
    private javax.swing.JPanel Chaveamento5;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconJogadores;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JLabel IconTimes;
    private javax.swing.JTextField TxtFieldNome1;
    private javax.swing.JToggleButton butEncerrar;
    private javax.swing.JToggleButton butSortear;
    private javax.swing.JLabel campeao;
    private javax.swing.JPanel chave11;
    private javax.swing.JPanel chave12;
    private javax.swing.JPanel chave13;
    private javax.swing.JPanel chave9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
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
