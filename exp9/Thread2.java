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
public class Thread2 extends Thread {
    int n, square;
    public Thread2(int n){
        this.n = n;
    }
    
    @Override
    public void run(){
        square = n*n;
        System.out.println(n + "^2 = " +square);
    }
}
