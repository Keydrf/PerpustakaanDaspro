import java.util.Scanner;
public class InputMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Masukkan jumlah member : ");
        int member = sc.nextInt();

        String[] nama = new String[member];
        String[] nim = new String[member];
        for (int m=0; m < nama.length; m++) {
            System.out.println("Masukkan nama member ke-"+(m+1)+": ");
            nama [m] = sc2.nextLine();
            System.out.println("Masukkan NIM member ke-"+(m+1)+": ");
            nim [m] = sc2.nextLine();
        }
        for (int m = 0; m < nama.length; m++) {
            System.out.println("Nama member ke-"+(m+1)+": " + nama[m] + " dengan NIM " + nim[m]+ " berhasil dimasukkan");
        }
    }
}