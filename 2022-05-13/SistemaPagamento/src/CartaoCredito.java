public class CartaoCredito extends Pagamento implements TipoPagamento {
    public CartaoCredito() {
        super();
        taxa = 20;
    }

    @Override
    public int getDiasFaturamento() {
        return diasPagamento;
    }

    @Override
    public float getPorcentagemFinanceiraPaga() {
        return taxa;
    }
}
