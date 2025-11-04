package tugas1.no1;

public class b {
    
    public static void main(String[] args) {
        int tugas = 80;
        int uts = 85;
        int uas = 90;

        double rataRata = (tugas + uts + uas) / 3.0;

        if(rataRata < 50){
            System.out.println("Nilai: E");
        }else if(rataRata < 60){
            System.out.println("Nilai: D");
        }else if(rataRata < 70){
            System.out.println("Nilai: C");
        }else if(rataRata < 80){
            System.out.println("Nilai: B");
        }else {
            System.out.println("Nilai: A");
        }
    }
}
