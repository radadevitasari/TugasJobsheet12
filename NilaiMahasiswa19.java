import java.util.Scanner;

public class NilaiMahasiswa19 {

    static void isianArray(int[] nilai, Scanner input) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();
        int[] nilai = new int[N];

        isianArray(nilai, input);
        tampilArray(nilai);
        int totalNilai = hitTot(nilai);

        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);

        input.close();
    }
}
    
