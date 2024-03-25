/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.desfanni;

/**
 *
 * @author onang
 */
public class Tugas3pbo {public static void main(String[] args) {
        String nama1 = "Dea";
        String nama2 = "Cika";
        long gajiDea = 10000000;
        long gajiCika = 5000000;
        double pajak, gajibersih;

        //jika gaji > 6juta maka pajak 3%
        //jika gaji < 6juta maka pajak 2%
        pajak = 0.03 * gajiDea;
        gajibersih = gajiDea - pajak;
        
        System.out.println("pajak Dea =" + pajak);
        System.out.println("gaji bersih Dea =" + gajibersih);

        pajak = 0.02 * gajiCika;
        gajibersih = gajiCika - pajak;
        System.out.println("pajak Cika =" + pajak);
        System.out.println("gaji bersih Cika =" + gajibersih);
   }
   
}
