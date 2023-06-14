import java.util.Scanner;

public class RestoranBungar {
    static Integer jumlahPesanan;
    static Integer nasiGoreng, ayamBakar, steak, kwetiau, kambingGuling;
    static String namaPemesan;
    static Scanner scanner = new Scanner(System.in);

    static void Reservasi(){

        // kalimat selamat siang
        System.out.print("\n");
        System.out.println("Selamat siang...");
        System.out.print("\n");
        
        // input berapa banyak yang pesan
        System.out.print("Pesan untuk berapa orang \t: ");
        jumlahPesanan = scanner.nextInt();

        // input pesanan atas nama
        System.out.print("Pesanan atas nama \t\t: ");
        namaPemesan = scanner.next();

    }

    static void DaftarMenu(){

        // tampilkan Menu Spesial Hari Ini
        System.out.print("\n");
        System.out.println("Menu Spesial Hari Ini");
        for(int i = 0; i <("Menu Spesial Hari Ini").length(); i++){
            System.out.print("=");
        }
        // tampilkan daftar menu
        System.out.println("\n");
        System.out.println("\t1. Nasi Goreng Spesial\t\t\t @ Rp. 9999.99");
        System.out.println("\t2. Ayam Bakar Spesial\t\t\t @ Rp. 12345.67");
        System.out.println("\t3. Steak Sirloin Spesial \t\t @ Rp. 21108.40");
        System.out.println("\t4. Kwetiaw Siram Spesial \t\t @ Rp. 13579.13");
        System.out.println("\t5. Kambing Guling Spesial \t\t @ Rp. 98765.43");
    }

    public static void main(String[] args) {
        Reservasi();
        System.out.print("\n");
        DaftarMenu();

    }
}
