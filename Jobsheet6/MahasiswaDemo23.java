package Jobsheet6;

import java.lang.classfile.instruction.StoreInstruction;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        Mahasiswa23 m1 = new Mahasiswa23("123", "Zidan", "2A", 3.2);
        Mahasiswa23 m2 = new Mahasiswa23("124", "Ayu","2A", 3.5);
        Mahasiswa23 m3 = new Mahasiswa23("125", "Sofi","2A", 3.1);
        Mahasiswa23 m4 = new Mahasiswa23("126", "Sita", "2A", 3.9);
        Mahasiswa23 m5 = new Mahasiswa23("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubleSort();
        list.tampil();

        System.out.println("Data yang sudah teruurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();


    }
}
