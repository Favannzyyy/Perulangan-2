import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args) {
        Scanner cihuy = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = cihuy.nextInt();
        int i = 1;  
        while(i <= n) {
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();  
            i++;
        }
    }
}



