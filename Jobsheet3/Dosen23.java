public class Dosen23 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = Pria, false = Wanita
    int usia;

    public Dosen23(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dosen
    public void cetakInfo() {
        String jk = (jenisKelamin) ? "Pria" : "Wanita";
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia       : " + usia);
        System.out.println("----------------------------");
    }
}
