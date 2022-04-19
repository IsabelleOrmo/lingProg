public class Conta {
    private double saldo;

    public Conta() {
        saldo = 0;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo ;
    }

    public void mostra() {
        System.out.printf("Saldo:  %.2f\n", getSaldo());
        System.out.println("É uma conta.");
    }
}
