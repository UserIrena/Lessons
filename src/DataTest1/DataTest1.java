/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTest1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class DataTest1 {
    
    JFrame frame;
    
    public void go() {
        frame=new JFrame();
        JButton button = new JButton("����� � ����� ��� ������?");
        
        frame.getContentPane().add(BorderLayout.CENTER, button);
        
        //Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    
}
}
