package Jobsheet14;

public class BinaryTreeMain23 {
    public static void main(String[] args) {
       
         BinaryTree23 bst = new BinaryTree23();

        bst.add(new Mahasiswa23("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa23("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa23("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa23("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa23("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa23("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa23("244160170", "Fizi", "B", 3.46));        
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        // 1. Tambah data dengan addRekursif
        System.out.println("\nTambah data menggunakan addRekursif():");
        bst.addRekursif(new Mahasiswa23("244160300", "Arya", "C", 3.90));
        bst.addRekursif(new Mahasiswa23("244160301", "Hani", "A", 3.10));

        System.out.println("\nInOrder Traversal setelah addRekursif:");
        bst.traverseInOrder(bst.root);

        // 2. Tampilkan mahasiswa dengan IPK terkecil
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();

        // 3. Tampilkan mahasiswa dengan IPK terbesar
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();

        // 4. Tampilkan mahasiswa dengan IPK di atas 3.50
        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}
