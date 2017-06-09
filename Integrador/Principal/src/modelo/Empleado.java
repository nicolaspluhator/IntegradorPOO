/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.persistence.*;

/**
 *
 * @author nicolas
 */
@Entity
@Table(name="Empleado")
public class Empleado implements Serializable {
    @Id
    private String cuil;
    @Column(name="Nombre",length=30)
    private String nombre;
    @Column(name="Apellido",length=30)
    private String apellido;
    @Column(name="Direccion",length=30)
    private String direccion;
    @Column(name="Telefono",length=30)
    private String telefono;
    @Column(name="Email",length=30)
    private String email;
    
    //Relaciones
    @ManyToOne
    private Empresa empresaempl;
    @ManyToMany (mappedBy= "emplePre")
    private List<Preventiva> preventivas;
    @ManyToMany (mappedBy= "empleCo")
    private List<Correctiva> correctivas;
    //@OneToMany



    //Constructores ...
    public Empleado(){
        //this.listaCorrectiva = new TreeSet<>();
        //this.listaPreventiva = new TreeSet<>();
    }
    
    public Empleado(String c, String n,String a,String d,String t,String e, Empresa emp){
        this.cuil = c;
        this.nombre = n;
        this.apellido = a;
        this.direccion = d;
        this.telefono = t;
        this.email = e;
        this.empresaempl = emp;

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
     * @return the cuil
     */
    public String getCuil() {
        return cuil;
    }

    /**
     * @param cuil the cuil to set
     */
    public void setCuil(String cuil) {
        this.cuil = cuil;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

         
    @Override
    public String toString(){
        return "Datos de Empleado: " + "\nCuil: " + this.getCuil() + "\nNombre: " + this.getNombre()+"\nApellido: " + this.getApellido() + "\nDireccion: "+this.getDireccion() + "\nTelefono: "+this.getTelefono()+"\nE-mail: "+this.getEmail();
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
