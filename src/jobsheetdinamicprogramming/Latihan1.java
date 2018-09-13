/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdinamicprogramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan1 {
    private static String tampilIdentitas (String identitas )throws IOException {
         InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Identitas : " + identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
        return identitas;
    }
    private static int tampilInput(){
        Scanner isr = new Scanner (System.in);
        System.out.print("Bilangan ke : ");
        int n = isr.nextInt();
        return n;
    }
    private static BigInteger fibo (int n) {
        BigInteger [] hasil = new BigInteger[n];
        hasil [0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        for (int i = 2 ; i < n; i++){
            hasil [i] = hasil[i-1].add(hasil[i-2]);
        }
        return hasil[n-1];
    }
    private static void tampilHasil(int n, BigInteger hasil){
        System.out.println("Bilangan Fibonacci ke-" + n +" : " + hasil);
    }
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        String identitas = "Krisna Putra Mariyanto / X RPL 5 / 18";
        tampilIdentitas(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n,hasil);
        
    }
    
}
