/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kondisi_Siswa;

import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class KondisiSiswa {
    float tinggiBadan;
    float beratBadan;
    
    public KondisiSiswa(float tinggi, float berat) {
        tinggiBadan = tinggi;
        beratBadan = berat;
        float cmToM = tinggiBadan / 100;
        float tinggiTinggi = (cmToM*cmToM);
        float hasil = beratBadan / tinggiTinggi;
        System.out.println(hasil);
        if(hasil < 19) {
            System.out.println("Anda Kurus");
        } else if(hasil >= 19 && hasil <= 24.9) {
            System.out.println("Anda Ideal");
        } else if(hasil >= 25 && hasil <= 29.9) {
            System.out.println("Anda Gemuk");
        } else {
            System.out.println("Anda Obesitas");
        }
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float tinggiBadan;
        float beratBadan;
        System.out.println("Masukkan tinggi badan (CM)");
        tinggiBadan = Sc.nextFloat();
        System.out.println("Masukkan berat badan (Kg)");
        beratBadan = Sc.nextFloat();
        KondisiSiswa condition = new KondisiSiswa(tinggiBadan, beratBadan);
    }
}
