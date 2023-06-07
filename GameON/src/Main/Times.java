package Main;
import Classes.*;
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
public class Times extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    String time = null;
    public Times(String usu) {
        initComponents();
        txtUsuario.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        AtualizarComboTimes(ComboTimes1);
        AtualizarComboTimes(ComboTimes2);
        AtualizarComboJogadores(ComboJogadores1);
        ListarDados();
    }
    public void ListarDados() {
        conectar.conectaBanco();
    
        String listar_dados = 
                "SELECT "
                + "* "                                
                + "FROM "
                + "times "
                + "ORDER BY "
                + "ID"
                + ";";

        try{
            conectar.executarSQL(listar_dados);
            DefaultTableModel model =(DefaultTableModel) TabelaTimes.getModel();
            model.setNumRows(0);
            while(conectar.getResultSet().next()){
                model.addRow(new Object[]{
                this.conectar.getResultSet().getString(1),
                this.conectar.getResultSet().getString(2),
                this.conectar.getResultSet().getString(3)
                });     
            }
        } 
        catch (HeadlessException | SQLException e) {            
                JOptionPane.showMessageDialog(null, "Falha em buscar times!");
        } finally{  
            ((DefaultTableCellRenderer) TabelaTimes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) TabelaTimes.getDefaultRenderer(JLabel.class)).setHorizontalAlignment(SwingConstants.CENTER);
            conectar.fechaBanco();
        }  
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtResponsavel = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        ButLimpar = new javax.swing.JButton();
        ButAdicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTimes = new javax.swing.JTable();
        ButExcluir = new javax.swing.JButton();
        ButAtualizar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboJogadores1 = new javax.swing.JComboBox<>();
        ComboTimes1 = new javax.swing.JComboBox<>();
        ButIncluir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ComboTimes2 = new javax.swing.JComboBox<>();
        ComboJogadores2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ButBuscar2 = new javax.swing.JButton();
        ButRemover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IconMesario = new javax.swing.JLabel();
        ButMesario = new javax.swing.JLabel();
        IconCamp = new javax.swing.JLabel();
        ButCamp = new javax.swing.JLabel();
        IconJogadores = new javax.swing.JLabel();
        ButJogadores = new javax.swing.JLabel();
        IconInicio = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
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
        jLabel3.setText("Times.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 50));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(4, 21, 111));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(4, 21, 111));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(4, 21, 111));
        jLabel10.setText("Nome:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setText("Responsável:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        TxtResponsavel.setBackground(new java.awt.Color(255, 255, 255));
        TxtResponsavel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtResponsavel.setForeground(new java.awt.Color(4, 21, 111));
        TxtResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtResponsavel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(TxtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 470, 50));

        TxtNome.setBackground(new java.awt.Color(255, 255, 255));
        TxtNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtNome.setForeground(new java.awt.Color(4, 21, 111));
        TxtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        TxtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(TxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 470, 50));

        ButLimpar.setBackground(new java.awt.Color(255, 255, 255));
        ButLimpar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButLimpar.setForeground(new java.awt.Color(4, 21, 111));
        ButLimpar.setText("Limpar");
        ButLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimparActionPerformed(evt);
            }
        });
        jPanel3.add(ButLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 190, 70));

        ButAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        ButAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAdicionar.setForeground(new java.awt.Color(4, 21, 111));
        ButAdicionar.setText("Adicionar");
        ButAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(ButAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 190, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/escudoIcon.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 60, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/timeIcon.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jTabbedPane1.addTab("Adicionar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(4, 21, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaTimes.setBackground(new java.awt.Color(255, 255, 255));
        TabelaTimes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabelaTimes.setForeground(new java.awt.Color(4, 21, 111));
        TabelaTimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTimes.setRowHeight(35);
        TabelaTimes.setSelectionBackground(new java.awt.Color(4, 21, 111));
        TabelaTimes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TabelaTimes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        ButExcluir.setBackground(new java.awt.Color(255, 255, 255));
        ButExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButExcluir.setForeground(new java.awt.Color(4, 21, 111));
        ButExcluir.setText("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(ButExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 70));

        ButAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        ButAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButAtualizar.setForeground(new java.awt.Color(4, 21, 111));
        ButAtualizar.setText("Atualizar");
        ButAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAtualizarActionPerformed(evt);
            }
        });
        jPanel4.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/escudoIcon.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 60, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/timeIcon.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 60, 70));

        jTabbedPane1.addTab("Tabela", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(4, 21, 111));
        jLabel11.setText("Time:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setText("Jogadores:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/timeIcon.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        ComboJogadores1.setBackground(new java.awt.Color(255, 255, 255));
        ComboJogadores1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboJogadores1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.add(ComboJogadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 460, 50));

        ComboTimes1.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimes1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTimes1.setForeground(new java.awt.Color(4, 21, 111));
        jPanel5.add(ComboTimes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 460, 50));

        ButIncluir.setBackground(new java.awt.Color(255, 255, 255));
        ButIncluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButIncluir.setForeground(new java.awt.Color(4, 21, 111));
        ButIncluir.setText("Incluir");
        ButIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButIncluirActionPerformed(evt);
            }
        });
        jPanel5.add(ButIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 190, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/escudoIcon.png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 60, 70));

        jTabbedPane1.addTab("Incluir Jogador", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/timeIcon.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 70));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 21, 111));
        jLabel17.setText("Time:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 50));

        ComboTimes2.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimes2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboTimes2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.add(ComboTimes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 300, 50));

        ComboJogadores2.setBackground(new java.awt.Color(255, 255, 255));
        ComboJogadores2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboJogadores2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel6.add(ComboJogadores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 460, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(4, 21, 111));
        jLabel18.setText("Jogadores:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/escudoIcon.png"))); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 60, 70));

        ButBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        ButBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButBuscar2.setForeground(new java.awt.Color(4, 21, 111));
        ButBuscar2.setText("Buscar");
        ButBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscar2ActionPerformed(evt);
            }
        });
        jPanel6.add(ButBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 150, 50));

        ButRemover.setBackground(new java.awt.Color(255, 255, 255));
        ButRemover.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ButRemover.setForeground(new java.awt.Color(4, 21, 111));
        ButRemover.setText("Remover");
        ButRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRemoverActionPerformed(evt);
            }
        });
        jPanel6.add(ButRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 190, 70));

        jTabbedPane1.addTab("Tirar Jogador", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 650, 480));

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));
        jPanel2.setForeground(new java.awt.Color(4, 21, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Times");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/times_1.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 60));

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
    
    private void ButBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscar2ActionPerformed
        String item = (String)ComboTimes2.getSelectedItem();
        int id= 0;
        ComboJogadores2.removeAllItems();
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"id"
            +" FROM "
                +"times"
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
                +"nome"
            +" FROM "
                +"jogador"
                +" WHERE "
                +" id_time = '"+ id +"';"
        );
        while(conectar.getResultSet().next()){
            ComboJogadores2.addItem(conectar.getResultSet().getString(1));
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            }finally{
            conectar.fechaBanco();
    }
    }//GEN-LAST:event_ButBuscar2ActionPerformed

    private void ButRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRemoverActionPerformed
        String Njogador = (String)ComboJogadores2.getSelectedItem();
        int idj = 0;
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
        "SELECT "
            +"id"
        +" FROM "
            +"jogador"
            +" WHERE "
            +" nome = '"+ Njogador +"'"
            +";"
        );
        while(conectar.getResultSet().next()){
            idj = conectar.getResultSet().getInt(1);
            
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            }finally{
            conectar.fechaBanco();
    }
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE jogador SET "
                                    + "id_time = NULL"
                                + " WHERE "
                                + "id = '" + idj + "'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                            AtualizarComboJogadores(ComboJogadores1);
                            ComboJogadores2.removeAllItems();
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conectar.fechaBanco();
                        }
    }//GEN-LAST:event_ButRemoverActionPerformed

    private void ButAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAdicionarActionPerformed
        int status=0;
        conectar.conectaBanco();
        Time tim1 = new Time();
        tim1.setNome(TxtNome.getText());
        tim1.setTecnico(TxtResponsavel.getText());

        try {
            status = this.conectar.insertSQL("INSERT INTO times ("
                    + "nome,"
                    + "tecnico"
                + ") VALUES ("
                    + "'" + tim1.getNome() + "',"
                    + "'" + tim1.getTecnico() + "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Time cadastrado com sucesso");
                    LimparAdicionar();
                    ListarDados();
                    AtualizarComboTimes(ComboTimes1);
                    AtualizarComboTimes(ComboTimes2);
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
    }//GEN-LAST:event_ButAdicionarActionPerformed

    private void ButLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimparActionPerformed
        LimparAdicionar();
    }//GEN-LAST:event_ButLimparActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        int b = TabelaTimes.getSelectedRow();
        if(b==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String a = (String) TabelaTimes.getValueAt(b, 0);
            conectar.conectaBanco();
            boolean status = false;
            try {
                status = this.conectar.updateSQL(
                    "DELETE FROM times "
                    + " WHERE "
                    + "id = '" + a + "'"
                    + ";"
                );
                if(status){ JOptionPane.showMessageDialog(null, "Time deletado com sucesso");
                    ListarDados();
                    AtualizarComboTimes(ComboTimes1);
                    AtualizarComboTimes(ComboTimes2);
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o time");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o time");
            } finally {conectar.fechaBanco();
            }
        }
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButIncluirActionPerformed
        String Ntime = (String)ComboTimes1.getSelectedItem();
        int idt= 0;
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"id"
            +" FROM "
                +"times"
                +" WHERE "
                +" nome = '"+ Ntime +"'"
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
    
        String Njogador = (String)ComboJogadores1.getSelectedItem();
        int idj = 0;
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
        "SELECT "
            +"id"
        +" FROM "
            +"jogador"
            +" WHERE "
            +" nome = '"+ Njogador +"'"
            +";"
        );
        while(conectar.getResultSet().next()){
            idj = conectar.getResultSet().getInt(1);
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            }finally{
            conectar.fechaBanco();
    }
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE jogador SET "
                                    + "id_time = '" + idt + "'"
                                + " WHERE "
                                + "id = '" + idj + "'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                            AtualizarComboJogadores(ComboJogadores1);
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conectar.fechaBanco();
                        }
        
    }//GEN-LAST:event_ButIncluirActionPerformed

    private void ButAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAtualizarActionPerformed
        int c = TabelaTimes.getSelectedRow();
        if(c==-1){
            JOptionPane.showMessageDialog(null, "Alguma linha deve ser selecionada para essa ação", "Erro Excluir", JOptionPane.ERROR_MESSAGE);
        }else{
            String id = (String) TabelaTimes.getValueAt(c, 0);
            String nom = (String) TabelaTimes.getValueAt(c, 1);
            String tecnic = (String) TabelaTimes.getValueAt(c, 2);
            conectar.conectaBanco();
                    boolean status = false;
                        try {status = this.conectar.updateSQL(
                                "UPDATE times SET "
                                    + "nome = '" + nom + "',"
                                    + "tecnico = '" + tecnic + "'"
                                + " WHERE "
                                + "id = '" + id + "'"
                                + ";"
                            );
                        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                            ListarDados();
                            AtualizarComboTimes(ComboTimes1);
                            AtualizarComboTimes(ComboTimes2);
                        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
                        }
                        } catch (Exception e) {
                            e.getMessage();
                            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
                        } finally {conectar.fechaBanco();
                        }
        }
    }//GEN-LAST:event_ButAtualizarActionPerformed
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
                JOptionPane.showMessageDialog(null, "Erro ao buscar aq!");
            }finally{
            conectar.fechaBanco();
    }
    }
    public void AtualizarComboJogadores(JComboBox aaa){
        aaa.removeAllItems();
        conectar.conectaBanco();
    try{
        conectar.executarSQL(
            "SELECT "
                +"nome"
            +" FROM "
                +"jogador"
                + " WHERE "
                    + "id_time is null"
                    + ";"
        );
        while(conectar.getResultSet().next()){   
            aaa.addItem(conectar.getResultSet().getString(1));
        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar aqui!");
            }finally{
            conectar.fechaBanco();
    }
    }
    public void LimparAdicionar(){
        TxtNome.setText("");
        TxtResponsavel.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Times("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_logout;
    private javax.swing.JButton ButAdicionar;
    private javax.swing.JButton ButAtualizar;
    private javax.swing.JButton ButBuscar2;
    private javax.swing.JLabel ButCamp;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButIncluir;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButJogadores;
    private javax.swing.JButton ButLimpar;
    private javax.swing.JLabel ButMesario;
    private javax.swing.JButton ButRemover;
    private javax.swing.JComboBox<String> ComboJogadores1;
    private javax.swing.JComboBox<String> ComboJogadores2;
    private javax.swing.JComboBox<String> ComboTimes1;
    private javax.swing.JComboBox<String> ComboTimes2;
    private javax.swing.JLabel IconCamp;
    private javax.swing.JLabel IconInicio;
    private javax.swing.JLabel IconJogadores;
    private javax.swing.JLabel IconMesario;
    private javax.swing.JTable TabelaTimes;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtResponsavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
