package Jobsheet7;

public class TugasDosen23 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    TugasDosen23 (String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
    
    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", JK: " + (jenisKelamin ? "Laki - laki" : "Perempuan") + ", Usia: " + usia);
    }
}
