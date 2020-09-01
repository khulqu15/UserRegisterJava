/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaportSiswa;

/**
 *
 * @author khusn
 */
public class RaportSiswa extends Siswa {

    static void identitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private double hasil;
    
    void dataSiswa(String nik, String nama, String kelas, String jurusan) {
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Jurusan : " + jurusan);
    }
    
    void nilaiSiswa(double tugas1, double tugas2, 
            double tugas3, double UTS, double UAS) {
        hasil = ((tugas1 + tugas2 + tugas3)/3) * 0.4 + UTS * 0.3 + UAS * 0.3;
        System.out.println("Nilai Akhir : " + hasil);
    }
}
