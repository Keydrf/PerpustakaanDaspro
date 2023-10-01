import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        String username, password;

        System.out.print("Masukkan Username Anda: ");
        username = input2.next().toString();
        System.out.print("Masukkan Password Anda: ");
        password = input2.next().toString();

        if (username.equals("Admin1") && password.equals("4DM1NC4NT1K")) {
            System.out.println("Anda berhasil login!");
        } else {
            System.out.println("Username dan password salah silahkan login ulang!");
        }

        char kondisi;
        System.out.println("Pilih aktivitas yang akan anda lakukan");
        System.out.println("1. Meminjam buku");
        System.out.println("2. Mengembalikan buku");
        System.out.println("3. Mengubah stok");
        kondisi = input2.next().charAt(0);

        switch (kondisi) {
            case '1':
                String nama, judul, tanggal, nim;
                int jumlah, hari, telat;
                System.out.print("Masukkan Nama peminjam              : ");
                nama = input2.next();
                System.out.print("Masukkan NIM peminjam               : ");
                nim = input2.next();
                System.out.print("Masukkan judul buku yang dipinjam   : ");
                judul = input2.next();
                System.out.print("Masukkan jumlah buku yang dipinjam  : ");
                jumlah = input2.nextInt();
                System.out.print("Masukkan tanggal pengembalian       : ");
                tanggal = input2.next();
                System.out.println("Nama peminjam " + nama);
                System.out.println("NIM peminjam " + nim);
                System.out.println("Judul buku yang dipinjam " + judul);
                System.out.println("Jumlah buku yang dipinjam " + jumlah);
                System.out.println("Tanggal pengembalian " + tanggal);
                break;

            case '2':
                System.out.print("Masukkan nama peminjam               : ");
                nama = input2.next();
                System.out.print("Masukkan nim peminjam                : ");
                nim = input2.next();
                System.out.print("Masukkan judul buku yang dipinjam    : ");
                judul = input2.next();
                System.out.print("Masukkan jumlah buku yang dipinjam   : ");
                jumlah = input2.nextInt();
                System.out.print("Masukkan jumlah hari peminjaman      : ");
                hari = input2.nextInt();
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
                System.out.print("Masukkan jumlah buku yang hilang      :   ");
                hilang = input2.nextInt();
                System.out.print("Masukkan jumlah buku yang rusak       : ");
                rusak = input2.nextInt();
                stokakhir = stokawal - pinjam - hilang - rusak;
                System.out.println("Berhasil update stok!");
                System.out.println("Stok buku saat ini adalah " + stokakhir + " buku");
                break;
        }
    }
}
