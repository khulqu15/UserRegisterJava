/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class Register {
    public static void main(String[] args) {
        String nama, gender;
        int umur;
        
        Scanner input = new Scanner(System.in);
        System.out.println("### Pendaftaran User Aplikasi SMK ###");
        System.out.println("Nama User");
        nama = input.nextLine();
        System.out.println("Gender User (L / P)");
        gender = input.nextLine();
        System.out.println("Umur (Bilangan)");
        umur = input.nextInt();
        
        UserClass user = new UserClass(nama, gender, umur);
        user.setName();
        user.setGender();
        user.setUmur();
        user.setKonfirmation();
    }
}
