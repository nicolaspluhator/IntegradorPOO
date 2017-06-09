/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocliente;

import vista.ABMCliente;
import registrocliente.Empresa;

/**
 *
 * @author nicolas
 */
public class Sistema {
 public static void main(String[] args) {
     //Cliente cli1 = new Cliente("2","Mauro","Cubilla","Barrio 25 de Mayo","12312312");
     
     Empresa emp = (Empresa) Empresa.getPersistencia().buscar(Empresa.class, 1);

     if (emp == null){
     try
     {
        emp = new Empresa (1,"Nama Lo Re");
        ABMCliente ventana = new ABMCliente(emp);
        ventana.setVisible(true);
       emp.altaCliente("39688333", "nom", "ap", "dir", "tel");
     }catch (Exception e){
         System.out.println("Error: "+ e);
     }
     }
 }    

}
