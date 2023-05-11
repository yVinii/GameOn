package Main;
import Conexões.MySQL;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class TrocarUsuarioMesario extends javax.swing.JFrame {
    String usuario;
    MySQL conectar = new MySQL();
    String nome;
    public TrocarUsuarioMesario(String usu) {
        initComponents();
        LabelUsu.setText(usu);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone]
        usuario = usu;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LabelUsu = new javax.swing.JLabel();
        txtUsuConfirm = new javax.swing.JTextField();
        txtUsuAtual = new javax.swing.JTextField();
        txtUsu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 21, 111));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuário Atual:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 21, 111));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Usuário:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 21, 111));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirmar Usuário:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 50));

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(4, 21, 111));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 120, 60));

        Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Confirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(4, 21, 111));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, 60));

        jPanel2.setBackground(new java.awt.Color(4, 21, 111));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trocar Usuário:");

        LabelUsu.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        LabelUsu.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(LabelUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        txtUsuConfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuConfirm.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel1.add(txtUsuConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 240, 50));

        txtUsuAtual.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuAtual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuAtual.setForeground(new java.awt.Color(4, 21, 111));
        txtUsuAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel1.add(txtUsuAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 50));

        txtUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtUsu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsu.setForeground(new java.awt.Color(4, 21, 111));
        txtUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 21, 111)));
        jPanel1.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if(!txtUsu.getText().equals("") && !txtUsuAtual.getText().equals("")&&!txtUsuConfirm.getText().equals("")){
            if(txtUsuAtual.getText().equals(usuario)){
                if(txtUsu.getText().equals(txtUsuConfirm.getText())){
                    conectar.conectaBanco();
                    boolean status = false;
                    try {status = this.conectar.updateSQL(
                        "UPDATE mesario SET "
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
                new TrocarUsuarioMesario("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel LabelUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUsu;
    private javax.swing.JTextField txtUsuAtual;
    private javax.swing.JTextField txtUsuConfirm;
    // End of variables declaration//GEN-END:variables
}
