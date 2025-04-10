package Jobsheet6;

public class Mahasiswa23 {
    
    String nama, nim, kelas;
    double ipk;

    Mahasiswa23() {

    }
    Mahasiswa23(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("IPK: "+ ipk);
    }


}
