import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.management.StringValueExp;

public class PerpustakaanFINISHBilingual {

    static Scanner peminjamHuruf = new Scanner(System.in);
    static Scanner pengembaliAngka = new Scanner(System.in);
    static Scanner pengembaliHuruf = new Scanner(System.in);

    static String bukuArray[][] = new String[100][6];
    static String memberArray[][] = new String[100][5];
    static String peminjamArray[][] = new String[100][11];
    static String pengembaliArray[][] = new String[100][11];
    static String dendaArray[][] = new String[100][5];
    static int membercount = 1, bukucount = 1, peminjamanCount = 0, pengembaliCount = 0, kodePinjam = 1, dendaCount = 0,
            totalPinjam = 0;
    static long dendaa = 0;
    static String cariJudul, cariKodeBuku, cariPenulisBuku, cariTahunBuku, cariNim, cariNimPeminjam, cariKode,
            jmlPinjam, status;
    static boolean nimketemu = false;
    static Scanner tanggalDenda = new Scanner(System.in);
    static Scanner scStok = new Scanner(System.in);
    static Scanner tambahStokAngka = new Scanner(System.in);
    static Scanner tambahStokHuruf = new Scanner(System.in);
    static Scanner scCari = new Scanner(System.in);
    static Scanner penggunaHuruf = new Scanner(System.in);

