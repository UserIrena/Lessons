/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectTest;

import Collect.TestMeMassive;
import java.util.Arrays;
import java.util.Set;

/**
 *
 * @author user
 */
public class TestMeNassive {
    public static void main(String[] args) {
       
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> tree = new TreeSet<>();

        hashSet.add("Bob");
        hashSet.add("Lisa");
         hashSet .add("German");
        hashSet.add("Bob");
        hashSet.add("Ivan");
        
        hashSet.forEach((name) -> {
            System.out.println("name");
        });
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        
        Set<Integer> setUnion = new TestMeMassive<>(set1);
        setUnion.addAll(set2);
        System.out.println(setUnion);
        
        Set<Integer> setIntersection = new TestMeMassive<>(set1);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);
        
        Set<Integer> setDifference1 = new TestMeMassive<>(set1);
        setDifference1.removeAll(set2);
        System.out.println(setDifference1);
        
        
        Set<Integer> setDifference2 = new TestMeMassive<>(set2);
        setDifference2.removeAll(set1);
        System.out.println(setDifference2);
        
    }
}

                      
        }
    }
    
}
