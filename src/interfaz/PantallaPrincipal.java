/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;

/**
 *
 * @author elena
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    private PantallaTablaReservas tablaReservas;

    public PantallaPrincipal() {
        initComponents();
        //Ponemos el fondo de la aplicación blanco
        this.rootPane.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        tablaReservas = new PantallaTablaReservas();
        verAyuda();
    }

    public PantallaTablaReservas getTablaReservas() {
        return this.tablaReservas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        reserva = new javax.swing.JButton();
        logohotel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        crearReservaMenu = new javax.swing.JMenuItem();
        jMenuReserva = new javax.swing.JMenu();
        jMenuItemReserva = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();
        menuButtonAyuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        reserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reserva.setText("Reservar Salón");
        reserva.setToolTipText("Pulse para realizar su reseva");
        reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaActionPerformed(evt);
            }
        });

        logohotel.setBackground(new java.awt.Color(255, 255, 255));
        logohotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logohotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        Archivo.setText("Archivo");

        crearReservaMenu.setText("Nueva reserva...");
        crearReservaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearReservaMenuMouseClicked(evt);
            }
        });
        crearReservaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReservaMenuActionPerformed(evt);
            }
        });
        Archivo.add(crearReservaMenu);

        jMenuBar1.add(Archivo);

        jMenuReserva.setText("Reservas");

        jMenuItemReserva.setText("Ver reservas...");
        jMenuItemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservaActionPerformed(evt);
            }
        });
        jMenuReserva.add(jMenuItemReserva);

        jMenuBar1.add(jMenuReserva);

        ayudaMenu.setText("Ayuda");
        ayudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaMenuActionPerformed(evt);
            }
        });

        menuButtonAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuButtonAyuda.setText("Mostrar ayuda...");
        menuButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonAyudaActionPerformed(evt);
            }
        });
        ayudaMenu.add(menuButtonAyuda);

        jMenuBar1.add(ayudaMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(logohotel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logohotel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cuando pulse el botón de reservar se abrirá el diálogo que muestra el
     * formulario de reserva
     *
     * @param evt click en el botón "Reservar Salón"
     */
    private void reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaActionPerformed
        new PantallaReservas(this, true).setVisible(true);
    }//GEN-LAST:event_reservaActionPerformed

    private void crearReservaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearReservaMenuMouseClicked
        new PantallaReservas(this, true).setVisible(true);
    }//GEN-LAST:event_crearReservaMenuMouseClicked

    private void crearReservaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaMenuActionPerformed
        new PantallaReservas(this, true).setVisible(true);
    }//GEN-LAST:event_crearReservaMenuActionPerformed

    private void jMenuItemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservaActionPerformed
        tablaReservas.setVisible(true);
    }//GEN-LAST:event_jMenuItemReservaActionPerformed

    private void ayudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaMenuActionPerformed
        verAyuda();
    }//GEN-LAST:event_ayudaMenuActionPerformed

    private void menuButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonAyudaActionPerformed
        verAyuda();
    }//GEN-LAST:event_menuButtonAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    public void verAyuda() {

        // File file = new File("resources" + File.separator + "help" + File.separator + "Ayuda.hs");
        File file = new File("help" + File.separator + "Ayuda.hs");
        URL hsURL;
        HelpSet helpSet;
        try {
            hsURL = file.toURI().toURL();
            System.out.println(hsURL);
            helpSet = new HelpSet(getClass().getClassLoader(), hsURL);

            HelpBroker hb = helpSet.createHelpBroker();
            String introduccion = "Introduccion";
            hb.enableHelpOnButton(menuButtonAyuda, introduccion, helpSet);
            hb.enableHelpKey(getRootPane(), introduccion, helpSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenuItem crearReservaMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemReserva;
    private javax.swing.JMenu jMenuReserva;
    private javax.swing.JLabel logohotel;
    private javax.swing.JMenuItem menuButtonAyuda;
    private javax.swing.JButton reserva;
    // End of variables declaration//GEN-END:variables
}
