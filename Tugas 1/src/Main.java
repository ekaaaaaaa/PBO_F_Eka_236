import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        String user = "Admin236";
        String password = "password236";

        String nama = "Eka Putri Khustimawati";
        String nim = "202410370110236";

        System.out.println("Pilih Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");

        int louw;
        if (objInput .hasNextInt()){
            louw = objInput.nextInt();
            objInput.nextLine();
        }else {
            System.out.print("Pilihan Tidak Valid");
            objInput.close();
            return;
        }

        if (louw == 1){
            while (true){
                System.out.print("Masukkan Usernama: ");
                String uname = objInput.nextLine();

                System.out.print("Masukkan Password: ");
                String kunci = objInput.nextLine();

                if (uname.equals(user) && kunci.equals(password)){
                    System.out.print("Login Admin Berhasil");
                    break;
                }else {
                    System.out.println("Login Gagal, Mohon Coba Lagi");
                }
            }
        } else if (louw == 2) {
            while (true){
                System.out.print("Masukkan Nama: ");
                String nnama = objInput.nextLine();

                System.out.print("Masukkan NIM: ");
                String angka = objInput.nextLine();

                if (nnama.equals(nama) && angka.equals(nim)){
                    System.out.println("Login Berhasil");
                    System.out.println("Nama : " + nama);
                    System.out.println("NIM : " + nim);
                    break;
                }else {
                    System.out.print("Login Gagal ! Nama atau NIM salah ");
                }
            }

        }else {
            System.out.print("Inputan Tidak Valid, Mohon Pilih Sesuai Ketentuan");
        }
        objInput.close();
    }
}