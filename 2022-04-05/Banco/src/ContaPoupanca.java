public class ContaPoupanca extends ContaBancaria {
    private static int diaRendimento = 5;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void testaConta() {
        super.testaConta();
        ContaPoupanca contaTeste = this;
        int rendimentoAntigo = diaRendimento;
        System.out.printf("Valor do rendimento em porcentagem:  %.2f%%\n", rendimento());
        System.out.println("Cálculo do saldo com o rendimento"); contaTeste.calcularNovoSaldo();
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Rendimento do dia alterado para 50%"); setDiaRendimento(50);
        System.out.printf("Valor do rendimento em porcentagem:  %.2f%%\n", rendimento());
        System.out.println("Cálculo do saldo com o rendimento"); contaTeste.calcularNovoSaldo();
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        diaRendimento = rendimentoAntigo;
    }

    public static void setDiaRendimento(int newDiaRendimento) {
		diaRendimento = newDiaRendimento;
	}
    
    public void calcularNovoSaldo(){
        setSaldo(getSaldo() * rendimento());
    }

    private static float rendimento() {
        return diaRendimento/100F + 1;
    }
}