package Main;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Splash extends javax.swing.JFrame {
    public Splash() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//logo-clara.png"))); // Define Icone
        new Thread(){
           public void run() {
                for (int i = 0; i < 101; i++) {
                    barrap.setValue(i);
                    
                    try {
                        sleep(60);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                Login minhaTela= new Login();
                minhaTela.setVisible(true);
                dispose();
        }
            
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        barrap = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 191));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-clara.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 43)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 0, 85));
        jLabel3.setText("ON");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 21, 111));
        jLabel5.setText("LIGAS ESPORTIVAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 40));

        barrap.setPreferredSize(new java.awt.Dimension(146, 0));
        jPanel1.add(barrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 171, 400, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 43)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 21, 111));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
