package Jobsheet7;

public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa23() {
    }
    
    Mahasiswa23(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);
        System.out.println("----------------------------------------------");
    }
}
