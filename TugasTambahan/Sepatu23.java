package TugasTambahan;

public class Sepatu23 {
    String merk;
    int ukuran;
    int harga;

    public Sepatu23(String merk, int ukuran, int harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public void tampilSepatu() {
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga : " + harga);
    }
}
