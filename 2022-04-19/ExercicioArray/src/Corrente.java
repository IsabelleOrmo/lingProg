public class Corrente extends Conta {
    private double limite;
    
    public Corrente() {
        super();
        limite = 0;
    }
    
    public Corrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void mostra() {
        System.out.println("É uma conta corrente.");
    }    
}
