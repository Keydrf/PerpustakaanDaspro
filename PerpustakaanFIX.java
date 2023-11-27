import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PerpustakaanFIX {

    static Scanner peminjamHuruf = new Scanner(System.in);
    
    static String bukuArray[][] = new String[10][5];
    static String memberArray[][] = new String[100][2];
    static int membercount = 1, bukucount = 1;
    static String cariJudul, cariNim, cariKode, jmlPinjam;
    static boolean nimketemu = false;

    // Membuat objek Calendar
        static Calendar calendar = Calendar.getInstance();

        // Menambahkan 7 hari ke waktu saat ini
        static calendar.add(Calendar.DAY_OF_YEAR, 7);

        // Mengonversi Calendar kembali ke tipe Date
        static Date sevenDaysLater = calendar.getTime();


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
<<<<<<< HEAD
                                    if (bukucount > 0) {
                                        if (membercount > 0) {
                                            for (int i = 0; i < peminjamArray.length;i++) {
=======
                                    if (bukuArray != null) {
                                        if (memberArray != null) {
                                            for (int i = 0; i < peminjamArray.length;) {
>>>>>>> 49a2839f0392d74f7611171bb5c55324e2d5e1e7
                                                System.out.println("|=============================================|");
                                                System.out.print("|Apakah sudah terdaftar sebagai member?(y/t): " + "|");
                                                String tanyaDaftar = peminjamHuruf.nextLine();
                                                if (tanyaDaftar.equalsIgnoreCase("y")) {
                                                    do {
                                                        System.out.print("Masukkan NIM peminjaman: ");
                                                        cariNim = peminjamHuruf.nextLine();
                                                        peminjaman();
                                                        peminjamArray[i][0] = cariNim;
                                                        if (nimketemu) {
                                                            System.out.println("Nama: " + nama1);
                                                            System.out.print("Masukkan kode buku: ");
                                                            kodeBuku1 = peminjamHuruf.nextLine();
                                                            // System.out.print("Masukkan jumlah buku: ");
                                                            // jumlah = peminjamAngka.nextInt();
                                                            boolean bukuketemu = false;
                                                            for (int cariBuku = 0; cariBuku < bukuArray.length; cariBuku++) {
                                                                if (bukuArray[cariBuku][0].equals(kodeBuku1)) {
                                                                    String judulb = bukuArray[cariBuku][1],
                                                                            pen = bukuArray[cariBuku][2];
                                                                    String thter = bukuArray[cariBuku][3],
                                                                            jml = bukuArray[cariBuku][4];
                                                                    bukuketemu = true;
                                                                    if (bukuketemu) {
                                                                        System.out.println("Judul buku: " + judulb);
                                                                        System.out.println("Penulis buku: " + pen);
                                                                        System.out
                                                                                .println("Tahun terbit: " + thter);
                                                                        System.out.println("Jumlah buku: " + jml);
                                                                    }

                                                                    // for (int a = 0; a < bukuArray.length; a++) {

                                                                    if (Integer
                                                                            .parseInt(bukuArray[cariBuku][4]) > 0) {

                                                                        // int stok = Integer
                                                                        // .parseInt(bukuArray[a][4]);
                                                                        // if (stok <= jumlah) {
                                                                        // stok -= jumlah;
                                                                        // bukuArray[a][4] = String
                                                                        // .valueOf(stok);
                                                                        // }

<<<<<<< HEAD
                                                                                int stok = Integer
                                                                                        .parseInt(bukuArray[a][4]);
                                                                                if (stok >= jumlah) {
                                                                                    stok -= jumlah;
                                                                                    bukuArray[a][4] = String
                                                                                            .valueOf(stok);
                                                                                }
=======
                                                                        System.out.print("Masukkan tenggat: ");
                                                                        tenggat = peminjamHuruf.nextLine();
>>>>>>> 49a2839f0392d74f7611171bb5c55324e2d5e1e7

                                                                        peminjamArray[peminjamanCount][1] = memberArray[i][1];
                                                                        peminjamArray[peminjamanCount][2] = kodeBuku1;
                                                                        peminjamArray[peminjamanCount][3] = bukuArray[i][1];
                                                                        peminjamArray[peminjamanCount][4] = bukuArray[i][2];
                                                                        peminjamArray[peminjamanCount][5] = bukuArray[i][3];
                                                                        // peminjamArray[peminjamanCount][6] =
                                                                        // String
                                                                        // .valueOf(jumlah);
                                                                        peminjamArray[peminjamanCount][7] = tenggat;
                                                                        peminjamanCount++;
                                                                        break;
                                                                    } else if (Integer
                                                                            .parseInt(bukuArray[i][4]) == 0) {
                                                                        System.out.println(
                                                                                "stok buku tidak mencukupi");
                                                                        break;

                                                                    }

                                                                    // }
                                                                } else {
                                                                    System.out
                                                                            .println("Buku tidak ditemukan");

                                                                }
                                                                break;
                                                            }

                                                        }
                                                        break;
                                                    } while (true);

                                                } else {
                                                    System.out.println("Silahkan daftar terlebih dahulu");
                                                    break;
                                                }

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
                                    System.out.println("|==============================================|");
                                    System.out.println("Data Peminjaman");
                                    if (peminjamanCount > 0) {

                                        for (int l = 0; l < peminjamArray.length; l++) {
                                            if (peminjamArray[l][0] != null) {
                                                System.out.println("|==============================================|");
                                                System.out.println("            Data peminjaman ke-" + (l + 1));
                                                System.out.println("|==============================================|");
                                                System.out.println("    Nim             : " + peminjamArray[l][0]);
                                                System.out.println("    Nama            : " + peminjamArray[l][1]);
                                                System.out.println("    Kode Buku       : " + peminjamArray[l][2]);
                                                System.out.println("    Judul           : " + peminjamArray[l][3]);
                                                System.out.println("    Penulis         : " + peminjamArray[l][4]);
                                                System.out.println("    Tahun Terbit    : " + peminjamArray[l][5]);
                                                System.out.println("    Jumlah          : " + peminjamArray[l][6]);
                                                System.out.println("    Tenggat         : " + peminjamArray[l][7]);
                                                System.out.println("|==============================================|");
                                                break;
                                            } else if (bukuArray[0][0] == null) {
                                                System.out.println("|==============================================|");
                                                System.out.println("|             Tidak Tersedia Buku              |");
                                                System.out.println("|==============================================|");
                                            } else {
                                                break;
                                            }

                                        }

                                    }

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
                                    if (peminjamanCount > 0) {
                                        System.out.print("   Masukkan NIM peminjam: ");
                                        nim2 = pengembaliHuruf.nextLine();
                                        for (int a = 0; a < pengembaliArray.length; a++) {
                                            if (nim2.equalsIgnoreCase(peminjamArray[a][0])) {
                                                cariPinjam = true;
                                                // System.out.println("NIM : "+peminjamArray[a][0]);
                                                System.out.println("Nama         : " + peminjamArray[a][1]);
                                                System.out.println("Kode buku    : " + peminjamArray[a][2]);
                                                System.out.println("Judul buku   : " + peminjamArray[a][3]);
                                                System.out.println("Penulis      : " + peminjamArray[a][4]);
                                                System.out.println("Tahun terbit : " + peminjamArray[a][5]);
                                                System.out.println("Jumlah       : " + peminjamArray[a][6]);
                                                System.out.println("Tenggat      : " + peminjamArray[a][7]);
                                                System.out.print("Masukkan lama hari peminjaman: ");
                                                hari = pengembaliAngka.nextInt();
                                                if (hari > 7) {
                                                    denda = (hari - 7) * 500;
                                                    System.out.println("Peminjam terkena denda sebesar Rp." + denda);
                                                    System.out
                                                            .println("Terlambat mengembalikan " + (hari - 7) + " hari");
                                                } else {
                                                    System.out.println("Berhasil mengembalikan buku");
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("|======================================|");
                                        System.out.println("|     Tidak ada buku yang dipinjam     |");
                                        System.out.println("|======================================|");
                                    }
                                } else if (firm == 2) {

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
                                            System.out.println("Nim : " + peminjamArray[l][0]);
                                            System.out.println("Nama : " + peminjamArray[l][1]);
                                            System.out.println("kode Buku : " + peminjamArray[l][2]);
                                            System.out.println("Judul : " + peminjamArray[l][3]);
                                            System.out.println("Penulis : " + peminjamArray[l][4]);
                                            System.out.println("Tahun Terbit : " + peminjamArray[l][5]);
                                            System.out.println("Jumlah : " + peminjamArray[l][6]);
                                            System.out.println("Tenggat : " + peminjamArray[l][7]);
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

                // nama1 = memberArray[i][1];
                nimketemu = true;

                System.out.println("Nama: " + memberArray[i][1]);

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
                System.out.println("Kode Buku: " + bukuArray[a][0]);
                System.out.println("Judul Buku: " + bukuArray[a][1]);
                System.out.println("Nama Penulis: " + bukuArray[a][2]);
                System.out.println("Tahun terbit: " + bukuArray[a][3]);
                System.out.println("Stok buku: " + bukuArray[a][4]);
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
                System.out.println("Kode Buku: " + bukuArray[b][0]);
                System.out.println("Judul Buku: " + bukuArray[b][1]);
                System.out.println("Nama Penulis: " + bukuArray[b][2]);
                System.out.println("Tahun terbit: " + bukuArray[b][3]);
                System.out.println("Stok buku: " + bukuArray[b][4]);
                
                
                    System.out.print("Masukkan jumlah: ");
                    jmlPinjam = peminjamHuruf.nextLine();
                    hitungJumlah();
                    System.out.println("Tenggat: "+sevenDaysLater);

                    
                
            }
        }
        if (!cariCode) {
            System.out.println("Buku tidak ditemukan!");
        }

    }
    static int hitungJumlah(int stok, int jml){
        int jumlah = Integer.parseInt(jmlPinjam);
        int stock = Integer.parseInt(bukuArray[b][4]);
        if(stock <= jumlah){
            stock -= jumlah;
            bukuArray[b][4] = String.valueOf(stok);
        } else{
            System.out.println("Stok buku tidak mencukupi")
        }
    }
    
}