    public static void main(String[] args) {
        ////////////////////// SCANNER ///////////////////////////
        /// scanner level dan login ///
        Scanner pilLevel = new Scanner(System.in);
        Scanner login = new Scanner(System.in);

        /// scanner konfirmasi ///
        Scanner konfirmasiAngka = new Scanner(System.in);
        Scanner konfirmasiHuruf = new Scanner(System.in);

        /// scanner buku ///
        Scanner bukuHuruf = new Scanner(System.in);
        Scanner bukuAngka = new Scanner(System.in);
        String kodeBuku, judulBuku, penulis, tahunTerbit, jumlahBuku;

        /// scanner member ///
        Scanner memberSH = new Scanner(System.in);
        Scanner memberSA = new Scanner(System.in);

        /// scanner peminjaman ///
        Scanner peminjamHuruf = new Scanner(System.in);
        Scanner peminjamAngka = new Scanner(System.in);

        /// scanner pengembalian ///
        Scanner pengembaliHuruf = new Scanner(System.in);
        Scanner pengembaliAngka = new Scanner(System.in);

        /// scanner denda ///

        ///////////////////////// DEKLARASI//////////////////////
        String Bahasa, levelPengguna, username, password;

        //////////////// input buku mulai ////////////////

        /// deklarasi inputan buku ///

        bukuArray[0][0] = "20001"; // kode Buku
        bukuArray[0][1] = "Kembali Pulang"; // judul Buku
        bukuArray[0][2] = "Yura Yunita"; // penulis
        bukuArray[0][3] = "2019"; // tahun terbit
        bukuArray[0][4] = "15"; // stok buku awal
        bukuArray[0][5] = "15"; // stok buku yang bisa dipinjam
        //////////////// input buku selesai ////////////////

        /////////////// input member mulai ///////////////
        /// deklarasi input member ///
        String nim, nama;
        memberArray[0][0] = "2341760076"; // NIM
        memberArray[0][1] = "David"; // Nama
        memberArray[0][2] = String.valueOf(dendaa); // DendaMember
        memberArray[0][3] = String.valueOf(totalPinjam);

        /////////////// input member selesai ///////////////

        //////////////// peminjam mulai ////////////////
        /// deklarasi inputan peminjaman ///
        String peminjamArray[][] = new String[100][8];
        String nim1, nama1 = null, tenggat, kodeBuku1;
        int jumlah;
        int peminjamanCount = 0;
        boolean found = false;
        //////////////// peminjam selesai ////////////////

        /////////////// pengembali mulai ///////////////
        String pengembaliArray[][] = new String[100][10];
        String nim2 = null;
        int hari, denda;
        boolean cariPinjam = false;
        /////////////// pengembali selesai ///////////////

        //////////////// laporan peminjaman /////////////

        Scanner judul = new Scanner(System.in);
        Scanner menuLap = new Scanner(System.in);

        //////////// Scanner pencarian ///////////////
        Scanner scCari = new Scanner(System.in);
        Scanner pilihFitur1 = new Scanner(System.in);
        Scanner PilihBahasa = new Scanner(System.in);
        do {
            System.out.println("|=================================================|");
            System.out.println("| Pilih Bahasa/Choose language (Indonesa/English) |");
            System.out.println("|=================================================|");
            System.out.println("| 1. Indonesia                                    |");
            System.out.println("| 2. Bahasa Inggris/English                       |");
            System.out.println("|=================================================|");
            System.out.println();
            System.out.print("   Pilihan anda: ");
            Bahasa = PilihBahasa.nextLine();
            System.out.println();

            if (Bahasa.equalsIgnoreCase("1") || Bahasa.equalsIgnoreCase("Indonesia")) {
                do {
                    System.out.println("|===========================================|");
                    System.out.println("|   Pilih level pengguna (admin/pengguna)   |");
                    System.out.println("|===========================================|");
                    System.out.println("| 1. Admin                                  |");
                    System.out.println("| 2. Pengguna                               |");
                    System.out.println("| 3. Keluar                                 |");
                    System.out.println("|===========================================|");
                    System.out.println();
                    System.out.print("   Pilihan anda: ");
                    levelPengguna = pilLevel.nextLine();
                    System.out.println();

                    if (levelPengguna.equalsIgnoreCase("admin")||levelPengguna.equalsIgnoreCase("1")) {
                        System.out.println("|===========================================|");
                        System.out.println("|      Silahkan login terlebih dahulu       |");
                        System.out.println("|===========================================|");
                        System.out.println();
                        System.out.print("  Username: ");
                        username = login.nextLine();
                        System.out.print("  Password: ");
                        password = login.nextLine();
                        System.out.println();
                        if (username.equals("admin") && password.equals("admin123")
                                || username.equals("admin2") && password.equals("admin321")) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|        Berhasil masuk sebagai admin       |");
                                System.out.println("|===========================================|");
                                System.out.println("|   Silahkan pilih menu (1/2/3/4/5/6/7/8)   |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Data Buku                              |");
                                System.out.println("| 2. Data Member                            |");
                                System.out.println("| 3. Transaksi Peminjaman                   |");
                                System.out.println("| 4. Transaksi Pengembalian                 |");
                                System.out.println("| 5. Pembayaran Denda                       |");
                                System.out.println("| 6. Laporan                                |");
                                System.out.println("| 7. Pencarian                              |");
                                System.out.println("| 8. Keluar                                 |");
                                System.out.println("|===========================================|");
                                System.out.println();
                                System.out.print(" Pilihan anda: ");
                                String menu = konfirmasiHuruf.nextLine();
                                System.out.println();

                                if (menu.equals("1")) {
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|      Pilih Akses Data Buku (1/2/3/4)      |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Buku Baru                        |");
                                        System.out.println("| 2. Lihat semua buku                       |");
                                        System.out.println("| 3. Tambah stok                            |");
                                        System.out.println("| 4. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm1 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm1.equals("1")) {
                                            System.out.println("    Anda memasuki menu input buku");
                                            System.out.print("Masukkan kode buku: ");
                                            kodeBuku = bukuHuruf.nextLine();
                                            boolean cocokKodeBuku = false;
                                            for (int i = 0; i < bukuArray.length; i++) {
                                                if (kodeBuku.equals(bukuArray[i][0])) {
                                                    cocokKodeBuku = true;
                                                    System.out.println("Buku telah tersedia di Perpustakaan");
                                                    break;
                                                }
                                            }
                                            if (!cocokKodeBuku) {
                                                System.out.print("Masukkan judul buku: ");
                                                judulBuku = bukuHuruf.nextLine();
                                                System.out.print("Masukkan nama penulis: ");
                                                penulis = bukuHuruf.nextLine();
                                                System.out.print("Masukkan tahun terbit: ");
                                                tahunTerbit = bukuAngka.nextLine();
                                                System.out.print("Masukkan jumlah buku: ");
                                                jumlahBuku = bukuAngka.nextLine();
                                                System.out.println();
                                                bukuArray[bukucount][0] = kodeBuku;
                                                bukuArray[bukucount][1] = judulBuku;
                                                bukuArray[bukucount][2] = penulis;
                                                bukuArray[bukucount][3] = tahunTerbit;
                                                bukuArray[bukucount][4] = jumlahBuku;
                                                bukuArray[bukucount][5] = bukuArray[bukucount][4];
                                                bukucount++;
                                            }

                                        } else if (confirm1.equals("2")) {
                                            // for (int i = 0; i < bukucount; i++) {
                                            tampilBuku();

                                        } else if (confirm1.equals("3")) {
                                            tambahStok();
                                        } else if (confirm1.equals("4")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);

                                } else if (menu.equals("2")) {
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|       Pilih Akses Data Member (1/2)       |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Member Baru                      |");
                                        System.out.println("| 2. Lihat semua member                     |");
                                        System.out.println("| 3. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        System.out.println();
                                        String confirm2 = konfirmasiHuruf.nextLine();
                                        if (confirm2.equals("1")) {
                                            System.out.println("       Input Member");
                                            System.out.print("Masukkan NIM: ");
                                            nim = memberSH.nextLine();
                                            boolean CocokNim = false;
                                            for (int i = 0; i < memberArray.length; i++) {
                                                if (nim.equalsIgnoreCase(memberArray[i][0])) {
                                                    CocokNim = true;
                                                    System.out.println("Nim sudah terdaftar");
                                                }
                                            }
                                            if (!CocokNim) {
                                                System.out.print("Masukkan Nama: ");
                                                nama = memberSH.nextLine();
                                                memberArray[membercount][0] = nim;
                                                memberArray[membercount][1] = nama;
                                                memberArray[membercount][2] = String.valueOf(dendaa);
                                                memberArray[membercount][3] = String.valueOf(totalPinjam);
                                                membercount++;
                                            }

                                            System.out.println();
                                        } else if (confirm2.equals("2")) {
                                            tampilMember();
                                        } else if (confirm2.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);

                                } else if (menu.equals("3")) {
                                    do {
                                        System.out.println("|=============================================|");
                                        System.out.println("|      Pilih Akses Data Peminjaman (1/2)      |");
                                        System.out.println("|=============================================|");
                                        System.out.println("|       1. Input Peminjaman                   |");
                                        System.out.println("|       2. Lihat Data Peminjaman              |");
                                        System.out.println("|       3. Kembali                            |");
                                        System.out.println("|=============================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm3 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm3.equals("1")) {
                                            System.out.println("|=============================================|");
                                            System.out.println("|      Anda memasuki menu peminjaman buku     |");
                                            System.out.println("|=============================================|");
                                            if (bukuArray != null) {
                                                if (memberArray != null) {
                                                    for (int i = 0; i < peminjamArray.length;) {

                                                        System.out
                                                                .print("Apakah sudah terdaftar sebagai member?(y/t): ");
                                                        String tanyaDaftar = peminjamHuruf.nextLine();
                                                        System.out.println();
                                                        if (tanyaDaftar.equalsIgnoreCase("y")) {
                                                            do {
                                                                System.out.print("Masukkan NIM peminjaman: ");
                                                                cariNim = peminjamHuruf.nextLine();
                                                                peminjaman();

                                                                break;
                                                            } while (true);

                                                        } else {
                                                            System.out.println("Silahkan daftar terlebih dahulu");
                                                            break;
                                                        }
                                                        break;

                                                    }
                                                } else {
                                                    System.out.println("Tidak terdapat member di perpustakaan");
                                                    break;
                                                }

                                            } else {
                                                System.out.println("Tidak terdapat buku di perpustakaan");
                                                break;
                                            }
                                        } else if (confirm3.equals("2")) {
                                            laporanPeminjaman();

                                        } else if (confirm3.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);
                                } else if (menu.equals("4")) {
                                    System.out.println("|==============================================|");
                                    System.out.println("|            Transaksi Pengembalian            |");
                                    System.out.println("|==============================================|");
                                    System.out.println();
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|    Pilih Akses Data Pengembalian (1/2)    |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Pengembalian                     |");
                                        System.out.println("| 2. Lihat Data Pengembalian                |");
                                        System.out.println("| 3. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm4 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm4.equals("1")) {
                                            System.out.println("|======================================|");
                                            System.out.println("| Anda memasuki menu pengembalian buku |");
                                            System.out.println("|======================================|");
                                            System.out.println();
                                            if (peminjamanCount >= 0) {
                                                System.out.print("   Masukkan kode peminjam: ");
                                                cariNimPeminjam = pengembaliHuruf.nextLine();

                                                pengembalian();

                                            } else {
                                                System.out.println("|======================================|");
                                                System.out.println("|     Tidak ada buku yang dipinjam     |");
                                                System.out.println("|======================================|");
                                            }
                                        } else if (confirm4.equals("2")) {
                                            laporanPengembalian();
                                        } else if (confirm4.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println("Data yang anda masukkan salah!");
                                        }
                                    } while (true);

                                } else if (menu.equals("5")) {
                                    System.out.println("Masukkan NIM: ");
                                    String search = pengembaliHuruf.nextLine();
                                    boolean nimBayarDenda = false;
                                    for (int i = 0; i < memberArray.length; i++) {
                                        if (search.equalsIgnoreCase(memberArray[i][0])) {
                                            nimBayarDenda = true;
                                            System.out.println("NIM     : " + memberArray[i][0]);
                                            System.out.println("Nama    : " + memberArray[i][1]);
                                            System.out.println("Denda   : " + memberArray[i][2]);
                                            System.out.print("Masukkan nominal pembayaran: ");
                                            int bayar = konfirmasiAngka.nextInt();
                                            int dendaBayar = Integer.parseInt(memberArray[i][2]);
                                            int hasilBayar = dendaBayar - bayar;

                                            if (hasilBayar == 0) {
                                                System.out.println("Denda berhasil dibayar!");

                                            } else {
                                                System.out.println(
                                                        "Denda berhasil dibayar, denda tersisa Rp. " + hasilBayar);
                                            }
                                            memberArray[i][2] = String.valueOf(hasilBayar);
                                            dendaArray[dendaCount][0] = memberArray[i][0];
                                            dendaArray[dendaCount][1] = memberArray[i][1];
                                            dendaArray[dendaCount][2] = String.valueOf(dendaBayar);
                                            dendaArray[dendaCount][3] = String.valueOf(bayar);
                                            dendaArray[dendaCount][4] = String.valueOf(hasilBayar);
                                            dendaCount++;

                                        }
                                    }
                                    if (!nimBayarDenda) {
                                        System.out.println("Data tidak ditemukan");
                                    }
                                } else if (menu.equals("6")) {
                                    while (true) {
                                        System.out.println("|======================================|");
                                        System.out.println("|      Anda memasuki menu laporan      |");
                                        System.out.println("|======================================|");
                                        System.out.println("|        Silahkan pilih laporan        |");
                                        System.out.println("|      1. Laporan Peminjaman           |");
                                        System.out.println("|      2. Laporan pengembalian         |");
                                        System.out.println("|      3. Laporan Pembayaran denda     |");
                                        System.out.println("|      4. Kembali                      |");
                                        System.out.println("|======================================|");
                                        System.out.print("   Masukkan pilihan anda : ");
                                        String confirm6 = menuLap.nextLine();
                                        if (confirm6.equals("1")) {
                                            laporanPeminjaman();
                                        } else if (confirm6.equals("2")) {
                                            laporanPengembalian();
                                        } else if (confirm6.equals("3")) {
                                            laporanPembayaranDenda();
                                        } else if (confirm6.equals("4")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    }

                                } else if (menu.equals("7")) {
                                    System.out.println("|========================================|");
                                    System.out.println("|    Selamat datang di menu PENCARIAN    |");
                                    System.out.println("|========================================|");
                                    System.out.println(" 1. Ketik pencarian");
                                    System.out.println(" 2. pilih berdasarkan fitur");
                                    String pilihFitur = pilihFitur1.nextLine();
                                    if (pilihFitur.equals("1")) {
                                        System.out.println(" Ketik Pencarian anda ");
                                        String cari = scCari.nextLine();
                                        if (cari.equalsIgnoreCase("Cari pengguna yang belum membayar denda")
                                                || cari.equalsIgnoreCase("Caripenggunayangbelummembayardenda")
                                                || cari.equalsIgnoreCase("Pengguna yang belum membayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang belum membayarkan denda")
                                                || cari.equalsIgnoreCase("pengguna ga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang hutang ")
                                                || cari.equalsIgnoreCase("Pengguna nakal")
                                                || cari.equalsIgnoreCase("denda yang belum dibayarkan")
                                                || cari.equalsIgnoreCase("Pengguna ga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang ngga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna ngga bayar denda")) {

                                            PencarianPenggunaMemilikiDenda();
                                        }
                                    } else if (pilihFitur.equals("2")) {
                                        System.out.println("Silahkan pilih fitur pencarian");
                                        System.out.println("1. member yang memiliki tanggungan buku kembali");
                                        System.out.println("2");
                                        String cari = scCari.nextLine();
                                        if (cari.equalsIgnoreCase("1")) {
                                            PencarianPeminjaMemilikiTanggungan();
                                        } else if (cari.equalsIgnoreCase("2")) {
                                            cariTanggunganMember();
                                        }

                                    }

                                } else if (menu.equals("8")) {
                                    System.out.println("Apakah anda yakin akan keluar? (y/t): ");
                                    String keluar = pengembaliHuruf.nextLine();
                                    if (keluar.equalsIgnoreCase("y")) {
                                        break;
                                    } else if (keluar.equalsIgnoreCase("t")) {
                                        System.out.println();
                                        continue;
                                    } else {
                                        System.out.println();
                                        System.out.println("|============================================|");
                                        System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                        System.out.println("|============================================|");
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println("Pastikan anda memilih menu dengan benar :D");
                                }
                            } while (true);

                        } else {
                            System.out.println("Username dan password salah silahkan login kembali!");
                            System.out.println();
                        }
                    } else if (levelPengguna.equalsIgnoreCase("pengguna")) {
                        System.out.println("|===========================================|");
                        System.out.println("|      Silahkan login terlebih dahulu       |");
                        System.out.println("|         Username menggunakan NIM          |");
                        System.out.println("|         Password menggunakan Nama         |");
                        System.out.println("|===========================================|");
                        System.out.print("  Username: ");
                        username = login.nextLine();
                        System.out.print("  Password: ");
                        password = login.nextLine();
                        for (int i = 0; i < memberArray.length; i++) {
                            if (username.equals("pengguna") && password.equals("pengguna123")
                                    || username.equals(memberArray[i][0]) && password.equals(memberArray[i][1])) {
                                System.out.println("|===========================================|");
                                System.out.println("|       Anda hanya bisa mencari buku        |");
                                System.out.println("|===========================================|");

                                if (bukuArray != null) {
                                    do {
                                        System.out.println("1. Pilih menu pencarian ");
                                        System.out.println("2. keluar");
                                        String pilih = penggunaHuruf.nextLine();
                                        if (pilih.equalsIgnoreCase("1")) {
                                            System.out.println("1. Cari judul buku");
                                            System.out.println("2. cari Nama penulis buku");
                                            System.out.println("3. cari buku berdasarkan tahun");
                                            String pilih1 = penggunaHuruf.nextLine();

                                            if (pilih1.equalsIgnoreCase("1")) {
                                                System.out.println("  Masukkan judul buku yang ingin dicari: ");
                                                cariJudul = judul.nextLine();
                                                cariBukuJudul();

                                            } else if (pilih1.equalsIgnoreCase("2")) {
                                                System.out.println("Masukkan nama penulis buku");
                                                System.out.println("-----------------------");
                                                cariPenulisBuku = penggunaHuruf.nextLine();
                                                System.out.println("--------------------------");
                                                cariPenulisBuku();
                                            } else if (pilih1.equalsIgnoreCase("3")) {
                                                cariTahunBuku = penggunaHuruf.nextLine();
                                                cariTahunBuku();

                                            }
                                        } else if (pilih.equalsIgnoreCase("2")) {
                                            break;
                                        } else {
                                            System.out.println("Masukkan pilihan dengan benar! ");
                                        }

                                    } while (true);

                                } else if (bukuArray == null) {
                                    System.out.println("Tidak tersedia buku di perpustakaan");
                                    break;
                                }
                                break;

                            } else if (!username.equals("pengguna") && !password.equals("pengguna123")
                                    || !username.equals(memberArray[i][0]) && !password.equals(memberArray[i][1])) {
                                System.out.println("Username dan Password salah silahkan login kembali!");
                                System.out.println();
                                break;
                            } else {
                                System.out.println();
                                break;
                            }
                        }

                    } else if (levelPengguna.equalsIgnoreCase("Keluar")) {
                        System.out.println("Keluar ke menu utama? ya/tidak");
                        String pilih1 = peminjamHuruf.nextLine();
                        if (pilih1.equalsIgnoreCase("ya")) {
                            break;
                        } else if (pilih1.equalsIgnoreCase("tidak")) {

                        }
                    }
                } while (true);
            } else if (Bahasa.equalsIgnoreCase("2") || Bahasa.equalsIgnoreCase("English")
                    || Bahasa.equalsIgnoreCase("Bahasa Inggris")) {
                do {
                    System.out.println("|===========================================|");
                    System.out.println("|   Pilih level pengguna (admin/pengguna)   |");
                    System.out.println("|===========================================|");
                    System.out.println("| 1. Admin                                  |");
                    System.out.println("| 2. Pengguna                               |");
                    System.out.println("| 3. Keluar                                 |");
                    System.out.println("|===========================================|");
                    System.out.println();
                    System.out.print("   Pilihan anda: ");
                    levelPengguna = pilLevel.nextLine();
                    System.out.println();

                    if (levelPengguna.equalsIgnoreCase("admin")) {
                        System.out.println("|===========================================|");
                        System.out.println("|      Silahkan login terlebih dahulu       |");
                        System.out.println("|===========================================|");
                        System.out.println();
                        System.out.print("  Username: ");
                        username = login.nextLine();
                        System.out.print("  Password: ");
                        password = login.nextLine();
                        System.out.println();
                        if (username.equals("admin") && password.equals("admin123")
                                || username.equals("admin2") && password.equals("admin321")) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|        Berhasil masuk sebagai admin       |");
                                System.out.println("|===========================================|");
                                System.out.println("|      Silahkan pilih menu (1/2/3/4/5)      |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Data Buku                              |");
                                System.out.println("| 2. Data Member                            |");
                                System.out.println("| 3. Transaksi Peminjaman                   |");
                                System.out.println("| 4. Transaksi Pengembalian                 |");
                                System.out.println("| 5. Pembayaran Denda                       |");
                                System.out.println("| 6. Laporan                                |");
                                System.out.println("| 7. Pencarian                              |");
                                System.out.println("| 8. Keluar                                 |");
                                System.out.println("|===========================================|");
                                System.out.println();
                                System.out.print(" Pilihan anda: ");
                                String menu = konfirmasiHuruf.nextLine();
                                System.out.println();

                                if (menu.equals("1")) {
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|        Pilih Akses Data Buku (1/2)        |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Buku Baru                        |");
                                        System.out.println("| 2. Lihat semua buku                       |");
                                        System.out.println("| 3. Tambah stok                            |");
                                        System.out.println("| 4. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm1 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm1.equals("1")) {
                                            System.out.println("    Anda memasuki menu input buku");
                                            System.out.print("Masukkan kode buku: ");
                                            kodeBuku = bukuHuruf.nextLine();
                                            boolean cocokKodeBuku = false;
                                            for (int i = 0; i < bukuArray.length; i++) {
                                                if (kodeBuku.equals(bukuArray[i][0])) {
                                                    cocokKodeBuku = true;
                                                    System.out.println("Buku telah tersedia di Perpustakaan");
                                                    break;
                                                }
                                            }
                                            if (!cocokKodeBuku) {
                                                System.out.print("Masukkan judul buku: ");
                                                judulBuku = bukuHuruf.nextLine();
                                                System.out.print("Masukkan nama penulis: ");
                                                penulis = bukuHuruf.nextLine();
                                                System.out.print("Masukkan tahun terbit: ");
                                                tahunTerbit = bukuAngka.nextLine();
                                                System.out.print("Masukkan jumlah buku: ");
                                                jumlahBuku = bukuAngka.nextLine();
                                                System.out.println();
                                                bukuArray[bukucount][0] = kodeBuku;
                                                bukuArray[bukucount][1] = judulBuku;
                                                bukuArray[bukucount][2] = penulis;
                                                bukuArray[bukucount][3] = tahunTerbit;
                                                bukuArray[bukucount][4] = jumlahBuku;
                                                bukuArray[bukucount][5] = bukuArray[bukucount][4];
                                                bukucount++;
                                            }

                                        } else if (confirm1.equals("2")) {
                                            // for (int i = 0; i < bukucount; i++) {
                                            tampilBuku();

                                        } else if (confirm1.equals("3")) {
                                            tambahStok();
                                        } else if (confirm1.equals("4")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);

                                } else if (menu.equals("2")) {
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|       Pilih Akses Data Member (1/2)       |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Member Baru                      |");
                                        System.out.println("| 2. Lihat semua member                     |");
                                        System.out.println("| 3. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        System.out.println();
                                        String confirm2 = konfirmasiHuruf.nextLine();
                                        if (confirm2.equals("1")) {
                                            System.out.println("       Input Member");
                                            System.out.print("Masukkan NIM: ");
                                            nim = memberSH.nextLine();
                                            boolean CocokNim = false;
                                            for (int i = 0; i < memberArray.length; i++) {
                                                if (nim.equalsIgnoreCase(memberArray[i][0])) {
                                                    CocokNim = true;
                                                    System.out.println("Nim sudah terdaftar");
                                                }
                                            }
                                            if (!CocokNim) {
                                                System.out.print("Masukkan Nama: ");
                                                nama = memberSH.nextLine();
                                                memberArray[membercount][0] = nim;
                                                memberArray[membercount][1] = nama;
                                                memberArray[membercount][2] = String.valueOf(dendaa);
                                                memberArray[membercount][3] = String.valueOf(totalPinjam);
                                                membercount++;
                                            }
                                            System.out.println();
                                        } else if (confirm2.equals("2")) {
                                            tampilMember();
                                        } else if (confirm2.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);

                                } else if (menu.equals("3")) {
                                    do {
                                        System.out.println("|=============================================|");
                                        System.out.println("|      Pilih Akses Data Peminjaman (1/2)      |");
                                        System.out.println("|=============================================|");
                                        System.out.println("|       1. Input Peminjaman                   |");
                                        System.out.println("|       2. Lihat Data Peminjaman              |");
                                        System.out.println("|       3. Kembali                            |");
                                        System.out.println("|=============================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm3 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm3.equals("1")) {
                                            System.out.println("|=============================================|");
                                            System.out.println("|      Anda memasuki menu peminjaman buku     |");
                                            System.out.println("|=============================================|");
                                            if (bukuArray != null) {
                                                if (memberArray != null) {
                                                    for (int i = 0; i < peminjamArray.length;) {

                                                        System.out
                                                                .print("Apakah sudah terdaftar sebagai member?(y/t): ");
                                                        String tanyaDaftar = peminjamHuruf.nextLine();
                                                        System.out.println();
                                                        if (tanyaDaftar.equalsIgnoreCase("y")) {
                                                            do {
                                                                System.out.print("Masukkan NIM peminjaman: ");
                                                                cariNim = peminjamHuruf.nextLine();
                                                                peminjaman();

                                                                break;
                                                            } while (true);

                                                        } else {
                                                            System.out.println("Silahkan daftar terlebih dahulu");
                                                            break;
                                                        }
                                                        break;

                                                    }
                                                } else {
                                                    System.out.println("Tidak terdapat member di perpustakaan");
                                                    break;
                                                }

                                            } else {
                                                System.out.println("Tidak terdapat buku di perpustakaan");
                                                break;
                                            }
                                        } else if (confirm3.equals("2")) {
                                            laporanPeminjaman();

                                        } else if (confirm3.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    } while (true);
                                } else if (menu.equals("4")) {
                                    System.out.println("|==============================================|");
                                    System.out.println("|            Transaksi Pengembalian            |");
                                    System.out.println("|==============================================|");
                                    System.out.println();
                                    do {
                                        System.out.println("|===========================================|");
                                        System.out.println("|    Pilih Akses Data Pengembalian (1/2)    |");
                                        System.out.println("|===========================================|");
                                        System.out.println("| 1. Input Pengembalian                     |");
                                        System.out.println("| 2. Lihat Data Pengembalian                |");
                                        System.out.println("| 3. Kembali                                |");
                                        System.out.println("|===========================================|");
                                        System.out.println();
                                        System.out.print("  Pilihan anda: ");
                                        String confirm4 = konfirmasiHuruf.nextLine();
                                        System.out.println();
                                        if (confirm4.equals("1")) {
                                            System.out.println("|======================================|");
                                            System.out.println("| Anda memasuki menu pengembalian buku |");
                                            System.out.println("|======================================|");
                                            System.out.println();
                                            if (peminjamanCount >= 0) {
                                                System.out.print("   Masukkan kode peminjam: ");
                                                cariNimPeminjam = pengembaliHuruf.nextLine();

                                                pengembalian();

                                            } else {
                                                System.out.println("|======================================|");
                                                System.out.println("|     Tidak ada buku yang dipinjam     |");
                                                System.out.println("|======================================|");
                                            }
                                        } else if (confirm4.equals("2")) {
                                            laporanPengembalian();
                                        } else if (confirm4.equals("3")) {
                                            break;
                                        } else {
                                            System.out.println("Data yang anda masukkan salah!");
                                        }
                                    } while (true);

                                } else if (menu.equals("5")) {
                                    System.out.println("Masukkan NIM: ");
                                    String search = pengembaliHuruf.nextLine();
                                    boolean nimBayarDenda = false;
                                    for (int i = 0; i < memberArray.length; i++) {
                                        if (search.equalsIgnoreCase(memberArray[i][0])) {
                                            nimBayarDenda = true;
                                            System.out.println("NIM     : " + memberArray[i][0]);
                                            System.out.println("Nama    : " + memberArray[i][1]);
                                            System.out.println("Denda   : " + memberArray[i][2]);
                                            System.out.print("Masukkan nominal pembayaran: ");
                                            int bayar = konfirmasiAngka.nextInt();
                                            int dendaBayar = Integer.parseInt(memberArray[i][2]);
                                            int hasilBayar = dendaBayar - bayar;

                                            if (hasilBayar == 0) {
                                                System.out.println("Denda berhasil dibayar!");

                                            } else {
                                                System.out.println(
                                                        "Denda berhasil dibayar, denda tersisa Rp. " + hasilBayar);
                                            }
                                            memberArray[i][2] = String.valueOf(hasilBayar);
                                            dendaArray[dendaCount][0] = memberArray[i][0];
                                            dendaArray[dendaCount][1] = memberArray[i][1];
                                            dendaArray[dendaCount][2] = String.valueOf(dendaBayar);
                                            dendaArray[dendaCount][3] = String.valueOf(bayar);
                                            dendaArray[dendaCount][4] = String.valueOf(hasilBayar);
                                            dendaCount++;

                                        }
                                    }
                                    if (!nimBayarDenda) {
                                        System.out.println("Data tidak ditemukan");
                                    }
                                } else if (menu.equals("6")) {
                                    while (true) {
                                        System.out.println("|======================================|");
                                        System.out.println("|      Anda memasuki menu laporan      |");
                                        System.out.println("|======================================|");
                                        System.out.println("|        Silahkan pilih laporan        |");
                                        System.out.println("|      1. Laporan Peminjaman           |");
                                        System.out.println("|      2. Laporan pengembalian         |");
                                        System.out.println("|      3. Laporan Pembayaran denda     |");
                                        System.out.println("|      4. Kembali                      |");
                                        System.out.println("|======================================|");
                                        System.out.print("   Masukkan pilihan anda : ");
                                        String confirm6 = menuLap.nextLine();
                                        if (confirm6.equals("1")) {
                                            laporanPeminjaman();
                                        } else if (confirm6.equals("2")) {
                                            laporanPengembalian();
                                        } else if (confirm6.equals("3")) {
                                            laporanPembayaranDenda();
                                        } else if (confirm6.equals("4")) {
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("|============================================|");
                                            System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                            System.out.println("|============================================|");
                                            System.out.println();
                                        }
                                    }

                                } else if (menu.equals("7")) {
                                    System.out.println("|========================================|");
                                    System.out.println("|    Selamat datang di menu PENCARIAN    |");
                                    System.out.println("|========================================|");
                                    System.out.println(" 1. Ketik pencarian");
                                    System.out.println(" 2. pilih berdasarkan fitur");
                                    String pilihFitur = pilihFitur1.nextLine();
                                    if (pilihFitur.equals("1")) {
                                        System.out.println(" Ketik Pencarian anda ");
                                        String cari = scCari.nextLine();
                                        if (cari.equalsIgnoreCase("Cari pengguna yang belum membayar denda")
                                                || cari.equalsIgnoreCase("Caripenggunayangbelummembayardenda")
                                                || cari.equalsIgnoreCase("Pengguna yang belum membayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang belum membayarkan denda")
                                                || cari.equalsIgnoreCase("pengguna ga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang hutang ")
                                                || cari.equalsIgnoreCase("Pengguna nakal")
                                                || cari.equalsIgnoreCase("denda yang belum dibayarkan")
                                                || cari.equalsIgnoreCase("Pengguna ga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna yang ngga bayar denda")
                                                || cari.equalsIgnoreCase("Pengguna ngga bayar denda")) {

                                            PencarianPenggunaMemilikiDenda();
                                        }
                                    } else if (pilihFitur.equals("2")) {
                                        System.out.println("Silahkan pilih fitur pencarian");
                                        System.out.println("1. member yang memiliki tanggungan buku kembali");
                                        System.out.println("2");
                                        String cari = scCari.nextLine();
                                        if (cari.equalsIgnoreCase("1")) {
                                            PencarianPeminjaMemilikiTanggungan();
                                        } else if (cari.equalsIgnoreCase("2")) {
                                            cariTanggunganMember();
                                        }

                                    }

                                } else if (menu.equals("8")) {
                                    System.out.println("Apakah anda yakin akan keluar? (y/t): ");
                                    String keluar = pengembaliHuruf.nextLine();
                                    if (keluar.equalsIgnoreCase("y")) {
                                        break;
                                    } else if (keluar.equalsIgnoreCase("t")) {
                                        System.out.println();
                                        continue;
                                    } else {
                                        System.out.println();
                                        System.out.println("|============================================|");
                                        System.out.println("|   Mohon masukkan pilihan dengan benar :D   |");
                                        System.out.println("|============================================|");
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println("Pastikan anda memilih menu dengan benar :D");
                                }
                            } while (true);

                        } else {
                            System.out.println("Username dan password salah silahkan login kembali!");
                            System.out.println();
                        }
                    } else if (levelPengguna.equalsIgnoreCase("pengguna")) {
                        System.out.println("|===========================================|");
                        System.out.println("|      Silahkan login terlebih dahulu       |");
                        System.out.println("|         Username menggunakan NIM          |");
                        System.out.println("|         Password menggunakan Nama         |");
                        System.out.println("|===========================================|");
                        System.out.print("  Username: ");
                        username = login.nextLine();
                        System.out.print("  Password: ");
                        password = login.nextLine();
                        for (int i = 0; i < memberArray.length; i++) {
                            if (username.equals("pengguna") && password.equals("pengguna123")
                                    || username.equals(memberArray[i][0]) && password.equals(memberArray[i][1])) {
                                System.out.println("|===========================================|");
                                System.out.println("|       Anda hanya bisa mencari buku        |");
                                System.out.println("|===========================================|");

                                if (bukuArray != null) {
                                    do {
                                        System.out.println("1. Pilih menu pencarian ");
                                        System.out.println("2. keluar");
                                        String pilih = penggunaHuruf.nextLine();
                                        if (pilih.equalsIgnoreCase("1")) {
                                            System.out.println("1. Cari judul buku");
                                            System.out.println("2. cari Nama penulis buku");
                                            System.out.println("3. cari buku berdasarkan tahun");
                                            String pilih1 = penggunaHuruf.nextLine();

                                            if (pilih1.equalsIgnoreCase("1")) {
                                                System.out.println("  Masukkan judul buku yang ingin dicari: ");
                                                cariJudul = judul.nextLine();
                                                cariBukuJudul();

                                            } else if (pilih1.equalsIgnoreCase("2")) {
                                                System.out.println("Masukkan nama penulis buku");
                                                System.out.println("-----------------------");
                                                cariPenulisBuku = penggunaHuruf.nextLine();
                                                System.out.println("--------------------------");
                                                cariPenulisBuku();
                                            } else if (pilih1.equalsIgnoreCase("3")) {
                                                cariTahunBuku = penggunaHuruf.nextLine();
                                                cariTahunBuku();

                                            }
                                        } else if (pilih.equalsIgnoreCase("2")) {
                                            break;
                                        } else {
                                            System.out.println("Masukkan pilihan dengan benar! ");
                                        }

                                    } while (true);

                                } else if (bukuArray == null) {
                                    System.out.println("Tidak tersedia buku di perpustakaan");
                                    break;
                                }
                                break;

                            } else if (!username.equals("pengguna") && !password.equals("pengguna123")
                                    || !username.equals(memberArray[i][0]) && !password.equals(memberArray[i][1])) {
                                System.out.println("Username dan Password salah silahkan login kembali!");
                                System.out.println();
                                break;
                            } else {
                                System.out.println();
                                break;
                            }
                        }

                    } else if (levelPengguna.equalsIgnoreCase("Keluar") || levelPengguna.equalsIgnoreCase("3")) {
                        System.out.println("Keluar ke menu utama? ya/tidak");
                        String pilih1 = peminjamHuruf.nextLine();
                        if (pilih1.equalsIgnoreCase("ya")) {
                            break;
                        } else if (pilih1.equalsIgnoreCase("tidak")) {
                        }
                    }
                } while (true);
            } else {
                System.out.println("Masukkan pilihan dengan benar");
            }
        } while (true);

    }

    static void tampilBuku() {
        if (bukuArray != null) {

            for (int j = 0; j < bukucount; j++) {
                System.out.println();
                System.out.println(" _________________________________________________________");
                System.out.printf("| Buku ke-%-35s|\n", (j + 1));
                System.out.printf("|   Kode buku                   : %-25s|\n", bukuArray[j][0]);
                System.out.printf("|   Judul buku                  : %-25s|\n", bukuArray[j][1]);
                System.out.printf("|   Penulis                     : %-25s|\n", bukuArray[j][2]);
                System.out.printf("|   Tahun terbit                : %-25s|\n", bukuArray[j][3]);
                System.out.printf("|   Jumlah buku  Awal           : %-25s|\n", bukuArray[j][4]);
                System.out.printf("|   Jumlah buku  Bisa dipinjam  : %-25s|\n", bukuArray[j][5]);
                System.out.println("|_________________________________________________________|");
                System.out.println();

            }
            System.out.println("cari buku? (ya/tidak)");
            String pilih = scCari.nextLine();
            if (pilih.equalsIgnoreCase("ya")) {

                System.out.println(" 1.Cari berdasarkan judul Buku");
                System.out.println(" 2.Cari berdasarkan kode buku");
                System.out.println(" 3.Cari berdasarkan penulis");
                System.out.println(" 4.Cari berdasarkan tahun terbit");
                System.out.println(" 5.Cari buku yang sedang dipinjam ");
                String pilih1 = scCari.nextLine();
                if (pilih1.equalsIgnoreCase("1")) {
                    System.out.println("Masukkan judul buku yang ingin dicari");
                    cariJudul = scCari.nextLine();
                    cariBukuJudul();
                } else if (pilih1.equalsIgnoreCase("2")) {
                    System.out.println("Masukkan kode buku yang ingin dicari");
                    cariKodeBuku = scCari.nextLine();
                    cariKodeBuku();
                } else if (pilih1.equalsIgnoreCase("3")) {
                    System.out.println("Masukkan nama penulis yang ingin dicari");
                    cariPenulisBuku = scCari.nextLine();
                    cariPenulisBuku();
                } else if (pilih1.equalsIgnoreCase("4")) {
                    System.out.println("Masukkan tahun terbit buku yang ingin dicari");
                    cariTahunBuku = scCari.nextLine();
                    cariTahunBuku();
                } else if (pilih1.equalsIgnoreCase("5")) {
                    System.out.println("Data buku yang sedang dipinjam :");
                    cariBukuDiPinjam();
                } else {
                    System.out.println("Masukkan pilihan dengan benar");
                }
            }
        } else {
            System.out.println("Data buku kosong ");
        }
    }

    static void tampilMember() {

        if (membercount > 0) {

            for (int i = 0; i < membercount; i++) {
                System.out.println(" ____________________________________________ ");
                System.out.printf("| Member ke-%-33s|\n", (i + 1));
                System.out.printf("|   NIM         : %-27s|\n", memberArray[i][0]);
                System.out.printf("|   Nama        : %-27s|\n", memberArray[i][1]);
                System.out.printf("|   Total Denda : %-27s|\n", memberArray[i][2]);
                System.out.printf("|   Total Pinjam: %-27s|\n", memberArray[i][3]);
                System.out.println("|____________________________________________|");
                System.out.println();

            }
            System.out.println("Ingin cari member? (y/t)");
            String pilih = scCari.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                cariMember();
            } else if (pilih.equalsIgnoreCase("t"))
                ;
        } else {
            System.out.println("Data member kosong");
            System.out.println();
        }
    }

    static void peminjaman() {

        boolean nimketemu = false;
        for (int i = 0; i < membercount; i++) {
            if (memberArray[i][0].equalsIgnoreCase(cariNim)) {

                peminjamArray[peminjamanCount][0] = cariNim;
                nimketemu = true;
                System.out.println("Nama: " + memberArray[i][1]);
                peminjamArray[peminjamanCount][1] = memberArray[i][1];
                cariBukuKode(peminjamanCount);
            }
        }
        // if (nimketemu) {
        //

        // }
        if (!nimketemu) {
            System.out.println("NIM tidak ditemukan");
        }

    }

    static void cariBukuJudul() {
        boolean cariBuku = false;
        for (int a = 0; a < bukucount; a++) {
            if (bukuArray[a][1].equalsIgnoreCase(cariJudul)) {
                cariBuku = true;
                tampilBukuYangDiCari(a);
            }
        }
        if (!cariBuku) {
            System.out.println("Data buku tidak ditemukan");
        }
    }

    static void cariKodeBuku() {
        boolean cariKodee = false;
        for (int i = 0; i < bukucount; i++) {
            if (bukuArray[i][0].equalsIgnoreCase(cariKodeBuku)) {
                cariKodee = true;
                tampilBukuYangDiCari(i);
                System.out.println("Tampilkan data peminjam buku? (ya/tidak)");
                String pilih = scCari.nextLine();
                if (pilih.equalsIgnoreCase("ya")) {
                    tampilPeminjam1(i);
                } else if (pilih.equalsIgnoreCase("tidak")) {
                } else {
                    System.out.println("Masukkan pilihan dengan benar");
                }
            }
        }
        if (!cariKodee) {
            System.out.println("data buku tidak tersedia");
        }
    }

    static void cariPenulisBuku() {
        boolean cariKodee = false;
        for (int i = 0; i < bukucount; i++) {
            if (bukuArray[i][2].equalsIgnoreCase(cariPenulisBuku)) {
                cariKodee = true;
                tampilBukuYangDiCari(i);
            }
        }
        if (!cariKodee) {
            System.out.println("data buku tidak tersedia");
        }
    }

    static void cariTahunBuku() {
        boolean cariKodee = false;
        for (int i = 0; i < bukucount; i++) {
            if (bukuArray[i][3].equalsIgnoreCase(cariTahunBuku)) {
                cariKodee = true;
                tampilBukuYangDiCari(i);
            }
        }
        if (!cariKodee) {
            System.out.println("data buku tidak tersedia");
        }
    }

    static void cariBukuDiPinjam() {
        boolean cariDiPinjam = false;
        for (int i = 0; i < bukucount; i++) {
            if (Integer.parseInt(bukuArray[i][5]) < Integer.parseInt(bukuArray[i][4])) {
                cariDiPinjam = true;
                int totalDiPinjam = Integer.parseInt(bukuArray[i][4]) - Integer.parseInt(bukuArray[i][5]);
                System.out.println("|-------------------------------------------------------|");
                System.out.println("                       buku ke-" + (i + 1));
                System.out.println("|-------------------------------------------------------|");
                System.out.println("Kode buku               : " + bukuArray[i][0]);
                System.out.println("Judul buku              : " + bukuArray[i][1]);
                System.out.println("Total buku di pinjam    : " + String.valueOf(totalDiPinjam));
                System.out.println("|-------------------------------------------------------|");
            }
            System.out.println("Tampilkan peminjam? (ya/tidak)");
            String pilih = scCari.nextLine();
            if (pilih.equalsIgnoreCase("ya")) {
                tampilPeminjam1(i);
            } else if (pilih.equalsIgnoreCase("tidak")) {
            } else {
                System.out.println("Masukkan pilihan dengan benar!");
            }

        }
        if (!cariDiPinjam) {
            System.out.println("Tidak ada buku yang sedang dipinjam");
        }
    }

    static void tampilBukuYangDiCari(int index) {
        System.out.println();
        System.out.println(" _________________________________________________________");
        System.out.printf("|                                                         |\n");
        System.out.printf("|  Kode buku                   : %-25s|\n", bukuArray[index][0]);
        System.out.printf("|  Judul buku                  : %-25s|\n", bukuArray[index][1]);
        System.out.printf("|  Penulis                     : %-25s|\n", bukuArray[index][2]);
        System.out.printf("|  Tahun terbit                : %-25s|\n", bukuArray[index][3]);
        System.out.printf("|  Jumlah buku  Awal           : %-25s|\n", bukuArray[index][4]);
        System.out.printf("|  Jumlah buku  Bisa dipinjam  : %-25s|\n", bukuArray[index][5]);
        System.out.println("|_________________________________________________________|");
        System.out.println();
    }

    static void tampilPeminjam1(int i) {
        boolean cocokPeminjam = false;
        for (int j = 0; j < peminjamanCount; j++) {
            if (bukuArray[i][0].equalsIgnoreCase(peminjamArray[j][2])) {
                System.out.println("                      Data peminjam");
                System.out.println("|-------------------------------------------------------|");
                System.out.println("Nim peminjam buku       : " + peminjamArray[j][0]);
                System.out.println("Nama peminjam buku      : " + peminjamArray[j][1]);
                System.out.println("Banyaknya meminjam buku : " + peminjamArray[j][10]);
                System.out.println("|-------------------------------------------------------|");
            }
        }
    }

    static void cariBukuKode(int indexNim) {
        System.out.print("Masukkan kode buku: ");
        cariKode = peminjamHuruf.nextLine();
        boolean cariCode = false;
        for (int b = 0; b < bukucount; b++) {
            if (bukuArray[b][0].equalsIgnoreCase(cariKode)) {
                // nama1 = bukuArray[b][1];
                cariCode = true;
                System.out.println("Kode Buku    : " + bukuArray[b][0]);
                System.out.println("Judul Buku   : " + bukuArray[b][1]);
                System.out.println("Nama Penulis : " + bukuArray[b][2]);
                System.out.println("Tahun terbit : " + bukuArray[b][3]);
                System.out.println("Stok buku    : " + bukuArray[b][5]);

                System.out.print("Masukkan jumlah: ");
                jmlPinjam = peminjamHuruf.nextLine();

                int stok = hitungJumlah(Integer.parseInt(jmlPinjam), b);
                System.out.println("Stok buku sisa: " + stok);

                Date currentDate = new Date();
                // Membuat objek Calendar
                Calendar calendar = Calendar.getInstance();

                // Menetapkan waktu awal menggunakan waktu saat ini
                calendar.setTime(currentDate);

                Date tenggat = calendar.getTime();
                System.out.println("Buku di pinjam pada tanggal " + tenggat);
                System.out.println("Transaksi peminjaman Berhasil! ");
                status = "Dipinjam";
                String NomorPeminjaman = String.valueOf(kodePinjam);
                boolean cocokanNim = false;
                for (int j = 0; j < membercount; j++) {
                    if (peminjamArray[indexNim][0].equalsIgnoreCase(memberArray[j][0])) {
                        cocokanNim = true;
                        int totalPinjamMember = Integer.parseInt(memberArray[j][3]);
                        totalPinjamMember += Integer.parseInt(jmlPinjam);
                        memberArray[j][3] = String.valueOf(totalPinjamMember);
                    }
                }
                if (!cocokanNim) {
                    System.out.println("Tidak bisa di hubungkan");
                }
                peminjamArray[peminjamanCount][2] = bukuArray[b][0]; // Kode Buku
                peminjamArray[peminjamanCount][3] = bukuArray[b][1]; // Judul Buku
                peminjamArray[peminjamanCount][4] = bukuArray[b][2]; // Nama Penulis
                peminjamArray[peminjamanCount][5] = bukuArray[b][3]; // Tahun Terbit
                // peminjamArray[peminjamanCount][6] = bukuArray[b][4]; // Stok Buku
                peminjamArray[peminjamanCount][6] = jmlPinjam; // Jumlah yang Dipinjam
                peminjamArray[peminjamanCount][7] = tenggat.toString(); // Tanggal Tenggat
                peminjamArray[peminjamanCount][8] = status;
                peminjamArray[peminjamanCount][9] = NomorPeminjaman;
                peminjamArray[peminjamanCount][10] = peminjamArray[peminjamanCount][6];
                System.out.print("Apakah anda ingin cetak struk (y/t)?: ");
                String kondisi = peminjamHuruf.nextLine();
                System.out.println();
                if (kondisi.equalsIgnoreCase("y")) {
                    cetakStruk();
                } else {

                }
                kodePinjam++;
                peminjamanCount++;
                break;
            }
        }
        if (!cariCode) {
            System.out.println("|============================|");
            System.out.println("|    Buku tidak ditemukan!   |");
            System.out.println("|============================|");
        }
    }

    static int hitungJumlah(int jumlahPinjam, int index) {

        int stock = Integer.parseInt(bukuArray[index][5]);
        if (stock >= jumlahPinjam) {
            stock -= jumlahPinjam;
        } else {
            System.out.println("Stok buku tidak mencukupi");
        }
        bukuArray[index][5] = String.valueOf(stock);
        return stock;
    }

    static void tambahStok() {
        String kodeTambahBuku;
        System.out.print("Masukkan kode buku: ");
        kodeTambahBuku = tambahStokHuruf.nextLine();
        boolean carikodetambah = false;
        for (int i = 0; i < bukucount; i++) {
            if (bukuArray[i][0].equalsIgnoreCase(kodeTambahBuku)) {
                carikodetambah = true;

                System.out.println("|=============================================|");
                System.out.printf("|   Kode buku                   : %-25s|\n", bukuArray[i][0]);
                System.out.printf("|   Judul buku                  : %-25s|\n", bukuArray[i][1]);
                System.out.printf("|   Penulis                     : %-25s|\n", bukuArray[i][2]);
                System.out.printf("|   Tahun terbit                : %-25s|\n", bukuArray[i][3]);
                System.out.printf("|   Jumlah buku Awal            : %-25s|\n", bukuArray[i][4]);
                System.out.printf("|   Jumlah buku Bisa dipinjam   : %-25s|\n", bukuArray[i][5]);
                System.out.println("|=============================================|");
                System.out.println();

                System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
                String jumlahTmbhStok = tambahStokHuruf.nextLine();

                if (jumlahTmbhStok != null && !jumlahTmbhStok.isEmpty()) {
                    // Update stok buku
                    int stokAkhir1 = jumlahTmbhStok1(Integer.parseInt(jumlahTmbhStok), i);
                    bukuArray[i][4] = String.valueOf(stokAkhir1);
                    int stokAkhir2 = jumlahTmbhStok2(Integer.parseInt(jumlahTmbhStok), i);
                    bukuArray[i][5] = String.valueOf(stokAkhir2);
                    System.out.println("Stok berhasil ditambahkan!");
                } else {
                    System.out.println("Input jumlah stok tidak valid!");
                }
                break;
            }
        }
        if (!carikodetambah) {
            System.out.println("|========================|");
            System.out.println("|  Buku tidak ditemukan  |");
            System.out.println("|========================|");
        }
    }

    static int jumlahTmbhStok1(int jumlahTmbhStok, int index) {
        int jmlhBuku1 = Integer.parseInt(bukuArray[index][4]);
        jmlhBuku1 += jumlahTmbhStok;
        return jmlhBuku1;
    }

    static int jumlahTmbhStok2(int jumlahTmbhStok, int index) {
        int jmlhBuku2 = Integer.parseInt(bukuArray[index][5]);
        jmlhBuku2 += jumlahTmbhStok;
        return jmlhBuku2;
    }

    static void cetakStruk() {

        System.out.println("|==========================================================|");
        System.out.printf("| Kode peminjaman : %-39s|\n", peminjamArray[peminjamanCount][9]);
        System.out.printf("| Nim peminjam    : %-39s|\n", peminjamArray[peminjamanCount][0]);
        System.out.printf("| Nama peminjam   : %-39s|\n", peminjamArray[peminjamanCount][1]);
        System.out.printf("| Kode buku       : %-39s|\n", peminjamArray[peminjamanCount][2]);
        System.out.printf("| Judul buku      : %-39s|\n", peminjamArray[peminjamanCount][3]);
        System.out.printf("| Nama Penulis    : %-39s|\n", peminjamArray[peminjamanCount][4]);
        System.out.printf("| Tahun terbit    : %-39s|\n", peminjamArray[peminjamanCount][5]);
        System.out.printf("| Jumlah          : %-39s|\n", peminjamArray[peminjamanCount][6]);
        System.out.printf("| Tanggal pinjam  : %-39s|\n", peminjamArray[peminjamanCount][7]);
        System.out.println("|==========================================================|");
        System.out.println();

    }

    static void laporanPeminjaman() {
        System.out.println("|=============================================|");
        System.out.println("|              Data Peminjaman                |");
        System.out.println("|=============================================|");
        if (peminjamanCount > 0) {

            for (int l = 0; l < peminjamanCount; l++) {
                if (peminjamArray[l][0] != null) {
                    System.out.println("|==============================================|");
                    System.out.printf("|   Data peminjaman ke-%-24s|\n", (l + 1));
                    System.out.println("|==============================================|");
                    System.out.printf("| Kode Pinjam    : %-28s|\n", peminjamArray[l][9]);
                    System.out.printf("| Nim            : %-28s|\n", peminjamArray[l][0]);
                    System.out.printf("| Nama           : %-28s|\n", peminjamArray[l][1]);
                    System.out.printf("| Kode Buku      : %-28s|\n", peminjamArray[l][2]);
                    System.out.printf("| Judul          : %-28s|\n", peminjamArray[l][3]);
                    System.out.printf("| Penulis        : %-28s|\n", peminjamArray[l][4]);
                    System.out.printf("| Tahun Terbit   : %-28s|\n", peminjamArray[l][5]);
                    System.out.printf("| Jumlah         : %-28s|\n", peminjamArray[l][6]);
                    System.out.printf("| sisa tanggungan: %-28s|\n", peminjamArray[l][10]);
                    System.out.printf("| Tanggal        : %-28s|\n", peminjamArray[l][7]);
                    System.out.printf("| Status         : %-28s|\n", peminjamArray[l][8]);

                    System.out.println("|==============================================|");
                    System.out.println();

                } else {
                    break;
                }

            }
            System.out.println();

        } else if (peminjamanCount == 0) {
            System.out.println("|=============================================|");
            System.out.println("|        Data Peminjaman Tidak Tersedia       |");
            System.out.println("|=============================================|");
        }
    }

    static void pengembalian() {

        boolean nimpengembalian = false;
        for (int i = 0; i < peminjamanCount; i++) {
            if (peminjamArray[i][9].equalsIgnoreCase(cariNimPeminjam)) {
                int bukuPinjam = Integer.parseInt(peminjamArray[i][6]);
                nimpengembalian = true;
                // if (nimketemu) {
                if (bukuPinjam > 0) {
                    System.out.println("Nama          : " + peminjamArray[i][1]);
                    System.out.println("Nim           : " + peminjamArray[i][0]);
                    System.out.println("Kode Buku     : " + peminjamArray[i][2]);
                    System.out.println("Judul Buku    : " + peminjamArray[i][3]);
                    System.out.println("Penulis Buku  : " + peminjamArray[i][4]);
                    System.out.println("Tahun Terbit  : " + peminjamArray[i][5]);
                    System.out.println("Jumlah        : " + peminjamArray[i][10]);
                    System.out.println("Tgl pinjam    : " + peminjamArray[i][7]);
                    System.out.println();
                    System.out.print("Masukkan jumlah buku yang dikembalikan : ");
                    String jumlahBukuKembali = pengembaliHuruf.nextLine();
                    int bukuKurang = hitungBukuKembali(Integer.parseInt(jumlahBukuKembali), i);
                    pengembaliArray[pengembaliCount][1] = peminjamArray[i][1];
                    pengembaliArray[pengembaliCount][0] = peminjamArray[i][0];
                    pengembaliArray[pengembaliCount][2] = peminjamArray[i][2];
                    pengembaliArray[pengembaliCount][3] = peminjamArray[i][3];
                    pengembaliArray[pengembaliCount][4] = peminjamArray[i][4];
                    pengembaliArray[pengembaliCount][5] = peminjamArray[i][5];
                    pengembaliArray[pengembaliCount][6] = peminjamArray[i][6];
                    pengembaliArray[pengembaliCount][9] = peminjamArray[i][9];
                    pengembaliArray[pengembaliCount][10] = jumlahBukuKembali;

                    System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
                    Date tanggalPinjam = masukkanTanggal(tanggalDenda);

                    System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
                    Date tanggalKembali = masukkanTanggal(tanggalDenda);
                    pengembaliArray[pengembaliCount][7] = tanggalKembali.toString();

                    long selisihHari = hitungSelisihHari(tanggalPinjam, tanggalKembali);

                    if (selisihHari <= 7) {
                        System.out.println("|===========================================|");
                        System.out.println("|  Buku berhasil dikembalikan tepat waktu.  |");
                        System.out.println("|===========================================|");
                    } else if (selisihHari > 7) {
                        System.out.println();
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Berapa lama hari dipinjam adalah: " + selisihHari + " hari");
                        long totalDenda = (selisihHari - 7) * 1000;
                        System.out.println("--------------------------------------------------------");
                        System.out.println("       Note!           ");
                        System.out.println("    Lama hari terlambat: " + (selisihHari - 7) + " hari");
                        System.out.println("    Denda yang harus dibayar: Rp " + totalDenda);
                        System.out.println("--------------------------------------------------------");

                        for (int j = 0; j < memberArray.length; j++) {
                            if (peminjamArray[i][0].equalsIgnoreCase(memberArray[j][0])) {
                                long dendaTersedia = Long.parseLong(memberArray[j][2]);
                                long dendaYangHarusDibayar = dendaTersedia + totalDenda;
                                memberArray[j][2] = String.valueOf(dendaYangHarusDibayar);
                            }
                        }

                    }

                    if (bukuKurang == 0) {
                        System.out.println("Buku berhasil dikembalikan ");
                        peminjamArray[i][8] = "Kembali";
                        pengembaliArray[pengembaliCount][8] = peminjamArray[i][8];
                        pengembaliCount++;
                    } else if (bukuKurang > 0) {
                        System.out.println("Buku berhasil dikembalikan ");
                        System.out.println(" Member " + peminjamArray[i][1]
                                + " memiliki tanggungan buku yang belum dikembalikan berjumlah -" + bukuKurang);
                        peminjamArray[i][8] = "Memiliki tanggungan buku kembali";
                        pengembaliArray[pengembaliCount][8] = peminjamArray[i][8];
                        pengembaliCount++;
                    }
                    for (int k = 0; k < bukuArray.length; k++) {
                        if (peminjamArray[i][2].equalsIgnoreCase(bukuArray[k][0])) {
                            int stokKembali = hitungStokKembali(Integer.parseInt(peminjamArray[i][6]),
                                    Integer.parseInt(jumlahBukuKembali), k);
                            bukuArray[k][5] = String.valueOf(stokKembali);
                        }
                    }
                    int kurangJumlahPinjam = kurangStokPinjam(Integer.parseInt(jumlahBukuKembali), i);
                    peminjamArray[i][10] = String.valueOf(kurangJumlahPinjam);

                    break;
                } else if (bukuPinjam == 0) {
                    System.out.println("Buku telah dikembalikan");
                }

            }
        }
        if (!nimpengembalian) {
            System.out.println();
            System.out.println("|===================================================|");
            System.out.println("|     Kode peminjaman tersebut tidak terdaftar      |");
            System.out.println("|    Mohon periksa ulang kode peminjaman tersebut   |");
            System.out.println("|===================================================|");
            System.out.println();
        }

    }

    static void laporanPengembalian() {
        System.out.println("|=============================================|");
        System.out.println("|              Data Pengembalian              |");
        System.out.println("|=============================================|");
        if (pengembaliCount > 0) {
            for (int m = 0; m < pengembaliCount; m++) {
                if (pengembaliArray[m][0] != null) {
                    System.out.println("|==============================================|");
                    System.out.printf("| Data Pengembalian ke-%-24s|\n", (m + 1));
                    System.out.println("|==============================================|");
                    System.out.printf("| Nim            : %-28s|\n", pengembaliArray[m][0]);
                    System.out.printf("| Nama           : %-28s|\n", pengembaliArray[m][1]);
                    System.out.printf("| Kode Buku      : %-28s|\n", pengembaliArray[m][2]);
                    System.out.printf("| Judul          : %-28s|\n", pengembaliArray[m][3]);
                    System.out.printf("| Penulis        : %-28s|\n", pengembaliArray[m][4]);
                    System.out.printf("| Tahun Terbit   : %-28s|\n", pengembaliArray[m][5]);
                    System.out.printf("| Jumlah kembali : %-28s|\n", pengembaliArray[m][10]);// jumlah kembalinya buku
                    System.out.printf("| Tanggal        : %-28s|\n", pengembaliArray[m][7]);// tanggal dikembalikannya buku.
                    System.out.printf("| Status         : %-28s|\n", pengembaliArray[m][8]);
                    System.out.printf("| Kode Pinjam    : %-28s|\n", pengembaliArray[m][9]);

                    System.out.println("|==============================================|");
                    System.out.println();
                } else {
                    break;
                }

            }
        } else if (pengembaliCount == 0) {
            System.out.println("|=============================================|");
            System.out.println("|       Data Pengembalian Tidak Tersedia      |");
            System.out.println("|=============================================|");
        }
    }

    static void laporanPembayaranDenda() {
        System.out.println("|=============================================|");
        System.out.println("|            Data Pembayaran Denda            |");
        System.out.println("|=============================================|");
        if (dendaCount > 0) {
            for (int i = 0; i < dendaArray.length; i++) {
                if (dendaArray[i][0] != null) {
                    System.out.println("Laporan pembayaran denda ke-" + (i + 1));
                    System.out.println("|==========================================================|");
                    System.out.println("    Nim Pembayar Denda          : " + dendaArray[i][0]);
                    System.out.println("    Nama Pembayar Denda         : " + dendaArray[i][1]);
                    System.out.println("    Nominal Denda Harus dibayar : " + dendaArray[i][2]);
                    System.out.println("    Nominal Denda yang dibayar  : " + dendaArray[i][3]);
                    System.out.println("    Sisa denda setelah dibayar  : " + dendaArray[i][4]);
                    System.out.println("|==========================================================|");
                }
            }
        } else if (dendaCount == 0) {
            System.out.println("|======================================|");
            System.out.println("|  Data pembayaran denda belum terisi  |");
            System.out.println("|======================================|");
        }
    }

    static int hitungBukuKembali(int jumlahDiKembalikan, int index) {
        int jumlahDiPinjam = Integer.parseInt(peminjamArray[index][10]);
        int bukuKurang = jumlahDiPinjam - jumlahDiKembalikan;
        return bukuKurang;
    }

    static int hitungStokKembali(int jumlahPinjam, int jumlahDiKembali, int index) {
        int stokDiArray = Integer.parseInt(bukuArray[index][5]);
        stokDiArray += jumlahDiKembali;
        return stokDiArray;

    }

    static int kurangStokPinjam(int jumlahBoekoe, int index) {
        int joemlahPinjam = Integer.parseInt(peminjamArray[index][10]);
        joemlahPinjam -= jumlahBoekoe;
        return joemlahPinjam;
    }

    public static Date masukkanTanggal(Scanner tanggalDenda) {
        String inputTanggal = tanggalDenda.next();

        int tanggal = Integer.parseInt(inputTanggal.split("/")[0]);
        int bulan = Integer.parseInt(inputTanggal.split("/")[1]) - 1;
        int tahun = Integer.parseInt(inputTanggal.split("/")[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(tahun, bulan, tanggal);

        return calendar.getTime();
    }

    public static long hitungSelisihHari(Date tanggalAwal, Date tanggalAkhir) {
        long selisihMilidetik = Math.abs(tanggalAkhir.getTime() - tanggalAwal.getTime());
        return selisihMilidetik / (1000 * 60 * 60 * 24);
    }

    static void PencarianPenggunaMemilikiDenda() {
        boolean cekDenda = false;
        for (int i = 0; i < membercount; i++) {
            if (Integer.parseInt(memberArray[i][2]) > 0) {
                cekDenda = true;
                System.out.println(memberArray[i][0]);
                System.out.println(memberArray[i][1]);
                System.out.println(memberArray[i][2]);
            } else if (Integer.parseInt(memberArray[i][2]) == 0) {
                System.out.println();
            }
        }
        if (!cekDenda) {
            System.out.println("Tidak ada member yang memiliki tanggungan denda");
        }
    }

    static void PencarianPeminjaMemilikiTanggungan() {
        for (int i = 0; i < peminjamanCount; i++) {
            if (peminjamArray[i][8].equalsIgnoreCase("Memiliki tanggungan buku kembali")) {
                System.out.println("Nim pemilik tanggungan              : " + peminjamArray[i][0]);
                System.out.println("Nama pemilik tanggungan             : " + peminjamArray[i][1]);
                System.out.println("Banyak buku yang dipinjam           : " + peminjamArray[i][6]);
                System.out.println("Banyak buku yang belum dikembalikan : " + peminjamArray[i][10]);
                System.out.println("Status                              : " + peminjamArray[i][8]);
            } else if (!peminjamArray[i][8].equalsIgnoreCase("Memiliki tanggungan buku kembali")) {
                System.out.println();
            }
        }
    }

    static void cariTanggunganMember() {
        boolean cariKodeTanggungan = false;
        for (int i = 0; i < membercount; i++) {
            if (Integer.valueOf(memberArray[i][3]) > 0) {
                cariKodeTanggungan = true;
                System.out.println(memberArray[i][1]);
                System.out.println(memberArray[i][3]);
            }
        }
        if (!cariKodeTanggungan) {
            System.out.println("tidak ada yang memiliki tanggungan");
        }
    }

    static void cariMember() {
        if (memberArray != null) {
            System.out.println("Masukkan Nim member yang ingin di cari : ");
            String CariNim = scCari.nextLine();
            boolean cocokNama = false;
            for (int i = 0; i < membercount; i++) {
                if (memberArray[i][0].equalsIgnoreCase(CariNim)) {
                    cocokNama = true;
                    System.out.println("Nim : " + memberArray[i][0]);
                    System.out.println("nama : " + memberArray[i][1]);
                    System.out.println("Total denda : " + memberArray[i][2]);
                    System.out.println("Total buku dipinjam : " + memberArray[i][3]);
                }
                System.out.println("Tampilkan data peminjaman Member "+memberArray[i][1]+"?");
                String Pilih = scCari.nextLine();
                if(Pilih.equalsIgnoreCase("ya")){
                    boolean cocokLagi = false;
                    for(int j=0;j<peminjamanCount;j++){
                        if(memberArray[i][0].equalsIgnoreCase(peminjamArray[j][0])){
                            cocokLagi=true;
                            System.out.println("|==========================================================|");
        System.out.printf("| Kode peminjaman : %-39s|\n", peminjamArray[j][9]);
        System.out.printf("| Nim peminjam    : %-39s|\n", peminjamArray[j][0]);
        System.out.printf("| Nama peminjam   : %-39s|\n", peminjamArray[j][1]);
        System.out.printf("| Kode buku       : %-39s|\n", peminjamArray[j][2]);
        System.out.printf("| Judul buku      : %-39s|\n", peminjamArray[j][3]);
        System.out.printf("| Nama Penulis    : %-39s|\n", peminjamArray[j][4]);
        System.out.printf("| Tahun terbit    : %-39s|\n", peminjamArray[j][5]);
        System.out.printf("| Jumlah          : %-39s|\n", peminjamArray[j][6]);
        System.out.printf("| Tanggal pinjam  : %-39s|\n", peminjamArray[j][7]);
        System.out.println("|==========================================================|");
        System.out.println();
                        }
                    }if(!cocokLagi){
                        System.out.println("Member tidak meminjam buku"); 
                        break;  
                    }
                }else if(Pilih.equalsIgnoreCase("tidak")){
                }else {
                    System.out.println("Masukkan pilihan dengan benar!");
                    
                }
            }
            if (!cocokNama) {
                System.out.println("Nim tidak ditemukan!");
            }
        }
    }

}
