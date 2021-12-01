/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

/**
 *
 * @author arnavprabhale
 */
public class StudentInfo
{
    String name;
    String rollno, password;
    int examno;
    int[] optionTicked;

    StudentInfo(String nameString, String passString, String rollNo, int test_no)
    {
        name = nameString;
        password = passString;
        rollno = rollNo;
        examno = test_no;
        optionTicked = new int[9];
        for(int i = 0; i < optionTicked.length; i++)
        {
            optionTicked[i] = -1;
        }
        
    }

    void print()
    {
        System.out.println(name + password + rollno + examno);
    }
}
