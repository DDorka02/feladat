
package feladat;

import java.util.Scanner;

public class Feladat2 {

    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
//        System.out.println("Kérek egy számot: ");
//        int n=sc.nextInt();
        for (int i =3 ;i> -3; i--){
            System.out.printf("|%2d| = %d\n",i,Math.abs(i));}

        System.out.println("");
        
        final int M = 10;
        int [] n = new int [M];
        for (int i = 0; i < M; i++) {
            int paratlan = (int) ((Math.random()*45)*2+11);
            n[i] = paratlan;
        }
        
    }
    
}
