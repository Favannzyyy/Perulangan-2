import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner cihuy = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = cihuy.nextInt();

        for(int i=1; i<=n; i--){
        System.out.print("*");
}
        cihuy.close();
    }
}