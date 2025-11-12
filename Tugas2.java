import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1) + ":");
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 
        }

        int totalBiaya = 0;
        for (int i = 0; i < jumlah; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("DAFTAR PESANAN DI KAFE");


        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-30s Rp %,d\n", namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("%-30s Rp %,d\n", "Total Biaya", totalBiaya);
        
        sc.close();
    }

}
