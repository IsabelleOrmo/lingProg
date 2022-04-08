public class ContaPoupanca extends ContaBancaria {
    private static int diaRendimento = 5;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    public static void setDiaRendimento(int newDiaRendimento) {
		diaRendimento = newDiaRendimento;
	}
    
    public void calcularNovoSaldo(){
        setSaldo(getSaldo() * rendimento());
    }

    private float rendimento() {
        return (diaRendimento/100) + 1;
    }
}
