package Main;

import java.awt.Toolkit;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import Conexões.MySQL;
import Classes.*;

public class Login extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    MySQL conT = new MySQL();
    Funcionario p1 = new Funcionario();
    Funcionario p2 = new Funcionario();
    public Login() {
        initComponents(); 
        Visivel.setVisible(false);
        Visivel.setEnabled(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ButEntrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        Invisivel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Visivel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(63, 0, 85));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 40));

        jPanel4.setBackground(new java.awt.Color(63, 0, 85));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 40));

        jPanel5.setBackground(new java.awt.Color(63, 0, 85));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 40));

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Canto5.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Canto4.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 550));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 20, 550));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 21, 111));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-clara.png"))); // NOI18N
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 340, 130));

        ButEntrar.setBackground(new java.awt.Color(4, 21, 111));
        ButEntrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ButEntrar.setForeground(new java.awt.Color(4, 21, 111));
        ButEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Login.png"))); // NOI18N
        ButEntrar.setText("Entrar");
        ButEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButEntrarMouseClicked(evt);
            }
        });
        jPanel1.add(ButEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 200, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setText("Usuário:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 140, 70));

        TxtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(4, 21, 111));
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 300, 50));

        Invisivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Invisivel.png"))); // NOI18N
        Invisivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvisivelMouseClicked(evt);
            }
        });
        jPanel1.add(Invisivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 70, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 21, 111));
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 140, 70));

        TxtSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(4, 21, 111));
        jPanel1.add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 300, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Usuario.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 70, 70));

        Visivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Visivel.png"))); // NOI18N
        Visivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisivelMouseClicked(evt);
            }
        });
        jPanel1.add(Visivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 70, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Fechar.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 110, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Canto.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 100, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InvisivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvisivelMouseClicked
        TxtSenha.setEchoChar((char)(0));
        Visivel.setVisible(true);
        Visivel.setEnabled(true);
        Invisivel.setVisible(false);
        Invisivel.setEnabled(false);
    }//GEN-LAST:event_InvisivelMouseClicked

    private void VisivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisivelMouseClicked
        TxtSenha.setEchoChar((char)(8226));
        Invisivel.setVisible(true);
        Invisivel.setEnabled(true);
        Visivel.setVisible(false);
        Visivel.setEnabled(false);
    }//GEN-LAST:event_VisivelMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void ButEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButEntrarMouseClicked
        
            conectar.conectaBanco();
            p1 = new Funcionario();

        
        String usuario = TxtUsuario.getText();
        String senha = TxtSenha.getText();
        //String senha = TxtSenha.getText();
        try {this.conectar.executarSQL(
                   "SELECT "
                    + "usuario,"
                    + "senha"
                 + " FROM"
                     + " admin"
                 + " WHERE"
                     + " usuario = '" + usuario + "'"+ " AND"
                     + " senha = '" + senha + "'"
                
                + ";"
            );
        while(conectar.getResultSet().next()){
            p1.setUsuario(conectar.getResultSet().getString(1));
            p1.setSenha(conectar.getResultSet().getString(2));
        }
        if(p1.getUsuario().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
            JOptionPane.showMessageDialog(null, "Bem Vindo Admin "+ usuario);
            InicioAdm minhaTela = new InicioAdm(usuario);
            
            minhaTela.setVisible(true);
            dispose();
        }
        } catch (Exception e) {
            
            conT.conectaBanco();
            p2 = new Funcionario();
            try {this.conT.executarSQL(
                    "SELECT "
                        + "usuario,"
                        + "senha"
                 + " FROM"
                     + " mesario"
                 + " WHERE"
                     + " usuario = '" + usuario + "'"+ " AND"
                     + " senha = '" + senha + "'"
                
                + ";"
            );
        while(conT.getResultSet().next()){
            p2.setUsuario(conT.getResultSet().getString(1));
            p2.setSenha(conT.getResultSet().getString(2));
        }
        if(p2.getUsuario().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar cadastro");
        }else{
            JOptionPane.showMessageDialog(null, "Bem Vindo Mesário "+ usuario);
           
            InicioMesario minhatela = new InicioMesario(usuario);
            minhatela.setVisible(true);
            dispose();
        }
        } catch (Exception e1) { 
            JOptionPane.showMessageDialog(null, "Usuário ou senha estão inválidos");
            TxtUsuario.setText("");
            TxtSenha.setText("");
        } finally {  conT.fechaBanco();
        }
            
        } finally {  conectar.fechaBanco();
        }
            
    }//GEN-LAST:event_ButEntrarMouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButEntrar;
    private javax.swing.JLabel Invisivel;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel Visivel;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}
