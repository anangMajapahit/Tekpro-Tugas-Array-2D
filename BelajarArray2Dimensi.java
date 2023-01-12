/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajararray2dimensi;

import java.util.Scanner;

/**
 *
 * @author Anang Misbakhul Khoir
 */
public class BelajarArray2Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahIPKmahasiswa; //jumlahKandidat
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Anggota Mahasiswa : "); 

        jumlahIPKmahasiswa = input.nextInt(); 
        int[] Mahasiswa = new int[jumlahIPKmahasiswa]; 
        int[] noMahasiswa = new int[jumlahIPKmahasiswa]; 

        //jumlah ipk tiap mahasiswa
        // looping sebanyak jumah mahasiswa
        for(int a = 0 ; a < jumlahIPKmahasiswa ; a++){
        
        System.out.print("Masukkan no Mahasiswa dan jumlah IPK tiap Mahasiswa ke - "+(a + 1)+": ");
        
        noMahasiswa[a] = input.nextInt(); 
        Mahasiswa[a] = input.nextInt(); 
        
        }
        
        printArray("No Mahasiswa ke-", noMahasiswa); 
        printArray("Jumlah IPK Mahasiswa ke-", Mahasiswa); 
            
        System.out.println(Mahasiswa[1]); 

        for(int a=0; a < jumlahIPKmahasiswa ; a++){ 
        System.out.println("Jumlah IPK No anggota Mahasiswa ke - "+ noMahasiswa[a]+" : "+ Mahasiswa[a]); 
        }
        
    }
        public static void printArray(String prefix, int[] arrayParameter)
        {
        for(int a=0 ; a <arrayParameter.length ; a++){
        System.out.println(prefix+(a+1)+" :"+arrayParameter[a]);
        }
    }
}