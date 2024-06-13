/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class AsignarAlumnoCurso extends javax.swing.JFrame {

    /**
     * Creates new form AsignarAlumnoCurso
     */
    public AsignarAlumnoCurso() {
        initComponents();
        this.setLocationRelativeTo(null);

        for (Curso e : Loginb.cursos) {
            jComboBox2.addItem(e.toString());
        }

        for (Alumno e : Loginb.alumnos) {
            jComboBox1.addItem(e.toString());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alumno");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Curso: ");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 150, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Administrador c = new Administrador();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String datoscurso = jComboBox2.getSelectedItem().toString();
        String datosalumno = jComboBox1.getSelectedItem().toString();

        Alumno alumnoSeleccionado = null;
        Curso cursoSeleccionado = null;

        for (Alumno e : Loginb.alumnos) {
            if (e.toString().equals(datosalumno)) {
                alumnoSeleccionado = e;
                break;
            }
        }
        for (Curso e : Loginb.cursos) {
            if (e.toString().equals(datoscurso)) {
                cursoSeleccionado = e;
                break;
            }
        }
        if (alumnoSeleccionado != null && cursoSeleccionado != null) {
            boolean alumnoEncontrado = false;

            int contadorCursos = 0;
            for (Alumno a : cursoSeleccionado.getAlumnos()) {
                if (a.getCarne().equals(alumnoSeleccionado.getCarne())) {
                    alumnoEncontrado = true;
                    break;
                }
            }
            for (Curso curso : Loginb.cursos) {
                for (Alumno a : curso.getAlumnos()) {
                    if (a.getCarne().equals(alumnoSeleccionado.getCarne())) {
                        contadorCursos++;
                    }
                }
            }
            if (alumnoEncontrado) {
                JOptionPane.showMessageDialog(this, "El alumno ya está asignado a este curso.");
                return;
            }
            if (contadorCursos >= 5) {
                JOptionPane.showMessageDialog(this, "El alumno ya está asignado a 5 cursos.");
                return;
            }
            if (cursoSeleccionado.getAlumnos().size() >= 10) {
                JOptionPane.showMessageDialog(this, "El curso ya tiene 10 alumnos.");
                return;
            }
            Alumno a = new Alumno();
            a.setNombre(alumnoSeleccionado.getNombre());
            a.setApellido(alumnoSeleccionado.getApellido());
            a.setCarne(alumnoSeleccionado.getCarne());
            a.setPassword(alumnoSeleccionado.getPassword());
            a.setNota(alumnoSeleccionado.getNota());
            cursoSeleccionado.getAlumnos().add(a);
            JOptionPane.showMessageDialog(this, "El alumno fue asignado exitosamente.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
