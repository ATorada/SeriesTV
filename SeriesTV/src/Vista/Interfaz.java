/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Serie;
import java.awt.HeadlessException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ángel Torada
 */
public class Interfaz extends javax.swing.JFrame {
    //Variables necesarias

    //Objeto serie del que se mostrará la información
    Serie serie = new Serie();
    //Objeto de la clase Controlador que se encargará de realizar los métodos pertinentes
    Controlador c = new Controlador();
    //Objeto jFileChooser que nos permitirá la selección de un archivo
    private javax.swing.JFileChooser jFileChooser;
    //El Archivo seleccionado
    private java.io.File archivo;

    public Interfaz() {
        initComponents();

        //Instancia de jFileChooser que muestra el selector del archivo a utilizar
        //Si se da a cancelar se cierra el programa
        //Si se selecciona un archivo sin Array, avisará y preguntará al usuario si quiere sobrescribirlo
        //Selector
        jFileChooser = new javax.swing.JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jFileChooser.setApproveButtonText("Abrir");
        int eleccion = jFileChooser.showOpenDialog(this);
        if (eleccion == JFileChooser.CANCEL_OPTION) {
            System.exit(0);
        }

        //Lectura del archivo
        archivo = jFileChooser.getSelectedFile();
        c.abrirArchivo(archivo);

        //Comprobación del archivo
        try {
            actualiza(c.primero());
        } catch (Exception e) {
            int seleccion = JOptionPane.showConfirmDialog(rootPane, """
                                                    Est\u00e1s a punto de abrir un archivo que no contiene series dentro
                                                                       \u00bfEst\u00e1s seguro de que quieres usarlo?
                                                                        (Si tiene contenido se sobrescribir\u00e1)""", "¿Estás seguro?", JOptionPane.YES_NO_OPTION);
            if (seleccion != JOptionPane.YES_OPTION) {
                System.exit(0);
            }
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

        jButtonSiguiente = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonPrimero = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jButtonQuitar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelProductores = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelAnyo = new javax.swing.JLabel();
        jLabelTemporadas = new javax.swing.JLabel();
        jLabelNota = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldProductores = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jTextFieldTemporadas = new javax.swing.JTextField();
        jSliderNota = new javax.swing.JSlider();
        jMenuBarArchivo = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSiguiente.setText("▶");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonAtras.setText("◀");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonPrimero.setText("⏮");
        jButtonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText("⏭");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAñadir.setText("➕");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonQuitar.setText("➖");
        jButtonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("🔄");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTitulo.setText("Título:");

        jLabelProductores.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelProductores.setText("Productores:");

        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelGenero.setText("Género:");

        jLabelAnyo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAnyo.setText("Año:");

        jLabelTemporadas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTemporadas.setText("Temporadas:");

        jLabelNota.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelNota.setText("Nota:");

        jSliderNota.setMajorTickSpacing(5);
        jSliderNota.setMaximum(10);
        jSliderNota.setMinorTickSpacing(1);
        jSliderNota.setPaintLabels(true);
        jSliderNota.setPaintTicks(true);
        jSliderNota.setSnapToTicks(true);

        jMenuArchivo.setText("Archivo");

        jMenuItemAbrir.setText("Abrir...");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuItemGuardarComo.setText("Guardar como...");
        jMenuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarComoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardarComo);

        jMenuItemSalir.setText("Salir...");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarArchivo.add(jMenuArchivo);

        setJMenuBar(jMenuBarArchivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelAnyo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelProductores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldProductores)
                                .addComponent(jTextFieldGenero)
                                .addComponent(jTextFieldAño)
                                .addComponent(jTextFieldTitulo)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTemporadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jSliderNota, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jTextFieldTemporadas))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonPrimero)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonQuitar)
                    .addComponent(jButtonActualizar))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductores)
                    .addComponent(jTextFieldProductores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnyo)
                    .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemporadas)
                    .addComponent(jTextFieldTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNota)
                    .addComponent(jSliderNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón que carga y muestra el primer objeto del array
    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        try {
            serie = c.primero();
            actualiza(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    //Botón que carga y muestra el objeto anterior del objeto actual en el Array
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        try {
            serie = c.anterior();
            actualiza(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    //Botón que carga y muestra el objeto siguiente del objeto actual del array
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        try {
            serie = c.siguiente();
            actualiza(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    //Botón que carga y muestra el último objeto del array
    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        try {
            serie = c.ultimo();
            actualiza(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    //Botón que borra el objeto actual del Array
    private void jButtonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarActionPerformed
        try {
            System.out.println("Entra en el try\n" + c.getPosicion());
            c.eliminar();
            serie = c.primero();
            actualiza(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonQuitarActionPerformed

    //Botón que actualiza los valores el objeto actual del Array
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            serie = llenaSerie();
            c.actualizar(serie);
        } catch (Exception e) {
            jTextFieldTitulo.setText("");
            jTextFieldProductores.setText("");
            jTextFieldGenero.setText("");
            jTextFieldAño.setText("");
            jTextFieldTemporadas.setText("");
            jSliderNota.setValue(5);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    //Botón del menú desplegable que permite salir de la aplicación al usuario
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    //Botón que permite Añadir un nuevo objeto al Array mediante un JDialog
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        Añadir dialogAñadir = new Añadir(this, true, c);
        dialogAñadir.setVisible(true);
        serie = c.anterior();
        actualiza(serie);
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    //Botón del menú desplegable que permite abrir un selector de archivo para cargar otro Array
    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        jFileChooser.setApproveButtonText("Abrir");
        jFileChooser.showOpenDialog(this);
        archivo = jFileChooser.getSelectedFile();

        c.abrirArchivo(archivo);
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    //Botón del menú desplegable que permite abrir un selector de archivo para guardar el Array actual
    private void jMenuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarComoActionPerformed
        jFileChooser.setApproveButtonText("Guardar");
        jFileChooser.showOpenDialog(this);
        archivo = jFileChooser.getSelectedFile();
        c.guardarArchivo(archivo);
    }//GEN-LAST:event_jMenuItemGuardarComoActionPerformed

    //Método que se engarga de devolver los datos en los textfields a la hora de actualizar (Filtra errores de formato)
    private Serie llenaSerie() {
        try {
            if (jTextFieldTitulo.getText() == null || "".equals(jTextFieldTitulo.getText())
                    || jTextFieldProductores.getText() == null || "".equals(jTextFieldProductores.getText())
                    || jTextFieldGenero.getText() == null || "".equals(jTextFieldGenero.getText())
                    || Integer.valueOf(jTextFieldAño.getText()) < 0
                    || Integer.valueOf(jTextFieldTemporadas.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                serie = null;
                return serie;
            } else {
                Serie libroLlenaLibro = new Serie(jTextFieldTitulo.getText(), jTextFieldGenero.getText(), jTextFieldProductores.getText(), Integer.valueOf(jTextFieldAño.getText()), Integer.valueOf(jTextFieldTemporadas.getText()), jSliderNota.getValue());
                return libroLlenaLibro;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            serie = null;
            return serie;
        }
    }

    //Método que se encarga de actualizar los textfields a la serie actual
    private void actualiza(Serie serie) {
        jTextFieldTitulo.setText(serie.getTitulo());
        jTextFieldProductores.setText(serie.getProductores());
        jTextFieldGenero.setText(serie.getGenero());
        jTextFieldAño.setText(String.valueOf(serie.getAnyo()));
        jTextFieldTemporadas.setText(String.valueOf(serie.getTemporadas()));
        jSliderNota.setValue(serie.getValoraciónPersonal());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonQuitar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabelAnyo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNota;
    private javax.swing.JLabel jLabelProductores;
    private javax.swing.JLabel jLabelTemporadas;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarArchivo;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JSlider jSliderNota;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldProductores;
    private javax.swing.JTextField jTextFieldTemporadas;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
