import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mendapatkan tahun saat ini
        int tahunSaatIni = Calendar.getInstance().get(Calendar.YEAR);

        // Meminta pengguna untuk memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = input.nextInt();

        // Menghitung umur
        int umur = tahunSaatIni - tahunLahir;

        // Menampilkan umur pengguna
        System.out.println("Umur Anda adalah " + umur + " tahun.");

        // Menutup objek Scanner
        input.close();
    }
}
