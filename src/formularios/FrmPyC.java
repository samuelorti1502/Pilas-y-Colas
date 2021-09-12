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
    ColaArreglo colaA;
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
        txtLista = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnExtraer = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        chkPL = new javax.swing.JCheckBox();
        chkPArr = new javax.swing.JCheckBox();
        panelCola = new javax.swing.JPanel();
        txtCArreglo = new javax.swing.JTextField();
        txtCLista = new javax.swing.JTextField();
        btnCMostrar = new javax.swing.JButton();
        btnCExtraer = new javax.swing.JButton();
        btnCAgregar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        chkCArr = new javax.swing.JCheckBox();
        chkCL = new javax.swing.JCheckBox();

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

        panelPila.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pilas"));
        panelPila.setPreferredSize(new java.awt.Dimension(0, 260));

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

        chkPL.setText("Listas");
        chkPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPLActionPerformed(evt);
            }
        });

        chkPArr.setText("Arreglos");
        chkPArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPArrActionPerformed(evt);
            }
        });

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
                    .addComponent(chkPArr)
                    .addComponent(chkPL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPilaLayout.setVerticalGroup(
            panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPilaLayout.createSequentialGroup()
                        .addComponent(chkPArr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(chkPL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExtraer)
                            .addComponent(btnMostrar)
                            .addComponent(btnAgregar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        panelCola.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Colas"));
        panelCola.setPreferredSize(new java.awt.Dimension(0, 260));

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

        chkCArr.setText("Arreglos");
        chkCArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCArrActionPerformed(evt);
            }
        });

        chkCL.setText("Listas");
        chkCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCLActionPerformed(evt);
            }
        });

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
                    .addComponent(chkCArr)
                    .addComponent(chkCL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColaLayout.setVerticalGroup(
            panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColaLayout.createSequentialGroup()
                .addGroup(panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelColaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelColaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(chkCArr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkCL)
                        .addGap(10, 10, 10)
                        .addComponent(txtCLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCExtraer)
                            .addComponent(btnCMostrar)
                            .addComponent(btnCAgregar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            pilaA2.push(txtA);
            if (!pilaA2.isLimite()) {
                JOptionPane.showMessageDialog(null, "Excedio el limite de la pila");
            } else {
                model.addElement(txtA);
                jList1.setModel(model);
                txtArreglo.setText("");
            }

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
            //JOptionPane.showMessageDialog(null, pilaA.peek1());
            JOptionPane.showMessageDialog(null, pilaA2.peek());
        } else if (getTipo() == 2) {
            JOptionPane.showMessageDialog(null, pila.peek());
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        boolean arreglo = vacio(txtArreglo);
        boolean lista = vacio(txtLista);

        String texto = txtLista.getText();

        if (getTipo() == 1) {
            JOptionPane.showMessageDialog(null, pilaA2.peek());
            pilaA2.pop();
            int size = pilaA2.size();
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
            colaA.push(txtA);
            if (!colaA.isLimite()) {
                JOptionPane.showMessageDialog(null, "Excedio el limite de la cola");
            } else {
                model.addElement(txtA);
                jList6.setModel(model);
                txtCArreglo.setText("");
                txtCArreglo.requestFocus();
                setTipo(1);
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

    private void chkPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPLActionPerformed

        if (chkPL.isSelected()) {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is checked");
            txtArreglo.setEnabled(false);
        } else {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is unchecked");
            txtArreglo.setEnabled(true);
        }

    }//GEN-LAST:event_chkPLActionPerformed

    private void chkPArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPArrActionPerformed
        String n = JOptionPane.showInputDialog(null, "Ingrese el tamaño que desea para la cola:",
                "Tamaño de la cola", JOptionPane.QUESTION_MESSAGE);

        pilaA2 = new PilaArreglo2(Integer.parseInt(n));
        txtArreglo.requestFocus();

        if (chkPArr.isSelected()) {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is checked");
            txtLista.setEnabled(false);
        } else {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is unchecked");
            txtLista.setEnabled(true);
        }
    }//GEN-LAST:event_chkPArrActionPerformed

    private void chkCArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCArrActionPerformed
        String n = JOptionPane.showInputDialog(null, "Ingrese el tamaño que desea para la cola:",
                "Tamaño de la cola", JOptionPane.QUESTION_MESSAGE);
        colaA = new ColaArreglo(Integer.parseInt(n));
        txtCArreglo.requestFocus();

        if (chkCArr.isSelected()) {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is checked");
            txtCLista.setEnabled(false);
            txtCArreglo.requestFocus();
        } else {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is unchecked");
            txtCLista.setEnabled(true);
        }
    }//GEN-LAST:event_chkCArrActionPerformed

    private void chkCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCLActionPerformed
        if (chkCL.isSelected()) {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is checked");
            txtCArreglo.setEnabled(false);
        } else {
            //JOptionPane.showMessageDialog(null, chkPL.getActionCommand() + " is unchecked");
            txtCArreglo.setEnabled(true);
        }
    }//GEN-LAST:event_chkCLActionPerformed

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
    private javax.swing.JButton btnCAgregar;
    private javax.swing.JButton btnCExtraer;
    private javax.swing.JButton btnCMostrar;
    private javax.swing.JButton btnExtraer;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JCheckBox chkCArr;
    private javax.swing.JCheckBox chkCL;
    private javax.swing.JCheckBox chkPArr;
    private javax.swing.JCheckBox chkPL;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelCola;
    private javax.swing.JPanel panelPila;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtArreglo;
    private javax.swing.JTextField txtCArreglo;
    private javax.swing.JTextField txtCLista;
    private javax.swing.JTextField txtLista;
    // End of variables declaration//GEN-END:variables
}
