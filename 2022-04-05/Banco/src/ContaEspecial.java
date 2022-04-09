
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
    public double sacar(double valor) {
        valor = verifySaldo(valor);

        if (valor > getSaldo() + limite || valor == 0) {
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