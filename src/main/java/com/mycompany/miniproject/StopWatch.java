/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arnavprabhale
 */

class StopWatch extends javax.swing.JFrame implements Runnable
{

    /**
     * Creates new form StopWatch
     */
    JPanel mainPanel;
    JLabel lbltimeJlabel, lbltime;
    Thread t;
    volatile boolean check = true; // refresh = true, lapse = false;
    String s;
    int first = 0;
    StopWatch me;
    int sec = 0;
    int min = 0;
    int millisec = 0;
    String keeplapse;
    String lapsetimeString = "";
    int index = 1;
    questionPage qp;
    StudentInfo stud;
    
    
    
    public StopWatch(JPanel stopwatchpanel, JLabel lbltimepanel, questionPage qpPage, StudentInfo s)
    {
        System.out.println("Thread Entered StopWatch");
        //CommonFunctions.addlabelBackground(lblmainpage, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/stopwatch.jpeg");
        t = new Thread(this);
        me = this;
        mainPanel = stopwatchpanel;
        lbltime = lbltimepanel;
        qp = qpPage;
        stud = s;
        t.start();
    }

    
    @Override
    synchronized public void run()
    {
        
        String s1, s2, s3;
        
        while(check)
        {
            millisec++;
            
            if(sec == 60)
            {
                sec = 0;
                min++;
            }
            if(millisec == 100)
            {
                sec++;
                millisec = 0;
                
            }
            if(millisec < 10)
            {
                s1 = "0" + String.valueOf(millisec);
            }
            else
            {
                s1 = String.valueOf(millisec);
            }
            if(sec < 10)
            {
                s2 = "0" + String.valueOf(sec);
            }
            else
            {
                s2 = String.valueOf(sec);
            }
            if(min < 10)
            {
                s3 = "0" + String.valueOf(min);
            }
            else
            {
                s3 = String.valueOf(min);
            }     
       
            try
            {
                Thread.sleep(10);
                String s = s3 + " : " + s2 + " : " + s1;
                lbltime.setText(s);
                if(min == 1)
                {
                   submitPage sp = new submitPage(stud);
                   sp.setVisible(true);
                   qp.setVisible(false);
                   check = false;
                }
            } 
            catch (InterruptedException e)
            {
                JOptionPane.showMessageDialog(mainPanel, "Exception" + e);
            }

        }
    }
}  


/*

public static byte[] LoadImage(String filePath) throws Exception 
{
        File file = new File(filePath);
        int size = (int)file.length();
        byte[] buffer = new byte[size];
        FileInputStream in = new FileInputStream(file);
        in.read(buffer);
        in.close();
        return buffer;
}


public static void main(String[] args) throws Exception 
{
        
//Load our image
        byte[] imageBytes = LoadImage("C:/Temp/bear.bmp");
        
//Connect to database
        Mongo mongo = new Mongo( "127.0.0.1" );
        String dbName = "GridFSTestJava";
        DB db = mongo.getDB( dbName );
       
//Create GridFS object
        GridFS fs = new GridFS( db );
       
//Save image into database
        GridFSInputFile in = fs.createFile( imageBytes );
        in.save();

       
//Find saved image
        GridFSDBFile out = fs.findOne( new BasicDBObject( "_id" , in.getId() ) );

        
//Save loaded image from database into new image file
        FileOutputStream outputImage = new FileOutputStream("C:/Temp/bearCopy.bmp");
        out.writeTo( outputImage );
        outputImage.close();
    }

*/











