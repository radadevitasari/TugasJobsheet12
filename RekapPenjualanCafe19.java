import java.util.*;
public class RekapPenjualanCafe19 {

    static String[] menu;
    static int[][] penjualan;

    public static void inputData(Scanner sc) {
        System.out.print("Jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Jumlah hari: ");
        int jmlHari = sc.nextInt();
        sc.nextLine(); 

        menu = new String[jmlMenu];
        penjualan = new int[jmlMenu][jmlHari];

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Penjualan " + menu[i] + " hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }
    public static void tampilData() {
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.printf("%-15s", "Menu");

        for (int h = 1; h <= penjualan[0].length; h++)
            System.out.printf("H%d  ", h);
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < penjualan[0].length; j++)
                System.out.printf("%-4d", penjualan[i][j]);
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int maxTotal = -1;
        String maxMenu = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++)
                total += penjualan[i][j];

            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + maxMenu +
                           " (Total: " + maxTotal + ")");
    }

    public static void rataRata() {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++)
                total += penjualan[i][j];

            double rata = total / (double) penjualan[i].length;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputData(sc);
        tampilData();
        penjualanTertinggi();
        rataRata();
    }
}