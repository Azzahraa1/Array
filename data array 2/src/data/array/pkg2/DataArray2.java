/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.array.pkg2;

/**
 *
 * @author HP-MC
 */
public class DataArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nama[]=new String[3];
        nama[0]="rara";
        nama[1]="ria";
        nama[2]="rio";
        String alamat[]={"jakarta","surabaya","malang"};
        
        for(int j=0;j<nama.length;j++){
            System.out.println("nama anda:"+nama[j]+",alamat anda di"+alamat[j]);
    
    }
    }
    
}
