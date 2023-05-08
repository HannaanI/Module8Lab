/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.module8lab;

/**
 *
 * @author hannaan
 */

public class Main {
    
    public static void methodThrowingException() throws Exception{
        System.out.println("inside the method...");
        throw new Exception("my Exception");
        
    }
    public static void main(String[] args) {
        
        System.out.println("first line...before try");
        try{
            System.out.println("second line...top of try");
            methodThrowingException();
            System.out.println("third line...bottom of try");
        }catch (Exception e){
            System.out.println("fourth line...inside catch");
        }        
        finally {
            System.out.println("fifth line...inside finally");
        }
        System.out.println("sixth line line... last line of main");               
    }   
}