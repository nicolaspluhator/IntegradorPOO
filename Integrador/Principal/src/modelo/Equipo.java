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
@Table(name="Equipos")
public class Equipo implements Serializable {
    @Id
    @GeneratedValue
    private int nroequipo;
    @Column(name="Descripcion",length=30)
    private String descripcion;
    @Column(name="Ubicacion",length=30)
    private String ubicacion;
    @Column(name="Clase",length=30)
    private String clase;
    @OneToMany
    private Set<Equipo> listequipo;
    @Column(name="Cantidad")
    private int cant;
    @ManyToOne
    private Empresa empresaequi;
    @ManyToOne
    private Pieza piezaequi;

    //Constructores ...
    public Equipo(){
    
    }
    
    public Equipo(int nro,String d,String u,String c){
        this.nroequipo = nro;
        this.descripcion = d;
        this.ubicacion = u;
        this.clase = c;
        this.listequipo = new TreeSet<>();
    }
    /**
     * @return the nroequipo
     */
    public int getNroequipo() {
        return nroequipo;
    }

    /**
     * @param nroequipo the nroequipo to set
     */
    public void setNroequipo(int nroequipo) {
        this.nroequipo = nroequipo;
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the listequipo
     */
    public String getListaequipos(){
        return this.listequipo.toString();
    }
    
    public void setListaequipos(Equipo e){
        this.listequipo.add(e);
    }

    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        this.cant = cant;
    }
        
    @Override
    public String toString(){
        return "Datos de equipo: " + "\nNumero de equipo: " + this.getNroequipo() + "\nDescripcion: " + this.getDescripcion() + "\nUbicacion: "+this.getUbicacion()+"\nClase: "+this.getClase()+"\nEquipos a los que pertenece: "+this.listequipo;
    }
}
