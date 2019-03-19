/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.Sacerdos.labs.lab4;
public class SMethods {
    
    private double[] array;
    private double sum;
    
    public double GetSum()
    {
        return sum;
    }
    
    public SMethods(double[] arr)
    {
        array = arr;
        sum = 0;
        CalcSum();
        SortArray();
    }
    
    private void SortArray()
    {
        int j;
        double temp;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];      
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];               
                    j--;
                }
                array[j] = temp;             
            }        
        }
    }
    
    private void CalcSum()
    {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                sum += array[i];       
    }
}
