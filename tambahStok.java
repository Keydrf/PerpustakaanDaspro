import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class tambahStok {

    static Scanner peminjamHuruf = new Scanner(System.in);
    static Scanner pengembaliAngka = new Scanner(System.in);
    static Scanner pengembaliHuruf = new Scanner(System.in);

    static String bukuArray[][] = new String[100][5];
    static String memberArray[][] = new String[100][3];
    static String peminjamArray[][] = new String[100][10];
    static String pengembaliArray[][] = new String[100][10];
    static int membercount = 1, bukucount = 1, peminjamanCount = 0, pengembaliCount = 0, kodePinjam = 1, jumlahTmbhStok;
    static String cariJudul, cariNim, cariNimPeminjam, cariKode, jmlPinjam, status;
    static boolean nimketemu = false;
    static Scanner tanggalDenda = new Scanner(System.in);
    static Scanner scStok = new Scanner(System.in);

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

        /// scanner peminjaman ///
        Scanner peminjamHuruf = new Scanner(System.in);
        Scanner peminjamAngka = new Scanner(System.in);

        /// scanner pengembalian ///
        Scanner pengembaliHuruf = new Scanner(System.in);
        Scanner pengembaliAngka = new Scanner(System.in);

        /// scanner denda ///

        ///////////////////////// DEKLARASI//////////////////////
        String levelPengguna, username, password;

        //////////////// input buku mulai ////////////////

        /// deklarasi inputan buku ///

        bukuArray[0][0] = "20001";
        bukuArray[0][1] = "Kembali Pulang";
        bukuArray[0][2] = "Yura Yunita";
        bukuArray[0][3] = "2019";
        bukuArray[0][4] = "15";
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
                        System.out.println("| 7. Keluar                                 |");
                        System.out.println("|===========================================|");
                        System.out.println();
                        System.out.print(" Pilihan anda: ");
                        int menu = konfirmasiAngka.nextInt();
                        System.out.println();

                        if (menu == 1) {
                            do {
                                System.out.println("|===========================================|");
                                System.out.println("|        Pilih Akses Data Buku (1/2)        |");
                                System.out.println("|===========================================|");
                                System.out.println("| 1. Input Buku Baru                        |");
                                System.out.println("| 2. Lihat semua buku                       |");
                                System.out.println("| 3. Kembali                                |");
                                System.out.println("|===========================================|");
                                System.out.println();
                                System.out.print("  Pilihan anda: ");
                                int confirm1 = konfirmasiAngka.nextInt();
                                System.out.println();
                                if (confirm1 == 1) {
                                    System.out.println("    Anda memasuki menu input buku");
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
                                    System.out.println();

                                    bukuArray[bukucount][0] = kodeBuku;
                                    bukuArray[bukucount][1] = judulBuku;
                                    bukuArray[bukucount][2] = penulis;
                                    bukuArray[bukucount][3] = tahunTerbit;
                                    bukuArray[bukucount][4] = jumlahBuku;
                                    bukucount++;

                                } else if (confirm1 == 2) {
                                    // for (int i = 0; i < bukucount; i++) {
                                    tampilBuku();

                                } else if (confirm1 == 3) {
                                    break;
                                } else {
                                    System.out.println();
                                    System.out.println("|===========================================|");
                                    System.out.println("|      Data yang anda masukkan salah        |");
                                    System.out.println("|===========================================|");
                                    System.out.println();
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
                                System.out.println();
                                System.out.print("  Pilihan anda: ");
                                System.out.println();
                                int confirm2 = konfirmasiAngka.nextInt();
                                if (confirm2 == 1) {
                                    System.out.println("    Input Member");

                                    System.out.print("Masukkan NIM: ");
                                    nim = memberSH.nextLine();
                                    System.out.print("Masukkan Nama: ");
                                    nama = memberSH.nextLine();
                                    memberArray[membercount][0] = nim;
                                    memberArray[membercount][1] = nama;
                                    membercount++;
                                    System.out.println();
                                } else if (confirm2 == 2) {
                                    tampilMember();
                                } else if (confirm2 == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);

                        } else if (menu == 3) {
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
                                int confirm3 = konfirmasiAngka.nextInt();
                                System.out.println();
                                if (confirm3 == 1) {
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
                                } else if (confirm3 == 2) {
                                    laporanPeminjaman();

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
                                int firm = konfirmasiAngka.nextInt();
                                System.out.println();
                                if (firm == 1) {
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
                                } else if (firm == 2) {
                                    laporanPengembalian();
                                } else if (firm == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);

                        } else if(menu == 5){
                            System.out.println("Masukkan NIM: ");
                            String search = pengembaliHuruf.nextLine();
                            for(int i = 0; i < memberArray.length; i++){
                                if(search.equalsIgnoreCase(memberArray[i][0])){
                                    System.out.println("NIM     : "+memberArray[i][0]);
                                    System.out.println("Nama    : "+memberArray[i][1]);
                                    System.out.println("Denda   : "+memberArray[i][2]);
                                    System.out.print("Masukkan nominal pembayaran: ");
                                    int bayar = konfirmasiAngka.nextInt();
                                    int dendaBayar = Integer.parseInt(memberArray[i][2]);
                                    int hasilBayar = dendaBayar - bayar;
                                    
                                    if(hasilBayar == 0){
                                        System.out.println("Denda berhasil dibayar!");
                                        
                                    }else{
                                        System.out.println("Denda berhasil dibayar, denda tersisa Rp. "+ hasilBayar);
                                    }
                                    memberArray[i][2] = String.valueOf(hasilBayar);
                                    break;
                                } else{
                                    System.out.println("Data tidak ditemukan!");
                                    break;
                                }
                            }
                        }else if (menu == 6) {
                            while (true) {
                                System.out.println("|======================================|");
                                System.out.println("|      Anda memasuki menu laporan      |");
                                System.out.println("|======================================|");
                                System.out.println("|        Silahkan pilih laporan        |");
                                System.out.println("|      1. Laporan Peminjaman           |");
                                System.out.println("|      2. Laporan pengembalian         |");
                                System.out.println("|      3. Kembali                      |");
                                System.out.println("|======================================|");
                                System.out.print("   Masukkan pilihan anda : ");
                                int menu1 = menuLap.nextInt();
                                if (menu1 == 1) {
                                    laporanPeminjaman();
                                } else if (menu1 == 2) {
                                    laporanPengembalian();
                                } else {
                                    break;
                                }
                            }

                        } else if (menu == 7) {
                            System.out.println("Apakah anda yakin akan keluar? (y/t): ");
                            String keluar = pengembaliHuruf.nextLine();
                            if (keluar.equalsIgnoreCase("y")) {
                                break;
                            } else if (keluar.equalsIgnoreCase("t")) {
                                System.out.println();
                                continue;
                            } else {
                                System.out.println("Inputan salah!");
                                System.out.println();
                            }

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
                                System.out.println("  Masukkan judul buku: ");
                                cariJudul = judul.nextLine();
                                cariBukuJudul();
                                System.out.print("Apakah anda ingin mencari buku lagi? (y/t): ");
                                String again = judul.nextLine();
                                if (again.equalsIgnoreCase("y")) {
                                    continue;
                                } else if (again.equalsIgnoreCase("t")) {
                                    break;
                                }
                            } while (true);

                        }

                    } else {
                        System.out.println("Username dan Password salah silahkan login kembali!");
                        System.out.println();
                        break;
                    }
                }

            }
        } while (true);

    }

    static void tampilBuku() {
        if (bukuArray != null) {

            for (int j = 0; j < bukucount; j++) {
                System.out.println();
                System.out.println(" ____________________________________________ ");
                System.out.printf("| Buku ke-%-35s|\n", (j + 1));
                System.out.printf("|   Kode buku     : %-25s|\n", bukuArray[j][0]);
                System.out.printf("|   Judul buku    : %-25s|\n", bukuArray[j][1]);
                System.out.printf("|   Penulis       : %-25s|\n", bukuArray[j][2]);
                System.out.printf("|   Tahun terbit  : %-25s|\n", bukuArray[j][3]);
                System.out.printf("|   Jumlah buku   : %-25s|\n", bukuArray[j][4]);
                System.out.println("|____________________________________________|");
                System.out.println();

            }
        } else {
            System.out.println("Data buku kosong ");
        }
    }

    static void tampilMember() {

        if (membercount > 0) {

            for (int i = 0; i < membercount; i++) {
                if (memberArray[i][2] == null) {
                    memberArray[i][2] = "0";

                }
                System.out.println(" ____________________________________________ ");
                System.out.printf("| Member ke-%-33s|\n", (i + 1));
                System.out.printf("|   NIM         : %-27s|\n", memberArray[i][0]);
                System.out.printf("|   Nama        : %-27s|\n", memberArray[i][1]);
                System.out.printf("|   Total Denda : %-27s|\n", memberArray[i][2]);
                System.out.println("|____________________________________________|");
                System.out.println();

            }
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

                Date tenggat = calendar.getTime();
                System.out.println("Buku di pinjam pada tanggal " + tenggat);
                System.out.println("Transaksi peminjaman Berhasil! ");
                status = "Dipinjam";
                String NomorPeminjaman = String.valueOf(kodePinjam);

                peminjamArray[peminjamanCount][2] = bukuArray[b][0]; // Kode Buku
                peminjamArray[peminjamanCount][3] = bukuArray[b][1]; // Judul Buku
                peminjamArray[peminjamanCount][4] = bukuArray[b][2]; // Nama Penulis
                peminjamArray[peminjamanCount][5] = bukuArray[b][3]; // Tahun Terbit
                // peminjamArray[peminjamanCount][6] = bukuArray[b][4]; // Stok Buku
                peminjamArray[peminjamanCount][6] = jmlPinjam; // Jumlah yang Dipinjam
                peminjamArray[peminjamanCount][7] = tenggat.toString(); // Tanggal Tenggat
                peminjamArray[peminjamanCount][8] = status;
                peminjamArray[peminjamanCount][9] = NomorPeminjaman;
                System.out.print("Apakah anda ingin cetak struk (y/t)?: ");
                String kondisi = peminjamHuruf.nextLine();
                System.out.println();
                if (kondisi.equalsIgnoreCase("y")) {
                    cetakStruk();
                } else {
                    break;
                }

                kodePinjam++;
                peminjamanCount++;

                break;

            } else {
                System.out.println("Buku tidak ditemukan!");
                break;
            }
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

    static int tambahStok (int jmlhTmbhStok) {
        System.out.println("Masukkan jumlah stok yang ingin ditambahkan");
        jumlahTmbhStok = scStok.nextInt();
        if (jmlhTmbhStok > 0) {
             + jmlhTmbhStok;
            
        }
        
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
                    System.out.printf("| Kode Pinjam    : %-28s|\n", peminjamArray[l][8]);
                    System.out.printf("| Nim            : %-28s|\n", peminjamArray[l][0]);
                    System.out.printf("| Nama           : %-28s|\n", peminjamArray[l][1]);
                    System.out.printf("| Kode Buku      : %-28s|\n", peminjamArray[l][2]);
                    System.out.printf("| Judul          : %-28s|\n", peminjamArray[l][3]);
                    System.out.printf("| Penulis        : %-28s|\n", peminjamArray[l][4]);
                    System.out.printf("| Tahun Terbit   : %-28s|\n", peminjamArray[l][5]);
                    System.out.printf("| Jumlah         : %-28s|\n", peminjamArray[l][6]);
                    System.out.printf("| Tanggal        : %-28s|\n", peminjamArray[l][7]);
                    System.out.printf("| Status         : %-28s|\n", peminjamArray[l][8]);

                    System.out.println("|==============================================|");
                    System.out.println();

                }  else {
                    break;
                }

            }
            System.out.println();

        }else if (peminjamanCount == 0) {
                    System.out.println("|=============================================|");
                    System.out.println("|        Data Peminjaman Tidak Tersedia       |");
                    System.out.println("|=============================================|");
                    
                }
    }

    static void pengembalian() {

        boolean nimpengembalian = false;
        for (int i = 0; i < membercount; i++) {
            int bukuPinjam = Integer.parseInt(peminjamArray[i][6]);
            if (peminjamArray[i][9].equalsIgnoreCase(cariNimPeminjam)) {

                nimpengembalian = true;
                // if (nimketemu) {
                if (bukuPinjam == 0) {
                    System.out.println("Buku telah dikembalikan");
                } else {
                    System.out.println("Nama          : " + peminjamArray[i][1]);
                    System.out.println("Nim           : " + peminjamArray[i][0]);
                    System.out.println("Kode Buku     : " + peminjamArray[i][2]);
                    System.out.println("Judul Buku    : " + peminjamArray[i][3]);
                    System.out.println("Penulis Buku  : " + peminjamArray[i][4]);
                    System.out.println("Tahun Terbit  : " + peminjamArray[i][5]);
                    System.out.println("Jumlah        : " + peminjamArray[i][6]);
                    System.out.println("Tgl    pinjam : " + peminjamArray[i][7]);
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

                    System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
                    Date tanggalPinjam = masukkanTanggal(tanggalDenda);

                    System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
                    Date tanggalKembali = masukkanTanggal(tanggalDenda);

                    long selisihHari = hitungSelisihHari(tanggalPinjam, tanggalKembali);

                    if (selisihHari <= 7) {
                        System.out.println("Buku berhasil dikembalikan tepat waktu.");
                    } else if (selisihHari > 7) {
                        System.out.println("Berapa lama hari dipinjam adalah: " + selisihHari + " hari");
                        long totalDenda = (selisihHari - 7) * 1000;
                        System.out.println("Lama hari terlambat: " + (selisihHari - 7) + " hari");
                        System.out.println("Denda yang harus dibayar: Rp " + totalDenda);

                        for (int j = 0; j < memberArray.length; j++) {
                        if (peminjamArray[i][0].equalsIgnoreCase(memberArray[j][0])) {
                        memberArray[j][2] = String.valueOf(totalDenda);
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
                        pengembaliCount++;
                    }

                    int stokKembali = hitungStokKembali(Integer.parseInt(jumlahBukuKembali), i);
                    bukuArray[i][4] = String.valueOf(stokKembali);

                    int kurangJumlahPinjam = kurangStokPinjam(Integer.parseInt(jumlahBukuKembali), i);
                    peminjamArray[i][6] = String.valueOf(kurangJumlahPinjam);

                    break;
                }

            } else {
                System.out.println("Kode peminjaman tidak terdaftar");
                break;
            }
        }
        System.out.println();
    }

    static void laporanPengembalian() {
        System.out.println("|=============================================|");
        System.out.println("|              Data Pengembalian              |");
        System.out.println("|=============================================|");
        if (pengembaliCount > 0) {
            for (int m = 0; m < pengembaliCount; m++) {
                if (pengembaliArray[m][0] != null) {
                    System.out.println("|==============================================|");
                    System.out.printf("|  Data Pengembalian ke-%-24s|\n", (m + 1));
                    System.out.println("|==============================================|");
                    System.out.printf("| Nim            : %-28s|\n", pengembaliArray[m][0]);
                    System.out.printf("| Nama           : %-28s|\n", pengembaliArray[m][1]);
                    System.out.printf("| Kode Buku      : %-28s|\n", pengembaliArray[m][2]);
                    System.out.printf("| Judul          : %-28s|\n", pengembaliArray[m][3]);
                    System.out.printf("| Penulis        : %-28s|\n", pengembaliArray[m][4]);
                    System.out.printf("| Tahun Terbit   : %-28s|\n", pengembaliArray[m][5]);
                    System.out.printf("| Jumlah         : %-28s|\n", pengembaliArray[m][6]);
                    System.out.printf("| Tanggal        : %-28s|\n", pengembaliArray[m][7]);
                    System.out.printf("| Status         : %-28s|\n", pengembaliArray[m][8]);
                    System.out.printf("| Kode Pinjam    : %-28s|\n", pengembaliArray[m][9]);

                    System.out.println("|==============================================|");
                    System.out.println();
                } else {
                    break;
                }

            }
        }else if (pengembaliCount == 0) {
                System.out.println("|=============================================|");
                System.out.println("|       Data Pengembalian Tidak Tersedia      |");
                System.out.println("|=============================================|");
                }

    }

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

}
