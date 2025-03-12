class DataDosen23 {

    public static void dataSemuaDosen23(Dosen23[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen23 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }
    public static void jumlahDosenPerJenisKelamin23(Dosen23[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin23(Dosen23[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rerataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rerataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\nRata-rata usia dosen Pria: " + rerataPria);
        System.out.println("Rata-rata usia dosen Wanita: " + rerataWanita);
    }
    public static void infoDosenPalingTua23(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen23 tertua = arrayOfDosen[0];
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo();
    }
    public static void infoDosenPalingMuda23(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen23 termuda = arrayOfDosen[0];
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo();
    }
}
