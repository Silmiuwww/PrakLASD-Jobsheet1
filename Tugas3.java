import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[][] jadwal = new String[n][4];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Jumlah SKS: ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Semester: ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][3] = input.nextLine();
        }

        while (true) {
            System.out.println("==== MENU JADWAL KULIAH ====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 5) {
                System.out.println("Program selesai.Terima kasih!");
                break;
            }

            System.out.println("==== HASIL ====");
            boolean ditemukan = false;

            for (int i = 0; i < n; i++) {
                if (pilihan == 1 || 
                   (pilihan == 2 && jadwal[i][3].equalsIgnoreCase(input.nextLine())) ||
                   (pilihan == 3 && jadwal[i][2].equals(input.nextLine())) ||
                   (pilihan == 4 && jadwal[i][0].equalsIgnoreCase(input.nextLine()))) {
                    
                    System.out.println(jadwal[i][0] + " | SKS: " + jadwal[i][1] + " | Semester: " + jadwal[i][2] + " | Hari: " + jadwal[i][3]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Data tidak ditemukan");            
            }
        }
    }
}
