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
public class TestClass {
    public static void main(String[] args) {
        //как создать экземпл€р нашего класса
        MyObject o = new MyObject();
        
        //создать еще один экземпл
        MyObject o2 = new MyObject();
        
        //можно сколько угодно создавать объектов
        
        //создать экземпл€р закрытого класса
        MyObjectClosed0 o3 = new MyObjectClosed0(); //нельз€ создать объект по этому классу. ѕочему?
        
        MyObjectClosed1 o4 = MyObjectClosed1.getInstance();
        
        MyObjectClosed1 o5 = MyObjectClosed1.getInstance(); //снова можно создавать сколько углдно объектов...
        
        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance(); //пытаемс€ создать второй экземпл€р
        
    }
    
}
