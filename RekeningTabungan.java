public class RekeningTabungan extends Rekening {
    public RekeningTabungan(String noRekening, double saldo) {
        super(noRekening, saldo);
    }

    @Override
    public double hitungBunga() {
        return saldo * 0.02; 
    }
} 
