package UTS;

public class no2 {
    public static void main(String[] args) {
        int tugas = 85;
        int absen = 90;
        int uts = 78;
        int uas = 88;
        double Rata = (tugas + absen + uts + uas) / 4.0;

        if(Rata < 50){
        System.out.println("Nilai E");
        }else if(Rata < 60){
        System.out.println("Nilai D");
        }else if(Rata < 70){
        System.out.println("Nilai C");
        }else if(Rata < 80){
        System.out.println("Nilai B");
        }else if(Rata < 90){
        System.out.println("Nilai A");
        }else{
        System.out.println("Nilai A+");
        }
    }
}
