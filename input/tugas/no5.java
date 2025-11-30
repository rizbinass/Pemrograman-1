package input.tugas;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        double rata = (tugas + uts + uas) / 3;
        String nilai;

        if (rata < 50) {
            nilai = "E";
        } else if (rata < 60) {
            nilai = "D";
        } else if (rata < 70) {
            nilai = "C";
        } else if (rata < 80) {
            nilai = "B";
        } else {
            nilai = "A";
        }

        System.out.println("Rata-rata = " + rata);
        System.out.println("Nilai huruf = " + nilai);
    }
    }

