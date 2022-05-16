import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<TipoPagamento> listaPagamentos = new ArrayList<TipoPagamento>();
        listaPagamentos.add(new Dinheiro(19.90f));
        listaPagamentos.add(new Dinheiro(300.1f));
        listaPagamentos.add(new CartaoCredito(120));
        listaPagamentos.add(new CartaoCredito(600.5));
        listaPagamentos.add(new Cheque(100));
        listaPagamentos.add(new Cheque(350.50f));

        for (TipoPagamento pagamento : listaPagamentos) {
            System.out.printf("Valor da taxa do pagamento: R$ %.2f\n", pagamento.getPorcentagemFinanceiraPaga());
            System.out.printf("Dias para o faturamento:  %d\n\n\n", pagamento.getDiasFaturamento());
        }
    }
}
