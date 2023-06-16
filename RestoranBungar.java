import java.util.Scanner;

public class RestoranBungar {
    // Declare public variable
    static Integer nasiGoreng, ayamBakar, steak, kwetiaw, kambingGuling;
    static String namaPemesan, jumlahPesanan;
    static Scanner scanner = new Scanner(System.in);

    // Methode input reservasi
    static void Reservasi(){

        // kalimat selamat siang
        System.out.print("\n");
        System.out.println("Selamat siang...");
        System.out.print("\n");
        
        // input berapa banyak yang pesan
        System.out.print("Pesan untuk berapa orang \t: ");
        jumlahPesanan = scanner.nextLine();

        // input pesanan atas nama
        System.out.print("Pesanan atas nama \t\t: ");
        namaPemesan = scanner.nextLine();

    }

    // Methode display menu
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

    // Methode input pesanan
    static void Pesanan(){
        System.out.print("Pesanan Anda (batas pesanan 0-10 po)");

        // input banyak pesanan tiap menu
        System.out.println("\n");
        System.out.print("1. Nasi Goreng Spesial\t\t= ");
        nasiGoreng = scanner.nextInt();
        System.out.print("2. Ayan Bakar Spesial\t\t= ");
        ayamBakar = scanner.nextInt();
        System.out.print("3. Steak Sirloin Spesial\t= ");
        steak = scanner.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial\t= ");
        kwetiaw = scanner.nextInt();
        System.out.print("5. Kambing Guling Spesial\t= ");
        kambingGuling = scanner.nextInt();
    }


    // Methode bill pesanan
    static void Bill(){
        // variable dan value untuk harga tiap menu
        double hargaNasiGoreng = 9999.99;
        double hargaAyamBakar = 12345.67;
        double hargaSteak = 21108.40;
        double hargaKwetiaw = 13579.13;
        double hargaKambingGuling = 98765.43;

        // variable perhitungan
        Integer banyakOrangPesan = Integer.parseInt(jumlahPesanan); // mengubah value string ke int
        double totalBiayaBeli = (hargaNasiGoreng*nasiGoreng)+(hargaAyamBakar*ayamBakar)+(hargaSteak*steak)+(hargaKwetiaw*kwetiaw)+(hargaKambingGuling*kambingGuling);
        double diskon = totalBiayaBeli*0.1;
        double totalSetelahDiskon = totalBiayaBeli - diskon;
        double totalPerOrang = totalSetelahDiskon/(banyakOrangPesan);

        System.out.print("\n");
        System.out.print("Selanat meniknati nakanan anda...");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Pembelian : ");
        System.out.print("\n");
        System.out.print("\n");

        // menampilkan pesanan dan harga
        System.out.print("1. Nasi Goreng Spesial\t\t"+nasiGoreng+"\tporsi * Rp. "+hargaNasiGoreng+"\t= Rp. "+String.format("%.2f",(hargaNasiGoreng*nasiGoreng)));
        System.out.print("\n");
        System.out.print("2. Ayan Bakar Spesial\t\t"+ayamBakar+"\tporsi * Rp. "+hargaAyamBakar+"\t= Rp. "+String.format("%.2f",(hargaAyamBakar*ayamBakar)));
        System.out.print("\n");
        System.out.print("3. Steak Sirloin Spesial\t"+steak+"\tporsi * Rp. "+hargaSteak+"\t= Rp. "+String.format("%.2f",(hargaSteak*steak)));
        System.out.print("\n");
        System.out.print("4. Kwetiaw Siram Spesial\t"+kwetiaw+"\tporsi * Rp. "+hargaKwetiaw+"\t= Rp. "+String.format("%.2f",(hargaKwetiaw*kwetiaw)));
        System.out.print("\n");
        System.out.print("5. Kambing Guling Spesial\t"+kambingGuling+"\tporsi * Rp. "+hargaKambingGuling+"\t= Rp. "+String.format("%.2f",(hargaKambingGuling*kambingGuling)));
        System.out.print("\t+");
        System.out.print("\n");
        // cetak line
        for(int i = 0; i <= 80;i++){
            System.out.print("=");
        }
        System.out.print("\n");
        // menampilkan total harga pembelian
        System.out.print("Total Pembelian\t\t\t\t\t\t\t= Rp. "+String.format("%.2f",(totalBiayaBeli)));
        System.out.print("\n");
        System.out.print("\n");
        // menampilkan harga diskon
        System.out.print("Diskon 10% (Masa Promosi)\t\t\t\t\t= Rp. "+String.format("%.2f",(diskon)));
        System.out.print("\t-");
        System.out.print("\n");
        // cetak line
        for(int i = 0; i <= 80;i++){
            System.out.print("=");
        }
        System.out.print("\n");
        // menampilkan total harga setelah diskon
        System.out.print("Total Pembelian Setelah Diskon 10%\t\t\t\t= Rp. "+String.format("%.2f",(totalSetelahDiskon)));
        System.out.print("\n");
        System.out.print("\n");
        // menampilkan biaya total bagi jumlah pemesan
        System.out.print("Biaya Per Orang <untuk "+jumlahPesanan+" orang>\t\t\t\t\t= Rp. "+String.format("%.2f",(totalPerOrang)));
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\t\tTerima Kasih Atas Kunjungan Anda....");
        System.out.print("\n");
        System.out.print("\t\t...Tekan Enter Untuk Keluar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Reservasi();
        System.out.print("\n");
        DaftarMenu();
        System.out.print("\n");
        Pesanan();
        System.out.print("\n");
        Bill();
    }
}
