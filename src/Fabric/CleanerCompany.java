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
public class CleanerCompany implements Employee {
    @Override
    
        
        
    void createSoftware(){
        System.out.println("Starting company activity");
        TestFabric.Employee[] employee =new TestFabric.Employee[3]; //пример д/коллекций
        employee[0] = new TestFabric.Cleaner();
                employee[1] =new TestFabric.Manager();
                        
        
    }
    
}
