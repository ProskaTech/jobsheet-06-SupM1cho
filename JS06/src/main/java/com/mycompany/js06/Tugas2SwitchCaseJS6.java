/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js06;

import java.util.Scanner;

//Created by 21343032_Muhammad Rizky Sandyra

public class Tugas2SwitchCaseJS6 {
    public static void main (String[] args){
        int angka;
        
        Scanner angkaMasuk = new Scanner(System.in);
        System.out.print("Masukkan Satu Angka (1-10) : ");
        angka = angkaMasuk.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid Number");
        }
        
    }
}
