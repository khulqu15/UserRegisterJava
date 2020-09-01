/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaportSiswa;

import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class FormRaport {
    public static void main(String[] args) {
        String nisn, nama, gender;
        int umur;
        String nik, kelas, jurusan;
        double tugas1, tugas2, tugas3;
        double UAS, UTS;
        double hasil;
        
        RaportSiswa eraport = new RaportSiswa();
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Masukkan nisn : ");
        nisn = SC.nextLine();
        System.out.println("Masukkan nama : ");
        nama = SC.nextLine();
        System.out.println("Masukkan gender : ");
        gender = SC.nextLine();
        System.out.println("Masukkan umur : ");
        umur = SC.nextInt();
        System.out.println("Masukkan nik : ");
        nik = SC.nextLine();
        System.out.println("Masukkan kelas : ");
        kelas = SC.nextLine();
        System.out.println("Masukkan jurusan : ");
        jurusan = SC.nextLine();
        
        System.out.println("Masukkan nilai tugas PWB");
        tugas1 = SC.nextDouble();
        System.out.println("Masukkan nilai tugas PBO");
        tugas2 = SC.nextDouble();
        System.out.println("Masukkan nilai tugas Basis data");
        tugas3 = SC.nextDouble();
        System.out.println("Masukkan nilai UTS");
        UTS = SC.nextDouble();
        System.out.println("Masukkan nilai UAS");
        UAS = SC.nextDouble();

        eraport.identitas(nisn, nama, gender, umur);
        eraport.dataSiswa(nik, nama, kelas, jurusan);
        eraport.nilaiSiswa(tugas1, tugas2, tugas3, UTS, UAS);
    }
}
