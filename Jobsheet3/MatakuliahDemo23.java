import java.util.Scanner;
public class MatakuliahDemo23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();
        sc.nextLine();

        Matakuliah23 arraayOfMatakuliah[] = new Matakuliah23[matkul];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            arraayOfMatakuliah[i] = new Matakuliah23("", "", 0, 0);
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            arraayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("------------------------------");
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arraayOfMatakuliah[i].tampilkanInformasi();
            System.out.println("------------------------------");
        }
}
}