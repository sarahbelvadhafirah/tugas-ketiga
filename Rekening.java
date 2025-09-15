public class Rekening {
    public String noRekening;
    protected double saldo;

    public Rekening(String noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + noRekening);
        System.out.println("Saldo: Rp " + saldo);
    }

    public double hitungBunga() {
        return 0; 
    }
}