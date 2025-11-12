import java.util.Scanner;
public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilai = sc.nextInt();

        int[] arrNilai = new int[nilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int jumlahDitemukan = 0;
        System.out.println("\nHasil pencarian:");

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                jumlahDitemukan++;
            }
        }

        if (jumlahDitemukan == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        sc.close();
    }
}
