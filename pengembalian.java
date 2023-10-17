import java.util.Scanner;
public class pengembalian {

    public static void main(String[] args) {
        Scanner input3 =new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        int jumlah, telat, hari=0;
        float nim;
        double denda, tenggat;
        String konfirmasi,judul,nama;
            
        do {
            System.out.print("Apakah anda ingin mengembalikan buku (y/t)? ");
            konfirmasi = input2.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan nama peminjam               : ");
                nama = input3.nextLine();
                System.out.print("Masukkan nim peminjam                : ");
                nim = input2.nextFloat();
                System.out.print("Masukkan judul buku yang dipinjam    : ");
                judul = input3.nextLine();
                System.out.print("Masukkan jumlah buku yang dipinjam   : ");
                jumlah = input2.nextInt();
                System.out.print("Masukkan jumlah hari peminjaman      : ");
                hari = input2.nextInt();
                
                telat = hari - 7;
                tenggat = 7; 

                if (hari > tenggat) {   
                denda =(hari - 7) * 5000;
                System.out.println("Peminjam " + nama + " terkena denda sebesar " + denda + " karena terlambat mengembalikan buku " + telat + " hari. ");

                } else {
                System.out.println("Buku berhasil dikembalikan");

                } 
                }if (konfirmasi.equalsIgnoreCase("t")) {
                    break;
                }
        } while (hari > 7);
    }
}