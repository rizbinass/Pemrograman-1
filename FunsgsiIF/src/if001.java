/**
 * @(#)if001.java
 *
 *
 * @author 
 * @version 1.00 2025/10/14
 */


public class if001 {

    public if001() {
    }
    public static void main(String[] args){
    	int a,b,c;
    	a=1;
    	b=2;
    	c=a+b;
    	if(c == 5){
    		System.out.println("nilai "+c+" sama dengan lima");
    	}
    	else if(c<5){
    		System.out.println("nilai "+c+" kurang dari lima");
    	}else{
    		System.out.println("nilai "+c+" lebih dari lima");
    	}
    
}}