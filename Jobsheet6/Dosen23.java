package Jobsheet6;

public class Dosen23 {
    int usia;
    String nama, kode;
    boolean jenisKelamin;

    Dosen23() {

    }
    Dosen23(String kd, String name, Boolean jk, int age) {
        usia = age;
        nama = name;
        jenisKelamin = jk;
        kode = kd;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: "+ nama);
        System.out.println("Usia: "+ usia);
        System.out.println("Jenis Kelamin: "+ jenisKelamin);
        System.out.println("Kode: "+ kode);
    }
}
