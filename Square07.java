import java.util.Scanner;

public class Square07 {
    public static void main(String[] args) {
        Scanner cihuy = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = cihuy.nextInt();

        for(int iOuter=0; iOuter<=n; iOuter++) {
            for(int i=1; i<=n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}