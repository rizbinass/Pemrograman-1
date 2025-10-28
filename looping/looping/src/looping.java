/**
 * @(#)looping.java
 *
 * looping application
 *
 * @author 
 * @version 1.00 2025/10/21
 */
 
public class looping {
    
    public static void main(String[] args) {
    	
    	int nilai = 1;
        int step = 7;

        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + nilai);
            
            // logika kenaikan dinamis
            nilai += step;
            if (i >= 1) { // setelah 2 loop pertama, step mulai naik
                step += 2;
            }
        }

    }
}
