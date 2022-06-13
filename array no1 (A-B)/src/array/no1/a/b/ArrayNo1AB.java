/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.no1.a.b;

/**
 *
 * @author HP-MC
 */
public class ArrayNo1AB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{-7,5},{4,8},{9,10}};
        int b[][]={{1,1},{-4,9},{10,9}};
        System.out.println("Hasil A-B");
//      Menghitung berapa kolom(kebawah)
        for(int i=0;i<3;i++){
//      Menghitung berapa garis(kesamping)
            for(int j=0;j<2;j++){
//              Jika penjumlahan hanya mengganti operator aritmatika dibawah
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
