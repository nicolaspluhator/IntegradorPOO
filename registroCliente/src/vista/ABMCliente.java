/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import registrocliente.Cliente;
import registrocliente.Empresa;

/**
 *
 * @author nicolas
 */
public class ABMCliente extends javax.swing.JFrame {

    public ABMCliente(Empresa emp) {
        this.empresa = emp;
        initComponents();

        this.listaClientes.setListData(this.empresa.getClientes().toArray());

        this.botonAlta.setEnabled(false);
        this.botonModificacion.setEnabled(false);
        this.botonEliminar.setEnabled(false);

        this.textoDni.setEnabled(false);
        this.textoNombre.setEnabled(false);
        this.textoApellido.setEnabled(false);
        this.textoDireccion.setEnabled(false);
        this.textoTelefono.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonAlta = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonModificacion = new javax.swing.JToggleButton();
        textoBusqueda = new javax.swing.JTextField();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        jLabel3.setText("Dirección: ");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("DNI:");

        jLabel6.setText("Hola Cliente!");

        botonAlta.setText("Guardar");
        botonAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAltaMouseClicked(evt);
            }
        });
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonModificacion.setText("Modificacion");
        botonModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificacionActionPerformed(evt);
            }
        });

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        listaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaClientesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoNombre)
                            .addComponent(textoApellido)
                            .addComponent(textoDireccion)
                            .addComponent(textoDni, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(textoTelefono))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoBusqueda))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNuevo)
                    .addComponent(botonSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        try {
            this.botonAlta.setEnabled(false);

            String dni = textoDni.getText();
            String nom = textoNombre.getText();
            String ap = textoApellido.getText();
            String dir = textoDireccion.getText();
            String tel = textoTelefono.getText();

            if (identi == true) {
                if (this.empresa.buscarCliente(dni) == null) {

                    int resp = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres guardar el cliente?");
                    if (JOptionPane.OK_OPTION == resp) {
                    this.empresa.altaCliente(dni, nom, ap, dir, tel);
                    JOptionPane.showMessageDialog(this, "El cliente fue guardado con exito");
                    this.textoDni.setEnabled(false);
                    this.textoNombre.setEnabled(false);
                    this.textoApellido.setEnabled(false);
                    this.textoDireccion.setEnabled(false);
                    this.textoTelefono.setEnabled(false);
                    limpiar();
                    this.listaClientes.setListData(this.empresa.getClientes().toArray());
                    } else {
                        JOptionPane.showMessageDialog(this, "No se han realizado cambios");
                        limpiar();
                    }


                } else {
                    JOptionPane.showMessageDialog(this, "El cliente ya existe");
                }
            } else {

                int resp = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres modificar el cliente?");
                if (JOptionPane.OK_OPTION == resp) {
                    this.empresa.modificarCliente(dni, nom, ap, dir, tel);
                    JOptionPane.showMessageDialog(this, "El cliente fue modificado con exito");
                    this.textoDni.setEnabled(false);
                    this.textoNombre.setEnabled(false);
                    this.textoApellido.setEnabled(false);
                    this.textoDireccion.setEnabled(false);
                    this.textoTelefono.setEnabled(false);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "No se han realizado cambios");
                    limpiar();
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }//GEN-LAST:event_botonAltaActionPerformed

    private void botonAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAltaMouseClicked

    }//GEN-LAST:event_botonAltaMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.botonAlta.setEnabled(false);

        String dni = textoBusqueda.getText();
        if (this.empresa.buscarCliente(dni) != null) {
            this.botonEliminar.setEnabled(true);
            this.botonModificacion.setEnabled(true);
            Cliente cli1 = this.empresa.buscarCliente(dni);
            this.textoDni.setEnabled(false);
            this.textoNombre.setEnabled(false);
            this.textoApellido.setEnabled(false);
            this.textoDireccion.setEnabled(false);
            this.textoTelefono.setEnabled(false);

            textoDni.setText(cli1.getDni());
            textoNombre.setText(cli1.getNombre());
            textoApellido.setText(cli1.getApellido());
            textoDireccion.setText(cli1.getDireccion());
            textoTelefono.setText(cli1.getTelefono());
        } else {
            JOptionPane.showMessageDialog(this, "El cliente buscado no existe");
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        this.botonModificacion.setEnabled(false);
        this.botonEliminar.setEnabled(false);
        this.botonAlta.setEnabled(true);

        this.textoDni.setEnabled(true);
        this.textoNombre.setEnabled(true);
        this.textoApellido.setEnabled(true);
        this.textoDireccion.setEnabled(true);
        this.textoTelefono.setEnabled(true);
        identi = true;

        limpiar();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificacionActionPerformed

        this.botonAlta.setEnabled(true);
        this.botonModificacion.setEnabled(false);
        this.botonEliminar.setEnabled(false);

        this.textoDni.setEnabled(false);
        this.textoNombre.setEnabled(true);
        this.textoApellido.setEnabled(true);
        this.textoDireccion.setEnabled(true);
        this.textoTelefono.setEnabled(true);
        identi = false;
    }//GEN-LAST:event_botonModificacionActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el cliente?");
        if (JOptionPane.OK_OPTION == resp) {
            String dni = (String) this.textoDni.getText();
            this.empresa.bajaEmpleado(dni);
            JOptionPane.showMessageDialog(this, "El cliente fue eliminado con exito");
            limpiar();
            this.botonEliminar.setEnabled(false);
            this.botonModificacion.setEnabled(false);
            this.listaClientes.setListData(this.empresa.getClientes().toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No se han realizado cambios");
            limpiar();
        }


    }//GEN-LAST:event_botonEliminarActionPerformed

    private void listaClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaClientesValueChanged
        // verificamos que la lista tenga un item seleccionado
        if (!this.listaClientes.isSelectionEmpty()) {
            // obtengo el item seleccionado
            Cliente cli1 = (Cliente) this.listaClientes.getSelectedValue();
            this.botonModificacion.setEnabled(true);
            this.botonEliminar.setEnabled(true);
            this.textoDni.setText(cli1.getDni());
            this.textoNombre.setText(cli1.getNombre());
            this.textoApellido.setText(cli1.getApellido());
            this.textoTelefono.setText(cli1.getTelefono());
            this.textoDireccion.setText(cli1.getDireccion());
        }
    }//GEN-LAST:event_listaClientesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JToggleButton botonModificacion;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList listaClientes;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoBusqueda;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables

    private Empresa empresa;
    private boolean identi;

    public void limpiar() {
        textoDni.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoDireccion.setText("");
        textoTelefono.setText("");

        System.out.println("Refrescando ...");
        Empresa.getPersistencia().refrescar(this.empresa);
        System.out.println("Refrescado");
    }
}
