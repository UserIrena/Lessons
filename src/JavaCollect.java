// ������ � ���������
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class JavaCollect {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream stream = new FileInputStream("d:/moscow-buildings.csv");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);   //��������� ���� � �������� � ������
        
        //����������� ����� ������ � �����
        String text = new String(data);
       // System.out.println(text);
     // �������� � �������� ������
    String[] lines = text.split("\n");
     
          
      //    for (String line : lines) {
       //       System.out.println(line);
       //       System.out.println("----------------");
       List<String[]> lineWords = new ArrayList<>();
       for (String line : lines) {
           String[] words = line.split(",");
           lineWords.add(words);
                }
   //    for (String[] words : lineWords){
    //        for (String word : words) {
    //            System.out.println(word);
     //           System.out.println("|");
     //       }
     //       System.out.println("end of atring");
     for (String[] words : lineWords) {
         if(words[0].equals("2281032")) {
       //  if(words[9].equals("1999")) {
             for (String word : words) {
               System.out.print(word);
               System.out.print("|");  
             }
               System.out.println("\n----------------");
               // "\n" ������ ������� ������
         }
           
       }
           }
    
}
