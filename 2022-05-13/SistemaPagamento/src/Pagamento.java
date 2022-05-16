public abstract class Pagamento {
    // Atributos da classe
    private double valor;

    // Construtores da classe
    public Pagamento(double valor) {
        this.valor = valor;
    }


    // Getters e setters
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
