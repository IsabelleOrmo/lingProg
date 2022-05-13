public abstract class Pagamento {
    // Atributos da classe
    private double valor;
    protected static int diasPagamento = 0;
    protected static float taxa = 0;


    // Construtores da classe
    public Pagamento() {
        valor = 0;
    }

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

    public static int getDiasPagamento() {
        return diasPagamento;
    }

    public static void setDiasPagamento(int newDiasPagamento /*int diasPagamento*/) {
        // Pagamento.diasPagamento = diasPagamento;
        diasPagamento = newDiasPagamento;
    }

    public static float getTaxa() {
        return taxa;
    }

    public static void setDiasPagamento(float newTaxa /*int taxa*/) {
        // Pagamento.taxa = taxa;
        taxa = newTaxa;
    }
}
