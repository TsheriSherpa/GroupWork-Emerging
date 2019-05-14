/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

 
public class ObjectIOExample  {
 
    private static final String filepath="C:\\Users\\tsher\\Documents\\java.txt";
 
    public static void main(String args[]) {
 
        ObjectIOExample objectIO = new ObjectIOExample();
 
        Student student = new Student("John","Frost",22);
        objectIO.WriteObjectToFile(student);
        
        objectIO.ReadObjectFromFile(filepath);
    }
 
    public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Object ReadObjectFromFile(String filepath) {
 
        try {
 
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Object obj = objectIn.readObject();
            System.out.println(obj);
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}