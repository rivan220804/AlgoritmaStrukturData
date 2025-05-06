package TugasTambahan;

import java.util.Scanner;

public class SepatuMain23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sepatu23[] daftarSepatu = {
            new Sepatu23("Nike", 42, 1500000),
            new Sepatu23("Adidas", 40, 1200000),
            new Sepatu23("Puma", 41, 1100000),
            new Sepatu23("Reebok", 43, 1000000),
            new Sepatu23("New Balance", 39, 1300000)
        };

        byte pilihan;

        SepatuData23 dataSepatu = new SepatuData23();

        do {
            System.out.println("=== MENU ====");
            System.out.println("1. Tampilkan Data Sepatu");
            System.out.println("2. Urutkan Harga Sepatu ");
            System.out.println("3. Cari Data Sepatu Berdasarkan Merk");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextByte();
            switch (pilihan) {
                case 1:
                System.out.println("\n--- Data Sepatu ---");
                    for (Sepatu23 sepatu : daftarSepatu) {
                        sepatu.tampilSepatu();
                        System.out.println();
                    }
                    break;

                case 2:
                dataSepatu.bubbleSortHarga(daftarSepatu);
                System.out.println("\n--- Daftar Sepatu Setelah Diurutkan (Harga Termurah) ---");
                dataSepatu.tampilkanDaftar(daftarSepatu);
                    break;

                case 3:
                System.out.print("Masukkan merk sepatu yang ingin dicari: ");
                sc.nextLine();
                String cariMerk = sc.nextLine();
                int posisi = dataSepatu.sequentialSearch(daftarSepatu, cariMerk);
                
                if (posisi != -1) {
                    System.out.println("Sepatu ditemukan:");
                    daftarSepatu[posisi].tampilSepatu();
                } else {
                    System.out.println("Sepatu dengan merk \"" + cariMerk + "\" tidak ditemukan.");
                }
                    break;

                case 0:
                System.out.println("Program selesai.");
                    break;
            
                default:
                System.out.println("Menu tidak valid! Silahkan input ulang.");
                    break;
            }
        } while(pilihan != 0);

    }
}
