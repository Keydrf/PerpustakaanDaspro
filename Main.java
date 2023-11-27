import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Memasukkan input pertama
        System.out.println("Masukkan tanggal pertama:");
        Calendar tanggalPertama = masukkanTanggal(scanner1);

        // Memasukkan input kedua
        System.out.println("Masukkan tanggal kedua:"); 
        Calendar tanggalKedua = masukkanTanggal(scanner);

        // Menghitung selisih antara kedua tanggal 
        long selisihMilidetik = Math.abs(tanggalKedua.getTimeInMillis() - tanggalPertama.getTimeInMillis());

        // Mengubah selisih dalam milidetik menjadi hari
        long selisihHari = selisihMilidetik / (1000 * 60 * 60 * 24);

        System.out.println("Selisih dalam hari: " + selisihHari + " hari"); 
    }

    // Metode untuk meminta input tanggal dari pengguna dan membuat objek Calendar
    public static Calendar masukkanTanggal(Scanner scanner) {
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = scanner.nextInt();

        System.out.print("Masukkan tanggal: ");
        int tanggal = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, tahun);
        calendar.set(Calendar.MONTH, bulan - 1);
        calendar.set(Calendar.DAY_OF_MONTH, tanggal);

        return calendar;
    }
}