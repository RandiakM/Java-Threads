/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Randika Madhushan
 */
public class ThreadWait{

    public static void main(String[] args) {
        
        FirstThread t1=new FirstThread();
        //FirstThread ft2=new FirstThread();
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        
        //ft2.start();
        SecondThread t2=new SecondThread();
        t2.start();
    }
}
class FirstThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }  
}
class SecondThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}