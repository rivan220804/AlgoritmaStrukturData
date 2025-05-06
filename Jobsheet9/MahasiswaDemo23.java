package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String NIM = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, NIM, kelas);
                    stack.push(mhs);
                    System.out.printf(" Tugas %s berhasil dikumpulkan\n", mhs.NIM);
                    break;
                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.NIM);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n",dinilai.nama, nilai);
                        String biner = stack.KonversiDesimalKeBiner(nilai);
                        System.out.println("Nilai dalam biner: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.NIM);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua Tugas: ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4); {
            
        }
    }
}
