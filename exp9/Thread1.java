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
public class Thread1 extends Thread {

    @Override
    public void run() {
		int counter = 0;
        Random rand = new Random();
        while(true){
			if(counter >= 5){
				break;
			}
			
            int num = rand.nextInt(100) + 1;

            if(num%2 == 0){
                Thread2 t2 = new Thread2(num);
                t2.start();
            }else{
                Thread3 t3 = new Thread3(num);
                t3.start();
            }
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
			counter++;
        }
    }
}
