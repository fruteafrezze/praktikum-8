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
public class nomorT1 {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in =new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        int n,loop, pilihan;// memesan tempat di memori yang bernama n, loop, pilihan dengan tipe data integer
        double jumlahSeri=0, jumlahPararel=0, pararelTotal, input;// memesan tempat di memori yang bernama jumlahSeri, jumlahPararel, pararelTotal, input dengan tipe data double
        System.out.println("program perhitungan resistor"); // mencetak tulisan "program perhitungan resistor"
        System.out.print("masukan resitor n : ");// mencetak tulisan "masukan resistor n: "
        n=in.nextInt();// membaca input data lalu disimpan ke variable n
        for (loop=1;loop<=n;loop++){ // untuk selama isi variable loop kurang dari isi variable n maka isi variable loop akan di tambah dengan 1, dan kondisi awal variable loop berisi 1
            System.out.print("masukan data ke "+loop+" : ");// mencetak tulisan "masukan data ke "disambung isi variable loop lalu disambung tulisan" : "
            input=in.nextDouble();// membaca input data dari keyboard lalu disimpan ke variable input
            jumlahSeri=jumlahSeri+input;//menyimpan hasil dari isi variable jumlahSeri ditambah isi variable input lalu disimpan ke variable jumlahSeri
            jumlahPararel=jumlahPararel+ 1/input;// menyimpan hasil dari isi variable jumlahPararel ditambah 1 dibagi isi variable input  lalu disimpan ke variable jumlahPararel
        }
        pararelTotal=1/jumlahPararel;// menyimpan hasil dari 1 dibagi jumlahPararel lalu disimpan ke variable parareltotal 
        System.out.print("""
                           pilih rangkaian resistor :
                           1. seri
                           2. pararel
                           """);/* mencetak tulisan "pilih rangkaian resistor :
                           1. seri
                           2. pararel"*/
        pilihan=in.nextInt();// membaca input data dari keyboard lalu disimpan ke variable pilihan
        if (pilihan==1) System.out.println("hasil rangkaian seri "+jumlahSeri); // jika isi variable pilihan sama dengan 1 maka akan mencetak tulisan "hasil rangkaian seri "disambung isi variable jumlahSeri
        else System.out.println("hasil rangkaian pararel "+pararelTotal); // selain itu, maka akan mencetak tulisan "hasil rangkaian pararel "disambunga dengan isi variable pararelTotal       
    }
}
