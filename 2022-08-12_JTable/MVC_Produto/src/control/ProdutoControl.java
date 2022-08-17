package control;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;

import model.Produto;

public class ProdutoControl {
    private ArrayList<Produto> lstProdutos;
    private static ProdutoControl produtoControl = null;

    private ProdutoControl() {
        this.lstProdutos = new ArrayList<Produto>();
    }
    
    public static ProdutoControl getInstance() {
        if (produtoControl == null)
            produtoControl = new ProdutoControl();
        
        return produtoControl;
    }

    public void cadastrar(String codigo, String descricao, double preco) {
        lstProdutos.add(new Produto(codigo, descricao, preco));
    }

    public int size() {
        return lstProdutos.size();
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
    
    public boolean removerCod(String codigo) {
        try {
            return lstProdutos.remove(buscaCod(codigo).get());        
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean removerDesc(String descricao) {
        try {
            return lstProdutos.remove(buscaDesc(descricao).get()); 
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    public DefaultTableModel getModel() {
        DefaultTableModel data = new DefaultTableModel();
        
        data.setNumRows(0);
        data.addColumn("Index");
        data.addColumn("Código");
        data.addColumn("Descrição");
        data.addColumn("Preço");
        
        for (Produto pd : lstProdutos) {
            data.addRow(new Object[] { lstProdutos.indexOf(pd), pd.getCodigo(), pd.getDescricao(), Double.toString(pd.getPreco()) });
        }
        
        return data;
    }
}
