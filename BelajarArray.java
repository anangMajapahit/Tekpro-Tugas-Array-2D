/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajararray;

import java.util.Arrays;


/**
 *
 * @author Anang Misbakhul Khoir
 */
public class BelajarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // input = jumlah kadidat (n) diketahui dengan n jumlah suara
        // output = jumlah suara terbanyak dan nomer kadidat
        String [][]   JenisGaged = {
                {"Iphone", "Samsung"},
                {"Xiaomi", "Oppo"   },
                {"Vivo"  , "Sony"   },
                {"Evercross","LG"   },
        };
        
        System.out.println(Arrays.deepToString(JenisGaged));
    }
}
    