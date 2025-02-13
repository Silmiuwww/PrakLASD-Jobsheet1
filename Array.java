import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mk[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
        "Keselamatan dan Kesehatan Kerja" };
        int sks[] = { 2, 2, 2, 2, 2, 2, 2, 3};
        int NilaiAngka[] = new int[mk.length];
        String NilaiHuruf[] = new String[mk.length];
        float bobotSKS[] = new float[mk.length];
        float bobot;
        float jumlah = 0;


        System.out.println("=========================================");
        System.out.println("Program IP Semester");
        System.out.println("=========================================");
        
        int totalSks = 0;
        for (int i = 0; i < sks.length; i++) {
            totalSks += sks[i];
        }
        
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukan Nilai " + mk[i] + " : ");
            NilaiAngka[i] = input.nextInt();
            if (NilaiAngka[i] > 100) {
                System.out.println("=========================================");
                System.out.println("Hasil Konversi Nilai");
                System.out.println("=========================================");
                break;
            }
        }
        
        for (int i = 0; i < mk.length; i++) {
            if (NilaiAngka[i] > 80 && NilaiAngka[i] <= 100) {
                NilaiHuruf[i] = "A";
              bobot=4f;
            } else if (NilaiAngka[i] > 73 && NilaiAngka[i] <= 80) {
                NilaiHuruf[i] = "B+";
                bobot=3.5f;
            } else if (NilaiAngka[i] > 65 && NilaiAngka[i] <= 73) {
                NilaiHuruf[i] = "B";
                bobot=3f;
            } else if (NilaiAngka[i] > 60 && NilaiAngka[i] <= 65) {
                NilaiHuruf[i] = "C+";
                bobot=2.5f;
            } else if (NilaiAngka[i] > 50 && NilaiAngka[i] <= 60) {
                NilaiHuruf[i] = "C";
                bobot=2f;
            } else if (NilaiAngka[i] > 39 && NilaiAngka[i] <= 50) {
                NilaiHuruf[i] = "D";
                bobot=1f;
            } else {
                NilaiHuruf[i] = "E";
                bobot=0f;
            }
            bobotSKS[i]=bobot;
        }
        
        System.out.println("=========================================");
        System.out.println("Hasil Setelah Dikonversikan  : ");
        System.out.println("=========================================");
        System.out.printf("%-40s%-20s%-20s%-20s", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s", mk[i], NilaiAngka[i], NilaiHuruf[i], bobotSKS[i]);
        }
    
        for (int i = 0; i < mk.length; i++) {
            jumlah += bobotSKS[i] * sks[i];
        }
        float ipk = jumlah / totalSks;
        System.out.println("=========================================");
        System.out.printf("IP : %.2f",ipk);
        System.out.println("=========================================");
    }
}
