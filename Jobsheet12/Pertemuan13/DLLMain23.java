package Jobsheet12.Pertemuan13;

import java.util.Scanner;

public class DLLMain23 {
    public static void main(String[] args) {
        DoubleLinkedLists23 list = new DoubleLinkedLists23();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. ");
            System.out.println("7. Cari Mahasiswa berdsarakan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 :
                    Mahasiswa23 mhs = inputMahasiswa23(scan);
                    list.addFirst(mhs);
                
                case 2 :
                    Mahasiswa23 mhs = inputMahasiswa23(scan);
                    list.addLast(mhs);
                
                default:
                    break;
            }
        }


        
    }
}
