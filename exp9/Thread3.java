/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company.tonypsr;

import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author student
 */
public class Thread3 extends Thread{
   int n, cube;
    public Thread3(int n){
        this.n = n;
    }
    
    @Override
    public void run(){
        cube = n*n*n;
        System.out.println(n + "^3 = " +cube);
        try {
             Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
