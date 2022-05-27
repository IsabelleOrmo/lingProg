public class Poupanca extends Conta {
    private double taxa;

    public Poupanca() {
        super();
        taxa = 0;
    }

    public Poupanca(double saldo, double taxa) {
        super(saldo);
        this.taxa = taxa;
    }

    @Override
    public void mostra() {
        System.out.printf("Saldo:  %.2f\n", getSaldo());
        System.out.println("É uma conta poupança.");
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
