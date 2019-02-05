/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabric;

/**
 *
 * @author user
 */
public class GameDeCompany extends Company  {
      @Override
      Employee[] getEmployee() {
          System.out.println("");
          System.out.println("Starting company activity" +GameDeCompany.class.getSimpleName() + "\n");
          Employee[] employee = new Employee[3]; //пример д/коллекций
          employee[0] = new Designer();
          employee[1] = new Programmer();
          employee[2] = new Tester();
          
          return employee;
      }
    
}
