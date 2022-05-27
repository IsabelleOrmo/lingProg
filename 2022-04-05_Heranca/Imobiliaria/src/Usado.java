public class Usado extends Imovel {
    private float desconto; // Dado em porcentagem
    
    public Usado() {
        super();
        desconto = 0; 
    }
    
    public Usado(int codigo, String endereco, float preco, float desconto) {
        super(codigo, endereco, preco);
        this.desconto = verifyFloat(desconto);
    }

    @Override
    public float precoFinal() {
        return super.precoFinal(valorDesconto());
    }

    public float valorDesconto() {
        return -(getPreco() * descontoPorcentagem());
    }

    private float descontoPorcentagem() {
        return (desconto/100F);
    }

    public float getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
