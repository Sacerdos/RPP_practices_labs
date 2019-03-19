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
import java.util.*;
public class Lab2_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double A=0, B=0, C=0, X=0;
        try{
            if (scan.hasNextDouble()) {
                A=scan.nextDouble();
            }
            if (scan.hasNextDouble()) {
                B=scan.nextDouble();
            }
            if (scan.hasNextDouble()) {
                C=scan.nextDouble();
            }
            if (scan.hasNextDouble()) {
                X=scan.nextDouble();
            }
            System.out.println("Answer = " +1/(A*Math.sqrt(4.19*X*X*X-1)-Math.sqrt(B*Math.log(X)+C)));
        }
        catch(Throwable s){
            System.out.println("Incorrent data");
        }
        
    }
    
}
