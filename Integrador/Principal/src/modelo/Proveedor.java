/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Set;
import javax.persistence.*;
/**
 *
 * @author nicolas
 */
@Entity
@Table(name="Proveedor")
public class Proveedor {

    //ATRIBUTOS
    @Id
    @SequenceGenerator(name="sec_pro", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_pro")
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
    @ManyToMany (mappedBy = "proveedores")
    private Set<Pieza> piezapro;
    @ManyToOne
    private Empresa empresapro;
    
    
    //Constructores ...
    public Proveedor(){
    
    }

    public Proveedor(String n,String t,String e,String d,Empresa emp){
        this.nombre =n;
        this.telefono = t;
        this.email = e;
        this.descripcion = d;
        this.empresapro = emp;

    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
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
    
        /**
     * @return the piezapro
     */
    public Set<Pieza> getPiezapro() {
        return piezapro;
    }

    /**
     * @param piezapro the piezapro to set
     */
    public void setPiezapro(Pieza piezapro) {
        this.piezapro.add(piezapro);
    }
    
    
    /**
     * @return the empresapro
     */
    public Empresa getEmpresapro() {
        return empresapro;
    }

    /**
     * @param empresapro the empresapro to set
     */
    public void setEmpresapro(Empresa empresapro) {
        this.empresapro = empresapro;
    }
    
    @Override
    public String toString(){
        return "Datos de Proveedor: " + "\nIdentificador: " + this.getId() + "\nNombre: " + this.getNombre() + "\nTelefono: "+this.getTelefono()+"\nE-mail: "+this.getEmail()+"\nDescripcion: "+this.getDescripcion();
    }
    
}
