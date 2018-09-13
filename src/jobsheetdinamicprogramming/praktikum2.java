/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdinamicprogramming;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class praktikum2 {
     private static String tampilIdentitas (String identitas ) {
        System.out.print("Identitas : " + identitas);
        System.out.println("\nHitung Upah Maksimal");
        System.out.println("Daftar Barang : A (5000/kg), B{7000/kg), C(2000/kg), D(3000/kg), E(10000/kg)");
        return identitas;
    }

 public static void main (String [] args) {
    String identitas = "Krisna P. M./ X RPL 5/ 18";
    tampilIdentitas(identitas);
    Scanner isr = new Scanner(System.in);
    System.out.print("Jumlah barang (dalam kg) : ");
    int uang = isr.nextInt();
    int berat [] ={7,5,4,3,2};
    String nama [] = {"E","B","A","D","C"}; 
    int upah [] = {10000,7000,5000,3000,200};
    int jumlah;
    
    for (int i = 0; i< berat.length;i++){
        if (uang >= berat[i]){
            jumlah = uang / berat[i];
            int banyak = jumlah * berat[i];
            uang = uang%berat[i];
            int harga = jumlah * upah[i];
            System.out.println("barang " + nama[i] + " sejumlah " +jumlah+" buah dengan total berat " + banyak+"kg. Bayaran = " +harga );
        }
    }
 }     
}


