
package functionpiechan2;

import java.util.Scanner;


public class FunctionPieChan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z,hasil;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai X ");
        x = input.nextInt();
        System.out.println("Masukkan nilai Y ");
        y = input.nextInt();
        System.out.println("Masukkan nilai Z ");
        z = input.nextInt();
        hasil = output(x,y,z);
        System.out.println(hasil);
    }
    public static int output (int x,int y,int z){
        int proses;
        proses = (int) (x + Math.pow(y, z));
        return proses;
    } 
}
