package Jobsheet5;

import java.util.Scanner;

import Jobsheet5.BruteForceDivideConquer.Faktorial;


public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " +nilai+
          " menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+
          " menggunakan DC: "+ fk.faktorialDC(nilai));

    }
}
