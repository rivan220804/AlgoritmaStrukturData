package Jobsheet14;

public class BinaryTreeArrayMain23 {
    public static void main(String[] args) {
        BinaryTreeArray23 bta = new BinaryTreeArray23();
        
        Mahasiswa23 mhs1 = new Mahasiswa23("1001", "Ali", "A", 3.57);
        Mahasiswa23 mhs2 = new Mahasiswa23("1002", "Candra", "C", 3.41);
        Mahasiswa23 mhs3 = new Mahasiswa23("1003", "Badar", "B", 3.75);
        Mahasiswa23 mhs4 = new Mahasiswa23("1004", "Dewi", "B", 3.35);

        Mahasiswa23 mhs5 = new Mahasiswa23("1005", "Devi", "A", 3.48);
        Mahasiswa23 mhs6 = new Mahasiswa23("1006", "Ehsan", "D", 3.61);
        Mahasiswa23 mhs7 = new Mahasiswa23("1007", "Fizi", "B", 3.86);

        Mahasiswa23[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7};
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder traversal: ");
        bta.traverseInOrder(0);
    }
}
