import java.util.Scanner;
public class Matakuliah23 {

    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jam < jumlahJam) 
        jumlahJam -= jam;
    }
    
   
}