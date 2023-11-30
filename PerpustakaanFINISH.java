import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PerpustakaanFINISH {

    static Scanner peminjamHuruf = new Scanner(System.in);
    static Scanner pengembaliAngka = new Scanner(System.in);
    static Scanner pengembaliHuruf = new Scanner(System.in);

    static String bukuArray[][] = new String[100][5];
    static String memberArray[][] = new String[100][2];
    static String peminjamArray[][] = new String[100][9];
    static String pengembaliArray[][] = new String [100][9];
    static int membercount = 1, bukucount = 1, peminjamanCount = 0, pengembaliCount = 0;
    static String cariJudul, cariNim, cariNimPeminjam, cariKode, jmlPinjam, status;
    static boolean nimketemu = false;

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

        /// scanner member ///
        Scanner memberSH = new Scanner(System.in);

        /// scanner peminjaman ///
        Scanner peminjamHuruf = new Scanner(System.in);
        Scanner peminjamAngka = new Scanner(System.in);

        /// scanner pengembalian ///
        Scanner pengembaliHuruf = new Scanner(System.in);
        Scanner pengembaliAngka = new Scanner(System.in);

        ///////////////////////// DEKLARASI//////////////////////
        String levelPengguna, username, password;

        //////////////// input buku mulai ////////////////

        /// deklarasi inputan buku ///

        bukuArray[0][0] = "20001";
        bukuArray[0][1] = "Kembali Pulang";
        bukuArray[0][2] = "Yura Yunita";
        bukuArray[0][3] = "2019";
        bukuArray[0][4] = "15";

        int bukuInt[][] = new int[10][2];
        String kodeBuku, judulBuku, penulis, tahunTerbit, jumlahBuku;
        //////////////// input buku selesai ////////////////

        /////////////// input member mulai ///////////////
        /// deklarasi input member ///
        String nim, nama;
        memberArray[0][0] = "2341760076";
        memberArray[0][1] = "David";

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

        do {
            System.out.println("|===========================================|");
            System.out.println("|   Pilih level pengguna (admin/pengguna)   |");
            System.out.println("|===========================================|");
            System.out.println("| 1. Admin                                  |");
            System.out.println("| 2. Pengguna                               |");
            System.out.println("|===========================================|");
            System.out.print("   Pilihan anda: ");
            levelPengguna = pilLevel.nextLine();

            if (levelPengguna.equalsIgnoreCase("admin")) {
                System.out.println("|===========================================|");
                System.out.println("|      Silahkan login terlebih dahulu       |");
                System.out.println("|===========================================|");
                System.out.print("  Username: ");
                username = login.nextLine();
                System.out.print("  Password: ");
                password = login.nextLine();
                if (username.equals("admin") && password.equals("admin123")) {
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
                        System.out.println("| 7. Kembali                                |");
                        System.out.println("|===========================================|");
                        System.out.print(" Pilihan anda: ");
                        int menu = konfirmasiAngka.nextInt();

                        if (menu == 1) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|        Pilih Akses Data Buku (1/2)        |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Input Buku Baru                        |");
                                System.out.println("| 2. Lihat semua buku                       |");
                                System.out.println("| 3. Kembali                                |");
                                System.out.println("|===========================================|");
                                System.out.print("  Pilihan anda: ");
                                int confirm1 = konfirmasiAngka.nextInt();
                                if (confirm1 == 1) {
                                    System.out.println("Anda memasuki menu input buku");

                                    System.out.print("Masukkan kode buku: ");

                                    kodeBuku = bukuHuruf.nextLine();

                                    System.out.print("Masukkan judul buku: ");
                                    judulBuku = bukuHuruf.nextLine();
                                    System.out.print("Masukkan nama penulis: ");
                                    penulis = bukuHuruf.nextLine();
                                    System.out.print("Masukkan tahun terbit: ");
                                    tahunTerbit = bukuAngka.nextLine();
                                    System.out.print("Masukkan jumlah buku: ");
                                    jumlahBuku = bukuAngka.nextLine();

                                    bukuArray[bukucount][0] = kodeBuku;
                                    bukuArray[bukucount][1] = judulBuku;
                                    bukuArray[bukucount][2] = penulis;
                                    bukuArray[bukucount][3] = tahunTerbit;
                                    bukuArray[bukucount][4] = jumlahBuku;
                                    bukucount++;

                                } else if (confirm1 == 2) {
                                    // for (int i = 0; i < bukucount; i++) {
                                    if (bukuArray != null) {

                                        for (int j = 0; j < bukucount; j++) {
                                            System.out.println("Buku ke-" + (j + 1));
                                            System.out.println("   Kode buku     : " + bukuArray[j][0]);
                                            System.out.println("   Judul buku    : " + bukuArray[j][1]);
                                            System.out.println("   Penulis       : " + bukuArray[j][2]);
                                            System.out.println("   Tahun terbit  : " + bukuArray[j][3]);
                                            System.out.println("   Jumlah buku   : " + bukuArray[j][4]);

                                        }
                                    } else {
                                        System.out.println("Data buku kosong ");
                                    }

                                } else if (confirm1 == 3) {
                                    break;
                                } else {
                                    System.out.println("|===========================================|");
                                    System.out.println("|      Data yang anda masukkan salah        |");
                                    System.out.println("|===========================================|");
                                }
                            } while (true);

                        } else if (menu == 2) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|       Pilih Akses Data Member (1/2)       |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Input Member Baru                      |");
                                System.out.println("| 2. Lihat semua member                     |");
                                System.out.println("| 3. Kembali                                |");
                                System.out.println("|===========================================|");
                                System.out.print("  Pilihan anda: ");
                                int confirm2 = konfirmasiAngka.nextInt();
                                if (confirm2 == 1) {
                                    System.out.println("Input Member");

                                    System.out.print("Masukkan NIM: ");
                                    nim = memberSH.nextLine();
                                    System.out.print("Masukkan Nama: ");
                                    nama = memberSH.nextLine();
                                    memberArray[membercount][0] = nim;
                                    memberArray[membercount][1] = nama;
                                    membercount++;

                                } else if (confirm2 == 2) {
                                    System.out.println("Data Member");

                                    if (membercount > 0) {

                                        for (int i = 0; i < membercount; i++) {
                                            System.out.println("Member ke-" + (i + 1));

                                            System.out.println("   NIM    : " + memberArray[i][0]);
                                            System.out.println("   Nama   : " + memberArray[i][1]);

                                            // break;
                                        }
                                    } else {
                                        System.out.println("Data member kosong");

                                    }

                                } else if (confirm2 == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);

                        } else if (menu == 3) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|     Pilih Akses Data Peminjaman (1/2)     |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Input Peminjaman                       |");
                                System.out.println("| 2. Lihat Data Peminjaman                  |");
                                System.out.println("| 3. Kembali                                |");
                                System.out.println("|===========================================|");
                                System.out.print("  Pilihan anda: ");
                                int confirm3 = konfirmasiAngka.nextInt();
                                if (confirm3 == 1) {
                                    System.out.println("|=============================================|");
                                    System.out.println("|      Anda memasuki menu peminjaman buku     |");
                                    System.out.println("|=============================================|");
                                    if (bukuArray != null) {
                                        if (memberArray != null) {
                                            for (int i = 0; i < peminjamArray.length;) {
                                                System.out.println("|=============================================|");
                                                System.out
                                                        .print("|Apakah sudah terdaftar sebagai member?(y/t): " + "|");
                                                String tanyaDaftar = peminjamHuruf.nextLine();
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
                                } else if (confirm3 == 2) {
                                    laporanPeminjaman();
                                    // System.out.println(peminjamArray[0][1]);
                                    // System.out.println(peminjamArray[0][2]);
                                    // System.out.println(peminjamArray[1][1]);
                                    // System.out.println(peminjamArray[1][2]);
                                    // System.out.println(peminjamArray[2][1]);
                                    // System.out.println(peminjamArray[2][2]);
                                    // System.out.println("|==============================================|");
                                    // System.out.println("Data Peminjaman");
                                    // if (peminjamanCount > 0) {

                                    // for (int l = 0; l < peminjamArray.length; l++) {
                                    // if (peminjamArray[l][0] != null) {
                                    // System.out.println("|==============================================|");
                                    // System.out.println(" Data peminjaman ke-" + (l + 1));
                                    // System.out.println("|==============================================|");
                                    // System.out.println(" Nim : " + peminjamArray[l][0]);
                                    // System.out.println(" Nama : " + peminjamArray[l][1]);
                                    // System.out.println(" Kode Buku : " + peminjamArray[l][2]);
                                    // System.out.println(" Judul : " + peminjamArray[l][3]);
                                    // System.out.println(" Penulis : " + peminjamArray[l][4]);
                                    // System.out.println(" Tahun Terbit : " + peminjamArray[l][5]);
                                    // System.out.println(" Jumlah : " + peminjamArray[l][6]);
                                    // System.out.println(" Tenggat : " + peminjamArray[l][7]);
                                    // System.out.println("|==============================================|");
                                    // break;
                                    // } else if (bukuArray[0][0] == null) {
                                    // System.out.println("|==============================================|");
                                    // System.out.println("| Tidak Tersedia Buku |");
                                    // System.out.println("|==============================================|");
                                    // } else {
                                    // break;
                                    // }

                                    // }

                                    // }

                                } else if (confirm3 == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);
                        } else if (menu == 4) {
                            System.out.println("|==============================================|");
                            System.out.println("|            Transaksi Pengembalian            |");
                            System.out.println("|==============================================|");
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|    Pilih Akses Data Pengembalian (1/2)    |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Input Pengembalian                     |");
                                System.out.println("| 2. Lihat Data Pengembalian                |");
                                System.out.println("| 3. Kembali                                |");
                                System.out.println("|===========================================|");
                                System.out.print("  Pilihan anda: ");
                                int firm = konfirmasiAngka.nextInt();
                                if (firm == 1) {
                                    System.out.println("|======================================|");
                                    System.out.println("| Anda memasuki menu pengembalian buku |");
                                    System.out.println("|======================================|");
                                    if (peminjamanCount >= 0) {
                                        System.out.print("   Masukkan NIM peminjam: ");
                                        cariNimPeminjam = pengembaliHuruf.nextLine();
                                        pengembalian();

                                        // for (int a = 0; a < pengembaliArray.length; a++) {
                                        //     if (nim2.equalsIgnoreCase(peminjamArray[a][0])) {
                                        //         cariPinjam = true;
                                        //         // System.out.println("NIM : "+peminjamArray[a][0]);
                                        //         System.out.println("Nama         : " + peminjamArray[a][1]);
                                        //         System.out.println("Kode buku    : " + peminjamArray[a][2]);
                                        //         System.out.println("Judul buku   : " + peminjamArray[a][3]);
                                        //         System.out.println("Penulis      : " + peminjamArray[a][4]);
                                        //         System.out.println("Tahun terbit : " + peminjamArray[a][5]);
                                        //         System.out.println("Jumlah       : " + peminjamArray[a][6]);
                                        //         System.out.println("Tenggat      : " + peminjamArray[a][7]);
                                        //         System.out.print("Masukkan lama hari peminjaman: ");
                                        //         hari = pengembaliAngka.nextInt();
                                        //         if (hari > 7) {
                                        //             denda = (hari - 7) * 500;
                                        //             System.out.println("Peminjam terkena denda sebesar Rp." + denda);
                                        //             System.out
                                        //                     .println("Terlambat mengembalikan " + (hari - 7) + " hari");
                                        //         } else {
                                        //             System.out.println("Berhasil mengembalikan buku");
                                        //         }
                                        //     }
                                        // }
                                    } else {
                                        System.out.println("|======================================|");
                                        System.out.println("|     Tidak ada buku yang dipinjam     |");
                                        System.out.println("|======================================|");
                                    }
                                } else if (firm == 2) {
                                    laporanPengembalian();
                                } else if (firm == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);

                        } else if (menu == 6) {
                            while (true) {
                                System.out.println("Anda memasuki menu laporan");
                                System.out.println("Silahkan pilih laporan");
                                System.out.println("1. Laporan Peminjaman");
                                System.out.println("2. Laporan pengembalian");
                                System.out.println("3. Kemblali ke menu utama");
                                System.out.print("Masukkan pilihan anda : ");
                                int menu1 = menuLap.nextInt();
                                if (menu1 == 1) {
                                    for (int l = 0; l < peminjamArray.length; l++) {
                                        if (bukuArray[0][0] != null) {
                                            System.out.println("Nim           : " + peminjamArray[l][0]);
                                            System.out.println("Nama          : " + peminjamArray[l][1]);
                                            System.out.println("kode Buku     : " + peminjamArray[l][2]);
                                            System.out.println("Judul         : " + peminjamArray[l][3]);
                                            System.out.println("Penulis       : " + peminjamArray[l][4]);
                                            System.out.println("Tahun Terbit  : " + peminjamArray[l][5]);
                                            System.out.println("Jumlah        : " + peminjamArray[l][6]);
                                            System.out.println("Tenggat       : " + peminjamArray[l][7]);
                                            break;
                                        } else {
                                            System.out.println("==================================");
                                            System.out.println("tidak terdapat buku yang dipinjam");
                                            System.out.println("==================================");
                                            break;
                                        }
                                    }
                                } else if (menu1 == 2) {

                                } else {
                                    break;
                                }
                            }

                        } else if (menu == 7) {

                            break;
                        }
                    } while (true);

                } else {
                    System.out.println("Username dan password salah silahkan login kembali!");
                }
            } else if (levelPengguna.equalsIgnoreCase("pengguna")) {
                System.out.println("|===========================================|");
                System.out.println("|      Silahkan login terlebih dahulu       |");
                System.out.println("|===========================================|");
                System.out.print("  Username: ");
                username = login.nextLine();
                System.out.print("  Password: ");
                password = login.nextLine();
                if (username.equals("pengguna") && password.equals("pengguna123")) {
                    System.out.println("|===========================================|");
                    System.out.println("|       Anda hanya bisa mencari buku        |");
                    System.out.println("|===========================================|");

                    if (bukuArray != null) {
                        do {
                            System.out.println("  Masukkan judul buku: ");
                            cariJudul = judul.nextLine();
                            boolean cariBuku = false;
                            cariBukuJudul();
                        } while (true);

                        // if(cariBuku=true){
                        // System.out.println("Kode buku: ");
                        // }

                    }

                }
            }
        } while (true);

    }

    static void peminjaman() {

        boolean nimketemu = false;
        for (int i = 0; i < membercount; i++) {
            if (memberArray[i][0].equalsIgnoreCase(cariNim)) {

                peminjamArray[peminjamanCount][0] = cariNim;
                nimketemu = true;

                System.out.println("Nama: " + memberArray[i][1]);
                peminjamArray[peminjamanCount][1] = memberArray[i][1];

            }
        }
        if (nimketemu) {
            System.out.print("Masukkan kode buku: ");
            cariKode = peminjamHuruf.nextLine();
            cariBukuKode();

        }
        if (!nimketemu) {
            System.out.println("NIM tidak ditemukan");
        }

    }

    static void cariBukuJudul() {
        boolean cariBuku = false;
        for (int a = 0; a < bukuArray.length; a++) {
            if (bukuArray[a][1].equalsIgnoreCase(cariJudul)) {
                // nama1 = bukuArray[b][1];
                cariBuku = true;
                System.out.println("Kode Buku    : " + bukuArray[a][0]);
                System.out.println("Judul Buku   : " + bukuArray[a][1]);
                System.out.println("Nama Penulis : " + bukuArray[a][2]);
                System.out.println("Tahun terbit : " + bukuArray[a][3]);
                System.out.println("Stok buku    : " + bukuArray[a][4]);
                break;
            } else {
                System.out.println("Buku tidak ditemukan!");
                break;
            }
        }
    }

    static void cariBukuKode() {
        boolean cariCode = false;
        for (int b = 0; b < bukuArray.length; b++) {
            if (bukuArray[b][0].equalsIgnoreCase(cariKode)) {
                // nama1 = bukuArray[b][1];
                cariCode = true;
                System.out.println("Kode Buku    : " + bukuArray[b][0]);
                System.out.println("Judul Buku   : " + bukuArray[b][1]);
                System.out.println("Nama Penulis : " + bukuArray[b][2]);
                System.out.println("Tahun terbit : " + bukuArray[b][3]);
                System.out.println("Stok buku    : " + bukuArray[b][4]);

                System.out.print("Masukkan jumlah: ");
                jmlPinjam = peminjamHuruf.nextLine();

                int stok = hitungJumlah(Integer.parseInt(jmlPinjam), b);
                System.out.println("Stok buku sisa: " + stok);

                Date currentDate = new Date();
                // Membuat objek Calendar
                Calendar calendar = Calendar.getInstance();

                // Menetapkan waktu awal menggunakan waktu saat ini
                calendar.setTime(currentDate);

                // Menambahkan 7 hari ke waktu awal
                // calendar.add(Calendar.DAY_OF_YEAR, 7);

                // Mengonversi Calendar kembali ke tipe Date
                Date tenggat = calendar.getTime();
                System.out.println("Buku di pinjam pada tanggal " + tenggat);
                System.out.println("Transaksi peminjaman Berhasil! ");
                status = "Dipinjam";

                peminjamArray[peminjamanCount][2] = bukuArray[b][0]; // Kode Buku
                peminjamArray[peminjamanCount][3] = bukuArray[b][1]; // Judul Buku
                peminjamArray[peminjamanCount][4] = bukuArray[b][2]; // Nama Penulis
                peminjamArray[peminjamanCount][5] = bukuArray[b][3]; // Tahun Terbit
                // peminjamArray[peminjamanCount][6] = bukuArray[b][4]; // Stok Buku
                peminjamArray[peminjamanCount][6] = jmlPinjam; // Jumlah yang Dipinjam
                peminjamArray[peminjamanCount][7] = tenggat.toString(); // Tanggal Tenggat
                peminjamArray[peminjamanCount][8] = status;

                System.out.print("Apakah anda ingin cetak struk (y/t)?: ");
                String kondisi = peminjamHuruf.nextLine();

                cetakStruk();

                peminjamanCount++;

                break;

            }
        }
        if (!cariCode) {
            System.out.println("Buku tidak ditemukan!");
        }

    }

    static int hitungJumlah(int jumlahPinjam, int index) {

        int stock = Integer.parseInt(bukuArray[index][4]);
        if (stock >= jumlahPinjam) {
            stock -= jumlahPinjam;
        } else {
            System.out.println("Stok buku tidak mencukupi");
        }
        bukuArray[index][4] = String.valueOf(stock);
        return stock;

    }

    static void cetakStruk() {
        System.out.println("Kode peminjaman :" + (peminjamanCount + 1));
        System.out.println("Nim peminjam    : " + peminjamArray[peminjamanCount][0]);
        System.out.println("Nama peminjam   : " + peminjamArray[peminjamanCount][1]);
        System.out.println("Kode buku       : " + peminjamArray[peminjamanCount][2]);
        System.out.println("Judul buku      : " + peminjamArray[peminjamanCount][3]);
        System.out.println("Nama Penulis    : " + peminjamArray[peminjamanCount][4]);
        System.out.println("Tahun terbit    : " + peminjamArray[peminjamanCount][5]);
        System.out.println("Jumlah          : " + peminjamArray[peminjamanCount][6]);
        System.out.println("Tanggal pinjam  : " + peminjamArray[peminjamanCount][7]);
        System.out.println(peminjamArray[peminjamanCount][8]);

    }

    static void laporanPeminjaman() {
        System.out.println("|==============================================|");
        System.out.println("Data Peminjaman");
        if (peminjamanCount > 0) {

            for (int l = 0; l < peminjamanCount; l++) {
                if (peminjamArray[l][0] != null) {
                    System.out.println("|==============================================|");
                    System.out.println(" Data peminjaman ke-" + (l + 1));
                    System.out.println("|==============================================|");
                    System.out.println(" Nim            : " + peminjamArray[l][0]);
                    System.out.println(" Nama           : " + peminjamArray[l][1]);
                    System.out.println(" Kode Buku      : " + peminjamArray[l][2]);
                    System.out.println(" Judul          : " + peminjamArray[l][3]);
                    System.out.println(" Penulis        : " + peminjamArray[l][4]);
                    System.out.println(" Tahun Terbit   : " + peminjamArray[l][5]);
                    System.out.println(" Jumlah         : " + peminjamArray[l][6]);
                    System.out.println(" Tenggat        : " + peminjamArray[l][7]);
                    System.out.println("|==============================================|");

                } else if (bukuArray[0][0] == null) {
                    System.out.println("|==============================================|");
                    System.out.println("|              Tidak Tersedia Buku             |");
                    System.out.println("|==============================================|");
                } else {
                    break;
                }

            }

        }
    }

    static void pengembalian() {

        boolean nimpengembalian = false;
        for (int i = 0; i < membercount; i++) {
            if (peminjamArray[i][0].equalsIgnoreCase(cariNimPeminjam)) {

                nimpengembalian = true;
                // if (nimketemu) {
                    System.out.println("Nama          : " + peminjamArray[i][1]);
                    System.out.println("Nim           : " + peminjamArray[i][0]);
                    System.out.println("Kode Buku     : " + peminjamArray[i][2]);
                    System.out.println("Judul Buku    : " + peminjamArray[i][3]);
                    System.out.println("Penulis Buku  : " + peminjamArray[i][4]);
                    System.out.println("Tahun Terbit  : " + peminjamArray[i][5]);
                    System.out.println("Jumlah        : " + peminjamArray[i][6]);
                    System.out.print("Masukkan jumlah buku yang dikembalikan : ");
                    String jumlahBukuKembali = pengembaliHuruf.nextLine();
                    int bukuKurang = hitungBukuKembali(Integer.parseInt(jumlahBukuKembali), i);
                    pengembaliArray[pengembaliCount][1] = peminjamArray[i][1];
                    pengembaliArray[pengembaliCount][0] = peminjamArray[i][0];
                    pengembaliArray[pengembaliCount][2] = peminjamArray[i][2];
                    pengembaliArray[pengembaliCount][3] = peminjamArray[i][3];
                    pengembaliArray[pengembaliCount][4] = peminjamArray[i][4];
                    pengembaliArray[pengembaliCount][5] = peminjamArray[i][5];
                    pengembaliArray[pengembaliCount][6] = jumlahBukuKembali;
                    // pengembaliCount++;
                    if (bukuKurang == 0) {
                        System.out.println("Buku berhasil dikembalikan ");
                        peminjamArray[i][8] = "Kembali";
                        pengembaliCount++;
                    } else if (bukuKurang > 0) {
                        System.out.println("Buku berhasil dikembalikan ");
                        System.out.println(" Member " + peminjamArray[i][1]+ " memiliki tanggungan buku yang belum dikembalikan berjumlah -" + bukuKurang);
                        pengembaliCount++;
                    }
                    pengembaliCount++;
                    int stokKembali = hitungStokKembali(Integer.parseInt(jumlahBukuKembali), i);
                    bukuArray[i][4] = String.valueOf(stokKembali);

                    int kurangJumlahPinjam = kurangStokPinjam(Integer.parseInt(jumlahBukuKembali), i);
                    peminjamArray[i][6] = String.valueOf(kurangJumlahPinjam);
                    System.out.println(pengembaliArray[0][0]);
                    
                    break;
                    // lanjutanPengembali();
                
            }
        }

        // if (!nimketemu) {
        // System.out.println("NIM tidak ditemukan");
        // }
    }
    static void laporanPengembalian() {
        System.out.println("|==============================================|");
        System.out.println("Data Pengembalian");
        System.out.println(pengembaliArray[0][0]);
        if (pengembaliCount > 0) {
            for (int m = 0;  m < pengembaliCount; m++) {
                if (pengembaliArray[m][0] != null) {
                    System.out.println("|==============================================|");
                    System.out.println(" Data pengembali ke-" + (m + 1));
                    System.out.println(" Nim            : " + pengembaliArray[m][0]);
                    System.out.println(" Nama           : " + pengembaliArray[m][1]);
                    System.out.println(" Kode Buku      : " + pengembaliArray[m][2]);
                    System.out.println(" Judul          : " + pengembaliArray[m][3]);
                    System.out.println(" Penulis        : " + pengembaliArray[m][4]);
                    System.out.println(" Tahun Terbit   : " + pengembaliArray[m][5]);
                    System.out.println(" Jumlah         : " + pengembaliArray[m][6]);
                    System.out.println("|==============================================|");
                } 
            }
        }

    }

    // static void lanjutanPengembali() {
    //     boolean cocokKode = false;
    //     for (int c = 0; c < bukuArray.length; c++) {

    //         if (bukuArray[c][0].equals(peminjamArray[c][0]))
    //             System.out.println("================================");
    //         System.out.println("     Data buku yang dipinjam    ");
    //         System.out.println("================================");
    //         System.out.println("Judul Buku : " + peminjamArray[c][3]);
    //         System.out.println("Kode Buku : " + peminjamArray[c][2]);
    //         System.out.println("Penulis Buku : " + peminjamArray[c][4]);
    //         System.out.println("Tahun Terbit : " + peminjamArray[c][5]);
    //         System.out.println("Jumlah : " + peminjamArray[c][6]);

    //         System.out.print("Masukkan jumlah buku yang dikembalikan : ");
    //         String jumlahBukuKembali = pengembaliHuruf.nextLine();
    //         int bukuKurang = hitungBukuKembali(Integer.parseInt(jumlahBukuKembali), c);

    //         if (bukuKurang == 0) {
    //             System.out.println("Buku berhasil dikembalikan ");
    //             peminjamArray[c][8] = "Kembali";
    //         } else if (bukuKurang > 0) {
    //             System.out.println("Buku berhasil dikembalikan ");
    //             System.out.println(" Member " + peminjamArray[c][1]
    //                     + " memiliki tanggungan buku yang belum dikembalikan berjumlah -" + bukuKurang);
    //         }
    //         int stokKembali = hitungStokKembali(Integer.parseInt(jumlahBukuKembali), c);
    //         bukuArray[c][4] = String.valueOf(stokKembali);

    //         int kurangJumlahPinjam = kurangStokPinjam(Integer.parseInt(jumlahBukuKembali), c);
    //         peminjamArray[c][6] = String.valueOf(kurangJumlahPinjam);
    //         break;

    //     }

    // }

    static int hitungBukuKembali(int jumlahDiKembalikan, int index) {
        int jumlahDiPinjam = Integer.parseInt(peminjamArray[index][6]);
        int bukuKurang = jumlahDiPinjam - jumlahDiKembalikan;
        return bukuKurang;
    }

    static int hitungStokKembali(int jumlahDiKembali, int index) {
        int stok = Integer.parseInt(bukuArray[index][4]);
        stok += jumlahDiKembali;
        return stok;

    }
    
    static int kurangStokPinjam(int jumlahBoekoe, int index) {
        int joemlahPinjam = Integer.parseInt(peminjamArray[index][6]);
        joemlahPinjam -= jumlahBoekoe;
        return joemlahPinjam;
    }
}
