public class RekapPenjualanCafe19 {

    static String[] menu = {
        "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"
    };

    static int[][] penjualan = new int[5][7];

    public static void inputData() {
        int[][] data = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5,  9,  20, 25, 10, 5,  45},
            {50, 8,  17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                penjualan[i][j] = data[i][j];
            }
        }
    }
    public static void tampilData() {
        System.out.println("=== Rekap Penjualan 7 Hari ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) System.out.printf("H%d  ", h);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-4d", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    public static void penjualanTertinggi() {
        int maxTotal = -1;
        String maxMenu = "";

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += penjualan[i][j];
            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menu[i];
            }
        }
        System.out.println(
            "Menu penjualan tertinggi: " + maxMenu + " (Total: " + maxTotal + ")"
        );
    }
    public static void rataRata() {
        System.out.println("=== Rata-rata Penjualan ===");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += penjualan[i][j];
            double rata = total / 7.0;

            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilData();
        penjualanTertinggi();
        rataRata();
    }
}
    

