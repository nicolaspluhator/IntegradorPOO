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
        emp.altaEmpleado("2","Nico","Pluton", "Lavallle", "39638929", "masternikito@hotmail.com");
        emp.bajaEmpleado("2");
        emp.modificarEmpleado("1", "Cristian", "Pluhator", "Lavalle", "39638929", "nicolaspluhator@hotmail.com");
        
        emp.altaPieza("pieza1");
        emp.altaPieza("Tornillo");
        emp.altaPieza("martillo");
        
        
        emp.altaProveedor("nombre", "asd", "dsdsd", "wesaa");
        
        
        emp.altaProveedor("ASDASD", "asd", "dsdsd", "wesaa");
        emp.altaProveedor("ASDASD", "asd", "dsdsd", "wesaa");
        emp.altaProveedor("ASDASD", "asd", "dsdsd", "wesaa");
        emp.bajaProveedor(2);
        emp.modificarProveedor(1, "LA EMPRESA", "DALE QUE SALE", "ADSADA", "DASDASD");
        
        emp.altaFabricante("nom", "asd", "des", "RARWRW");
        emp.altaFabricante("nom2", "asd3", "des1", "RARWRW2");
        emp.altaFabricante("nom3", "assadad3", "fdsades1", "adsfRARWRW2");
        emp.bajaFabricante(1);
        emp.modificarFabricante(2, "cambio", "eseeee", "jojojo", "tortolo");
        
        emp.altaEquipo("Lavado de envase", "Sector 1", "Clase a", 3);
        emp.altaEquipo("Embotellamiento", "Sector 1", "Clase b", 4);
        emp.altaEquipo("Embotellamiento", "Sector 1", "Clase b", 4);
        emp.bajaEquipo(3);
        emp.modificarEquipo(2, "Embotellamiento", "Sector 2", "Clase B");
        
    }
    
}
