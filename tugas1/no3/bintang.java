package tugas1.no3;

public class bintang {
    public static void main(String[] args) {
        
        // Loop pertama
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (i - 0); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        // Loop kedua
        for (int k = 4; k >= 0; k--) {
            for (int l = 1; l <= (k - 0); l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
