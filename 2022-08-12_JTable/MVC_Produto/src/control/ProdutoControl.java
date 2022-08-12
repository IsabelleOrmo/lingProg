package control;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.Optional;

import model.Produto;

public class ProdutoControl {
    private ArrayList<Produto> lstProdutos;

    public ProdutoControl() {
        this.lstProdutos = new ArrayList<Produto>();
    }

    public void cadastrar(String codigo, String descricao, double preco) {
        lstProdutos.add(new Produto(codigo, descricao, preco));
    }

    public Optional<Produto> buscaCod(String codigo) {
        for (Produto produto : lstProdutos) {
            if (produto.getCodigo().equals(codigo))
                return Optional.of(produto);
        }

        return Optional.empty();
    }

    public Optional<Produto> buscaDesc(String descricao) {
        for (Produto produto : lstProdutos) {
            if (produto.getDescricao().startsWith(descricao))
                return Optional.of(produto);
        }

        return Optional.empty();
    }
}
