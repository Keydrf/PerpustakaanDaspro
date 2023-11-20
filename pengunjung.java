import java.util.Scanner;

public class pengunjung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int jmlBuku;
        String namaPeminjam, jdlBuku, NIM, pilihan, username, password, kegiatan,pilihan1;
        do {
            System.out.println("anda masuk sebagai pengunjung, apakah anda terdaftar member? (ya/tidak) ");
            pilihan = scan1.nextLine();
            if (pilihan.equalsIgnoreCase("ya")) {
                do {
                    System.out.print("masukkan username : ");
                    username = scan1.nextLine();
                    System.out.print("masukkan password : ");
                    password = scan1.nextLine();
                    if (username.equals("pengunjung") && password.equals("pengunjung123")) {
                        do {
                            System.out.println("Anda berhasil login, pilih aktifitas yang ingin anda lakukan :");
                            System.out.println("Meminjam buku / Mencari buku ");
                            kegiatan = scan1.nextLine();
                            if (kegiatan.equalsIgnoreCase("meminjam buku")) {
                                System.out.println("Anda berada di laman peminjaman buku");
                                System.out.print("Masukkan nama peminjam : ");
                                namaPeminjam = scan1.nextLine();
                                System.out.print("Masukkan NIM Peminjam : ");
                                NIM = scan1.nextLine();
                                System.out.print("Masukkan judul buku : ");
                                jdlBuku = scan1.nextLine();
                                System.out.print("masukkan jumlah buku yang akan dipinjam : ");
                                jmlBuku = scan.nextInt();
                                System.out.println(" peminjam atas nama " + namaPeminjam + " dengan NIM " + NIM
                                        + " Berhasil meminjam buku berjudul " + jdlBuku + " berjumlah " + jmlBuku);
                                System.out.println("apakah anda ingin melakukan transaksi lain (Ya / Tidak)");
                                pilihan1 = scan1.nextLine(); 
                               break;
                            } else if (kegiatan.equalsIgnoreCase("mencari buku")) {
                                System.out.println("Anda memasuki laman pencarian buku");
                                System.out.println("Masukkan Judul buku");
                                jdlBuku = scan.nextLine();

                                String[] judul = {"369 days", "Allhamdulillah", "Allahuakbar"};
                                String[] penulis ={"memet", "jaran", "otong"};
                                String[] terbit ={"2002", "2003", "2005"};
                                boolean tersedia = false;
                                for (int j=0; j < judul.length; j++) {
                                    if (judul[j].equalsIgnoreCase(jdlBuku)) {
                                        tersedia = true;
                                        System.out.println("=== Buku Tersedia ===");
                                        System.out.println("Judul : "+judul[j]);
                                        System.out.println("Penulis : "+penulis[j]);
                                        System.out.println("Tahun Terbit : "+terbit[j]);
                                        
                                        break;
                                    } if (!tersedia){
                                        System.out.println("Buku tidak tersedia");
                                    }
                                } 
                                
                                System.out.println("Apakah nda ingin melakukan transaksi lain (Ya / Tidak)");
                                pilihan1 = scan1.nextLine();
                    
                        } 
                            else {
                                System.out.println("Anda tidak memiliki wewenang untuk mengakses laman lain");
                                break;
                            }
                        } while (pilihan1.equalsIgnoreCase("ya"));
                        break;
                    } else {
                        System.out.println("Akun yang anda masukkan tidak terdaftar, silahkan mengulangi login");
                        break;
                    }
                } while (true);
            }
        } while (true);
    }
}       
        

// } else if (pilihan.equalsIgnoreCase("tidak")) {
// do {
// System.out.print("apakah anda ingin mendaftarkan diri sebagai member
// (ya/tidak)");
// pilihan = scan.nextLine();
// if (pilihan.equals("ya")) {
// System.out.println(
// "silahkan melakukan pendataan dan verifikasi di meja admin untuk pendaftaran
// member");
// break;
// } else if (pilihan.equals("tidak")) {
// System.out.print("anda berhasil memasuki laman sebagai guest");
// System.out.println("Silahkan melakukan pencarian buku");
// System.out.println("masukkan judul buku : ");
// jdlBuku = scan.nextLine();
// if (jdlBuku.equals("mencari tito di pasar")) {
// System.out
// .print("Buku tersedia silahkan lakukan verifikasi di meja admin untuk
// peminjaman");
// break;
// } else {
// System.out.println("Buku tidak tersedia");
// }
// } else {
// System.out.println("pastikan pilihan benar");
// }
// } while (true);
// } else {
// System.out.println("Pastikan pilihan anda benar");
// }
// } while (true);
// }
// }
