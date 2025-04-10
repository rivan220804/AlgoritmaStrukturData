package Jobsheet5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum sm = new Sum(elemen);
        for(int i=0; i<elemen; i++) {
            System.out.println("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input.nextInt();
        }
        System.out.println("Total keuntungan BruteForce:"+sm.totalBF());
        System.out.println("Total keuntungan Divide and Conquer:"+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
