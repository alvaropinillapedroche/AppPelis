package app;

import javax.swing.JOptionPane;

public class EditarPeliculas extends javax.swing.JDialog {

    public EditarPeliculas(java.awt.Dialog parent, boolean modal, String titulo) {
        super(parent, modal);
        initComponents();
        tituloPeli.setText(titulo);
        PeliculasAleatorias.tituloPelicula = titulo;
        
        if(titulo.substring(0, 2).contains("*")){
            volverAVerCB.setSelected(true);
            volverAVerCB.setEnabled(false);
        }
        
        else if(titulo.substring(0, 2).contains("+")){
            descargadaCB.setSelected(true);
            descargadaCB.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        guardarCambiosB = new javax.swing.JButton();
        tituloPeli = new javax.swing.JLabel();
        volverAVerCB = new javax.swing.JCheckBox();
        descargadaCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar película", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        guardarCambiosB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        guardarCambiosB.setText("Guardar cambios");
        guardarCambiosB.setEnabled(false);
        guardarCambiosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosBActionPerformed(evt);
            }
        });

        tituloPeli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloPeli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPeli.setText("titulo pelicula");

        volverAVerCB.setText("Volver a ver");
        volverAVerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAVerCBActionPerformed(evt);
            }
        });

        descargadaCB.setText("Descargada");
        descargadaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargadaCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(volverAVerCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(descargadaCB)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(guardarCambiosB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloPeli)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPeli)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverAVerCB)
                    .addComponent(descargadaCB))
                .addGap(18, 18, 18)
                .addComponent(guardarCambiosB, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarCambiosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosBActionPerformed
     // listaPeliculas.setModel(new DefaultListModel());
     String aniadir = "";
     if(descargadaCB.isEnabled() && descargadaCB.isSelected()){
         aniadir += "+";
     }
     if(volverAVerCB.isEnabled() && volverAVerCB.isSelected()){
         aniadir += "*";
     }
     PeliculasAleatorias.tituloPelicula = aniadir + tituloPeli.getText();
     JOptionPane.showMessageDialog(null, "La película se ha editado correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
     this.dispose();
    }//GEN-LAST:event_guardarCambiosBActionPerformed

    private void volverAVerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAVerCBActionPerformed
        if (volverAVerCB.isSelected() && !guardarCambiosB.isEnabled()) {
            guardarCambiosB.setEnabled(true);
        } else if (!volverAVerCB.isSelected() && (!descargadaCB.isSelected() || !descargadaCB.isEnabled())) {
            guardarCambiosB.setEnabled(false);
        }

    }//GEN-LAST:event_volverAVerCBActionPerformed

    private void descargadaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargadaCBActionPerformed
        if (descargadaCB.isSelected() && !guardarCambiosB.isEnabled()) {
            guardarCambiosB.setEnabled(true);
        } else if ((!volverAVerCB.isSelected() || !volverAVerCB.isEnabled()) && !descargadaCB.isSelected()) {
            guardarCambiosB.setEnabled(false);
        }
    }//GEN-LAST:event_descargadaCBActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox descargadaCB;
    private javax.swing.JButton guardarCambiosB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloPeli;
    private javax.swing.JCheckBox volverAVerCB;
    // End of variables declaration//GEN-END:variables
}
