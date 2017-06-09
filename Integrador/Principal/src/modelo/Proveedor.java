/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import javax.persistence.*;
/**
 *
 * @author nicolas
 */
@Entity
@Table(name="Proveedor")
public class Proveedor {
    @Id
    private int id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Telefono")
    private String telefono;
    @Column(name="Email")
    private String email;
    @Column(name="Descripcion")
    private String descripcion;
    
    //Relaciones
    @ManyToOne
    private Pieza piezapro;
    @ManyToOne
    private Empresa empresapro;
    
    
    //Constructores ...
    public Proveedor(){
    
    }

    public Proveedor(int i,String n,String t,String e,String d){
        this.id = i;
        this.nombre =n;
        this.telefono = t;
        this.email = e;
        this.descripcion = d;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return "Datos de Proveedor: " + "\nIdentificador: " + this.getId() + "\nNombre: " + this.getNombre() + "\nTelefono: "+this.getTelefono()+"\nE-mail: "+this.getEmail()+"\nDescripcion: "+this.getDescripcion();
    }
    
}
