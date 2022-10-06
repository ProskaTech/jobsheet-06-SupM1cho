/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Created by 21343032_Muhammad Rizky Sandyra

public class Tugas1BufferedReaderJS06 {
    public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
       
       String a, b, c;
       float nilai1, nilai2, nilai3, rata;
       
       try {
           System.out.print("Masukkan nilai ujian 1 : ");
           a = dataIn.readLine();
           nilai1 = Float.parseFloat(a);
           System.out.print("Masukkan nilai ujian 2 : ");
           b = dataIn.readLine();
           nilai2 = Float.parseFloat(b);
           System.out.print("Masukkan nilai ujian 3 : ");
           c = dataIn.readLine();
           nilai3 = Float.parseFloat(c);
           
           rata = (nilai1 + nilai2 + nilai3)/3;
           
           if((rata >= 60) && (rata <= 100)){
               System.out.println("Rata-rata nilai : " + rata + " :-)");
           }
           else {
               System.out.println("Rata-rata nilai : " + rata + " :-(");
           }
       }
       
       catch (IOException e) {
           System.out.println("gagal membaca keyboard");
       }
    }
}
