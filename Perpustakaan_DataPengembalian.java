import java.util.Scanner;
public class Perpustakaan_DataPengembalian{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String nama_peminjam, judul_buku;
        int stok_buku = 10, jml_buku_pjm, jml_buku_sekarang;


        System.out.println("Masukkan nama peminjam:");
        nama_peminjam = input.next();
        System.out.println("Masukkan judul buku:");
        judul_buku = input.next();
        System.out.println("Masukkan jumlah buku:");
        jml_buku_pjm = input.nextInt();

        System.out.println("Data Pengembalian");
        System.out.println("Nama Peminjam: " + nama_peminjam);
        System.out.println("Judul Buku: " + judul_buku);
        System.out.println("Jumlah buku yang dipinjam:" +jml_buku_pjm);
        jml_buku_sekarang = stok_buku + jml_buku_pjm;
        System.out.println("Stok Buku Sekarang:" + jml_buku_sekarang);
        // System.out.println("Stok Buku: " + stok_buku--);
        // System.out.println("Stok saat ini =" + stok_buku);
        
    }
}