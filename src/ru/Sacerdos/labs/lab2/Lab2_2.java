package ru.Sacerdos.labs.lab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyad
 */
public class Lab2_2 {
    public static void main(String[] args){
        try{
            final double A=Double.parseDouble(args[0]);
            final double B=Double.parseDouble(args[1]);
            final double C=Double.parseDouble(args[2]);
            final double X=Double.parseDouble(args[3]);
            System.out.println("Answer = " +1/(A*Math.sqrt(4.19*X*X*X-1)-Math.sqrt(B*Math.log(X)+C)));
        }
        catch(Throwable s){
            System.out.println("Incorrent data");
        }
        
        
    }
    
}
