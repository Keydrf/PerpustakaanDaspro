import java.util.Scanner;
public class PerpustakaanRapi {
   public static void main(String [] args){
    //////////////////////SCANNER///////////////////////////
    Scanner pilLevel = new Scanner(System.in);
    Scanner login = new Scanner(System.in);

    Scanner bukuHuruf = new Scanner(System.in);
    Scanner bukuAngka = new Scanner(System.in);

    /////////////////////////DEKLARASI//////////////////////
    String levelPengguna, username, password;
    String kodeBuku, judulBuku;

    System.out.println("_____________________________________________");
    System.out.println("|                                           |");
    System.out.println("|           Pilih level pengguna            |");
    System.out.println("|___________________________________________|");
    System.out.println("| 1. Admin                                  |");
    System.out.println("| 2. Pelanggan                              |");
    System.out.println("|___________________________________________|"); 
    levelPengguna = pilLevel.nextLine();
    
    if (levelPengguna.equalsIgnoreCase("admin")){
        System.out.println("_____________________________________________");
        System.out.println("|                                           |");
        System.out.println("|      Silahkan login terlebih dahulu       |");
        System.out.println("|___________________________________________|");
        System.out.print("| Username: ");
        username = login.nextLine(); System.out.print("         |");
    }
   } 
}
