/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author nicolas
 */
@Entity
@Table(name="Fabricante")
public class Fabricante implements Serializable {
    @Id
    private int id;
    @Column(name="Nombre",length=30)
    private String nombre;
    @Column(name="Telefono",length=30)
    private String telefono;
    @Column(name="Email",length=30)
    private String email;
    @Column(name="Descripcion",length=30)
    private String descripcion;
    
    
    //Relaciones
    @ManyToOne
    private Pieza piezafa;
    @ManyToOne
    private Empresa empreFa;
    //Constructores...
    public Fabricante(){
    
    }

    public Fabricante(String n,String t,String e,String d){
        this.nombre= n;
        this.telefono= t;
        this.email= e;
        this.descripcion= d;
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
        return "Datos de Fabricante" + "\nNombre: " + this.getNombre() + "\nTelefono: "+ this.getTelefono()+"\nEmail: "+this.getEmail()+"\nDescripcion: "+this.getDescripcion();
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
}
