/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println(MyRegEx.checkPass("LOpata"));
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter new password");
        String str = br.readLine();
        boolean result = MyRegEx.checkPass(str);
        while (!result){
            
            System.out.println("password is NOT checked");
            System.out.println("Enter new password");
            str = br.readLine();
            result = MyRegEx.checkPass(str);
            
        }
        System.out.println("password checked");
        
        System.out.println("проверка email");
      System.out.println(MyRegEx.checkEmail("irena.grosbergs@gmail.com")); 
      
        System.out.println("проверка IP-адреса");
        str = br.readLine();
        
        System.out.println(MyRegEx.checkIP(str)); 
    }
    
}
