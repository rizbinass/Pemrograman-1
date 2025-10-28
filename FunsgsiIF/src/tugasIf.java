/**
 * @(#)tugasIf.java
 *
 *
 * @author 
 * @version 1.00 2025/10/14
 */


public class tugasIf {

    public tugasIf() {
    }
   	public static void main (String[] args) {
   		int nilai,tugas,uts,uas;
   		tugas=80;
   		uts=84;
   		uas=86;
   		nilai=(tugas+uts+uas)/3;
   		
   		if(nilai > 90){
   			System.out.println("A");
   		}else if(nilai > 70){
   			System.out.println("B");
   		}else if(nilai > 60){
   			System.out.println("C");
   		}else if(nilai > 50){
   			System.out.println("D");
   		}else{
   			System.out.println("E");
   		}
   		
   		
	   }
}