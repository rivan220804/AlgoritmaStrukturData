package Jobsheet2;
import java.util.Scanner;
public class MataKuliahMain23 {
        public static void main(String[] args) {
            
            Matakuliah23 mk1 = new Matakuliah23();
            mk1.tampilkanInformasi();
            mk1.ubahSKS(3);
            mk1.tambahJam(4);
            mk1.kurangiJam(2);
            System.out.println();
    
            Matakuliah23 mk2 = new Matakuliah23("R4YV3N", "ALGORITMA STRUKTUR DATA", 4, 6);
            mk2.tampilkanInformasi();
            mk2.ubahSKS(5);
            mk2.tambahJam(3);
            mk2.kurangiJam(4);
        }
    }
    