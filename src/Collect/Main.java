/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();//не указываем размер
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
       // System.out.println(arrayList.toString());
       // System.out.println(arrayList.get(0));
       // System.out.println(arrayList.get(99));

       // System.out.println(arrayList.get(arrayList.size() - 1));

       // for (int i = 0; i < arrayList.size(); i++) {
       //     System.out.println(arrayList.get(i));
       // }
       // for (Integer x : arrayList) {
        //    System.out.println(x);
        }
// тоже самое с лямбда
      //  arrayList.forEach((x) -> {
       //     System.out.println(x);
      //  });
      //  arrayList.remove(99);
    System.out.println(linkedList.toString());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(99));
        
        System.out.println(linkedList.get(arrayList.size() - 1));
         for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        for (Integer x : linkedList) {
            System.out.println(x);
        }
        linkedList.forEach((x) -> {
              System.out.println(x);
        });
        linkedList.remove(99);
            
    }
}
