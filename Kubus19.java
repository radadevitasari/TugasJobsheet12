public class Kubus19 {

    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {

        int sisi = 5; 
        System.out.println("Volume kubus = " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus = " + hitungLuasPermukaan(sisi));
    }
}

