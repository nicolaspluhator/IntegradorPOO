/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author nicolas
 */
public class Principal {

    
    public static void main(String[] args) {

        Empresa emp = new Empresa(1,"Empresadeprueba","direc","4567891","asdasd@hotmail");
        emp.altaEmpleado("1","Nicolas","Pluhator", "Lavallle", "4324234", "nicolaspluhator@hotmail.com");
        
        
    }
    
}
