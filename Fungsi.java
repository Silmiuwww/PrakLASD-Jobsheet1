import java.util.Scanner;
public class Fungsi {
    static int[][] stock = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12}, 
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };

    static int[] harga = {75000, 50000, 60000, 10000}; 
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Menu RoyalGarden =====");
            System.out.println("1. Lihat Stok Bunga");
            System.out.println("2. Hitung Pendapatan Jika Semua Stok Terjual");
            System.out.println("3. Update Stok (Kejadian Tak Terduga)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    tampilkanStok();
                    break;
                case 2:
                    hitungPendapatan();
                    break;
                case 3:
                    kurangiStok();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    public static void tampilkanStok() {
        System.out.println("\n===== Stok Bunga di Setiap Cabang =====");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n", 
                "RoyalGarden " + (i + 1), stock[i][0], stock[i][1], stock[i][2], stock[i][3]);
        }
    }

    public static void hitungPendapatan() {
        System.out.println("\n===== Pendapatan Jika Semua Stok Terjual =====");
        int totalPendapatan = 0;
        for (int i = 0; i < stock.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatanCabang += stock[i][j] * harga[j];
            }
            totalPendapatan += pendapatanCabang;
            System.out.println("RoyalGarden " + (i + 1) + " : Rp " + pendapatanCabang);
        }
        System.out.println("Total Pendapatan Keseluruhan: Rp " + totalPendapatan);
    }

    public static void kurangiStok() {
        System.out.println("\n===== Kejadian Tak Terduga (Stok Berkurang) =====");
        int[] pengurangan = {-1, -2, 0, -5}; 
        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] += pengurangan[i];
        }
        System.out.println("Stok di RoyalGarden 4 telah diperbarui.");
        tampilkanStok();
    }
}

