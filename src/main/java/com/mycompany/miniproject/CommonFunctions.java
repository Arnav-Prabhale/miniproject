/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miniproject;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class CommonFunctions
{
    public static void addlabelBackground(JLabel lbl, String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newImg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newImg);
            lbl.setIcon(icon);
            
        } catch (IOException e)
        {
            System.out.println("caught");
        }
    }
    
    public static void alphabeticValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isAlphabetic(ch) == true  || ch == ' ')
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void numericValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true)
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    public static void noInputValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true)
        {
            evt.consume();
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void conversionValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true || ch == '.')
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void emailValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true || Character.isAlphabetic(ch) == true)
        {
            
        }
        else if (ch == '.' || ch == '@')
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void addressValidation(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true || Character.isAlphabetic(ch) == true)
        {
            
        }
        else if (ch == '.' || ch == '@' || ch == ',' || ch == '/' || ch == ';' || ch == '-' )
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void alphanumeric(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        
        if(Character.isDigit(ch) == true || Character.isAlphabetic(ch) == true)
        {
            
        }
        else
        {
            evt.consume();
            
        }
    }
    
    public static void connectDatabase(String query)
    {
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exams", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate(query);
                        
        } 
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error = " + e);
            
        }
    }
    
}
