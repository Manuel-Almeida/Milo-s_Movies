
package administrador;

public class BD extends javax.swing.JFrame {

    public BD() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        comboTablas = new javax.swing.JComboBox<>();
        labelTabla = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        labelNombre1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        labelGenero1 = new javax.swing.JLabel();
        genero1 = new javax.swing.JTextField();
        labelAccion1 = new javax.swing.JLabel();
        comboAcciones1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Control");
        setPreferredSize(new java.awt.Dimension(870, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setLayout(null);

        labelTitle.setBackground(new java.awt.Color(255, 0, 0));
        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("MySQL Database");
        labelTitle.setOpaque(true);
        jPanel1.add(labelTitle);
        labelTitle.setBounds(0, 0, 870, 42);

        labelGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelGenero.setForeground(new java.awt.Color(255, 255, 255));
        labelGenero.setText("Duracion:");
        jPanel1.add(labelGenero);
        labelGenero.setBounds(40, 310, 70, 20);

        comboTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administracion", "Categorias", "Directores", "Documentales", "Pagos", "Peliculas", "Reparto", "Series", "Usuarios" }));
        jPanel1.add(comboTablas);
        comboTablas.setBounds(420, 110, 94, 20);

        labelTabla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTabla.setForeground(new java.awt.Color(255, 255, 255));
        labelTabla.setText("Tabla:");
        jPanel1.add(labelTabla);
        labelTabla.setBounds(350, 110, 60, 20);

        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        jPanel1.add(genero);
        genero.setBounds(40, 340, 170, 20);

        labelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre1.setText("Nombre:");
        jPanel1.add(labelNombre1);
        labelNombre1.setBounds(40, 170, 60, 20);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(40, 200, 170, 20);

        labelGenero1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelGenero1.setForeground(new java.awt.Color(255, 255, 255));
        labelGenero1.setText("Genero:");
        jPanel1.add(labelGenero1);
        labelGenero1.setBounds(40, 240, 60, 20);

        genero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero1ActionPerformed(evt);
            }
        });
        jPanel1.add(genero1);
        genero1.setBounds(40, 270, 170, 20);

        labelAccion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAccion1.setForeground(new java.awt.Color(255, 255, 255));
        labelAccion1.setText("Accion:");
        jPanel1.add(labelAccion1);
        labelAccion1.setBounds(100, 110, 70, 20);

        comboAcciones1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guardar", "Modificar", "Eliminar" }));
        jPanel1.add(comboAcciones1);
        comboAcciones1.setBounds(180, 110, 68, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void genero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAcciones1;
    private javax.swing.JComboBox<String> comboTablas;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField genero1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAccion1;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelGenero1;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelTabla;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
