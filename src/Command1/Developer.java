/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1;

import static com.oracle.util.Checksums.update;

/**
 *
 * @author user
 */
public class Developer {
    Command insert;
    Command upddate;
    Command select;
    Command delete;
    private final Command update;
    
   public Developer(Command insert, Command update){
       this.insert = insert;
       this.update = update;
   }
   public void insertRecord(){
       insert.execute();       
   }
   public void updateRecord(){
       update.execute();
   }
}
