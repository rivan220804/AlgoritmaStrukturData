package Jobsheet6;

public class DataDosen23 {
    Dosen23 [] listDsn = new Dosen23[10];
    int idx;

    void tambah(Dosen23 m) {
        if (idx<listDsn.length) {
            listDsn[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah  penuh");
        }
    }
    void tampil () {
        for (Dosen23 m:listDsn) {
            m.tampilkanInformasi();
            System.out.println("------------------------------");
        }
    }
}
