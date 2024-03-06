public class MainBarang {

    public static void main(String[] args) {
        TransaksiBarang transaksiBarang = new TransaksiBarang();

        // Menambahkan data Barang (minimal 5)
        transaksiBarang.addBarang(new Barang("A001", "Catnip", 5000, 10));
        transaksiBarang.addBarang(new Barang("A010", "Dogfood", 7000, 20));
        transaksiBarang.addBarang(new Barang("A011", "Catfood", 10000, 30));
        transaksiBarang.addBarang(new Barang("A100", "Pet Shampoo", 3000, 15));
        transaksiBarang.addBarang(new Barang("A101", "Pasir Hewan", 15000, 25));
        transaksiBarang.addBarang(new Barang("A111", "Obat Hewan", 15000, 25));
       
        // Menampilkan menu
        while (true) {
            System.out.println("Selamat Datang di Ircham Petshop");
            System.out.println("Menu:");
            System.out.println("1. Daftar Barang");
            System.out.println("2. Lakukan Pembelian");
            System.out.println("3. Daftar Barang Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");

            String pilihan = System.console().readLine();

            switch (pilihan) {
                case "1":
                    transaksiBarang.tampilkanBarang();
                    break;
                case "2":
                    lakukanPembelian(transaksiBarang);
                    break;
                case "3":
                    transaksiBarang.tampilkanBarangPembelian();
                    break;
                case "4":
                    System.out.println("Terimakasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void lakukanPembelian(TransaksiBarang transaksiBarang) {
        while (true) {
            System.out.println("\nMasukkan kode barang untuk membeli (atau 'e' untuk keluar): ");
            String kodeBarang = System.console().readLine();

            if (kodeBarang.equalsIgnoreCase("e")) {
                break;
            }

            transaksiBarang.lakukanPembelian(kodeBarang);
        }
    }
}