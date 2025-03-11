import java.util.Scanner;
public class Matakuliah23 {
    
    String kodeMk;
    String nama; 
    int sks;
    int jumlahJam;

    public void tampilkanInformasi() {
        System.out.println("Kode MK    : " + kodeMk);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
        System.out.println();
    }
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    public void tambahJam(int jam) {
        jumlahJam += jam;
    }
    public void kurangiJam(int jam) {
        if (jam < jumlahJam) 
        jumlahJam -= jam;
    }
    public Matakuliah23() {
    }
    public Matakuliah23(String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
    
