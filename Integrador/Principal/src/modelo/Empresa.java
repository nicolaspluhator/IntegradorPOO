/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import persistencia.Persistencia;

/**
 *
 * @author nicolas
 */
@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable,Comparable {

    //Atributos
    @Id
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Email")
    private String email;
    
    //Relaciones
    @OneToMany(mappedBy = "empresaempl")
    private Set<Empleado> empleados;
    @OneToMany(mappedBy = "empresaequi")
    private Set<Equipo> equipos;
    @OneToMany (mappedBy = "empresapro")
    private Set<Proveedor> proveedores;
    private static Persistencia persistencia;
    @OneToMany (mappedBy="empreFa")
    private Set<Fabricante> fabricantes;
    
    //Constructores ...
    public Empresa() {
        this.empleados = new TreeSet<>();
        this.equipos = new TreeSet<>();
    }

    public Empresa(int iid, String n, String d, String t, String m) {
        this.id = iid;
        this.nombre = n;
        this.direccion = d;
        this.telefono = t;
        //this.empleados = new TreeSet<>();
        //this.equipos = new TreeSet<>();
        Empresa.getPersistencia().insertar(this);
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

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the empleados
     */
    public String getEmpleados() {
        return this.empleados.toString();
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(Empleado empleados) {
        this.empleados.add(empleados);
    }

    /**
     * @return the equipos
     */
    public String getEquipos() {
        return this.equipos.toString();
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipos(Equipo equipos) {
        this.equipos.add(equipos);
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
     * @return the proveedores
     */
    public String getProveedores() {
        return this.proveedores.toString();
    }

    /**
     * @param proveedores the proveedores to set
     */
    public void setProveedores(Proveedor proveedores) {
        this.proveedores.add(proveedores);
    }

    static {
        persistencia = new Persistencia();
    }

    public static Persistencia getPersistencia() {
        return persistencia;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nDireccion: " + this.getDireccion();
    }

// Métodos personalizados    
    
    public Empleado buscarEmpleado(String cuil) {
        Empleado unEmpleado = (Empleado) Empresa.getPersistencia().buscar(Empleado.class, cuil);
        return unEmpleado;
    }
    
    public Empleado altaEmpleado (String c, String n,String a,String d,String t,String e){
        Empleado unEmpleado = null;
        if((this.buscarEmpleado(c))== null ){
            unEmpleado = new Empleado (c,n,a,d,t,e,this);
            this.setEmpleados(unEmpleado);
            Empresa.getPersistencia().insertar(unEmpleado);
            Empresa.getPersistencia().refrescar(this);
            
        }else{
            System.out.println("El empleado ya existe ...");
        }
        return unEmpleado;
    }

    public Empleado modificarEmpleado(String c, String n,String a,String d,String t,String e){
        Empleado unEmpleado = this.buscarEmpleado(c);
        if(unEmpleado != null){
            unEmpleado.setCuil(c);
            unEmpleado.setNombre(n);
            unEmpleado.setApellido(a);
            unEmpleado.setDireccion(d);
            unEmpleado.setTelefono(t);
            unEmpleado.setEmail(e);
            Empresa.getPersistencia().modificar(unEmpleado);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El empleado a modificar no existe ... ");
        }
        return unEmpleado;
    }
    
    public Empleado bajaEmpleado(String c){
        Empleado unEmpleado = this.buscarEmpleado(c);
        if(unEmpleado != null){
            Empresa.getPersistencia().eliminar(unEmpleado);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El empleado a eliminar no existe ... ");
        }
        return unEmpleado;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }

    
}
