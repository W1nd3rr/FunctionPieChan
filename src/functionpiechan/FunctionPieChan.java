
package functionpiechan;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class FunctionPieChan {


    public static  void perulangan (int a,int b ,int c){
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println();
        } 
        else if ((a > b && b > c) || (a < b && b < c)) {
            System.out.println( b);
        }
        else if ((a > c && b < c) || (a < c && b > c)) {
            System.out.println( c);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c,hasil;
        System.out.println("Masukkan angka pertama");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua");
        b = input.nextInt();
        System.out.println("Masukkan angka ketiga");
        c = input.nextInt();
        perulangan (a,b,c);
    }
    
}
