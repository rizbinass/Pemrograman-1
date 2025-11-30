package input.tugas;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        double luas = Math.PI * r * r;

        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
