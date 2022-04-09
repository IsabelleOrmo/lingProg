
public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {
        super();
        limite = 0;
    }
    public ContaEspecial(String cliente, double saldo, double limite) {
        super(cliente, saldo); 
        this.limite = verifySaldo(limite);
    }

    @Override
    public void testaConta() {
        super.testaConta();
        ContaEspecial contaTeste = this;
        System.out.println("Limite:  " + contaTeste.getLimite());
        System.out.println("Saque no valor de 1000");
        System.out.println("Valor do saque:  " + contaTeste.sacar(1000));
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Saque no valor de 1000");
        System.out.println("Valor do saque:  " + contaTeste.sacar(1000));
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Saque no valor de 200");
        System.out.println("Valor do saque:  " + contaTeste.sacar(200));
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
    }

    @Override
    public double sacar(double valor) {
        valor = verifySaldo(valor);

        if (valor == 0 || valor > getSaldo() + limite) {
            System.out.println("Não é possível sacar.");
            return 0;
        } 

        setSaldoUnverified(getSaldo()-valor);
        return valor;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}