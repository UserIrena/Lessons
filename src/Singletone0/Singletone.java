/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone0;

/**
 *
 * @author user
 */
public class Singletone {
    //переменна€ д/хранени€ единств. экземпл€ра этоо классд
    public static Singletone uniqueInstance;
    
    //приватный конструкт.(означает, что только этот класс может создавать экземпл€ры этого кл
    private Singletone() {
        
        
    }
    //отложенное создание объекта (только если действительно нужно) ¬ отличие от глобальной переменной
    public static Singletone getInstance(){
        if(uniqueInstance==null) {
            uniqueInstance = new Singletone();
            System.out.println("The new instance of Singlatone");
        }
        System.out.println("Return instance...");
        return uniqueInstance;
        
    }
    
    
}
