import java.util.Scanner;

public class Perpustakaan1 {
    public static void main(String[] args) {
        // inputan level
        Scanner levellogin = new Scanner(System.in);
        // inputan login superadmin
        Scanner loginsuper = new Scanner(System.in);
        // inputan proses di admin
        Scanner inputangka = new Scanner(System.in);
        Scanner inputhuruf = new Scanner(System.in);
        Scanner inputhuruff = new Scanner(System.in);
        String username, password, level;
        boolean masuk = false;
        // String[] buku = new String[1000];
        // int[] jml = new int[1000];
        // int p = 1;
        // int l = 1;
        do {
            System.out.println("=====================================");
            System.out.println("Pilih level anda: ");
            System.out.println("(super admin / admin / pengunjung)");
            // System.out.println("1. Super Admin");
            // System.out.println("2. Admin");
            // System.out.println("3. Pengunjung");
            level = levellogin.nextLine();
            System.out.println("=============================================");

            if (level.equalsIgnoreCase("super admin")) {
                do {
                    System.out.println("=============================================");
                    System.out.print("Masukkan username: ");
                    username = loginsuper.nextLine();
                    System.out.print("Masukkan password: ");
                    password = loginsuper.nextLine();
                    
                    if (username.equalsIgnoreCase("superadmin") && password.equalsIgnoreCase("super123")) {
                        masuk = true;
                        while (true) {
                            System.out.println("=============================================");
                            System.out.println("Berhasil masuk sebagai Super Admin");
                            System.out.println("Pilih aktivitas yang akan anda lakukan (1/2/3/4/5)");
                            System.out.println("1. Meminjam buku");
                            System.out.println("2. Mengembalikan buku");
                            System.out.println("3. Mengubah stok");
                            System.out.println("4. Tambah buku baru");
                            System.out.println("5. Tambah anggota");
                            System.out.println("6. Laporan peminjaman");
                            System.out.println("7. Laporan pengembalian");

                            char kondisi;

                            kondisi = inputangka.next().charAt(0);

                            switch (kondisi) {
                                case '1':
                                    String nama, judul, tanggal, nim;
                                    int jumlah, hari, telat;
                                    System.out.print("Masukkan Nama peminjam              : ");
                                    nama = inputhuruf.nextLine();
                                    System.out.print("Masukkan NIM peminjam               : ");
                                    nim = inputhuruf.nextLine();
                                    System.out.print("Masukkan judul buku yang dipinjam   : ");
                                    judul = inputhuruf.nextLine();
                                    System.out.print("Masukkan jumlah buku yang dipinjam  : ");
                                    jumlah = inputhuruf.nextInt();
                                    System.out.print("Masukkan tanggal pengembalian       : ");
                                    tanggal = inputhuruf.nextLine();
                                    System.out.println("Nama peminjam " + nama);
                                    System.out.println("NIM peminjam " + nim);
                                    System.out.println("Judul buku yang dipinjam " + judul);
                                    System.out.println("Jumlah buku yang dipinjam " + jumlah);
                                    System.out.println("Tanggal pengembalian " + tanggal);
                                    break;

                                case '2':
                                    hari = 0;
                                    double denda, tenggat;
                                    String konfirmasi;

                                    do {
                                        System.out.print("Apakah anda ingin mengembalikan buku (y/t)? ");
                                        konfirmasi = inputhuruf.next();

                                        if (konfirmasi.equalsIgnoreCase("y")) {
                                            System.out.print("Masukkan nama peminjam               : ");
                                            nama = inputhuruf.nextLine();
                                            System.out.print("Masukkan nim peminjam                : ");
                                            nim = inputhuruf.nextLine();
                                            System.out.print("Masukkan judul buku yang dipinjam    : ");
                                            judul = inputhuruf.nextLine();
                                            System.out.print("Masukkan jumlah buku yang dipinjam   : ");
                                            jumlah = inputangka.nextInt();
                                            System.out.print("Masukkan jumlah hari peminjaman      : ");
                                            hari = inputangka.nextInt();

                                            telat = hari - 7;
                                            tenggat = 7;

                                            if (hari > tenggat) {
                                                denda = (hari - 7) * 500;
                                                System.out.println("Peminjam " + nama + " terkena denda sebesar "
                                                        + denda
                                                        + " karena terlambat mengembalikan buku " + telat + " hari. ");

                                            } else {
                                                System.out.println("Buku berhasil dikembalikan");

                                            }
                                        } else {
                                            System.out.println("Terima kasih sudah mengembalikan buku");
                                            break;
                                        }
                                    } while (hari > 0);
                                    break;
                                case '3':
                                    int stokawal, pinjam, hilang, rusak, stokakhir;
                                    System.out.print("Masukkan Stok buku awal               : ");
                                    stokawal = inputangka.nextInt();
                                    System.out.print("Masukkan jumlah buku yang dipinjam    : ");
                                    pinjam = inputangka.nextInt();
                                    System.out.print("Masukkan jumlah buku yang hilang      : ");
                                    hilang = inputangka.nextInt();
                                    System.out.print("Masukkan jumlah buku yang rusak       : ");
                                    rusak = inputangka.nextInt();
                                    stokakhir = stokawal - pinjam - hilang - rusak;
                                    System.out.println("Berhasil update stok!");
                                    System.out.println("Stok buku saat ini adalah " + stokakhir + " buku");
                                    break;
                                case '4':
                                    System.out.println("=============================================");
                                    System.out.println("          Tambah buku baru           ");
                                    System.out.println("Masukkan jumlah buku yang akan ditambah: ");
                                    // deklarasi
                                    int ele = inputangka.nextInt();
                                    String[] buku = new String[ele];
                                    int[] jml = new int[ele];

                                    for (int a = 0; a < buku.length;a++) {

                                        System.out.print("Masukkan judul buku ke-" + (a + 1) + ": ");
                                        buku[a] = inputhuruf.nextLine();
                                        System.out.print("Masukkan jumlah buku: ");
                                        jml[a] = inputangka.nextInt();

                                        // System.out.println("Apakah anda ingin menambah buku baru? (y/t)");
                                        // String tanyabuku = inputhuruff.nextLine();

                                        // if (tanyabuku.equalsIgnoreCase("y")) {
                                        // a++;

                                        // } else {
                                        // for (int i = 1; i < buku.length; i++) {

                                        //

                                        // }
                                        // break;

                                        // }
                                    }
                                    for(int i = 0; i < buku.length; i++){
                                        System.out.println("Judul buku ke-"+(i+1)+": " + buku[i] + " Jumlah buku:" + jml[i]);
                                    }
                                    

                                    // do {
                                    // System.out.println("Apakah anda ingin memasukkan judul buku baru (y/t)? ");
                                    // konfirmasi = inputhuruf.nextLine();
                                    // if (konfirmasi.equalsIgnoreCase("y")) {
                                    // jumlah++;
                                    // System.out.print("Masukkan judul buku baru: ");
                                    // buku = inputhuruf.nextLine();

                                    // System.out.println("Buku dengan judul " + buku + " berhasil di masukkan");
                                    // } else {
                                    // jumlah -= 1;
                                    // System.out.println("Terima kasih sudah melakukan penambahan buku");
                                    // continue;
                                    // }

                                    // } while (jumlah > 0);

                                    break;
                                case '5':
                                    System.out.print("Masukkan jumlah member: ");
                                    int member = inputangka.nextInt();
                                    String[] nama1 = new String[member];
                                    String[] nim1 = new String[member];
                                    for(int i = 0; i<nama1.length; i++){
                                        System.out.print("Masukkan nama member ke-"+(i+1)+": ");
                                        nama1 [i] = inputhuruf.nextLine();
                                        System.out.print("Masukkan NIM member ke-"+(i+1)+": ");
                                        nim1 [1] = inputhuruf.nextLine();
                                    }
                                    for(int j = 0; j < nama1.length; j++){
                                        System.out.println("Nama member ke-"+(j+1)+": " + nama1[j] + " dengan NIM " + nim1[j]+ " berhasil dimasukkan");
                                    }
                                    // do {
                                    //     System.out.println("Apakah anda ingin menambah member (y/t)?");
                                    //     konfirmasi = inputhuruf.nextLine();
                                    //     member++;
                                    //     if (konfirmasi.equalsIgnoreCase("y")) {
                                    //         System.out.print("Masukkan nama member baru : ");
                                    //         nama = inputhuruff.nextLine();
                                    //         System.out.print("Masukkan NIM member baru  : ");
                                    //         nim = inputhuruff.nextLine();
                                    //         System.out.println(
                                    //                 "Nama member " + nama + " dengan NIM " + nim
                                    //                         + " berhasil dimasukkan");
                                    //     } else {
                                    //         System.out.println("Terima kasih sudah menambah member");
                                    //     }
                                    // } while (member > 0);
                                    break;
                                default:
                                    System.out.println("Maaf belum bisa diakses");
                            }
                            System.out.println("Apakah anda ingin melakukan aktivitas lain? (y/t)");
                            String akt = inputhuruff.nextLine();
                            if (akt.equalsIgnoreCase("y")) {
                                masuk = true;
                            }
                        }
                    }

                } while (true);
            } else if (level.equalsIgnoreCase("admin")) {
                do {
                    System.out.print("Masukkan username: ");
                    username = inputhuruf.nextLine();
                    System.out.print("Masukkan password: ");
                    password = inputhuruf.nextLine();
                    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
                        System.out.println("Berhasil masuk sebagai Admin");
                        do {

                            System.out.println("Pilih aktivitas yang ingin anda lakukan (1/2/3/4/5)");
                            System.out.println("1. Menambah buku");
                            System.out.println("2. Transaksi Peminjaman");
                            System.out.println("3. Transaksi pengembalian");
                            System.out.println("4. Menambah member");
                            char kondisi2;
                            kondisi2 = inputangka.next().charAt(0);
                            switch (kondisi2) {
                                case '1':

                                    break;

                                default:
                                    break;
                            }

                        } while (true);
                    }
                } while (true);
            } else if (level.equalsIgnoreCase("pengunjung")) {
                do {
                    System.out.print("Masukkan username: ");
                    username = inputhuruf.nextLine();
                    System.out.print("Masukkan password: ");
                    password = inputhuruf.nextLine();
                    if (username.equalsIgnoreCase("pengunjung") && password.equalsIgnoreCase("pengunjung123")) {
                        System.out.println("Berhasil masuk sebagai Pengunjung");
                    }
                } while (true);
            }

            // System.out.print("Masukkan Username Anda: ");
            // username = inputangka.nextLine();
            // System.out.print("Masukkan Password Anda: ");
            // password = inputangka.nextLine();

            // if (username.equals("Admin1") && password.equals("admin")) {
            // System.out.println("Anda berhasil login!");
            // char kondisi;

            // } else {
            // System.out.println("Username dan password salah silahkan login ulang!");
            // }
        } while (true);
    }
}
