import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nomor rekening: ");
            String noRek = input.nextLine();

            System.out.print("Masukkan saldo awal: ");
            double saldo = input.nextDouble();
            input.nextLine(); // buang newline

            System.out.print("Masukkan jenis rekening (tabungan/giro/deposito): ");
            String jenis = input.nextLine().toLowerCase();

            Rekening rekening;

            switch (jenis) {
                case "tabungan" -> rekening = new RekeningTabungan(noRek, saldo);
                case "giro" -> rekening = new RekeningGiro(noRek, saldo);
                case "deposito" -> rekening = new RekeningDeposito(noRek, saldo);
                default -> {
                    System.out.println("Jenis rekening tidak valid!");
                    input.close();
                    return;
                }
            }

            System.out.println("\n=== Informasi Rekening ===");
            rekening.tampilkanInfo();
            System.out.println("Bunga: Rp " + rekening.hitungBunga());

            input.close();
        }
    }
}
