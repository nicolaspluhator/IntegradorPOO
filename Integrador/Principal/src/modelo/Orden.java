/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author nicolas
 */
@MappedSuperclass
public abstract class Orden implements Serializable {
    //@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
    
    @Id
    private int nrorden;
    @Column (name="Descripcion",length = 30)
    private String descripcion;
    @Column (name="Fecha Adicion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaA;
    
    //Relaciones
    @OneToMany 
    private Set<Empleado> empleados;
    @OneToOne
    private Empleado supervisor;
    @ManyToOne
    private Equipo equi;

    //Constructores...
    public Orden(){
    
    }
    
    public Orden(int n,String d,Date fa){
        this.nrorden =n;
        this.descripcion=d;
        this.fechaA=fa;
        this.empleados= new TreeSet<>();
        this.supervisor= new Empleado();
        this.equi= new Equipo();    
    }
    /**
     * @return the nrorden
     */
    public int getNrorden() {
        return nrorden;
    }

    /**
     * @param nrorden the nrorden to set
     */
    public void setNrorden(int nrorden) {
        this.nrorden = nrorden;
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
     * @return the fechaA
     */
    public Date getFechaA() {
        return fechaA;
    }

    /**
     * @param fechaA the fechaA to set
     */
    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    /**
     * @return the supervisor
     */
    public Empleado getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the equipos
     */
    public Equipo getEquipos() {
        return equi;
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipos(Equipo equipos) {
        this.equi = equipos;
    }

    /**
     * @return the empleados
     */
    public String getEmpleados() {
        return empleados.toString();
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(Empleado empleados) {
        this.empleados.add(empleados);
    }
    
}
