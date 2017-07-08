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
@Entity
@Table(name="Pieza")
public class Pieza implements Serializable {
    @Id    
    private int nropieza;
    @Column(name="Denominacion",length=30)
    private String denominacion;
    @ManyToMany 
    private Set<Proveedor> proveedores;
    @OneToMany (mappedBy = "piezaequi")
    private Set<Equipo> equipos;
    @ManyToMany
    private Set<Fabricante> fabricantes;
    @ManyToOne
    private Mantenimiento mantenimiento;
    
    //constructores ...
    public Pieza(){
    
    }

    public Pieza(String d){
        this.denominacion= d;
        this.proveedores = new TreeSet<>();
        this.equipos = new TreeSet<>();
        this.fabricantes = new TreeSet<>();
    }

    
    /**
     * @return the nropieza
     */
    public int getNropieza() {
        return nropieza;
    }

    /**
     * @param nropieza the nropieza to set
     */
    public void setNropieza(int nropieza) {
        this.nropieza = nropieza;
    }
    
    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
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
     * @return the fabricantes
     */
    public String getFabricantes() {
        return fabricantes.toString();
    }

    /**
     * @param fabricantes the fabricantes to set
     */
    public void setFabricantes(Fabricante fabricantes) {
        this.fabricantes.add(fabricantes);
    }
    
    @Override
    public String toString(){
        return "Datos de pieza: " + "\nDenominacion: " + this.getDenominacion()+"\nProveedores: "+this.proveedores +"\nEquipos: "+this.equipos;
    }


}
