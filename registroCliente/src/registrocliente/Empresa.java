/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocliente;

import Persistencia.Persistencia;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
import javax.persistence.*;

/**
 *
 * @author nicolas
 */
@Entity
public class Empresa implements Serializable {
    @Id
    private int id;
    private String nombre;
    @OneToMany (mappedBy = "emprecli")
    private Set<Cliente> clientes;
    private static Persistencia per;
    
    //Constructores
    public Empresa (){
    this.clientes = new TreeSet<>();
    }

    public Empresa (int i,String nom){
        this.id= i;
        this.nombre= nom;
        this.clientes = new TreeSet<>();
        Empresa.per.insertar(this);
        
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
    
    static {
        per = new Persistencia();
    }

    public static Persistencia getPersistencia() {
        return per;
    }

    @Override
    public String toString() {
        return "Datos de Empresa: "+ "\nNombre: " + this.getNombre();
    }

    /**
     * @return the clientes
     */
    public Set<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }
    
    //Métodos personalizados
    public Cliente buscarCliente(String cuil) {
        Cliente unCliente = (Cliente) Empresa.getPersistencia().buscar(Cliente.class, cuil);
        return unCliente;
    }

    public Cliente altaCliente(String dn, String nom, String ap, String dir, String tel) {
        Cliente unCliente = null;
        if ((this.buscarCliente(dn)) == null) {
            unCliente = new Cliente(dn, nom, ap, dir, tel,this);
            this.setClientes(unCliente);
            Empresa.getPersistencia().insertar(unCliente);
            Empresa.getPersistencia().refrescar(this);

        } else {
            System.out.println("El Cliente ya existe ...");
        }
        return unCliente;
    }

    public Cliente modificarCliente(String dn, String nom, String ap, String dir, String tel) {
        Cliente unCliente = this.buscarCliente(dn);
        if (unCliente != null) {
            unCliente.setDni(dn);
            unCliente.setNombre(nom);
            unCliente.setApellido(ap);
            unCliente.setDireccion(dir);
            unCliente.setTelefono(tel);
            Empresa.getPersistencia().modificar(unCliente);
            Empresa.getPersistencia().refrescar(this);
        } else {
            System.out.println("El Cliente a modificar no existe ... ");
        }
        return unCliente;
    }

    public Cliente bajaEmpleado(String dn) {
        Cliente unCliente = this.buscarCliente(dn);
        if (unCliente != null) {
            this.getClientes().remove(unCliente);
            Empresa.getPersistencia().eliminar(unCliente);
            Empresa.getPersistencia().refrescar(this);
        } else {
            System.out.println("El Cliente a eliminar no existe ... ");
        }
        return unCliente;
    }
}
