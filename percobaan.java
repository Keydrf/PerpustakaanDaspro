import java.util.Scanner;
public class percobaan {
    public static void main(String[] args) {

        /// scanner menu dan pemilihan///
        Scanner menuPil = new Scanner(System.in);
        Scanner konfirmasi = new Scanner(System.in);
        boolean konfir = false;
        //////////////// buku mulai ////////////////
        /// scanner input buku ///
        Scanner bukuAngka = new Scanner(System.in);
        Scanner bukuHuruf = new Scanner(System.in);
        /// deklarasi inputan buku ///
        String buku[][] = new String[10][5];
        int bukuInt[][] = new int[10][2];
        String kodeBuku, judulBuku, penulis, tahunTerbit, jumlahBuku;

        //////////////// buku selesai ////////////////

        /////////////// input member mulai ///////////////
        /// scanner input member ///
        Scanner memberSH = new Scanner(System.in);

        /// deklarasi input member ///
        String nim, nama;
        String[][] memberArray = new String[100][2];
        /////////////// input member selesai ///////////////

        //////////////// peminjam mulai ////////////////
        /// scanner peminjaman ///
        Scanner peminjamHuruf = new Scanner(System.in);
        Scanner peminjamAngka = new Scanner(System.in);
        /// scanner pengembalian ///
        Scanner pengembaliHuruf = new Scanner(System.in);
        Scanner pengembaliAngka = new Scanner(System.in);
        /// scanner laporan ///
        Scanner laporanHuruf = new Scanner (System.in);
        Scanner laporanAngka = new Scanner (System.in);
        Scanner menuLap = new Scanner(System.in);
        /// deklarasi inputan peminjaman ///
        String peminjamStr[][] = new String[100][8];
        String nim1, nama1 = null, tenggat, kodeBuku1, nim2;
        int jumlah;
        boolean found = false;
        int peminjamancount = 0;
        //////////////// peminjam selesai ////////////////
        /// deklarasi inputan pengembalian ///
        String pengembalianStr[][] = new String[100][8];
        /////////////// pengembali selesai ///////////////
        /// deklarasi inputan laporan ///
        int peminjamcount = 0;

        while (true) {
            System.out.println("Silahkan Pilih Menu (1/2/3)");
            System.out.println("1. Input buku");
            System.out.println("2. Input member");
            System.out.println("3. Peminjaman");
            System.out.println("4. pengembalian");
            System.out.println("5. Laporan ");
            System.out.print("Pilihan Anda : ");
            int menu = menuPil.nextInt();

            if (menu == 1) {
                System.out.println("Anda memasuki menu menambah buku");
                for (int i = 0; i < buku.length;) {
                    System.out.print("Masukkan kode buku: ");
                    kodeBuku = bukuHuruf.nextLine();
                    buku[i][0] = kodeBuku;
                    for (int j = 0; j < buku[i].length; j++) {
                        System.out.print("Masukkan judul buku: ");
                        judulBuku = bukuHuruf.nextLine();
                        System.out.print("Masukkan nama penulis: ");
                        penulis = bukuHuruf.nextLine();
                        System.out.print("Masukkan jumlah buku: ");
                        jumlahBuku = bukuAngka.nextLine();
                        System.out.print("Masukkan tahun terbit: ");
                        tahunTerbit = bukuAngka.nextLine();
                        buku[peminjamcount][0] = judulBuku;
                        buku[peminjamancount][1] = penulis;
                        buku[peminjamancount][2] = jumlahBuku;
                        buku[peminjamancount][3] = tahunTerbit;
                        peminjamancount++;

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
                for (int i = 0; i < buku.length; i++) {
                    if (buku[i][0] != null) {
                        System.out.println((i + 1) + ". Kode buku: " + buku[i][0]);
                        for (int j = 0; j < buku[i].length; j++) {
                            System.out.println("   Judul buku: " + buku[i][1]);
                            System.out.println("   Penulis: " + buku[i][2]);
                            System.out.println("   Tahun terbit: " + buku[i][3]);
                            System.out.println("   Jumlah buku: " + buku[i][4]);

                            break;
                        }

                    }
                }
            } else if (menu == 2) {
                System.out.println("Anda berada pada menu input member");
                for (int i = 0; i < memberArray.length;) {
                    System.out.println("Masukkan NIM: ");
                    nim = memberSH.nextLine();
                    System.out.println("Masukkan Nama: ");
                    nama = memberSH.nextLine();
                    memberArray[i][0] = nim;
                    memberArray[i][1] = nama;

                    System.out.println("Apakah anda ingin menambah member lagi? (y/t): ");
                    String membertanya = memberSH.nextLine();
                    ;
                    if (membertanya.equalsIgnoreCase("y")) {
                        i++;
                    } else {
                        break;
                    }
                }
                System.out.println("Data Member");
                for (int i = 0; i < memberArray.length; i++) {
                    if (memberArray[i][0] != null) {
                        System.out.println((i + 1) + ". NIM: " + memberArray[i][0]);
                        for (int j = 0; j < memberArray[i].length; j++) {
                            System.out.println("   Nama: " + memberArray[i][1]);
                            break;
                        }

                    } else {
                        break;
                    }

                }

            } else if (menu == 3) {
                System.out.println("Anda memasuki menu peminjaman buku");
                if (buku[0][0] != null) {
                    for (int i = 0; i < peminjamStr.length; i++) {
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
                                }else{
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
                                            } else {
                                                System.out.println("Buku tidak Tersedia");
                                            }break;
                                            
                                        }
                                        break;
                                    }
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
                            } System.out.println("apakah anda ingin meminjam buku lagi (y/t)?");
                                    String Confirm = konfirmasi.nextLine();
                                    if(Confirm.equalsIgnoreCase("y")){
                                        i++;
                                    } else {
                                    break;
                                    }
                        }else {
                                System.out.println("Silahkan daftar terlebih dahulu");
                                break;
                            }
                            break;
                    }
                } else if (buku[0][0]==null){
                    System.out.println("=====================");
                    System.out.println("Tidak Tersedia Buku");
                    System.out.println("=====================");
                } else {
                    break;
                }

            } else if (menu == 4) {
                System.out.println("Anda memasuki menu pengembalian buku");
                for (int i = 0; i < peminjamStr.length; i++) {
                    if (peminjamStr[0][0] != null) {
                        System.out.println("Masukkan Nim Peminjam : ");
                        nim1 = pengembaliHuruf.nextLine();
                        pengembalianStr[i][0] = nim1;
                        boolean bukuketemu = false;
                        for (i = 0; i < pengembalianStr.length; i++) {
                            if (peminjamStr[i][0].equalsIgnoreCase(nim1)) {
                                nama1 = memberArray[i][1];
                                bukuketemu = true;
                                break;
                            }
                            if (bukuketemu) {
                                System.out.println("Nama peminjam : " + nama1);
                                System.out.println("Judul buku yang dipinjam " + peminjamStr[i][4]);
                                System.out.println("Kode buku yang dipinjam " + peminjamStr[i][3]);
                            }
                        }

                    } else {
                        System.out.println("Tidak ada buku yang dipinjam");
                    }
                    break;
                }

            } else if (menu == 5) {
                while (true) {
                    System.out.println("Anda memasuki menu laporan");
                    System.out.println("Silahkan pilih laporan");
                    System.out.println("1. Laporan Peminjaman");
                    System.out.println("2. Laporan pengembalian");
                    System.out.println("3. Kemblali ke menu utama");
                    System.out.print("Masukkan pilihan anda : ");
                    int menu1 = menuLap.nextInt();
                    if (menu1 == 1) {
                        if (peminjamancount > 0) {
                            for (int l = 0; l < peminjamancount; l++) {
                                if (buku [0][0] != null){
                                System.out.println("Member ke : "+ (l+1));
                                System.out.println("Nim : " + peminjamStr[l][0]);
                                System.out.println("Nama : " + peminjamStr[l][1]);
                                System.out.println("kode Buku : " + peminjamStr[l][2]);
                                System.out.println("Judul : " + peminjamStr[l][3]);
                                System.out.println("Penulis : " + peminjamStr[l][4]);
                                System.out.println("Tahun Terbit : " + peminjamStr[l][5]);
                                System.out.println("Jumlah : " + peminjamStr[l][6]);
                                System.out.println("Tenggat : " + peminjamStr[l][7]);
                            }
                        }
                            //break;
                            }else {
                                System.out.println("==================================");
                                System.out.println("tidak terdapat buku yang dipinjam");
                                System.out.println("==================================");
                                break;
                            }
                    } else if (menu1 == 2) {

                    }else {
                        break;
                    }
                }
            } else {
                System.out.println("Mohon maaf belum bisa diakses");
            }
            System.out.println("Apakah anda ingin melanjutkan menu lain? (y/t): ");
            String konf = konfirmasi.nextLine();
            if (konf.equalsIgnoreCase("y")) {
                konfir = true;
            } else {
                System.out.println("Terimakasih, have a nice day:)");
            }
        }

    }
}
