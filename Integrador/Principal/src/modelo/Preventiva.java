/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author nicolas
 */
@Entity
@Table(name="Preventiva")
public class Preventiva extends Orden{
    
    //Relaciones
    @ManyToMany
    private List<Empleado> emplePre;
    @OneToMany(mappedBy="preven")
    private List<Mantenimiento> mantenimientos;
    
    //Constructores...
    public Preventiva(){
        super();
    }
    
    public Preventiva(int nombre,String descripcion,Date fechaA){
       super(nombre, descripcion,fechaA);
      // this.mantenimientos = new ArrayList<>();
    }
    
    
}
