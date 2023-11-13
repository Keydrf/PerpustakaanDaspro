import java.util.Scanner;

public class PerpustakaanRapi {
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

        ///////////////////////// DEKLARASI//////////////////////
        String levelPengguna, username, password;

        //////////////// buku mulai ////////////////

        /// deklarasi inputan buku ///
        String buku[][] = new String[10][5];
        int bukuInt[][] = new int[10][2];
        String kodeBuku, judulBuku, penulis, tahunTerbit, jumlahBuku;

        //////////////// buku selesai ////////////////

        /////////////// input member mulai ///////////////
        /// deklarasi input member ///
        String nim, nama;
        int membercount = 0;
        String[][] memberArray = new String[100][2];
        /////////////// input member selesai ///////////////

        //////////////// peminjam mulai ////////////////
        /// deklarasi inputan peminjaman ///
        String peminjamStr[][] = new String[100][8];

        String nim1, nama1 = null, tenggat, kodeBuku1;
        int jumlah;
        boolean found = false;
        //////////////// peminjam selesai ////////////////

        do {
            System.out.println("|===========================================|");
            System.out.println("|           Pilih level pengguna            |");
            System.out.println("|===========================================|");
            System.out.println("| 1. Admin                                  |");
            System.out.println("| 2. Pelanggan                              |");
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
                        System.out.println("| 6. Laporan Peminjaman                     |");
                        System.out.println("| 7. Laporan Pengembalian                   |");
                        System.out.println("| 8. Kembali                                |");
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
                                    for (int i = 0; i < buku.length;) {
                                        System.out.print("Masukkan kode buku: ");
                                        for(int c = 0; c<buku[i].length; c++){

                                        }
                                        kodeBuku = bukuHuruf.nextLine();
                                        buku[i][0] = kodeBuku;
                                        for (int j = 0; j < buku[i].length; j++) {
                                            System.out.print("Masukkan judul buku: ");
                                            judulBuku = bukuHuruf.nextLine();
                                            System.out.print("Masukkan nama penulis: ");
                                            penulis = bukuHuruf.nextLine();
                                            System.out.print("Masukkan tahun terbit: ");
                                            tahunTerbit = bukuAngka.nextLine();
                                            System.out.print("Masukkan jumlah buku: ");
                                            jumlahBuku = bukuAngka.nextLine();

                                            buku[i][1] = judulBuku;
                                            buku[i][2] = penulis;
                                            buku[i][3] = tahunTerbit;
                                            buku[i][4] = jumlahBuku;

                                            break;
                                        }
                                        System.out.println("Apakah anda ingin menambah buku baru? (y/t): ");
                                        String confirm = bukuHuruf.nextLine();
                                        if (confirm.equalsIgnoreCase("y")) {
                                            i++;
                                        } else {
                                            break;
                                        }

                                    }
                                } else if (confirm1 == 2) {
                                    for (int i = 0; i < buku.length; i++) {
                                        if (buku[i][0] != null) {
                                            System.out.println("Buku ke-"+(i + 1) );
                                            for (int j = 0; j < buku[i].length; j++) {
                                                System.out.println("   Kode buku: "+buku[i][0]);
                                                System.out.println("   Judul buku: " + buku[i][1]);
                                                System.out.println("   Penulis: " + buku[i][2]);
                                                System.out.println("   Tahun terbit: " + buku[i][3]);
                                                System.out.println("   Jumlah buku: " + buku[i][4]);
                                                break;
                                            }
                                        } else {
                                            System.out.println("Data buku kosong ");
                                        }
                                        break;

                                    }

                                } else if (confirm1 == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah");
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
                                    for (int i = 0; i < memberArray.length;) {
                                        System.out.print("Masukkan NIM: ");
                                        nim = memberSH.nextLine();
                                        System.out.print("Masukkan Nama: ");
                                        nama = memberSH.nextLine();
                                        memberArray[i][0] = nim;
                                        memberArray[i][1] = nama;
                                        membercount++;
                                        System.out.println("Apakah anda ingin menambah member lagi? (y/t): ");
                                        String membertanya = memberSH.nextLine();
                                        
                                        if (membertanya.equalsIgnoreCase("y")) {
                                            i++;
                                        } else {
                                            break;
                                        }
                                    }
                                } else if (confirm2 == 2) {
                                    System.out.println("Data Member");
                                    

                                        if (membercount>0) {
                                            for (int i = 0; i < membercount; i++) {
                                            System.out.println("Member ke-"+(i+1) );
                                            
                                                System.out.println("NIM: "+memberArray[i][0]);
                                                System.out.println("Nama: " + memberArray[i][1]);
                                                
                                            
                                            // break;
                                            }
                                        } else {
                                            System.out.println("Member member kosong");
                                            
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
                                    if (buku[0][0] != null) {
                                        for (int i = 0; i < peminjamStr.length;) {
                                            System.out.print("Apakah sudah terdaftar sebagai member? (y/t): ");
                                            String tanyaDaftar = peminjamHuruf.nextLine();
                                            if (tanyaDaftar.equalsIgnoreCase("y")) {
                                                System.out.print("Masukkan NIM peminjaman: ");
                                                nim1 = peminjamHuruf.nextLine();
                                                peminjamStr[i][0] = nim1;
                                                boolean nimketemu = false;
                                                for (int b = 0; b < peminjamStr.length; b++) {
                                                    if (memberArray[b][0].equalsIgnoreCase(nim1)) {
                                                        nama1 = memberArray[b][1];
                                                        nimketemu = true;
                                                        break;
                                                    }
                                                }
                                                if (nimketemu) {

                                                    System.out.println("Nama: " + nama1);

                                                    for (int c = 0; c < peminjamStr[i].length; c++) {
                                                        System.out.print("Masukkan kode buku: ");
                                                        kodeBuku1 = peminjamHuruf.nextLine();
                                                        System.out.print("Masukkan jumlah buku: ");
                                                        jumlah = peminjamAngka.nextInt();
                                                        boolean bukuketemu = false;
                                                        for (int a = 0; a < peminjamStr.length; a++) {
                                                            if (buku[a][0].equalsIgnoreCase(kodeBuku1)) {
                                                                if (Integer.parseInt(buku[i][4]) > 0) {
                                                                    System.out.println("Judul buku: " + buku[a][1]);
                                                                    System.out.println("Penulis buku: " + buku[a][2]);
                                                                    System.out.println("Tahun terbit: " + buku[a][3]);
                                                                    System.out.println("Jumlah buku: " + buku[a][4]);

                                                                    int stok = Integer.parseInt(buku[a][4]);
                                                                    if (stok <= jumlah) {
                                                                        stok -= jumlah;
                                                                        buku[a][4] = String.valueOf(stok);
                                                                    }

                                                                    bukuketemu = true;
                                                                    System.out.print("Masukkan tenggat: ");
                                                                    tenggat = peminjamHuruf.nextLine();
                                                                    peminjamStr[i][1] = memberArray[i][1];
                                                                    peminjamStr[i][2] = kodeBuku1;
                                                                    peminjamStr[i][3] = buku[i][1];
                                                                    peminjamStr[i][4] = buku[i][2];
                                                                    peminjamStr[i][5] = buku[i][3];
                                                                    peminjamStr[i][6] = String.valueOf(jumlah);
                                                                    peminjamStr[i][7] = tenggat;
                                                                    break;
                                                                } else if (Integer.parseInt(buku[i][4]) == 0) {
                                                                    System.out.println("stok buku tidak mencukupi");
                                                                    break;
                                                                }
                                                            } else if(buku[0][0]==null){
                                                                System.out.println("Buku tidak Tersedia");
                                                            } else{
                                                                break;
                                                            }
                                                            

                                                        }

                                                    }

                                                }
                                                System.out.print("Apakah anda ingin melanjutkan pengembalian (y/t)? ");
                                                String firmasi = konfirmasiHuruf.nextLine();
                                                if (firmasi.equalsIgnoreCase("y")) {
                                                    i++;
                                                } else {
                                                    System.out.println("Apakah anda ingin mencetak struk (y/t)? ");
                                                    String firm = konfirmasiHuruf.nextLine();
                                                    if (firm.equalsIgnoreCase("y")) {
                                                        for (int l = 0; l < peminjamStr.length; l++) {
                                                            if (peminjamStr[i][0] != null) {
                                                                System.out.println("Nim : " + peminjamStr[l][0]);
                                                                System.out.println("Nama : " + peminjamStr[l][1]);
                                                                System.out.println("kode Buku : " + peminjamStr[l][2]);
                                                                System.out.println("Judul : " + peminjamStr[l][3]);
                                                                System.out.println("Penulis : " + peminjamStr[l][4]);
                                                                System.out.println("Tahun Terbit : " + peminjamStr[l][5]);
                                                                System.out.println("Jumlah : " + peminjamStr[l][6]);
                                                                System.out.println("Tenggat : " + peminjamStr[l][7]);
                                                                break;
                                                            }
                                                            break;

                                                        }
                                                    } else {
                                                        
                                                        break;
                                                    }

                                                }
                                            } else {
                                                System.out.println("Silahkan daftar terlebih dahulu");
                                                break;
                                            }
                                        }
                                    }
                                } else if (confirm3 == 2) {
                                    for (int l = 0; l < peminjamStr.length; l++) {
                                        System.out.println("Peminjam ke-"+(l+1));
                                        if (peminjamStr[l][0] != null) {
                                            System.out.println("Nim : " + peminjamStr[l][0]);
                                            System.out.println("Nama : " + peminjamStr[l][1]);
                                            System.out.println("kode Buku : " + peminjamStr[l][2]);
                                            System.out.println("Judul : " + peminjamStr[l][3]);
                                            System.out.println("Penulis : " + peminjamStr[l][4]);
                                            System.out.println("Tahun Terbit : " + peminjamStr[l][5]);
                                            System.out.println("Jumlah : " + peminjamStr[l][6]);
                                            System.out.println("Tenggat : " + peminjamStr[l][7]);
                                            break;
                                        }
                                        break;

                                    }
                                } else if (confirm3 == 3) {
                                    break;
                                } else {
                                    System.out.println("Data yang anda masukkan salah!");
                                }
                            } while (true);
<<<<<<< HEAD
                        } else if (menu == 4){ 
                    }else if (menu == 8) {
=======
                        } else if (menu == 4) {

                        } else if (menu == 8) {
>>>>>>> 1b53d6a55963450564283fe312be89a46a591f39
                            break;
                        }
                    } while (true);

                } else {
                    System.out.println("Username dan password salah silahkan login kembali!");
                }
            } else if (levelPengguna.equalsIgnoreCase("pengguna")) {

            }
        } while (true);

    }
}
