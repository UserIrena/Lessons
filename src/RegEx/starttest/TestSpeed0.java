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
public class TestSpeed0 {
    //динамич блок
    {
        System.out.println("We are in    ");
}
    static { //статическ блок, выводимый единожды! на уровне класса
        System.out.println("We are in STATIC block 1");
    }
    public TestSpeed0() {
        System.out.println("Construktor has worked ");
    }
    {
    System.out.println("We are in last bloc 2");
    
}
    public static void  main(String[] args) {
        TestSpeed0 test = new TestSpeed0();
        TestSpeed0 test2 = new TestSpeed0();
    }
}