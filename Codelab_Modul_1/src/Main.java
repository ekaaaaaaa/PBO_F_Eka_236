import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String aman = input.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char gender = input.next().charAt(0);
        String gender2;
        if (gender == 'L' || gender == 'l') {
            gender2 = "Laki - Laki";
        }else if (gender == 'P' || gender == 'p'){
            gender2 = "Perempuan";
        }else {
            gender2 = "Inputan Tidak Valid";
        }
        System.out.print("Masukkan tahun lahir: ");
        int birth = input.nextInt();
        int TahunSekarang = LocalDate.now().getYear();
        int age = TahunSekarang - birth;

        System.out.println("\nData Diri: ");
        System.out.println("Nama\t\t\t : " + aman);
        System.out.println("Jenis Kelamin\t : " + gender2);
        System.out.println("Umur\t\t\t : " + age + " Tahun");
        input.close();
        }
    }
