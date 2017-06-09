/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Correctiva")
public class Correctiva extends Orden{
    @Column(name="Fecha_Planificacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaP;
    @Column(name="Fecha_Cierre")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaC;
    
    //Relaciones
    @ManyToMany
    private List<Empleado> empleCo;

    //Constructores ...
    public Correctiva(){
        super();
    }
    
    public Correctiva(int nombre,String descripcion,Date fechaA,Date fp,Date fc){
        super(nombre, descripcion,fechaA);
        this.fechaP =fp;
        this.fechaC =fc;
        
    }
    /**
     * @return the fechaP
     */
    public Date getFechaP() {
        return fechaP;
    }

    /**
     * @param fechaP the fechaP to set
     */
    public void setFechaP(Date fechaP) {
        this.fechaP = fechaP;
    }

    /**
     * @return the fechaC
     */
    public Date getFechaC() {
        return fechaC;
    }

    /**
     * @param fechaC the fechaC to set
     */
    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }
}
