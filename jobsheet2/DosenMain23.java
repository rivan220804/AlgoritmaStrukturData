package Jobsheet2;
import java.util.Scanner;
public class DosenMain23 {
    public static void main(String[] args) {

        Dosen23 dosen1 = new Dosen23();
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Dasar Pemrogaman");
        
        Dosen23 dosen2 = new Dosen23("IMM", "IMAM FAHRUR ROZI S.Kom, M.Kom", true, 2005, "Algoritma dan Struktur Data");
        
        System.out.println("Informasi Dosen 1:");
        dosen1.tampilkanInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun\n");
        
        System.out.println("Informasi Dosen 2:");
        dosen2.tampilkanInformasi();
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
