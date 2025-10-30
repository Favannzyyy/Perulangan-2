import java.util.Scanner;

public class JumlahKuadratTugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        int totalKuadrat = 0;
        
        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            
            for (int j = 1; j <= i; j++) {
                kuadrat += i;
            }
            
            totalKuadrat += kuadrat;
            
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k * k);
                if (k < i) {
                    System.out.print(" + ");
                }
            }
            
            System.out.println(" = " + totalKuadrat);
        }
    }
}
