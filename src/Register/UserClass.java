/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

/**
 *
 * @author khusn
 */
public class UserClass {
    private String name;
    private String gender;
    private int umur;
    
    public UserClass(String name, String gender, int umur) {
        this.name = name;
        this.gender = gender;
        this.umur = umur;
    }
    
    public void setName() {
        System.out.println("Nama Anda adalah : " + this.name);
    }
    
    public void setGender() {
        if("L".equals(this.gender)) {
            System.out.println("Gender : Laki-Laki");
        } else if("P".equals(this.gender)) {
            System.out.println("Gender : Perempuan");
        } else {
            System.out.println("Gender : Lain");
        }
    }
    
    public void setUmur() {
        System.out.println("Umur anda : " + this.umur);
    }
    
    public void setKonfirmation() {
        System.out.println("Berhasil register");
    }
}
