/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author user
 */
//Анонимное исключение
public class ex3 {
    public static void main(String[] args) {
        
        try {
            throw new Exception("Мое искл");
        } catch (Exception e) {
            System.out.println("Обработка искл");
            System.out.println(e.getMessage());
        }
    }
    
}
