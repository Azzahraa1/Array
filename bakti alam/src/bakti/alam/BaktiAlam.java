/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakti.alam;

import java.util.Scanner;

/**
 *
 * @author HP-MC
 */
public class BaktiAlam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lama,jumlah_bayar1;
        Double jumlah_bayar;
        int h=0;
        Scanner input = new Scanner(System.in);
    String p [][]={
        {"duku","915000","1025000","1225000"},
        {"jeruk","915000","1025000","1225000"},
        {"alpukat","575000","695000","895000"},
        {"jambu air","575000","695000","895000"},
        {"durian","595000","715000","915000"},
        {"melon","595000","715000","915000"},
        {"belimbing","495000","575000","755000"},
        {"mangga","495000","575000","755000"},
        {"kedondong","495000","575000","755000"},
        };
    
        
        System.out.print("cottage   :");
        String cottage=input.nextLine();
        System.out.print("tipe      :");
        String tipe = input.nextLine();
        System.out.print("lama      :");
        lama=input.nextInt(); 
        
        switch (tipe) {
            case "weekday":
                h = 1;
                break;
            case "weekend":
                h = 2 ;
                break;
            case "holiday":
                h = 3;
                break;
            default:
                break;
        }
            
       
        for (String[] p1 : p) {
            if (p1[0].equals(cottage)) {
                jumlah_bayar = lama * Double.parseDouble(p1[h]);
                System.out.println("jumlah bayar: "+jumlah_bayar);
            }
        }
}
}
   
        