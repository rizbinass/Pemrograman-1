package input;

import java.util.Scanner;

public class input01 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program Penjumlahan Dua Bilangan");
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        int hasil = bil1 * bil2;
        System.out.println("Hasil penjumlahan: " + hasil);
        input.close();
        
    }
}
