
package administrador;

public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelServer = new javax.swing.JLabel();
        labelBD = new javax.swing.JLabel();
        buttonServer = new javax.swing.JButton();
        buttonBaServer = new javax.swing.JButton();
        buttonBaBD = new javax.swing.JButton();
        buttonBD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Control");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setLayout(null);

        labelServer.setBackground(new java.awt.Color(255, 0, 0));
        labelServer.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        labelServer.setForeground(new java.awt.Color(255, 255, 255));
        labelServer.setText("Servidor");
        labelServer.setOpaque(true);
        jPanel1.add(labelServer);
        labelServer.setBounds(0, 300, 880, 42);

        labelBD.setBackground(new java.awt.Color(255, 0, 0));
        labelBD.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        labelBD.setForeground(new java.awt.Color(255, 255, 255));
        labelBD.setText("Base de Datos");
        labelBD.setOpaque(true);
        jPanel1.add(labelBD);
        labelBD.setBounds(0, 0, 880, 42);

        buttonServer.setText("File Manager");
        buttonServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonServerActionPerformed(evt);
            }
        });
        jPanel1.add(buttonServer);
        buttonServer.setBounds(110, 420, 230, 100);

        buttonBaServer.setText("Backup");
        buttonBaServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaServerActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBaServer);
        buttonBaServer.setBounds(520, 420, 230, 100);

        buttonBaBD.setText("Backup");
        buttonBaBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaBDActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBaBD);
        buttonBaBD.setBounds(520, 120, 230, 100);

        buttonBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonBD.png"))); // NOI18N
        buttonBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBDActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBD);
        buttonBD.setBounds(110, 120, 230, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonServerActionPerformed

    private void buttonBaServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBaServerActionPerformed

    private void buttonBaBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBaBDActionPerformed

    private void buttonBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBD;
    private javax.swing.JButton buttonBaBD;
    private javax.swing.JButton buttonBaServer;
    private javax.swing.JButton buttonServer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBD;
    private javax.swing.JLabel labelServer;
    // End of variables declaration//GEN-END:variables
}
