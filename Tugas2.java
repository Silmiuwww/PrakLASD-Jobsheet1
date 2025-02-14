import java.util.Scanner;
public class Tugas2 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("==== MENU PERHITUNGAN KUBUS ====");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            
            pilihan = input.nextInt();
            
            if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = input.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (true); 

    }

    public static void main(String[] args) {
        tampilkanMenu();
    }
}

