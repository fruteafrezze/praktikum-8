/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum15november2023for;

import java.util.Scanner;// Mengimport kelas scanner pada java agar dapat membaca data yang dimasukan lewat keyboard

/**
 *
 * @author FILIPUS FERRY
 */
public class nomorT3 {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in = new Scanner(System.in);// membuat objek yang bernama in dengan class scanner
        
        int suku1=1,suku2=1, n, loop;// memesan tempat di memori bernama suku1, suku2, n, loop dengan tipe data int
        System.out.println("deret fibonancci");// mencetak tulisan "deret fibonancci"
        System.out.print("masukkan ke-n : ");// mencetak tulisan "masukkan ke-n : "
        n=in.nextInt();// membaca input data dari keyboard lalu disimpan ke variable n
        for (loop=0;loop<=n;loop++ ){// selama kondisi awal variable loop diisi nilai 0, batas atas isi variable loop kurang sama dengan isi variable n, maka akan isi variable loop akan ditambah 1 disetiap perulangan hingga batas atas terlampaui
            System.out.print(suku1+", "+suku2+", ");// mencetak isi variable suku1 disambung", "disambung isi variable suku2 ", "
        suku1 += suku2;//menyimpan hasil dari isi variable suku1 ditambah isi variable suku2
        suku2 += suku1;//menyimpan hasil dari isi variable suku2 ditambah isi variable suku1
        }
    }
}
