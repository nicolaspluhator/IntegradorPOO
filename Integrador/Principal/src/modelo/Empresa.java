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
    @OneToMany (mappedBy="emprepie")
    private Set<Pieza> piezas;
    
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
    
        /**
     * @return the fabricantes
     */
    public Set<Fabricante> getFabricantes() {
        return fabricantes;
    }

    /**
     * @param fabricantes the fabricantes to set
     */
    public void setFabricantes(Fabricante fabricantes) {
        this.fabricantes.add(fabricantes);
    }
    
    /**
     * @return the piezas
     */
    //public String getPiezas() {
    public Set<Pieza> getPiezas() {
        //return this.piezas.toString();
        return this.piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(Pieza piezas) {
        this.piezas.add(piezas);
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
    
    
 //  ---------------       EMPLEADO   ----------------------------------------------
    
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

    //  --------------------- PROVEEDORES -----------------------------------------------------
    
    public Proveedor buscarProveedor(int id) {
        Proveedor unProveedor = (Proveedor) Empresa.getPersistencia().buscar(Proveedor.class, id);
        return unProveedor;
    }
    
    public Proveedor altaProveedor (String n,String t,String e,String d){
        Proveedor unProveedor = null;
        unProveedor = new Proveedor (n,t,e,d,this);
        this.setProveedores(unProveedor);
        Empresa.getPersistencia().insertar(unProveedor);
        Empresa.getPersistencia().refrescar(this);

        return unProveedor;
    }

    public Proveedor modificarProveedor(int i,String n,String t,String e,String d){
        Proveedor unProveedor = this.buscarProveedor(i);
        if(unProveedor != null){
            //Como estos son valores autogenerados no pueden ser modificados una vez registrados por el cliente
            unProveedor.setNombre(n);
            unProveedor.setTelefono(t);
            unProveedor.setEmail(e);
            unProveedor.setDescripcion(d);
            Empresa.getPersistencia().modificar(unProveedor);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El proveedor a modificar no existe ... ");
        }
        return unProveedor;
    }
    
    public Proveedor bajaProveedor(int i){
        Proveedor unProveedor = this.buscarProveedor(i);
        if(unProveedor != null){
            Empresa.getPersistencia().eliminar(unProveedor);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El proveedor a eliminar no existe ... ");
        }
        return unProveedor;
    }
    
/*    public Proveedor proveerPieza(Proveedor Provee, Set<Pieza> P){
        
        Proveedor unProveedor = Provee;
        Iterator<Pieza> it = P.iterator();
 
            while (it.hasNext()) {
                unProveedor.setPiezapro(it.next());
                
            }           
        return unProveedor;
    }*/
 
    // ---------------------------- FABRICANTE ---------------------------------------------
    
      public Fabricante buscarFabricante(int id) {
        Fabricante unFabricante = (Fabricante) Empresa.getPersistencia().buscar(Fabricante.class, id);
        return unFabricante;
    }
    
    
    
    public Fabricante altaFabricante (String n,String a,String d,String t){
        Fabricante unFabricante = null;
        
            unFabricante = new Fabricante (n,a,d,t,this);
            this.setFabricantes(unFabricante);
            Empresa.getPersistencia().insertar(unFabricante);
            Empresa.getPersistencia().refrescar(this);
            

        return unFabricante;
    }
    
     public Fabricante bajaFabricante(int c){
        Fabricante unFabricante = this.buscarFabricante(c);
        if(unFabricante != null){
            Empresa.getPersistencia().eliminar(unFabricante);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El Fabricante a eliminar no existe ... ");
        }
        return unFabricante;
    }
    
    
     public Fabricante modificarFabricante(int c, String n,String a,String d,String t){
        Fabricante unFabricante = this.buscarFabricante(c);
        if(unFabricante != null){
            
            unFabricante.setNombre(n);
            unFabricante.setTelefono(a);
            unFabricante.setEmail(d);
            unFabricante.setDescripcion(t);            
            Empresa.getPersistencia().modificar(unFabricante);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El Fabricante a modificar no existe ... ");
        }
        return unFabricante;
    }
    
     public Fabricante modificarFabricante2(int c, Pieza n){
        Fabricante unFabricante = this.buscarFabricante(c);
                    
            unFabricante.setPiezafa(n);
            Empresa.getPersistencia().modificar(unFabricante);
            Empresa.getPersistencia().refrescar(this);

        return unFabricante;
    }
     
//------------------------------ EQUIPO ---------------------------------------------------------

      public Equipo buscarEquipo(int id) {
        Equipo unEquipo = (Equipo) Empresa.getPersistencia().buscar(Equipo.class, id);
        return unEquipo;
    }
    
    
    public Equipo altaEquipo (String d,String u,String c,int cant){
        Equipo unEquipo = null;
        
            unEquipo = new Equipo (d, u, c, cant, this, null);
            this.setEquipos(unEquipo);
            Empresa.getPersistencia().insertar(unEquipo);
            Empresa.getPersistencia().refrescar(this);
            

        return unEquipo;
    }
    
     public Equipo bajaEquipo(int i){
        Equipo unEquipo = this.buscarEquipo(i);
        if(unEquipo != null){
            Empresa.getPersistencia().eliminar(unEquipo);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El Equipo a eliminar no existe ... ");
        }
        return unEquipo;
    }
    
    
     public Equipo modificarEquipo(int i, String d,String u,String c){
        Equipo unEquipo = this.buscarEquipo(i);
        if(unEquipo != null){
            
            unEquipo.setDescripcion(d);
            unEquipo.setUbicacion(u);
            unEquipo.setClase(c);
            Empresa.getPersistencia().modificar(unEquipo);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("El Equipo a modificar no existe ... ");
        }
        return unEquipo;
    }     

//------------------------------ PIEZA ----------------------------------------------------------

     public Pieza buscarPieza(int id) {
        Pieza unaPieza = (Pieza) Empresa.getPersistencia().buscar(Pieza.class, id);
        return unaPieza;
    }


     public Pieza altaPieza (String n){
        Pieza unaPieza = null;
        
            unaPieza = new Pieza (n,this);
            this.setPiezas(unaPieza);
            Empresa.getPersistencia().insertar(unaPieza);
            Empresa.getPersistencia().refrescar(this);
            
        return unaPieza;
    }
     
     public Pieza bajaPieza(int c){
        Pieza unaPieza = this.buscarPieza(c);
        if(unaPieza != null){
            Empresa.getPersistencia().eliminar(unaPieza);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("La Pieza a eliminar no existe ... ");
        }
        return unaPieza;
    }
     
    public Pieza modificarPieza(int c, String n){
        Pieza unaPieza = this.buscarPieza(c);
        if(unaPieza != null){
            
            unaPieza.setDenominacion(n);
           
            Empresa.getPersistencia().modificar(unaPieza);
            Empresa.getPersistencia().refrescar(this);
        }else{
            System.out.println("La pieza a modificar no existe ... ");
        }
        return unaPieza;
    } 


}
