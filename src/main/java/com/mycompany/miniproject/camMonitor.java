/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JLabel;

/**
 *
 * @author arnavprabhale
 */










public class camMonitor //implements Runnable
{
    JLabel lbldisplay;
    volatile boolean check = false;
    

    public camMonitor(JLabel d)
    {
        lbldisplay = d;
            
//        webcam = Webcam.getDefault();
//        webcam.setViewSize(new Dimension(640, 480));
//        webcam.open();
//        
//        wb = this;
//        
//        t = new Thread(this);
//        t.start();
        
        
    }
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

    
    
//    @Override
//    public void run()
//    {
//        while(state)
//        {
//            Image img = webcam.getImage();
//            lbldisplay.setIcon(new ImageIcon(img));
    
//               if(check)
//               {
//                   ImageIO.write(webcam.getImage(), "PNG", new File("path"));
    
//               }
//        }
//    }

    
    public void upload()
    {
        try
        {
            String path = "/Users/arnavprabhale/Downloads/image1.png";
            //ImageIO.write(webcam.getImage(), "PNG", new File("path"));
            byte[] imageBytes = LoadImage(path);
            Mongo mongo = new Mongo( "127.0.0.1" );
            DB db = mongo.getDB( "Sample" );

            GridFS fs = new GridFS( db );

            GridFSInputFile in = fs.createFile( imageBytes );
            in.save();  
        } 
        catch (Exception e)
        {
            
        }
              
    }

}















/*




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
