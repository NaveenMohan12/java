package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class lists
{
    public static void main(String args[])
    {
        
        List<Integer> a= new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.forEach((n)-> 
        System.out.println(n));
    }
}