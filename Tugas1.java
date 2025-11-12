import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        double total = 0;

        for (int i = 0; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            total += nilai[i];
        }

        double rataRata = total / n;

        System.out.println("\n--- Hasil Pengolahan Nilai ---");
        System.out.printf("Rata-rata nilai   : %.2f\n", rataRata);
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);

        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }

        sc.close();
    }
}
