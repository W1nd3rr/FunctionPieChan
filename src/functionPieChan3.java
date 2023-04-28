
package functionpiechan2;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class functionPieChan3 {
    public static void main(String[] args) {
int n;
    ;
   
    Scanner scan = new Scanner(System.in);
    
        System.out.print("masukkan n = ");
        n = scan.nextInt();
        perulangan(n);
    }  
    public static void perulangan(int n){
        int j = 0,i,hasil;
        for (i = 1; i <= n; i++){
            
            hasil = i + j;
            System.out.println(hasil);
            j = j+1;   
    }
}
}
