package formularios;

import clases.*;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Samuel David Ortiz
 */
public class FrmPyC extends javax.swing.JFrame {

    private JLabel umg;
    private ImageIcon Img;
    private Icon icono;
    PilaListas pila = new PilaListas();
    PilaArreglo pilaA = new PilaArreglo();
    PilaArreglo2 pilaA2;
    ColaLista cola = new ColaLista();
    ColaArreglo colaA = new ColaArreglo(4);
    DefaultListModel model = new DefaultListModel();
    private int tipo;

    public FrmPyC() {
        initComponents();
        paneles();
    }

    public void paneles() {

        umg = new JLabel();
        umg.setSize(100, 100);
        umg.setLocation(0, 0);
        umg.setText("Hola");

        Img = new ImageIcon("./src/imagenes/umg.png");
        Img = new ImageIcon(Img.getImage().getScaledInstance(umg.getWidth(), umg.getHeight(),
                Image.SCALE_DEFAULT));

        umg.setIcon(Img);
        umg.setVisible(true);
        panelPrincipal.add(umg, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelPila = new javax.swing.JPanel();
        txtArreglo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLista = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnExtraer = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelCola = new javax.swing.JPanel();
        txtCArreglo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCLista = new javax.swing.JTextField();
        btnCMostrar = new javax.swing.JButton();
        btnCExtraer = new javax.swing.JButton();
        btnCAgregar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(500, 100));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        panelPila.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPila.setPreferredSize(new java.awt.Dimension(0, 260));

        jLabel1.setText("Arreglos");

        jLabel2.setText("Listas");

        btnMostrar.setText("Mostrar");
        btnMostrar.setToolTipText("peek");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnExtraer.setText("Extraer");
        btnExtraer.setToolTipText("pop");
        btnExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("push");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jList1.setEnabled(false);
        jList1.setFocusable(false);
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout panelPilaLayout = new javax.swing.GroupLayout(panelPila);
        panelPila.setLayout(panelPilaLayout);
        panelPilaLayout.setHorizontalGroup(
            panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLista, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPilaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExtraer))
                    .addComponent(txtArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPilaLayout.setVerticalGroup(
            panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilaLayout.createSequentialGroup()
                .addGroup(panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPilaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(txtLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtraer)
                            .addComponent(btnMostrar)
                            .addComponent(btnAgregar)))
                    .addGroup(panelPilaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelCola.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCola.setPreferredSize(new java.awt.Dimension(0, 260));

        jLabel11.setText("Arreglos");

        jLabel12.setText("Listas");

        btnCMostrar.setText("Mostrar");
        btnCMostrar.setToolTipText("peek");
        btnCMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCMostrarActionPerformed(evt);
            }
        });

        btnCExtraer.setText("Extraer");
        btnCExtraer.setToolTipText("pop");
        btnCExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCExtraerActionPerformed(evt);
            }
        });

        btnCAgregar.setText("Agregar");
        btnCAgregar.setToolTipText("push");
        btnCAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAgregarActionPerformed(evt);
            }
        });

        jList6.setEnabled(false);
        jList6.setFocusable(false);
        jScrollPane7.setViewportView(jList6);

        javax.swing.GroupLayout panelColaLayout = new javax.swing.GroupLayout(panelCola);
        panelCola.setLayout(panelColaLayout);
        panelColaLayout.setHorizontalGroup(
            panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCLista, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelColaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCExtraer))
                    .addComponent(txtCArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColaLayout.setVerticalGroup(
            panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColaLayout.createSequentialGroup()
                .addGroup(panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addComponent(txtCLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCExtraer)
                            .addComponent(btnCMostrar)
                            .addComponent(btnCAgregar)))
                    .addGroup(panelColaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPila, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(panelCola, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(518, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean arreglo = vacio(txtArreglo);
        boolean lista = vacio(txtLista);
        String texto = txtLista.getText();
        String txtA = txtArreglo.getText();

        if (!arreglo && lista) {
            //JOptionPane.showMessageDialog(null, "Pila arreglo");
            model.addElement(txtA);
            jList1.setModel(model);
            txtArreglo.setText("");
            pilaA.push(txtA);
            //pilaA2 = new PilaArreglo2(10);
            //pilaA2.push(txtA);           

            txtArreglo.requestFocus();
            setTipo(1);
        } else if (arreglo && !lista) {
            model.addElement(texto);
            jList1.setModel(model);
            //jList1.addElement(txtLista.getText() + "\n");
            txtLista.setText("");
            pila.push(texto);
            txtLista.requestFocus();
            setTipo(2);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dato para agregar");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (getTipo() == 1) {
            JOptionPane.showMessageDialog(null, pilaA.peek1());
            //JOptionPane.showMessageDialog(null, pilaA2.peek());
        } else if (getTipo() == 2) {
            JOptionPane.showMessageDialog(null, pila.peek());
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        boolean arreglo = vacio(txtArreglo);
        boolean lista = vacio(txtLista);

        String texto = txtLista.getText();

        if (getTipo() == 1) {
            JOptionPane.showMessageDialog(null, pilaA.peek1());
            pilaA.pop();
            int size = pilaA.size();
            model.remove(size);
            jList1.setModel(model);
        } else if (getTipo() == 2) {
            JOptionPane.showMessageDialog(null, pila.peek());
            pila.pop();
            int size = pila.size();
            model.remove(size);
            jList1.setModel(model);
        }
    }//GEN-LAST:event_btnExtraerActionPerformed

    private void btnCMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCMostrarActionPerformed
        if (getTipo() == 1) {
            JOptionPane.showMessageDialog(null, colaA.peek());
        } else if (getTipo() == 2) {
            JOptionPane.showMessageDialog(null, cola.peek());
        }
    }//GEN-LAST:event_btnCMostrarActionPerformed

    private void btnCExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCExtraerActionPerformed
        //boolean arreglo = vacio(txtCArreglo);
        //boolean lista = vacio(txtCLista);

        if (getTipo() == 1) {
            JOptionPane.showMessageDialog(null, colaA.peek());
            colaA.pop();
            int size = colaA.size() - colaA.size();
            model.remove(size);
            jList6.setModel(model);
        } else if (getTipo() == 2) {
            JOptionPane.showMessageDialog(null, cola.peek());
            cola.pop();
            int size = cola.size() - cola.size();
            model.remove(size);
            jList6.setModel(model);
        }
    }//GEN-LAST:event_btnCExtraerActionPerformed

    private void btnCAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAgregarActionPerformed
        boolean arreglo = vacio(txtCArreglo);
        boolean lista = vacio(txtCLista);
        String texto = txtCLista.getText();
        String txtA = txtCArreglo.getText();

        if (!arreglo && lista) {
            if (colaA.isLimite()) {
                model.addElement(txtA);
                jList6.setModel(model);
                txtCArreglo.setText("");
                colaA.push(txtA);
                txtCArreglo.requestFocus();
                setTipo(1);
            }else{
                JOptionPane.showMessageDialog(null, "Excedio el limite de la cola");
            }
        } else if (arreglo && !lista) {
            model.addElement(texto);
            jList6.setModel(model);
            txtCLista.setText("");
            cola.push(texto);
            txtCLista.requestFocus();
            setTipo(2);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dato para agregar");
        }
    }//GEN-LAST:event_btnCAgregarActionPerformed

    public boolean vacio(JTextField texto) {
        boolean v;
        if (texto.getText().equals("")) {
            v = true;
        } else {
            v = false;
        }
        return v;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
            java.util.logging.Logger.getLogger(FrmPyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPyC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnCAgregar;
    private javax.swing.JButton btnCExtraer;
    private javax.swing.JButton btnCMostrar;
    private javax.swing.JButton btnExtraer;
    private javax.swing.JButton btnExtraer1;
    private javax.swing.JButton btnExtraer2;
    private javax.swing.JButton btnExtraer3;
    private javax.swing.JButton btnExtraer4;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JButton btnMostrar2;
    private javax.swing.JButton btnMostrar3;
    private javax.swing.JButton btnMostrar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelCola;
    private javax.swing.JPanel panelPila;
    private javax.swing.JPanel panelPila1;
    private javax.swing.JPanel panelPila2;
    private javax.swing.JPanel panelPila3;
    private javax.swing.JPanel panelPila4;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtArreglo;
    private javax.swing.JTextField txtArreglo1;
    private javax.swing.JTextField txtArreglo2;
    private javax.swing.JTextField txtArreglo3;
    private javax.swing.JTextField txtArreglo4;
    private javax.swing.JTextField txtCArreglo;
    private javax.swing.JTextField txtCLista;
    private javax.swing.JTextField txtLista;
    private javax.swing.JTextField txtLista1;
    private javax.swing.JTextField txtLista2;
    private javax.swing.JTextField txtLista3;
    private javax.swing.JTextField txtLista4;
    // End of variables declaration//GEN-END:variables
}
