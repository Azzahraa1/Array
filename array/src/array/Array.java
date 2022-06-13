/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author HP-MC
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no[][]={{2,4,6,8},{22,24,26,28},{52,54,56,58}};
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(no[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
