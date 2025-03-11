package Quiz;

public class Kendaraan23 {
        
        String nomorPlat;
        double jarakTempuh;
        double konsumsiBahanBakar;
         
        double efisiensiBBM;

        
        public void tampilkanInformasi() {
            System.out.println("Nomor Plat          : " + nomorPlat);
            System.out.println("Jarak Tempuh        : " + jarakTempuh);
            System.out.println("Konsumsi Bahan Bakar: " + konsumsiBahanBakar);
        }
        public void ubahPlatNomor (String platNomorBaru) {
            nomorPlat = platNomorBaru;
        }
        public void konsumsiBahanBakar(double konsumsi) {
            konsumsiBahanBakar += konsumsi;

        }
        public void tambahjarakTempuh (double jarak ) {
            jarakTempuh += jarak;

        }
        public void hitungPresentase() {
            if (jarakTempuh != 0) {
                efisiensiBBM = jarakTempuh / konsumsiBahanBakar;
                System.out.println("Efisiensi BBM: " + efisiensiBBM + " km/l");
            } else {
                System.out.println("Jarak tempuh tidak boleh nol.");
            }
        }
        public Kendaraan23 () {}

    


    
}
