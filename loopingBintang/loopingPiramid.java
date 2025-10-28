package loopingBintang;
public class loopingPiramid {
    public static void main(String[] args) {
        // tinggi segitiga
        int tinggi = 10;    

        for(int i = 0; i <= tinggi; i++){
            for(int s = tinggi - i; s > 0; s--){
                System.out.print(" ");
            }
            for(int b = 0; b < (2 * i) - 1; b++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }

    }
}
