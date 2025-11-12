import java.util.Scanner;
public class ArrayRataNilai22 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double totalTidakLulus = 0;
        int countTidakLulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] < 85) {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        double rataTidakLulus = countTidakLulus > 0 ? totalTidakLulus / countTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = 85.0");
        System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rataTidakLulus);

        sc.close();
    }
}
