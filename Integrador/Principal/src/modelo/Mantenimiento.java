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
@Table(name="Mantenimiento")
public class Mantenimiento implements Serializable {
    @Id
    @GeneratedValue
    private int nromantenimiento;
    @Column(name="Fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @Column(name="Descripcion")
    private String descripcion;
    @Column(name="Estado")
    private boolean estado;
    
    //Relaciones
    @ManyToOne
    private Preventiva preven; 
    @OneToMany (mappedBy = "mantenimiento")
    private Set<Pieza> piezas;

    //Constructores...
    public Mantenimiento(){
        this.piezas = new TreeSet<>();
    }
    
    public Mantenimiento(Date f,String d,boolean e){
        this.fecha= f;
        this.descripcion =d;
        this.estado = e;
        this.piezas = new TreeSet<>();
    }
    
    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the piezas
     */
    public String getPiezas() {
        return piezas.toString();
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(Pieza piezas) {
        this.piezas.add(piezas);
    }
    
    @Override
    public String toString(){
        return "\nFecha: "+this.getFecha()+"\nDescripcion: "+this.getDescripcion()+"\nEstado: "+this.isEstado();
    }

    /**
     * @return the nromantenimiento
     */
    public int getNromantenimiento() {
        return nromantenimiento;
    }

    /**
     * @param nromantenimiento the nromantenimiento to set
     */
    public void setNromantenimiento(int nromantenimiento) {
        this.nromantenimiento = nromantenimiento;
    }
}
