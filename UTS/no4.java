package UTS;

public class no4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            for(int s = 0; s < i; s++){
                System.out.print(" ");
            }

            for(int k = 8; k > (i*2); k--){
                System.out.print("*");
            }

            System.out.println();
        }
}
}
