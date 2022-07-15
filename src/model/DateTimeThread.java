/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class DateTimeThread extends Thread{
    
    private JLabel jlabelDate;

    
    public DateTimeThread(JLabel jlabelDate){
        this.jlabelDate = jlabelDate;
    }

    @Override
    public void run() {
        SimpleDateFormat spfDate = new SimpleDateFormat("EEE, MMM d, ''yy hh:mm:ss");
        while (true) {            
            Date timeNow = new Date();
            String strDateNow = spfDate.format(timeNow);
            jlabelDate.setText(strDateNow);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DateTimeThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
}
