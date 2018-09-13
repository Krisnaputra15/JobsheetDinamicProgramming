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
public class Praktikum1 {
      private static String tampilIdentitas (String identitas ) {
        System.out.print("Identitas : " + identitas);
        System.out.println("\nHitung Kombinasi Uang");
        System.out.println("Daftar Uang : 100, 500, 1000, 2000, 5000");
        return identitas;
    }

 public static void main (String [] args) {
    String identitas = "Krisna P. M./ X RPL 5/ 18";
    tampilIdentitas(identitas);
    Scanner isr = new Scanner(System.in);
    System.out.println("Jumlah uang : ");
    int uang = isr.nextInt();
    int pecahan [] ={5000,2000,1000,500,100};
    int jumlah;
    
    for (int i = 0; i< pecahan.length;i++){
        if (uang >= pecahan[i]){
            jumlah = uang / pecahan[i];
            uang = uang%pecahan[i];
            System.out.println("Pecahan " + pecahan[i] + " sebanyak " +jumlah+" keping");
        }
    }
 }     
}
