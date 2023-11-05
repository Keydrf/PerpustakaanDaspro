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
        String buku[][] = new String[10][2];
        int bukuInt[][] = new int[10][2];
        String kodeBuku, judulBuku, penulis;
        int jumlahBuku, tahunTerbit;
        //////////////// buku selesai ////////////////

        //////////////// peminjam mulai ////////////////
        /// scanner peminjaman ///
        Scanner peminjamHuruf = new Scanner(System.in);
        Scanner peminjamAngka = new Scanner(System.in);
        /// deklarasi inputan peminjaman ///
        String peminjamStr[][] = new String[100][3];
        int peminjamInt[][] = new int[100][1];
        String nim, nama, tenggat;
        int jumlah;
        boolean found = false;
        //////////////// peminjam selesai ////////////////

        while (true) {
            System.out.println("Silahkan Pilih Menu (1/2)");
            System.out.println("1. Input buku");
            System.out.println("2. Peminjaman");
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
                        jumlahBuku = bukuAngka.nextInt();
                        System.out.print("Masukkan tahun terbit: ");
                        tahunTerbit = bukuAngka.nextInt();

                        buku[i][0] = judulBuku;
                        buku[i][1] = penulis;
                        bukuInt[i][0] = jumlahBuku;
                        bukuInt[i][1] = tahunTerbit;

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
                            System.out.println("   Jumlah buku: " + bukuInt[i][0]);
                            System.out.println("   Tahun terbit: " + bukuInt[i][1]);
                            break;
                        }
                    }
                }
            } else if (menu == 2) {
                System.out.println("Anda memasuki menu peminjaman buku");
                for (int i = 0; i < peminjamStr.length; i++) {
                    System.out.println("Masukkan NIM peminjaman: ");
                    nim = peminjamHuruf.nextLine();
                    peminjamStr[i][0] = nim;
                    for (int j = 0; j < peminjamStr[i].length; j++) {
                        System.out.println("Masukkan nama peminjam: ");
                        nama = peminjamHuruf.nextLine();
                        System.out.println("Masukkan kode buku: ");
                        kodeBuku = peminjamHuruf.nextLine();
                        System.out.println("Masukkan tahun terbit: ");
                        tahunTerbit = peminjamAngka.nextInt();
                        if (buku[i][j] == kodeBuku && bukuInt[i][j] == tahunTerbit) {
                            System.out.println("Judul buku: " + buku[i][1]);
                            System.out.println("Jumlah buku: " + buku[i][0]);
                            System.out.println("Tahun terbit: " + bukuInt[i][1]);
                        }
                        System.out.println("Masukkan jumlah buku: ");
                        jumlah = peminjamAngka.nextInt();
                        System.out.println("Masukkan tenggat: ");
                        tenggat = peminjamHuruf.nextLine();
                        peminjamStr[i][1] = nama;
                        peminjamStr[i][2] = kodeBuku;
                        peminjamInt[i][0] = jumlah;
                        peminjamStr[i][3] = tenggat;
                        bukuInt[i][0] = -jumlah;

                    }
                }

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