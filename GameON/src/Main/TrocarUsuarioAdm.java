package Main;
import Conexões.MySQL;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class TrocarUsuarioAdm extends javax.swing.JFrame {
    String usuario;
    MySQL conectar = new MySQL();
    public TrocarUsuarioAdm(String usu) {
        initComponents();
        LabelUsu.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone]
        usuario = usu;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cancelar2 = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LabelUsu = new javax.swing.JLabel();
        txtUsuConfirm = new javax.swing.JTextField();
        txtUsuAtual = new javax.swing.JTextField();
        txtUsu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 21, 111));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuário Atual:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 21, 111));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Novo Usuário:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 21, 111));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirmar Usuário:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 50));

        Cancelar2.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancelar2.setForeground(new java.awt.Color(4, 21, 111));
        Cancelar2.setText("Cancelar");
        Cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar2ActionPerformed(evt);
            }
        });
        jPanel3.add(Cancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 120, 60));

        Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Confirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(4, 21, 111));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, 60));

        jPanel4.setBackground(new java.awt.Color(4, 21, 111));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Trocar Usuário:");

        LabelUsu.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelUsu.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(LabelUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        txtUsuConfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuConfirm.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel3.add(txtUsuConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 240, 50));

        txtUsuAtual.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuAtual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuAtual.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel3.add(txtUsuAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 50));

        txtUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtUsu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsu.setForeground(new java.awt.Color(4, 21, 111));
        txtUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel3.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar2ActionPerformed
        dispose();
    }//GEN-LAST:event_Cancelar2ActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if(!txtUsu.getText().equals("") && !txtUsuAtual.getText().equals("")&&!txtUsuConfirm.getText().equals("")){
            if(txtUsuAtual.getText().equals(usuario)){
                if(txtUsu.getText().equals(txtUsuConfirm.getText())){
                    conectar.conectaBanco();
                    boolean status = false;
                    try {status = this.conectar.updateSQL(
                        "UPDATE admin SET "
                        + "usuario = '" + txtUsu.getText() + "'"
                        + " WHERE "
                        + "usuario = '" + usuario + "'"
                        + ";"
                    );
                    if(status){JOptionPane.showMessageDialog(null, "Troca de usuário realizada com sucesso");
                        LimparCampos();
                        dispose();
                    }else{ JOptionPane.showMessageDialog(null, "Houve um erro na troca de usuário, tente novamente");
                    }
                } catch (Exception e) {
                    e.getMessage();
                    JOptionPane.showMessageDialog(null, "Houve um erro na troca de usuário");
                } finally {conectar.fechaBanco();
                }
            }else{
                txtUsu.setText("");
                txtUsuConfirm.setText("");
                JOptionPane.showMessageDialog(null, "Os usuários estão diferentes!","Trocar Usuário",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            txtUsuAtual.setText("");
            JOptionPane.showMessageDialog(null, "O usuário atual está errada!","Trocar Usuário",JOptionPane.ERROR_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!","Trocar Usuário",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarActionPerformed
    
    private void LimparCampos(){
        txtUsu.setText("");
        txtUsuAtual.setText("");
        txtUsuConfirm.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrocarUsuarioAdm("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JButton Cancelar2;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel LabelUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtUsu;
    private javax.swing.JTextField txtUsuAtual;
    private javax.swing.JTextField txtUsuConfirm;
    // End of variables declaration//GEN-END:variables
}
