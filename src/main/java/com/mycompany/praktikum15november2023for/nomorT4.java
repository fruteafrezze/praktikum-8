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
public class nomorT4 {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        double d, x1, x2, x, y;// memesan tempat dimemori dengan nama d, x1, x2, x, y dengan tipe data double
        int a, b, c;// memesan tempat dimemori dengan nama a, b, c dengan tipe data integer
        
        System.out.println("program perhitungan y = ax^2 + bx + c");// mencetak tulisan "program perhitungan y=ax^2+bx+c "
        System.out.print("masukan a : ");// mencetak tulisan "masukan a : "
        a=in.nextInt();// membaca input data lalu disimpan ke variable a
        System.out.print("masukan b : ");// mencetak tulisan "masukan b : "
        b=in.nextInt();// membaca input data lalu disimpan ke variable b
        System.out.print("masukan c : ");// mencetak tulisan "masukan c : "
        c=in.nextInt();// membaca input data lalu disimpan ke variable c
        
        d = Math.pow(b, 2)-4*a*c;// menyimpan hasil dari isi variable b pangkat 2 dikurangi 4 dikali isi variable a dikali isi variable c ke variable d
        System.out.println("dari persamaan y = "+a+"x^2 + "+b+"x + "+c);// mencetak tulisan "dari persamaan y = "disambung isi variable a disambung"x^2 + "disambung isi variable b"x + "disambung isi variable c
        x1 = (-b + Math.sqrt(d))/2*a;// menyimpan hasil dari minus isi variable b ditambah akar isi variable d dibagi 2 dikali isi variable a ke variable x1
        x2 = (-b - Math.sqrt(d))/2*a;// menyimpan hasil dari minus isi variable b dikurangi akar isi variable d dibagi 2 dikali isi variable a ke variable x2
        System.out.println("akar-akarnya adalah "+x1+" dan "+x2);//mencetak tulisan "akar-akarnya adalah "disambung isi variable x1" dan " disambung isi variable x2 
        System.out.println("nilai y untuk beberapa x antara akar pertama dan kedua  adalah");//mencetak tulisan "nilai y untuk beberapa x antara akar pertama dan kedua adalah"
        System.out.println("---------------------------------");// mencetak tulisan dimonitor "------"
        System.out.println("x               y = "+a+"x^2 + "+b+"x + "+c);//mencetak tulisan "x      dari persamaan y = "disambung isi variable a disambung"x^2 + "disambung isi variable b"x + "disambung isi variable c
        System.out.println("---------------------------------");// mencetak tulisan dimonitor "------"
        
        if (x1>x2) {// jika isi variable x1 lebih besar dari isi variable x2 maka,
            for (x = x2; x <= x1; x+= 0.25) {// selama kondisi awal variable x diisi isi variable x2, batas atas isi variable x kurang sama dengan isi variable x1, maka akan isi variable x akan ditambah 0.25 disetiap perulangan hingga batas atas terlampaui
                y = a*Math.pow(x, 2)+b*x+c;// menyimpan hasil dari isi variable a dikali isi variable x pangkat 2 ditambah isi variable b dikali isi variable x ditambah isi variable c
                System.out.println(x+"              "+y);// mencetak isi variable x disambung"      "disambung isi variable y
            } System.out.println("---------------------------------");// mencetak tulisan dimonitor "------"
        } else if (x2>x1) {// selain itu jikaisi variable x1 lebih besar dari isi variable x2 maka,
            for (x = x1; x <= x2; x+= 0.25) {// selama kondisi awal variable x diisi isi variable x1, batas atas isi variable x kurang sama dengan isi variable x2, maka akan isi variable x akan ditambah 0.25 disetiap perulangan hingga batas atas terlampaui
                y = a*Math.pow(x, 2)+b*x+c;// menyimpan hasil dari isi variable a dikali isi variable x pangkat 2 ditambah isi variable b dikali isi variable x ditambah isi variable c
                System.out.println(x+"              "+y);// mencetak isi variable x disambung"      "disambung isi variable y
            } System.out.println("---------------------------------");// mencetak tulisan dimonitor "------"
        } else System.out.println("persamaan tidak memiliki akar real");// selain itu, maka akan mencetak tulisan "persamaan tidak memiliki akar real"
    }
}
