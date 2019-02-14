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
public class Singletone {
    //���������� �/�������� �������. ���������� ���� ������
    public static Singletone uniqueInstance;
    
    //��������� ���������.(��������, ��� ������ ���� ����� ����� ��������� ���������� ����� ��
    private Singletone() {
        
        
    }
    //���������� �������� ������� (������ ���� ������������� �����) � ������� �� ���������� ����������
    public static Singletone getInstance(){
        if(uniqueInstance==null) {
            uniqueInstance = new Singletone();
            System.out.println("The new instance of Singlatone");
        }
        System.out.println("Return instance...");
        return uniqueInstance;
        
    }
    
    
}
