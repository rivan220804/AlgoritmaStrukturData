import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah dosen
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Membuat array of object Dosen
        Dosen23[] arrayDosen = new Dosen23[jumlah];

        // Looping untuk mengisi array dosen
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));
            System.out.print("Kode Dosen: ");
            String kode = scanner.nextLine();
            System.out.print("Nama Dosen: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin (1=Pria, 0=Wanita): ");
            boolean jenisKelamin = scanner.nextInt() == 1;
            System.out.print("Usia Dosen: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            
            arrayDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan semua data dosen menggunakan foreach
        System.out.println("\nData Semua Dosen:");
        for (Dosen23 dosen : arrayDosen) {
            dosen.cetakInfo();
        }

        // Menggunakan class DataDosen23 untuk analisis data
        DataDosen23.dataSemuaDosen23(arrayDosen);
        DataDosen23.jumlahDosenPerJenisKelamin23(arrayDosen);
        DataDosen23.rerataUsiaDosenPerJenisKelamin23(arrayDosen);
        DataDosen23.infoDosenPalingTua23(arrayDosen);
        DataDosen23.infoDosenPalingMuda23(arrayDosen);

        scanner.close();
    }
}
