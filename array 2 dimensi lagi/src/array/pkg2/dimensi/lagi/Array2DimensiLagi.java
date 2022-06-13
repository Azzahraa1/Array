/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.pkg2.dimensi.lagi;

import java.util.Arrays;

/**
 *
 * @author HP-MC
 */
public class Array2DimensiLagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datasiswa[][]={
                {"andre","malang"},
                {"ahwan","Jakarta"},
                {"suparto","jogja"},
                {"laksamana","maluku"}
                     
        };
        System.out.println();
        for (String[] datasiswa1 : datasiswa) {
            for (String datasiswa11 : datasiswa1) {
                System.out.println("nama anda:" + Arrays.toString(datasiswa1) + ",alamat anda di" + datasiswa11);
            }
        }
    }
    
}
