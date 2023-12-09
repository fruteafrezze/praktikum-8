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
public class nomorT2 {//deklarasi class
    public static void main(String[] args) {//deklarasi main
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        int n;// memesan tempat dimemori bernama n dengan tipedata integer
        double bilangan, kuadrat=0, akar=0, per1=0;// memesan tempat dimemori bernama bilangan, kuadrat, akar, per1 dengan tipe data double
        System.out.println("progam perhitungan perulangan");// mencetak tulisan "program perhitungan perulangan"
        System.out.print("masukan nilai n : ");//mencetal tulisan "masukkan nilai n : "
        n=in.nextInt();// membaca input data dari keyboard lalu disimpan ke variable n
        for (int loop = 1; loop <= n; loop++) {// selama kondisi awal variable loop diisi nilai 1, batas atas isi variable loop kurang sama dengan isi variable n, maka akan isi variable loop akan ditambah 1 disetiap perulangan hingga batas atas terlampaui
            System.out.println("masukan data ke "+loop+" : ");// mencetak tulisan "masukan data ke "disambung isi variable loop " : "
            bilangan=in.nextDouble();//membaca input data dari keyboard lalu disimpan ke variable bilangan
            kuadrat += Math.pow(bilangan, 2);//menyimpan hasil dari isi variable kuadrat ditambah isi variable bilangan pangkat 2 ke variable kuadrat
            akar += Math.sqrt(bilangan);// menyimpan hasil dari isi variable akar ditambah akar isi variable bilangan ke variable akar
            per1 += 1/bilangan;// menyimpan hasil dari isi variable per1 ditambah 1 dibagi isi variable bilangan ke variable per1
        }
        System.out.println("jumlah kuadrat : "+kuadrat);// mencetak tulisan di monitor "jumlah kuadrat : " disambung isi variable kuadrat
        System.out.println("jumlah akar : "+akar);// mencetak tulisan di monitor "jumlah akar : " disambung isi variable akar
        System.out.println("jumlah 1/data : "+per1);// mencetak tulisan di monitor "jumlah 1/data : " disambung isi variable per1
    }
}
