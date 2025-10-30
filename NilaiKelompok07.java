import java.util.Scanner;

public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1, nilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;
        
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            
            double rataNilai = totalNilai / 5.0;
            System.out.println("Rata-rata nilai kelompok " + i + ": " + rataNilai);
            System.out.println();
            
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            
            i++;
        }
        
        System.out.println("Kelompok dengan Nilai Rata-rata tertinggi: Kelompok " + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
    }
}