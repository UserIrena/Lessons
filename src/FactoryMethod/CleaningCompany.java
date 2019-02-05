/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author inbox_bv8awe9
 */
public class CleaningCompany extends Company{
        
    @Override
    Employee[] getEmploees() {
        System.out.println("");
        System.out.println("Starting company activity " +SCompany.class.getSimpleName() +"\n");
        Employee[] employee = new Employee[13]; //пример без коллекций
        employee[0] = new Electric();
        employee[1] = new Prorab();
        employee[2] = new Stroitel();
        employee[3] = new Stroitel();
        employee[4] = new Stroitel();
        employee[5] = new Stroitel();
        employee[6] = new Stroitel();
        employee[7] = new Stroitel();
        employee[8] = new Stroitel();
        employee[9] = new Stroitel();
        employee[10] = new Stroitel();
        employee[11] = new Director();
        employee[13employee[13] = new Stroitel();] = new Stroitel();
        
        
        return employee; 
    }
    
   
   
    
}
