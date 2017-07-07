package com.mycompany.app;
public class thread1
{
    public static void main(String args[])
    {
        Runnable r1=new Runnable(){
            public void run()
            {
                System.out.println("thread1");
            }
        };
        Thread t=new Thread(r1);
         t.start();    
        Runnable r2=()->{
            System.out.println("Thread2"); 
            };
            Thread t1=new Thread(r2);
            t1.start();
            
        
    }
}