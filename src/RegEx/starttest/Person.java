/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx.starttest;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private String LastName;

    public Person(String name, String LastName) {
        this.name = name;
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "Person{" + "name= " + name + ", LastName= " + LastName + '}';
    }
    
  void sayHello(){
      System.out.println("Hello from " + name + " " + LastName);
      
      
      
  } 
  void sayBye(){
      System.out.println(name + " " + LastName + " Bye");
      
      
      
  } 
    
}


