import java.util.Scanner;

public class Perpustakaan1 {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        String username, password, level;

        do {
            System.out.println("Pilih level anda (super admin / admin / pengunjung): ");
            // System.out.println("1. Super Admin");
            // System.out.println("2. Admin");
            // System.out.println("3. Pengunjung");
            level = input2.nextLine();

            if (level.equalsIgnoreCase("super admin")) {
                do {
                    System.out.print("Masukkan username: ");
                    username = input4.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("superadmin") && password.equalsIgnoreCase("super123")) {
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
                                hari = 0;
                                double denda, tenggat;
                                String konfirmasi;

                                do {
                                    System.out.print("Apakah anda ingin mengembalikan buku (y/t)? ");
                                    konfirmasi = input2.next();

                                    if (konfirmasi.equalsIgnoreCase("y")) {
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
                                        tenggat = 7;

                                        if (hari > tenggat) {
                                            denda = (hari - 7) * 500;
                                            System.out.println("Peminjam " + nama + " terkena denda sebesar " + denda
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
                                String buku;
                                jumlah = 0;
                                do {
                                    System.out.println("Apakah anda ingin memasukkan judul buku baru (y/t)? ");
                                    konfirmasi = input3.nextLine();
                                    if (konfirmasi.equalsIgnoreCase("y")) {
                                        jumlah++;
                                        System.out.print("Masukkan judul buku baru: ");
                                        buku = input3.nextLine();

                                        System.out.println("Buku dengan judul " + buku + " berhasil di masukkan");
                                    } else {
                                        jumlah -= 1;
                                        System.out.println("Terima kasih sudah melakukan penambahan buku");
                                        continue;
                                    }

                                } while (jumlah > 0);

                                break;
                            case '5':
                                int member = 0;
                                do {
                                    System.out.println("Apakah anda ingin menambah member (y/t)?");
                                    konfirmasi = input3.nextLine();
                                    member++;
                                    if (konfirmasi.equalsIgnoreCase("y")){
                                        System.out.print("Masukkan nama member baru : ");
                                        nama = input4.nextLine();
                                        System.out.print("Masukkan NIM member baru  : ");
                                        nim = input4.nextLine();
                                        System.out.println("Nama member "+nama+" dengan NIM " +nim+" berhasil dimasukkan");
                                    } else{
                                        System.out.println("Terima kasih sudah menambah member");
                                    }
                                } while(member>0);
                                break;
                            default:
                                System.out.println("Maaf belum bisa diakses");
                        }
                    }
                } while (true);
            } else if (level.equalsIgnoreCase("admin")) {
                do {
                    System.out.print("Masukkan username: ");
                    username = input3.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
                        System.out.println("Berhasil masuk sebagai Admin");
                        do {
                            
                            System.out.println("Pilih aktivitas yang ingin anda lakukan (1/2/3/4/5)");
                            System.out.println("1. Menambah buku");
                            System.out.println("2. Transaksi Peminjaman");
                            System.out.println("3. Transaksi pengembalian");
                            System.out.println("4. Menambah member");
                            char kondisi2;
                            kondisi2 = input2.next().charAt(0);
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
                    username = input3.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input3.nextLine();
                    if (username.equalsIgnoreCase("pengunjung") && password.equalsIgnoreCase("pengunjung123")) {
                        System.out.println("Berhasil masuk sebagai Pengunjung");
                    }
                } while (true);
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
