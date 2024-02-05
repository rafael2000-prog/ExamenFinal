/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.RestauranteVista;

import ec.edu.ups.Controlador.RestauranteControlador;

/**
 *
 * @author ESTUDIANTE
 */
public class CrearRestaurante extends javax.swing.JInternalFrame {
    private RestauranteControlador restauranteControlador;

    /**
     * Creates new form CrearRestaurante
     * @param restauranteControlador
     */
    public CrearRestaurante(RestauranteControlador restauranteControlador) {
        initComponents();
        this.restauranteControlador = restauranteControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreRestaurante = new javax.swing.JTextField();
        txtDireccionRestauten = new javax.swing.JTextField();
        txtTelefonoRestauten = new javax.swing.JTextField();
        txtAforoRestauten = new javax.swing.JTextField();
        btnGuardarRestaurante = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Aforo:");

        txtDireccionRestauten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionRestautenActionPerformed(evt);
            }
        });

        txtTelefonoRestauten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRestautenActionPerformed(evt);
            }
        });

        txtAforoRestauten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAforoRestautenActionPerformed(evt);
            }
        });

        btnGuardarRestaurante.setText("Guardar");
        btnGuardarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRestauranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)
                                .addComponent(txtNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefonoRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccionRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txtAforoRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnGuardarRestaurante)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefonoRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAforoRestauten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnGuardarRestaurante)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionRestautenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionRestautenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionRestautenActionPerformed

    private void txtTelefonoRestautenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRestautenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRestautenActionPerformed

    private void txtAforoRestautenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAforoRestautenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAforoRestautenActionPerformed

    private void btnGuardarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRestauranteActionPerformed
        String nombre = txtNombreRestaurante.getText();
        String direccion = txtDireccionRestauten.getText();
        String telefono = txtTelefonoRestauten.getText();
        String aforo = txtAforoRestauten.getText();
        restauranteControlador.crear(nombre, direccion, telefono, aforo);
    }//GEN-LAST:event_btnGuardarRestauranteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAforoRestauten;
    private javax.swing.JTextField txtDireccionRestauten;
    private javax.swing.JTextField txtNombreRestaurante;
    private javax.swing.JTextField txtTelefonoRestauten;
    // End of variables declaration//GEN-END:variables
}