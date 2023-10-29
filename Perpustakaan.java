import java.util.Scanner;

public class Perpustakaan{
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        String username, password, level;

        do {
            System.out.println("Pilih level anda: ");
            System.out.println("1. Super Admin");
            System.out.println("2. Admin");
            System.out.println("3. Pengunjung");
            char kondisiLevel = input2.next().charAt(0);
            switch (kondisiLevel){
                case'1' :
                    System.out.print("Masukkan username: ");
                    username = input3.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("superadmin") && password.equalsIgnoreCase("super123")) {
                        System.out.println("Berhasil masuk sebagai Super Admin");
                        System.out.println("Pilih aktivitas yang akan anda lakukan");
                        System.out.println("1. Meminjam buku");
                        System.out.println("2. Mengembalikan buku");
                        System.out.println("3. Mengubah stok");
                        System.out.println("4. Tambah buku baru");
                        System.out.println("5. Tambah member/anggota");
                        char kondisi;

                        kondisi = input2.next().charAt(0);

                        switch (kondisi) {
                            case '1':
                                String nama, judul, tanggal, nim;
                                int jumlah, hari, telat;
                                System.out.print("Masukkan Nama peminjam              : ");
                                nama = input3.nextLine();
                                System.out.print("Masukkan NIM peminjam               : ");
                                nim = input3.nextLine();
                                System.out.print("Masukkan judul buku yang dipinjam   : ");
                                judul = input3.nextLine();
                                System.out.print("Masukkan jumlah buku yang dipinjam  : ");
                                jumlah = input3.nextInt();
                                System.out.print("Masukkan tanggal pengembalian       : ");
                                tanggal = input3.nextLine();
                                System.out.println("Nama peminjam " + nama);
                                System.out.println("NIM peminjam " + nim);
                                System.out.println("Judul buku yang dipinjam " + judul);
                                System.out.println("Jumlah buku yang dipinjam " + jumlah);
                                System.out.println("Tanggal pengembalian " + tanggal);
                                break;

                            case '2':
                                System.out.print("Masukkan nama peminjam               : ");
                                nama = input3.nextLine();
                                System.out.print("Masukkan nim peminjam                : ");
                                nim = input3.nextLine();
                                System.out.print("Masukkan judul buku yang dipinjam    : ");
                                judul = input3.nextLine();
                                System.out.print("Masukkan jumlah buku yang dipinjam   : ");
                                jumlah = input3.nextInt();
                                System.out.print("Masukkan jumlah hari peminjaman      : ");
                                hari = input3.nextInt();
                                telat = hari - 7;
                                if (hari > 7) {

                                    double denda;
                                    denda = (hari - 7) * 5000;
                                    System.out.println("Peminjam " + nama + " terkena denda sebesar " + denda
                                            + " karena terlambat mengembalikan" + telat + " hari");
                                } else {
                                    System.out.println("Buku berhasil dikembalikan");
                                }
                                break;
                            case '3':
                                int stokawal, pinjam, hilang, rusak, stokakhir;
                                System.out.print("Masukkan Stok buku awal               : ");
                                stokawal = input2.nextInt();
                                System.out.print("Masukkan jumlah buku yang dipinjam    : ");
                                pinjam = input2.nextInt();
                                System.out.print("Masukkan jumlah buku yang hilang      : ");
                                hilang = input2.nextInt();
                                System.out.print("Masukkan jumlah buku yang rusak       : ");
                                rusak = input2.nextInt();
                                stokakhir = stokawal - pinjam - hilang - rusak;
                                System.out.println("Berhasil update stok!");
                                System.out.println("Stok buku saat ini adalah " + stokakhir + " buku");
                                break;
                            case '4':
                                String buku, buku1, buku2, buku3, buku4;
                                System.out.print("Masukkan judul buku baru: ");
                                buku = input3.nextLine();
                                System.out.println("Buku dengan judul " + buku + " berhasil di masukkan");
                                System.out.println("Apakah anda ingin memasukkan judul buku baru lagi? ");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                char kondisi2;
                                kondisi2 = input2.next().charAt(0);
                                switch (kondisi2) {
                                    case '1':
                                        System.out.println("Masukkan judul buku baru: ");
                                        buku1 = input3.nextLine();
                                        System.out.println("Buku dengan judul: ");
                                        System.out.println("1. " + buku);
                                        System.out.println("2. " + buku1);
                                        System.out.println("Berhasil dimasukkan!");
                                        System.out.println("Apakah anda ingin memasukkan judul buku baru lagi? ");
                                        System.out.println("1. Ya");
                                        System.out.println("2. Tidak");
                                        char kondisi3;
                                        kondisi3 = input2.next().charAt(0);
                                        switch (kondisi3) {
                                            case '1':
                                                System.out.println(
                                                        "Masukkan judul buku baru: (jangan diberi spasi, ganti dengan '_')");
                                                buku2 = input2.next();
                                                System.out.println("Buku dengan judul: ");
                                                System.out.println("1. " + buku);
                                                System.out.println("2. " + buku1);
                                                System.out.println("2. " + buku2);
                                                System.out.println("Berhasil dimasukkan!");
                                                System.out
                                                        .println("Apakah anda ingin memasukkan judul buku baru lagi? ");
                                                System.out.println("1. Ya");
                                                System.out.println("2. Tidak");
                                                String kondisi4;
                                                kondisi4 = input2.nextLine();
                                                if (kondisi4.equals("ya")) {
                                                }
                                                break;

                                            case '2':
                                                System.out.println("Terima kasih sudah menambah buku baru");
                                                break;
                                        }
                                        break;

                                    case '2':
                                        System.out.println("Terimakasih sudah menambah buku baru");
                                        break;
                                    default:
                                        System.out.println("Maaf belum bisa diakses");
                                }
                                break;
                            default:
                                System.out.println("Maaf belum bisa diakses");
                        }
                    }
                    case'2':
                    System.out.print("Masukkan username: ");
                    username = input3.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
                        System.out.println("Berhasil masuk sebagai Admin");
                        do {
                            String kondisi;
                            System.out.println("Pilih aktivitas yang ingin anda lakukan");
                            System.out.println("1. Menambah buku");
                            System.out.println("2. Transaksi Peminjaman");
                            System.out.println("3. Transaksi pengembalian");
                            System.out.println("4. Menambah member");

                        } while (true);
                    }
                    case '3' :      
                    System.out.print("Masukkan username: ");
                    username = input3.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("pengunjung") && password.equalsIgnoreCase("pengunjung123")) {
                        System.out.println("Berhasil masuk sebagai Pengunjung");
                    }
            } 

            // System.out.print("Masukkan Username Anda: ");
            // username = input2.nextLine();
            // System.out.print("Masukkan Password Anda: ");
            // password = input2.nextLine();

            // if (username.equals("Admin1") && password.equals("admin")) {
            // System.out.println("Anda berhasil login!");
            // char kondisi;

            // } else {
            // System.out.println("Username dan password salah silahkan login ulang!");
            // }
        } while (true);
    }
}
