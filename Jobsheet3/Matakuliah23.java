
public class Matakuliah23 {
    
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah23() {

    }
    public Matakuliah23(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    public Matakuliah23(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    public void tampilkanInformasi() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
        System.out.println("------------------------------");
    }
}
