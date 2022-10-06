/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js06;

import javax.swing.JOptionPane;

//Created by 21343032_Muhammad Rizky Sandyra

public class Tugas1JOptionPaneJS06 {
    public static void main(String[] args) {
        String a = "", b = "", c = "";
        float nilai1, nilai2, nilai3, rata;
        
        a = JOptionPane.showInputDialog("Masukkan nilai ujian 1: ");
        nilai1 = Float.parseFloat(a);
        b = JOptionPane.showInputDialog("Masukkan nilai ujian 2: ");
        nilai2 = Float.parseFloat(b);
        c = JOptionPane.showInputDialog("Masukkan nilai ujian 3: ");
        nilai3 = Float.parseFloat(c);
        
        rata = (nilai1 + nilai2 + nilai3)/3;
        
        if((rata >= 60) && (rata <= 100)){
            String msg = "Rata-rata nilai : "+ rata +" :-)";
            
            JOptionPane.showMessageDialog(null, msg);
        
            System.out.println("Rata-rata nilai : "+ rata +" :-)");
        }
        else {
            String msg = "Rata-rata nilai : "+ rata +" :-(";
            
            JOptionPane.showMessageDialog(null, msg);
        
            System.out.println("Rata-rata nilai : "+ rata +" :-(");
        }
    }
}