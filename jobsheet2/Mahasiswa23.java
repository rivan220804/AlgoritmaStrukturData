package Jobsheet2;
import java.util.Scanner;
public class Mahasiswa23 {
        String nama;
        String nim;
        String kelas;
        double ipk;
    
        void tampilkanInformasi() {
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("IPK : " + ipk);
            System.out.println("Kelas : " + kelas);
            System.out.println("Penilaian: " + nilaiKinerja(ipk)); // Tambahkan ini untuk menampilkan nilai kinerja
            System.out.println();
        }
    
        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }
    
        void updateIpk(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            }
        }
    
        String nilaiKinerja(double ipk) {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }
        public Mahasiswa23() {
        }
        public Mahasiswa23(String nm, String nim, double ipk, String kls) {
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }
    }
    
