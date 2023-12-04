import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class testDenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
        Date tanggalPinjam = masukkanTanggal(scanner);

        System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
        Date tanggalKembali = masukkanTanggal(scanner);

        long selisihHari = hitungSelisihHari(tanggalPinjam, tanggalKembali);

        if (selisihHari <= 7) {
            System.out.println("Buku berhasil dikembalikan tepat waktu.");
        } else if (selisihHari > 7) {
            System.out.println("Lama hari dipinjam adalah: " + selisihHari + " hari");
            long denda = (selisihHari-7) * 1000;
            System.out.println("Lama hari terlambat: " + (selisihHari-7) + " hari");
            System.out.println("Denda yang harus dibayar: Rp " + denda);  
        }
    }

    public static Date masukkanTanggal(Scanner scanner) {
        String inputTanggal = scanner.next();

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
