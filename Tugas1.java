import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Kota: " + KOTA[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}

