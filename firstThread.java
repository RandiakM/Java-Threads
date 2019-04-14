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
public class firstThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(firstThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void start(){
        Thread thread1=new Thread(this);
        thread1.start();
    }
    
    
}
class newClass extends Thread{
        
    public static void main(String[] args) {
        firstThread ft1=new firstThread();
        firstThread ft2=new firstThread();
        
        ft1.start();
        ft2.start();
    }
 } 