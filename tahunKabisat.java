/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester2.tahunKabisat;

import java.util.Scanner;

/**
 *
 * @author ichaww
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        boolean exit = false;
        while (!exit){
            
        System.out.print("Masukkan tahun : ");
        int tahun = scan.nextInt();
        
        if (tahun % 4 == 0){
            System.out.println(tahun + " habis dibagi 4, tetapi bukan tahun kabisat");
            
            if (tahun % 100 == 0){
                System.out.println(tahun + " habis dibagi 100, tetapi bukan tahun kabisat");
                
                if (tahun % 400 == 0){
                    System.out.println(tahun + " merupakan tahun kabisat");
                }
            }
        }
        else {
            System.out.println("tidak memenuhi persyaratan tahun kabisat");
        }
    }
    }
}
