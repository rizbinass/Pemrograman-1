package input.tugas;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = input.nextInt();

        int x = f * 2 + 3 - 7;

        System.out.println("Nilai x = " + x);

        if (x < 10) {
            System.out.println("x nilainya kurang dari 10");
        } else {
            System.out.println("x nilainya lebih dari 10");
        }
    }
}
