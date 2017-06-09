/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocliente;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author nicolas
 */
@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable, Comparable {

    @Id
    private String dni;
    @Column(name = "Nombre", length = 30)
    private String nombre;
    @Column(name = "Apellido", length = 30)
    private String apellido;
    @Column(name = "Direccion", length = 30)
    private String direccion;
    @Column(name = "Telefono", length = 30)
    private String telefono;
    @ManyToOne
    private Empresa emprecli;

    //Constructores
    
    public Cliente() {

    }

    public Cliente(String dn, String nom, String ap, String dir, String tel,Empresa em) {
        this.dni = dn;
        this.nombre = nom;
        this.apellido = ap;
        this.direccion = dir;
        this.telefono = tel;
       this.emprecli = em;

    }

    
    //MÉTODOS GET Y SET
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the emprecli
     */
    
    public Empresa getEmprecli() {
        return emprecli;
    }

    /**
     * @param emprecli the emprecli to set
    */ 
    public void setEmprecli(Empresa emprecli) {
        this.emprecli = emprecli;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getApellido();
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }

}
