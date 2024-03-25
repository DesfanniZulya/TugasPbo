/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.desfanni;

/**
 *
 * @author onang
 */
public class Tugas2 {public static void main(String[] args) {
        int i, j;
        for(i=0; i<5; i++){
            for(j=5; j>i; j--){
                
                if(j==5){
                    System.out.print("A");
                }
                else if(j==4){
                    System.out.print("B");
                }
                
                else if(j==3){
                    System.out.print("C");
                }
                
                else if(j==2){
                    System.out.print("D");
                }
                
                else if(j==1){
                    System.out.print("E");
                }
            }
        }
   }
}
