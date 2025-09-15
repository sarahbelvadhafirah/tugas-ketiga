public class RekeningDeposito extends Rekening {
    public RekeningDeposito(String noRekening, double saldo) {
        super(noRekening, saldo);
    }

    @Override
    public double hitungBunga() {
        return saldo * 0.05; 
    }
}
